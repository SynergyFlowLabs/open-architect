package om;

import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.h;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f335144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f335145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f335146c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f335147d = 0.0d;

    /* JADX INFO: renamed from: om.a$a, reason: collision with other inner class name */
    public static class C2379a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f335148a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f335149b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f335150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f335151d;

        public C2379a(n nVar, double d10) {
            this.f335151d = 0;
            this.f335150c = nVar;
            this.f335151d = (int) Math.rint(1.0d / d10);
        }

        @Override // org.locationtech.jts.geom.h
        public void a(e eVar, int i10) {
            if (i10 == 0) {
                return;
            }
            org.locationtech.jts.geom.a aVarW4 = eVar.w4(i10 - 1);
            org.locationtech.jts.geom.a aVarW5 = eVar.w4(i10);
            double d10 = aVarW5.f338092a - aVarW4.f338092a;
            int i11 = this.f335151d;
            double d11 = d10 / ((double) i11);
            double d12 = (aVarW5.f338093b - aVarW4.f338093b) / ((double) i11);
            for (int i12 = 0; i12 < this.f335151d; i12++) {
                double d13 = i12;
                org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(aVarW4.f338092a + (d13 * d11), aVarW4.f338093b + (d13 * d12));
                this.f335149b.d();
                om.b.a(this.f335150c, aVar, this.f335149b);
                this.f335148a.g(this.f335149b);
            }
        }

        @Override // org.locationtech.jts.geom.h
        public boolean b() {
            return false;
        }

        public c c() {
            return this.f335148a;
        }

        @Override // org.locationtech.jts.geom.h
        public boolean isDone() {
            return false;
        }
    }

    public static class b implements org.locationtech.jts.geom.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f335152a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f335153b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private om.b f335154c = new om.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n f335155d;

        public b(n nVar) {
            this.f335155d = nVar;
        }

        @Override // org.locationtech.jts.geom.c
        public void a(org.locationtech.jts.geom.a aVar) {
            this.f335153b.d();
            om.b.a(this.f335155d, aVar, this.f335153b);
            this.f335152a.g(this.f335153b);
        }

        public c b() {
            return this.f335152a;
        }
    }

    public a(n nVar, n nVar2) {
        this.f335144a = nVar;
        this.f335145b = nVar2;
    }

    private void a(n nVar, n nVar2) {
        b(nVar, nVar2, this.f335146c);
        b(nVar2, nVar, this.f335146c);
    }

    private void b(n nVar, n nVar2, c cVar) {
        b bVar = new b(nVar2);
        nVar.b(bVar);
        cVar.g(bVar.b());
        double d10 = this.f335147d;
        if (d10 > 0.0d) {
            C2379a c2379a = new C2379a(nVar2, d10);
            nVar.c(c2379a);
            cVar.g(c2379a.c());
        }
    }

    public static double d(n nVar, n nVar2) {
        return new a(nVar, nVar2).c();
    }

    public static double e(n nVar, n nVar2, double d10) {
        a aVar = new a(nVar, nVar2);
        aVar.h(d10);
        return aVar.c();
    }

    public double c() {
        a(this.f335144a, this.f335145b);
        return this.f335146c.c();
    }

    public org.locationtech.jts.geom.a[] f() {
        return this.f335146c.b();
    }

    public double g() {
        b(this.f335144a, this.f335145b, this.f335146c);
        return this.f335146c.c();
    }

    public void h(double d10) {
        if (d10 > 1.0d || d10 <= 0.0d) {
            throw new IllegalArgumentException("Fraction is not in range (0.0 - 1.0]");
        }
        this.f335147d = d10;
    }
}
