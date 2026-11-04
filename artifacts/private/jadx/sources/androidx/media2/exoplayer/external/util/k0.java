package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f57587d = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f57588e = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f57589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f57590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f57591c = -9223372036854775807L;

    public k0(long firstSampleTimestampUs) {
        h(firstSampleTimestampUs);
    }

    public static long f(long pts) {
        return (pts * 1000000) / 90000;
    }

    public static long i(long us) {
        return (us * 90000) / 1000000;
    }

    public long a(long timeUs) {
        if (timeUs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f57591c != -9223372036854775807L) {
            this.f57591c = timeUs;
        } else {
            long j10 = this.f57589a;
            if (j10 != Long.MAX_VALUE) {
                this.f57590b = j10 - timeUs;
            }
            synchronized (this) {
                this.f57591c = timeUs;
                notifyAll();
            }
        }
        return timeUs + this.f57590b;
    }

    public long b(long pts90Khz) {
        if (pts90Khz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f57591c != -9223372036854775807L) {
            long jI = i(this.f57591c);
            long j10 = (4294967296L + jI) / f57588e;
            long j11 = ((j10 - 1) * f57588e) + pts90Khz;
            pts90Khz += j10 * f57588e;
            if (Math.abs(j11 - jI) < Math.abs(pts90Khz - jI)) {
                pts90Khz = j11;
            }
        }
        return a(f(pts90Khz));
    }

    public long c() {
        return this.f57589a;
    }

    public long d() {
        if (this.f57591c != -9223372036854775807L) {
            return this.f57591c + this.f57590b;
        }
        long j10 = this.f57589a;
        if (j10 != Long.MAX_VALUE) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (this.f57589a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f57591c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f57590b;
    }

    public void g() {
        this.f57591c = -9223372036854775807L;
    }

    public synchronized void h(long firstSampleTimestampUs) {
        try {
            a.i(this.f57591c == -9223372036854775807L);
            this.f57589a = firstSampleTimestampUs;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j() throws InterruptedException {
        while (this.f57591c == -9223372036854775807L) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
