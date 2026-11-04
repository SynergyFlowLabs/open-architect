package org.locationtech.jts.simplify;

import org.locationtech.jts.geom.j0;

/* JADX INFO: loaded from: classes14.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f339033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f339034b;

    static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static double f339035f = Double.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.geom.a f339036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f339037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f339038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f339039d = f339035f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f339040e = true;

        public a(org.locationtech.jts.geom.a aVar) {
            int i10 = 0 >> 1;
            this.f339036a = aVar;
        }

        public static a b(org.locationtech.jts.geom.a[] aVarArr) {
            a aVar = null;
            int i10 = 0;
            a aVar2 = null;
            while (i10 < aVarArr.length) {
                a aVar3 = new a(aVarArr[i10]);
                if (aVar == null) {
                    aVar = aVar3;
                }
                aVar3.h(aVar2);
                if (aVar2 != null) {
                    aVar2.g(aVar3);
                    aVar2.i();
                }
                i10++;
                aVar2 = aVar3;
            }
            return aVar;
        }

        public double c() {
            return this.f339039d;
        }

        public org.locationtech.jts.geom.a[] d() {
            org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
            do {
                dVar.i(this.f339036a, false);
                this = this.f339038c;
            } while (this != null);
            return dVar.Uf();
        }

        public boolean e() {
            return this.f339040e;
        }

        public a f() {
            a aVar;
            a aVar2 = this.f339037b;
            a aVar3 = this.f339038c;
            if (aVar2 != null) {
                aVar2.g(aVar3);
                this.f339037b.i();
                aVar = this.f339037b;
            } else {
                aVar = null;
            }
            a aVar4 = this.f339038c;
            if (aVar4 != null) {
                aVar4.h(aVar2);
                this.f339038c.i();
                if (aVar == null) {
                    aVar = this.f339038c;
                }
            }
            this.f339040e = false;
            return aVar;
        }

        public void g(a aVar) {
            this.f339038c = aVar;
        }

        public void h(a aVar) {
            this.f339037b = aVar;
        }

        public void i() {
            a aVar;
            a aVar2 = this.f339037b;
            if (aVar2 == null || (aVar = this.f339038c) == null) {
                this.f339039d = f339035f;
            } else {
                this.f339039d = Math.abs(j0.c(aVar2.f339036a, this.f339036a, aVar.f339036a));
            }
        }
    }

    public j(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        this.f339033a = aVarArr;
        this.f339034b = d10 * d10;
    }

    public static org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        return new j(aVarArr, d10).a();
    }

    private double c(a aVar) {
        double dC = aVar.c();
        a aVar2 = null;
        for (a aVar3 = aVar; aVar3 != null; aVar3 = aVar3.f339038c) {
            double dC2 = aVar3.c();
            if (dC2 < dC) {
                aVar2 = aVar3;
                dC = dC2;
            }
        }
        if (aVar2 != null && dC < this.f339034b) {
            aVar2.f();
        }
        if (aVar.e()) {
            return dC;
        }
        return -1.0d;
    }

    public org.locationtech.jts.geom.a[] a() {
        a aVarB = a.b(this.f339033a);
        while (c(aVarB) < this.f339034b) {
        }
        org.locationtech.jts.geom.a[] aVarArrD = aVarB.d();
        if (aVarArrD.length >= 2) {
            return aVarArrD;
        }
        org.locationtech.jts.geom.a aVar = aVarArrD[0];
        return new org.locationtech.jts.geom.a[]{aVar, new org.locationtech.jts.geom.a(aVar)};
    }
}
