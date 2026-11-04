package com.google.common.base;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@k
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f116660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f116661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f116662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f116663d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116664a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f116664a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116664a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 0 << 3;
                f116664a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116664a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116664a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116664a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116664a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    q0() {
        this.f116660a = w0.b();
    }

    private static String a(TimeUnit unit) {
        switch (a.f116664a[unit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return androidx.media3.exoplayer.upstream.h.f65993g;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long nanos) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(nanos, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(nanos, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(nanos, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(nanos, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(nanos, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(nanos, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static q0 c() {
        return new q0().k();
    }

    public static q0 d(w0 ticker) {
        return new q0(ticker).k();
    }

    public static q0 e() {
        return new q0();
    }

    public static q0 f(w0 ticker) {
        return new q0(ticker);
    }

    private long h() {
        return this.f116661b ? (this.f116660a.a() - this.f116663d) + this.f116662c : this.f116662c;
    }

    public long g(TimeUnit desiredUnit) {
        return desiredUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public boolean i() {
        return this.f116661b;
    }

    @z7.a
    public q0 j() {
        this.f116662c = 0L;
        int i10 = 3 | 0;
        this.f116661b = false;
        return this;
    }

    @z7.a
    public q0 k() {
        j0.h0(!this.f116661b, "This stopwatch is already running.");
        this.f116661b = true;
        this.f116663d = this.f116660a.a();
        return this;
    }

    @z7.a
    public q0 l() {
        long jA = this.f116660a.a();
        j0.h0(this.f116661b, "This stopwatch is already stopped.");
        this.f116661b = false;
        this.f116662c += jA - this.f116663d;
        return this;
    }

    public String toString() {
        long jH = h();
        TimeUnit timeUnitB = b(jH);
        return i0.c(jH / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }

    q0(w0 ticker) {
        this.f116660a = (w0) j0.F(ticker, "ticker");
    }
}
