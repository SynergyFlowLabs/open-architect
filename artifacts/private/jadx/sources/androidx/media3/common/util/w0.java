package androidx.media3.common.util;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class w0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f61677e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f61678f = 9223372036854775806L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f61679g = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f61680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f61681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private long f61682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f61683d = new ThreadLocal<>();

    public w0(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return k1.X1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return k1.X1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % f61679g;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f61680a;
                if (jLongValue == f61678f) {
                    jLongValue = ((Long) a.g(this.f61683d.get())).longValue();
                }
                this.f61681b = jLongValue - j10;
                notifyAll();
            }
            this.f61682c = j10;
            return j10 + this.f61681b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f61682c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / f61679g;
                long j13 = ((j12 - 1) * f61679g) + j10;
                j10 += j12 * f61679g;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f61682c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = jK / f61679g;
                long j13 = (j12 * f61679g) + j10;
                j10 += (j12 + 1) * f61679g;
                if (j13 >= jK) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j10;
        try {
            j10 = this.f61680a;
            if (j10 == Long.MAX_VALUE || j10 == f61678f) {
                j10 = -9223372036854775807L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f61682c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f61681b : d();
    }

    public synchronized long f() {
        return this.f61681b;
    }

    public synchronized boolean g() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f61681b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        try {
            this.f61680a = j10;
            this.f61681b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.f61682c = -9223372036854775807L;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j(boolean z10, long j10, long j11) throws InterruptedException, TimeoutException {
        try {
            a.i(this.f61680a == f61678f);
            if (g()) {
                return;
            }
            if (z10) {
                this.f61683d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        a.i(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
