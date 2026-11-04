package com.planner5d.library.services.backgroundexecutor.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.j;
import androidx.room.v;
import androidx.room.w;
import io.sentry.o7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import w3.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements com.planner5d.library.services.backgroundexecutor.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f224005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<com.planner5d.library.services.backgroundexecutor.database.b> f224006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final re.a f224007c = new re.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v<com.planner5d.library.services.backgroundexecutor.database.b> f224008d;

    class a extends w<com.planner5d.library.services.backgroundexecutor.database.b> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR ABORT INTO `crash_record` (`timestamp_millis`,`thread_id`,`thread_name`,`exception`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final i statement, @NonNull final com.planner5d.library.services.backgroundexecutor.database.b entity) throws IOException {
            statement.G6(1, entity.e());
            statement.G6(2, entity.c());
            statement.H5(3, entity.d());
            byte[] bArrB = d.this.f224007c.b(entity.a());
            if (bArrB == null) {
                statement.J7(4);
            } else {
                statement.Q6(4, bArrB);
            }
            statement.G6(5, entity.b());
        }
    }

    class b extends v<com.planner5d.library.services.backgroundexecutor.database.b> {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.v, androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "DELETE FROM `crash_record` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final i statement, @NonNull final com.planner5d.library.services.backgroundexecutor.database.b entity) {
            statement.G6(1, entity.b());
        }
    }

    class c implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.backgroundexecutor.database.b f224011a;

        c(final com.planner5d.library.services.backgroundexecutor.database.b val$record) {
            this.f224011a = val$record;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            d.this.f224005a.beginTransaction();
            try {
                d.this.f224006b.insert(this.f224011a);
                d.this.f224005a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                d dVar = d.this;
                return unit;
            } finally {
                d.this.f224005a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.backgroundexecutor.database.d$d, reason: collision with other inner class name */
    class CallableC1660d implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.backgroundexecutor.database.b f224013a;

        CallableC1660d(final com.planner5d.library.services.backgroundexecutor.database.b val$record) {
            this.f224013a = val$record;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            d.this.f224005a.beginTransaction();
            try {
                d.this.f224008d.d(this.f224013a);
                d.this.f224005a.setTransactionSuccessful();
                return Unit.f312394a;
            } finally {
                d.this.f224005a.endTransaction();
            }
        }
    }

    class e implements Callable<List<com.planner5d.library.services.backgroundexecutor.database.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f224015a;

        e(final f2 val$_statement) {
            this.f224015a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.services.backgroundexecutor.database.b> call() throws Exception {
            d.this.f224005a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(d.this.f224005a, this.f224015a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "timestamp_millis");
                    int iE2 = androidx.room.util.a.e(cursorF, "thread_id");
                    int iE3 = androidx.room.util.a.e(cursorF, "thread_name");
                    int iE4 = androidx.room.util.a.e(cursorF, o7.b.f305964e);
                    int iE5 = androidx.room.util.a.e(cursorF, "id");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        long j10 = cursorF.getLong(iE);
                        long j11 = cursorF.getLong(iE2);
                        String string = cursorF.getString(iE3);
                        com.planner5d.library.model.exception.c cVarA = d.this.f224007c.a(cursorF.isNull(iE4) ? null : cursorF.getBlob(iE4));
                        if (cVarA == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.planner5d.library.model.exception.RawSerializableException', but it was NULL.");
                        }
                        arrayList.add(new com.planner5d.library.services.backgroundexecutor.database.b(j10, j11, string, cVarA, cursorF.getLong(iE5)));
                    }
                    d.this.f224005a.setTransactionSuccessful();
                    cursorF.close();
                    this.f224015a.release();
                    d.this.f224005a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f224015a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                d.this.f224005a.endTransaction();
                throw th3;
            }
        }
    }

    public d(@NonNull final b2 __db) {
        this.f224005a = __db;
        this.f224006b = new a(__db);
        this.f224008d = new b(__db);
    }

    @NonNull
    public static List<Class<?>> h() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.services.backgroundexecutor.database.c
    public Object a(final com.planner5d.library.services.backgroundexecutor.database.b record, final kotlin.coroutines.d<? super Unit> $completion) {
        return j.c(this.f224005a, true, new c(record), $completion);
    }

    @Override // com.planner5d.library.services.backgroundexecutor.database.c
    public Object b(final kotlin.coroutines.d<? super List<com.planner5d.library.services.backgroundexecutor.database.b>> $completion) {
        int i10 = 6 | 0;
        f2 f2VarD = f2.d("SELECT * FROM crash_record", 0);
        return j.b(this.f224005a, true, androidx.room.util.b.a(), new e(f2VarD), $completion);
    }

    @Override // com.planner5d.library.services.backgroundexecutor.database.c
    public Object c(final com.planner5d.library.services.backgroundexecutor.database.b record, final kotlin.coroutines.d<? super Unit> $completion) {
        return j.c(this.f224005a, true, new CallableC1660d(record), $completion);
    }
}
