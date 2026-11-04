package org.locationtech.jts.geom.prep;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
class k extends a {
    public k(h hVar) {
        super(hVar);
        this.f338191c = false;
    }

    public static boolean l(h hVar, n nVar) {
        return new k(hVar).k(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.a
    protected boolean h(n nVar) {
        return this.f338202a.j().z(nVar);
    }

    public boolean k(n nVar) {
        return f(nVar);
    }
}
