package com.google.vr.sdk.controller;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f127682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f127683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f127684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f127685d;

    public c() {
        c(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static c a(float f10, float f11, float f12, float f13) {
        double d10 = f13 / 2.0f;
        return new c((float) Math.sin(((double) f10) * Math.toRadians(d10)), (float) Math.sin(((double) f11) * Math.toRadians(d10)), (float) Math.sin(((double) f12) * Math.toRadians(d10)), (float) Math.cos(Math.toRadians(d10)));
    }

    void b(c cVar) {
        float f10 = this.f127682a;
        float f11 = this.f127683b;
        float f12 = this.f127684c;
        float f13 = this.f127685d;
        float f14 = cVar.f127685d;
        float f15 = (f14 * f10) + (cVar.f127682a * f13);
        float f16 = cVar.f127684c;
        float f17 = cVar.f127683b;
        this.f127682a = (f15 + (f16 * f11)) - (f17 * f12);
        float f18 = (f14 * f11) + (f17 * f13);
        float f19 = cVar.f127682a;
        this.f127683b = (f18 + (f19 * f12)) - (f16 * f10);
        float f20 = (f14 * f12) + (f16 * f13);
        float f21 = cVar.f127683b;
        this.f127684c = (f20 + (f21 * f10)) - (f19 * f11);
        this.f127685d = (((f14 * f13) - (f19 * f10)) - (f21 * f11)) - (cVar.f127684c * f12);
    }

    public void c(float f10, float f11, float f12, float f13) {
        this.f127682a = f10;
        this.f127683b = f11;
        this.f127684c = f12;
        this.f127685d = f13;
    }

    void d(c cVar) {
        c(cVar.f127682a, cVar.f127683b, cVar.f127684c, cVar.f127685d);
    }

    public void e(float[] fArr) {
        c(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    float[] f(float[] fArr) {
        float f10 = this.f127685d;
        float fSqrt = (float) Math.sqrt(1.0f - (f10 * f10));
        if (fSqrt > 0.0f) {
            fArr[0] = this.f127682a / fSqrt;
            fArr[1] = this.f127683b / fSqrt;
            fArr[2] = this.f127684c / fSqrt;
            fArr[3] = (float) Math.toDegrees(Math.acos(this.f127685d) * 2.0d);
            return fArr;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        return fArr;
    }

    public String g() {
        float[] fArrF = f(new float[4]);
        return String.format(Locale.US, "(%5.2f, %5.2f, %5.2f), %3.0f°", Float.valueOf(fArrF[0]), Float.valueOf(fArrF[1]), Float.valueOf(fArrF[2]), Float.valueOf(fArrF[3]));
    }

    public float[] h(float[] fArr) {
        float f10 = this.f127682a;
        float f11 = this.f127684c;
        float f12 = this.f127685d;
        float f13 = this.f127683b;
        fArr[0] = ((f10 * f11) + (f12 * f13)) * (-2.0f);
        fArr[1] = ((f12 * f10) - (f13 * f11)) * 2.0f;
        fArr[2] = ((((-f12) * f12) + (f10 * f10)) + (f13 * f13)) - (f11 * f11);
        return fArr;
    }

    public float[] i(float[] fArr) {
        float f10 = this.f127683b;
        float f11 = this.f127684c;
        fArr[0] = (1.0f - ((f10 * 2.0f) * f10)) - ((f11 * 2.0f) * f11);
        float f12 = this.f127682a;
        float f13 = this.f127685d;
        fArr[1] = (f12 * 2.0f * f10) + (f11 * 2.0f * f13);
        fArr[2] = ((f12 * 2.0f) * f11) - ((f10 * 2.0f) * f13);
        fArr[3] = 0.0f;
        fArr[4] = ((f12 * 2.0f) * f10) - ((f11 * 2.0f) * f13);
        fArr[5] = (1.0f - ((f12 * 2.0f) * f12)) - ((f11 * 2.0f) * f11);
        fArr[6] = (f10 * 2.0f * f11) + (f12 * 2.0f * f13);
        fArr[7] = 0.0f;
        fArr[8] = (f12 * 2.0f * f11) + (f10 * 2.0f * f13);
        fArr[9] = ((f10 * 2.0f) * f11) - ((f12 * 2.0f) * f13);
        fArr[10] = (1.0f - ((f12 * 2.0f) * f12)) - ((2.0f * f10) * f10);
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    public float[] j(float[] fArr) {
        float[] fArrK = k(fArr);
        for (int i10 = 0; i10 < 3; i10++) {
            fArrK[i10] = (float) Math.toDegrees(fArrK[i10]);
        }
        return fArrK;
    }

    public float[] k(float[] fArr) {
        if (fArr == null) {
            fArr = new float[3];
        }
        h(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        int i10 = 1 & 2;
        float f12 = fArr[2];
        if (Math.abs(f11) >= 0.9999f) {
            fArr[0] = (float) (((double) Math.copySign(2.0f, f11)) * Math.atan2(this.f127684c, this.f127685d));
            fArr[1] = (float) Math.copySign(1.5707963267948966d, f11);
            fArr[2] = 0.0f;
            return fArr;
        }
        fArr[0] = (float) Math.atan2(-f10, -f12);
        fArr[1] = (float) Math.asin(f11);
        float f13 = this.f127685d * 2.0f;
        float f14 = this.f127684c;
        float f15 = this.f127682a;
        fArr[2] = (float) Math.atan2((f13 * f14) + (f15 * 2.0f * this.f127683b), (1.0f - ((f15 * 2.0f) * f15)) - ((2.0f * f14) * f14));
        return fArr;
    }

    public String toString() {
        return String.format(Locale.US, "%5.2fi %5.2fj %5.2fk %5.2f", Float.valueOf(this.f127682a), Float.valueOf(this.f127683b), Float.valueOf(this.f127684c), Float.valueOf(this.f127685d));
    }

    public c(float f10, float f11, float f12, float f13) {
        c(f10, f11, f12, f13);
    }
}
