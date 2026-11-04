package com.badlogic.gdx.graphics.g3d.environment;

import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f94390a;

    public a() {
        this.f94390a = new float[18];
    }

    private static final float i(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public a a(float f10, float f11, float f12) {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f94390a;
            if (i10 >= fArr.length) {
                return this;
            }
            int i11 = i10 + 1;
            fArr[i10] = fArr[i10] + f10;
            int i12 = i10 + 2;
            fArr[i11] = fArr[i11] + f11;
            i10 += 3;
            fArr[i12] = fArr[i12] + f12;
        }
    }

    public a b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 * f13;
        float f17 = f14 * f14;
        float f18 = f15 * f15;
        float f19 = f16 + f17 + f18;
        if (f19 == 0.0f) {
            return this;
        }
        float f20 = (1.0f / f19) * (f19 + 1.0f);
        float f21 = f10 * f20;
        float f22 = f11 * f20;
        float f23 = f12 * f20;
        int i10 = f13 > 0.0f ? 0 : 3;
        float[] fArr = this.f94390a;
        fArr[i10] = fArr[i10] + (f16 * f21);
        int i11 = i10 + 1;
        fArr[i11] = fArr[i11] + (f16 * f22);
        int i12 = i10 + 2;
        fArr[i12] = fArr[i12] + (f16 * f23);
        int i13 = f14 > 0.0f ? 6 : 9;
        fArr[i13] = fArr[i13] + (f17 * f21);
        int i14 = i13 + 1;
        fArr[i14] = fArr[i14] + (f17 * f22);
        int i15 = i13 + 2;
        fArr[i15] = fArr[i15] + (f17 * f23);
        int i16 = f15 > 0.0f ? 12 : 15;
        fArr[i16] = fArr[i16] + (f21 * f18);
        int i17 = i16 + 1;
        fArr[i17] = fArr[i17] + (f22 * f18);
        int i18 = i16 + 2;
        fArr[i18] = fArr[i18] + (f18 * f23);
        return this;
    }

    public a c(float f10, float f11, float f12, d0 d0Var) {
        return b(f10, f11, f12, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public a d(com.badlogic.gdx.graphics.b bVar) {
        return a(bVar.f94187a, bVar.f94188b, bVar.f94189c);
    }

    public a e(com.badlogic.gdx.graphics.b bVar, float f10, float f11, float f12) {
        return b(bVar.f94187a, bVar.f94188b, bVar.f94189c, f10, f11, f12);
    }

    public a f(com.badlogic.gdx.graphics.b bVar, d0 d0Var) {
        return b(bVar.f94187a, bVar.f94188b, bVar.f94189c, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public a g(com.badlogic.gdx.graphics.b bVar, d0 d0Var, d0 d0Var2) {
        return b(bVar.f94187a, bVar.f94188b, bVar.f94189c, d0Var2.f180482a - d0Var.f180482a, d0Var2.f180483b - d0Var.f180483b, d0Var2.f180484c - d0Var.f180484c);
    }

    public a h(com.badlogic.gdx.graphics.b bVar, d0 d0Var, d0 d0Var2, float f10) {
        float fH = f10 / (d0Var2.H(d0Var) + 1.0f);
        return b(bVar.f94187a * fH, bVar.f94188b * fH, bVar.f94189c * fH, d0Var2.f180482a - d0Var.f180482a, d0Var2.f180483b - d0Var.f180483b, d0Var2.f180484c - d0Var.f180484c);
    }

    public a j() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f94390a;
            if (i10 >= fArr.length) {
                return this;
            }
            fArr[i10] = i(fArr[i10]);
            i10++;
        }
    }

    public a k() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f94390a;
            if (i10 >= fArr.length) {
                return this;
            }
            fArr[i10] = 0.0f;
            i10++;
        }
    }

    public com.badlogic.gdx.graphics.b l(com.badlogic.gdx.graphics.b bVar, int i10) {
        int i11 = i10 * 3;
        float[] fArr = this.f94390a;
        return bVar.B(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], 1.0f);
    }

    public a m(float f10, float f11, float f12) {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f94390a;
            if (i10 >= fArr.length) {
                return this;
            }
            fArr[i10] = f10;
            int i11 = i10 + 2;
            fArr[i10 + 1] = f11;
            i10 += 3;
            fArr[i11] = f12;
        }
    }

    public a n(com.badlogic.gdx.graphics.b bVar) {
        return m(bVar.f94187a, bVar.f94188b, bVar.f94189c);
    }

    public a o(a aVar) {
        return p(aVar.f94390a);
    }

    public a p(float[] fArr) {
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f94390a;
            if (i10 >= fArr2.length) {
                return this;
            }
            fArr2[i10] = fArr[i10];
            i10++;
        }
    }

    public String toString() {
        String str = "";
        for (int i10 = 0; i10 < this.f94390a.length; i10 += 3) {
            str = str + Float.toString(this.f94390a[i10]) + ", " + Float.toString(this.f94390a[i10 + 1]) + ", " + Float.toString(this.f94390a[i10 + 2]) + "\n";
        }
        return str;
    }

    public a(float[] fArr) {
        if (fArr.length != 18) {
            throw new t("Incorrect array size");
        }
        float[] fArr2 = new float[fArr.length];
        this.f94390a = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    public a(a aVar) {
        this(aVar.f94390a);
    }
}
