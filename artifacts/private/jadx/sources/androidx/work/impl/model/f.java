package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.w0;
import androidx.room.b2;
import androidx.room.f2;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<d> f76945b;

    class a extends androidx.room.w<d> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, d value) {
            if (value.e() == null) {
                stmt.J7(1);
            } else {
                stmt.H5(1, value.e());
            }
            if (value.f() == null) {
                stmt.J7(2);
            } else {
                stmt.G6(2, value.f().longValue());
            }
        }
    }

    class b implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f76947a;

        b(final f2 val$_statement) {
            this.f76947a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorF = androidx.room.util.b.f(f.this.f76944a, this.f76947a, false, null);
            try {
                if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                    lValueOf = Long.valueOf(cursorF.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorF.close();
            }
        }

        protected void finalize() {
            this.f76947a.release();
        }
    }

    public f(b2 __db) {
        this.f76944a = __db;
        this.f76945b = new a(__db);
    }

    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.e
    public w0<Long> a(final String key) {
        f2 f2VarD = f2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, key);
        }
        return this.f76944a.getInvalidationTracker().f(new String[]{"Preference"}, false, new b(f2VarD));
    }

    @Override // androidx.work.impl.model.e
    public void b(final d preference) {
        this.f76944a.assertNotSuspendingTransaction();
        this.f76944a.beginTransaction();
        try {
            this.f76945b.insert(preference);
            this.f76944a.setTransactionSuccessful();
            this.f76944a.endTransaction();
        } catch (Throwable th2) {
            this.f76944a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.e
    public Long c(final String key) {
        f2 f2VarD = f2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, key);
        }
        this.f76944a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        boolean z10 = true | false;
        Cursor cursorF = androidx.room.util.b.f(this.f76944a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            cursorF.close();
            f2VarD.release();
            return lValueOf;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }
}
