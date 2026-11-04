package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class o extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected f f338366g;

    public o(org.locationtech.jts.geom.a aVar, f fVar) {
        this.f338365f = aVar;
        this.f338366g = fVar;
        this.f338359a = new n(0, -1);
    }

    @Override // org.locationtech.jts.geomgraph.m
    protected void a(org.locationtech.jts.geom.t tVar) {
    }

    @Override // org.locationtech.jts.geomgraph.m
    public org.locationtech.jts.geom.a b() {
        return this.f338365f;
    }

    @Override // org.locationtech.jts.geomgraph.m
    public boolean g() {
        return this.f338359a.c() == 1;
    }

    public void n(e eVar) {
        this.f338366g.j(eVar);
        eVar.w(this);
    }

    int o(n nVar, int i10) {
        int iD = this.f338359a.d(i10);
        if (!nVar.k(i10)) {
            int iD2 = nVar.d(i10);
            if (iD != 1) {
                return iD2;
            }
        }
        return iD;
    }

    public f p() {
        return this.f338366g;
    }

    public boolean q() {
        Iterator it = p().g().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).p().f()) {
                return true;
            }
        }
        return false;
    }

    public void r(n nVar) {
        for (int i10 = 0; i10 < 2; i10++) {
            int iO = o(nVar, i10);
            if (this.f338359a.d(i10) == -1) {
                this.f338359a.p(i10, iO);
            }
        }
    }

    public void s(o oVar) {
        r(oVar.f338359a);
    }

    public void t(PrintStream printStream) {
        printStream.println("node " + this.f338365f + " lbl: " + this.f338359a);
    }

    public void u(int i10, int i11) {
        n nVar = this.f338359a;
        if (nVar == null) {
            this.f338359a = new n(i10, i11);
        } else {
            nVar.p(i10, i11);
        }
    }

    public void v(int i10) {
        n nVar = this.f338359a;
        if (nVar == null) {
            return;
        }
        int iD = nVar != null ? nVar.d(i10) : -1;
        int i11 = 1;
        if (iD != 0 && iD == 1) {
            i11 = 0;
        }
        this.f338359a.p(i10, i11);
    }
}
