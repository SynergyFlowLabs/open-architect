package org.locationtech.jts.geomgraph;

/* JADX INFO: loaded from: classes14.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    u[] f338364a;

    public n(int i10) {
        u[] uVarArr = new u[2];
        this.f338364a = uVarArr;
        uVarArr[0] = new u(i10);
        this.f338364a[1] = new u(i10);
    }

    public static n s(n nVar) {
        n nVar2 = new n(-1);
        for (int i10 = 0; i10 < 2; i10++) {
            nVar2.p(i10, nVar.d(i10));
        }
        return nVar2;
    }

    public boolean a(int i10, int i11) {
        return this.f338364a[i10].a(i11);
    }

    public void b() {
        this.f338364a[0].b();
        this.f338364a[1].b();
    }

    public int c() {
        int i10 = !this.f338364a[0].j() ? 1 : 0;
        return !this.f338364a[1].j() ? i10 + 1 : i10;
    }

    public int d(int i10) {
        return this.f338364a[i10].c(0);
    }

    public int e(int i10, int i11) {
        return this.f338364a[i10].c(i11);
    }

    public boolean f(int i10) {
        return this.f338364a[i10].f();
    }

    public boolean g() {
        return this.f338364a[0].g() || this.f338364a[1].g();
    }

    public boolean h(int i10) {
        return this.f338364a[i10].g();
    }

    public boolean i(n nVar, int i10) {
        return this.f338364a[0].h(nVar.f338364a[0], i10) && this.f338364a[1].h(nVar.f338364a[1], i10);
    }

    public boolean j(int i10) {
        return this.f338364a[i10].i();
    }

    public boolean k(int i10) {
        return this.f338364a[i10].j();
    }

    public void l(n nVar) {
        u uVar;
        for (int i10 = 0; i10 < 2; i10++) {
            u[] uVarArr = this.f338364a;
            u uVar2 = uVarArr[i10];
            if (uVar2 != null || (uVar = nVar.f338364a[i10]) == null) {
                uVar2.k(nVar.f338364a[i10]);
            } else {
                uVarArr[i10] = new u(uVar);
            }
        }
    }

    public void m(int i10, int i11) {
        this.f338364a[i10].l(i11);
    }

    public void n(int i10) {
        o(0, i10);
        o(1, i10);
    }

    public void o(int i10, int i11) {
        this.f338364a[i10].m(i11);
    }

    public void p(int i10, int i11) {
        this.f338364a[i10].o(0, i11);
    }

    public void q(int i10, int i11, int i12) {
        this.f338364a[i10].o(i11, i12);
    }

    public void r(int i10) {
        if (this.f338364a[i10].g()) {
            u[] uVarArr = this.f338364a;
            uVarArr[i10] = new u(uVarArr[i10].f338379a[0]);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f338364a[0] != null) {
            stringBuffer.append("A:");
            stringBuffer.append(this.f338364a[0].toString());
        }
        if (this.f338364a[1] != null) {
            stringBuffer.append(" B:");
            stringBuffer.append(this.f338364a[1].toString());
        }
        return stringBuffer.toString();
    }

    public n(int i10, int i11) {
        u[] uVarArr = new u[2];
        this.f338364a = uVarArr;
        int i12 = 2 | 0;
        uVarArr[0] = new u(-1);
        this.f338364a[1] = new u(-1);
        this.f338364a[i10].n(i11);
    }

    public n(int i10, int i11, int i12) {
        u[] uVarArr = new u[2];
        this.f338364a = uVarArr;
        uVarArr[0] = new u(i10, i11, i12);
        this.f338364a[1] = new u(i10, i11, i12);
    }

    public n(int i10, int i11, int i12, int i13) {
        u[] uVarArr = new u[2];
        this.f338364a = uVarArr;
        uVarArr[0] = new u(-1, -1, -1);
        this.f338364a[1] = new u(-1, -1, -1);
        this.f338364a[i10].p(i11, i12, i13);
    }

    public n(n nVar) {
        int i10 = 3 >> 2;
        u[] uVarArr = new u[2];
        this.f338364a = uVarArr;
        uVarArr[0] = new u(nVar.f338364a[0]);
        this.f338364a[1] = new u(nVar.f338364a[1]);
    }
}
