package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338547a;

    public j(n nVar) {
        this.f338547a = nVar;
        a();
    }

    private void a() {
        n nVar = this.f338547a;
        if (!(nVar instanceof v) && !(nVar instanceof z)) {
            throw new IllegalArgumentException("Input geometry must be linear");
        }
    }

    public g b(g gVar) {
        g gVarK = gVar.k();
        gVarK.b(this.f338547a);
        return gVarK;
    }

    public n c(g gVar, g gVar2) {
        return a.c(this.f338547a, gVar, gVar2);
    }

    public org.locationtech.jts.geom.a d(g gVar) {
        return gVar.n(this.f338547a);
    }

    public org.locationtech.jts.geom.a e(g gVar, double d10) {
        g gVarI = gVar.I(this.f338547a);
        return gVarI.p(this.f338547a).T(gVarI.q(), d10);
    }

    public g f() {
        return g.o(this.f338547a);
    }

    public g g() {
        return new g();
    }

    public g h(org.locationtech.jts.geom.a aVar) {
        return i.b(this.f338547a, aVar);
    }

    public g i(org.locationtech.jts.geom.a aVar, g gVar) {
        return i.d(this.f338547a, aVar, gVar);
    }

    public g[] j(n nVar) {
        return h.b(this.f338547a, nVar);
    }

    public boolean k(g gVar) {
        return gVar.w(this.f338547a);
    }

    public g l(org.locationtech.jts.geom.a aVar) {
        return i.b(this.f338547a, aVar);
    }
}
