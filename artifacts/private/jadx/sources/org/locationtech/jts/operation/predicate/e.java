package org.locationtech.jts.operation.predicate;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.w;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.l;
import org.locationtech.jts.geom.util.p;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
class e extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f338897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f338898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338899d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338900e = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338901f = new org.locationtech.jts.geom.a();

    public e(e0 e0Var) {
        m mVarF0 = e0Var.f0();
        this.f338897b = mVarF0;
        this.f338898c = new w(mVarF0);
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((v) it.next());
            if (this.f338899d) {
                return;
            }
        }
    }

    private void e(v vVar) {
        org.locationtech.jts.geom.e eVarS0 = vVar.S0();
        for (int i10 = 1; i10 < eVarS0.size(); i10++) {
            eVarS0.Ob(i10 - 1, this.f338900e);
            eVarS0.Ob(i10, this.f338901f);
            if (this.f338898c.a(this.f338900e, this.f338901f)) {
                this.f338899d = true;
                return;
            }
        }
    }

    @Override // org.locationtech.jts.geom.util.p
    protected boolean b() {
        return this.f338899d;
    }

    @Override // org.locationtech.jts.geom.util.p
    protected void c(n nVar) {
        if (this.f338897b.c0(nVar.f0())) {
            d(l.h(nVar));
        }
    }

    public boolean f() {
        return this.f338899d;
    }
}
