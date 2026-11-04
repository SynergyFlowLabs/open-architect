package com.superwall.sdk.storage.core_data.entities;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.j;
import androidx.room.m2;
import androidx.room.util.a;
import androidx.room.util.b;
import androidx.room.w;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.superwall.sdk.storage.core_data.Converters;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.d;
import w3.i;

/* JADX INFO: loaded from: classes13.dex */
public final class ManagedEventDataDao_Impl implements ManagedEventDataDao {
    private final Converters __converters = new Converters();
    private final b2 __db;
    private final w<ManagedEventData> __insertionAdapterOfManagedEventData;
    private final m2 __preparedStmtOfDeleteAll;

    public ManagedEventDataDao_Impl(@NonNull final b2 __db) {
        this.__db = __db;
        this.__insertionAdapterOfManagedEventData = new w<ManagedEventData>(__db) { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.1
            @Override // androidx.room.m2
            @NonNull
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ManagedEventData` (`id`,`createdAt`,`name`,`parameters`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.w
            public void bind(@NonNull final i statement, @NonNull final ManagedEventData entity) {
                statement.H5(1, entity.getId());
                Long timestamp = ManagedEventDataDao_Impl.this.__converters.toTimestamp(entity.getCreatedAt());
                if (timestamp == null) {
                    statement.J7(2);
                } else {
                    statement.G6(2, timestamp.longValue());
                }
                statement.H5(3, entity.getName());
                statement.H5(4, ManagedEventDataDao_Impl.this.__converters.fromMap(entity.getParameters()));
            }
        };
        this.__preparedStmtOfDeleteAll = new m2(__db) { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.2
            @Override // androidx.room.m2
            @NonNull
            public String createQuery() {
                return "DELETE FROM ManagedEventData";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao
    public Object countEventsByNameInPeriod(final String name, final Date startDate, final Date endDate, final d<? super Integer> $completion) {
        final f2 f2VarD = f2.d("\n        SELECT COUNT(*) FROM ManagedEventData \n        WHERE name = ? \n        AND createdAt BETWEEN ? AND ?\n        ", 3);
        f2VarD.H5(1, name);
        Long timestamp = this.__converters.toTimestamp(startDate);
        if (timestamp == null) {
            f2VarD.J7(2);
        } else {
            f2VarD.G6(2, timestamp.longValue());
        }
        Long timestamp2 = this.__converters.toTimestamp(endDate);
        if (timestamp2 == null) {
            f2VarD.J7(3);
        } else {
            f2VarD.G6(3, timestamp2.longValue());
        }
        return j.b(this.__db, false, b.a(), new Callable<Integer>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @NonNull
            public Integer call() throws Exception {
                Cursor cursorF = b.f(ManagedEventDataDao_Impl.this.__db, f2VarD, false, null);
                try {
                    int iValueOf = cursorF.moveToFirst() ? Integer.valueOf(cursorF.getInt(0)) : 0;
                    cursorF.close();
                    return iValueOf;
                } finally {
                    cursorF.close();
                    f2VarD.release();
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao
    public Object deleteAll(final d<? super Unit> $completion) {
        return j.c(this.__db, true, new Callable<Unit>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.4
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                i iVarAcquire = ManagedEventDataDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    ManagedEventDataDao_Impl.this.__db.beginTransaction();
                    try {
                        iVarAcquire.j2();
                        ManagedEventDataDao_Impl.this.__db.setTransactionSuccessful();
                        Unit unit = Unit.f312394a;
                        ManagedEventDataDao_Impl.this.__db.endTransaction();
                        ManagedEventDataDao_Impl.this.__preparedStmtOfDeleteAll.release(iVarAcquire);
                        return unit;
                    } catch (Throwable th2) {
                        ManagedEventDataDao_Impl.this.__db.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ManagedEventDataDao_Impl.this.__preparedStmtOfDeleteAll.release(iVarAcquire);
                    throw th3;
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao
    public Object getLastSavedEvent(final String name, final Date date, final d<? super ManagedEventData> $completion) {
        final f2 f2VarD = f2.d("\n        SELECT * FROM ManagedEventData \n        WHERE name = ? \n        AND (? IS NULL OR createdAt < ?) \n        ORDER BY createdAt DESC \n        LIMIT 1\n    ", 3);
        f2VarD.H5(1, name);
        Long timestamp = this.__converters.toTimestamp(date);
        if (timestamp == null) {
            f2VarD.J7(2);
        } else {
            f2VarD.G6(2, timestamp.longValue());
        }
        Long timestamp2 = this.__converters.toTimestamp(date);
        if (timestamp2 == null) {
            f2VarD.J7(3);
        } else {
            f2VarD.G6(3, timestamp2.longValue());
        }
        return j.b(this.__db, false, b.a(), new Callable<ManagedEventData>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @p0
            public ManagedEventData call() throws Exception {
                ManagedEventData managedEventData = null;
                Date date2 = null;
                Cursor cursorF = b.f(ManagedEventDataDao_Impl.this.__db, f2VarD, false, null);
                try {
                    int iE = a.e(cursorF, "id");
                    int iE2 = a.e(cursorF, "createdAt");
                    int iE3 = a.e(cursorF, "name");
                    int iE4 = a.e(cursorF, ExperimentsEntry.parameters);
                    if (cursorF.moveToFirst()) {
                        String string = cursorF.getString(iE);
                        Long lValueOf = cursorF.isNull(iE2) ? null : Long.valueOf(cursorF.getLong(iE2));
                        if (lValueOf != null) {
                            date2 = ManagedEventDataDao_Impl.this.__converters.toDate(lValueOf.longValue());
                        }
                        if (date2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        managedEventData = new ManagedEventData(string, date2, cursorF.getString(iE3), ManagedEventDataDao_Impl.this.__converters.toMap(cursorF.getString(iE4)));
                    }
                    cursorF.close();
                    f2VarD.release();
                    return managedEventData;
                } catch (Throwable th2) {
                    cursorF.close();
                    f2VarD.release();
                    throw th2;
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao
    public Object insert(final ManagedEventData eventData, final d<? super Unit> $completion) {
        return j.c(this.__db, true, new Callable<Unit>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao_Impl.3
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                ManagedEventDataDao_Impl.this.__db.beginTransaction();
                try {
                    ManagedEventDataDao_Impl.this.__insertionAdapterOfManagedEventData.insert(eventData);
                    ManagedEventDataDao_Impl.this.__db.setTransactionSuccessful();
                    Unit unit = Unit.f312394a;
                    ManagedEventDataDao_Impl.this.__db.endTransaction();
                    return unit;
                } catch (Throwable th2) {
                    ManagedEventDataDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        }, $completion);
    }
}
