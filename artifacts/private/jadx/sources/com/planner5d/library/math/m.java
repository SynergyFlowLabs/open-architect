package com.planner5d.library.math;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public float f180482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public float f180483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public float f180484c;

    public m() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @NotNull
    public m A0(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return y0(vector.f180482a, vector.f180483b, vector.f180484c);
    }

    @NotNull
    public m B0(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return y0(values[0], values[1], values[2]);
    }

    public boolean C() {
        return F(1.0E-9f);
    }

    @NotNull
    public m C0(float f10) {
        return D0(f10 * f10);
    }

    @NotNull
    public m D0(float f10) {
        float fW = w();
        return (fW == 0.0f || fW == f10) ? this : v0((float) Math.sqrt(f10 / fW));
    }

    @NotNull
    public m E0() {
        return y0(0.0f, 0.0f, 0.0f);
    }

    public boolean F(float f10) {
        if (Math.abs(w() - 1.0f) >= f10) {
            return false;
        }
        boolean z10 = !false;
        return true;
    }

    @NotNull
    public m F0(float f10) {
        return y0(this.f180482a - f10, this.f180483b - f10, this.f180484c - f10);
    }

    @NotNull
    public m G0(float f10, float f11, float f12) {
        return y0(this.f180482a - f10, this.f180483b - f11, this.f180484c - f12);
    }

    @NotNull
    public m H0(@NotNull m a_vec) {
        Intrinsics.checkNotNullParameter(a_vec, "a_vec");
        return G0(a_vec.f180482a, a_vec.f180483b, a_vec.f180484c);
    }

    public boolean J(float f10) {
        return w() < f10;
    }

    public float O(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        return (float) Math.sqrt((f16 * f16) + (f17 * f17) + (f18 * f18));
    }

    @NotNull
    public m P(float f10) {
        return y0(this.f180482a + f10, this.f180483b + f10, this.f180484c + f10);
    }

    @NotNull
    public m Q(float f10, float f11, float f12) {
        return y0(this.f180482a + f10, this.f180483b + f11, this.f180484c + f12);
    }

    @NotNull
    public m R(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return Q(vector.f180482a, vector.f180483b, vector.f180484c);
    }

    @NotNull
    public m S(float f10, float f11) {
        float fW = w();
        if (fW == 0.0f) {
            return this;
        }
        float f12 = f11 * f11;
        if (fW > f12) {
            return v0((float) Math.sqrt(f12 / fW));
        }
        float f13 = f10 * f10;
        if (fW < f13) {
            this = v0((float) Math.sqrt(f13 / fW));
        }
        return this;
    }

    @NotNull
    public m T() {
        return new m(this);
    }

    @NotNull
    public m U(float f10, float f11, float f12) {
        float f13 = this.f180483b;
        float f14 = this.f180484c;
        float f15 = (f13 * f12) - (f14 * f11);
        float f16 = this.f180482a;
        return y0(f15, (f14 * f10) - (f12 * f16), (f16 * f11) - (f13 * f10));
    }

    @NotNull
    public m V(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        float f10 = this.f180483b;
        float f11 = vector.f180484c;
        float f12 = this.f180484c;
        float f13 = vector.f180483b;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = vector.f180482a;
        float f16 = this.f180482a;
        return y0(f14, (f12 * f15) - (f11 * f16), (f16 * f13) - (f10 * f15));
    }

    public float W(float f10, float f11, float f12) {
        return (this.f180482a * f10) + (this.f180483b * f11) + (this.f180484c * f12);
    }

    public float X(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return (this.f180482a * vector.f180482a) + (this.f180483b * vector.f180483b) + (this.f180484c * vector.f180484c);
    }

    public float Y(float f10, float f11, float f12) {
        float f13 = f10 - this.f180482a;
        float f14 = f11 - this.f180483b;
        float f15 = f12 - this.f180484c;
        return (float) Math.sqrt((f13 * f13) + (f14 * f14) + (f15 * f15));
    }

    public float Z(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        float f10 = vector.f180482a - this.f180482a;
        float f11 = vector.f180483b - this.f180483b;
        float f12 = vector.f180484c - this.f180484c;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    public float a0(float f10, float f11, float f12) {
        float f13 = f10 - this.f180482a;
        float f14 = f11 - this.f180483b;
        float f15 = f12 - this.f180484c;
        return (f13 * f13) + (f14 * f14) + (f15 * f15);
    }

    public float b0(@NotNull m point) {
        Intrinsics.checkNotNullParameter(point, "point");
        float f10 = point.f180482a - this.f180482a;
        float f11 = point.f180483b - this.f180483b;
        float f12 = point.f180484c - this.f180484c;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public boolean c0(float f10, float f11, float f12, float f13) {
        if (Math.abs(f10 - this.f180482a) <= f13 && Math.abs(f11 - this.f180483b) <= f13 && Math.abs(f12 - this.f180484c) <= f13) {
            return true;
        }
        return false;
    }

    public boolean d0(@Nullable m mVar, float f10) {
        if (mVar == null) {
            return false;
        }
        return c0(mVar.f180482a, mVar.f180483b, mVar.f180484c, f10);
    }

    public float e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (f10 * f13) + (f11 * f14) + (f12 * f15);
    }

    public boolean e0(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return X(vector) < 0.0f;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f180482a == mVar.f180482a && this.f180483b == mVar.f180483b && this.f180484c == mVar.f180484c;
    }

    public boolean f0(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return X(vector) > 0.0f;
    }

    public boolean g0(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return this.f180482a == vector.f180482a && this.f180483b == vector.f180483b && this.f180484c == vector.f180484c;
    }

    public boolean h0(@NotNull m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return l0(other) && f0(other);
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f180482a) + 31) * 31) + Float.floatToIntBits(this.f180483b)) * 31) + Float.floatToIntBits(this.f180484c);
    }

    public boolean i0(@NotNull m other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m0(other, f10) && f0(other);
    }

    public boolean isZero() {
        return this.f180482a == 0.0f && this.f180483b == 0.0f && this.f180484c == 0.0f;
    }

    public boolean j0(@NotNull m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return l0(other) && e0(other);
    }

    public boolean k0(@NotNull m other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m0(other, f10) && e0(other);
    }

    public boolean l0(@NotNull m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m0(other, 1.0E-6f);
    }

    public boolean m0(@NotNull m other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        float f11 = this.f180483b;
        float f12 = other.f180484c;
        float f13 = this.f180484c;
        float f14 = other.f180483b;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = other.f180482a;
        float f17 = this.f180482a;
        return x(f15, (f13 * f16) - (f12 * f17), (f17 * f14) - (f11 * f16)) <= f10;
    }

    public boolean n0(@NotNull m vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return J(X(vector));
    }

    public float o(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float f18 = f15 - f12;
        return (f16 * f16) + (f17 * f17) + (f18 * f18);
    }

    public boolean o0(@NotNull m vector, float f10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j.g(X(vector), f10);
    }

    public float p(float f10, float f11, float f12) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    @NotNull
    public m p0(@NotNull m target, float f10) {
        Intrinsics.checkNotNullParameter(target, "target");
        float f11 = this.f180482a;
        this.f180482a = f11 + ((target.f180482a - f11) * f10);
        float f12 = this.f180483b;
        this.f180483b = f12 + ((target.f180483b - f12) * f10);
        float f13 = this.f180484c;
        this.f180484c = f13 + (f10 * (target.f180484c - f13));
        return this;
    }

    @NotNull
    public m q0(float f10) {
        return r0(f10 * f10);
    }

    @NotNull
    public m r0(float f10) {
        float fW = w();
        if (fW > f10) {
            v0((float) Math.sqrt(f10 / fW));
        }
        return this;
    }

    @NotNull
    public m s0(@NotNull m vec, float f10) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        this.f180482a += vec.f180482a * f10;
        this.f180483b += vec.f180483b * f10;
        this.f180484c += vec.f180484c * f10;
        return this;
    }

    public float t() {
        float f10 = this.f180482a;
        float f11 = this.f180483b;
        float f12 = this.f180484c;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    @NotNull
    public m t0(@NotNull m vec, @NotNull m mulVec) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        Intrinsics.checkNotNullParameter(mulVec, "mulVec");
        this.f180482a += vec.f180482a * mulVec.f180482a;
        this.f180483b += vec.f180483b * mulVec.f180483b;
        this.f180484c += vec.f180484c * mulVec.f180484c;
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f180482a);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f180483b);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f180484c);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @NotNull
    public m u0() {
        float fW = w();
        if (fW != 0.0f && fW != 1.0f) {
            return v0(1.0f / ((float) Math.sqrt(fW)));
        }
        return this;
    }

    @NotNull
    public m v0(float f10) {
        return y0(this.f180482a * f10, this.f180483b * f10, this.f180484c * f10);
    }

    public float w() {
        float f10 = this.f180482a;
        float f11 = this.f180483b;
        float f12 = this.f180484c;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    @NotNull
    public m w0(float f10, float f11, float f12) {
        return y0(this.f180482a * f10, this.f180483b * f11, this.f180484c * f12);
    }

    public float x(float f10, float f11, float f12) {
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    @NotNull
    public m x0(@NotNull m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y0(this.f180482a * other.f180482a, this.f180483b * other.f180483b, this.f180484c * other.f180484c);
    }

    @NotNull
    public m y0(float f10, float f11, float f12) {
        this.f180482a = f10;
        this.f180483b = f11;
        this.f180484c = f12;
        return this;
    }

    @NotNull
    public final m z0(@NotNull k vector, float f10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return y0(vector.f180480a, vector.f180481b, f10);
    }

    public m(float f10, float f11, float f12) {
        this.f180482a = f10;
        this.f180483b = f11;
        this.f180484c = f12;
    }

    public /* synthetic */ m(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull m vector) {
        this(vector.f180482a, vector.f180483b, vector.f180484c);
        Intrinsics.checkNotNullParameter(vector, "vector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull float[] values) {
        this(values[0], values[1], values[2]);
        Intrinsics.checkNotNullParameter(values, "values");
    }
}
