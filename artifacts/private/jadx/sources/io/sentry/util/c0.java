package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f306942e = -4257915988930727506L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AtomicLong f306943f = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f306944g = 6364136223846793005L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f306945h = 9.007199254740992E15d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f306946i = 1.6777216E7f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f306947j = 4294967295L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f306948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f306949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f306950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f306951d;

    public c0() {
        this(a(), a());
    }

    private static long a() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f306943f;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    private void p(long j10) {
        if (j10 != 0 && j10 % 2 != 0) {
            this.f306949b = j10;
            return;
        }
        throw new IllegalArgumentException("Increment may not be 0 or even. Value: " + j10);
    }

    private void r(long j10) {
        this.f306948a = j10;
    }

    public boolean b() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) & 4294967295L) >>> 31) != 0;
    }

    public boolean c(double d10) {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (d10 == 0.0d) {
            return false;
        }
        if (d10 == 1.0d) {
            return true;
        }
        long j10 = this.f306948a * f306944g;
        long j11 = this.f306949b;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        long j14 = (j12 * f306944g) + j11;
        this.f306948a = j14;
        return ((double) (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5))) / 9.007199254740992E15d < d10;
    }

    public byte d() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (byte) ((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) >>> 24);
    }

    public void e(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long j10 = (this.f306948a * f306944g) + this.f306949b;
            this.f306948a = j10;
            bArr[i10] = (byte) ((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) >>> 24);
        }
    }

    public char f() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (char) ((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) >>> 16);
    }

    public double g() {
        long j10 = this.f306948a * f306944g;
        long j11 = this.f306949b;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        long j14 = (j12 * f306944g) + j11;
        this.f306948a = j14;
        return (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public double h(boolean z10, boolean z11) {
        double d10;
        while (true) {
            long j10 = this.f306948a * f306944g;
            long j11 = this.f306949b;
            long j12 = j10 + j11;
            long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
            long j14 = (j12 * f306944g) + j11;
            this.f306948a = j14;
            d10 = (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
            if (z11) {
                long j15 = (j14 * f306944g) + j11;
                this.f306948a = j15;
                if ((((((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22))) & 4294967295L) >>> 31) != 0) {
                    d10 += 1.0d;
                }
            }
            if (d10 <= 1.0d && (z10 || d10 != 0.0d)) {
                break;
            }
        }
        return d10;
    }

    public float i() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) & 4294967295L) >>> 8) / f306946i;
    }

    public float j(boolean z10, boolean z11) {
        float f10;
        while (true) {
            long j10 = this.f306948a * f306944g;
            long j11 = this.f306949b;
            long j12 = j10 + j11;
            this.f306948a = j12;
            f10 = (((((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L) >>> 8) / f306946i;
            if (z11) {
                long j13 = (j12 * f306944g) + j11;
                this.f306948a = j13;
                if ((((((j13 >>> 22) ^ j13) >>> ((int) ((j13 >>> 61) + 22))) & 4294967295L) >>> 31) != 0) {
                    f10 += 1.0f;
                }
            }
            if (f10 <= 1.0f && (z10 || f10 != 0.0f)) {
                break;
            }
        }
        return f10;
    }

    public int k() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (int) (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22)));
    }

    public int l(int i10) {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        int i11 = ((int) (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22)))) >>> 1;
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            return (int) ((((long) i10) * ((long) i11)) >> 31);
        }
        while (true) {
            int i13 = i11 % i10;
            if ((i11 - i13) + i12 >= 0) {
                return i13;
            }
            long j11 = (this.f306948a * f306944g) + this.f306949b;
            this.f306948a = j11;
            i11 = ((int) (((j11 >>> 22) ^ j11) >>> ((int) ((j11 >>> 61) + 22)))) >>> 1;
        }
    }

    public long m() {
        long j10 = this.f306948a * f306944g;
        long j11 = this.f306949b;
        long j12 = j10 + j11;
        long j13 = ((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22));
        long j14 = (j12 * f306944g) + j11;
        this.f306948a = j14;
        return (j13 << 32) + ((long) ((int) (((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22)))));
    }

    public long n(long j10) {
        long j11;
        long j12;
        if (j10 == 0) {
            throw new IllegalArgumentException("n has to be greater than 0");
        }
        do {
            long j13 = this.f306948a * f306944g;
            long j14 = this.f306949b;
            long j15 = j13 + j14;
            long j16 = ((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22));
            long j17 = (j15 * f306944g) + j14;
            this.f306948a = j17;
            j11 = ((j16 << 32) + ((long) ((int) (((j17 >>> 22) ^ j17) >>> ((int) ((j17 >>> 61) + 22)))))) >>> 1;
            j12 = j11 % j10;
        } while ((j11 - j12) + (j10 - 1) < 0);
        return j12;
    }

    public short o() {
        long j10 = (this.f306948a * f306944g) + this.f306949b;
        this.f306948a = j10;
        return (short) ((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) >>> 16);
    }

    public void q(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.f306949b = j12;
        this.f306948a = j12 + j10;
    }

    public c0(long j10, long j11) {
        q(j10, j11);
    }

    private c0(long j10, long j11, boolean z10) {
        r(j10);
        p(j11);
    }
}
