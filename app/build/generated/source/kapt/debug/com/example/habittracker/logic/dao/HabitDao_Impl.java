package com.example.habittracker.logic.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.habittracker.data.models.Habit;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Habit> __insertionAdapterOfHabit;

  private final EntityDeletionOrUpdateAdapter<Habit> __deletionAdapterOfHabit;

  private final EntityDeletionOrUpdateAdapter<Habit> __updateAdapterOfHabit;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabit = new EntityInsertionAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `habit_table` (`id`,`habit_title`,`habit_description`,`habit_startTime`,`imageId`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        stmt.bindLong(1, value.getId());
        if (value.getHabit_title() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHabit_title());
        }
        if (value.getHabit_description() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHabit_description());
        }
        if (value.getHabit_startTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHabit_startTime());
        }
        stmt.bindLong(5, value.getImageId());
      }
    };
    this.__deletionAdapterOfHabit = new EntityDeletionOrUpdateAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `habit_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfHabit = new EntityDeletionOrUpdateAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `habit_table` SET `id` = ?,`habit_title` = ?,`habit_description` = ?,`habit_startTime` = ?,`imageId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        stmt.bindLong(1, value.getId());
        if (value.getHabit_title() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHabit_title());
        }
        if (value.getHabit_description() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHabit_description());
        }
        if (value.getHabit_startTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHabit_startTime());
        }
        stmt.bindLong(5, value.getImageId());
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM habit_table";
        return _query;
      }
    };
  }

  @Override
  public Object addHabit(final Habit habit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHabit.insert(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteHabit(final Habit habit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfHabit.handle(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateHabit(final Habit habit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfHabit.handle(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Habit>> getAllHabits() {
    final String _sql = "SELECT * FROM habit_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"habit_table"}, false, new Callable<List<Habit>>() {
      @Override
      public List<Habit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHabitTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "habit_title");
          final int _cursorIndexOfHabitDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "habit_description");
          final int _cursorIndexOfHabitStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "habit_startTime");
          final int _cursorIndexOfImageId = CursorUtil.getColumnIndexOrThrow(_cursor, "imageId");
          final List<Habit> _result = new ArrayList<Habit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Habit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpHabit_title;
            _tmpHabit_title = _cursor.getString(_cursorIndexOfHabitTitle);
            final String _tmpHabit_description;
            _tmpHabit_description = _cursor.getString(_cursorIndexOfHabitDescription);
            final String _tmpHabit_startTime;
            _tmpHabit_startTime = _cursor.getString(_cursorIndexOfHabitStartTime);
            final int _tmpImageId;
            _tmpImageId = _cursor.getInt(_cursorIndexOfImageId);
            _item = new Habit(_tmpId,_tmpHabit_title,_tmpHabit_description,_tmpHabit_startTime,_tmpImageId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
