package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import androidx.media3.extractor.y0;
import kotlin.a1;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n38#4,4:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,4\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42658b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42659c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42660a;

    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n38#2,4:635\n38#2,4:639\n38#2,4:643\n465#3,6:647\n465#3,6:653\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,4\n231#1:639,4\n243#1:643,4\n305#1:647,6\n341#1:653,6\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ long g(a aVar, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
            if ((i14 & 16) != 0) {
                z10 = true;
            }
            return aVar.f(i10, i11, i12, i13, z10);
        }

        @k7
        public final long a(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = y0.f69665l;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        c.t(i15);
                        throw new kotlin.a0();
                    }
                    i14 = 8190;
                }
            }
            return c.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @k7
        public final long b(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = Integer.MAX_VALUE;
            int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = y0.f69665l;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        c.t(i15);
                        throw new kotlin.a0();
                    }
                    i14 = 8190;
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                iMin2 = Math.min(i14, i13);
            }
            return c.a(iMin, iMin3, Math.min(i14, i12), iMin2);
        }

        @k7
        public final long c(int i10, int i11) {
            if (!((i11 >= 0) & (i10 >= 0))) {
                p.c("width and height must be >= 0");
            }
            return c.j(i10, i10, i11, i11);
        }

        @k7
        public final long d(int i10) {
            if (!(i10 >= 0)) {
                p.c("height must be >= 0");
            }
            return c.j(0, Integer.MAX_VALUE, i10, i10);
        }

        @k7
        public final long e(int i10) {
            if (!(i10 >= 0)) {
                p.c("width must be >= 0");
            }
            return c.j(i10, i10, 0, Integer.MAX_VALUE);
        }

        @k7
        @kotlin.l(message = "Replace with fitPrioritizingWidth", replaceWith = @b1(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        public final long f(int i10, int i11, int i12, int i13, boolean z10) {
            return z10 ? b(i10, i11, i12, i13) : a(i10, i11, i12, i13);
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.f42660a = j10;
    }

    public static final /* synthetic */ b a(long j10) {
        return new b(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static final long c(long j10, int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10 && i13 >= i12 && i10 >= 0 && i12 >= 0)) {
            p.c("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return c.j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = r(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = p(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = q(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = o(j10);
        }
        return c(j10, i15, i16, i17, i13);
    }

    public static final long e(long j10) {
        return b(j10 & c.f42680o);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).x();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    private static final int h(long j10) {
        return (int) (j10 & 3);
    }

    public static final boolean i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean j(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    @k7
    public static /* synthetic */ void k() {
    }

    public static final boolean l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    @k7
    public static /* synthetic */ void m() {
    }

    public static final boolean n(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int o(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int p(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int q(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int r(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    @a1
    public static /* synthetic */ void s() {
    }

    public static int t(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static /* synthetic */ void u() {
    }

    public static final boolean v(long j10) {
        int i10 = (int) (3 & j10);
        boolean z10 = true;
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1;
        int i13 = (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1;
        boolean z11 = i12 == 0;
        if (i13 != 0) {
            z10 = false;
        }
        return z11 | z10;
    }

    @NotNull
    public static String w(long j10) {
        int iP = p(j10);
        String strValueOf = "Infinity";
        String strValueOf2 = iP == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iP);
        int iO = o(j10);
        if (iO != Integer.MAX_VALUE) {
            strValueOf = String.valueOf(iO);
        }
        return "Constraints(minWidth = " + r(j10) + ", maxWidth = " + strValueOf2 + ", minHeight = " + q(j10) + ", maxHeight = " + strValueOf + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f42660a, obj);
    }

    public int hashCode() {
        return t(this.f42660a);
    }

    @NotNull
    public String toString() {
        return w(this.f42660a);
    }

    public final /* synthetic */ long x() {
        return this.f42660a;
    }
}
