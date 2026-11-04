package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f97834d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final short f97835e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final short f97836f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final short f97837g = 256;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final short f97838h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final short f97839i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f97840j = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f97841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f97842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f97843c;

    protected f() {
        this((short) 4, (short) 3);
    }

    static int b(int i10, int i11) {
        return i11 - i10;
    }

    static int e(int i10) {
        return i10;
    }

    static byte f() {
        return (byte) 8;
    }

    static boolean j(short s10) {
        return s10 == 1;
    }

    static boolean m(short s10) {
        return s10 == 0;
    }

    public abstract int a(int i10, short s10, ByteBuffer byteBuffer) throws IOException;

    int c(short s10, int i10) {
        return this.f97842b[s10 - 2] + i10;
    }

    public final int d(short s10, short s11) {
        return this.f97843c[((s10 - h()) * 256) + s11];
    }

    public abstract short g(int i10, int i11, AtomicInteger atomicInteger);

    public short h() {
        return (short) (this.f97842b.length + 2);
    }

    public abstract void i();

    boolean k(short s10) {
        return s10 >= 2 && s10 < h();
    }

    boolean l(short s10) {
        return s10 >= h() && s10 <= n();
    }

    public short n() {
        return (byte) ((h() + (this.f97843c.length / 256)) - 1);
    }

    public abstract void o(int i10);

    public final boolean p(short s10) {
        return !l(s10);
    }

    protected f(short s10, short s11) {
        if (s10 > 254 || s10 < 0) {
            throw new IllegalArgumentException("Near cache size " + ((int) s10) + " is invalid");
        }
        if (s11 > 254 || s11 < 0) {
            throw new IllegalArgumentException("Same cache size " + ((int) s11) + " is invalid");
        }
        if (s10 + s11 <= 254) {
            this.f97842b = new int[s10];
            this.f97843c = new int[s11 * 256];
            return;
        }
        throw new IllegalArgumentException("Using near cache size " + ((int) s10) + " and same cache size " + ((int) s11) + " would exceed maximum number of COPY modes (256");
    }
}
