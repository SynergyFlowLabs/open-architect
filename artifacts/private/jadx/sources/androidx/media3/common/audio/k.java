package androidx.media3.common.audio;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f60348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f60349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f60350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f60351f;

    public k(int i10, int i11, float[] fArr) {
        boolean z10 = false;
        androidx.media3.common.util.a.b(i10 > 0, "Input channel count must be positive.");
        androidx.media3.common.util.a.b(i11 > 0, "Output channel count must be positive.");
        androidx.media3.common.util.a.b(fArr.length == i10 * i11, "Coefficient array length is invalid.");
        this.f60346a = i10;
        this.f60347b = i11;
        this.f60348c = a(fArr);
        int i12 = 0;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        while (i12 < i10) {
            int i13 = 0;
            while (i13 < i11) {
                float fI = i(i12, i13);
                boolean z14 = i12 == i13;
                if (fI != 1.0f && z14) {
                    z13 = false;
                }
                if (fI != 0.0f) {
                    z11 = false;
                    if (!z14) {
                        z12 = false;
                    }
                }
                i13++;
            }
            i12++;
        }
        this.f60349d = z11;
        boolean z15 = n() && z12;
        this.f60350e = z15;
        if (z15 && z13) {
            z10 = true;
        }
        this.f60351f = z10;
    }

    @z7.a
    private static float[] a(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i10 + " is negative.");
            }
        }
        return fArr;
    }

    public static k b(int i10, int i11) {
        return new k(i10, i11, c(i10, i11));
    }

    private static float[] c(int i10, int i11) {
        if (i10 == i11) {
            return k(i11);
        }
        if (i10 == 1 && i11 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i10 == 2 && i11 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i10 + "->" + i11 + " are not yet implemented.");
    }

    private static float[] d(int i10, int i11) {
        if (i11 == 1) {
            return f(i10);
        }
        if (i11 == 2) {
            return g(i10);
        }
        if (i10 == i11) {
            return k(i11);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->" + i11 + " are not implemented.");
    }

    public static k e(int i10, int i11) {
        return new k(i10, i11, d(i10, i11));
    }

    private static float[] f(int i10) {
        switch (i10) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->1 are not implemented.");
        }
    }

    private static float[] g(int i10) {
        switch (i10) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->2 are not implemented.");
        }
    }

    private static float[] k(int i10) {
        float[] fArr = new float[i10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[(i10 * i11) + i11] = 1.0f;
        }
        return fArr;
    }

    public int h() {
        return this.f60346a;
    }

    public float i(int i10, int i11) {
        return this.f60348c[(i10 * this.f60347b) + i11];
    }

    public int j() {
        return this.f60347b;
    }

    public boolean l() {
        return this.f60350e;
    }

    public boolean m() {
        return this.f60351f;
    }

    public boolean n() {
        return this.f60346a == this.f60347b;
    }

    public boolean o() {
        return this.f60349d;
    }

    public k p(float f10) {
        float[] fArr = new float[this.f60348c.length];
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f60348c;
            if (i10 >= fArr2.length) {
                return new k(this.f60346a, this.f60347b, fArr);
            }
            fArr[i10] = fArr2[i10] * f10;
            i10++;
        }
    }
}
