package org.locationtech.jts.triangulate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f339080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f339081b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.f f339082c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.m f339083d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.m f339084e = null;

    private static org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, org.locationtech.jts.geom.m mVar) {
        org.locationtech.jts.geom.n nVarH = nVar.g0().H(mVar);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarH0 = nVar.h0(i10);
            if (!mVar.o(nVarH0.f0())) {
                if (mVar.c0(nVarH0.f0())) {
                    org.locationtech.jts.geom.n nVarT0 = nVarH.t0(nVarH0);
                    nVarT0.J0(nVarH0.q0());
                    nVarH0 = nVarT0;
                } else {
                    nVarH0 = null;
                }
            }
            if (nVarH0 != null && !nVarH0.v0()) {
                arrayList.add(nVarH0);
            }
        }
        return nVar.g0().e(r.I(arrayList));
    }

    private void b() {
        if (this.f339082c != null) {
            return;
        }
        org.locationtech.jts.geom.m mVarB = g.b(this.f339080a);
        this.f339084e = mVarB;
        this.f339084e.t(Math.max(mVarB.N(), this.f339084e.E()));
        org.locationtech.jts.geom.m mVar = this.f339083d;
        if (mVar != null) {
            this.f339084e.z(mVar);
        }
        List listJ = g.j(this.f339080a);
        org.locationtech.jts.triangulate.quadedge.f fVar = new org.locationtech.jts.triangulate.quadedge.f(mVarB, this.f339081b);
        this.f339082c = fVar;
        new h(fVar).b(listJ);
    }

    public org.locationtech.jts.geom.n c(r rVar) {
        b();
        return a(this.f339082c.s(rVar), this.f339084e);
    }

    public org.locationtech.jts.triangulate.quadedge.f d() {
        b();
        return this.f339082c;
    }

    public void e(org.locationtech.jts.geom.m mVar) {
        this.f339083d = mVar;
    }

    public void f(Collection collection) {
        this.f339080a = g.k(org.locationtech.jts.geom.b.v(collection));
    }

    public void g(org.locationtech.jts.geom.n nVar) {
        this.f339080a = g.c(nVar);
    }

    public void h(double d10) {
        this.f339081b = d10;
    }
}
