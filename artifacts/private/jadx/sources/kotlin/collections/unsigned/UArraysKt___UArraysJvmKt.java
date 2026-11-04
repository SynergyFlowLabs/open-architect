package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.b1;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.e1;
import kotlin.e2;
import kotlin.f2;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.l2;
import kotlin.m;
import kotlin.q1;
import kotlin.r1;
import kotlin.u;
import kotlin.u0;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import kotlin.z1;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class UArraysKt___UArraysJvmKt {
    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<u1> m900asListajY9A(@NotNull int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<q1> m901asListGBYM_sE(@NotNull byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<y1> m902asListQwZRm1k(@NotNull long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    @e1(version = "1.3")
    @u
    @NotNull
    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<e2> m903asListrL5Bavg(@NotNull short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m904binarySearch2fe2U9s(@NotNull int[] binarySearch, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i11, i12, v1.v(binarySearch));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iE = l2.e(binarySearch[i14], i10);
            if (iE < 0) {
                i11 = i14 + 1;
            } else {
                if (iE <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m905binarySearch2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = v1.v(iArr);
        }
        return m904binarySearch2fe2U9s(iArr, i10, i11, i12);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m906binarySearchEtDCXyQ(@NotNull short[] binarySearch, short s10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, f2.v(binarySearch));
        int i12 = s10 & e2.f312492d;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iE = l2.e(binarySearch[i14], i12);
            if (iE < 0) {
                i10 = i14 + 1;
            } else {
                if (iE <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m907binarySearchEtDCXyQ$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = f2.v(sArr);
        }
        return m906binarySearchEtDCXyQ(sArr, s10, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m908binarySearchK6DWlUc(@NotNull long[] binarySearch, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, z1.v(binarySearch));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iN = l2.n(binarySearch[i13], j10);
            if (iN < 0) {
                i10 = i13 + 1;
            } else {
                if (iN <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m909binarySearchK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = z1.v(jArr);
        }
        return m908binarySearchK6DWlUc(jArr, j10, i10, i11);
    }

    @e1(version = "1.3")
    @u
    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m910binarySearchWpHrYlw(@NotNull byte[] binarySearch, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, r1.v(binarySearch));
        int i12 = b10 & 255;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iE = l2.e(binarySearch[i14], i12);
            if (iE < 0) {
                i10 = i14 + 1;
            } else {
                if (iE <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m911binarySearchWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = r1.v(bArr);
        }
        return m910binarySearchWpHrYlw(bArr, b10, i10, i11);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m912elementAtPpDY95g(byte[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return r1.t(elementAt, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m913elementAtnggk6HY(short[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return f2.t(elementAt, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m914elementAtqFRl0hI(int[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return v1.t(elementAt, i10);
    }

    @e1(version = "1.3")
    @f
    @u
    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m915elementAtr7IrZao(long[] elementAt, int i10) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return z1.t(elementAt, i10);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ u1 m916maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m1284maxOrNullajY9A(max);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ q1 m917maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m1285maxOrNullGBYM_sE(max);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ y1 m918maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m1286maxOrNullQwZRm1k(max);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ e2 m919maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m1287maxOrNullrL5Bavg(max);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> q1 m920maxByJOV_ifY(byte[] maxBy, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(maxBy)) {
            return null;
        }
        byte bT = r1.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return q1.c(bT);
        }
        R rInvoke = selector.invoke(q1.c(bT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(maxBy, i10);
                R rInvoke2 = selector.invoke(q1.c(bT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bT = bT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> y1 m921maxByMShoTSo(long[] maxBy, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(maxBy)) {
            return null;
        }
        long jT = z1.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return y1.c(jT);
        }
        R rInvoke = selector.invoke(y1.c(jT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(maxBy, i10);
                R rInvoke2 = selector.invoke(y1.c(jT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jT = jT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> u1 m922maxByjgv0xPQ(int[] maxBy, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(maxBy)) {
            return null;
        }
        int iT = v1.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return u1.c(iT);
        }
        R rInvoke = selector.invoke(u1.c(iT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(maxBy, i10);
                R rInvoke2 = selector.invoke(u1.c(iT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iT = iT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> e2 m923maxByxTcfx_M(short[] maxBy, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(maxBy)) {
            return null;
        }
        short sT = f2.t(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return e2.c(sT);
        }
        R rInvoke = selector.invoke(e2.c(sT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(maxBy, i10);
                R rInvoke2 = selector.invoke(e2.c(sT2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sT = sT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ q1 m924maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1292maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ u1 m925maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1293maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ e2 m926maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1294maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ y1 m927maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1295maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ u1 m928minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m1340minOrNullajY9A(min);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ q1 m929minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m1341minOrNullGBYM_sE(min);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ y1 m930minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m1342minOrNullQwZRm1k(min);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ e2 m931minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m1343minOrNullrL5Bavg(min);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> q1 m932minByJOV_ifY(byte[] minBy, Function1<? super q1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (r1.B(minBy)) {
            return null;
        }
        byte bT = r1.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return q1.c(bT);
        }
        R rInvoke = selector.invoke(q1.c(bT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bT2 = r1.t(minBy, i10);
                R rInvoke2 = selector.invoke(q1.c(bT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bT = bT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return q1.c(bT);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> y1 m933minByMShoTSo(long[] minBy, Function1<? super y1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (z1.B(minBy)) {
            return null;
        }
        long jT = z1.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return y1.c(jT);
        }
        R rInvoke = selector.invoke(y1.c(jT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jT2 = z1.t(minBy, i10);
                R rInvoke2 = selector.invoke(y1.c(jT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jT = jT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return y1.c(jT);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> u1 m934minByjgv0xPQ(int[] minBy, Function1<? super u1, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (v1.B(minBy)) {
            return null;
        }
        int iT = v1.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return u1.c(iT);
        }
        R rInvoke = selector.invoke(u1.c(iT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iT2 = v1.t(minBy, i10);
                R rInvoke2 = selector.invoke(u1.c(iT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iT = iT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return u1.c(iT);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    @f
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> e2 m935minByxTcfx_M(short[] minBy, Function1<? super e2, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (f2.B(minBy)) {
            return null;
        }
        short sT = f2.t(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return e2.c(sT);
        }
        R rInvoke = selector.invoke(e2.c(sT));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sT2 = f2.t(minBy, i10);
                R rInvoke2 = selector.invoke(e2.c(sT2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sT = sT2;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return e2.c(sT);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ q1 m936minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1348minWithOrNullXMRcp5o(minWith, comparator);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ u1 m937minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1349minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ e2 m938minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1350minWithOrNulleOHTfZs(minWith, comparator);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @e1(version = "1.3")
    @m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @u
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ y1 m939minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m1351minWithOrNullzrEWJaI(minWith, comparator);
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(int[] sumOf, Function1<? super u1, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iV = v1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(u1.c(v1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(int[] sumOf, Function1<? super u1, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iV = v1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(u1.c(v1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(long[] sumOf, Function1<? super y1, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iV = z1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(y1.c(z1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(long[] sumOf, Function1<? super y1, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iV = z1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(y1.c(z1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, Function1<? super q1, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iV = r1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(q1.c(r1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(byte[] sumOf, Function1<? super q1, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iV = r1.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(q1.c(r1.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(short[] sumOf, Function1<? super e2, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iV = f2.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(e2.c(f2.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @u
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(short[] sumOf, Function1<? super e2, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iV = f2.v(sumOf);
        for (int i10 = 0; i10 < iV; i10++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(e2.c(f2.t(sumOf, i10))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
