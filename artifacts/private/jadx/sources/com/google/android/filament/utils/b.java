package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f104816c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104817a;

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
            f104817a = iArr;
        }
    }

    public b() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ b e(b bVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bVar.f104814a;
        }
        if ((i10 & 2) != 0) {
            z11 = bVar.f104815b;
        }
        if ((i10 & 4) != 0) {
            z12 = bVar.f104816c;
        }
        return bVar.d(z10, z11, z12);
    }

    public final boolean A(int i10) {
        return j(i10 - 1);
    }

    public final void B(int i10, int i11, int i12, boolean z10) {
        D(i10, z10);
        D(i11, z10);
        D(i12, z10);
    }

    public final void C(int i10, int i11, boolean z10) {
        D(i10, z10);
        D(i11, z10);
    }

    public final void D(int i10, boolean z10) {
        if (i10 == 0) {
            this.f104814a = z10;
        } else if (i10 == 1) {
            this.f104815b = z10;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("index must be in 0..2");
            }
            this.f104816c = z10;
        }
    }

    public final void E(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        G(index1, z10);
        G(index2, z10);
        G(index3, z10);
    }

    public final void F(@NotNull h0 index1, @NotNull h0 index2, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        G(index1, z10);
        G(index2, z10);
    }

    public final void G(@NotNull h0 index, boolean z10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104817a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104814a = z10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104815b = z10;
                return;
            case 7:
            case 8:
            case 9:
                this.f104816c = z10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final void H(boolean z10) {
        V(z10);
    }

    public final void I(boolean z10) {
        U(z10);
    }

    public final void J(boolean z10) {
        V(z10);
    }

    public final void K(boolean z10) {
        R(z10);
    }

    public final void L(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.o());
        U(value.q());
    }

    public final void M(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.v());
        U(value.y());
        V(value.z());
    }

    public final void N(boolean z10) {
        R(z10);
    }

    public final void O(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.o());
        U(value.q());
    }

    public final void P(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.v());
        U(value.y());
        V(value.z());
    }

    public final void Q(boolean z10) {
        U(z10);
    }

    public final void R(boolean z10) {
        this.f104814a = z10;
    }

    public final void S(@NotNull com.google.android.filament.utils.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.o());
        U(value.q());
    }

    public final void T(@NotNull b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        R(value.v());
        U(value.y());
        V(value.z());
    }

    public final void U(boolean z10) {
        this.f104815b = z10;
    }

    public final void V(boolean z10) {
        this.f104816c = z10;
    }

    public final boolean a() {
        return this.f104814a;
    }

    public final boolean b() {
        return this.f104815b;
    }

    public final boolean c() {
        return this.f104816c;
    }

    @NotNull
    public final b d(boolean z10, boolean z11, boolean z12) {
        return new b(z10, z11, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104814a == bVar.f104814a && this.f104815b == bVar.f104815b && this.f104816c == bVar.f104816c;
    }

    @NotNull
    public final com.google.android.filament.utils.a f(int i10, int i11) {
        return new com.google.android.filament.utils.a(j(i10), j(i11));
    }

    @NotNull
    public final com.google.android.filament.utils.a g(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new com.google.android.filament.utils.a(k(index1), k(index2));
    }

    @NotNull
    public final b h(int i10, int i11, int i12) {
        return new b(j(i10), j(i11), j(i12));
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f104814a) * 31) + Boolean.hashCode(this.f104815b)) * 31) + Boolean.hashCode(this.f104816c);
    }

    @NotNull
    public final b i(@NotNull h0 index1, @NotNull h0 index2, @NotNull h0 index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new b(k(index1), k(index2), k(index3));
    }

    public final boolean j(int i10) {
        if (i10 == 0) {
            return this.f104814a;
        }
        if (i10 == 1) {
            return this.f104815b;
        }
        if (i10 == 2) {
            return this.f104816c;
        }
        throw new IllegalArgumentException("index must be in 0..2");
    }

    public final boolean k(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104817a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104814a;
            case 4:
            case 5:
            case 6:
                return this.f104815b;
            case 7:
            case 8:
            case 9:
                return this.f104816c;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final boolean l() {
        return z();
    }

    public final boolean m() {
        return y();
    }

    public final boolean n() {
        return z();
    }

    public final boolean o() {
        return v();
    }

    @NotNull
    public final com.google.android.filament.utils.a p() {
        return new com.google.android.filament.utils.a(v(), y());
    }

    @NotNull
    public final b q() {
        return new b(v(), y(), z());
    }

    public final boolean r() {
        return v();
    }

    @NotNull
    public final com.google.android.filament.utils.a s() {
        return new com.google.android.filament.utils.a(v(), y());
    }

    @NotNull
    public final b t() {
        return new b(v(), y(), z());
    }

    @NotNull
    public String toString() {
        return "Bool3(x=" + this.f104814a + ", y=" + this.f104815b + ", z=" + this.f104816c + ")";
    }

    public final boolean u() {
        return y();
    }

    public final boolean v() {
        return this.f104814a;
    }

    @NotNull
    public final com.google.android.filament.utils.a w() {
        return new com.google.android.filament.utils.a(v(), y());
    }

    @NotNull
    public final b x() {
        return new b(v(), y(), z());
    }

    public final boolean y() {
        return this.f104815b;
    }

    public final boolean z() {
        return this.f104816c;
    }

    public b(boolean z10, boolean z11, boolean z12) {
        this.f104814a = z10;
        this.f104815b = z11;
        this.f104816c = z12;
    }

    public /* synthetic */ b(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull com.google.android.filament.utils.a v10, boolean z10) {
        this(v10.o(), v10.q(), z10);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ b(com.google.android.filament.utils.a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull b v10) {
        this(v10.f104814a, v10.f104815b, v10.f104816c);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
