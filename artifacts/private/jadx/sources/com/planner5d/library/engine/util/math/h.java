package com.planner5d.library.engine.util.math;

/* JADX INFO: loaded from: classes5.dex */
public class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f165491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f165492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f165493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f165494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f165495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f165496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f165497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f165498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f165499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f165500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f165501k;

    public h() {
        this.f165498h = 1.0f;
        this.f165499i = 1.0f;
        this.f165500j = true;
        this.f165491a = new float[0];
    }

    private float n(float[] fArr, int i10, int i11) {
        int i12 = i11 + i10;
        float f10 = 0.0f;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = i15 % i12;
            if (i16 < i10) {
                i16 += i10;
            }
            int i17 = (i13 + 3) % i12;
            if (i17 < i10) {
                i17 += i10;
            }
            f10 = (f10 + (fArr[i13] * fArr[i17])) - (fArr[i16] * fArr[i14]);
            i13 = i15;
        }
        return f10 * 0.5f;
    }

    public float a() {
        float[] fArrJ = j();
        return n(fArrJ, 0, fArrJ.length);
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
        this.f165500j = true;
    }

    public l d() {
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
        if (this.f165501k == null) {
            this.f165501k = new l();
        }
        l lVar = this.f165501k;
        lVar.f165520a = f10;
        lVar.f165521b = f14;
        lVar.f165522c = f13 - f10;
        lVar.f165523d = f12 - f14;
        return lVar;
    }

    public float e() {
        return this.f165495e;
    }

    public float f() {
        return this.f165496f;
    }

    public float g() {
        return this.f165497g;
    }

    public float h() {
        return this.f165498h;
    }

    public float i() {
        return this.f165499i;
    }

    public float[] j() {
        if (!this.f165500j) {
            return this.f165492b;
        }
        this.f165500j = false;
        float[] fArr = this.f165491a;
        float[] fArr2 = this.f165492b;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.f165492b = new float[fArr.length];
        }
        float[] fArr3 = this.f165492b;
        float f10 = this.f165493c;
        float f11 = this.f165494d;
        float f12 = this.f165495e;
        float f13 = this.f165496f;
        float f14 = this.f165498h;
        float f15 = this.f165499i;
        boolean z10 = (f14 == 1.0f && f15 == 1.0f) ? false : true;
        float f16 = this.f165497g;
        float fJ = e.j(f16);
        float fM = e.M(f16);
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
        return this.f165491a;
    }

    public float l() {
        return this.f165493c;
    }

    public float m() {
        return this.f165494d;
    }

    public void o(float f10) {
        this.f165497g += f10;
        this.f165500j = true;
    }

    public void p(float f10) {
        this.f165498h += f10;
        this.f165499i += f10;
        this.f165500j = true;
    }

    public void q(float f10, float f11) {
        this.f165495e = f10;
        this.f165496f = f11;
        this.f165500j = true;
    }

    public void r(float f10, float f11) {
        this.f165493c = f10;
        this.f165494d = f11;
        this.f165500j = true;
    }

    public void s(float f10) {
        this.f165497g = f10;
        this.f165500j = true;
    }

    public void t(float f10, float f11) {
        this.f165498h = f10;
        this.f165499i = f11;
        this.f165500j = true;
    }

    public void u(float[] fArr) {
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.f165491a = fArr;
        this.f165500j = true;
    }

    public void v(float f10, float f11) {
        this.f165493c += f10;
        this.f165494d += f11;
        this.f165500j = true;
    }

    public h(float[] fArr) {
        this.f165498h = 1.0f;
        this.f165499i = 1.0f;
        this.f165500j = true;
        if (fArr.length < 6) {
            throw new IllegalArgumentException("polygons must contain at least 3 points.");
        }
        this.f165491a = fArr;
    }
}
