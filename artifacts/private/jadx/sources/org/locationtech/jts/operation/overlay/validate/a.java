package org.locationtech.jts.operation.overlay.validate;

import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f338847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u f338848d = new u();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.u f338849e = new org.locationtech.jts.geom.u();

    public a(n nVar, double d10) {
        this.f338845a = nVar;
        this.f338846b = d10;
        this.f338847c = a(nVar);
    }

    private z a(n nVar) {
        d dVar = new d();
        nVar.e(dVar);
        return nVar.g0().m(r.J(dVar.b()));
    }

    private boolean c(org.locationtech.jts.geom.a aVar) {
        for (int i10 = 0; i10 < this.f338847c.l0(); i10++) {
            e eVarS0 = ((v) this.f338847c.h0(i10)).S0();
            int i11 = 0;
            while (i11 < eVarS0.size() - 1) {
                eVarS0.Ob(i11, this.f338849e.f338211a);
                i11++;
                eVarS0.Ob(i11, this.f338849e.f338212b);
                if (this.f338849e.o(aVar) <= this.f338846b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int b(org.locationtech.jts.geom.a aVar) {
        if (c(aVar)) {
            return 1;
        }
        return this.f338848d.c(aVar, this.f338845a);
    }
}
