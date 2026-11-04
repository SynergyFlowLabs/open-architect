package org.locationtech.jts.operation.predicate;

import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.p;

/* JADX INFO: loaded from: classes14.dex */
class a extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f338889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338890c = false;

    public a(m mVar) {
        this.f338889b = mVar;
    }

    @Override // org.locationtech.jts.geom.util.p
    protected boolean b() {
        return this.f338890c;
    }

    @Override // org.locationtech.jts.geom.util.p
    protected void c(n nVar) {
        m mVarF0 = nVar.f0();
        if (this.f338889b.c0(mVarF0)) {
            if (this.f338889b.o(mVarF0)) {
                this.f338890c = true;
                return;
            }
            if (mVarF0.L() >= this.f338889b.L() && mVarF0.H() <= this.f338889b.H()) {
                this.f338890c = true;
            } else {
                if (mVarF0.M() < this.f338889b.M() || mVarF0.I() > this.f338889b.I()) {
                    return;
                }
                this.f338890c = true;
            }
        }
    }

    public boolean d() {
        return this.f338890c;
    }
}
