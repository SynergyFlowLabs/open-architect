package com.google.vr.sdk.base;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f127536b = {0.34f, 0.55f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f127537c = {0.441f, 0.156f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f127538a;

    public d() {
        this.f127538a = (float[]) f127536b.clone();
    }

    public static d a() {
        d dVar = new d();
        dVar.f127538a = (float[]) f127537c.clone();
        return dVar;
    }

    public static d h(float[] fArr) {
        d dVar = new d();
        dVar.i(fArr);
        return dVar;
    }

    private static double[] j(double[][] dArr, double[] dArr2) {
        int length = dArr.length;
        int length2 = dArr[0].length;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length2, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                double d10 = 0.0d;
                for (double[] dArr4 : dArr) {
                    d10 += dArr4[i11] * dArr4[i10];
                }
                dArr3[i11][i10] = d10;
            }
        }
        double[] dArr5 = new double[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            double d11 = 0.0d;
            for (int i13 = 0; i13 < length; i13++) {
                d11 += dArr[i13][i12] * dArr2[i13];
            }
            dArr5[i12] = d11;
        }
        return k(dArr3, dArr5);
    }

    private static double[] k(double[][] dArr, double[] dArr2) {
        int i10;
        int i11 = 0;
        int length = dArr[0].length;
        while (true) {
            i10 = length - 1;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < length; i13++) {
                double d10 = dArr[i13][i11] / dArr[i11][i11];
                for (int i14 = i12; i14 < length; i14++) {
                    double[] dArr3 = dArr[i13];
                    dArr3[i14] = dArr3[i14] - (dArr[i11][i14] * d10);
                }
                dArr2[i13] = dArr2[i13] - (d10 * dArr2[i11]);
            }
            i11 = i12;
        }
        double[] dArr4 = new double[length];
        while (i10 >= 0) {
            double d11 = dArr2[i10];
            for (int i15 = i10 + 1; i15 < length; i15++) {
                d11 -= dArr[i10][i15] * dArr4[i15];
            }
            dArr4[i10] = d11 / dArr[i10][i10];
            i10--;
        }
        return dArr4;
    }

    public float b(float f10) {
        return f10 * d(f10);
    }

    public float c(float f10) {
        float f11 = f10 / 0.9f;
        float fB = f10 - b(f11);
        float f12 = 0.9f * f10;
        float f13 = f11;
        while (true) {
            float f14 = f12 - f13;
            if (Math.abs(f14) <= 1.0E-4d) {
                return f12;
            }
            float fB2 = f10 - b(f12);
            float f15 = f12 - ((f14 / (fB2 - fB)) * fB2);
            float f16 = f12;
            f12 = f15;
            f13 = f16;
            fB = fB2;
        }
    }

    public float d(float f10) {
        float f11 = f10 * f10;
        float f12 = 1.0f;
        float f13 = 1.0f;
        for (float f14 : this.f127538a) {
            f13 *= f11;
            f12 += f14 * f13;
        }
        return f12;
    }

    @Deprecated
    public d e(float f10) {
        return f(f10, 2);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return Arrays.equals(this.f127538a, ((d) obj).f127538a);
        }
        return false;
    }

    public d f(float f10, int i10) {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 100, i10);
        double[] dArr2 = new double[100];
        int i11 = 0;
        while (i11 < 100) {
            int i12 = i11 + 1;
            float f11 = (i12 * f10) / 100.0f;
            double dB = b(f11);
            double d10 = dB;
            for (int i13 = 0; i13 < i10; i13++) {
                d10 *= dB * dB;
                dArr[i11][i13] = d10;
            }
            dArr2[i11] = ((double) f11) - dB;
            i11 = i12;
        }
        double[] dArrJ = j(dArr, dArr2);
        float[] fArr = new float[dArrJ.length];
        for (int i14 = 0; i14 < dArrJ.length; i14++) {
            fArr[i14] = (float) dArrJ[i14];
        }
        d dVar = new d();
        dVar.i(fArr);
        return dVar;
    }

    public float[] g() {
        return this.f127538a;
    }

    public void i(float[] fArr) {
        this.f127538a = fArr != null ? (float[]) fArr.clone() : new float[0];
    }

    public float[] l() {
        return (float[]) this.f127538a.clone();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        sb2.append("  coefficients: [");
        int i10 = 0;
        while (true) {
            float[] fArr = this.f127538a;
            if (i10 >= fArr.length) {
                sb2.append("],\n}");
                return sb2.toString();
            }
            sb2.append(Float.toString(fArr[i10]));
            if (i10 < this.f127538a.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public d(d dVar) {
        i(dVar.f127538a);
    }
}
