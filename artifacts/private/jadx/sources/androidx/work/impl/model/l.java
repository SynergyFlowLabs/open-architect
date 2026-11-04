package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<j> f76958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2 f76959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2 f76960d;

    class a extends androidx.room.w<j> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, j value) {
            String str = value.f76954a;
            if (str == null) {
                stmt.J7(1);
            } else {
                stmt.H5(1, str);
            }
            stmt.G6(2, value.f());
            stmt.G6(3, value.f76956c);
        }
    }

    class b extends m2 {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends m2 {
        c(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public l(b2 __db) {
        this.f76957a = __db;
        this.f76958b = new a(__db);
        this.f76959c = new b(__db);
        this.f76960d = new c(__db);
    }

    public static List<Class<?>> j() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.k
    public j b(String str, int i10) {
        f2 f2VarD = f2.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, str);
        }
        f2VarD.G6(2, i10);
        this.f76957a.assertNotSuspendingTransaction();
        j jVar = null;
        String string = null;
        Cursor cursorF = androidx.room.util.b.f(this.f76957a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "work_spec_id");
            int iE2 = androidx.room.util.a.e(cursorF, "generation");
            int iE3 = androidx.room.util.a.e(cursorF, "system_id");
            if (cursorF.moveToFirst()) {
                if (!cursorF.isNull(iE)) {
                    string = cursorF.getString(iE);
                }
                jVar = new j(string, cursorF.getInt(iE2), cursorF.getInt(iE3));
            }
            cursorF.close();
            f2VarD.release();
            return jVar;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.k
    public void c(final n id2) {
        k.a.b(this, id2);
    }

    @Override // androidx.work.impl.model.k
    public void d(final j systemIdInfo) {
        this.f76957a.assertNotSuspendingTransaction();
        this.f76957a.beginTransaction();
        try {
            this.f76958b.insert(systemIdInfo);
            this.f76957a.setTransactionSuccessful();
        } finally {
            this.f76957a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.k
    public j e(final n id2) {
        return k.a.a(this, id2);
    }

    @Override // androidx.work.impl.model.k
    public List<String> f() {
        f2 f2VarD = f2.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f76957a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76957a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
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

    @Override // androidx.work.impl.model.k
    public void g(final String workSpecId, final int generation) {
        this.f76957a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f76959c.acquire();
        if (workSpecId == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, workSpecId);
        }
        iVarAcquire.G6(2, generation);
        this.f76957a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f76957a.setTransactionSuccessful();
            this.f76957a.endTransaction();
            this.f76959c.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f76957a.endTransaction();
            this.f76959c.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.k
    public void i(final String workSpecId) {
        this.f76957a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f76960d.acquire();
        if (workSpecId == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, workSpecId);
        }
        this.f76957a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f76957a.setTransactionSuccessful();
            this.f76957a.endTransaction();
            this.f76960d.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f76957a.endTransaction();
            this.f76960d.release(iVarAcquire);
            throw th2;
        }
    }
}
