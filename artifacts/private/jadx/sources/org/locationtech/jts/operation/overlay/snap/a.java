package org.locationtech.jts.operation.overlay.snap;

import java.util.TreeSet;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f338831b = 1.0E-9d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338832a;

    public a(n nVar) {
        this.f338832a = nVar;
    }

    private double a(org.locationtech.jts.geom.a[] aVarArr) {
        double d10 = Double.MAX_VALUE;
        int i10 = 0;
        while (i10 < aVarArr.length - 1) {
            org.locationtech.jts.geom.a aVar = aVarArr[i10];
            i10++;
            double dL = aVar.l(aVarArr[i10]);
            if (dL < d10) {
                d10 = dL;
            }
        }
        return d10;
    }

    public static double b(n nVar) {
        double d10 = d(nVar);
        g0 g0VarN0 = nVar.n0();
        if (g0VarN0.p() == g0.f338117d) {
            double dO = ((1.0d / g0VarN0.o()) * 2.0d) / 1.415d;
            if (dO > d10) {
                return dO;
            }
        }
        return d10;
    }

    public static double c(n nVar, n nVar2) {
        return Math.min(b(nVar), b(nVar2));
    }

    public static double d(n nVar) {
        m mVarF0 = nVar.f0();
        return Math.min(mVarF0.E(), mVarF0.N()) * f338831b;
    }

    private double e(org.locationtech.jts.geom.a[] aVarArr) {
        return a(aVarArr) / 10.0d;
    }

    private org.locationtech.jts.geom.a[] f(n nVar) {
        TreeSet treeSet = new TreeSet();
        for (org.locationtech.jts.geom.a aVar : nVar.d0()) {
            treeSet.add(aVar);
        }
        return (org.locationtech.jts.geom.a[]) treeSet.toArray(new org.locationtech.jts.geom.a[0]);
    }

    public static n[] g(n nVar, n nVar2, double d10) {
        n[] nVarArr = new n[2];
        nVarArr[0] = new a(nVar).h(nVar2, d10);
        nVarArr[1] = new a(nVar2).h(nVarArr[0], d10);
        return nVarArr;
    }

    public static n j(n nVar, double d10, boolean z10) {
        return new a(nVar).i(d10, z10);
    }

    public n h(n nVar, double d10) {
        return new e(d10, f(nVar)).d(this.f338832a);
    }

    public n i(double d10, boolean z10) {
        n nVarD = new e(d10, f(this.f338832a), true).d(this.f338832a);
        if (z10 && (nVarD instanceof f0)) {
            nVarD = nVarD.f(0.0d);
        }
        return nVarD;
    }
}
