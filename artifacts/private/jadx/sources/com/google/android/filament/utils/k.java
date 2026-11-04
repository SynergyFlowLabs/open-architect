package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f104918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f104919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f104920c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104921a;

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
            f104921a = iArr;
        }
    }

    public /* synthetic */ k(j jVar, short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, s10);
    }

    public static /* synthetic */ k e(k kVar, short s10, short s11, short s12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = kVar.f104918a;
        }
        if ((i10 & 2) != 0) {
            s11 = kVar.f104919b;
        }
        if ((i10 & 4) != 0) {
            s12 = kVar.f104920c;
        }
        return kVar.d(s10, s11, s12);
    }

    @NotNull
    public final j A() {
        return new j(z(), C(), null);
    }

    @NotNull
    public final k B() {
        return new k(z(), C(), D(), (DefaultConstructorMarker) null);
    }

    public final short C() {
        return this.f104919b;
    }

    public final short D() {
        return this.f104920c;
    }

    @NotNull
    public final k E() {
        short s10 = this.f104918a;
        this.f104918a = i.U(s10);
        short s11 = this.f104919b;
        this.f104919b = i.U(s11);
        short s12 = this.f104920c;
        this.f104920c = i.U(s12);
        boolean z10 = true | false;
        return new k(s10, s11, s12, (DefaultConstructorMarker) null);
    }

    public final short F(int i10) {
        return n(i10 - 1);
    }

    @NotNull
    public final k G(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.a0(z(), v10.r()), i.a0(C(), v10.t()), D(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k H(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.a0(z(), v10.z()), i.a0(C(), v10.C()), i.a0(D(), v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k I(short s10) {
        return new k(i.a0(z(), s10), i.a0(C(), s10), i.a0(D(), s10), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k J(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.f0(z(), v10.r()), i.f0(C(), v10.t()), D(), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k K(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.f0(z(), v10.z()), i.f0(C(), v10.C()), i.f0(D(), v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k L(short s10) {
        return new k(i.f0(z(), s10), i.f0(C(), s10), i.f0(D(), s10), (DefaultConstructorMarker) null);
    }

    public final void M(int i10, short s10) {
        if (i10 == 0) {
            this.f104918a = s10;
        } else if (i10 == 1) {
            this.f104919b = s10;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("index must be in 0..2");
            }
            this.f104920c = s10;
        }
    }

    public final void N(@NotNull h0 index, short s10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104921a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104918a = s10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104919b = s10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104920c = s10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final void O(int i10, int i11, short s10) {
        M(i10, s10);
        M(i11, s10);
    }

    public final void P(@NotNull h0 index1, @NotNull h0 index2, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        N(index1, s10);
        N(index2, s10);
    }

    public final void Q(int i10, int i11, int i12, short s10) {
        M(i10, s10);
        M(i11, s10);
        M(i12, s10);
    }

    public final void R(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        N(index1, s10);
        N(index2, s10);
        N(index3, s10);
    }

    public final void S(short s10) {
        g0(s10);
    }

    public final void T(short s10) {
        f0(s10);
    }

    public final void U(short s10) {
        g0(s10);
    }

    public final void V(short s10) {
        c0(s10);
    }

    public final void W(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.r());
        f0(value.t());
    }

    public final void X(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.z());
        f0(value.C());
        g0(value.D());
    }

    public final void Y(short s10) {
        c0(s10);
    }

    public final void Z(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.r());
        f0(value.t());
    }

    public final short a() {
        return this.f104918a;
    }

    public final void a0(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.z());
        f0(value.C());
        g0(value.D());
    }

    public final short b() {
        return this.f104919b;
    }

    public final void b0(short s10) {
        f0(s10);
    }

    public final short c() {
        return this.f104920c;
    }

    public final void c0(short s10) {
        this.f104918a = s10;
    }

    @NotNull
    public final k d(short s10, short s11, short s12) {
        return new k(s10, s11, s12, (DefaultConstructorMarker) null);
    }

    public final void d0(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.r());
        f0(value.t());
    }

    public final void e0(@NotNull k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c0(value.z());
        f0(value.C());
        g0(value.D());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.L(this.f104918a, kVar.f104918a) && i.L(this.f104919b, kVar.f104919b) && i.L(this.f104920c, kVar.f104920c);
    }

    @NotNull
    public final k f() {
        short s10 = this.f104918a;
        this.f104918a = i.E(s10);
        short s11 = this.f104919b;
        this.f104919b = i.E(s11);
        short s12 = this.f104920c;
        this.f104920c = i.E(s12);
        return new k(s10, s11, s12, (DefaultConstructorMarker) null);
    }

    public final void f0(short s10) {
        this.f104919b = s10;
    }

    @NotNull
    public final k g(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.H(z(), v10.r()), i.H(C(), v10.t()), D(), (DefaultConstructorMarker) null);
    }

    public final void g0(short s10) {
        this.f104920c = s10;
    }

    @NotNull
    public final k h(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.H(z(), v10.z()), i.H(C(), v10.C()), i.H(D(), v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k h0(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.i0(z(), v10.r()), i.i0(C(), v10.t()), D(), (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        return (((i.T(this.f104918a) * 31) + i.T(this.f104919b)) * 31) + i.T(this.f104920c);
    }

    @NotNull
    public final k i(short s10) {
        return new k(i.H(z(), s10), i.H(C(), s10), i.H(D(), s10), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k i0(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.i0(z(), v10.z()), i.i0(C(), v10.C()), i.i0(D(), v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final j j(int i10, int i11) {
        return new j(n(i10), n(i11), null);
    }

    @NotNull
    public final k j0(short s10) {
        return new k(i.i0(z(), s10), i.i0(C(), s10), i.i0(D(), s10), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final j k(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new j(o(index1), o(index2), null);
    }

    @NotNull
    public final float[] k0() {
        return new float[]{i.m0(this.f104918a), i.m0(this.f104919b), i.m0(this.f104920c)};
    }

    @NotNull
    public final k l(int i10, int i11, int i12) {
        return new k(n(i10), n(i11), n(i12), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k l0(@NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        c0(block.invoke(i.w(z())).u0());
        f0(block.invoke(i.w(C())).u0());
        g0(block.invoke(i.w(D())).u0());
        return this;
    }

    @NotNull
    public final k m(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new k(o(index1), o(index2), o(index3), (DefaultConstructorMarker) null);
    }

    @NotNull
    public final k m0() {
        return new k(i.s0(this.f104918a), i.s0(this.f104919b), i.s0(this.f104920c), (DefaultConstructorMarker) null);
    }

    public final short n(int i10) {
        if (i10 == 0) {
            return this.f104918a;
        }
        if (i10 == 1) {
            return this.f104919b;
        }
        if (i10 == 2) {
            return this.f104920c;
        }
        throw new IllegalArgumentException("index must be in 0..2");
    }

    public final short o(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104921a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104918a;
            case 4:
            case 5:
            case 6:
                return this.f104919b;
            case 7:
            case 8:
            case 9:
                return this.f104920c;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final short p() {
        return D();
    }

    public final short q() {
        return C();
    }

    public final short r() {
        return D();
    }

    public final short s() {
        return z();
    }

    @NotNull
    public final j t() {
        return new j(z(), C(), null);
    }

    @NotNull
    public String toString() {
        return "Half3(x=" + i.r0(this.f104918a) + ", y=" + i.r0(this.f104919b) + ", z=" + i.r0(this.f104920c) + ")";
    }

    @NotNull
    public final k u() {
        return new k(z(), C(), D(), (DefaultConstructorMarker) null);
    }

    public final short v() {
        return z();
    }

    @NotNull
    public final j w() {
        return new j(z(), C(), null);
    }

    @NotNull
    public final k x() {
        return new k(z(), C(), D(), (DefaultConstructorMarker) null);
    }

    public final short y() {
        return C();
    }

    public final short z() {
        return this.f104918a;
    }

    public /* synthetic */ k(short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10);
    }

    public /* synthetic */ k(short s10, short s11, short s12, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, s11, s12);
    }

    private k(short s10, short s11, short s12) {
        this.f104918a = s10;
        this.f104919b = s11;
        this.f104920c = s12;
    }

    public /* synthetic */ k(short s10, short s11, short s12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? i.f104900b.k() : s10, (i10 & 2) != 0 ? i.f104900b.k() : s11, (i10 & 4) != 0 ? i.f104900b.k() : s12, (DefaultConstructorMarker) null);
    }

    private k(short s10) {
        this(s10, s10, s10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private k(j v10, short s10) {
        this(v10.r(), v10.t(), s10, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ k(j jVar, short s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i10 & 2) != 0 ? i.f104900b.k() : s10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull k v10) {
        this(v10.f104918a, v10.f104919b, v10.f104920c, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
