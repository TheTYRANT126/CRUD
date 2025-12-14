package edu.itvo.persistenciadatos.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import edu.itvo.persistenciadatos.domain.model.Product
import edu.itvo.persistenciadatos.domain.model.User
import java.time.LocalDate

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductListScreen(
    productos: List<Product>,
    usuarioActual: User?,
    onNavigateBack: () -> Unit,
    onEditarProducto: (Int) -> Unit,
    onEliminarProducto: (Int) -> Unit,
    onCrearProducto: () -> Unit,
    mensajeExito: String? = null,
    mensajeError: String? = null
) {
    var productoAEliminar by remember { mutableStateOf<Product?>(null) }
    var filtroFechaCaducidad by rememberSaveable { mutableStateOf("") }
    var filtroNombre by rememberSaveable { mutableStateOf("") }
    var filtroPrecioMin by rememberSaveable { mutableStateOf("") }
    var filtroPrecioMax by rememberSaveable { mutableStateOf("") }

    fun String.toLocalDateOrNull(): LocalDate? = try {
        LocalDate.parse(this)
    } catch (_: Exception) {
        null
    }

    fun String.toPositiveDoubleOrNull(): Double? = toDoubleOrNull()?.takeIf { it >= 0 }

    val fechaFiltroValida = filtroFechaCaducidad.isBlank() || filtroFechaCaducidad.toLocalDateOrNull() != null
    val precioMinValido = filtroPrecioMin.isBlank() || filtroPrecioMin.toPositiveDoubleOrNull() != null
    val precioMaxValido = filtroPrecioMax.isBlank() || filtroPrecioMax.toPositiveDoubleOrNull() != null
    val precioRangoValido = precioMinValido && precioMaxValido && (
        filtroPrecioMin.toPositiveDoubleOrNull() == null ||
            filtroPrecioMax.toPositiveDoubleOrNull() == null ||
            filtroPrecioMin.toPositiveDoubleOrNull()!! <= filtroPrecioMax.toPositiveDoubleOrNull()!!
        )

    val productosFiltrados = remember(productos, filtroFechaCaducidad) {
        val fechaFiltro = filtroFechaCaducidad.toLocalDateOrNull()
        if (fechaFiltro == null) {
            productos
        } else {
            productos.filter { producto ->
                producto.fechaCaducidad.toLocalDateOrNull()?.let { !it.isAfter(fechaFiltro) } ?: true
            }
        }
    }

    val productosFiltradosPorNombre = remember(productosFiltrados, filtroNombre) {
        if (filtroNombre.isBlank()) productosFiltrados else productosFiltrados.filter {
            it.nombre.contains(filtroNombre, ignoreCase = true)
        }
    }

    val productosFiltradosPorPrecio = remember(productosFiltradosPorNombre, filtroPrecioMin, filtroPrecioMax) {
        val min = filtroPrecioMin.toPositiveDoubleOrNull()
        val max = filtroPrecioMax.toPositiveDoubleOrNull()
        productosFiltradosPorNombre.filter { producto ->
            val cumpleMin = min?.let { producto.precio >= it } ?: true
            val cumpleMax = max?.let { producto.precio <= it } ?: true
            cumpleMin && cumpleMax
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Gestión de Productos",
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
                actions = {
                    // Solo admins pueden crear productos
                    if (usuarioActual?.esAdmin == true) {
                        IconButton(onClick = onCrearProducto) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Crear producto"
                            )
                        }
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
        ) {
            // Mostrar mensajes de éxito/error
            if (mensajeExito != null) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "Success",
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = mensajeExito,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }

            if (mensajeError != null) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
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
                            text = mensajeError,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onErrorContainer
                        )
                    }
                }
            }

            // Información de header
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.surfaceVariant
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Total: ${productos.size} productos",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Icon(
                        imageVector = Icons.Default.Restaurant,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            // Filtro por fecha de caducidad
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField(
                    value = filtroNombre,
                    onValueChange = { filtroNombre = it },
                    label = { Text("Filtrar por nombre") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        if (filtroNombre.isNotBlank()) {
                            IconButton(onClick = { filtroNombre = "" }) {
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = "Borrar filtro nombre"
                                )
                            }
                        }
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                    OutlinedTextField(
                        value = filtroPrecioMin,
                        onValueChange = { filtroPrecioMin = it },
                        label = { Text("Precio mínimo") },
                        leadingIcon = { Icon(Icons.Default.AttachMoney, contentDescription = null) },
                        isError = !precioMinValido,
                        supportingText = {
                            if (!precioMinValido) Text("Ingresa un número mayor o igual a 0")
                        },
                        singleLine = true,
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedTextField(
                        value = filtroPrecioMax,
                        onValueChange = { filtroPrecioMax = it },
                        label = { Text("Precio máximo") },
                        leadingIcon = { Icon(Icons.Default.AttachMoney, contentDescription = null) },
                        isError = !precioMaxValido || !precioRangoValido,
                        supportingText = {
                            if (!precioMaxValido) {
                                Text("Ingresa un número mayor o igual a 0")
                            } else if (!precioRangoValido) {
                                Text("Máximo debe ser >= mínimo")
                            }
                        },
                        singleLine = true,
                        modifier = Modifier.weight(1f)
                    )
                }

                OutlinedTextField(
                    value = filtroFechaCaducidad,
                    onValueChange = { filtroFechaCaducidad = it },
                    label = { Text("Filtrar por caducidad yyyy-mm-dd") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Event,
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        if (filtroFechaCaducidad.isNotBlank()) {
                            IconButton(onClick = { filtroFechaCaducidad = "" }) {
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = "Borrar filtro"
                                )
                            }
                        }
                    },
                    supportingText = {
                        Text(
                            text = if (!fechaFiltroValida && filtroFechaCaducidad.isNotBlank()) {
                                "Usa el formato yyyy-MM-dd"
                            } else {
                                "Verás productos que caducan en o antes de la fecha indicada"
                            },
                            color = if (!fechaFiltroValida && filtroFechaCaducidad.isNotBlank()) {
                                MaterialTheme.colorScheme.error
                            } else {
                                MaterialTheme.colorScheme.onSurfaceVariant
                            }
                        )
                    },
                    isError = !fechaFiltroValida && filtroFechaCaducidad.isNotBlank(),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (filtroFechaCaducidad.isBlank()) {
                            "Mostrando todos los productos"
                        } else {
                            "Filtrado hasta: $filtroFechaCaducidad"
                        },
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Lista de productos
            if (productosFiltradosPorPrecio.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.RemoveShoppingCart,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = if (productos.isEmpty()) {
                                "No hay productos registrados"
                            } else {
                                "No hay productos que cumplan con el filtro"
                            },
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        if (usuarioActual?.esAdmin == true) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Button(onClick = onCrearProducto) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = null,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Crear producto")
                            }
                        }
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(productosFiltradosPorPrecio) { producto ->
                        ProductCard(
                            producto = producto,
                            esAdmin = usuarioActual?.esAdmin == true,
                            onEditar = { onEditarProducto(producto.id) },
                            onEliminar = { productoAEliminar = producto }
                        )
                    }
                }
            }
        }
    }

    // Diálogo de confirmación de eliminación
    if (productoAEliminar != null) {
        AlertDialog(
            onDismissRequest = { productoAEliminar = null },
            icon = {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.error
                )
            },
            title = {
                Text(text = "Confirmar Eliminación")
            },
            text = {
                Text(
                    text = "¿Estás seguro de que deseas eliminar el producto '${productoAEliminar!!.nombre}'?"
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onEliminarProducto(productoAEliminar!!.id)
                        productoAEliminar = null
                    }
                ) {
                    Text("Eliminar", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { productoAEliminar = null }
                ) {
                    Text("Cancelar")
                }
            }
        )
    }
}

@Composable
private fun ProductCard(
    producto: Product,
    esAdmin: Boolean,
    onEditar: () -> Unit,
    onEliminar: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Fastfood,
                        contentDescription = null,
                        modifier = Modifier.size(48.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = producto.nombre,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "$${String.format("%.2f", producto.precio)}",
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

            // Descripción
            Text(
                text = "Descripción:",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = producto.descripcion,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Ingredientes
            Text(
                text = "Ingredientes:",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = producto.ingredientes,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Caduca: ${producto.fechaCaducidad}",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.secondary
            )

            // Botones de acción (solo para admin)
            if (esAdmin) {
                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedButton(
                        onClick = onEditar,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Editar")
                    }

                    OutlinedButton(
                        onClick = onEliminar,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = MaterialTheme.colorScheme.error
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Eliminar")
                    }
                }
            }
        }
    }
}
