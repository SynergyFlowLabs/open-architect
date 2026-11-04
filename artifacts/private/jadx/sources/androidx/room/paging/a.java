package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.paging.q2;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.l0;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import w3.g;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public abstract class a<T> extends q2<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f2 f75040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f75041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f75042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b2 f75043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l0.c f75044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f75045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f75046n;

    /* JADX INFO: renamed from: androidx.room.paging.a$a, reason: collision with other inner class name */
    class C0744a extends l0.c {
        C0744a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.l0.c
        public void c(@NonNull Set<String> set) {
            a.this.h();
        }
    }

    protected a(@NonNull b2 b2Var, @NonNull g gVar, boolean z10, @NonNull String... strArr) {
        this(b2Var, f2.f(gVar), z10, strArr);
    }

    private f2 N(int i10, int i11) {
        f2 f2VarD = f2.d(this.f75042j, this.f75040h.a() + 2);
        f2VarD.e(this.f75040h);
        f2VarD.G6(f2VarD.a() - 1, i11);
        f2VarD.G6(f2VarD.a(), i10);
        return f2VarD;
    }

    private void P() {
        if (this.f75046n.compareAndSet(false, true)) {
            this.f75043k.getInvalidationTracker().d(this.f75044l);
        }
    }

    @Override // androidx.paging.q2
    public void A(@NonNull q2.c cVar, @NonNull q2.b<T> bVar) throws Throwable {
        f2 f2VarN;
        int i10;
        f2 f2Var;
        P();
        List<T> list = Collections.EMPTY_LIST;
        this.f75043k.beginTransaction();
        Cursor cursorQuery = null;
        try {
            int iM = M();
            if (iM != 0) {
                int iW = q2.w(cVar, iM);
                f2VarN = N(iW, q2.x(cVar, iW, iM));
                try {
                    cursorQuery = this.f75043k.query(f2VarN);
                    List<T> listL = L(cursorQuery);
                    this.f75043k.setTransactionSuccessful();
                    f2Var = f2VarN;
                    i10 = iW;
                    list = listL;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.f75043k.endTransaction();
                    if (f2VarN != null) {
                        f2VarN.release();
                    }
                    throw th;
                }
            } else {
                i10 = 0;
                f2Var = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.f75043k.endTransaction();
            if (f2Var != null) {
                f2Var.release();
            }
            bVar.b(list, i10, iM);
        } catch (Throwable th3) {
            th = th3;
            f2VarN = null;
        }
    }

    @Override // androidx.paging.q2
    public void D(@NonNull q2.e eVar, @NonNull q2.d<T> dVar) {
        dVar.a(O(eVar.f72497a, eVar.f72498b));
    }

    @NonNull
    protected abstract List<T> L(@NonNull Cursor cursor);

    @b1({b1.a.LIBRARY})
    public int M() {
        P();
        f2 f2VarD = f2.d(this.f75041i, this.f75040h.a());
        f2VarD.e(this.f75040h);
        Cursor cursorQuery = this.f75043k.query(f2VarD);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery.close();
            f2VarD.release();
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public List<T> O(int i10, int i11) {
        f2 f2VarN = N(i10, i11);
        if (!this.f75045m) {
            Cursor cursorQuery = this.f75043k.query(f2VarN);
            try {
                List<T> listL = L(cursorQuery);
                cursorQuery.close();
                return listL;
            } finally {
                cursorQuery.close();
                f2VarN.release();
            }
        }
        this.f75043k.beginTransaction();
        Cursor cursorQuery2 = null;
        try {
            cursorQuery2 = this.f75043k.query(f2VarN);
            List<T> listL2 = L(cursorQuery2);
            this.f75043k.setTransactionSuccessful();
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            this.f75043k.endTransaction();
            f2VarN.release();
            return listL2;
        } catch (Throwable th2) {
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            this.f75043k.endTransaction();
            f2VarN.release();
            throw th2;
        }
    }

    @Override // androidx.paging.u
    public boolean j() {
        P();
        this.f75043k.getInvalidationTracker().s();
        return super.j();
    }

    protected a(@NonNull b2 b2Var, @NonNull g gVar, boolean z10, boolean z11, @NonNull String... strArr) {
        this(b2Var, f2.f(gVar), z10, z11, strArr);
    }

    protected a(@NonNull b2 b2Var, @NonNull f2 f2Var, boolean z10, @NonNull String... strArr) {
        this(b2Var, f2Var, z10, true, strArr);
    }

    protected a(@NonNull b2 b2Var, @NonNull f2 f2Var, boolean z10, boolean z11, @NonNull String... strArr) {
        this.f75046n = new AtomicBoolean(false);
        this.f75043k = b2Var;
        this.f75040h = f2Var;
        this.f75045m = z10;
        this.f75041i = "SELECT COUNT(*) FROM ( " + f2Var.b() + " )";
        this.f75042j = "SELECT * FROM ( " + f2Var.b() + " ) LIMIT ? OFFSET ?";
        this.f75044l = new C0744a(strArr);
        if (z11) {
            P();
        }
    }
}
