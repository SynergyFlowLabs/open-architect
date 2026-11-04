package com.ionspin.kotlin.bignum.decimal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final a A(float f10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N(f10, null, null, 3, null).e2(other);
    }

    @NotNull
    public static final a B(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O(i10, null, null, 3, null).e2(other);
    }

    @NotNull
    public static final a C(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return P(j10, null, null, 3, null).e2(other);
    }

    @NotNull
    public static final a D(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R(s10, null, null, 3, null).e2(other);
    }

    @NotNull
    public static final a E(byte b10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.F(b10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a F(double d10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.L(d10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a G(float f10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.N(f10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a H(int i10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.Q(i10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a I(long j10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.X(j10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a J(@NotNull String str, @Nullable Long l10, @Nullable c cVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a.f131005i.E0(str, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    @NotNull
    public static final a K(short s10, @Nullable Long l10, @Nullable c cVar) {
        return a.f131005i.e0(s10, cVar).t1(l10 != null ? l10.longValue() : 0L);
    }

    public static /* synthetic */ a L(byte b10, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return E(b10, l10, cVar);
    }

    public static /* synthetic */ a M(double d10, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return F(d10, l10, cVar);
    }

    public static /* synthetic */ a N(float f10, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return G(f10, l10, cVar);
    }

    public static /* synthetic */ a O(int i10, Long l10, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l10 = null;
        }
        if ((i11 & 2) != 0) {
            cVar = null;
        }
        return H(i10, l10, cVar);
    }

    public static /* synthetic */ a P(long j10, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return I(j10, l10, cVar);
    }

    public static /* synthetic */ a Q(String str, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return J(str, l10, cVar);
    }

    public static /* synthetic */ a R(short s10, Long l10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return K(s10, l10, cVar);
    }

    @NotNull
    public static final a S(byte b10, long j10, @Nullable c cVar) {
        return a.f131005i.J(b10, j10, cVar);
    }

    @NotNull
    public static final a T(int i10, long j10, @Nullable c cVar) {
        return a.f131005i.U(i10, j10, cVar);
    }

    @NotNull
    public static final a U(long j10, long j11, @Nullable c cVar) {
        return a.f131005i.b0(j10, j11, cVar);
    }

    @NotNull
    public static final a V(short s10, long j10, @Nullable c cVar) {
        return a.f131005i.i0(s10, j10, cVar);
    }

    public static /* synthetic */ a W(byte b10, long j10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return S(b10, j10, cVar);
    }

    public static /* synthetic */ a X(int i10, long j10, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cVar = null;
        }
        return T(i10, j10, cVar);
    }

    public static /* synthetic */ a Y(long j10, long j11, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return U(j10, j11, cVar);
    }

    public static /* synthetic */ a Z(short s10, long j10, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return V(s10, j10, cVar);
    }

    @NotNull
    public static final a a(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L(b10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a b(double d10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return M(d10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a c(float f10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N(f10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a d(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O(i10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a e(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return P(j10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a f(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R(s10, null, null, 3, null).O0(other);
    }

    @NotNull
    public static final a g(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L(b10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a h(double d10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 7 ^ 0;
        return M(d10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a i(float f10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N(f10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a j(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O(i10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a k(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return P(j10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a l(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R(s10, null, null, 3, null).q1(other);
    }

    @NotNull
    public static final a m(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L(b10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a n(double d10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 5 & 0;
        return M(d10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a o(float f10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N(f10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a p(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O(i10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a q(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 7 >> 0;
        return P(j10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a r(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R(s10, null, null, 3, null).E1(other);
    }

    @NotNull
    public static final a s(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L(b10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a t(double d10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 6 >> 0;
        return M(d10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a u(float f10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return N(f10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a v(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i11 = 3 & 0;
        return O(i10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a w(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return P(j10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a x(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return R(s10, null, null, 3, null).L1(other);
    }

    @NotNull
    public static final a y(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L(b10, null, null, 3, null).e2(other);
    }

    @NotNull
    public static final a z(double d10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return M(d10, null, null, 3, null).e2(other);
    }
}
