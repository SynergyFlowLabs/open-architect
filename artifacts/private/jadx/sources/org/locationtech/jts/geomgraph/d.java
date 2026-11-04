package org.locationtech.jts.geomgraph;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public class d extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    org.locationtech.jts.geom.a[] f338278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geom.m f338279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    h f338280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f338281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.index.c f338282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f338283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f338284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f338285m;

    public d(org.locationtech.jts.geom.a[] aVarArr, n nVar) {
        this.f338280h = new h(this);
        this.f338283k = true;
        this.f338284l = new a();
        this.f338285m = 0;
        this.f338278f = aVarArr;
        this.f338359a = nVar;
    }

    public static void H(n nVar, org.locationtech.jts.geom.t tVar) {
        tVar.w(nVar.e(0, 0), nVar.e(1, 0), 1);
        if (nVar.g()) {
            tVar.w(nVar.e(0, 1), nVar.e(1, 1), 2);
            tVar.w(nVar.e(0, 2), nVar.e(1, 2), 2);
        }
    }

    public boolean A() {
        if (!this.f338359a.g()) {
            return false;
        }
        Object[] objArr = this.f338278f;
        return objArr.length == 3 && objArr[0].equals(objArr[2]);
    }

    public boolean B(d dVar) {
        if (this.f338278f.length != dVar.f338278f.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
            if (i10 >= aVarArr.length) {
                return true;
            }
            if (!aVarArr[i10].p(dVar.f338278f[i10])) {
                return false;
            }
            i10++;
        }
    }

    public void C(PrintStream printStream) {
        printStream.print("edge " + this.f338281i + ": ");
        printStream.print("LINESTRING (");
        for (int i10 = 0; i10 < this.f338278f.length; i10++) {
            if (i10 > 0) {
                printStream.print(",");
            }
            printStream.print(this.f338278f[i10].f338092a + " " + this.f338278f[i10].f338093b);
        }
        printStream.print(")  " + this.f338359a + " " + this.f338285m);
    }

    public void D(PrintStream printStream) {
        printStream.print("edge " + this.f338281i + ": ");
        for (int length = this.f338278f.length + (-1); length >= 0; length += -1) {
            printStream.print(this.f338278f[length] + " ");
        }
        printStream.println("");
    }

    public void E(int i10) {
        this.f338285m = i10;
    }

    public void F(boolean z10) {
        this.f338283k = z10;
    }

    public void G(String str) {
        this.f338281i = str;
    }

    @Override // org.locationtech.jts.geomgraph.m
    public void a(org.locationtech.jts.geom.t tVar) {
        H(this.f338359a, tVar);
    }

    @Override // org.locationtech.jts.geomgraph.m
    public org.locationtech.jts.geom.a b() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
        if (aVarArr.length > 0) {
            return aVarArr[0];
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
        if (aVarArr.length != dVar.f338278f.length) {
            return false;
        }
        int length = aVarArr.length;
        int i10 = 0;
        boolean z10 = true;
        boolean z11 = true;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr2 = this.f338278f;
            if (i10 >= aVarArr2.length) {
                return true;
            }
            if (!aVarArr2[i10].p(dVar.f338278f[i10])) {
                z10 = false;
            }
            length--;
            if (!this.f338278f[i10].p(dVar.f338278f[length])) {
                z11 = false;
            }
            if (!z10 && !z11) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geomgraph.m
    public boolean g() {
        return this.f338283k;
    }

    public void n(org.locationtech.jts.algorithm.o oVar, int i10, int i11, int i12) {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(oVar.j(i12));
        double dG = oVar.g(i11, i12);
        int i13 = i10 + 1;
        org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
        if (i13 < aVarArr.length && aVar.p(aVarArr[i13])) {
            dG = 0.0d;
            i10 = i13;
        }
        this.f338280h.a(aVar, i10, dG);
    }

    public void o(org.locationtech.jts.algorithm.o oVar, int i10, int i11) {
        for (int i12 = 0; i12 < oVar.l(); i12++) {
            n(oVar, i10, i11, i12);
        }
    }

    public d p() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
        return new d(new org.locationtech.jts.geom.a[]{aVarArr[0], aVarArr[1]}, n.s(this.f338359a));
    }

    public org.locationtech.jts.geom.a q(int i10) {
        return this.f338278f[i10];
    }

    public org.locationtech.jts.geom.a[] r() {
        return this.f338278f;
    }

    public a s() {
        return this.f338284l;
    }

    public int t() {
        return this.f338285m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("edge " + this.f338281i + ": ");
        sb2.append("LINESTRING (");
        for (int i10 = 0; i10 < this.f338278f.length; i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(this.f338278f[i10].f338092a + " " + this.f338278f[i10].f338093b);
        }
        sb2.append(")  " + this.f338359a + " " + this.f338285m);
        return sb2.toString();
    }

    public h u() {
        return this.f338280h;
    }

    public org.locationtech.jts.geom.m v() {
        if (this.f338279g == null) {
            this.f338279g = new org.locationtech.jts.geom.m();
            int i10 = 0;
            while (true) {
                org.locationtech.jts.geom.a[] aVarArr = this.f338278f;
                if (i10 >= aVarArr.length) {
                    break;
                }
                this.f338279g.x(aVarArr[i10]);
                i10++;
            }
        }
        return this.f338279g;
    }

    public int w() {
        return this.f338278f.length - 1;
    }

    public org.locationtech.jts.geomgraph.index.c x() {
        if (this.f338282j == null) {
            this.f338282j = new org.locationtech.jts.geomgraph.index.c(this);
        }
        return this.f338282j;
    }

    public int y() {
        return this.f338278f.length;
    }

    public boolean z() {
        Object[] objArr = this.f338278f;
        return objArr[0].equals(objArr[objArr.length - 1]);
    }

    public d(org.locationtech.jts.geom.a[] aVarArr) {
        this(aVarArr, null);
    }
}
