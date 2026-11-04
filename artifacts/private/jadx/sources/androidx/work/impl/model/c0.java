package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<a0> f76912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2 f76913c;

    class a extends androidx.room.w<a0> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i stmt, a0 value) {
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

    class b extends m2 {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public c0(b2 __db) {
        this.f76911a = __db;
        this.f76912b = new a(__db);
        this.f76913c = new b(__db);
    }

    public static List<Class<?>> g() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.b0
    public void a(final String id2) {
        this.f76911a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f76913c.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f76911a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f76911a.setTransactionSuccessful();
            this.f76911a.endTransaction();
            this.f76913c.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f76911a.endTransaction();
            this.f76913c.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.b0
    public void c(final String id2, final Set<String> tags) {
        b0.a.a(this, id2, tags);
    }

    @Override // androidx.work.impl.model.b0
    public List<String> d(final String id2) {
        f2 f2VarD = f2.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f76911a.assertNotSuspendingTransaction();
        int i10 = 7 << 0;
        Cursor cursorF = androidx.room.util.b.f(this.f76911a, f2VarD, false, null);
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

    @Override // androidx.work.impl.model.b0
    public void e(final a0 workTag) {
        this.f76911a.assertNotSuspendingTransaction();
        this.f76911a.beginTransaction();
        try {
            this.f76912b.insert(workTag);
            this.f76911a.setTransactionSuccessful();
            this.f76911a.endTransaction();
        } catch (Throwable th2) {
            this.f76911a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.b0
    public List<String> f(final String tag) {
        f2 f2VarD = f2.d("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (tag == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, tag);
        }
        this.f76911a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76911a, f2VarD, false, null);
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
}
