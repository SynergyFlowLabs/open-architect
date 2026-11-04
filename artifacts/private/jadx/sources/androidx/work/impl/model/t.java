package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.m2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<r> f76974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2 f76975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2 f76976d;

    class a extends androidx.room.w<r> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, r value) throws Throwable {
            if (value.b() == null) {
                stmt.J7(1);
            } else {
                stmt.H5(1, value.b());
            }
            byte[] bArrF = androidx.work.h.F(value.a());
            if (bArrF == null) {
                stmt.J7(2);
            } else {
                stmt.Q6(2, bArrF);
            }
        }
    }

    class b extends m2 {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends m2 {
        c(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public t(b2 __db) {
        this.f76973a = __db;
        this.f76974b = new a(__db);
        this.f76975c = new b(__db);
        this.f76976d = new c(__db);
    }

    public static List<Class<?>> d() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.s
    public void a(final String workSpecId) {
        this.f76973a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f76975c.acquire();
        if (workSpecId == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, workSpecId);
        }
        this.f76973a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f76973a.setTransactionSuccessful();
        } finally {
            this.f76973a.endTransaction();
            this.f76975c.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.s
    public androidx.work.h b(final String workSpecId) {
        f2 f2VarD = f2.d("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, workSpecId);
        }
        this.f76973a.assertNotSuspendingTransaction();
        androidx.work.h hVarM = null;
        Cursor cursorF = androidx.room.util.b.f(this.f76973a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                byte[] blob = cursorF.isNull(0) ? null : cursorF.getBlob(0);
                if (blob != null) {
                    hVarM = androidx.work.h.m(blob);
                }
            }
            return hVarM;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.s
    public void c(final r progress) {
        this.f76973a.assertNotSuspendingTransaction();
        this.f76973a.beginTransaction();
        try {
            this.f76974b.insert(progress);
            this.f76973a.setTransactionSuccessful();
            this.f76973a.endTransaction();
        } catch (Throwable th2) {
            this.f76973a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.s
    public void deleteAll() {
        this.f76973a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f76976d.acquire();
        this.f76973a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f76973a.setTransactionSuccessful();
            this.f76973a.endTransaction();
            this.f76976d.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f76973a.endTransaction();
            this.f76976d.release(iVarAcquire);
            throw th2;
        }
    }
}
