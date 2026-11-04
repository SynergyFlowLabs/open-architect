package com.google.common.math;

import com.google.common.base.j0;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f119444a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f119445b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f119446c = 0.0d;

    private static double d(double value) {
        return com.google.common.primitives.d.g(value, -1.0d, 1.0d);
    }

    private double e(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public void a(double x10, double y10) {
        this.f119444a.a(x10);
        if (!com.google.common.primitives.d.o(x10) || !com.google.common.primitives.d.o(y10)) {
            this.f119446c = Double.NaN;
        } else if (this.f119444a.j() > 1) {
            this.f119446c += (x10 - this.f119444a.l()) * (y10 - this.f119445b.l());
        }
        this.f119445b.a(y10);
    }

    public void b(j values) {
        if (values.a() == 0) {
            return;
        }
        this.f119444a.b(values.k());
        if (this.f119445b.j() == 0) {
            this.f119446c = values.i();
        } else {
            this.f119446c += values.i() + ((values.k().d() - this.f119444a.l()) * (values.l().d() - this.f119445b.l()) * values.a());
        }
        this.f119445b.b(values.l());
    }

    public long c() {
        return this.f119444a.j();
    }

    public final g f() {
        j0.g0(c() > 1);
        if (Double.isNaN(this.f119446c)) {
            return g.a();
        }
        double dU = this.f119444a.u();
        if (dU > 0.0d) {
            return this.f119445b.u() > 0.0d ? g.f(this.f119444a.l(), this.f119445b.l()).b(this.f119446c / dU) : g.b(this.f119445b.l());
        }
        j0.g0(this.f119445b.u() > 0.0d);
        return g.i(this.f119444a.l());
    }

    public final double g() {
        j0.g0(c() > 1);
        if (Double.isNaN(this.f119446c)) {
            return Double.NaN;
        }
        double dU = this.f119444a.u();
        double dU2 = this.f119445b.u();
        j0.g0(dU > 0.0d);
        j0.g0(dU2 > 0.0d);
        return d(this.f119446c / Math.sqrt(e(dU * dU2)));
    }

    public double h() {
        j0.g0(c() != 0);
        return this.f119446c / c();
    }

    public final double i() {
        j0.g0(c() > 1);
        return this.f119446c / (c() - 1);
    }

    public j j() {
        return new j(this.f119444a.s(), this.f119445b.s(), this.f119446c);
    }

    public n k() {
        return this.f119444a.s();
    }

    public n l() {
        return this.f119445b.s();
    }
}
