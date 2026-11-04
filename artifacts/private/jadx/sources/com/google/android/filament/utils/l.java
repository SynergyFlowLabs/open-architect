package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f104922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f104923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f104924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f104925d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104926a;

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
            f104926a = iArr;
        }
    }

    public /* synthetic */ l(j jVar, short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, s10, s11);
    }

    public static /* synthetic */ l f(l lVar, short s10, short s11, short s12, short s13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = lVar.f104922a;
        }
        if ((i10 & 2) != 0) {
            s11 = lVar.f104923b;
        }
        if ((i10 & 4) != 0) {
            s12 = lVar.f104924c;
        }
        if ((i10 & 8) != 0) {
            s13 = lVar.f104925d;
        }
        return lVar.e(s10, s11, s12, s13);
    }

    @NotNull
    public final k A() {
        return new k(I(), M(), N(), (DefaultConstructorMarker) null);
    }

    public final void A0(short s10) {
        this.f104924c = s10;
    }

    @NotNull
    public final l B() {
        return new l(I(), M(), N(), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l B0(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.i0(I(), v10.r()), i.i0(M(), v10.t()), N(), H(), (DefaultConstructorMarker) null);
    }

    public final short C() {
        return I();
    }

    @NotNull
    public final l C0(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.i0(I(), v10.z()), i.i0(M(), v10.C()), i.i0(N(), v10.D()), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final j D() {
        return new j(I(), M(), null);
    }

    @NotNull
    public final l D0(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.i0(I(), v10.I()), i.i0(M(), v10.M()), i.i0(N(), v10.N()), i.i0(H(), v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k E() {
        return new k(I(), M(), N(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l E0(short s10) {
        return new l(i.i0(I(), s10), i.i0(M(), s10), i.i0(N(), s10), i.i0(H(), s10), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l F() {
        return new l(I(), M(), N(), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final float[] F0() {
        return new float[]{i.m0(this.f104922a), i.m0(this.f104923b), i.m0(this.f104924c), i.m0(this.f104925d)};
    }

    public final short G() {
        return M();
    }

    @NotNull
    public final l G0(@NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        v0(block.invoke(i.w(I())).u0());
        z0(block.invoke(i.w(M())).u0());
        A0(block.invoke(i.w(N())).u0());
        u0(block.invoke(i.w(H())).u0());
        return this;
    }

    public final short H() {
        return this.f104925d;
    }

    @NotNull
    public final l H0() {
        return new l(i.s0(this.f104922a), i.s0(this.f104923b), i.s0(this.f104924c), i.s0(this.f104925d), (DefaultConstructorMarker) null);
    }

    public final short I() {
        return this.f104922a;
    }

    @NotNull
    public final j J() {
        return new j(I(), M(), null);
    }

    @NotNull
    public final k K() {
        return new k(I(), M(), N(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l L() {
        return new l(I(), M(), N(), H(), (DefaultConstructorMarker) null);
    }

    public final short M() {
        return this.f104923b;
    }

    public final short N() {
        return this.f104924c;
    }

    @NotNull
    public final l O() {
        short s10 = this.f104922a;
        this.f104922a = i.U(s10);
        short s11 = this.f104923b;
        this.f104923b = i.U(s11);
        short s12 = this.f104924c;
        this.f104924c = i.U(s12);
        short s13 = this.f104925d;
        this.f104925d = i.U(s13);
        return new l(s10, s11, s12, s13, (DefaultConstructorMarker) null);
    }

    public final short P(int i10) {
        return r(i10 - 1);
    }

    @NotNull
    public final l Q(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.a0(I(), v10.r()), i.a0(M(), v10.t()), N(), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l R(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.a0(I(), v10.z()), i.a0(M(), v10.C()), i.a0(N(), v10.D()), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l S(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.a0(I(), v10.I()), i.a0(M(), v10.M()), i.a0(N(), v10.N()), i.a0(H(), v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l T(short s10) {
        return new l(i.a0(I(), s10), i.a0(M(), s10), i.a0(N(), s10), i.a0(H(), s10), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l U(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.f0(I(), v10.r()), i.f0(M(), v10.t()), N(), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l V(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.f0(I(), v10.z()), i.f0(M(), v10.C()), i.f0(N(), v10.D()), H(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l W(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.f0(I(), v10.I()), i.f0(M(), v10.M()), i.f0(N(), v10.N()), i.f0(H(), v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final l X(short s10) {
        return new l(i.f0(I(), s10), i.f0(M(), s10), i.f0(N(), s10), i.f0(H(), s10), (DefaultConstructorMarker) null);
    }

    public final void Y(int i10, short s10) {
        if (i10 == 0) {
            this.f104922a = s10;
            return;
        }
        if (i10 == 1) {
            this.f104923b = s10;
        } else if (i10 == 2) {
            this.f104924c = s10;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.f104925d = s10;
        }
    }

    public final void Z(@NotNull h0 index, short s10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104926a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104922a = s10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104923b = s10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104924c = s10;
                return;
            case 10:
            case 11:
            case 12:
                this.f104925d = s10;
                return;
            default:
                throw new k0();
        }
    }

    public final short a() {
        return this.f104922a;
    }

    public final void a0(int i10, int i11, short s10) {
        Y(i10, s10);
        Y(i11, s10);
    }

    public final short b() {
        return this.f104923b;
    }

    public final void b0(@NotNull h0 index1, @NotNull h0 index2, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Z(index1, s10);
        Z(index2, s10);
    }

    public final short c() {
        return this.f104924c;
    }

    public final void c0(int i10, int i11, int i12, int i13, short s10) {
        Y(i10, s10);
        Y(i11, s10);
        Y(i12, s10);
        Y(i13, s10);
    }

    public final short d() {
        return this.f104925d;
    }

    public final void d0(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        Z(index1, s10);
        Z(index2, s10);
        Z(index3, s10);
        Z(index4, s10);
    }

    @NotNull
    public final l e(short s10, short s11, short s12, short s13) {
        return new l(s10, s11, s12, s13, (DefaultConstructorMarker) null);
    }

    public final void e0(int i10, int i11, int i12, short s10) {
        Y(i10, s10);
        Y(i11, s10);
        Y(i12, s10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i.L(this.f104922a, lVar.f104922a) && i.L(this.f104923b, lVar.f104923b) && i.L(this.f104924c, lVar.f104924c) && i.L(this.f104925d, lVar.f104925d);
    }

    public final void f0(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Z(index1, s10);
        Z(index2, s10);
        Z(index3, s10);
    }

    @NotNull
    public final l g() {
        short s10 = this.f104922a;
        this.f104922a = i.E(s10);
        short s11 = this.f104923b;
        this.f104923b = i.E(s11);
        short s12 = this.f104924c;
        this.f104924c = i.E(s12);
        short s13 = this.f104925d;
        this.f104925d = i.E(s13);
        return new l(s10, s11, s12, s13, (DefaultConstructorMarker) null);
    }

    public final void g0(short s10) {
        u0(s10);
    }

    @NotNull
    public final l h(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.H(I(), v10.r()), i.H(M(), v10.t()), N(), H(), (DefaultConstructorMarker) null);
    }

    public final void h0(short s10) {
        A0(s10);
    }

    public int hashCode() {
        return (((((i.T(this.f104922a) * 31) + i.T(this.f104923b)) * 31) + i.T(this.f104924c)) * 31) + i.T(this.f104925d);
    }

    @NotNull
    public final l i(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.H(I(), v10.z()), i.H(M(), v10.C()), i.H(N(), v10.D()), H(), (DefaultConstructorMarker) null);
    }

    public final void i0(short s10) {
        z0(s10);
    }

    @NotNull
    public final l j(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.H(I(), v10.I()), i.H(M(), v10.M()), i.H(N(), v10.N()), i.H(H(), v10.H()), (DefaultConstructorMarker) null);
    }

    public final void j0(short s10) {
        A0(s10);
    }

    @NotNull
    public final l k(short s10) {
        return new l(i.H(I(), s10), i.H(M(), s10), i.H(N(), s10), i.H(H(), s10), (DefaultConstructorMarker) null);
    }

    public final void k0(short s10) {
        u0(s10);
    }

    @NotNull
    public final j l(int i10, int i11) {
        return new j(r(i10), r(i11), null);
    }

    public final void l0(short s10) {
        v0(s10);
    }

    @NotNull
    public final j m(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new j(s(index1), s(index2), null);
    }

    public final void m0(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.r());
        z0(value.t());
    }

    @NotNull
    public final k n(int i10, int i11, int i12) {
        return new k(r(i10), r(i11), r(i12), (DefaultConstructorMarker) null);
    }

    public final void n0(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.z());
        z0(value.C());
        A0(value.D());
    }

    @NotNull
    public final k o(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new k(s(index1), s(index2), s(index3), (DefaultConstructorMarker) null);
    }

    public final void o0(@NotNull l value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.I());
        z0(value.M());
        A0(value.N());
        u0(value.H());
    }

    @NotNull
    public final l p(int i10, int i11, int i12, int i13) {
        return new l(r(i10), r(i11), r(i12), r(i13), (DefaultConstructorMarker) null);
    }

    public final void p0(short s10) {
        v0(s10);
    }

    @NotNull
    public final l q(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, @NotNull h0 index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new l(s(index1), s(index2), s(index3), s(index4), (DefaultConstructorMarker) null);
    }

    public final void q0(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.r());
        z0(value.t());
    }

    public final short r(int i10) {
        if (i10 == 0) {
            return this.f104922a;
        }
        if (i10 == 1) {
            return this.f104923b;
        }
        if (i10 == 2) {
            return this.f104924c;
        }
        int i11 = 7 ^ 3;
        if (i10 == 3) {
            return this.f104925d;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public final void r0(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.z());
        z0(value.C());
        A0(value.D());
    }

    public final short s(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104926a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104922a;
            case 4:
            case 5:
            case 6:
                return this.f104923b;
            case 7:
            case 8:
            case 9:
                return this.f104924c;
            case 10:
            case 11:
            case 12:
                return this.f104925d;
            default:
                throw new k0();
        }
    }

    public final void s0(@NotNull l value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.I());
        z0(value.M());
        A0(value.N());
        u0(value.H());
    }

    public final short t() {
        return H();
    }

    public final void t0(short s10) {
        z0(s10);
    }

    @NotNull
    public String toString() {
        return "Half4(x=" + i.r0(this.f104922a) + ", y=" + i.r0(this.f104923b) + ", z=" + i.r0(this.f104924c) + ", w=" + i.r0(this.f104925d) + ")";
    }

    public final short u() {
        return N();
    }

    public final void u0(short s10) {
        this.f104925d = s10;
    }

    public final short v() {
        return M();
    }

    public final void v0(short s10) {
        this.f104922a = s10;
    }

    public final short w() {
        return N();
    }

    public final void w0(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.r());
        z0(value.t());
    }

    public final short x() {
        return H();
    }

    public final void x0(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.z());
        z0(value.C());
        A0(value.D());
    }

    public final short y() {
        return I();
    }

    public final void y0(@NotNull l value) {
        Intrinsics.checkNotNullParameter(value, "value");
        v0(value.I());
        z0(value.M());
        A0(value.N());
        u0(value.H());
    }

    @NotNull
    public final j z() {
        return new j(I(), M(), null);
    }

    public final void z0(short s10) {
        this.f104923b = s10;
    }

    public /* synthetic */ l(k kVar, short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, s10);
    }

    public /* synthetic */ l(short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10);
    }

    public /* synthetic */ l(short s10, short s11, short s12, short s13, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, s11, s12, s13);
    }

    private l(short s10, short s11, short s12, short s13) {
        this.f104922a = s10;
        this.f104923b = s11;
        this.f104924c = s12;
        this.f104925d = s13;
    }

    public /* synthetic */ l(short s10, short s11, short s12, short s13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? i.f104900b.k() : s10, (i10 & 2) != 0 ? i.f104900b.k() : s11, (i10 & 4) != 0 ? i.f104900b.k() : s12, (i10 & 8) != 0 ? i.f104900b.k() : s13, (DefaultConstructorMarker) null);
    }

    private l(short s10) {
        this(s10, s10, s10, s10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private l(j v10, short s10, short s11) {
        this(v10.r(), v10.t(), s10, s11, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ l(j jVar, short s10, short s11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i10 & 2) != 0 ? i.f104900b.k() : s10, (i10 & 4) != 0 ? i.f104900b.k() : s11, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private l(k v10, short s10) {
        this(v10.z(), v10.C(), v10.D(), s10, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ l(k kVar, short s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? i.f104900b.k() : s10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull l v10) {
        this(v10.f104922a, v10.f104923b, v10.f104924c, v10.f104925d, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
