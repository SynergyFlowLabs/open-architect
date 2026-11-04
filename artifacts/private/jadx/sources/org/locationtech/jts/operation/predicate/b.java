package org.locationtech.jts.operation.predicate;

import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.p;

/* JADX INFO: loaded from: classes14.dex */
class b extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.e f338891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f338892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338893d = false;

    public b(e0 e0Var) {
        this.f338891b = e0Var.R0().S0();
        this.f338892c = e0Var.f0();
    }

    @Override // org.locationtech.jts.geom.util.p
    protected boolean b() {
        return this.f338893d;
    }

    @Override // org.locationtech.jts.geom.util.p
    protected void c(n nVar) {
        if (nVar instanceof e0) {
            m mVarF0 = nVar.f0();
            if (this.f338892c.c0(mVarF0)) {
                org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
                for (int i10 = 0; i10 < 4; i10++) {
                    this.f338891b.Ob(i10, aVar);
                    if (mVarF0.n(aVar) && org.locationtech.jts.algorithm.locate.c.b(aVar, (e0) nVar)) {
                        this.f338893d = true;
                        return;
                    }
                }
            }
        }
    }

    public boolean d() {
        return this.f338893d;
    }
}
