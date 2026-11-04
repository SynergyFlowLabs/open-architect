package com.google.zxing.oned.rss;

import com.google.zxing.m;
import com.google.zxing.oned.r;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f130633g = 0.2f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f130634h = 0.45f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f130635i = 0.7916667f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f130636j = 0.89285713f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130638b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f130641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f130642f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130637a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f130639c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f130640d = new float[4];

    protected a() {
        int[] iArr = new int[8];
        this.f130638b = iArr;
        this.f130641e = new int[iArr.length / 2];
        this.f130642f = new int[iArr.length / 2];
    }

    @Deprecated
    protected static int h(int[] iArr) {
        return w9.a.d(iArr);
    }

    protected static void i(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    protected static void p(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    protected static boolean q(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = i10 / ((iArr[2] + i10) + iArr[3]);
        if (f10 >= f130635i && f10 <= f130636j) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int r(int[] iArr, int[][] iArr2) throws m {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (r.e(iArr, iArr2[i10], f130634h) < 0.2f) {
                return i10;
            }
        }
        throw m.a();
    }

    protected final int[] j() {
        return this.f130638b;
    }

    protected final int[] k() {
        return this.f130637a;
    }

    protected final int[] l() {
        return this.f130642f;
    }

    protected final float[] m() {
        return this.f130640d;
    }

    protected final int[] n() {
        return this.f130641e;
    }

    protected final float[] o() {
        return this.f130639c;
    }
}
