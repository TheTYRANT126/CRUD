package edu.itvo.persistenciadatos.data.local.database;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import java.lang.Class;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<ProductEntity> __insertAdapterOfProductEntity;

  private final EntityDeleteOrUpdateAdapter<ProductEntity> __deleteAdapterOfProductEntity;

  private final EntityDeleteOrUpdateAdapter<ProductEntity> __updateAdapterOfProductEntity;

  public ProductDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfProductEntity = new EntityInsertAdapter<ProductEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `productos` (`id`,`nombre`,`descripcion`,`precio`,`ingredientes`,`fechaCaducidad`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getNombre());
        }
        if (entity.getDescripcion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescripcion());
        }
        statement.bindDouble(4, entity.getPrecio());
        if (entity.getIngredientes() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getIngredientes());
        }
        if (entity.getFechaCaducidad() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getFechaCaducidad());
        }
      }
    };
    this.__deleteAdapterOfProductEntity = new EntityDeleteOrUpdateAdapter<ProductEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `productos` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfProductEntity = new EntityDeleteOrUpdateAdapter<ProductEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `productos` SET `id` = ?,`nombre` = ?,`descripcion` = ?,`precio` = ?,`ingredientes` = ?,`fechaCaducidad` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getNombre());
        }
        if (entity.getDescripcion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescripcion());
        }
        statement.bindDouble(4, entity.getPrecio());
        if (entity.getIngredientes() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getIngredientes());
        }
        if (entity.getFechaCaducidad() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getFechaCaducidad());
        }
        statement.bindLong(7, entity.getId());
      }
    };
  }

  @Override
  public Object insertarProducto(final ProductEntity producto,
      final Continuation<? super Long> $completion) {
    if (producto == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      return __insertAdapterOfProductEntity.insertAndReturnId(_connection, producto);
    }, $completion);
  }

  @Override
  public Object eliminarProducto(final ProductEntity producto,
      final Continuation<? super Unit> $completion) {
    if (producto == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfProductEntity.handle(_connection, producto);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object actualizarProducto(final ProductEntity producto,
      final Continuation<? super Unit> $completion) {
    if (producto == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfProductEntity.handle(_connection, producto);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object obtenerProductoPorId(final int productId,
      final Continuation<? super ProductEntity> $completion) {
    final String _sql = "SELECT * FROM productos WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, productId);
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfDescripcion = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "descripcion");
        final int _cursorIndexOfPrecio = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "precio");
        final int _cursorIndexOfIngredientes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ingredientes");
        final int _cursorIndexOfFechaCaducidad = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fechaCaducidad");
        final ProductEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpDescripcion;
          if (_stmt.isNull(_cursorIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _stmt.getText(_cursorIndexOfDescripcion);
          }
          final double _tmpPrecio;
          _tmpPrecio = _stmt.getDouble(_cursorIndexOfPrecio);
          final String _tmpIngredientes;
          if (_stmt.isNull(_cursorIndexOfIngredientes)) {
            _tmpIngredientes = null;
          } else {
            _tmpIngredientes = _stmt.getText(_cursorIndexOfIngredientes);
          }
          final String _tmpFechaCaducidad;
          if (_stmt.isNull(_cursorIndexOfFechaCaducidad)) {
            _tmpFechaCaducidad = null;
          } else {
            _tmpFechaCaducidad = _stmt.getText(_cursorIndexOfFechaCaducidad);
          }
          _result = new ProductEntity(_tmpId,_tmpNombre,_tmpDescripcion,_tmpPrecio,_tmpIngredientes,_tmpFechaCaducidad);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Flow<List<ProductEntity>> obtenerTodosLosProductos() {
    final String _sql = "SELECT * FROM productos ORDER BY nombre ASC";
    return FlowUtil.createFlow(__db, false, new String[] {"productos"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfDescripcion = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "descripcion");
        final int _cursorIndexOfPrecio = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "precio");
        final int _cursorIndexOfIngredientes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ingredientes");
        final int _cursorIndexOfFechaCaducidad = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fechaCaducidad");
        final List<ProductEntity> _result = new ArrayList<ProductEntity>();
        while (_stmt.step()) {
          final ProductEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpDescripcion;
          if (_stmt.isNull(_cursorIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _stmt.getText(_cursorIndexOfDescripcion);
          }
          final double _tmpPrecio;
          _tmpPrecio = _stmt.getDouble(_cursorIndexOfPrecio);
          final String _tmpIngredientes;
          if (_stmt.isNull(_cursorIndexOfIngredientes)) {
            _tmpIngredientes = null;
          } else {
            _tmpIngredientes = _stmt.getText(_cursorIndexOfIngredientes);
          }
          final String _tmpFechaCaducidad;
          if (_stmt.isNull(_cursorIndexOfFechaCaducidad)) {
            _tmpFechaCaducidad = null;
          } else {
            _tmpFechaCaducidad = _stmt.getText(_cursorIndexOfFechaCaducidad);
          }
          _item = new ProductEntity(_tmpId,_tmpNombre,_tmpDescripcion,_tmpPrecio,_tmpIngredientes,_tmpFechaCaducidad);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object obtenerProductoPorNombre(final String nombre,
      final Continuation<? super ProductEntity> $completion) {
    final String _sql = "SELECT * FROM productos WHERE nombre = ? LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (nombre == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, nombre);
        }
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfDescripcion = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "descripcion");
        final int _cursorIndexOfPrecio = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "precio");
        final int _cursorIndexOfIngredientes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ingredientes");
        final int _cursorIndexOfFechaCaducidad = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fechaCaducidad");
        final ProductEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpDescripcion;
          if (_stmt.isNull(_cursorIndexOfDescripcion)) {
            _tmpDescripcion = null;
          } else {
            _tmpDescripcion = _stmt.getText(_cursorIndexOfDescripcion);
          }
          final double _tmpPrecio;
          _tmpPrecio = _stmt.getDouble(_cursorIndexOfPrecio);
          final String _tmpIngredientes;
          if (_stmt.isNull(_cursorIndexOfIngredientes)) {
            _tmpIngredientes = null;
          } else {
            _tmpIngredientes = _stmt.getText(_cursorIndexOfIngredientes);
          }
          final String _tmpFechaCaducidad;
          if (_stmt.isNull(_cursorIndexOfFechaCaducidad)) {
            _tmpFechaCaducidad = null;
          } else {
            _tmpFechaCaducidad = _stmt.getText(_cursorIndexOfFechaCaducidad);
          }
          _result = new ProductEntity(_tmpId,_tmpNombre,_tmpDescripcion,_tmpPrecio,_tmpIngredientes,_tmpFechaCaducidad);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object eliminarProductoPorId(final int productId,
      final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM productos WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, productId);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
