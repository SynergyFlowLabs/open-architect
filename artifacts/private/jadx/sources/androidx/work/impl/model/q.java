package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.b2;
import androidx.room.f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<o> f76969b;

    class a extends androidx.room.w<o> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, o value) {
            if (value.a() == null) {
                stmt.J7(1);
            } else {
                stmt.H5(1, value.a());
            }
            if (value.b() == null) {
                stmt.J7(2);
            } else {
                stmt.H5(2, value.b());
            }
        }
    }

    public q(b2 __db) {
        this.f76968a = __db;
        this.f76969b = new a(__db);
    }

    public static List<Class<?>> d() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.p
    public void a(final o workName) {
        this.f76968a.assertNotSuspendingTransaction();
        this.f76968a.beginTransaction();
        try {
            this.f76969b.insert(workName);
            this.f76968a.setTransactionSuccessful();
            this.f76968a.endTransaction();
        } catch (Throwable th2) {
            this.f76968a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.p
    public List<String> b(final String workSpecId) {
        f2 f2VarD = f2.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, workSpecId);
        }
        this.f76968a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76968a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            cursorF.close();
            return arrayList;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.p
    public List<String> c(final String name) {
        f2 f2VarD = f2.d("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        this.f76968a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76968a, f2VarD, false, null);
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
}
