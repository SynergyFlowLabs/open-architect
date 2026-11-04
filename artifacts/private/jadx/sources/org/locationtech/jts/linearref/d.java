package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338530a;

    public d(n nVar) {
        this.f338530a = nVar;
    }

    public static double a(n nVar, g gVar) {
        return new d(nVar).b(gVar);
    }

    public static g e(n nVar, double d10) {
        return new d(nVar).c(d10);
    }

    public static g f(n nVar, double d10, boolean z10) {
        return new d(nVar).d(d10, z10);
    }

    private g g(double d10) {
        if (d10 <= 0.0d) {
            return new g();
        }
        f fVar = new f(this.f338530a);
        double d11 = 0.0d;
        while (fVar.f()) {
            if (!fVar.g()) {
                double dL = fVar.c().l(fVar.d());
                double d12 = d11 + dL;
                if (d12 > d10) {
                    return new g(fVar.a(), fVar.e(), (d10 - d11) / dL);
                }
                d11 = d12;
            } else if (d11 == d10) {
                return new g(fVar.a(), fVar.e(), 0.0d);
            }
            fVar.i();
        }
        return g.o(this.f338530a);
    }

    private g h(g gVar) {
        int iL;
        if (!gVar.t(this.f338530a) || (iL = gVar.l()) >= this.f338530a.l0() - 1) {
            return gVar;
        }
        do {
            iL++;
            if (iL >= this.f338530a.l0() - 1) {
                break;
            }
        } while (this.f338530a.h0(iL).k0() == 0.0d);
        return new g(iL, 0, 0.0d);
    }

    public double b(g gVar) {
        f fVar = new f(this.f338530a);
        double d10 = 0.0d;
        while (fVar.f()) {
            if (!fVar.g()) {
                double dL = fVar.c().l(fVar.d());
                if (gVar.l() == fVar.a() && gVar.r() == fVar.e()) {
                    return d10 + (dL * gVar.q());
                }
                d10 += dL;
            }
            fVar.i();
        }
        return d10;
    }

    public g c(double d10) {
        return d(d10, true);
    }

    public g d(double d10, boolean z10) {
        if (d10 < 0.0d) {
            d10 += this.f338530a.k0();
        }
        g gVarG = g(d10);
        return z10 ? gVarG : h(gVarG);
    }
}
