package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements Comparable<y> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f291442d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f291443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f291444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f291445g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f291446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f291447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f291448c;

    private static class b extends c {
        private b() {
        }

        @Override // io.grpc.y.c
        public long a() {
            return System.nanoTime();
        }
    }

    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f291443e = nanos;
        f291444f = -nanos;
        f291445g = TimeUnit.SECONDS.toNanos(1L);
    }

    private y(c cVar, long j10, boolean z10) {
        this(cVar, cVar.a(), j10, z10);
    }

    public static y b(long j10, TimeUnit timeUnit) {
        return c(j10, timeUnit, f291442d);
    }

    public static y c(long j10, TimeUnit timeUnit, c cVar) {
        d(timeUnit, "units");
        return new y(cVar, timeUnit.toNanos(j10), true);
    }

    private static <T> T d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void e(y yVar) {
        if (this.f291446a == yVar.f291446a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f291446a + " and " + yVar.f291446a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static c k() {
        return f291442d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        c cVar = this.f291446a;
        if (cVar != null ? cVar == yVar.f291446a : yVar.f291446a == null) {
            return this.f291447b == yVar.f291447b;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(y yVar) {
        e(yVar);
        long j10 = this.f291447b - yVar.f291447b;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    public int hashCode() {
        return Arrays.asList(this.f291446a, Long.valueOf(this.f291447b)).hashCode();
    }

    public boolean l(y yVar) {
        e(yVar);
        return this.f291447b - yVar.f291447b < 0;
    }

    public boolean n() {
        if (!this.f291448c) {
            if (this.f291447b - this.f291446a.a() > 0) {
                return false;
            }
            this.f291448c = true;
        }
        return true;
    }

    public y o(y yVar) {
        e(yVar);
        return l(yVar) ? this : yVar;
    }

    public y p(long j10, TimeUnit timeUnit) {
        return j10 == 0 ? this : new y(this.f291446a, this.f291447b, timeUnit.toNanos(j10), n());
    }

    public ScheduledFuture<?> q(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        d(runnable, "task");
        d(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.f291447b - this.f291446a.a(), TimeUnit.NANOSECONDS);
    }

    public long r(TimeUnit timeUnit) {
        long jA = this.f291446a.a();
        if (!this.f291448c && this.f291447b - jA <= 0) {
            this.f291448c = true;
        }
        return timeUnit.convert(this.f291447b - jA, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jR = r(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jR);
        long j10 = f291445g;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jR) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (jR < 0) {
            sb2.append(org.apache.commons.codec.language.l.f335457d);
        }
        sb2.append(j11);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        if (this.f291446a != f291442d) {
            sb2.append(" (ticker=" + this.f291446a + ")");
        }
        return sb2.toString();
    }

    private y(c cVar, long j10, long j11, boolean z10) {
        this.f291446a = cVar;
        long jMin = Math.min(f291443e, Math.max(f291444f, j11));
        this.f291447b = j10 + jMin;
        this.f291448c = z10 && jMin <= 0;
    }
}
