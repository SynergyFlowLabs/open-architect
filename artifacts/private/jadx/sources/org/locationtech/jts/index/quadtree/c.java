package org.locationtech.jts.index.quadtree;

import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338428a = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338429b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f338430c = null;

    public c(m mVar) {
        b(mVar);
    }

    private void a(int i10, m mVar) {
        double dH = a.h(i10);
        this.f338428a.f338092a = Math.floor(mVar.L() / dH) * dH;
        this.f338428a.f338093b = Math.floor(mVar.M() / dH) * dH;
        m mVar2 = this.f338430c;
        org.locationtech.jts.geom.a aVar = this.f338428a;
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        mVar2.R(d10, d10 + dH, d11, d11 + dH);
    }

    public static int c(m mVar) {
        double dN = mVar.N();
        double dE = mVar.E();
        if (dN <= dE) {
            dN = dE;
        }
        return a.b(dN) + 1;
    }

    public void b(m mVar) {
        this.f338429b = c(mVar);
        this.f338430c = new m();
        a(this.f338429b, mVar);
        while (!this.f338430c.o(mVar)) {
            int i10 = this.f338429b + 1;
            this.f338429b = i10;
            a(i10, mVar);
        }
    }

    public org.locationtech.jts.geom.a d() {
        return new org.locationtech.jts.geom.a((this.f338430c.L() + this.f338430c.H()) / 2.0d, (this.f338430c.M() + this.f338430c.I()) / 2.0d);
    }

    public m e() {
        return this.f338430c;
    }

    public int f() {
        return this.f338429b;
    }

    public org.locationtech.jts.geom.a g() {
        return this.f338428a;
    }
}
