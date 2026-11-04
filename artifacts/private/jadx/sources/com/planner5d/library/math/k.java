package com.planner5d.library.math;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public float f180480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public float f180481b;

    public k(float f10, float f11) {
        this.f180480a = f10;
        this.f180481b = f11;
    }

    public boolean A(@NotNull k vector, float f10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j.g(k(vector), f10);
    }

    public boolean B() {
        return C(1.0E-9f);
    }

    public boolean C(float f10) {
        return Math.abs(G() - 1.0f) < f10;
    }

    public boolean D() {
        return this.f180480a == 0.0f && this.f180481b == 0.0f;
    }

    public boolean E(float f10) {
        return G() < f10;
    }

    public float F() {
        float f10 = this.f180480a;
        float f11 = this.f180481b;
        return (float) Math.sqrt(((double) (f10 * f10)) + (((double) f11) * ((double) f11)));
    }

    public float G() {
        float f10 = this.f180480a;
        float f11 = this.f180481b;
        return (f10 * f10) + (f11 * f11);
    }

    @NotNull
    public k H(@NotNull k target, float f10) {
        Intrinsics.checkNotNullParameter(target, "target");
        float f11 = 1.0f - f10;
        this.f180480a = (this.f180480a * f11) + (target.f180480a * f10);
        this.f180481b = (this.f180481b * f11) + (target.f180481b * f10);
        return this;
    }

    @NotNull
    public k I(float f10) {
        return J(f10 * f10);
    }

    @NotNull
    public k J(float f10) {
        float fG = G();
        return fG > f10 ? R((float) Math.sqrt(((double) f10) / ((double) fG))) : this;
    }

    @NotNull
    public k K(@NotNull k vec, float f10) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        return a(vec.f180480a * f10, vec.f180481b * f10);
    }

    @NotNull
    public k L(@NotNull k vec, @NotNull k mulVec) {
        Intrinsics.checkNotNullParameter(vec, "vec");
        Intrinsics.checkNotNullParameter(mulVec, "mulVec");
        return a(vec.f180480a * mulVec.f180480a, vec.f180481b * mulVec.f180481b);
    }

    @NotNull
    public k M() {
        float F = F();
        if (F == 0.0f) {
            return this;
        }
        this.f180480a /= F;
        this.f180481b /= F;
        return this;
    }

    @NotNull
    public k N(float f10) {
        return P((float) j.k(f10));
    }

    @NotNull
    public k O(int i10) {
        float f10 = this.f180480a;
        if (i10 >= 0) {
            this.f180480a = -this.f180481b;
            this.f180481b = f10;
            return this;
        }
        this.f180480a = this.f180481b;
        this.f180481b = -f10;
        return this;
    }

    @NotNull
    public k P(float f10) {
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = this.f180480a;
        float f12 = this.f180481b;
        return U((f11 * fCos) - (f12 * fSin), (f11 * fSin) + (f12 * fCos));
    }

    @NotNull
    public k Q(float f10, @NotNull k center) {
        Intrinsics.checkNotNullParameter(center, "center");
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = this.f180480a;
        float f12 = center.f180480a;
        float f13 = f11 - f12;
        float f14 = this.f180481b;
        float f15 = center.f180481b;
        float f16 = f14 - f15;
        return U(((f13 * fCos) - (f16 * fSin)) + f12, (f13 * fSin) + (f16 * fCos) + f15);
    }

    @NotNull
    public k R(float f10) {
        return S(f10, f10);
    }

    @NotNull
    public k S(float f10, float f11) {
        this.f180480a *= f10;
        this.f180481b *= f11;
        return this;
    }

    @NotNull
    public k T(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return S(v10.f180480a, v10.f180481b);
    }

    @NotNull
    public k U(float f10, float f11) {
        this.f180480a = f10;
        this.f180481b = f11;
        return this;
    }

    @NotNull
    public k V(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return U(v10.f180480a, v10.f180481b);
    }

    @NotNull
    public k W(float f10) {
        return X((float) j.k(f10));
    }

    @NotNull
    public k X(float f10) {
        U(F(), 0.0f);
        P(f10);
        return this;
    }

    @NotNull
    public k Y(float f10) {
        return Z(f10 * f10);
    }

    @NotNull
    public k Z(float f10) {
        float fG = G();
        return (fG == 0.0f || fG == f10) ? this : R((float) Math.sqrt(((double) f10) / ((double) fG)));
    }

    @NotNull
    public k a(float f10, float f11) {
        this.f180480a += f10;
        this.f180481b += f11;
        return this;
    }

    @NotNull
    public k a0() {
        return U(0.0f, 0.0f);
    }

    @NotNull
    public k b(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return a(v10.f180480a, v10.f180481b);
    }

    @NotNull
    public k b0(float f10, float f11) {
        return a(-f10, -f11);
    }

    public float c() {
        float fJ = (float) j.j(Math.atan2(this.f180481b, this.f180480a));
        return fJ < 0.0f ? fJ + 360.0f : fJ;
    }

    @NotNull
    public k c0(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return b0(v10.f180480a, v10.f180481b);
    }

    public float d(@NotNull k reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        return (float) j.j(Math.atan2(i(reference), k(reference)));
    }

    public float e() {
        return (float) Math.atan2(this.f180481b, this.f180480a);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (Float.floatToIntBits(this.f180480a) == Float.floatToIntBits(kVar.f180480a) && Float.floatToIntBits(this.f180481b) == Float.floatToIntBits(kVar.f180481b)) {
                return true;
            }
        }
        return false;
    }

    public float f(@NotNull k reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        return (float) Math.atan2(i(reference), k(reference));
    }

    @NotNull
    public k g(float f10, float f11) {
        float fG = G();
        if (fG == 0.0f) {
            return this;
        }
        float f12 = f11 * f11;
        if (fG > f12) {
            return R((float) Math.sqrt(((double) f12) / ((double) fG)));
        }
        float f13 = f10 * f10;
        return fG < f13 ? R((float) Math.sqrt(((double) f13) / ((double) fG))) : this;
    }

    public float h(float f10, float f11) {
        return (this.f180480a * f11) - (this.f180481b * f10);
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f180480a) + 31) * 31) + Float.floatToIntBits(this.f180481b);
    }

    public float i(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (this.f180480a * v10.f180481b) - (this.f180481b * v10.f180480a);
    }

    public float j(float f10, float f11) {
        return (this.f180480a * f10) + (this.f180481b * f11);
    }

    public float k(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return j(v10.f180480a, v10.f180481b);
    }

    public float l(float f10, float f11) {
        float f12 = f10 - this.f180480a;
        double d10 = f11 - this.f180481b;
        return (float) Math.sqrt(((double) (f12 * f12)) + (d10 * d10));
    }

    public float m(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return l(v10.f180480a, v10.f180481b);
    }

    public float n(float f10, float f11) {
        float f12 = f10 - this.f180480a;
        float f13 = f11 - this.f180481b;
        return (f12 * f12) + (f13 * f13);
    }

    public float o(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return n(v10.f180480a, v10.f180481b);
    }

    public boolean p(float f10, float f11, float f12) {
        return Math.abs(f10 - this.f180480a) <= f12 && Math.abs(f11 - this.f180481b) <= f12;
    }

    public boolean q(@Nullable k kVar, float f10) {
        return kVar != null && Math.abs(kVar.f180480a - this.f180480a) <= f10 && Math.abs(kVar.f180481b - this.f180481b) <= f10;
    }

    public boolean r(@NotNull k vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return k(vector) < 0.0f;
    }

    public boolean s(@NotNull k vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return k(vector) > 0.0f;
    }

    public boolean t(@NotNull k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return x(other) && k(other) > 0.0f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f180480a);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f180481b);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public boolean u(@NotNull k other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y(other, f10) && k(other) > 0.0f;
    }

    public boolean v(@NotNull k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return x(other) && k(other) < 0.0f;
    }

    public boolean w(@NotNull k other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y(other, f10) && k(other) < 0.0f;
    }

    public boolean x(@NotNull k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 0 << 0;
        return j.h((this.f180480a * other.f180481b) - (this.f180481b * other.f180480a), 0.0f, 2, null);
    }

    public boolean y(@NotNull k other, float f10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return j.g((this.f180480a * other.f180481b) - (this.f180481b * other.f180480a), f10);
    }

    public boolean z(@NotNull k vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j.h(k(vector), 0.0f, 2, null);
    }

    public k() {
        this(0.0f, 0.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull k v10) {
        this(v10.f180480a, v10.f180481b);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
