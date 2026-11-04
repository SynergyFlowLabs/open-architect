package org.locationtech.jts.operation.overlay.snap;

import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f338835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338837e;

    public b(v vVar, double d10) {
        this(vVar.d0(), d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.d dVar) {
        double d10 = Double.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < dVar.size() - 1) {
            this.f338835c.f338211a = (org.locationtech.jts.geom.a) dVar.get(i10);
            int i12 = i10 + 1;
            this.f338835c.f338212b = (org.locationtech.jts.geom.a) dVar.get(i12);
            if (!this.f338835c.f338211a.p(aVar) && !this.f338835c.f338212b.p(aVar)) {
                double dO = this.f338835c.o(aVar);
                if (dO < this.f338833a && dO < d10) {
                    i11 = i10;
                    d10 = dO;
                }
            } else if (!this.f338836d) {
                return -1;
            }
            i10 = i12;
        }
        return i11;
    }

    private org.locationtech.jts.geom.a b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length && !aVar.p(aVarArr[i10]); i10++) {
            if (aVar.l(aVarArr[i10]) < this.f338833a) {
                return aVarArr[i10];
            }
        }
        return null;
    }

    private static boolean c(org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length <= 1) {
            return false;
        }
        return aVarArr[0].p(aVarArr[aVarArr.length - 1]);
    }

    private void e(org.locationtech.jts.geom.d dVar, org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length == 0) {
            return;
        }
        int length = aVarArr.length;
        if (aVarArr[0].p(aVarArr[aVarArr.length - 1])) {
            length = aVarArr.length - 1;
        }
        for (int i10 = 0; i10 < length; i10++) {
            org.locationtech.jts.geom.a aVar = aVarArr[i10];
            int iA = a(aVar, dVar);
            if (iA >= 0) {
                dVar.c(iA + 1, new org.locationtech.jts.geom.a(aVar), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(org.locationtech.jts.geom.d dVar, org.locationtech.jts.geom.a[] aVarArr) {
        int size = this.f338837e ? dVar.size() - 1 : dVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.locationtech.jts.geom.a aVarB = b((org.locationtech.jts.geom.a) dVar.get(i10), aVarArr);
            if (aVarB != null) {
                dVar.set(i10, new org.locationtech.jts.geom.a(aVarB));
                if (i10 == 0 && this.f338837e) {
                    dVar.set(dVar.size() - 1, new org.locationtech.jts.geom.a(aVarB));
                }
            }
        }
    }

    public void d(boolean z10) {
        this.f338836d = z10;
    }

    public org.locationtech.jts.geom.a[] f(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d(this.f338834b);
        g(dVar, aVarArr);
        e(dVar, aVarArr);
        return dVar.Uf();
    }

    public b(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        this.f338833a = 0.0d;
        this.f338835c = new u();
        this.f338836d = false;
        this.f338837e = false;
        this.f338834b = aVarArr;
        this.f338837e = c(aVarArr);
        this.f338833a = d10;
    }
}
