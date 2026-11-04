package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f95105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f95106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f95107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f95108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f95109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f95111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f95112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f95113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f95114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a0 f95115k;

    public w() {
        this.f95112h = 1.0f;
        this.f95113i = 1.0f;
        this.f95114j = true;
        this.f95105a = new float[0];
    }

    public float a() {
        float[] fArrJ = j();
        return n.h(fArrJ, 0, fArrJ.length);
    }

    public boolean b(float f10, float f11) {
        float[] fArrJ = j();
        int length = fArrJ.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f12 = fArrJ[i10];
            float f13 = fArrJ[i10 + 1];
            int i12 = i10 + 2;
            float f14 = fArrJ[i12 % length];
            float f15 = fArrJ[(i10 + 3) % length];
            if (((f13 <= f11 && f11 < f15) || (f15 <= f11 && f11 < f13)) && f10 < (((f14 - f12) / (f15 - f13)) * (f11 - f13)) + f12) {
                i11++;
            }
            i10 = i12;
        }
        return (i11 & 1) == 1;
    }

    public void c() {
        this.f95114j = true;
    }

    public a0 d() {
        float[] fArrJ = j();
        float f10 = fArrJ[0];
        float f11 = fArrJ[1];
        int length = fArrJ.length;
        float f12 = f11;
        float f13 = f10;
        float f14 = f12;
        for (int i10 = 2; i10 < length; i10 += 2) {
            float f15 = fArrJ[i10];
            if (f10 > f15) {
                f10 = f15;
            }
            float f16 = fArrJ[i10 + 1];
            if (f14 > f16) {
                f14 = f16;
            }
            if (f13 < f15) {
                f13 = f15;
            }
            if (f12 < f16) {
                f12 = f16;
            }
        }
        if (this.f95115k == null) {
            this.f95115k = new a0();
        }
        a0 a0Var = this.f95115k;
        a0Var.f94886a = f10;
        a0Var.f94887b = f14;
        a0Var.f94888c = f13 - f10;
        a0Var.f94889d = f12 - f14;
        return a0Var;
    }

    public float e() {
        return this.f95109e;
    }

    public float f() {
        return this.f95110f;
    }

    public float g() {
        return this.f95111g;
    }

    public float h() {
        return this.f95112h;
    }

    public float i() {
        return this.f95113i;
    }

    public float[] j() {
        if (!this.f95114j) {
            return this.f95106b;
        }
        this.f95114j = false;
        float[] fArr = this.f95105a;
        float[] fArr2 = this.f95106b;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.f95106b = new float[fArr.length];
        }
        float[] fArr3 = this.f95106b;
        float f10 = this.f95107c;
        float f11 = this.f95108d;
        float f12 = this.f95109e;
        float f13 = this.f95110f;
        float f14 = this.f95112h;
        float f15 = this.f95113i;
        boolean z10 = (f14 == 1.0f && f15 == 1.0f) ? false : true;
        float f16 = this.f95111g;
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

    public float[] k() {
        return this.f95105a;
    }

    public float l() {
        return this.f95107c;
    }

    public float m() {
        return this.f95108d;
    }

    public void n(float f10) {
        this.f95111g += f10;
        this.f95114j = true;
    }

    public void o(float f10) {
        this.f95112h += f10;
        this.f95113i += f10;
        this.f95114j = true;
    }

    public void p(float f10, float f11) {
        this.f95109e = f10;
        this.f95110f = f11;
        this.f95114j = true;
    }

    public void q(float f10, float f11) {
        this.f95107c = f10;
        this.f95108d = f11;
        this.f95114j = true;
    }

    public void r(float f10) {
        this.f95111g = f10;
        this.f95114j = true;
    }

    public void s(float f10, float f11) {
        this.f95112h = f10;
        this.f95113i = f11;
        this.f95114j = true;
    }

    public void t(float[] fArr) {
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.f95105a = fArr;
        this.f95114j = true;
    }

    public void u(float f10, float f11) {
        this.f95107c += f10;
        this.f95108d += f11;
        this.f95114j = true;
    }

    public w(float[] fArr) {
        this.f95112h = 1.0f;
        this.f95113i = 1.0f;
        this.f95114j = true;
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.f95105a = fArr;
    }
}
