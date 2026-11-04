package com.superwall.sdk.storage.core_data.entities;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.j;
import androidx.room.m2;
import androidx.room.util.a;
import androidx.room.util.b;
import androidx.room.w;
import com.superwall.sdk.storage.core_data.Converters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.d;
import w3.i;

/* JADX INFO: loaded from: classes13.dex */
public final class ManagedTriggerRuleOccurrenceDao_Impl implements ManagedTriggerRuleOccurrenceDao {
    private final Converters __converters = new Converters();
    private final b2 __db;
    private final w<ManagedTriggerRuleOccurrence> __insertionAdapterOfManagedTriggerRuleOccurrence;
    private final m2 __preparedStmtOfDeleteAll;

    public ManagedTriggerRuleOccurrenceDao_Impl(@NonNull final b2 __db) {
        this.__db = __db;
        this.__insertionAdapterOfManagedTriggerRuleOccurrence = new w<ManagedTriggerRuleOccurrence>(__db) { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.1
            @Override // androidx.room.m2
            @NonNull
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ManagedTriggerRuleOccurrence` (`id`,`createdAt`,`occurrenceKey`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.w
            public void bind(@NonNull final i statement, @NonNull final ManagedTriggerRuleOccurrence entity) {
                if (entity.getId() == null) {
                    statement.J7(1);
                } else {
                    statement.G6(1, entity.getId().intValue());
                }
                Long timestamp = ManagedTriggerRuleOccurrenceDao_Impl.this.__converters.toTimestamp(entity.getCreatedAt());
                if (timestamp == null) {
                    statement.J7(2);
                } else {
                    statement.G6(2, timestamp.longValue());
                }
                statement.H5(3, entity.getOccurrenceKey());
            }
        };
        this.__preparedStmtOfDeleteAll = new m2(__db) { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.2
            @Override // androidx.room.m2
            @NonNull
            public String createQuery() {
                return "DELETE FROM ManagedTriggerRuleOccurrence";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao
    public Object deleteAll(final d<? super Unit> $completion) {
        return j.c(this.__db, true, new Callable<Unit>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.4
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                i iVarAcquire = ManagedTriggerRuleOccurrenceDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__db.beginTransaction();
                    try {
                        iVarAcquire.j2();
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.setTransactionSuccessful();
                        Unit unit = Unit.f312394a;
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__preparedStmtOfDeleteAll.release(iVarAcquire);
                        return unit;
                    } catch (Throwable th2) {
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__preparedStmtOfDeleteAll.release(iVarAcquire);
                    throw th3;
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao
    public Object getManagedTriggerRuleOccurrencesByKey(final String key, final d<? super List<ManagedTriggerRuleOccurrence>> $completion) {
        final f2 f2VarD = f2.d("SELECT * FROM ManagedTriggerRuleOccurrence WHERE occurrenceKey = ?", 1);
        f2VarD.H5(1, key);
        return j.b(this.__db, true, b.a(), new Callable<List<ManagedTriggerRuleOccurrence>>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.5
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<ManagedTriggerRuleOccurrence> call() throws Exception {
                ManagedTriggerRuleOccurrenceDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorF = b.f(ManagedTriggerRuleOccurrenceDao_Impl.this.__db, f2VarD, false, null);
                    try {
                        int iE = a.e(cursorF, "id");
                        int iE2 = a.e(cursorF, "createdAt");
                        int iE3 = a.e(cursorF, "occurrenceKey");
                        ArrayList arrayList = new ArrayList(cursorF.getCount());
                        while (cursorF.moveToNext()) {
                            Integer numValueOf = cursorF.isNull(iE) ? null : Integer.valueOf(cursorF.getInt(iE));
                            Long lValueOf = cursorF.isNull(iE2) ? null : Long.valueOf(cursorF.getLong(iE2));
                            Date date = lValueOf == null ? null : ManagedTriggerRuleOccurrenceDao_Impl.this.__converters.toDate(lValueOf.longValue());
                            if (date == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                            }
                            arrayList.add(new ManagedTriggerRuleOccurrence(numValueOf, date, cursorF.getString(iE3)));
                        }
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.setTransactionSuccessful();
                        cursorF.close();
                        f2VarD.release();
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                        return arrayList;
                    } catch (Throwable th2) {
                        cursorF.close();
                        f2VarD.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                    throw th3;
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao
    public Object getManagedTriggerRuleOccurrencesSinceDate(final Date date, final String key, final d<? super List<ManagedTriggerRuleOccurrence>> $completion) {
        final f2 f2VarD = f2.d("SELECT * FROM ManagedTriggerRuleOccurrence WHERE createdAt >= ? AND occurrenceKey = ?", 2);
        Long timestamp = this.__converters.toTimestamp(date);
        if (timestamp == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.G6(1, timestamp.longValue());
        }
        f2VarD.H5(2, key);
        return j.b(this.__db, true, b.a(), new Callable<List<ManagedTriggerRuleOccurrence>>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.6
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<ManagedTriggerRuleOccurrence> call() throws Exception {
                ManagedTriggerRuleOccurrenceDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorF = b.f(ManagedTriggerRuleOccurrenceDao_Impl.this.__db, f2VarD, false, null);
                    try {
                        int iE = a.e(cursorF, "id");
                        int iE2 = a.e(cursorF, "createdAt");
                        int iE3 = a.e(cursorF, "occurrenceKey");
                        ArrayList arrayList = new ArrayList(cursorF.getCount());
                        while (cursorF.moveToNext()) {
                            Integer numValueOf = cursorF.isNull(iE) ? null : Integer.valueOf(cursorF.getInt(iE));
                            Long lValueOf = cursorF.isNull(iE2) ? null : Long.valueOf(cursorF.getLong(iE2));
                            Date date2 = lValueOf == null ? null : ManagedTriggerRuleOccurrenceDao_Impl.this.__converters.toDate(lValueOf.longValue());
                            if (date2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                            }
                            arrayList.add(new ManagedTriggerRuleOccurrence(numValueOf, date2, cursorF.getString(iE3)));
                        }
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.setTransactionSuccessful();
                        cursorF.close();
                        f2VarD.release();
                        ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                        return arrayList;
                    } catch (Throwable th2) {
                        cursorF.close();
                        f2VarD.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                    throw th3;
                }
            }
        }, $completion);
    }

    @Override // com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao
    public Object insert(final ManagedTriggerRuleOccurrence eventData, final d<? super Unit> $completion) {
        return j.c(this.__db, true, new Callable<Unit>() { // from class: com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao_Impl.3
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                ManagedTriggerRuleOccurrenceDao_Impl.this.__db.beginTransaction();
                try {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__insertionAdapterOfManagedTriggerRuleOccurrence.insert(eventData);
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__db.setTransactionSuccessful();
                    Unit unit = Unit.f312394a;
                    b2 b2Var = ManagedTriggerRuleOccurrenceDao_Impl.this.__db;
                    return unit;
                } finally {
                    ManagedTriggerRuleOccurrenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }
}
