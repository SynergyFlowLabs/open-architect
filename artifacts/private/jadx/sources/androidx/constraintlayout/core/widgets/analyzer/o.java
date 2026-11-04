package androidx.constraintlayout.core.widgets.analyzer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f44600g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f44601h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f44603b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f44605d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<androidx.constraintlayout.core.widgets.e> f44602a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f44604c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f44606e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44607f = -1;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<androidx.constraintlayout.core.widgets.e> f44608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f44609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f44610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f44611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f44613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44614g;

        a(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.e eVar2, int i10) {
            this.f44608a = new WeakReference<>(eVar);
            this.f44609b = eVar2.M(eVar.Q);
            this.f44610c = eVar2.M(eVar.R);
            this.f44611d = eVar2.M(eVar.S);
            this.f44612e = eVar2.M(eVar.T);
            this.f44613f = eVar2.M(eVar.U);
            this.f44614g = i10;
        }

        public void a() {
            androidx.constraintlayout.core.widgets.e eVar = this.f44608a.get();
            if (eVar != null) {
                eVar.q1(this.f44609b, this.f44610c, this.f44611d, this.f44612e, this.f44613f, this.f44614g);
            }
        }
    }

    public o(int i10) {
        int i11 = f44601h;
        f44601h = i11 + 1;
        this.f44603b = i11;
        this.f44605d = i10;
    }

    private boolean e(androidx.constraintlayout.core.widgets.e eVar) {
        return this.f44602a.contains(eVar);
    }

    private String h() {
        int i10 = this.f44605d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : com.facebook.internal.a.f99697t;
    }

    private int k(int i10, androidx.constraintlayout.core.widgets.e eVar) {
        androidx.constraintlayout.core.widgets.e.b bVarZ = eVar.z(i10);
        if (bVarZ != androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT && bVarZ != androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT && bVarZ != androidx.constraintlayout.core.widgets.e.b.FIXED) {
            return -1;
        }
        return i10 == 0 ? eVar.m0() : eVar.D();
    }

    private int q(androidx.constraintlayout.core.e eVar, ArrayList<androidx.constraintlayout.core.widgets.e> arrayList, int i10) {
        int iM;
        int iM2;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) arrayList.get(0).U();
        eVar.W();
        fVar.g(eVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(eVar, false);
        }
        if (i10 == 0 && fVar.N1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar, eVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.O1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar, eVar, arrayList, 1);
        }
        try {
            eVar.R();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f44606e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f44606e.add(new a(arrayList.get(i12), eVar, i10));
        }
        if (i10 == 0) {
            iM = eVar.M(fVar.Q);
            iM2 = eVar.M(fVar.S);
            eVar.W();
        } else {
            iM = eVar.M(fVar.R);
            iM2 = eVar.M(fVar.T);
            eVar.W();
        }
        return iM2 - iM;
    }

    public boolean a(androidx.constraintlayout.core.widgets.e eVar) {
        if (this.f44602a.contains(eVar)) {
            return false;
        }
        this.f44602a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f44606e != null && this.f44604c) {
            for (int i10 = 0; i10 < this.f44606e.size(); i10++) {
                this.f44606e.get(i10).a();
            }
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f44602a.size();
        if (this.f44607f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f44607f == oVar.f44603b) {
                    m(this.f44605d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f44602a.clear();
    }

    public int f() {
        return this.f44603b;
    }

    public int g() {
        return this.f44605d;
    }

    public boolean i(o oVar) {
        for (int i10 = 0; i10 < this.f44602a.size(); i10++) {
            if (oVar.e(this.f44602a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f44604c;
    }

    public int l(androidx.constraintlayout.core.e eVar, int i10) {
        if (this.f44602a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f44602a, i10);
    }

    public void m(int i10, o oVar) {
        for (androidx.constraintlayout.core.widgets.e eVar : this.f44602a) {
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.S0 = oVar.f();
            } else {
                eVar.T0 = oVar.f();
            }
        }
        this.f44607f = oVar.f44603b;
    }

    public void n(boolean z10) {
        this.f44604c = z10;
    }

    public void o(int i10) {
        this.f44605d = i10;
    }

    public int p() {
        return this.f44602a.size();
    }

    public String toString() {
        String str = h() + " [" + this.f44603b + "] <";
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f44602a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}
