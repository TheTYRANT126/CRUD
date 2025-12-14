package edu.itvo.persistenciadatos.presentation.ui.screens

import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminUiState
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductUiState

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object UserList : Screen("user_list")
    object UserEdit : Screen("user_edit/{userId}") {
        fun createRoute(userId: Int) = "user_edit/$userId"
    }
    object ProductList : Screen("product_list")
    object ProductCreate : Screen("product_create")
    object ProductEdit : Screen("product_edit/{productId}") {
        fun createRoute(productId: Int) = "product_edit/$productId"
    }
}

@Composable
fun MainScreen(
    authViewModel: AuthViewModel = hiltViewModel(),
    adminViewModel: AdminViewModel = hiltViewModel(),
    productViewModel: ProductViewModel = hiltViewModel()
) {
    val navController = rememberNavController()
    val usuarioActual by authViewModel.usuarioActual.collectAsStateWithLifecycle()
    val authUiState by authViewModel.authUiState.collectAsStateWithLifecycle()
    val adminUiState by adminViewModel.adminUiState.collectAsStateWithLifecycle()
    val todosLosUsuarios by adminViewModel.todosLosUsuarios.collectAsStateWithLifecycle()
    val productUiState by productViewModel.productUiState.collectAsStateWithLifecycle()
    val todosLosProductos by productViewModel.todosLosProductos.collectAsStateWithLifecycle()

    // Navegar a Home cuando el login es exitoso
    LaunchedEffect(authUiState) {
        if (authUiState is AuthUiState.LoginSuccess) {
            navController.navigate(Screen.Home.route) {
                popUpTo(Screen.Login.route) { inclusive = true }
            }
            authViewModel.resetState()
        }
    }

    // Navegar a Login cuando se registra exitosamente
    LaunchedEffect(authUiState) {
        if (authUiState is AuthUiState.RegisterSuccess) {
            navController.navigate(Screen.Login.route) {
                popUpTo(Screen.Register.route) { inclusive = true }
            }
            authViewModel.resetState()
        }
    }

    // Determinar pantalla inicial basado en si hay usuario logueado
    val startDestination = if (usuarioActual != null) Screen.Home.route else Screen.Login.route

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        // Pantalla de Login
        composable(Screen.Login.route) {
            LoginScreen(
                onLogin = { email, contrasena ->
                    authViewModel.login(email, contrasena)
                },
                onNavigateToRegister = {
                    navController.navigate(Screen.Register.route)
                },
                errorMensaje = if (authUiState is AuthUiState.Error) {
                    (authUiState as AuthUiState.Error).mensaje
                } else null,
                isLoading = authUiState is AuthUiState.Loading
            )
        }

        // Pantalla de Registro
        composable(Screen.Register.route) {
            RegisterScreen(
                onRegister = { nombre, email, contrasena, esAdmin ->
                    authViewModel.registrar(nombre, email, contrasena, esAdmin)
                },
                onNavigateToLogin = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Register.route) { inclusive = true }
                    }
                },
                errorMensaje = if (authUiState is AuthUiState.Error) {
                    (authUiState as AuthUiState.Error).mensaje
                } else null,
                isLoading = authUiState is AuthUiState.Loading
            )
        }

        // Pantalla Home
        composable(Screen.Home.route) {
            HomeScreen(
                usuario = usuarioActual,
                onLogout = {
                    authViewModel.cerrarSesion()
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Home.route) { inclusive = true }
                    }
                },
                onThemeChange = { tema ->
                    usuarioActual?.let { user ->
                        adminViewModel.actualizarTema(user.id, tema)
                    }
                },
                onNotificationToggle = { activadas ->
                    usuarioActual?.let { user ->
                        adminViewModel.actualizarNotificaciones(user.id, activadas)
                    }
                },
                onNavigateToUserList = {
                    if (usuarioActual?.esAdmin == true) {
                        navController.navigate(Screen.UserList.route)
                    }
                },
                onNavigateToProductList = {
                    navController.navigate(Screen.ProductList.route)
                }
            )
        }

        // Pantalla de Lista de Usuarios (Admin)
        composable(Screen.UserList.route) {
            // Resetear estado al entrar
            LaunchedEffect(Unit) {
                adminViewModel.resetState()
            }

            UserListScreen(
                usuarios = todosLosUsuarios,
                usuarioActual = usuarioActual,
                onNavigateBack = {
                    navController.popBackStack()
                },
                onEditarUsuario = { userId ->
                    navController.navigate(Screen.UserEdit.createRoute(userId))
                },
                onEliminarUsuario = { userId ->
                    adminViewModel.eliminarUsuario(userId)
                },
                mensajeExito = if (adminUiState is AdminUiState.Success) {
                    (adminUiState as AdminUiState.Success).mensaje
                } else null,
                mensajeError = if (adminUiState is AdminUiState.Error) {
                    (adminUiState as AdminUiState.Error).mensaje
                } else null
            )
        }

        // Pantalla de Edición de Usuario (Admin)
        composable(
            route = Screen.UserEdit.route,
            arguments = listOf(navArgument("userId") { type = NavType.IntType })
        ) { backStackEntry ->
            val userId = backStackEntry.arguments?.getInt("userId") ?: 0
            var usuario by remember { mutableStateOf<edu.itvo.persistenciadatos.domain.model.User?>(null) }

            // Cargar usuario al entrar
            LaunchedEffect(userId) {
                adminViewModel.obtenerUsuarioPorId(userId) { user ->
                    usuario = user
                }
                adminViewModel.resetState()
            }

            // Navegar de vuelta si la actualización fue exitosa
            LaunchedEffect(adminUiState) {
                if (adminUiState is AdminUiState.Success) {
                    navController.popBackStack()
                }
            }

            UserEditScreen(
                usuario = usuario,
                onGuardar = { usuarioActualizado ->
                    adminViewModel.actualizarUsuario(usuarioActualizado)
                },
                onNavigateBack = {
                    navController.popBackStack()
                },
                isLoading = adminUiState is AdminUiState.Loading,
                errorMensaje = if (adminUiState is AdminUiState.Error) {
                    (adminUiState as AdminUiState.Error).mensaje
                } else null
            )
        }

        // Pantalla de Lista de Productos (Todos los usuarios)
        composable(Screen.ProductList.route) {
            // Resetear estado al entrar
            LaunchedEffect(Unit) {
                productViewModel.resetState()
            }

            ProductListScreen(
                productos = todosLosProductos,
                usuarioActual = usuarioActual,
                onNavigateBack = {
                    navController.popBackStack()
                },
                onEditarProducto = { productId ->
                    navController.navigate(Screen.ProductEdit.createRoute(productId))
                },
                onEliminarProducto = { productId ->
                    productViewModel.eliminarProducto(productId)
                },
                onCrearProducto = {
                    navController.navigate(Screen.ProductCreate.route)
                },
                mensajeExito = if (productUiState is ProductUiState.Success) {
                    (productUiState as ProductUiState.Success).mensaje
                } else null,
                mensajeError = if (productUiState is ProductUiState.Error) {
                    (productUiState as ProductUiState.Error).mensaje
                } else null
            )
        }

        // Pantalla de Creación de Producto (Admin)
        composable(Screen.ProductCreate.route) {
            // Resetear estado al entrar
            LaunchedEffect(Unit) {
                productViewModel.resetState()
            }

            // Navegar de vuelta si la creación fue exitosa
            LaunchedEffect(productUiState) {
                if (productUiState is ProductUiState.Success) {
                    navController.popBackStack()
                }
            }

            ProductEditScreen(
                producto = null, // null indica que es un nuevo producto
                onGuardar = { nombre, descripcion, precio, ingredientes ->
                    productViewModel.crearProducto(nombre, descripcion, precio, ingredientes)
                },
                onActualizar = { /* No se usa en modo creación */ },
                onNavigateBack = {
                    navController.popBackStack()
                },
                isLoading = productUiState is ProductUiState.Loading,
                errorMensaje = if (productUiState is ProductUiState.Error) {
                    (productUiState as ProductUiState.Error).mensaje
                } else null
            )
        }

        // Pantalla de Edición de Producto (Admin)
        composable(
            route = Screen.ProductEdit.route,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: 0
            var producto by remember { mutableStateOf<edu.itvo.persistenciadatos.domain.model.Product?>(null) }

            // Cargar producto al entrar
            LaunchedEffect(productId) {
                productViewModel.obtenerProductoPorId(productId) { product ->
                    producto = product
                }
                productViewModel.resetState()
            }

            // Navegar de vuelta si la actualización fue exitosa
            LaunchedEffect(productUiState) {
                if (productUiState is ProductUiState.Success) {
                    navController.popBackStack()
                }
            }

            ProductEditScreen(
                producto = producto,
                onGuardar = { _, _, _, _ -> /* No se usa en modo edición */ },
                onActualizar = { productoActualizado ->
                    productViewModel.actualizarProducto(productoActualizado)
                },
                onNavigateBack = {
                    navController.popBackStack()
                },
                isLoading = productUiState is ProductUiState.Loading,
                errorMensaje = if (productUiState is ProductUiState.Error) {
                    (productUiState as ProductUiState.Error).mensaje
                } else null
            )
        }
    }
}
