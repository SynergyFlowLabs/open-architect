package org.locationtech.jts.index.bintree;

/* JADX INFO: loaded from: classes14.dex */
public class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f338392c = 0.0d;

    private void o(d dVar, b bVar, Object obj) {
        org.locationtech.jts.util.a.c(dVar.r().c(bVar));
        (org.locationtech.jts.index.quadtree.b.a(bVar.f(), bVar.e()) ? dVar.q(bVar) : dVar.s(bVar)).a(obj);
    }

    @Override // org.locationtech.jts.index.bintree.e
    protected boolean j(b bVar) {
        return true;
    }

    public void n(b bVar, Object obj) {
        int iF = e.f(bVar, 0.0d);
        if (iF == -1) {
            a(obj);
            return;
        }
        d dVar = this.f338391b[iF];
        if (dVar == null || !dVar.r().c(bVar)) {
            this.f338391b[iF] = d.n(dVar, bVar);
        }
        o(this.f338391b[iF], bVar, obj);
    }
}
