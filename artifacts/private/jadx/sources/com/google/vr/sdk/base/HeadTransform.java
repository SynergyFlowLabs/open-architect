package com.google.vr.sdk.base;

import android.opengl.Matrix;
import com.google.vr.cardboard.UsedByNative;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class HeadTransform {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f127525b = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f127526a;

    public HeadTransform() {
        float[] fArr = new float[16];
        this.f127526a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void a(float[] fArr, int i10) {
        float fAtan2;
        float fAtan3;
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float fAsin = (float) Math.asin(this.f127526a[6]);
        float f10 = this.f127526a[6];
        if (Math.sqrt(1.0f - (f10 * f10)) >= 0.009999999776482582d) {
            float[] fArr2 = this.f127526a;
            fAtan3 = (float) Math.atan2(-fArr2[2], fArr2[10]);
            float[] fArr3 = this.f127526a;
            fAtan2 = (float) Math.atan2(-fArr3[4], fArr3[5]);
        } else {
            float[] fArr4 = this.f127526a;
            fAtan2 = (float) Math.atan2(fArr4[1], fArr4[0]);
            fAtan3 = 0.0f;
        }
        fArr[i10] = -fAsin;
        fArr[i10 + 1] = -fAtan3;
        fArr[i10 + 2] = -fAtan2;
    }

    public void b(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = -this.f127526a[(i11 << 2) + 2];
        }
    }

    public void c(float[] fArr, int i10) {
        if (i10 + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        System.arraycopy(this.f127526a, 0, fArr, i10, 16);
    }

    public void d(float[] fArr, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (i10 + 4 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float[] fArr2 = this.f127526a;
        float f17 = fArr2[0];
        float f18 = fArr2[5];
        float f19 = fArr2[10];
        float f20 = f17 + f18 + f19;
        if (f20 >= 0.0f) {
            float fSqrt = (float) Math.sqrt(f20 + 1.0f);
            f16 = fSqrt * 0.5f;
            float f21 = 0.5f / fSqrt;
            f12 = (fArr2[9] - fArr2[6]) * f21;
            f13 = (fArr2[2] - fArr2[8]) * f21;
            f10 = (fArr2[4] - fArr2[1]) * f21;
        } else if (f17 <= f18 || f17 <= f19) {
            if (f18 > f19) {
                float fSqrt2 = (float) Math.sqrt(((f18 + 1.0f) - f17) - f19);
                f13 = fSqrt2 * 0.5f;
                f11 = 0.5f / fSqrt2;
                f12 = (fArr2[4] + fArr2[1]) * f11;
                f10 = (fArr2[9] + fArr2[6]) * f11;
                f14 = fArr2[2];
                f15 = fArr2[8];
            } else {
                float fSqrt3 = (float) Math.sqrt(((f19 + 1.0f) - f17) - f18);
                f10 = fSqrt3 * 0.5f;
                f11 = 0.5f / fSqrt3;
                f12 = (fArr2[2] + fArr2[8]) * f11;
                f13 = (fArr2[9] + fArr2[6]) * f11;
                f14 = fArr2[4];
                f15 = fArr2[1];
            }
            f16 = (f14 - f15) * f11;
        } else {
            float fSqrt4 = (float) Math.sqrt(((f17 + 1.0f) - f18) - f19);
            float f22 = 0.5f / fSqrt4;
            f13 = (fArr2[4] + fArr2[1]) * f22;
            f10 = (fArr2[2] + fArr2[8]) * f22;
            f12 = fSqrt4 * 0.5f;
            f16 = (fArr2[9] - fArr2[6]) * f22;
        }
        fArr[i10] = f12;
        fArr[i10 + 1] = f13;
        fArr[i10 + 2] = f10;
        fArr[i10 + 3] = f16;
    }

    public void e(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.f127526a[i11 << 2];
        }
    }

    public void f(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.f127526a[i11 + 12];
        }
    }

    public void g(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.f127526a[(i11 << 2) + 1];
        }
    }

    @UsedByNative
    public float[] getHeadView() {
        return this.f127526a;
    }
}
