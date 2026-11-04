package org.locationtech.jts.precision;

import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338981b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338982c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338983d = false;

    public f(g0 g0Var) {
        this.f338980a = g0Var;
    }

    private n a(n nVar, g0 g0Var) {
        return b(nVar.g0(), g0Var).a(nVar, new org.locationtech.jts.geom.util.g.d());
    }

    private org.locationtech.jts.geom.util.g b(r rVar, g0 g0Var) {
        return rVar.F() == g0Var ? new org.locationtech.jts.geom.util.g() : new org.locationtech.jts.geom.util.g(c(rVar, g0Var));
    }

    private r c(r rVar, g0 g0Var) {
        return new r(g0Var, rVar.G(), rVar.D());
    }

    private n d(n nVar) {
        n nVarF = (!this.f338982c ? a(nVar, this.f338980a) : nVar).f(0.0d);
        return !this.f338982c ? nVar.g0().c(nVarF) : nVarF;
    }

    public static n f(n nVar, g0 g0Var) {
        return new f(g0Var).e(nVar);
    }

    private n g(n nVar) {
        org.locationtech.jts.geom.util.g gVar = this.f338982c ? new org.locationtech.jts.geom.util.g(c(nVar.g0(), this.f338980a)) : new org.locationtech.jts.geom.util.g();
        boolean z10 = this.f338981b;
        if (nVar.Rg() >= 2) {
            z10 = true;
        }
        return gVar.a(nVar, new i(this.f338980a, z10));
    }

    public static n h(n nVar, g0 g0Var) {
        f fVar = new f(g0Var);
        fVar.j(true);
        return fVar.e(nVar);
    }

    public n e(n nVar) {
        n nVarG = g(nVar);
        if (!this.f338983d && (nVarG instanceof f0)) {
            return nVarG.A0() ? nVarG : d(nVarG);
        }
        return nVarG;
    }

    public void i(boolean z10) {
        this.f338982c = z10;
    }

    public void j(boolean z10) {
        this.f338983d = z10;
    }

    public void k(boolean z10) {
        this.f338981b = z10;
    }
}
