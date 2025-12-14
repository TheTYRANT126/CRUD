package edu.itvo.persistenciadatos.presentation.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a|\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007\u00a8\u0006\u0017"}, d2 = {"ProductCard", "", "producto", "Ledu/itvo/persistenciadatos/domain/model/Product;", "esAdmin", "", "onEditar", "Lkotlin/Function0;", "onEliminar", "ProductListScreen", "productos", "", "usuarioActual", "Ledu/itvo/persistenciadatos/domain/model/User;", "onNavigateBack", "onEditarProducto", "Lkotlin/Function1;", "", "onEliminarProducto", "onCrearProducto", "mensajeExito", "", "mensajeError", "app_debug"})
public final class ProductListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void ProductListScreen(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.itvo.persistenciadatos.domain.model.Product> productos, @org.jetbrains.annotations.Nullable()
    edu.itvo.persistenciadatos.domain.model.User usuarioActual, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onEditarProducto, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onEliminarProducto, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCrearProducto, @org.jetbrains.annotations.Nullable()
    java.lang.String mensajeExito, @org.jetbrains.annotations.Nullable()
    java.lang.String mensajeError) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ProductCard(edu.itvo.persistenciadatos.domain.model.Product producto, boolean esAdmin, kotlin.jvm.functions.Function0<kotlin.Unit> onEditar, kotlin.jvm.functions.Function0<kotlin.Unit> onEliminar) {
    }
}