package edu.itvo.persistenciadatos.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import edu.itvo.persistenciadatos.domain.model.Product

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductEditScreen(
    producto: Product?,
    onGuardar: (String, String, Double, String, String) -> Unit,
    onActualizar: (Product) -> Unit,
    onNavigateBack: () -> Unit,
    isLoading: Boolean = false,
    errorMensaje: String? = null
) {
    val esNuevoProducto = producto == null

    var nombre by remember(producto) { mutableStateOf(producto?.nombre ?: "") }
    var descripcion by remember(producto) { mutableStateOf(producto?.descripcion ?: "") }
    var precio by remember(producto) { mutableStateOf(producto?.precio?.toString() ?: "") }
    var ingredientes by remember(producto) { mutableStateOf(producto?.ingredientes ?: "") }
    var fechaCaducidad by remember(producto) { mutableStateOf(producto?.fechaCaducidad ?: "") }

    var nombreError by remember { mutableStateOf(false) }
    var descripcionError by remember { mutableStateOf(false) }
    var precioError by remember { mutableStateOf(false) }

    fun validarCampos(): Boolean {
        // Validar nombre
        nombreError = nombre.isBlank()

        // Validar descripción
        descripcionError = descripcion.isBlank()

        // Validar precio
        val precioDouble = precio.toDoubleOrNull()
        precioError = precioDouble == null || precioDouble <= 0

        // Ingredientes y fecha de caducidad pueden quedar vacíos
        return !nombreError && !descripcionError && !precioError
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        if (esNuevoProducto) "Crear Producto" else "Editar Producto",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // Card con información del producto
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Fastfood,
                        contentDescription = null,
                        modifier = Modifier.size(48.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = if (esNuevoProducto) "Nuevo Producto" else "Editando Producto #${producto?.id}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = if (esNuevoProducto) "Completa todos los campos" else "Modifica los campos necesarios",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            // Campo de nombre
            OutlinedTextField(
                value = nombre,
                onValueChange = {
                    nombre = it
                    nombreError = false
                },
                label = { Text("Nombre del producto") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Restaurant,
                        contentDescription = "Nombre Icon"
                    )
                },
                isError = nombreError,
                supportingText = {
                    if (nombreError) {
                        Text(
                            text = "El nombre no puede estar vacío",
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            // Campo de descripción
            OutlinedTextField(
                value = descripcion,
                onValueChange = {
                    descripcion = it
                    descripcionError = false
                },
                label = { Text("Descripción") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Description,
                        contentDescription = "Descripción Icon"
                    )
                },
                isError = descripcionError,
                supportingText = {
                    if (descripcionError) {
                        Text(
                            text = "La descripción no puede estar vacía",
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                minLines = 3,
                maxLines = 5,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            // Campo de fecha de caducidad
            OutlinedTextField(
                value = fechaCaducidad,
                onValueChange = {
                    fechaCaducidad = it
                },
                label = { Text("Fecha de caducidad (yyyy-MM-dd opcional)") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.CalendarToday,
                        contentDescription = "Fecha de caducidad Icon"
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            // Campo de precio
            OutlinedTextField(
                value = precio,
                onValueChange = {
                    precio = it
                    precioError = false
                },
                label = { Text("Precio") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.AttachMoney,
                        contentDescription = "Precio Icon"
                    )
                },
                isError = precioError,
                supportingText = {
                    if (precioError) {
                        Text(
                            text = "Ingresa un precio válido mayor a 0",
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
            )

            // Campo de ingredientes
            OutlinedTextField(
                value = ingredientes,
                onValueChange = {
                    ingredientes = it
                },
                label = { Text("Ingredientes opcional") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.MenuBook,
                        contentDescription = "Ingredientes Icon"
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                minLines = 2,
                maxLines = 4,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            // Mostrar error si existe
            if (errorMensaje != null) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.errorContainer
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Error,
                            contentDescription = "Error",
                            tint = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = errorMensaje,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onErrorContainer
                        )
                    }
                }
            }

            // Botones de acción
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = onNavigateBack,
                    modifier = Modifier.weight(1f),
                    enabled = !isLoading
                ) {
                    Icon(
                        imageVector = Icons.Default.Cancel,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Cancelar")
                }

                Button(
                    onClick = {
                        if (validarCampos()) {
                            val precioDouble = precio.toDoubleOrNull() ?: 0.0
                            if (esNuevoProducto) {
                                onGuardar(nombre, descripcion, precioDouble, ingredientes, fechaCaducidad)
                            } else {
                                val productoActualizado = producto!!.copy(
                                    nombre = nombre,
                                    descripcion = descripcion,
                                    precio = precioDouble,
                                    ingredientes = ingredientes,
                                    fechaCaducidad = fechaCaducidad
                                )
                                onActualizar(productoActualizado)
                            }
                        }
                    },
                    modifier = Modifier.weight(1f),
                    enabled = !isLoading
                ) {
                    if (isLoading) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(18.dp),
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.Save,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(if (esNuevoProducto) "Crear Producto" else "Guardar Cambios")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
