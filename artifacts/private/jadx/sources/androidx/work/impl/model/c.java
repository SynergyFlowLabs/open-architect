package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.b2;
import androidx.room.f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<androidx.work.impl.model.a> f76909b;

    class a extends androidx.room.w<androidx.work.impl.model.a> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, androidx.work.impl.model.a value) {
            if (value.b() == null) {
                stmt.J7(1);
            } else {
                stmt.H5(1, value.b());
            }
            if (value.a() == null) {
                stmt.J7(2);
            } else {
                stmt.H5(2, value.a());
            }
        }
    }

    public c(b2 __db) {
        this.f76908a = __db;
        this.f76909b = new a(__db);
    }

    public static List<Class<?>> f() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.b
    public void a(final androidx.work.impl.model.a dependency) {
        this.f76908a.assertNotSuspendingTransaction();
        this.f76908a.beginTransaction();
        try {
            this.f76909b.insert(dependency);
            this.f76908a.setTransactionSuccessful();
        } finally {
            this.f76908a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> b(final String id2) {
        f2 f2VarD = f2.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f76908a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76908a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.b
    public boolean c(final String id2) {
        boolean z10 = true;
        f2 f2VarD = f2.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f76908a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor cursorF = androidx.room.util.b.f(this.f76908a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                if (cursorF.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            cursorF.close();
            f2VarD.release();
            return z11;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> d(final String id2) {
        f2 f2VarD = f2.d("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f76908a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76908a, f2VarD, false, null);
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

    @Override // androidx.work.impl.model.b
    public boolean e(final String id2) {
        f2 f2VarD = f2.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f76908a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorF = androidx.room.util.b.f(this.f76908a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                z10 = cursorF.getInt(0) != 0;
            }
            cursorF.close();
            f2VarD.release();
            return z10;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }
}
