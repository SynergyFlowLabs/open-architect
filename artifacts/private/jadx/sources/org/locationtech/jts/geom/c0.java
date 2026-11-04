package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static double f338099i = Math.sqrt(2.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338100a = Double.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f338105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f338107h;

    private static class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c0 f338108a;

        a(c0 c0Var) {
            this.f338108a = c0Var;
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                this.f338108a.g(((v) nVar).S0());
            } else if (nVar instanceof d0) {
                this.f338108a.g(((d0) nVar).R0());
            }
        }
    }

    public c0() {
    }

    private static double a(double d10, double d11) {
        return d10 + d11;
    }

    private static double b(double d10, double d11) {
        return d10 - d11;
    }

    private boolean v() {
        if (u()) {
            return true;
        }
        return this.f338100a <= this.f338101b && this.f338102c <= this.f338103d && this.f338104e <= this.f338105f && this.f338106g <= this.f338107h;
    }

    public static n w(n nVar) {
        return new c0(nVar).y(nVar.g0());
    }

    public boolean c(c0 c0Var) {
        return !u() && !c0Var.u() && c0Var.f338100a >= this.f338100a && c0Var.f338101b <= this.f338101b && c0Var.f338102c >= this.f338102c && c0Var.f338103d <= this.f338103d && c0Var.f338104e >= this.f338104e && c0Var.f338105f <= this.f338105f && c0Var.f338106g >= this.f338106g && c0Var.f338107h <= this.f338107h;
    }

    public void d(double d10) {
        if (u()) {
            return;
        }
        double d11 = f338099i * d10;
        this.f338100a -= d10;
        this.f338101b += d10;
        this.f338102c -= d10;
        this.f338103d += d10;
        this.f338104e -= d11;
        this.f338105f += d11;
        this.f338106g -= d11;
        this.f338107h += d11;
        if (v()) {
            return;
        }
        x();
    }

    public c0 e(double d10, double d11) {
        double dA = a(d10, d11);
        double dB = b(d10, d11);
        if (u()) {
            this.f338100a = d10;
            this.f338101b = d10;
            this.f338102c = d11;
            this.f338103d = d11;
            this.f338104e = dA;
            this.f338105f = dA;
            this.f338106g = dB;
            this.f338107h = dB;
            return this;
        }
        if (d10 < this.f338100a) {
            this.f338100a = d10;
        }
        if (d10 > this.f338101b) {
            this.f338101b = d10;
        }
        if (d11 < this.f338102c) {
            this.f338102c = d11;
        }
        if (d11 > this.f338103d) {
            this.f338103d = d11;
        }
        if (dA < this.f338104e) {
            this.f338104e = dA;
        }
        if (dA > this.f338105f) {
            this.f338105f = dA;
        }
        if (dB < this.f338106g) {
            this.f338106g = dB;
        }
        if (dB > this.f338107h) {
            this.f338107h = dB;
        }
        return this;
    }

    public c0 f(org.locationtech.jts.geom.a aVar) {
        e(aVar.f338092a, aVar.f338093b);
        return this;
    }

    public c0 g(e eVar) {
        for (int i10 = 0; i10 < eVar.size(); i10++) {
            e(eVar.N5(i10), eVar.I3(i10));
        }
        return this;
    }

    public c0 h(m mVar) {
        e(mVar.L(), mVar.M());
        e(mVar.L(), mVar.I());
        e(mVar.H(), mVar.M());
        e(mVar.H(), mVar.I());
        return this;
    }

    public c0 i(c0 c0Var) {
        if (!c0Var.u()) {
            if (u()) {
                this.f338100a = c0Var.f338100a;
                this.f338101b = c0Var.f338101b;
                this.f338102c = c0Var.f338102c;
                this.f338103d = c0Var.f338103d;
                this.f338104e = c0Var.f338104e;
                this.f338105f = c0Var.f338105f;
                this.f338106g = c0Var.f338106g;
                this.f338107h = c0Var.f338107h;
                return this;
            }
            double d10 = c0Var.f338100a;
            if (d10 < this.f338100a) {
                this.f338100a = d10;
            }
            double d11 = c0Var.f338101b;
            if (d11 > this.f338101b) {
                this.f338101b = d11;
            }
            double d12 = c0Var.f338102c;
            if (d12 < this.f338102c) {
                this.f338102c = d12;
            }
            double d13 = c0Var.f338103d;
            if (d13 > this.f338103d) {
                this.f338103d = d13;
            }
            double d14 = c0Var.f338104e;
            if (d14 < this.f338104e) {
                this.f338104e = d14;
            }
            double d15 = c0Var.f338105f;
            if (d15 > this.f338105f) {
                this.f338105f = d15;
            }
            double d16 = c0Var.f338106g;
            if (d16 < this.f338106g) {
                this.f338106g = d16;
            }
            double d17 = c0Var.f338107h;
            if (d17 > this.f338107h) {
                this.f338107h = d17;
            }
        }
        return this;
    }

    public void j(n nVar) {
        nVar.d(new a(this));
    }

    public double k() {
        return this.f338105f;
    }

    public double l() {
        return this.f338107h;
    }

    public double m() {
        return this.f338101b;
    }

    public double n() {
        return this.f338103d;
    }

    public double o() {
        return this.f338104e;
    }

    public double p() {
        return this.f338106g;
    }

    public double q() {
        return this.f338100a;
    }

    public double r() {
        return this.f338102c;
    }

    public boolean s(org.locationtech.jts.geom.a aVar) {
        double d10 = this.f338100a;
        double d11 = aVar.f338092a;
        if (d10 > d11 || this.f338101b < d11) {
            return false;
        }
        double d12 = this.f338102c;
        double d13 = aVar.f338093b;
        if (d12 > d13 || this.f338103d < d13) {
            return false;
        }
        double dA = a(d11, d13);
        double dB = b(aVar.f338092a, aVar.f338093b);
        return this.f338104e <= dA && this.f338105f >= dA && this.f338106g <= dB && this.f338107h >= dB;
    }

    public boolean t(c0 c0Var) {
        return !u() && !c0Var.u() && this.f338100a <= c0Var.f338101b && this.f338101b >= c0Var.f338100a && this.f338102c <= c0Var.f338103d && this.f338103d >= c0Var.f338102c && this.f338104e <= c0Var.f338105f && this.f338105f >= c0Var.f338104e && this.f338106g <= c0Var.f338107h && this.f338107h >= c0Var.f338106g;
    }

    public boolean u() {
        return Double.isNaN(this.f338100a);
    }

    public void x() {
        this.f338100a = Double.NaN;
    }

    public n y(r rVar) {
        if (u()) {
            return rVar.u();
        }
        double d10 = this.f338100a;
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(d10, this.f338104e - d10);
        double d11 = this.f338100a;
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a(d11, d11 - this.f338106g);
        double d12 = this.f338101b;
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a(d12, d12 - this.f338107h);
        double d13 = this.f338101b;
        org.locationtech.jts.geom.a aVar4 = new org.locationtech.jts.geom.a(d13, this.f338105f - d13);
        double d14 = this.f338104e;
        double d15 = this.f338102c;
        org.locationtech.jts.geom.a aVar5 = new org.locationtech.jts.geom.a(d14 - d15, d15);
        double d16 = this.f338102c;
        org.locationtech.jts.geom.a aVar6 = new org.locationtech.jts.geom.a(this.f338107h + d16, d16);
        double d17 = this.f338103d;
        org.locationtech.jts.geom.a aVar7 = new org.locationtech.jts.geom.a(this.f338106g + d17, d17);
        double d18 = this.f338105f;
        double d19 = this.f338103d;
        org.locationtech.jts.geom.a aVar8 = new org.locationtech.jts.geom.a(d18 - d19, d19);
        g0 g0VarF = rVar.F();
        g0VarF.s(aVar);
        g0VarF.s(aVar2);
        g0VarF.s(aVar3);
        g0VarF.s(aVar4);
        g0VarF.s(aVar5);
        g0VarF.s(aVar6);
        g0VarF.s(aVar7);
        g0VarF.s(aVar8);
        d dVar = new d();
        dVar.i(aVar, false);
        dVar.i(aVar2, false);
        dVar.i(aVar7, false);
        dVar.i(aVar8, false);
        dVar.i(aVar4, false);
        dVar.i(aVar3, false);
        dVar.i(aVar6, false);
        dVar.i(aVar5, false);
        if (dVar.size() == 1) {
            return rVar.v(aVar);
        }
        if (dVar.size() == 2) {
            return rVar.h(dVar.Uf());
        }
        dVar.i(aVar, false);
        return rVar.A(rVar.k(dVar.Uf()));
    }

    public c0(org.locationtech.jts.geom.a aVar) {
        f(aVar);
    }

    public c0(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        f(aVar);
        f(aVar2);
    }

    public c0(m mVar) {
        h(mVar);
    }

    public c0(c0 c0Var) {
        i(c0Var);
    }

    public c0(n nVar) {
        j(nVar);
    }
}
