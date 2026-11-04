package org.locationtech.jts.precision;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f338975b = new a();

    static class a implements org.locationtech.jts.geom.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.precision.a f338976a = new org.locationtech.jts.precision.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.precision.a f338977b = new org.locationtech.jts.precision.a();

        a() {
        }

        @Override // org.locationtech.jts.geom.c
        public void a(org.locationtech.jts.geom.a aVar) {
            this.f338976a.a(aVar.f338092a);
            this.f338977b.a(aVar.f338093b);
        }

        public org.locationtech.jts.geom.a b() {
            return new org.locationtech.jts.geom.a(this.f338976a.c(), this.f338977b.c());
        }
    }

    static class b implements org.locationtech.jts.geom.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.locationtech.jts.geom.a f338978a;

        public b(org.locationtech.jts.geom.a aVar) {
            this.f338978a = aVar;
        }

        @Override // org.locationtech.jts.geom.h
        public void a(org.locationtech.jts.geom.e eVar, int i10) {
            double dIj = eVar.ij(i10, 0) + this.f338978a.f338092a;
            double dIj2 = eVar.ij(i10, 1) + this.f338978a.f338093b;
            eVar.Ld(i10, 0, dIj);
            eVar.Ld(i10, 1, dIj2);
        }

        @Override // org.locationtech.jts.geom.h
        public boolean b() {
            return true;
        }

        @Override // org.locationtech.jts.geom.h
        public boolean isDone() {
            return false;
        }
    }

    public void a(n nVar) {
        nVar.b(this.f338975b);
        this.f338974a = this.f338975b.b();
    }

    public void b(n nVar) {
        nVar.c(new b(this.f338974a));
        nVar.V();
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338974a;
    }

    public n d(n nVar) {
        org.locationtech.jts.geom.a aVar = this.f338974a;
        if (aVar.f338092a == 0.0d && aVar.f338093b == 0.0d) {
            return nVar;
        }
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(aVar);
        aVar2.f338092a = -aVar2.f338092a;
        aVar2.f338093b = -aVar2.f338093b;
        nVar.c(new b(aVar2));
        nVar.V();
        return nVar;
    }
}
