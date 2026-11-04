package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
abstract class p2 extends g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f120269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f120270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f120271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f120272f;

    static final class b extends p2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final double f120273g;

        b(g2.a stopwatch, double maxBurstSeconds) {
            super(stopwatch);
            this.f120273g = maxBurstSeconds;
        }

        @Override // com.google.common.util.concurrent.p2
        double v() {
            return this.f120271e;
        }

        @Override // com.google.common.util.concurrent.p2
        void w(double permitsPerSecond, double stableIntervalMicros) {
            double d10 = this.f120270d;
            double d11 = this.f120273g * permitsPerSecond;
            this.f120270d = d11;
            if (d10 == Double.POSITIVE_INFINITY) {
                this.f120269c = d11;
            } else {
                this.f120269c = d10 != 0.0d ? (this.f120269c * d11) / d10 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.p2
        long y(double storedPermits, double permitsToTake) {
            return 0L;
        }
    }

    static final class c extends p2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f120274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f120275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private double f120276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private double f120277j;

        c(g2.a stopwatch, long warmupPeriod, TimeUnit timeUnit, double coldFactor) {
            super(stopwatch);
            this.f120274g = timeUnit.toMicros(warmupPeriod);
            this.f120277j = coldFactor;
        }

        private double z(double permits) {
            return this.f120271e + (permits * this.f120275h);
        }

        @Override // com.google.common.util.concurrent.p2
        double v() {
            return this.f120274g / this.f120270d;
        }

        @Override // com.google.common.util.concurrent.p2
        void w(double permitsPerSecond, double stableIntervalMicros) {
            double d10 = this.f120270d;
            double d11 = this.f120277j * stableIntervalMicros;
            long j10 = this.f120274g;
            double d12 = (j10 * 0.5d) / stableIntervalMicros;
            this.f120276i = d12;
            double d13 = ((j10 * 2.0d) / (stableIntervalMicros + d11)) + d12;
            this.f120270d = d13;
            this.f120275h = (d11 - stableIntervalMicros) / (d13 - d12);
            if (d10 == Double.POSITIVE_INFINITY) {
                this.f120269c = 0.0d;
                return;
            }
            if (d10 != 0.0d) {
                d13 = (this.f120269c * d13) / d10;
            }
            this.f120269c = d13;
        }

        @Override // com.google.common.util.concurrent.p2
        long y(double storedPermits, double permitsToTake) {
            long jZ;
            double d10 = storedPermits - this.f120276i;
            if (d10 > 0.0d) {
                double dMin = Math.min(d10, permitsToTake);
                jZ = (long) (((z(d10) + z(d10 - dMin)) * dMin) / 2.0d);
                permitsToTake -= dMin;
            } else {
                jZ = 0;
            }
            return jZ + ((long) (this.f120271e * permitsToTake));
        }
    }

    @Override // com.google.common.util.concurrent.g2
    final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f120271e;
    }

    @Override // com.google.common.util.concurrent.g2
    final void j(double permitsPerSecond, long nowMicros) {
        x(nowMicros);
        double micros = TimeUnit.SECONDS.toMicros(1L) / permitsPerSecond;
        this.f120271e = micros;
        w(permitsPerSecond, micros);
    }

    @Override // com.google.common.util.concurrent.g2
    final long m(long nowMicros) {
        return this.f120272f;
    }

    @Override // com.google.common.util.concurrent.g2
    final long p(int requiredPermits, long nowMicros) {
        x(nowMicros);
        long j10 = this.f120272f;
        double d10 = requiredPermits;
        double dMin = Math.min(d10, this.f120269c);
        this.f120272f = com.google.common.math.h.x(this.f120272f, y(this.f120269c, dMin) + ((long) ((d10 - dMin) * this.f120271e)));
        this.f120269c -= dMin;
        return j10;
    }

    abstract double v();

    abstract void w(double permitsPerSecond, double stableIntervalMicros);

    void x(long nowMicros) {
        long j10 = this.f120272f;
        if (nowMicros > j10) {
            this.f120269c = Math.min(this.f120270d, this.f120269c + ((nowMicros - j10) / v()));
            this.f120272f = nowMicros;
        }
    }

    abstract long y(double storedPermits, double permitsToTake);

    private p2(g2.a stopwatch) {
        super(stopwatch);
        this.f120272f = 0L;
    }
}
