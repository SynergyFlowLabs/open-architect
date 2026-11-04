package com.google.protobuf.nano;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f126214a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f126215b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f126216c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f126217d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f126218e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f126219f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f126220g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f126221h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f126222i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long[] f126223j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f126224k = new float[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double[] f126225l = new double[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean[] f126226m = new boolean[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f126227n = new String[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[][] f126228o = new byte[0][];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f126229p = new byte[0];

    private m() {
    }

    public static final int a(a aVar, int i10) throws IOException {
        int iF = aVar.f();
        aVar.Q(i10);
        int i11 = 1;
        while (aVar.I() == i10) {
            aVar.Q(i10);
            i11++;
        }
        aVar.N(iF);
        return i11;
    }

    public static int b(int i10) {
        return i10 >>> 3;
    }

    static int c(int i10) {
        return i10 & 7;
    }

    static int d(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static boolean e(a aVar, int i10) throws IOException {
        return aVar.Q(i10);
    }
}
