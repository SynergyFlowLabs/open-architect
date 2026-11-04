package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f104820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f104821d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104822a;

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
            f104822a = iArr;
        }
    }

    public c() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ c f(c cVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f104818a;
        }
        if ((i10 & 2) != 0) {
            z11 = cVar.f104819b;
        }
        if ((i10 & 4) != 0) {
            z12 = cVar.f104820c;
        }
        if ((i10 & 8) != 0) {
            z13 = cVar.f104821d;
        }
        return cVar.e(z10, z11, z12, z13);
    }

    @NotNull
    public final c A() {
        return new c(D(), H(), I(), C());
    }

    public final boolean B() {
        return H();
    }

    public final boolean C() {
        return this.f104821d;
    }

    public final boolean D() {
        return this.f104818a;
    }

    @NotNull
    public final com.google.android.filament.utils.a E() {
        return new com.google.android.filament.utils.a(D(), H());
    }

    @NotNull
    public final b F() {
        return new b(D(), H(), I());
    }

    @NotNull
    public final c G() {
        return new c(D(), H(), I(), C());
    }

    public final boolean H() {
        return this.f104819b;
    }

    public final boolean I() {
        return this.f104820c;
    }

    public final boolean J(int i10) {
        return m(i10 - 1);
    }

    public final void K(int i10, int i11, int i12, int i13, boolean z10) {
        N(i10, z10);
        N(i11, z10);
        N(i12, z10);
        N(i13, z10);
    }

    public final void L(int i10, int i11, int i12, boolean z10) {
        N(i10, z10);
        N(i11, z10);
        N(i12, z10);
    }

    public final void M(int i10, int i11, boolean z10) {
        N(i10, z10);
        N(i11, z10);
    }

    public final void N(int i10, boolean z10) {
        if (i10 == 0) {
            this.f104818a = z10;
            return;
        }
        if (i10 == 1) {
            this.f104819b = z10;
        } else if (i10 == 2) {
            this.f104820c = z10;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.f104821d = z10;
        }
    }

    public final void O(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        R(index1, z10);
        R(index2, z10);
        R(index3, z10);
        R(index4, z10);
    }

    public final void P(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        R(index1, z10);
        R(index2, z10);
        R(index3, z10);
    }

    public final void Q(@NotNull h0 index1, @NotNull h0 index2, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        R(index1, z10);
        R(index2, z10);
    }

    public final void R(@NotNull h0 index, boolean z10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104822a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104818a = z10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104819b = z10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104820c = z10;
                return;
            case 10:
            case 11:
            case 12:
                this.f104821d = z10;
                return;
            default:
                throw new k0();
        }
    }

    public final void S(boolean z10) {
        g0(z10);
    }

    public final void T(boolean z10) {
        m0(z10);
    }

    public final void U(boolean z10) {
        l0(z10);
    }

    public final void V(boolean z10) {
        m0(z10);
    }

    public final void W(boolean z10) {
        g0(z10);
    }

    public final void X(boolean z10) {
        h0(z10);
    }

    public final void Y(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.o());
        l0(value.q());
    }

    public final void Z(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.v());
        l0(value.y());
        m0(value.z());
    }

    public final boolean a() {
        return this.f104818a;
    }

    public final void a0(@NotNull c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.D());
        l0(value.H());
        m0(value.I());
        g0(value.C());
    }

    public final boolean b() {
        return this.f104819b;
    }

    public final void b0(boolean z10) {
        h0(z10);
    }

    public final boolean c() {
        return this.f104820c;
    }

    public final void c0(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.o());
        l0(value.q());
    }

    public final boolean d() {
        return this.f104821d;
    }

    public final void d0(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.v());
        l0(value.y());
        m0(value.z());
    }

    @NotNull
    public final c e(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new c(z10, z11, z12, z13);
    }

    public final void e0(@NotNull c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.D());
        l0(value.H());
        m0(value.I());
        g0(value.C());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f104818a == cVar.f104818a && this.f104819b == cVar.f104819b && this.f104820c == cVar.f104820c && this.f104821d == cVar.f104821d;
    }

    public final void f0(boolean z10) {
        l0(z10);
    }

    @NotNull
    public final com.google.android.filament.utils.a g(int i10, int i11) {
        return new com.google.android.filament.utils.a(m(i10), m(i11));
    }

    public final void g0(boolean z10) {
        this.f104821d = z10;
    }

    @NotNull
    public final com.google.android.filament.utils.a h(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new com.google.android.filament.utils.a(n(index1), n(index2));
    }

    public final void h0(boolean z10) {
        this.f104818a = z10;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f104818a) * 31) + Boolean.hashCode(this.f104819b)) * 31) + Boolean.hashCode(this.f104820c)) * 31) + Boolean.hashCode(this.f104821d);
    }

    @NotNull
    public final b i(int i10, int i11, int i12) {
        return new b(m(i10), m(i11), m(i12));
    }

    public final void i0(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.o());
        l0(value.q());
    }

    @NotNull
    public final b j(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new b(n(index1), n(index2), n(index3));
    }

    public final void j0(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.v());
        l0(value.y());
        m0(value.z());
    }

    @NotNull
    public final c k(int i10, int i11, int i12, int i13) {
        return new c(m(i10), m(i11), m(i12), m(i13));
    }

    public final void k0(@NotNull c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        h0(value.D());
        l0(value.H());
        m0(value.I());
        g0(value.C());
    }

    @NotNull
    public final c l(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new c(n(index1), n(index2), n(index3), n(index4));
    }

    public final void l0(boolean z10) {
        this.f104819b = z10;
    }

    public final boolean m(int i10) {
        if (i10 == 0) {
            return this.f104818a;
        }
        if (i10 == 1) {
            return this.f104819b;
        }
        if (i10 == 2) {
            return this.f104820c;
        }
        if (i10 == 3) {
            return this.f104821d;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public final void m0(boolean z10) {
        this.f104820c = z10;
    }

    public final boolean n(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104822a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104818a;
            case 4:
            case 5:
            case 6:
                return this.f104819b;
            case 7:
            case 8:
            case 9:
                return this.f104820c;
            case 10:
            case 11:
            case 12:
                return this.f104821d;
            default:
                throw new k0();
        }
    }

    public final boolean o() {
        return C();
    }

    public final boolean p() {
        return I();
    }

    public final boolean q() {
        return H();
    }

    public final boolean r() {
        return I();
    }

    public final boolean s() {
        return C();
    }

    public final boolean t() {
        return D();
    }

    @NotNull
    public String toString() {
        return "Bool4(x=" + this.f104818a + ", y=" + this.f104819b + ", z=" + this.f104820c + ", w=" + this.f104821d + ")";
    }

    @NotNull
    public final com.google.android.filament.utils.a u() {
        return new com.google.android.filament.utils.a(D(), H());
    }

    @NotNull
    public final b v() {
        return new b(D(), H(), I());
    }

    @NotNull
    public final c w() {
        return new c(D(), H(), I(), C());
    }

    public final boolean x() {
        return D();
    }

    @NotNull
    public final com.google.android.filament.utils.a y() {
        return new com.google.android.filament.utils.a(D(), H());
    }

    @NotNull
    public final b z() {
        return new b(D(), H(), I());
    }

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f104818a = z10;
        this.f104819b = z11;
        this.f104820c = z12;
        this.f104821d = z13;
    }

    public /* synthetic */ c(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull com.google.android.filament.utils.a v10, boolean z10, boolean z11) {
        this(v10.o(), v10.q(), z10, z11);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ c(com.google.android.filament.utils.a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull b v10, boolean z10) {
        this(v10.v(), v10.y(), v10.z(), z10);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            z10 = false;
            int i11 = 5 ^ 0;
        }
        this(bVar, z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull c v10) {
        this(v10.f104818a, v10.f104819b, v10.f104820c, v10.f104821d);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
