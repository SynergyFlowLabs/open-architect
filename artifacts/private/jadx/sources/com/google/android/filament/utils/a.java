package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104810b;

    /* JADX INFO: renamed from: com.google.android.filament.utils.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0957a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104811a;

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
            f104811a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ a d(a aVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f104809a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f104810b;
        }
        return aVar.c(z10, z11);
    }

    public final void A(@NotNull a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C(value.o());
        E(value.q());
    }

    public final void B(boolean z10) {
        E(z10);
    }

    public final void C(boolean z10) {
        this.f104809a = z10;
    }

    public final void D(@NotNull a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C(value.o());
        E(value.q());
    }

    public final void E(boolean z10) {
        this.f104810b = z10;
    }

    public final boolean a() {
        return this.f104809a;
    }

    public final boolean b() {
        return this.f104810b;
    }

    @NotNull
    public final a c(boolean z10, boolean z11) {
        return new a(z10, z11);
    }

    @NotNull
    public final a e(int i10, int i11) {
        return new a(g(i10), g(i11));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f104809a == aVar.f104809a && this.f104810b == aVar.f104810b;
    }

    @NotNull
    public final a f(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new a(h(index1), h(index2));
    }

    public final boolean g(int i10) {
        if (i10 == 0) {
            return this.f104809a;
        }
        if (i10 == 1) {
            return this.f104810b;
        }
        throw new IllegalArgumentException("index must be in 0..1");
    }

    public final boolean h(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (C0957a.f104811a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104809a;
            case 4:
            case 5:
            case 6:
                return this.f104810b;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f104809a) * 31) + Boolean.hashCode(this.f104810b);
    }

    public final boolean i() {
        return q();
    }

    public final boolean j() {
        return o();
    }

    @NotNull
    public final a k() {
        return new a(o(), q());
    }

    public final boolean l() {
        return o();
    }

    @NotNull
    public final a m() {
        return new a(o(), q());
    }

    public final boolean n() {
        return q();
    }

    public final boolean o() {
        return this.f104809a;
    }

    @NotNull
    public final a p() {
        return new a(o(), q());
    }

    public final boolean q() {
        return this.f104810b;
    }

    public final boolean r(int i10) {
        return g(i10 - 1);
    }

    public final void s(int i10, int i11, boolean z10) {
        t(i10, z10);
        t(i11, z10);
    }

    public final void t(int i10, boolean z10) {
        if (i10 == 0) {
            this.f104809a = z10;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.f104810b = z10;
        }
    }

    @NotNull
    public String toString() {
        return "Bool2(x=" + this.f104809a + ", y=" + this.f104810b + ")";
    }

    public final void u(@NotNull h0 index1, @NotNull h0 index2, boolean z10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        v(index1, z10);
        v(index2, z10);
    }

    public final void v(@NotNull h0 index, boolean z10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (C0957a.f104811a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104809a = z10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104810b = z10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final void w(boolean z10) {
        E(z10);
    }

    public final void x(boolean z10) {
        C(z10);
    }

    public final void y(@NotNull a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C(value.o());
        E(value.q());
    }

    public final void z(boolean z10) {
        C(z10);
    }

    public a(boolean z10, boolean z11) {
        this.f104809a = z10;
        this.f104810b = z11;
    }

    public /* synthetic */ a(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull a v10) {
        this(v10.f104809a, v10.f104810b);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
