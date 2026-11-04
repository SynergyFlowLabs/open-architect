package com.badlogic.gdx.math;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class z extends Random {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f95137c = 1.1102230246251565E-16d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f95138d = 5.960464477539063E-8d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f95139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f95140b;

    public z() {
        setSeed(new Random().nextLong());
    }

    private static final long b(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    public long a(int i10) {
        return i10 == 0 ? this.f95139a : this.f95140b;
    }

    public void c(long j10, long j11) {
        this.f95139a = j10;
        this.f95140b = j11;
    }

    @Override // java.util.Random
    protected final int next(int i10) {
        return (int) (((1 << i10) - 1) & nextLong());
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i10 = length < 8 ? length : 8;
            long jNextLong = nextLong();
            while (true) {
                int i11 = i10 - 1;
                if (i10 != 0) {
                    length--;
                    bArr[length] = (byte) jNextLong;
                    jNextLong >>= 8;
                    i10 = i11;
                }
            }
        }
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (nextLong() >>> 11) * f95137c;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (float) ((nextLong() >>> 40) * f95138d);
    }

    @Override // java.util.Random
    public int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public long nextLong() {
        long j10 = this.f95139a;
        long j11 = this.f95140b;
        this.f95139a = j11;
        long j12 = j10 ^ (j10 << 23);
        long j13 = ((j12 >>> 17) ^ (j12 ^ j11)) ^ (j11 >>> 26);
        this.f95140b = j13;
        return j13 + j11;
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (j10 == 0) {
            j10 = Long.MIN_VALUE;
        }
        long jB = b(j10);
        c(jB, b(jB));
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return (int) nextLong(i10);
    }

    public z(long j10) {
        setSeed(j10);
    }

    public z(long j10, long j11) {
        c(j10, j11);
    }

    public long nextLong(long j10) {
        long jNextLong;
        long j11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        do {
            jNextLong = nextLong() >>> 1;
            j11 = jNextLong % j10;
        } while ((jNextLong - j11) + (j10 - 1) < 0);
        return j11;
    }
}
