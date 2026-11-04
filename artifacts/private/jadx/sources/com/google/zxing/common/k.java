package com.google.zxing.common;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f130337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f130338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f130339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f130340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f130341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f130342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f130343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f130344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f130345i;

    private k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f130337a = f10;
        this.f130338b = f13;
        this.f130339c = f16;
        this.f130340d = f11;
        this.f130341e = f14;
        this.f130342f = f17;
        this.f130343g = f12;
        this.f130344h = f15;
        this.f130345i = f18;
    }

    public static k b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static k c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static k d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new k(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new k((f12 - f10) + (f25 * f12), (f16 - f10) + (f26 * f16), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    k a() {
        float f10 = this.f130341e;
        float f11 = this.f130345i;
        float f12 = this.f130342f;
        float f13 = this.f130344h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f130343g;
        float f16 = this.f130340d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f130339c;
        float f20 = this.f130338b;
        float f21 = this.f130337a;
        return new k(f14, f17, f18, (f19 * f13) - (f20 * f11), (f11 * f21) - (f19 * f15), (f15 * f20) - (f13 * f21), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f21), (f21 * f10) - (f20 * f16));
    }

    k e(k kVar) {
        float f10 = this.f130337a;
        float f11 = kVar.f130337a;
        float f12 = this.f130340d;
        float f13 = kVar.f130338b;
        float f14 = this.f130343g;
        float f15 = kVar.f130339c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = kVar.f130340d;
        float f18 = kVar.f130341e;
        float f19 = kVar.f130342f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = kVar.f130343g;
        float f22 = kVar.f130344h;
        float f23 = kVar.f130345i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f130338b;
        float f26 = this.f130341e;
        float f27 = (f25 * f11) + (f26 * f13);
        float f28 = this.f130344h;
        float f29 = f27 + (f28 * f15);
        float f30 = (f25 * f17) + (f26 * f18) + (f28 * f19);
        float f31 = (f25 * f21) + (f26 * f22) + (f28 * f23);
        float f32 = this.f130339c;
        float f33 = f11 * f32;
        float f34 = this.f130342f;
        float f35 = this.f130345i;
        return new k(f16, f20, f24, f29, f30, f31, f33 + (f13 * f34) + (f15 * f35), (f32 * f17) + (f18 * f34) + (f19 * f35), (f32 * f21) + (f34 * f22) + (f35 * f23));
    }

    public void f(float[] fArr) {
        int length = fArr.length;
        float f10 = this.f130337a;
        float f11 = this.f130338b;
        float f12 = this.f130339c;
        float f13 = this.f130340d;
        float f14 = this.f130341e;
        float f15 = this.f130342f;
        float f16 = this.f130343g;
        float f17 = this.f130344h;
        float f18 = this.f130345i;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }

    public void g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f10 = fArr[i10];
            float f11 = fArr2[i10];
            float f12 = (this.f130339c * f10) + (this.f130342f * f11) + this.f130345i;
            fArr[i10] = (((this.f130337a * f10) + (this.f130340d * f11)) + this.f130343g) / f12;
            fArr2[i10] = (((this.f130338b * f10) + (this.f130341e * f11)) + this.f130344h) / f12;
        }
    }
}
