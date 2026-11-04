package com.planner5d.library.model.manager.config.sql;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.m2;
import androidx.room.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends com.planner5d.library.model.manager.config.sql.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f190701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<n> f190702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2 f190703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2 f190704d;

    class a extends w<n> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `shared_preferences_records` (`name`,`value`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final n entity) {
            statement.H5(1, entity.a());
            statement.Q6(2, entity.b());
        }
    }

    class b extends m2 {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        public String createQuery() {
            return "DELETE FROM shared_preferences_records";
        }
    }

    class c extends m2 {
        c(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        public String createQuery() {
            return "DELETE FROM shared_preferences_records WHERE name = ?";
        }
    }

    class d implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f190708a;

        d(final n val$record) {
            this.f190708a = val$record;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            f.this.f190701a.beginTransaction();
            try {
                f.this.f190702b.insert(this.f190708a);
                f.this.f190701a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                f.this.f190701a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                f.this.f190701a.endTransaction();
                throw th2;
            }
        }
    }

    class e implements Callable<Unit> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            w3.i iVarAcquire = f.this.f190703c.acquire();
            try {
                f.this.f190701a.beginTransaction();
                try {
                    iVarAcquire.j2();
                    f.this.f190701a.setTransactionSuccessful();
                    Unit unit = Unit.f312394a;
                    f.this.f190701a.endTransaction();
                    f.this.f190703c.release(iVarAcquire);
                    return unit;
                } catch (Throwable th2) {
                    f.this.f190701a.endTransaction();
                    throw th2;
                }
            } catch (Throwable th3) {
                f.this.f190703c.release(iVarAcquire);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.sql.f$f, reason: collision with other inner class name */
    class CallableC1586f implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f190711a;

        CallableC1586f(final String val$name) {
            this.f190711a = val$name;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            w3.i iVarAcquire = f.this.f190704d.acquire();
            iVarAcquire.H5(1, this.f190711a);
            try {
                f.this.f190701a.beginTransaction();
                try {
                    iVarAcquire.j2();
                    f.this.f190701a.setTransactionSuccessful();
                    Unit unit = Unit.f312394a;
                    f.this.f190701a.endTransaction();
                    f.this.f190704d.release(iVarAcquire);
                    return unit;
                } catch (Throwable th2) {
                    f.this.f190701a.endTransaction();
                    throw th2;
                }
            } catch (Throwable th3) {
                f.this.f190704d.release(iVarAcquire);
                throw th3;
            }
        }
    }

    class g implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f190713a;

        g(final f2 val$_statement) {
            this.f190713a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorF = androidx.room.util.b.f(f.this.f190701a, this.f190713a, false, null);
            try {
                if (cursorF.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorF.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                cursorF.close();
                f2 f2Var = this.f190713a;
                return boolValueOf;
            } finally {
                cursorF.close();
                this.f190713a.release();
            }
        }
    }

    class h implements Callable<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f190715a;

        h(final f2 val$_statement) {
            this.f190715a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(f.this.f190701a, this.f190715a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(cursorF.getString(0));
                }
                cursorF.close();
                this.f190715a.release();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                this.f190715a.release();
                throw th2;
            }
        }
    }

    class i implements Callable<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f190717a;

        i(final f2 val$_statement) {
            this.f190717a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(f.this.f190701a, this.f190717a, false, null);
            try {
                n nVar = cursorF.moveToFirst() ? new n(cursorF.getString(androidx.room.util.a.e(cursorF, "name")), cursorF.getBlob(androidx.room.util.a.e(cursorF, "value"))) : null;
                cursorF.close();
                f2 f2Var = this.f190717a;
                return nVar;
            } finally {
                cursorF.close();
                this.f190717a.release();
            }
        }
    }

    public f(@NonNull final b2 __db) {
        this.f190701a = __db;
        this.f190702b = new a(__db);
        this.f190703c = new b(__db);
        this.f190704d = new c(__db);
    }

    @NonNull
    public static List<Class<?>> z() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public n a(final String name) {
        f2 f2VarD = f2.d("SELECT * FROM shared_preferences_records WHERE name = ?", 1);
        f2VarD.H5(1, name);
        this.f190701a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            n nVar = cursorF.moveToFirst() ? new n(cursorF.getString(androidx.room.util.a.e(cursorF, "name")), cursorF.getBlob(androidx.room.util.a.e(cursorF, "value"))) : null;
            cursorF.close();
            f2VarD.release();
            return nVar;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public void b(final String name) {
        this.f190701a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f190704d.acquire();
        iVarAcquire.H5(1, name);
        try {
            this.f190701a.beginTransaction();
            try {
                iVarAcquire.j2();
                this.f190701a.setTransactionSuccessful();
                this.f190701a.endTransaction();
                this.f190704d.release(iVarAcquire);
            } catch (Throwable th2) {
                this.f190701a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f190704d.release(iVarAcquire);
            throw th3;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object c(final String name, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f190701a, true, new CallableC1586f(name), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public void d(final n record) {
        this.f190701a.assertNotSuspendingTransaction();
        this.f190701a.beginTransaction();
        try {
            this.f190702b.insert(record);
            this.f190701a.setTransactionSuccessful();
            this.f190701a.endTransaction();
        } catch (Throwable th2) {
            this.f190701a.endTransaction();
            throw th2;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object e(final String name, final kotlin.coroutines.d<? super Boolean> $completion) {
        f2 f2VarD = f2.d("SELECT EXISTS(SELECT * FROM shared_preferences_records WHERE name = ?)", 1);
        f2VarD.H5(1, name);
        return androidx.room.j.b(this.f190701a, false, androidx.room.util.b.a(), new g(f2VarD), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public void f() {
        this.f190701a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f190703c.acquire();
        try {
            this.f190701a.beginTransaction();
            try {
                iVarAcquire.j2();
                this.f190701a.setTransactionSuccessful();
                this.f190701a.endTransaction();
                this.f190703c.release(iVarAcquire);
            } catch (Throwable th2) {
                this.f190701a.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f190703c.release(iVarAcquire);
            throw th3;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public boolean g(final String name) {
        boolean z10 = true;
        f2 f2VarD = f2.d("SELECT EXISTS(SELECT * FROM shared_preferences_records WHERE name = ?)", 1);
        f2VarD.H5(1, name);
        this.f190701a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                if (cursorF.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            cursorF.close();
            return z11;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object h(final kotlin.coroutines.d<? super Unit> $completion) {
        boolean z10 = true & true;
        return androidx.room.j.c(this.f190701a, true, new e(), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object i(final String name, final kotlin.coroutines.d<? super n> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM shared_preferences_records WHERE name = ?", 1);
        f2VarD.H5(1, name);
        return androidx.room.j.b(this.f190701a, false, androidx.room.util.b.a(), new i(f2VarD), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object j(final n record, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f190701a, true, new d(record), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e, com.planner5d.library.model.manager.config.sql.o
    public Object k(final kotlin.coroutines.d<? super List<String>> $completion) {
        f2 f2VarD = f2.d("SELECT name FROM shared_preferences_records", 0);
        return androidx.room.j.b(this.f190701a, false, androidx.room.util.b.a(), new h(f2VarD), $completion);
    }

    @Override // com.planner5d.library.model.manager.config.sql.e
    protected List<String> m(final List<String> ignoredNames) {
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT name FROM shared_preferences_records WHERE name NOT IN (");
        int size = ignoredNames.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        Iterator<String> it = ignoredNames.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            f2VarD.H5(i10, it.next());
            i10++;
        }
        this.f190701a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.getString(0));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e
    protected List<n> n(final List<String> ignoredRecords) {
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT * FROM shared_preferences_records WHERE name NOT IN (");
        int size = ignoredRecords.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        Iterator<String> it = ignoredRecords.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            f2VarD.H5(i10, it.next());
            i10++;
        }
        this.f190701a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "name");
            int iE2 = androidx.room.util.a.e(cursorF, "value");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new n(cursorF.getString(iE), cursorF.getBlob(iE2)));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e
    protected Integer t(final String name) {
        f2 f2VarD = f2.d("SELECT length(value) FROM shared_preferences_records WHERE name = ?", 1);
        f2VarD.H5(1, name);
        this.f190701a.assertNotSuspendingTransaction();
        Integer numValueOf = null;
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                numValueOf = Integer.valueOf(cursorF.getInt(0));
            }
            return numValueOf;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // com.planner5d.library.model.manager.config.sql.e
    protected byte[] u(final String name, final int start, final int length) {
        f2 f2VarD = f2.d("SELECT substr(value, ?, ?) FROM shared_preferences_records WHERE name = ?", 3);
        f2VarD.G6(1, start);
        f2VarD.G6(2, length);
        f2VarD.H5(3, name);
        this.f190701a.assertNotSuspendingTransaction();
        byte[] blob = null;
        Cursor cursorF = androidx.room.util.b.f(this.f190701a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                blob = cursorF.getBlob(0);
            }
            return blob;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }
}
