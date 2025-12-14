package edu.itvo.persistenciadatos.presentation.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003\u001an\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001c"}, d2 = {"InfoItem", "", "label", "", "value", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "InfoItem-wH6b6FI", "(Ljava/lang/String;Ljava/lang/String;F)V", "UserCard", "usuario", "Ledu/itvo/persistenciadatos/domain/model/User;", "esUsuarioActual", "", "onEditar", "Lkotlin/Function0;", "onEliminar", "UserListScreen", "usuarios", "", "usuarioActual", "onNavigateBack", "onEditarUsuario", "Lkotlin/Function1;", "", "onEliminarUsuario", "mensajeExito", "mensajeError", "app_debug"})
public final class UserListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void UserListScreen(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.itvo.persistenciadatos.domain.model.User> usuarios, @org.jetbrains.annotations.Nullable()
    edu.itvo.persistenciadatos.domain.model.User usuarioActual, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onEditarUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onEliminarUsuario, @org.jetbrains.annotations.Nullable()
    java.lang.String mensajeExito, @org.jetbrains.annotations.Nullable()
    java.lang.String mensajeError) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void UserCard(edu.itvo.persistenciadatos.domain.model.User usuario, boolean esUsuarioActual, kotlin.jvm.functions.Function0<kotlin.Unit> onEditar, kotlin.jvm.functions.Function0<kotlin.Unit> onEliminar) {
    }
}