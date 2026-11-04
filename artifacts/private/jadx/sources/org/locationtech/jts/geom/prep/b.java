package org.locationtech.jts.geom.prep;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f338195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f338196b;

    public b(n nVar) {
        this.f338195a = nVar;
        this.f338196b = org.locationtech.jts.geom.util.d.b(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean a(n nVar) {
        return this.f338195a.M0(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean b(n nVar) {
        return this.f338195a.t(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean c(n nVar) {
        return this.f338195a.x(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean d(n nVar) {
        return this.f338195a.z(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean e(n nVar) {
        return this.f338195a.P0(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean f(n nVar) {
        return this.f338195a.u0(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean g(n nVar) {
        return this.f338195a.E0(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean h(n nVar) {
        return this.f338195a.E(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean i(n nVar) {
        return !f(nVar);
    }

    @Override // org.locationtech.jts.geom.prep.c
    public n j() {
        return this.f338195a;
    }

    @Override // org.locationtech.jts.geom.prep.c
    public boolean k(n nVar) {
        if (this.f338195a.f0().o(nVar.f0())) {
            return this.f338195a.G0(nVar, "T**FF*FF*");
        }
        return false;
    }

    protected boolean l(n nVar) {
        return this.f338195a.f0().r(nVar.f0());
    }

    protected boolean m(n nVar) {
        return this.f338195a.f0().c0(nVar.f0());
    }

    public List n() {
        return this.f338196b;
    }

    public boolean o(n nVar) {
        u uVar = new u();
        Iterator it = this.f338196b.iterator();
        while (it.hasNext()) {
            if (uVar.b((org.locationtech.jts.geom.a) it.next(), nVar)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f338195a.toString();
    }
}
