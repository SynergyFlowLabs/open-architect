package com.badlogic.gdx.math;

import com.badlogic.gdx.math.e0;

/* JADX INFO: loaded from: classes3.dex */
public class b<T extends e0<T>> implements u<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f94890i = 0.16666667f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f94891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.b<T> f94892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f94896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T f94897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private T f94898h;

    public b() {
    }

    public static <T extends e0<T>> T i(T t10, float f10, T[] tArr, int i10, boolean z10, T t11) {
        int length = tArr.length;
        if (!z10) {
            length -= i10;
        }
        float f11 = length * f10;
        int i11 = f10 >= 1.0f ? length - 1 : (int) f11;
        return (T) j(t10, i11, f11 - i11, tArr, i10, z10, t11);
    }

    public static <T extends e0<T>> T j(T t10, int i10, float f10, T[] tArr, int i11, boolean z10, T t11) {
        return i11 != 3 ? t10 : (T) l(t10, i10, f10, tArr, z10, t11);
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
        float f11 = 1.0f - f10;
        float f12 = f10 * f10;
        float f13 = f12 * f10;
        t10.L(tArr[i10]).c((((f13 * 3.0f) - (6.0f * f12)) + 4.0f) * f94890i);
        if (z10 || i10 > 0) {
            t10.i(t11.L(tArr[((length + i10) - 1) % length]).c(f11 * f11 * f11 * f94890i));
        }
        if (z10 || i10 < length - 1) {
            t10.i(t11.L(tArr[(i10 + 1) % length]).c((((-3.0f) * f13) + (f12 * 3.0f) + (f10 * 3.0f) + 1.0f) * f94890i));
        }
        if (!z10 && i10 >= length - 2) {
            return t10;
        }
        t10.i(t11.L(tArr[(i10 + 2) % length]).c(f13 * f94890i));
        return t10;
    }

    public static <T extends e0<T>> T m(T t10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        if (!z10) {
            length -= 3;
        }
        float f11 = length * f10;
        int i10 = f10 >= 1.0f ? length - 1 : (int) f11;
        return (T) l(t10, i10, f11 - i10, tArr, z10, t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T n(T t10, int i10, float f10, T[] tArr, boolean z10, T t11) {
        int length = tArr.length;
        float f11 = 1.0f - f10;
        float f12 = f10 * f10;
        t10.L(tArr[i10]).c((1.5f * f12) - (2.0f * f10));
        if (z10 || i10 > 0) {
            t10.i(t11.L(tArr[((length + i10) - 1) % length]).c(f11 * 0.5f * f11));
        }
        if (z10 || i10 < length - 1) {
            t10.i(t11.L(tArr[(i10 + 1) % length]).c(((-1.5f) * f12) + f10 + 0.5f));
        }
        if (!z10 && i10 >= length - 2) {
            return t10;
        }
        t10.i(t11.L(tArr[(i10 + 2) % length]).c(f12 * 0.5f));
        return t10;
    }

    public static <T extends e0<T>> T o(T t10, float f10, T[] tArr, int i10, boolean z10, T t11) {
        int length = tArr.length;
        if (!z10) {
            length -= i10;
        }
        float f11 = length * f10;
        int i11 = f10 >= 1.0f ? length - 1 : (int) f11;
        return (T) p(t10, i11, f11 - i11, tArr, i10, z10, t11);
    }

    public static <T extends e0<T>> T p(T t10, int i10, float f10, T[] tArr, int i11, boolean z10, T t11) {
        return i11 != 3 ? t10 : (T) n(t10, i10, f10, tArr, z10, t11);
    }

    @Override // com.badlogic.gdx.math.u
    public float b(int i10) {
        float fH = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94897g.L(this.f94898h);
            d(this.f94898h, i11 / (i10 - 1.0f));
            if (i11 > 0) {
                fH += this.f94897g.H(this.f94898h);
            }
        }
        return fH;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t10) {
        return g(t10, t(t10));
    }

    public float g(T t10, int i10) {
        T t11 = this.f94892b.get(i10);
        T t12 = this.f94892b.get(i10 > 0 ? i10 - 1 : this.f94895e - 1);
        T t13 = this.f94892b.get((i10 + 1) % this.f94895e);
        if (t10.l(t13) >= t10.l(t12)) {
            if (i10 <= 0) {
                i10 = this.f94895e;
            }
            i10--;
            t13 = t11;
            t11 = t12;
        }
        float fL = t11.l(t13);
        float fL2 = t10.l(t13);
        float fL3 = t10.l(t11);
        float fSqrt = (float) Math.sqrt(fL);
        return (i10 + s.e((fSqrt - (((fL2 + fL) - fL3) / (2.0f * fSqrt))) / fSqrt, 0.0f, 1.0f)) / this.f94895e;
    }

    public float h(T t10, int i10, int i11) {
        return g(t10, u(t10, i10, i11));
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public T c(T t10, float f10) {
        int i10 = this.f94895e;
        float f11 = i10 * f10;
        int i11 = f10 >= 1.0f ? i10 - 1 : (int) f11;
        return (T) r(t10, i11, f11 - i11);
    }

    public T r(T t10, int i10, float f10) {
        boolean z10 = this.f94894d;
        if (!z10) {
            i10 += (int) (this.f94893c * 0.5f);
        }
        return (T) p(t10, i10, f10, this.f94891a, this.f94893c, z10, this.f94896f);
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public float a(T t10) {
        return e(t10);
    }

    public int t(T t10) {
        return u(t10, 0, this.f94895e);
    }

    public int u(T t10, int i10, int i11) {
        while (i10 < 0) {
            i10 += this.f94895e;
        }
        int i12 = i10 % this.f94895e;
        float fL = t10.l(this.f94892b.get(i12));
        for (int i13 = 1; i13 < i11; i13++) {
            int i14 = (i10 + i13) % this.f94895e;
            float fL2 = t10.l(this.f94892b.get(i14));
            if (fL2 < fL) {
                i12 = i14;
                fL = fL2;
            }
        }
        return i12;
    }

    public b v(T[] tArr, int i10, boolean z10) {
        if (this.f94896f == null) {
            this.f94896f = (T) tArr[0].k();
        }
        if (this.f94897g == null) {
            this.f94897g = (T) tArr[0].k();
        }
        if (this.f94898h == null) {
            this.f94898h = (T) tArr[0].k();
        }
        this.f94891a = tArr;
        this.f94893c = i10;
        this.f94894d = z10;
        int length = tArr.length;
        if (!z10) {
            length -= i10;
        }
        this.f94895e = length;
        com.badlogic.gdx.utils.b<T> bVar = this.f94892b;
        if (bVar == null) {
            this.f94892b = new com.badlogic.gdx.utils.b<>(length);
        } else {
            bVar.clear();
            this.f94892b.n(this.f94895e);
        }
        int i11 = 0;
        while (i11 < this.f94895e) {
            T[] tArr2 = tArr;
            this.f94892b.c((T) j(tArr[0].k(), z10 ? i11 : (int) (i11 + (i10 * 0.5f)), 0.0f, tArr2, i10, z10, this.f94896f));
            i11++;
            tArr = tArr2;
        }
        return this;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public T d(T t10, float f10) {
        int i10 = this.f94895e;
        float f11 = i10 * f10;
        int i11 = f10 >= 1.0f ? i10 - 1 : (int) f11;
        return (T) x(t10, i11, f11 - i11);
    }

    public T x(T t10, int i10, float f10) {
        boolean z10 = this.f94894d;
        if (!z10) {
            i10 += (int) (this.f94893c * 0.5f);
        }
        return (T) j(t10, i10, f10, this.f94891a, this.f94893c, z10, this.f94896f);
    }

    public b(T[] tArr, int i10, boolean z10) {
        v(tArr, i10, z10);
    }
}
