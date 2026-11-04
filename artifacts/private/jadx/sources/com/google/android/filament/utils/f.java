package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,2155:1\n617#2,6:2156\n617#2,6:2162\n617#2,6:2168\n617#2,6:2174\n617#2,6:2180\n622#2:2186\n617#2,6:2187\n617#2,6:2193\n617#2,6:2199\n617#2,6:2205\n617#2,6:2211\n617#2,6:2217\n622#2:2223\n*S KotlinDebug\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n309#1:2156,6\n310#1:2162,6\n311#1:2168,6\n310#1:2174,6\n311#1:2180,6\n315#1:2186\n327#1:2187,6\n328#1:2193,6\n329#1:2199,6\n327#1:2205,6\n328#1:2211,6\n329#1:2217,6\n333#1:2223\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f104851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f104852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f104853c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104854a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h0.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h0.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h0.B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h0.P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f104854a = iArr;
        }
    }

    public f() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ f c(f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        float fH = fVar.H();
        float fCompare = Math.abs(fH - f10) < f11 ? 0.0f : Float.compare(fH, f10);
        float fK = fVar.K();
        float fCompare2 = Math.abs(fK - f10) < f11 ? 0.0f : Float.compare(fK, f10);
        float fL = fVar.L();
        return new f(fCompare, fCompare2, Math.abs(fL - f10) >= f11 ? Float.compare(fL, f10) : 0.0f);
    }

    public static /* synthetic */ f d(f fVar, f v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        float fH = fVar.H();
        float fH2 = v10.H();
        float fCompare = Math.abs(fH - fH2) < f10 ? 0.0f : Float.compare(fH, fH2);
        float fK = fVar.K();
        float fK2 = v10.K();
        float fCompare2 = Math.abs(fK - fK2) < f10 ? 0.0f : Float.compare(fK, fK2);
        float fL = fVar.L();
        float fL2 = v10.L();
        return new f(fCompare, fCompare2, Math.abs(fL - fL2) >= f10 ? Float.compare(fL, fL2) : 0.0f);
    }

    public static /* synthetic */ f i(f fVar, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fVar.f104851a;
        }
        if ((i10 & 2) != 0) {
            f11 = fVar.f104852b;
        }
        if ((i10 & 4) != 0) {
            f12 = fVar.f104853c;
        }
        return fVar.h(f10, f11, f12);
    }

    public static /* synthetic */ boolean p(f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(fVar.H() - f10) < f11 && Math.abs(fVar.K() - f10) < f11 && Math.abs(fVar.L() - f10) < f11;
    }

    public static /* synthetic */ boolean q(f fVar, f v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(fVar.H() - v10.H()) < f10 && Math.abs(fVar.K() - v10.K()) < f10 && Math.abs(fVar.L() - v10.L()) < f10;
    }

    public final float A() {
        return H();
    }

    @NotNull
    public final e B() {
        return new e(H(), K());
    }

    @NotNull
    public final f C() {
        return new f(H(), K(), L());
    }

    public final float D() {
        return H();
    }

    @NotNull
    public final e E() {
        return new e(H(), K());
    }

    @NotNull
    public final f F() {
        return new f(H(), K(), L());
    }

    public final float G() {
        return K();
    }

    public final float H() {
        return this.f104851a;
    }

    @NotNull
    public final e I() {
        return new e(H(), K());
    }

    @NotNull
    public final f J() {
        return new f(H(), K(), L());
    }

    public final float K() {
        return this.f104852b;
    }

    public final float L() {
        return this.f104853c;
    }

    @NotNull
    public final f M() {
        float f10 = this.f104851a;
        this.f104851a = f10 + 1.0f;
        float f11 = this.f104852b;
        this.f104852b = f11 + 1.0f;
        float f12 = this.f104853c;
        this.f104853c = 1.0f + f12;
        return new f(f10, f11, f12);
    }

    public final float N(int i10) {
        return r(i10 - 1);
    }

    @NotNull
    public final f O(float f10) {
        return new f(H() - f10, K() - f10, L() - f10);
    }

    @NotNull
    public final f P(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() - v10.z(), K() - v10.B(), L());
    }

    @NotNull
    public final f Q(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() - v10.H(), K() - v10.K(), L() - v10.L());
    }

    @NotNull
    public final f R(float f10) {
        return new f(H() + f10, K() + f10, L() + f10);
    }

    @NotNull
    public final f S(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() + v10.z(), K() + v10.B(), L());
    }

    @NotNull
    public final f T(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() + v10.H(), K() + v10.K(), L() + v10.L());
    }

    public final void U(int i10, float f10) {
        if (i10 == 0) {
            this.f104851a = f10;
            return;
        }
        int i11 = 4 >> 1;
        if (i10 == 1) {
            this.f104852b = f10;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("index must be in 0..2");
            }
            this.f104853c = f10;
        }
    }

    public final void V(int i10, int i11, float f10) {
        U(i10, f10);
        U(i11, f10);
    }

    public final void W(int i10, int i11, int i12, float f10) {
        U(i10, f10);
        U(i11, f10);
        U(i12, f10);
    }

    public final void X(@NotNull h0 index, float f10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104854a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104851a = f10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104852b = f10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104853c = f10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final void Y(@NotNull h0 index1, @NotNull h0 index2, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        X(index1, f10);
        X(index2, f10);
    }

    public final void Z(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        X(index1, f10);
        X(index2, f10);
        X(index3, f10);
    }

    @NotNull
    public final f a(float f10, float f11) {
        float fH = H();
        float fCompare = Math.abs(fH - f10) < f11 ? 0.0f : Float.compare(fH, f10);
        float fK = K();
        float fCompare2 = Math.abs(fK - f10) < f11 ? 0.0f : Float.compare(fK, f10);
        float fL = L();
        return new f(fCompare, fCompare2, Math.abs(fL - f10) >= f11 ? Float.compare(fL, f10) : 0.0f);
    }

    public final void a0(float f10) {
        o0(f10);
    }

    @NotNull
    public final f b(@NotNull f v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fH = H();
        float fH2 = v10.H();
        float fCompare = Math.abs(fH - fH2) < f10 ? 0.0f : Float.compare(fH, fH2);
        float fK = K();
        float fK2 = v10.K();
        float fCompare2 = Math.abs(fK - fK2) < f10 ? 0.0f : Float.compare(fK, fK2);
        float fL = L();
        float fL2 = v10.L();
        return new f(fCompare, fCompare2, Math.abs(fL - fL2) >= f10 ? Float.compare(fL, fL2) : 0.0f);
    }

    public final void b0(float f10) {
        n0(f10);
    }

    public final void c0(float f10) {
        o0(f10);
    }

    public final void d0(float f10) {
        k0(f10);
    }

    public final float e() {
        return this.f104851a;
    }

    public final void e0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.z());
        n0(value.B());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f104851a, fVar.f104851a) == 0 && Float.compare(this.f104852b, fVar.f104852b) == 0 && Float.compare(this.f104853c, fVar.f104853c) == 0;
    }

    public final float f() {
        return this.f104852b;
    }

    public final void f0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.H());
        n0(value.K());
        o0(value.L());
    }

    public final float g() {
        return this.f104853c;
    }

    public final void g0(float f10) {
        k0(f10);
    }

    @NotNull
    public final f h(float f10, float f11, float f12) {
        return new f(f10, f11, f12);
    }

    public final void h0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.z());
        n0(value.B());
    }

    public int hashCode() {
        return (((Float.hashCode(this.f104851a) * 31) + Float.hashCode(this.f104852b)) * 31) + Float.hashCode(this.f104853c);
    }

    public final void i0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.H());
        n0(value.K());
        o0(value.L());
    }

    @NotNull
    public final f j() {
        float f10 = this.f104851a;
        this.f104851a = f10 - 1.0f;
        float f11 = this.f104852b;
        this.f104852b = f11 - 1.0f;
        float f12 = this.f104853c;
        this.f104853c = (-1.0f) + f12;
        return new f(f10, f11, f12);
    }

    public final void j0(float f10) {
        n0(f10);
    }

    @NotNull
    public final f k(float f10) {
        return new f(H() / f10, K() / f10, L() / f10);
    }

    public final void k0(float f10) {
        this.f104851a = f10;
    }

    @NotNull
    public final f l(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() / v10.z(), K() / v10.B(), L());
    }

    public final void l0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.z());
        n0(value.B());
    }

    @NotNull
    public final f m(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() / v10.H(), K() / v10.K(), L() / v10.L());
    }

    public final void m0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        k0(value.H());
        n0(value.K());
        o0(value.L());
    }

    public final boolean n(float f10, float f11) {
        return Math.abs(H() - f10) < f11 && Math.abs(K() - f10) < f11 && Math.abs(L() - f10) < f11;
    }

    public final void n0(float f10) {
        this.f104852b = f10;
    }

    public final boolean o(@NotNull f v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(H() - v10.H()) < f10 && Math.abs(K() - v10.K()) < f10 && Math.abs(L() - v10.L()) < f10;
    }

    public final void o0(float f10) {
        this.f104853c = f10;
    }

    @NotNull
    public final f p0(float f10) {
        return new f(H() * f10, K() * f10, L() * f10);
    }

    @NotNull
    public final f q0(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() * v10.z(), K() * v10.B(), L());
    }

    public final float r(int i10) {
        if (i10 == 0) {
            return this.f104851a;
        }
        if (i10 == 1) {
            return this.f104852b;
        }
        if (i10 == 2) {
            return this.f104853c;
        }
        throw new IllegalArgumentException("index must be in 0..2");
    }

    @NotNull
    public final f r0(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(H() * v10.H(), K() * v10.K(), L() * v10.L());
    }

    public final float s(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104854a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104851a;
            case 4:
            case 5:
            case 6:
                return this.f104852b;
            case 7:
            case 8:
            case 9:
                return this.f104853c;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    @NotNull
    public final float[] s0() {
        return new float[]{this.f104851a, this.f104852b, this.f104853c};
    }

    @NotNull
    public final e t(int i10, int i11) {
        return new e(r(i10), r(i11));
    }

    @NotNull
    public final f t0(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k0(block.invoke(Float.valueOf(H())).floatValue());
        n0(block.invoke(Float.valueOf(K())).floatValue());
        o0(block.invoke(Float.valueOf(L())).floatValue());
        return this;
    }

    @NotNull
    public String toString() {
        return "Float3(x=" + this.f104851a + ", y=" + this.f104852b + ", z=" + this.f104853c + ")";
    }

    @NotNull
    public final e u(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new e(s(index1), s(index2));
    }

    @NotNull
    public final f u0() {
        return new f(-this.f104851a, -this.f104852b, -this.f104853c);
    }

    @NotNull
    public final f v(int i10, int i11, int i12) {
        return new f(r(i10), r(i11), r(i12));
    }

    @NotNull
    public final f w(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new f(s(index1), s(index2), s(index3));
    }

    public final float x() {
        return L();
    }

    public final float y() {
        return K();
    }

    public final float z() {
        return L();
    }

    public f(float f10, float f11, float f12) {
        this.f104851a = f10;
        this.f104852b = f11;
        this.f104853c = f12;
    }

    public /* synthetic */ f(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12);
    }

    public f(float f10) {
        this(f10, f10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull e v10, float f10) {
        this(v10.z(), v10.B(), f10);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ f(e eVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? 0.0f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull f v10) {
        this(v10.f104851a, v10.f104852b, v10.f104853c);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
