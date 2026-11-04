package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
@com.google.common.annotations.a
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f120002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private volatile Object f120003b;

    static abstract class a {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.g2$a$a, reason: collision with other inner class name */
        class C1118a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final com.google.common.base.q0 f120004a = com.google.common.base.q0.c();

            C1118a() {
            }

            @Override // com.google.common.util.concurrent.g2.a
            protected long b() {
                return this.f120004a.g(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.g2.a
            protected void c(long micros) {
                if (micros > 0) {
                    f3.k(micros, TimeUnit.MICROSECONDS);
                }
            }
        }

        protected a() {
        }

        public static a a() {
            return new C1118a();
        }

        protected abstract long b();

        protected abstract void c(long micros);
    }

    g2(a stopwatch) {
        this.f120002a = (a) com.google.common.base.j0.E(stopwatch);
    }

    private boolean c(long nowMicros, long timeoutMicros) {
        return m(nowMicros) - timeoutMicros <= nowMicros;
    }

    private static void d(int permits) {
        com.google.common.base.j0.k(permits > 0, "Requested permits (%s) must be positive", permits);
    }

    public static g2 e(double permitsPerSecond) {
        return h(permitsPerSecond, a.a());
    }

    public static g2 f(double permitsPerSecond, long warmupPeriod, TimeUnit unit) {
        com.google.common.base.j0.p(warmupPeriod >= 0, "warmupPeriod must not be negative: %s", warmupPeriod);
        return g(permitsPerSecond, warmupPeriod, unit, 3.0d, a.a());
    }

    @com.google.common.annotations.e
    static g2 g(double permitsPerSecond, long warmupPeriod, TimeUnit unit, double coldFactor, a stopwatch) {
        p2.c cVar = new p2.c(stopwatch, warmupPeriod, unit, coldFactor);
        cVar.q(permitsPerSecond);
        return cVar;
    }

    @com.google.common.annotations.e
    static g2 h(double permitsPerSecond, a stopwatch) {
        p2.b bVar = new p2.b(stopwatch, 1.0d);
        bVar.q(permitsPerSecond);
        return bVar;
    }

    private Object l() {
        Object obj;
        Object obj2 = this.f120003b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f120003b;
                if (obj == null) {
                    obj = new Object();
                    this.f120003b = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @z7.a
    public double a() {
        return b(1);
    }

    @z7.a
    public double b(int permits) {
        long jN = n(permits);
        this.f120002a.c(jN);
        return (jN * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    abstract double i();

    abstract void j(double permitsPerSecond, long nowMicros);

    public final double k() {
        double dI;
        synchronized (l()) {
            dI = i();
        }
        return dI;
    }

    abstract long m(long nowMicros);

    final long n(int permits) {
        long jO;
        d(permits);
        synchronized (l()) {
            try {
                jO = o(permits, this.f120002a.b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jO;
    }

    final long o(int permits, long nowMicros) {
        return Math.max(p(permits, nowMicros) - nowMicros, 0L);
    }

    abstract long p(int permits, long nowMicros);

    public final void q(double permitsPerSecond) {
        com.google.common.base.j0.e(permitsPerSecond > 0.0d, "rate must be positive");
        synchronized (l()) {
            try {
                j(permitsPerSecond, this.f120002a.b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int permits) {
        return t(permits, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int permits, long timeout, TimeUnit unit) {
        long jMax = Math.max(unit.toMicros(timeout), 0L);
        d(permits);
        synchronized (l()) {
            try {
                long jB = this.f120002a.b();
                if (!c(jB, jMax)) {
                    return false;
                }
                this.f120002a.c(o(permits, jB));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(k()));
    }

    public boolean u(long timeout, TimeUnit unit) {
        return t(1, timeout, unit);
    }
}
