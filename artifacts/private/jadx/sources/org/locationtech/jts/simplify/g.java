package org.locationtech.jts.simplify;

import java.util.Iterator;
import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f339019a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f339020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f339021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f339022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f339023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f339024f;

    public g(c cVar, c cVar2) {
        this.f339020b = new c();
        new c();
        this.f339024f = 0.0d;
        this.f339020b = cVar;
        this.f339021c = cVar2;
    }

    private int a(org.locationtech.jts.geom.a[] aVarArr, int i10, int i11, double[] dArr) {
        u uVar = new u();
        uVar.f338211a = aVarArr[i10];
        uVar.f338212b = aVarArr[i11];
        double d10 = -1.0d;
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            double dO = uVar.o(aVarArr[i12]);
            if (dO > d10) {
                i10 = i12;
                d10 = dO;
            }
        }
        dArr[0] = d10;
        return i10;
    }

    private u b(int i10, int i11) {
        org.locationtech.jts.geom.a[] aVarArr = this.f339023e;
        u uVar = new u(aVarArr[i10], aVarArr[i11]);
        h(this.f339022d, i10, i11);
        this.f339021c.a(uVar);
        return uVar;
    }

    private boolean c(f fVar, int[] iArr, u uVar) {
        for (e eVar : this.f339020b.c(uVar)) {
            if (f(eVar, uVar) && !g(fVar, iArr, eVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean d(f fVar, int[] iArr, u uVar) {
        return e(uVar) || c(fVar, iArr, uVar);
    }

    private boolean e(u uVar) {
        Iterator it = this.f339021c.c(uVar).iterator();
        while (it.hasNext()) {
            if (f((u) it.next(), uVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(u uVar, u uVar2) {
        this.f339019a.f(uVar.f338211a, uVar.f338212b, uVar2.f338211a, uVar2.f338212b);
        return this.f339019a.q();
    }

    private static boolean g(f fVar, int[] iArr, e eVar) {
        int iD0;
        return eVar.e0() == fVar.f() && (iD0 = eVar.d0()) >= iArr[0] && iD0 < iArr[1];
    }

    private void h(f fVar, int i10, int i11) {
        while (i10 < i11) {
            this.f339020b.d(fVar.j(i10));
            i10++;
        }
    }

    private void k(int i10, int i11, int i12) {
        int i13 = i12 + 1;
        if (i10 + 1 == i11) {
            this.f339022d.a(this.f339022d.j(i10));
            return;
        }
        boolean z10 = this.f339022d.i() >= this.f339022d.e() || i12 + 2 >= this.f339022d.e();
        double[] dArr = new double[1];
        int iA = a(this.f339023e, i10, i11, dArr);
        if (dArr[0] > this.f339024f) {
            z10 = false;
        }
        u uVar = new u();
        org.locationtech.jts.geom.a[] aVarArr = this.f339023e;
        uVar.f338211a = aVarArr[i10];
        uVar.f338212b = aVarArr[i11];
        if (d(this.f339022d, new int[]{i10, i11}, uVar) ? false : z10) {
            this.f339022d.a(b(i10, i11));
        } else {
            k(i10, iA, i13);
            k(iA, i11, i13);
        }
    }

    public void i(double d10) {
        this.f339024f = d10;
    }

    void j(f fVar) {
        this.f339022d = fVar;
        org.locationtech.jts.geom.a[] aVarArrG = fVar.g();
        this.f339023e = aVarArrG;
        k(0, aVarArrG.length - 1, 0);
    }
}
