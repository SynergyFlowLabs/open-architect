package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f104915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f104916b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104917a;

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
            f104917a = iArr;
        }
    }

    public /* synthetic */ j(short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10);
    }

    public static /* synthetic */ j d(j jVar, short s10, short s11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = jVar.f104915a;
        }
        if ((i10 & 2) != 0) {
            s11 = jVar.f104916b;
        }
        return jVar.c(s10, s11);
    }

    public final void A(int i10, short s10) {
        if (i10 == 0) {
            this.f104915a = s10;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.f104916b = s10;
        }
    }

    public final void B(@NotNull h0 index, short s10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104917a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104915a = s10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104916b = s10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final void C(int i10, int i11, short s10) {
        A(i10, s10);
        A(i11, s10);
    }

    public final void D(@NotNull h0 index1, @NotNull h0 index2, short s10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        B(index1, s10);
        B(index2, s10);
    }

    public final void E(short s10) {
        M(s10);
    }

    public final void F(short s10) {
        K(s10);
    }

    public final void G(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        K(value.r());
        M(value.t());
    }

    public final void H(short s10) {
        K(s10);
    }

    public final void I(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        K(value.r());
        M(value.t());
    }

    public final void J(short s10) {
        M(s10);
    }

    public final void K(short s10) {
        this.f104915a = s10;
    }

    public final void L(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        K(value.r());
        M(value.t());
    }

    public final void M(short s10) {
        this.f104916b = s10;
    }

    @NotNull
    public final j N(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new j(i.i0(r(), v10.r()), i.i0(t(), v10.t()), null);
    }

    @NotNull
    public final j O(short s10) {
        return new j(i.i0(r(), s10), i.i0(t(), s10), null);
    }

    @NotNull
    public final float[] P() {
        return new float[]{i.m0(this.f104915a), i.m0(this.f104916b)};
    }

    @NotNull
    public final j Q(@NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        K(block.invoke(i.w(r())).u0());
        M(block.invoke(i.w(t())).u0());
        return this;
    }

    @NotNull
    public final j R() {
        return new j(i.s0(this.f104915a), i.s0(this.f104916b), null);
    }

    public final short a() {
        return this.f104915a;
    }

    public final short b() {
        return this.f104916b;
    }

    @NotNull
    public final j c(short s10, short s11) {
        return new j(s10, s11, null);
    }

    @NotNull
    public final j e() {
        short s10 = this.f104915a;
        this.f104915a = i.E(s10);
        short s11 = this.f104916b;
        this.f104916b = i.E(s11);
        return new j(s10, s11, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.L(this.f104915a, jVar.f104915a) && i.L(this.f104916b, jVar.f104916b);
    }

    @NotNull
    public final j f(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new j(i.H(r(), v10.r()), i.H(t(), v10.t()), null);
    }

    @NotNull
    public final j g(short s10) {
        return new j(i.H(r(), s10), i.H(t(), s10), null);
    }

    @NotNull
    public final j h(int i10, int i11) {
        return new j(j(i10), j(i11), null);
    }

    public int hashCode() {
        return (i.T(this.f104915a) * 31) + i.T(this.f104916b);
    }

    @NotNull
    public final j i(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new j(k(index1), k(index2), null);
    }

    public final short j(int i10) {
        if (i10 == 0) {
            return this.f104915a;
        }
        if (i10 == 1) {
            return this.f104916b;
        }
        throw new IllegalArgumentException("index must be in 0..1");
    }

    public final short k(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104917a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104915a;
            case 4:
            case 5:
            case 6:
                return this.f104916b;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final short l() {
        return t();
    }

    public final short m() {
        return r();
    }

    @NotNull
    public final j n() {
        return new j(r(), t(), null);
    }

    public final short o() {
        return r();
    }

    @NotNull
    public final j p() {
        return new j(r(), t(), null);
    }

    public final short q() {
        return t();
    }

    public final short r() {
        return this.f104915a;
    }

    @NotNull
    public final j s() {
        return new j(r(), t(), null);
    }

    public final short t() {
        return this.f104916b;
    }

    @NotNull
    public String toString() {
        return "Half2(x=" + i.r0(this.f104915a) + ", y=" + i.r0(this.f104916b) + ")";
    }

    @NotNull
    public final j u() {
        short s10 = this.f104915a;
        this.f104915a = i.U(s10);
        short s11 = this.f104916b;
        this.f104916b = i.U(s11);
        return new j(s10, s11, null);
    }

    public final short v(int i10) {
        return j(i10 - 1);
    }

    @NotNull
    public final j w(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new j(i.a0(r(), v10.r()), i.a0(t(), v10.t()), null);
    }

    @NotNull
    public final j x(short s10) {
        return new j(i.a0(r(), s10), i.a0(t(), s10), null);
    }

    @NotNull
    public final j y(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new j(i.f0(r(), v10.r()), i.f0(t(), v10.t()), null);
    }

    @NotNull
    public final j z(short s10) {
        return new j(i.f0(r(), s10), i.f0(t(), s10), null);
    }

    public /* synthetic */ j(short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, s11);
    }

    private j(short s10, short s11) {
        this.f104915a = s10;
        this.f104916b = s11;
    }

    public /* synthetic */ j(short s10, short s11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? i.f104900b.k() : s10, (i10 & 2) != 0 ? i.f104900b.k() : s11, null);
    }

    private j(short s10) {
        this(s10, s10, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull j v10) {
        this(v10.f104915a, v10.f104916b, null);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
