package org.locationtech.jts.precision;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338997c;

    private static class a implements org.locationtech.jts.geom.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f338998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.geom.a f338999b;

        public a(l lVar, org.locationtech.jts.geom.a aVar) {
            this.f338998a = lVar;
            this.f338999b = aVar;
        }

        private void c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
            if (this.f338999b.p(aVar) || this.f338999b.p(aVar2)) {
                return;
            }
            double dB = org.locationtech.jts.algorithm.i.b(this.f338999b, aVar2, aVar);
            if (dB > 0.0d) {
                this.f338998a.j(dB, this.f338999b, aVar2, aVar);
            }
        }

        private void d(org.locationtech.jts.geom.a aVar) {
            double dL = aVar.l(this.f338999b);
            if (dL > 0.0d) {
                this.f338998a.i(dL, this.f338999b, aVar);
            }
        }

        @Override // org.locationtech.jts.geom.h
        public void a(org.locationtech.jts.geom.e eVar, int i10) {
            d(eVar.w4(i10));
            if (i10 > 0) {
                c(eVar.w4(i10 - 1), eVar.w4(i10));
            }
        }

        @Override // org.locationtech.jts.geom.h
        public boolean b() {
            return false;
        }

        @Override // org.locationtech.jts.geom.h
        public boolean isDone() {
            return false;
        }
    }

    private static class b implements org.locationtech.jts.geom.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f339000a;

        public b(l lVar) {
            this.f339000a = lVar;
        }

        @Override // org.locationtech.jts.geom.c
        public void a(org.locationtech.jts.geom.a aVar) {
            this.f339000a.f338995a.c(new a(this.f339000a, aVar));
        }
    }

    public l(n nVar) {
        this.f338995a = nVar;
    }

    private void d() {
        if (this.f338997c != null) {
            return;
        }
        this.f338997c = new org.locationtech.jts.geom.a[2];
        this.f338996b = Double.MAX_VALUE;
        this.f338995a.b(new b(this));
    }

    public static double f(n nVar) {
        return new l(nVar).e();
    }

    public static n g(n nVar) {
        return new l(nVar).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(double d10, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (d10 < this.f338996b) {
            this.f338996b = d10;
            this.f338997c[0] = new org.locationtech.jts.geom.a(aVar);
            this.f338997c[1] = new org.locationtech.jts.geom.a(aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(double d10, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        if (d10 < this.f338996b) {
            this.f338996b = d10;
            this.f338997c[0] = new org.locationtech.jts.geom.a(aVar);
            this.f338997c[1] = new org.locationtech.jts.geom.a(new u(aVar2, aVar3).l(aVar));
        }
    }

    public double e() {
        d();
        return this.f338996b;
    }

    public v h() {
        d();
        return this.f338995a.g0().h(this.f338997c);
    }
}
