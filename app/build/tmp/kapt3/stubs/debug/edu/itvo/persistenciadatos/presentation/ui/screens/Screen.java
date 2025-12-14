package edu.itvo.persistenciadatos.presentation.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Home", "Login", "ProductCreate", "ProductEdit", "ProductList", "Register", "UserEdit", "UserList", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Home;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Login;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductCreate;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductEdit;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductList;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Register;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$UserEdit;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$UserList;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Home;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class Home extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Login;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class Login extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.Login INSTANCE = null;
        
        private Login() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductCreate;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class ProductCreate extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.ProductCreate INSTANCE = null;
        
        private ProductCreate() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductEdit;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "createRoute", "", "productId", "", "app_debug"})
    public static final class ProductEdit extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.ProductEdit INSTANCE = null;
        
        private ProductEdit() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int productId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$ProductList;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class ProductList extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.ProductList INSTANCE = null;
        
        private ProductList() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$Register;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class Register extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.Register INSTANCE = null;
        
        private Register() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$UserEdit;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "createRoute", "", "userId", "", "app_debug"})
    public static final class UserEdit extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.UserEdit INSTANCE = null;
        
        private UserEdit() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int userId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen$UserList;", "Ledu/itvo/persistenciadatos/presentation/ui/screens/Screen;", "()V", "app_debug"})
    public static final class UserList extends edu.itvo.persistenciadatos.presentation.ui.screens.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final edu.itvo.persistenciadatos.presentation.ui.screens.Screen.UserList INSTANCE = null;
        
        private UserList() {
        }
    }
}