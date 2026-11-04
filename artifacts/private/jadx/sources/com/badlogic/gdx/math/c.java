package com.badlogic.gdx.math;

import com.badlogic.gdx.math.e0;

/* JADX INFO: loaded from: classes3.dex */
public class c<T extends e0<T>> implements u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.b<T> f94899a = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f94900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f94901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f94902d;

    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T g(T t10, float f10, T t11, T t12, T t13, T t14, T t15) {
        float f11 = 1.0f - f10;
        float f12 = f11 * f11;
        float f13 = f10 * f10;
        return (T) t10.L(t11).v0(f12 * f11).i(t15.L(t12).v0(f12 * 3.0f * f10)).i(t15.L(t13).v0(f11 * 3.0f * f13)).i(t15.L(t14).v0(f13 * f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T h(T t10, float f10, T t11, T t12, T t13, T t14, T t15) {
        float f11 = 1.0f - f10;
        return (T) t10.L(t12).K(t11).v0(f11 * f11 * 3.0f).i(t15.L(t13).K(t12).v0(f11 * f10 * 6.0f)).i(t15.L(t14).K(t13).v0(f10 * f10 * 3.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T j(T t10, float f10, T t11, T t12, T t13) {
        return (T) t10.L(t11).v0(1.0f - f10).i(t13.L(t12).v0(f10));
    }

    public static <T extends e0<T>> T k(T t10, float f10, T t11, T t12, T t13) {
        return (T) t10.L(t12).K(t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T m(T t10, float f10, T t11, T t12, T t13, T t14) {
        float f11 = 1.0f - f10;
        return (T) t10.L(t11).v0(f11 * f11).i(t14.L(t12).v0(f11 * 2.0f * f10)).i(t14.L(t13).v0(f10 * f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends e0<T>> T n(T t10, float f10, T t11, T t12, T t13, T t14) {
        return (T) t10.L(t12).K(t11).v0(2.0f).v0(1.0f - f10).i(t14.L(t13).K(t12).v0(f10).v0(2.0f));
    }

    @Override // com.badlogic.gdx.math.u
    public float b(int i10) {
        float fH = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f94901c.L(this.f94902d);
            d(this.f94902d, i11 / (i10 - 1.0f));
            if (i11 > 0) {
                fH += this.f94901c.H(this.f94902d);
            }
        }
        return fH;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float e(T t10) {
        T t11 = this.f94899a.get(0);
        com.badlogic.gdx.utils.b<T> bVar = this.f94899a;
        T t12 = bVar.get(bVar.f95174b - 1);
        float fL = t11.l(t12);
        float fL2 = t10.l(t12);
        float fL3 = t10.l(t11);
        float fSqrt = (float) Math.sqrt(fL);
        return s.e((fSqrt - (((fL2 + fL) - fL3) / (2.0f * fSqrt))) / fSqrt, 0.0f, 1.0f);
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T c(T t10, float f10) {
        com.badlogic.gdx.utils.b<T> bVar = this.f94899a;
        int i10 = bVar.f95174b;
        if (i10 == 2) {
            k(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94900b);
            return t10;
        }
        if (i10 == 3) {
            n(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94899a.get(2), this.f94900b);
            return t10;
        }
        if (i10 == 4) {
            h(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94899a.get(2), this.f94899a.get(3), this.f94900b);
        }
        return t10;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public float a(T t10) {
        return e(t10);
    }

    public c o(com.badlogic.gdx.utils.b<T> bVar, int i10, int i11) {
        if (i11 < 2 || i11 > 4) {
            throw new com.badlogic.gdx.utils.t("Only first, second and third degree Bezier curves are supported.");
        }
        if (this.f94900b == null) {
            this.f94900b = (T) bVar.get(0).k();
        }
        this.f94899a.clear();
        this.f94899a.i(bVar, i10, i11);
        return this;
    }

    public c p(T... tArr) {
        return q(tArr, 0, tArr.length);
    }

    public c q(T[] tArr, int i10, int i11) {
        if (i11 < 2 || i11 > 4) {
            throw new com.badlogic.gdx.utils.t("Only first, second and third degree Bezier curves are supported.");
        }
        if (this.f94900b == null) {
            this.f94900b = (T) tArr[0].k();
        }
        if (this.f94901c == null) {
            this.f94901c = (T) tArr[0].k();
        }
        if (this.f94902d == null) {
            this.f94902d = (T) tArr[0].k();
        }
        this.f94899a.clear();
        this.f94899a.l(tArr, i10, i11);
        return this;
    }

    @Override // com.badlogic.gdx.math.u
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public T d(T t10, float f10) {
        com.badlogic.gdx.utils.b<T> bVar = this.f94899a;
        int i10 = bVar.f95174b;
        if (i10 == 2) {
            j(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94900b);
            return t10;
        }
        if (i10 == 3) {
            m(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94899a.get(2), this.f94900b);
            return t10;
        }
        if (i10 == 4) {
            g(t10, f10, bVar.get(0), this.f94899a.get(1), this.f94899a.get(2), this.f94899a.get(3), this.f94900b);
        }
        return t10;
    }

    public c(T... tArr) {
        p(tArr);
    }

    public c(T[] tArr, int i10, int i11) {
        q(tArr, i10, i11);
    }

    public c(com.badlogic.gdx.utils.b<T> bVar, int i10, int i11) {
        o(bVar, i10, i11);
    }
}
