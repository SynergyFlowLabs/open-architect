package org.locationtech.jts.precision;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338986c;

    private static class a implements org.locationtech.jts.index.strtree.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f338987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.geom.a[] f338988b;

        private double d(org.locationtech.jts.operation.distance.d dVar, org.locationtech.jts.operation.distance.d dVar2) {
            for (int i10 = 0; i10 < dVar.g(); i10++) {
                for (int i11 = 1; i11 < dVar2.g(); i11++) {
                    org.locationtech.jts.geom.a aVarD = dVar.d(i10);
                    org.locationtech.jts.geom.a aVarD2 = dVar2.d(i11 - 1);
                    org.locationtech.jts.geom.a aVarD3 = dVar2.d(i11);
                    if (!aVarD.p(aVarD2) && !aVarD.p(aVarD3)) {
                        double dB = org.locationtech.jts.algorithm.i.b(aVarD, aVarD2, aVarD3);
                        if (dB < this.f338987a) {
                            this.f338987a = dB;
                            e(aVarD, aVarD2, aVarD3);
                            if (dB == 0.0d) {
                                return dB;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return this.f338987a;
        }

        private void e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
            this.f338988b[0] = aVar;
            this.f338988b[1] = new org.locationtech.jts.geom.a(new u(aVar2, aVar3).l(aVar));
        }

        private double f(org.locationtech.jts.operation.distance.d dVar, org.locationtech.jts.operation.distance.d dVar2) {
            for (int i10 = 0; i10 < dVar.g(); i10++) {
                for (int i11 = 0; i11 < dVar2.g(); i11++) {
                    org.locationtech.jts.geom.a aVarD = dVar.d(i10);
                    org.locationtech.jts.geom.a aVarD2 = dVar2.d(i11);
                    if (!aVarD.p(aVarD2)) {
                        double dL = aVarD.l(aVarD2);
                        if (dL < this.f338987a) {
                            this.f338987a = dL;
                            org.locationtech.jts.geom.a[] aVarArr = this.f338988b;
                            aVarArr[0] = aVarD;
                            aVarArr[1] = aVarD2;
                            if (dL == 0.0d) {
                                return dL;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return this.f338987a;
        }

        @Override // org.locationtech.jts.index.strtree.i
        public double a(org.locationtech.jts.index.strtree.h hVar, org.locationtech.jts.index.strtree.h hVar2) {
            org.locationtech.jts.operation.distance.d dVar = (org.locationtech.jts.operation.distance.d) hVar.a();
            org.locationtech.jts.operation.distance.d dVar2 = (org.locationtech.jts.operation.distance.d) hVar2.a();
            this.f338987a = Double.MAX_VALUE;
            return b(dVar, dVar2);
        }

        public double b(org.locationtech.jts.operation.distance.d dVar, org.locationtech.jts.operation.distance.d dVar2) {
            f(dVar, dVar2);
            if (dVar.g() == 1 && dVar2.g() == 1) {
                return this.f338987a;
            }
            double d10 = this.f338987a;
            if (d10 <= 0.0d) {
                return d10;
            }
            d(dVar, dVar2);
            double d11 = this.f338987a;
            if (d11 <= 0.0d) {
                return d11;
            }
            d(dVar2, dVar);
            return this.f338987a;
        }

        public org.locationtech.jts.geom.a[] c() {
            return this.f338988b;
        }

        private a() {
            this.f338987a = Double.MAX_VALUE;
            this.f338988b = new org.locationtech.jts.geom.a[2];
        }
    }

    public g(n nVar) {
        this.f338984a = nVar;
    }

    private void a() {
        if (this.f338986c != null) {
            return;
        }
        this.f338986c = new org.locationtech.jts.geom.a[2];
        this.f338985b = Double.MAX_VALUE;
        if (this.f338984a.v0()) {
            return;
        }
        Object[] objArrT = org.locationtech.jts.operation.distance.e.c(this.f338984a).T(new a());
        a aVar = new a();
        this.f338985b = aVar.b((org.locationtech.jts.operation.distance.d) objArrT[0], (org.locationtech.jts.operation.distance.d) objArrT[1]);
        this.f338986c = aVar.c();
    }

    public static double c(n nVar) {
        return new g(nVar).b();
    }

    public static n d(n nVar) {
        return new g(nVar).e();
    }

    public double b() {
        a();
        return this.f338985b;
    }

    public v e() {
        a();
        org.locationtech.jts.geom.a[] aVarArr = this.f338986c;
        return (aVarArr == null || aVarArr[0] == null) ? this.f338984a.g0().f() : this.f338984a.g0().h(this.f338986c);
    }
}
