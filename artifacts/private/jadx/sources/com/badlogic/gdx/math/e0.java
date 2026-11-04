package com.badlogic.gdx.math;

import com.badlogic.gdx.math.e0;

/* JADX INFO: loaded from: classes3.dex */
public interface e0<T extends e0<T>> {
    static float O(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        return (float) Math.sqrt((f16 * f16) + (f17 * f17) + (f18 * f18));
    }

    static float e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (f10 * f13) + (f11 * f14) + (f12 * f15);
    }

    static float o(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        return (f16 * f16) + (f17 * f17) + (f18 * f18);
    }

    static float p(float f10, float f11, float f12) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    static float x(float f10, float f11, float f12) {
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    boolean A(T t10, float f10);

    T B();

    boolean C();

    T D(T t10, float f10, q qVar);

    T E(T t10, float f10);

    boolean F(float f10);

    boolean G(T t10);

    float H(T t10);

    T I(float f10);

    boolean J(float f10);

    T K(T t10);

    T L(T t10);

    boolean M(T t10);

    boolean N(T t10);

    T a(float f10);

    float b(T t10);

    T c(float f10);

    boolean d(T t10, float f10);

    T f();

    T g(T t10, float f10);

    boolean h(T t10, float f10);

    T i(T t10);

    boolean isZero();

    boolean j(T t10);

    T k();

    float l(T t10);

    T m(float f10, float f11);

    boolean n(T t10);

    boolean q(T t10);

    T r(T t10, T t11);

    T s(float f10);

    float t();

    boolean u(T t10, float f10);

    T v(T t10);

    float w();

    T y(float f10);

    boolean z(T t10, float f10);
}
