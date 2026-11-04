package com.badlogic.gdx.math;

import com.badlogic.gdx.math.e0;

/* JADX INFO: loaded from: classes3.dex */
public class e<T extends e0<T>> implements u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f94935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f94936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f94938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f94939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f94940f;

    public e() {
    }

    public static <T extends e0<T>> T i(T t10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        if (!z10) {
            length -= 3;
        }
        float f11 = length * f10;
        int i10 = f10 >= 1.0f ? length - 1 : (int) f11;
        return (T) j(t10, i10, f11 - i10, tArr, z10, t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T j(T t10, int i10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        float f11 = f10 * f10;
        float f12 = f11 * f10;
        t10.L(tArr[i10]).c(((1.5f * f12) - (2.5f * f11)) + 1.0f);
        if (z10 || i10 > 0) {
            t10.i(t11.L(tArr[((length + i10) - 1) % length]).c((((-0.5f) * f12) + f11) - (f10 * 0.5f)));
        }
        if (z10 || i10 < length - 1) {
            t10.i(t11.L(tArr[(i10 + 1) % length]).c(((-1.5f) * f12) + (2.0f * f11) + (f10 * 0.5f)));
        }
        if (!z10 && i10 >= length - 2) {
            return t10;
        }
        t10.i(t11.L(tArr[(i10 + 2) % length]).c((f12 * 0.5f) - (f11 * 0.5f)));
        return t10;
    }

    public static <T extends e0<T>> T k(T t10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        if (!z10) {
            length -= 3;
        }
        float f11 = length * f10;
        int i10 = f10 >= 1.0f ? length - 1 : (int) f11;
        return (T) l(t10, i10, f11 - i10, tArr, z10, t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T l(T t10, int i10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        float f11 = f10 * f10;
        float f12 = -f10;
        float f13 = 4.5f * f11;
        t10.L(tArr[i10]).c((5.0f * f12) + f13);
        if (z10 || i10 > 0) {
            t10.i(t11.L(tArr[((length + i10) - 1) % length]).c(((2.0f * f10) - 0.5f) - (f11 * 1.5f)));
        }
        if (z10 || i10 < length - 1) {
            t10.i(t11.L(tArr[(i10 + 1) % length]).c(((f10 * 4.0f) + 0.5f) - f13));
        }
        if (!z10 && i10 >= length - 2) {
            return t10;
        }
        t10.i(t11.L(tArr[(i10 + 2) % length]).c(f12 + (f11 * 1.5f)));
        return t10;
    }

    @Override // com.badlogic.gdx.math.u
    public float b(int i10) {
        float fH = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94939e.L(this.f94940f);
            d(this.f94940f, i11 / (i10 - 1.0f));
            if (i11 > 0) {
                fH += this.f94939e.H(this.f94940f);
            }
        }
        return fH;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t10) {
        return g(t10, p(t10));
    }

    public float g(T t10, int i10) {
        T[] tArr = this.f94935a;
        T t11 = tArr[i10];
        T t12 = tArr[i10 > 0 ? i10 - 1 : this.f94937c - 1];
        T t13 = tArr[(i10 + 1) % this.f94937c];
        if (t10.l(t13) >= t10.l(t12)) {
            if (i10 <= 0) {
                i10 = this.f94937c;
            }
            i10--;
            t13 = t11;
            t11 = t12;
        }
        float fL = t11.l(t13);
        float fL2 = t10.l(t13);
        float fL3 = t10.l(t11);
        float fSqrt = (float) Math.sqrt(fL);
        return (i10 + s.e((fSqrt - (((fL2 + fL) - fL3) / (2.0f * fSqrt))) / fSqrt, 0.0f, 1.0f)) / this.f94937c;
    }

    public float h(T t10, int i10, int i11) {
        return g(t10, q(t10, i10, i11));
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public T c(T t10, float f10) {
        int i10 = this.f94937c;
        float f11 = i10 * f10;
        int i11 = f10 >= 1.0f ? i10 - 1 : (int) f11;
        return (T) n(t10, i11, f11 - i11);
    }

    public T n(T t10, int i10, float f10) {
        boolean z10 = this.f94936b;
        if (!z10) {
            i10++;
        }
        return (T) l(t10, i10, f10, this.f94935a, z10, this.f94938d);
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public float a(T t10) {
        return e(t10);
    }

    public int p(T t10) {
        return q(t10, 0, this.f94937c);
    }

    public int q(T t10, int i10, int i11) {
        while (i10 < 0) {
            i10 += this.f94937c;
        }
        int i12 = i10 % this.f94937c;
        float fL = t10.l(this.f94935a[i12]);
        for (int i13 = 1; i13 < i11; i13++) {
            int i14 = (i10 + i13) % this.f94937c;
            float fL2 = t10.l(this.f94935a[i14]);
            if (fL2 < fL) {
                i12 = i14;
                fL = fL2;
            }
        }
        return i12;
    }

    public e r(T[] tArr, boolean z10) {
        if (this.f94938d == null) {
            this.f94938d = (T) tArr[0].k();
        }
        if (this.f94939e == null) {
            this.f94939e = (T) tArr[0].k();
        }
        if (this.f94940f == null) {
            this.f94940f = (T) tArr[0].k();
        }
        this.f94935a = tArr;
        this.f94936b = z10;
        int length = tArr.length;
        if (!z10) {
            length -= 3;
        }
        this.f94937c = length;
        return this;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public T d(T t10, float f10) {
        int i10 = this.f94937c;
        float f11 = i10 * f10;
        int i11 = f10 >= 1.0f ? i10 - 1 : (int) f11;
        return (T) t(t10, i11, f11 - i11);
    }

    public T t(T t10, int i10, float f10) {
        boolean z10 = this.f94936b;
        if (!z10) {
            i10++;
        }
        return (T) j(t10, i10, f10, this.f94935a, z10, this.f94938d);
    }

    public e(T[] tArr, boolean z10) {
        r(tArr, z10);
    }
}
