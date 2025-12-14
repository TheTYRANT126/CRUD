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
import java.lang.Integer;
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
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<UserEntity> __insertAdapterOfUserEntity;

  private final EntityDeleteOrUpdateAdapter<UserEntity> __deleteAdapterOfUserEntity;

  private final EntityDeleteOrUpdateAdapter<UserEntity> __updateAdapterOfUserEntity;

  public UserDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfUserEntity = new EntityInsertAdapter<UserEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `usuarios` (`id`,`nombre`,`email`,`passwordHash`,`esAdmin`,`temaActual`,`notificacionesActivadas`,`estaLogueado`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final UserEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getNombre());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getEmail());
        }
        if (entity.getPasswordHash() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getPasswordHash());
        }
        final int _tmp = entity.getEsAdmin() ? 1 : 0;
        statement.bindLong(5, _tmp);
        if (entity.getTemaActual() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getTemaActual());
        }
        final int _tmp_1 = entity.getNotificacionesActivadas() ? 1 : 0;
        statement.bindLong(7, _tmp_1);
        final int _tmp_2 = entity.getEstaLogueado() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
      }
    };
    this.__deleteAdapterOfUserEntity = new EntityDeleteOrUpdateAdapter<UserEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `usuarios` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final UserEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfUserEntity = new EntityDeleteOrUpdateAdapter<UserEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `usuarios` SET `id` = ?,`nombre` = ?,`email` = ?,`passwordHash` = ?,`esAdmin` = ?,`temaActual` = ?,`notificacionesActivadas` = ?,`estaLogueado` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final UserEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNombre() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getNombre());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getEmail());
        }
        if (entity.getPasswordHash() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getPasswordHash());
        }
        final int _tmp = entity.getEsAdmin() ? 1 : 0;
        statement.bindLong(5, _tmp);
        if (entity.getTemaActual() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getTemaActual());
        }
        final int _tmp_1 = entity.getNotificacionesActivadas() ? 1 : 0;
        statement.bindLong(7, _tmp_1);
        final int _tmp_2 = entity.getEstaLogueado() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
        statement.bindLong(9, entity.getId());
      }
    };
  }

  @Override
  public Object insertarUsuario(final UserEntity usuario,
      final Continuation<? super Long> $completion) {
    if (usuario == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      return __insertAdapterOfUserEntity.insertAndReturnId(_connection, usuario);
    }, $completion);
  }

  @Override
  public Object eliminarUsuario(final UserEntity usuario,
      final Continuation<? super Unit> $completion) {
    if (usuario == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfUserEntity.handle(_connection, usuario);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object actualizarUsuario(final UserEntity usuario,
      final Continuation<? super Unit> $completion) {
    if (usuario == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfUserEntity.handle(_connection, usuario);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object obtenerUsuarioPorEmail(final String email,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM usuarios WHERE email = ? LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (email == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, email);
        }
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _cursorIndexOfPasswordHash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "passwordHash");
        final int _cursorIndexOfEsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "esAdmin");
        final int _cursorIndexOfTemaActual = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "temaActual");
        final int _cursorIndexOfNotificacionesActivadas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificacionesActivadas");
        final int _cursorIndexOfEstaLogueado = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "estaLogueado");
        final UserEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpEmail;
          if (_stmt.isNull(_cursorIndexOfEmail)) {
            _tmpEmail = null;
          } else {
            _tmpEmail = _stmt.getText(_cursorIndexOfEmail);
          }
          final String _tmpPasswordHash;
          if (_stmt.isNull(_cursorIndexOfPasswordHash)) {
            _tmpPasswordHash = null;
          } else {
            _tmpPasswordHash = _stmt.getText(_cursorIndexOfPasswordHash);
          }
          final boolean _tmpEsAdmin;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_cursorIndexOfEsAdmin));
          _tmpEsAdmin = _tmp != 0;
          final String _tmpTemaActual;
          if (_stmt.isNull(_cursorIndexOfTemaActual)) {
            _tmpTemaActual = null;
          } else {
            _tmpTemaActual = _stmt.getText(_cursorIndexOfTemaActual);
          }
          final boolean _tmpNotificacionesActivadas;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_cursorIndexOfNotificacionesActivadas));
          _tmpNotificacionesActivadas = _tmp_1 != 0;
          final boolean _tmpEstaLogueado;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_cursorIndexOfEstaLogueado));
          _tmpEstaLogueado = _tmp_2 != 0;
          _result = new UserEntity(_tmpId,_tmpNombre,_tmpEmail,_tmpPasswordHash,_tmpEsAdmin,_tmpTemaActual,_tmpNotificacionesActivadas,_tmpEstaLogueado);
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
  public Flow<UserEntity> obtenerUsuarioLogueado() {
    final String _sql = "SELECT * FROM usuarios WHERE estaLogueado = 1 LIMIT 1";
    return FlowUtil.createFlow(__db, false, new String[] {"usuarios"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _cursorIndexOfPasswordHash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "passwordHash");
        final int _cursorIndexOfEsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "esAdmin");
        final int _cursorIndexOfTemaActual = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "temaActual");
        final int _cursorIndexOfNotificacionesActivadas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificacionesActivadas");
        final int _cursorIndexOfEstaLogueado = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "estaLogueado");
        final UserEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpEmail;
          if (_stmt.isNull(_cursorIndexOfEmail)) {
            _tmpEmail = null;
          } else {
            _tmpEmail = _stmt.getText(_cursorIndexOfEmail);
          }
          final String _tmpPasswordHash;
          if (_stmt.isNull(_cursorIndexOfPasswordHash)) {
            _tmpPasswordHash = null;
          } else {
            _tmpPasswordHash = _stmt.getText(_cursorIndexOfPasswordHash);
          }
          final boolean _tmpEsAdmin;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_cursorIndexOfEsAdmin));
          _tmpEsAdmin = _tmp != 0;
          final String _tmpTemaActual;
          if (_stmt.isNull(_cursorIndexOfTemaActual)) {
            _tmpTemaActual = null;
          } else {
            _tmpTemaActual = _stmt.getText(_cursorIndexOfTemaActual);
          }
          final boolean _tmpNotificacionesActivadas;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_cursorIndexOfNotificacionesActivadas));
          _tmpNotificacionesActivadas = _tmp_1 != 0;
          final boolean _tmpEstaLogueado;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_cursorIndexOfEstaLogueado));
          _tmpEstaLogueado = _tmp_2 != 0;
          _result = new UserEntity(_tmpId,_tmpNombre,_tmpEmail,_tmpPasswordHash,_tmpEsAdmin,_tmpTemaActual,_tmpNotificacionesActivadas,_tmpEstaLogueado);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<UserEntity>> obtenerTodosLosUsuarios() {
    final String _sql = "SELECT * FROM usuarios ORDER BY id ASC";
    return FlowUtil.createFlow(__db, false, new String[] {"usuarios"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _cursorIndexOfPasswordHash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "passwordHash");
        final int _cursorIndexOfEsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "esAdmin");
        final int _cursorIndexOfTemaActual = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "temaActual");
        final int _cursorIndexOfNotificacionesActivadas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificacionesActivadas");
        final int _cursorIndexOfEstaLogueado = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "estaLogueado");
        final List<UserEntity> _result = new ArrayList<UserEntity>();
        while (_stmt.step()) {
          final UserEntity _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpEmail;
          if (_stmt.isNull(_cursorIndexOfEmail)) {
            _tmpEmail = null;
          } else {
            _tmpEmail = _stmt.getText(_cursorIndexOfEmail);
          }
          final String _tmpPasswordHash;
          if (_stmt.isNull(_cursorIndexOfPasswordHash)) {
            _tmpPasswordHash = null;
          } else {
            _tmpPasswordHash = _stmt.getText(_cursorIndexOfPasswordHash);
          }
          final boolean _tmpEsAdmin;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_cursorIndexOfEsAdmin));
          _tmpEsAdmin = _tmp != 0;
          final String _tmpTemaActual;
          if (_stmt.isNull(_cursorIndexOfTemaActual)) {
            _tmpTemaActual = null;
          } else {
            _tmpTemaActual = _stmt.getText(_cursorIndexOfTemaActual);
          }
          final boolean _tmpNotificacionesActivadas;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_cursorIndexOfNotificacionesActivadas));
          _tmpNotificacionesActivadas = _tmp_1 != 0;
          final boolean _tmpEstaLogueado;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_cursorIndexOfEstaLogueado));
          _tmpEstaLogueado = _tmp_2 != 0;
          _item = new UserEntity(_tmpId,_tmpNombre,_tmpEmail,_tmpPasswordHash,_tmpEsAdmin,_tmpTemaActual,_tmpNotificacionesActivadas,_tmpEstaLogueado);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object obtenerUsuarioPorId(final int userId,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM usuarios WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, userId);
        final int _cursorIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _cursorIndexOfNombre = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nombre");
        final int _cursorIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _cursorIndexOfPasswordHash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "passwordHash");
        final int _cursorIndexOfEsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "esAdmin");
        final int _cursorIndexOfTemaActual = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "temaActual");
        final int _cursorIndexOfNotificacionesActivadas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificacionesActivadas");
        final int _cursorIndexOfEstaLogueado = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "estaLogueado");
        final UserEntity _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_cursorIndexOfId));
          final String _tmpNombre;
          if (_stmt.isNull(_cursorIndexOfNombre)) {
            _tmpNombre = null;
          } else {
            _tmpNombre = _stmt.getText(_cursorIndexOfNombre);
          }
          final String _tmpEmail;
          if (_stmt.isNull(_cursorIndexOfEmail)) {
            _tmpEmail = null;
          } else {
            _tmpEmail = _stmt.getText(_cursorIndexOfEmail);
          }
          final String _tmpPasswordHash;
          if (_stmt.isNull(_cursorIndexOfPasswordHash)) {
            _tmpPasswordHash = null;
          } else {
            _tmpPasswordHash = _stmt.getText(_cursorIndexOfPasswordHash);
          }
          final boolean _tmpEsAdmin;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_cursorIndexOfEsAdmin));
          _tmpEsAdmin = _tmp != 0;
          final String _tmpTemaActual;
          if (_stmt.isNull(_cursorIndexOfTemaActual)) {
            _tmpTemaActual = null;
          } else {
            _tmpTemaActual = _stmt.getText(_cursorIndexOfTemaActual);
          }
          final boolean _tmpNotificacionesActivadas;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_cursorIndexOfNotificacionesActivadas));
          _tmpNotificacionesActivadas = _tmp_1 != 0;
          final boolean _tmpEstaLogueado;
          final int _tmp_2;
          _tmp_2 = (int) (_stmt.getLong(_cursorIndexOfEstaLogueado));
          _tmpEstaLogueado = _tmp_2 != 0;
          _result = new UserEntity(_tmpId,_tmpNombre,_tmpEmail,_tmpPasswordHash,_tmpEsAdmin,_tmpTemaActual,_tmpNotificacionesActivadas,_tmpEstaLogueado);
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
  public Object existeEmail(final String email, final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM usuarios WHERE email = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (email == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, email);
        }
        final Integer _result;
        if (_stmt.step()) {
          final Integer _tmp;
          if (_stmt.isNull(0)) {
            _tmp = null;
          } else {
            _tmp = (int) (_stmt.getLong(0));
          }
          _result = _tmp;
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
  public Object contarAdmins(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM usuarios WHERE esAdmin = 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final Integer _result;
        if (_stmt.step()) {
          final Integer _tmp;
          if (_stmt.isNull(0)) {
            _tmp = null;
          } else {
            _tmp = (int) (_stmt.getLong(0));
          }
          _result = _tmp;
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
  public Object actualizarEstadoLogin(final int userId, final boolean estaLogueado,
      final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE usuarios SET estaLogueado = ? WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        final int _tmp = estaLogueado ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object cerrarSesionTodos(final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE usuarios SET estaLogueado = 0";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object actualizarTema(final int userId, final String tema,
      final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE usuarios SET temaActual = ? WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (tema == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, tema);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object actualizarNotificaciones(final int userId, final boolean activadas,
      final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE usuarios SET notificacionesActivadas = ? WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        final int _tmp = activadas ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object actualizarContrasena(final int userId, final String nuevoHash,
      final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE usuarios SET passwordHash = ? WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (nuevoHash == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, nuevoHash);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
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
