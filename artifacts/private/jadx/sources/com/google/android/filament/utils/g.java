package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,2155:1\n617#2,6:2156\n617#2,6:2162\n617#2,6:2168\n617#2,6:2174\n617#2,6:2180\n617#2,6:2186\n617#2,6:2192\n622#2:2198\n617#2,6:2199\n617#2,6:2205\n617#2,6:2211\n617#2,6:2217\n617#2,6:2223\n617#2,6:2229\n617#2,6:2235\n617#2,6:2241\n622#2:2247\n*S KotlinDebug\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float4\n*L\n568#1:2156,6\n569#1:2162,6\n570#1:2168,6\n571#1:2174,6\n569#1:2180,6\n570#1:2186,6\n571#1:2192,6\n575#1:2198\n592#1:2199,6\n593#1:2205,6\n594#1:2211,6\n595#1:2217,6\n592#1:2223,6\n593#1:2229,6\n594#1:2235,6\n595#1:2241,6\n599#1:2247\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f104860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f104861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f104862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f104863d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104864a;

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
            try {
                iArr[h0.W.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[h0.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[h0.Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f104864a = iArr;
        }
    }

    public g() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ g c(g gVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        float fQ = gVar.Q();
        float fCompare = Math.abs(fQ - f10) < f11 ? 0.0f : Float.compare(fQ, f10);
        float fU = gVar.U();
        float fCompare2 = Math.abs(fU - f10) < f11 ? 0.0f : Float.compare(fU, f10);
        float fV = gVar.V();
        float fCompare3 = Math.abs(fV - f10) < f11 ? 0.0f : Float.compare(fV, f10);
        float fP = gVar.P();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fP - f10) >= f11 ? Float.compare(fP, f10) : 0.0f);
    }

    public static /* synthetic */ g d(g gVar, g v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        float fQ = gVar.Q();
        float fQ2 = v10.Q();
        float fCompare = Math.abs(fQ - fQ2) < f10 ? 0.0f : Float.compare(fQ, fQ2);
        float fU = gVar.U();
        float fU2 = v10.U();
        float fCompare2 = Math.abs(fU - fU2) < f10 ? 0.0f : Float.compare(fU, fU2);
        float fV = gVar.V();
        float fV2 = v10.V();
        float fCompare3 = Math.abs(fV - fV2) < f10 ? 0.0f : Float.compare(fV, fV2);
        float fP = gVar.P();
        float fP2 = v10.P();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fP - fP2) >= f10 ? Float.compare(fP, fP2) : 0.0f);
    }

    public static /* synthetic */ g j(g gVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = gVar.f104860a;
        }
        if ((i10 & 2) != 0) {
            f11 = gVar.f104861b;
        }
        if ((i10 & 4) != 0) {
            f12 = gVar.f104862c;
        }
        if ((i10 & 8) != 0) {
            f13 = gVar.f104863d;
        }
        return gVar.i(f10, f11, f12, f13);
    }

    public static /* synthetic */ boolean r(g gVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(gVar.Q() - f10) < f11 && Math.abs(gVar.U() - f10) < f11 && Math.abs(gVar.V() - f10) < f11 && Math.abs(gVar.P() - f10) < f11;
    }

    public static /* synthetic */ boolean s(g gVar, g v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(gVar.Q() - v10.Q()) < f10 && Math.abs(gVar.U() - v10.U()) < f10 && Math.abs(gVar.V() - v10.V()) < f10 && Math.abs(gVar.P() - v10.P()) < f10;
    }

    @NotNull
    public final g A(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new g(u(index1), u(index2), u(index3), u(index4));
    }

    public final void A0(@NotNull g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.Q());
        H0(value.U());
        I0(value.V());
        C0(value.P());
    }

    public final float B() {
        return P();
    }

    public final void B0(float f10) {
        H0(f10);
    }

    public final float C() {
        return V();
    }

    public final void C0(float f10) {
        this.f104863d = f10;
    }

    public final float D() {
        return U();
    }

    public final void D0(float f10) {
        this.f104860a = f10;
    }

    public final float E() {
        return V();
    }

    public final void E0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.z());
        H0(value.B());
    }

    public final float F() {
        return P();
    }

    public final void F0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.H());
        H0(value.K());
        I0(value.L());
    }

    public final float G() {
        return Q();
    }

    public final void G0(@NotNull g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.Q());
        H0(value.U());
        I0(value.V());
        C0(value.P());
    }

    @NotNull
    public final e H() {
        return new e(Q(), U());
    }

    public final void H0(float f10) {
        this.f104861b = f10;
    }

    @NotNull
    public final f I() {
        return new f(Q(), U(), V());
    }

    public final void I0(float f10) {
        this.f104862c = f10;
    }

    @NotNull
    public final g J() {
        return new g(Q(), U(), V(), P());
    }

    @NotNull
    public final g J0(float f10) {
        return new g(Q() * f10, U() * f10, V() * f10, P() * f10);
    }

    public final float K() {
        return Q();
    }

    @NotNull
    public final g K0(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() * v10.z(), U() * v10.B(), V(), P());
    }

    @NotNull
    public final e L() {
        return new e(Q(), U());
    }

    @NotNull
    public final g L0(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() * v10.H(), U() * v10.K(), V() * v10.L(), P());
    }

    @NotNull
    public final f M() {
        return new f(Q(), U(), V());
    }

    @NotNull
    public final g M0(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() * v10.Q(), U() * v10.U(), V() * v10.V(), P() * v10.P());
    }

    @NotNull
    public final g N() {
        return new g(Q(), U(), V(), P());
    }

    @NotNull
    public final float[] N0() {
        return new float[]{this.f104860a, this.f104861b, this.f104862c, this.f104863d};
    }

    public final float O() {
        return U();
    }

    @NotNull
    public final g O0(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        D0(block.invoke(Float.valueOf(Q())).floatValue());
        H0(block.invoke(Float.valueOf(U())).floatValue());
        I0(block.invoke(Float.valueOf(V())).floatValue());
        C0(block.invoke(Float.valueOf(P())).floatValue());
        return this;
    }

    public final float P() {
        return this.f104863d;
    }

    @NotNull
    public final g P0() {
        return new g(-this.f104860a, -this.f104861b, -this.f104862c, -this.f104863d);
    }

    public final float Q() {
        return this.f104860a;
    }

    @NotNull
    public final e R() {
        return new e(Q(), U());
    }

    @NotNull
    public final f S() {
        return new f(Q(), U(), V());
    }

    @NotNull
    public final g T() {
        return new g(Q(), U(), V(), P());
    }

    public final float U() {
        return this.f104861b;
    }

    public final float V() {
        return this.f104862c;
    }

    @NotNull
    public final g W() {
        float f10 = this.f104860a;
        this.f104860a = f10 + 1.0f;
        float f11 = this.f104861b;
        this.f104861b = f11 + 1.0f;
        float f12 = this.f104862c;
        this.f104862c = f12 + 1.0f;
        float f13 = this.f104863d;
        this.f104863d = 1.0f + f13;
        return new g(f10, f11, f12, f13);
    }

    public final float X(int i10) {
        return t(i10 - 1);
    }

    @NotNull
    public final g Y(float f10) {
        return new g(Q() - f10, U() - f10, V() - f10, P() - f10);
    }

    @NotNull
    public final g Z(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() - v10.z(), U() - v10.B(), V(), P());
    }

    @NotNull
    public final g a(float f10, float f11) {
        float fQ = Q();
        float fCompare = 0.0f;
        float fCompare2 = Math.abs(fQ - f10) < f11 ? 0.0f : Float.compare(fQ, f10);
        float fU = U();
        float fCompare3 = Math.abs(fU - f10) < f11 ? 0.0f : Float.compare(fU, f10);
        float fV = V();
        float fCompare4 = Math.abs(fV - f10) < f11 ? 0.0f : Float.compare(fV, f10);
        float fP = P();
        if (Math.abs(fP - f10) >= f11) {
            fCompare = Float.compare(fP, f10);
        }
        return new g(fCompare2, fCompare3, fCompare4, fCompare);
    }

    @NotNull
    public final g a0(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() - v10.H(), U() - v10.K(), V() - v10.L(), P());
    }

    @NotNull
    public final g b(@NotNull g v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fQ = Q();
        float fQ2 = v10.Q();
        float fCompare = Math.abs(fQ - fQ2) < f10 ? 0.0f : Float.compare(fQ, fQ2);
        float fU = U();
        float fU2 = v10.U();
        float fCompare2 = Math.abs(fU - fU2) < f10 ? 0.0f : Float.compare(fU, fU2);
        float fV = V();
        float fV2 = v10.V();
        float fCompare3 = Math.abs(fV - fV2) < f10 ? 0.0f : Float.compare(fV, fV2);
        float fP = P();
        float fP2 = v10.P();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fP - fP2) >= f10 ? Float.compare(fP, fP2) : 0.0f);
    }

    @NotNull
    public final g b0(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() - v10.Q(), U() - v10.U(), V() - v10.V(), P() - v10.P());
    }

    @NotNull
    public final g c0(float f10) {
        return new g(Q() + f10, U() + f10, V() + f10, P() + f10);
    }

    @NotNull
    public final g d0(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() + v10.z(), U() + v10.B(), V(), P());
    }

    public final float e() {
        return this.f104860a;
    }

    @NotNull
    public final g e0(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() + v10.H(), U() + v10.K(), V() + v10.L(), P());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f104860a, gVar.f104860a) == 0 && Float.compare(this.f104861b, gVar.f104861b) == 0 && Float.compare(this.f104862c, gVar.f104862c) == 0 && Float.compare(this.f104863d, gVar.f104863d) == 0;
    }

    public final float f() {
        return this.f104861b;
    }

    @NotNull
    public final g f0(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() + v10.Q(), U() + v10.U(), V() + v10.V(), P() + v10.P());
    }

    public final float g() {
        return this.f104862c;
    }

    public final void g0(int i10, float f10) {
        if (i10 == 0) {
            this.f104860a = f10;
            return;
        }
        if (i10 == 1) {
            this.f104861b = f10;
        } else if (i10 == 2) {
            this.f104862c = f10;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.f104863d = f10;
        }
    }

    public final float h() {
        return this.f104863d;
    }

    public final void h0(int i10, int i11, float f10) {
        g0(i10, f10);
        g0(i11, f10);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f104860a) * 31) + Float.hashCode(this.f104861b)) * 31) + Float.hashCode(this.f104862c)) * 31) + Float.hashCode(this.f104863d);
    }

    @NotNull
    public final g i(float f10, float f11, float f12, float f13) {
        return new g(f10, f11, f12, f13);
    }

    public final void i0(int i10, int i11, int i12, float f10) {
        g0(i10, f10);
        g0(i11, f10);
        g0(i12, f10);
    }

    public final void j0(int i10, int i11, int i12, int i13, float f10) {
        g0(i10, f10);
        g0(i11, f10);
        g0(i12, f10);
        g0(i13, f10);
    }

    @NotNull
    public final g k() {
        float f10 = this.f104860a;
        this.f104860a = f10 - 1.0f;
        float f11 = this.f104861b;
        this.f104861b = f11 - 1.0f;
        float f12 = this.f104862c;
        this.f104862c = f12 - 1.0f;
        float f13 = this.f104863d;
        this.f104863d = (-1.0f) + f13;
        return new g(f10, f11, f12, f13);
    }

    public final void k0(@NotNull h0 index, float f10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104864a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104860a = f10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104861b = f10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104862c = f10;
                return;
            case 10:
            case 11:
            case 12:
                this.f104863d = f10;
                return;
            default:
                throw new k0();
        }
    }

    @NotNull
    public final g l(float f10) {
        return new g(Q() / f10, U() / f10, V() / f10, P() / f10);
    }

    public final void l0(@NotNull h0 index1, @NotNull h0 index2, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        k0(index1, f10);
        k0(index2, f10);
    }

    @NotNull
    public final g m(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() / v10.z(), U() / v10.B(), V(), P());
    }

    public final void m0(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        k0(index1, f10);
        k0(index2, f10);
        k0(index3, f10);
    }

    @NotNull
    public final g n(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() / v10.H(), U() / v10.K(), V() / v10.L(), P());
    }

    public final void n0(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        k0(index1, f10);
        k0(index2, f10);
        k0(index3, f10);
        k0(index4, f10);
    }

    @NotNull
    public final g o(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Q() / v10.Q(), U() / v10.U(), V() / v10.V(), P() / v10.P());
    }

    public final void o0(float f10) {
        C0(f10);
    }

    public final boolean p(float f10, float f11) {
        return Math.abs(Q() - f10) < f11 && Math.abs(U() - f10) < f11 && Math.abs(V() - f10) < f11 && Math.abs(P() - f10) < f11;
    }

    public final void p0(float f10) {
        I0(f10);
    }

    public final boolean q(@NotNull g v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(Q() - v10.Q()) < f10 && Math.abs(U() - v10.U()) < f10 && Math.abs(V() - v10.V()) < f10 && Math.abs(P() - v10.P()) < f10;
    }

    public final void q0(float f10) {
        H0(f10);
    }

    public final void r0(float f10) {
        I0(f10);
    }

    public final void s0(float f10) {
        C0(f10);
    }

    public final float t(int i10) {
        if (i10 == 0) {
            return this.f104860a;
        }
        if (i10 == 1) {
            return this.f104861b;
        }
        if (i10 == 2) {
            return this.f104862c;
        }
        if (i10 == 3) {
            return this.f104863d;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public final void t0(float f10) {
        D0(f10);
    }

    @NotNull
    public String toString() {
        return "Float4(x=" + this.f104860a + ", y=" + this.f104861b + ", z=" + this.f104862c + ", w=" + this.f104863d + ")";
    }

    public final float u(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104864a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104860a;
            case 4:
            case 5:
            case 6:
                return this.f104861b;
            case 7:
            case 8:
            case 9:
                return this.f104862c;
            case 10:
            case 11:
            case 12:
                return this.f104863d;
            default:
                throw new k0();
        }
    }

    public final void u0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.z());
        H0(value.B());
    }

    @NotNull
    public final e v(int i10, int i11) {
        return new e(t(i10), t(i11));
    }

    public final void v0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.H());
        H0(value.K());
        I0(value.L());
    }

    @NotNull
    public final e w(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new e(u(index1), u(index2));
    }

    public final void w0(@NotNull g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.Q());
        H0(value.U());
        I0(value.V());
        C0(value.P());
    }

    @NotNull
    public final f x(int i10, int i11, int i12) {
        return new f(t(i10), t(i11), t(i12));
    }

    public final void x0(float f10) {
        D0(f10);
    }

    @NotNull
    public final f y(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new f(u(index1), u(index2), u(index3));
    }

    public final void y0(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.z());
        H0(value.B());
    }

    @NotNull
    public final g z(int i10, int i11, int i12, int i13) {
        return new g(t(i10), t(i11), t(i12), t(i13));
    }

    public final void z0(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D0(value.H());
        H0(value.K());
        I0(value.L());
    }

    public g(float f10, float f11, float f12, float f13) {
        this.f104860a = f10;
        this.f104861b = f11;
        this.f104862c = f12;
        this.f104863d = f13;
    }

    public /* synthetic */ g(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    public g(float f10) {
        this(f10, f10, f10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull e v10, float f10, float f11) {
        this(v10.z(), v10.B(), f10, f11);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ g(e eVar, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull f v10, float f10) {
        this(v10.H(), v10.K(), v10.L(), f10);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ g(f fVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? 0.0f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull g v10) {
        this(v10.f104860a, v10.f104861b, v10.f104862c, v10.f104863d);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
