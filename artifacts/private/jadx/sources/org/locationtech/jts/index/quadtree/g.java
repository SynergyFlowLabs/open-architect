package org.locationtech.jts.index.quadtree;

import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class g extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final org.locationtech.jts.geom.a f338440c = new org.locationtech.jts.geom.a(0.0d, 0.0d);

    private void q(d dVar, m mVar, Object obj) {
        org.locationtech.jts.util.a.c(dVar.t().o(mVar));
        ((b.a(mVar.L(), mVar.H()) || b.a(mVar.M(), mVar.I())) ? dVar.s(mVar) : dVar.u(mVar)).a(obj);
    }

    @Override // org.locationtech.jts.index.quadtree.e
    protected boolean k(m mVar) {
        return true;
    }

    public void p(m mVar, Object obj) {
        org.locationtech.jts.geom.a aVar = f338440c;
        int iG = e.g(mVar, aVar.f338092a, aVar.f338093b);
        if (iG == -1) {
            a(obj);
            return;
        }
        d dVar = this.f338436b[iG];
        if (dVar == null || !dVar.t().o(mVar)) {
            this.f338436b[iG] = d.p(dVar, mVar);
        }
        q(this.f338436b[iG], mVar, obj);
    }
}
