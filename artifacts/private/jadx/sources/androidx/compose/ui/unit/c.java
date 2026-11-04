package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.a1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,634:1\n621#1:635\n627#1:636\n552#1,4:732\n552#1,4:738\n38#2,4:637\n101#3,10:641\n101#3,10:651\n101#3,10:661\n101#3,10:671\n101#3,10:683\n101#3,10:695\n101#3,10:707\n101#3,10:717\n105#3:731\n105#3:736\n105#3:737\n105#3:742\n105#3:743\n54#4:681\n59#4:693\n54#4:727\n59#4:729\n85#5:682\n90#5:694\n80#5:706\n85#5:728\n90#5:730\n30#6:705\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n440#1:635\n442#1:636\n546#1:732,4\n548#1:738,4\n486#1:637,4\n514#1:641,10\n515#1:651,10\n516#1:661,10\n517#1:671,10\n525#1:683,10\n526#1:695,10\n530#1:707,10\n533#1:717,10\n545#1:731\n546#1:736\n547#1:737\n548#1:742\n555#1:743\n525#1:681\n526#1:693\n538#1:727\n538#1:729\n525#1:682\n526#1:694\n524#1:706\n538#1:728\n538#1:730\n524#1:705\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42666a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f42667b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42668c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42669d = 32766;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42670e = 65535;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42671f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42672g = 65534;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42673h = 32767;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f42674i = 18;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f42675j = 8190;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f42676k = 262143;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f42677l = 13;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f42678m = 262142;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42679n = 8191;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f42680o = -8589934589L;

    @k7
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            p.c("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int c(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        int i12 = i10 + i11;
        if (i12 < 0) {
            i12 = 0;
        }
        return i12;
    }

    private static final int d(int i10) {
        return (i10 >> 1) + (i10 & 1);
    }

    public static final int e(int i10) {
        if (i10 < f42679n) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < f42676k ? 18 : 255;
    }

    @k7
    public static final long f(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iR = b.r(j10);
        int iP = b.p(j10);
        if (i10 < iR) {
            i10 = iR;
        }
        if (i10 <= iP) {
            iP = i10;
        }
        int i11 = (int) (j11 & k0.f265952a);
        int iQ = b.q(j10);
        int iO = b.o(j10);
        if (i11 < iQ) {
            i11 = iQ;
        }
        if (i11 <= iO) {
            iO = i11;
        }
        return u.e((((long) iP) << 32) | (((long) iO) & k0.f265952a));
    }

    public static final long g(long j10, long j11) {
        int iR = b.r(j10);
        int iP = b.p(j10);
        int iQ = b.q(j10);
        int iO = b.o(j10);
        int iR2 = b.r(j11);
        if (iR2 < iR) {
            iR2 = iR;
        }
        if (iR2 > iP) {
            iR2 = iP;
        }
        int iP2 = b.p(j11);
        if (iP2 >= iR) {
            iR = iP2;
        }
        if (iR <= iP) {
            iP = iR;
        }
        int iQ2 = b.q(j11);
        if (iQ2 < iQ) {
            iQ2 = iQ;
        }
        if (iQ2 > iO) {
            iQ2 = iO;
        }
        int iO2 = b.o(j11);
        if (iO2 >= iQ) {
            iQ = iO2;
        }
        if (iQ <= iO) {
            iO = iQ;
        }
        return a(iR2, iP, iQ2, iO);
    }

    @k7
    public static final int h(long j10, int i10) {
        int iQ = b.q(j10);
        int iO = b.o(j10);
        if (i10 < iQ) {
            i10 = iQ;
        }
        return i10 > iO ? iO : i10;
    }

    @k7
    public static final int i(long j10, int i10) {
        int iR = b.r(j10);
        int iP = b.p(j10);
        if (i10 < iR) {
            i10 = iR;
        }
        return i10 > iP ? iP : i10;
    }

    public static final long j(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iE = e(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iE2 = e(i15);
        if (iE + iE2 > 31) {
            s(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iE2 - 13;
        return b.b((((long) (i16 & (~(i16 >> 31)))) << 33) | ((long) ((i18 >> 1) + (i18 & 1))) | (((long) i10) << 2) | (((long) i12) << (iE2 + 2)) | (((long) (i17 & (~(i17 >> 31)))) << (iE2 + 33)));
    }

    @a1
    public static /* synthetic */ void k() {
    }

    private static final int l(int i10) {
        return (1 << (18 - i10)) - 1;
    }

    private static final int m(int i10) {
        return ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
    }

    @k7
    public static final boolean n(long j10, long j11) {
        int iR = b.r(j10);
        int iP = b.p(j10);
        int i10 = (int) (j11 >> 32);
        if (iR <= i10 && i10 <= iP) {
            int iQ = b.q(j10);
            int iO = b.o(j10);
            int i11 = (int) (j11 & k0.f265952a);
            if (iQ <= i11 && i11 <= iO) {
                return true;
            }
        }
        return false;
    }

    private static final int o(int i10) {
        if (i10 < f42679n) {
            return f42678m;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return f42669d;
        }
        if (i10 < f42676k) {
            return f42675j;
        }
        t(i10);
        throw new kotlin.a0();
    }

    private static final int p(int i10) {
        return i10 + 15;
    }

    @k7
    public static final long q(long j10, int i10, int i11) {
        int iR = b.r(j10) + i10;
        int i12 = 2 & 0;
        if (iR < 0) {
            iR = 0;
        }
        int iP = b.p(j10);
        if (iP != Integer.MAX_VALUE && (iP = iP + i10) < 0) {
            iP = 0;
        }
        int iQ = b.q(j10) + i11;
        if (iQ < 0) {
            iQ = 0;
        }
        int iO = b.o(j10);
        return a(iR, iP, iQ, (iO == Integer.MAX_VALUE || (iO = iO + i11) >= 0) ? iO : 0);
    }

    public static /* synthetic */ long r(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return q(j10, i10, i11);
    }

    public static final void s(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    @NotNull
    public static final Void t(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    private static final int u(int i10) {
        return (1 << (i10 + 13)) - 1;
    }
}
