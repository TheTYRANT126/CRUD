package edu.itvo.persistenciadatos.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "", "()V", "Error", "Idle", "Loading", "LoginSuccess", "RegisterSuccess", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Error;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Idle;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Loading;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$LoginSuccess;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$RegisterSuccess;", "app_debug"})
public abstract class AuthUiState {
    
    private AuthUiState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Error;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "mensaje", "", "(Ljava/lang/String;)V", "getMensaje", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mensaje = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.String mensaje) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String mensaje) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMensaje() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Idle;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "()V", "app_debug"})
    public static final class Idle extends edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState.Idle INSTANCE = null;
        
        private Idle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$Loading;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "()V", "app_debug"})
    public static final class Loading extends edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$LoginSuccess;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "usuario", "Ledu/itvo/persistenciadatos/domain/model/User;", "(Ledu/itvo/persistenciadatos/domain/model/User;)V", "getUsuario", "()Ledu/itvo/persistenciadatos/domain/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class LoginSuccess extends edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState {
        @org.jetbrains.annotations.NotNull()
        private final edu.itvo.persistenciadatos.domain.model.User usuario = null;
        
        @org.jetbrains.annotations.NotNull()
        public final edu.itvo.persistenciadatos.domain.model.User component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState.LoginSuccess copy(@org.jetbrains.annotations.NotNull()
        edu.itvo.persistenciadatos.domain.model.User usuario) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public LoginSuccess(@org.jetbrains.annotations.NotNull()
        edu.itvo.persistenciadatos.domain.model.User usuario) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.itvo.persistenciadatos.domain.model.User getUsuario() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState$RegisterSuccess;", "Ledu/itvo/persistenciadatos/presentation/viewmodel/AuthUiState;", "mensaje", "", "(Ljava/lang/String;)V", "getMensaje", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RegisterSuccess extends edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mensaje = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.itvo.persistenciadatos.presentation.viewmodel.AuthUiState.RegisterSuccess copy(@org.jetbrains.annotations.NotNull()
        java.lang.String mensaje) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public RegisterSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String mensaje) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMensaje() {
            return null;
        }
    }
}