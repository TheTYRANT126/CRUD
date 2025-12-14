package edu.itvo.persistenciadatos.data.local.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Ledu/itvo/persistenciadatos/data/local/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "productDao", "Ledu/itvo/persistenciadatos/data/local/database/ProductDao;", "userDao", "Ledu/itvo/persistenciadatos/data/local/database/UserDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {edu.itvo.persistenciadatos.data.local.database.UserEntity.class, edu.itvo.persistenciadatos.data.local.database.ProductEntity.class}, version = 3, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "usuarios_db";
    @org.jetbrains.annotations.NotNull()
    public static final edu.itvo.persistenciadatos.data.local.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.itvo.persistenciadatos.data.local.database.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.itvo.persistenciadatos.data.local.database.ProductDao productDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ledu/itvo/persistenciadatos/data/local/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}