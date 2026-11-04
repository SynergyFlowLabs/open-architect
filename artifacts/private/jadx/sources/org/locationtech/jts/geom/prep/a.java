package org.locationtech.jts.geom.prep;

import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.a0;
import org.locationtech.jts.noding.s;

/* JADX INFO: loaded from: classes14.dex */
abstract class a extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f338191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f338194f;

    public a(h hVar) {
        super(hVar);
        this.f338191c = true;
        this.f338192d = false;
        this.f338193e = false;
        this.f338194f = false;
    }

    private void g(n nVar) {
        List listB = a0.b(nVar);
        s sVar = new s();
        sVar.g(true);
        this.f338202a.p().c(listB, sVar);
        this.f338192d = sVar.d();
        this.f338193e = sVar.f();
        this.f338194f = sVar.e();
    }

    private boolean i(n nVar) {
        return (nVar instanceof f0) || j(this.f338202a.j());
    }

    private boolean j(n nVar) {
        if (nVar.l0() == 1 && ((e0) nVar.h0(0)).T0() == 0) {
            return true;
        }
        return false;
    }

    protected boolean f(n nVar) {
        if (!a(nVar)) {
            return false;
        }
        if (this.f338191c && nVar.Rg() == 0) {
            return e(nVar);
        }
        boolean zI = i(nVar);
        g(nVar);
        if (zI && this.f338193e) {
            return false;
        }
        boolean z10 = this.f338192d;
        if (z10 && !this.f338194f) {
            return false;
        }
        if (z10) {
            return h(nVar);
        }
        return ((nVar instanceof f0) && c(nVar, this.f338202a.n())) ? false : true;
    }

    protected abstract boolean h(n nVar);
}
