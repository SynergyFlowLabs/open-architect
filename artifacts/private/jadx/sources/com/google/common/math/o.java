package com.google.common.math;

import com.google.common.base.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f119459a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f119460b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f119461c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f119462d = Double.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f119463e = Double.NaN;

    static double i(double previousMean, double value) {
        if (com.google.common.primitives.d.o(previousMean)) {
            return value;
        }
        if (!com.google.common.primitives.d.o(value) && previousMean != value) {
            previousMean = Double.NaN;
        }
        return previousMean;
    }

    private void m(long otherCount, double otherMean, double otherSumOfSquaresOfDeltas, double otherMin, double otherMax) {
        long j10 = this.f119459a;
        if (j10 == 0) {
            this.f119459a = otherCount;
            this.f119460b = otherMean;
            this.f119461c = otherSumOfSquaresOfDeltas;
            this.f119462d = otherMin;
            this.f119463e = otherMax;
            return;
        }
        this.f119459a = j10 + otherCount;
        if (com.google.common.primitives.d.o(this.f119460b) && com.google.common.primitives.d.o(otherMean)) {
            double d10 = this.f119460b;
            double d11 = otherMean - d10;
            double d12 = otherCount;
            double d13 = d10 + ((d11 * d12) / this.f119459a);
            this.f119460b = d13;
            this.f119461c += otherSumOfSquaresOfDeltas + (d11 * (otherMean - d13) * d12);
        } else {
            this.f119460b = i(this.f119460b, otherMean);
            this.f119461c = Double.NaN;
        }
        this.f119462d = Math.min(this.f119462d, otherMin);
        this.f119463e = Math.max(this.f119463e, otherMax);
    }

    public void a(double value) {
        long j10 = this.f119459a;
        if (j10 == 0) {
            this.f119459a = 1L;
            this.f119460b = value;
            this.f119462d = value;
            this.f119463e = value;
            if (com.google.common.primitives.d.o(value)) {
                return;
            }
            this.f119461c = Double.NaN;
            return;
        }
        this.f119459a = j10 + 1;
        if (com.google.common.primitives.d.o(value) && com.google.common.primitives.d.o(this.f119460b)) {
            double d10 = this.f119460b;
            double d11 = value - d10;
            double d12 = d10 + (d11 / this.f119459a);
            this.f119460b = d12;
            this.f119461c += d11 * (value - d12);
        } else {
            this.f119460b = i(this.f119460b, value);
            this.f119461c = Double.NaN;
        }
        this.f119462d = Math.min(this.f119462d, value);
        this.f119463e = Math.max(this.f119463e, value);
    }

    public void b(n values) {
        if (values.a() == 0) {
            return;
        }
        m(values.a(), values.d(), values.v(), values.j(), values.c());
    }

    public void c(o values) {
        if (values.j() == 0) {
            return;
        }
        m(values.j(), values.l(), values.u(), values.n(), values.k());
    }

    public void d(Iterable<? extends Number> values) {
        Iterator<? extends Number> it = values.iterator();
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void e(Iterator<? extends Number> values) {
        while (values.hasNext()) {
            a(values.next().doubleValue());
        }
    }

    public void f(double... values) {
        for (double d10 : values) {
            a(d10);
        }
    }

    public void g(int... values) {
        for (int i10 : values) {
            a(i10);
        }
    }

    public void h(long... values) {
        for (long j10 : values) {
            a(j10);
        }
    }

    public long j() {
        return this.f119459a;
    }

    public double k() {
        boolean z10;
        if (this.f119459a != 0) {
            z10 = true;
            int i10 = 7 << 1;
        } else {
            z10 = false;
        }
        j0.g0(z10);
        return this.f119463e;
    }

    public double l() {
        j0.g0(this.f119459a != 0);
        return this.f119460b;
    }

    public double n() {
        j0.g0(this.f119459a != 0);
        return this.f119462d;
    }

    public final double o() {
        return Math.sqrt(p());
    }

    public final double p() {
        j0.g0(this.f119459a != 0);
        if (Double.isNaN(this.f119461c)) {
            return Double.NaN;
        }
        if (this.f119459a == 1) {
            return 0.0d;
        }
        return d.b(this.f119461c) / this.f119459a;
    }

    public final double q() {
        return Math.sqrt(r());
    }

    public final double r() {
        j0.g0(this.f119459a > 1);
        if (Double.isNaN(this.f119461c)) {
            return Double.NaN;
        }
        return d.b(this.f119461c) / (this.f119459a - 1);
    }

    public n s() {
        return new n(this.f119459a, this.f119460b, this.f119461c, this.f119462d, this.f119463e);
    }

    public final double t() {
        return this.f119460b * this.f119459a;
    }

    double u() {
        return this.f119461c;
    }
}
