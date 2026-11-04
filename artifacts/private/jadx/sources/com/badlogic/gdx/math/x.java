package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class x implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f95116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f95117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f95118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f95119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f95120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f95122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f95124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f95125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f95126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f95127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f95128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f95129n;

    public x() {
        this.f95123h = 1.0f;
        this.f95124i = 1.0f;
        int i10 = 3 | 1;
        this.f95127l = true;
        this.f95128m = true;
        this.f95129n = true;
        this.f95116a = new float[0];
    }

    public void a() {
        this.f95128m = true;
    }

    public void b() {
        this.f95127l = true;
    }

    public void c() {
        this.f95129n = true;
    }

    public float d() {
        if (!this.f95128m) {
            return this.f95125j;
        }
        int i10 = 0;
        this.f95128m = false;
        this.f95125j = 0.0f;
        int length = this.f95116a.length - 2;
        while (i10 < length) {
            float[] fArr = this.f95116a;
            int i11 = i10 + 2;
            float f10 = fArr[i11] - fArr[i10];
            float f11 = fArr[i10 + 1] - fArr[i10 + 3];
            this.f95125j += (float) Math.sqrt((f10 * f10) + (f11 * f11));
            i10 = i11;
        }
        return this.f95125j;
    }

    public float e() {
        return this.f95120e;
    }

    public float f() {
        return this.f95121f;
    }

    public float g() {
        return this.f95122g;
    }

    public float h() {
        return this.f95123h;
    }

    public float i() {
        return this.f95124i;
    }

    public float j() {
        if (!this.f95127l) {
            return this.f95126k;
        }
        int i10 = 0;
        this.f95127l = false;
        this.f95126k = 0.0f;
        int length = this.f95116a.length - 2;
        while (i10 < length) {
            float[] fArr = this.f95116a;
            int i11 = i10 + 2;
            float f10 = fArr[i11];
            float f11 = this.f95123h;
            float f12 = (f10 * f11) - (fArr[i10] * f11);
            float f13 = fArr[i10 + 1];
            float f14 = this.f95124i;
            float f15 = (f13 * f14) - (fArr[i10 + 3] * f14);
            this.f95126k += (float) Math.sqrt((f12 * f12) + (f15 * f15));
            i10 = i11;
        }
        return this.f95126k;
    }

    public float[] k() {
        if (!this.f95129n) {
            return this.f95117b;
        }
        this.f95129n = false;
        float[] fArr = this.f95116a;
        float[] fArr2 = this.f95117b;
        if (fArr2 == null || fArr2.length < fArr.length) {
            this.f95117b = new float[fArr.length];
        }
        float[] fArr3 = this.f95117b;
        float f10 = this.f95118c;
        float f11 = this.f95119d;
        float f12 = this.f95120e;
        float f13 = this.f95121f;
        float f14 = this.f95123h;
        float f15 = this.f95124i;
        boolean z10 = (f14 == 1.0f && f15 == 1.0f) ? false : true;
        float f16 = this.f95122g;
        float fJ = s.j(f16);
        float fM = s.M(f16);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f17 = fArr[i10] - f12;
            int i11 = i10 + 1;
            float f18 = fArr[i11] - f13;
            if (z10) {
                f17 *= f14;
                f18 *= f15;
            }
            if (f16 != 0.0f) {
                float f19 = (fJ * f17) - (fM * f18);
                f18 = (f17 * fM) + (f18 * fJ);
                f17 = f19;
            }
            fArr3[i10] = f17 + f10 + f12;
            fArr3[i11] = f11 + f18 + f13;
        }
        return fArr3;
    }

    public float[] l() {
        return this.f95116a;
    }

    public float m() {
        return this.f95118c;
    }

    public float n() {
        return this.f95119d;
    }

    public void o(float f10) {
        this.f95122g += f10;
        this.f95129n = true;
    }

    public void p(float f10) {
        this.f95123h += f10;
        this.f95124i += f10;
        this.f95129n = true;
        this.f95127l = true;
    }

    public void q(float f10, float f11) {
        this.f95120e = f10;
        this.f95121f = f11;
        boolean z10 = !false;
        this.f95129n = true;
    }

    public void r(float f10, float f11) {
        this.f95118c = f10;
        this.f95119d = f11;
        this.f95129n = true;
    }

    public void s(float f10) {
        this.f95122g = f10;
        this.f95129n = true;
    }

    public void t(float f10, float f11) {
        this.f95123h = f10;
        this.f95124i = f11;
        this.f95129n = true;
        this.f95127l = true;
    }

    public void u(float[] fArr) {
        if (fArr.length < 4) {
            throw new IllegalArgumentException("polylines must contain at least 2 points.");
        }
        this.f95116a = fArr;
        this.f95129n = true;
    }

    public void v(float f10, float f11) {
        this.f95118c += f10;
        this.f95119d += f11;
        this.f95129n = true;
    }

    public x(float[] fArr) {
        this.f95123h = 1.0f;
        this.f95124i = 1.0f;
        this.f95127l = true;
        this.f95128m = true;
        this.f95129n = true;
        if (fArr.length >= 4) {
            this.f95116a = fArr;
            return;
        }
        throw new IllegalArgumentException("polylines must contain at least 2 points.");
    }
}
