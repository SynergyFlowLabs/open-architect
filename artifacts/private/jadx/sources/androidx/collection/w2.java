package androidx.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 2 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1511:1\n301#1,7:1512\n308#1,4:1520\n301#1,7:1524\n308#1,4:1532\n301#1,7:1536\n308#1,4:1544\n321#1,7:1548\n328#1,4:1556\n321#1,7:1560\n328#1,4:1568\n321#1,7:1572\n328#1,4:1580\n269#1,7:1589\n280#1,3:1597\n283#1,9:1601\n301#1,7:1610\n308#1,4:1618\n341#1,3:1622\n269#1,7:1625\n280#1,3:1633\n283#1,9:1637\n344#1:1646\n341#1,3:1647\n269#1,7:1650\n280#1,3:1658\n283#1,9:1662\n344#1:1671\n341#1,3:1672\n269#1,7:1675\n280#1,3:1683\n283#1,9:1687\n344#1:1696\n510#1:1697\n511#1:1701\n513#1,2:1703\n515#1,3:1706\n518#1:1712\n519#1:1716\n520#1:1718\n521#1,4:1721\n527#1:1726\n528#1,8:1728\n301#1,7:1736\n308#1,4:1744\n341#1,3:1748\n269#1,7:1751\n280#1,3:1759\n283#1,9:1763\n344#1:1772\n341#1,3:1773\n269#1,7:1776\n280#1,3:1784\n283#1,9:1788\n344#1:1797\n1123#2:1519\n1123#2:1531\n1123#2:1543\n1127#2:1555\n1127#2:1567\n1127#2:1579\n1123#2:1584\n1123#2:1587\n1127#2:1588\n1123#2:1617\n1123#2:1743\n1399#3:1585\n1270#3:1586\n1399#3:1596\n1270#3:1600\n1399#3:1632\n1270#3:1636\n1399#3:1657\n1270#3:1661\n1399#3:1682\n1270#3:1686\n1165#3,3:1698\n1179#3:1702\n1175#3:1705\n1372#3,3:1709\n1386#3,3:1713\n1312#3:1717\n1303#3:1719\n1297#3:1720\n1309#3:1725\n1393#3:1727\n1399#3:1758\n1270#3:1762\n1399#3:1783\n1270#3:1787\n1165#3,3:1798\n1179#3:1801\n1175#3:1802\n1372#3,3:1803\n1386#3,3:1806\n1312#3:1809\n1303#3:1810\n1297#3:1811\n1309#3:1812\n1393#3:1813\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n*L\n178#1:1512,7\n178#1:1520,4\n195#1:1524,7\n195#1:1532,4\n209#1:1536,7\n209#1:1544,4\n219#1:1548,7\n219#1:1556,4\n236#1:1560,7\n236#1:1568,4\n250#1:1572,7\n250#1:1580,4\n343#1:1589,7\n343#1:1597,3\n343#1:1601,9\n349#1:1610,7\n349#1:1618,4\n363#1:1622,3\n363#1:1625,7\n363#1:1633,3\n363#1:1637,9\n363#1:1646\n376#1:1647,3\n376#1:1650,7\n376#1:1658,3\n376#1:1662,9\n376#1:1671\n394#1:1672,3\n394#1:1675,7\n394#1:1683,3\n394#1:1687,9\n394#1:1696\n403#1:1697\n403#1:1701\n403#1:1703,2\n403#1:1706,3\n403#1:1712\n403#1:1716\n403#1:1718\n403#1:1721,4\n403#1:1726\n403#1:1728,8\n426#1:1736,7\n426#1:1744,4\n453#1:1748,3\n453#1:1751,7\n453#1:1759,3\n453#1:1763,9\n453#1:1772\n483#1:1773,3\n483#1:1776,7\n483#1:1784,3\n483#1:1788,9\n483#1:1797\n178#1:1519\n195#1:1531\n209#1:1543\n219#1:1555\n236#1:1567\n250#1:1579\n260#1:1584\n307#1:1587\n327#1:1588\n349#1:1617\n426#1:1743\n275#1:1585\n282#1:1586\n343#1:1596\n343#1:1600\n363#1:1632\n363#1:1636\n376#1:1657\n376#1:1661\n394#1:1682\n394#1:1686\n403#1:1698,3\n403#1:1702\n403#1:1705\n403#1:1709,3\n403#1:1713,3\n403#1:1717\n403#1:1719\n403#1:1720\n403#1:1725\n403#1:1727\n453#1:1758\n453#1:1762\n483#1:1783\n483#1:1787\n510#1:1798,3\n511#1:1801\n514#1:1802\n517#1:1803,3\n518#1:1806,3\n519#1:1809\n520#1:1810\n520#1:1811\n524#1:1812\n527#1:1813\n*E\n"})
public abstract class w2<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f12501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    public int f12502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    public int f12503g;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w2<E> f12504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w2<E> w2Var) {
            super(1);
            this.f12504a = w2Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e10) {
            return e10 == this.f12504a ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ w2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String E(w2 w2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return w2Var.D(charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    @kotlin.a1
    public static /* synthetic */ void p() {
    }

    @kotlin.a1
    public static /* synthetic */ void q() {
    }

    @kotlin.a1
    public static /* synthetic */ void r() {
    }

    @kotlin.a1
    public static /* synthetic */ void s() {
    }

    @kotlin.a1
    public static /* synthetic */ void u() {
    }

    @oj.j
    @NotNull
    public final String A(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return E(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @oj.j
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return E(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @oj.j
    @NotNull
    public final String C(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return E(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @oj.j
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i11 = this.f12501e;
        int i12 = 0;
        while (i11 != Integer.MAX_VALUE) {
            int i13 = (int) ((jArr[i11] >> 31) & g3.f12256c);
            Object obj = objArr[i11];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (function1 == null) {
                sb2.append(obj);
            } else {
                sb2.append(function1.invoke(obj));
            }
            i12++;
            i11 = i13;
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final E F() {
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            return (E) objArr[i10];
        }
        t.f.g("The OrderedScatterSet is empty");
        throw new kotlin.a0();
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [E, java.lang.Object] */
    public final E G(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & g3.f12256c);
            ?? r10 = (Object) objArr[i10];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
            i10 = i11;
        }
        t.f.g("Could not find a match");
        throw new kotlin.a0();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [E, java.lang.Object] */
    @Nullable
    public final E H(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & g3.f12256c);
            ?? r10 = (Object) objArr[i10];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
            i10 = i11;
        }
        return null;
    }

    public final boolean I() {
        return this.f12503g == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<E> J() {
        ArrayList arrayList = new ArrayList(t());
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            arrayList.add(objArr[i10]);
            i10 = i11;
        }
        return arrayList;
    }

    @kotlin.a1
    public final void K(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @kotlin.a1
    public final void L(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 7 ^ 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i11 << 3) + i13));
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[LOOP:0: B:5:0x0013->B:18:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x005c A[SYNTHETIC] */
    public final boolean a(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        return this.f12503g != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[LOOP:0: B:5:0x0013->B:18:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    public final boolean c(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public final Set<E> d() {
        return new y2(this);
    }

    public final boolean e(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12502f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12497a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12498b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:0: B:14:0x0021->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        if (w2Var.t() != t()) {
            return false;
        }
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !w2Var.e(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    @androidx.annotation.g0(from = 0)
    public final int f() {
        return t();
    }

    @androidx.annotation.g0(from = 0)
    public final int g(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i13]).booleanValue()) {
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final int h(E e10) {
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12502f;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12497a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12498b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public int hashCode() {
        int iHashCode = (this.f12502f * 31) + this.f12503g;
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 != length) {
                    i10++;
                }
            }
        }
        return iHashCode;
    }

    public final E i() {
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            return (E) objArr[i10];
        }
        t.f.g("The OrderedScatterSet is empty");
        throw new kotlin.a0();
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [E, java.lang.Object] */
    public final E j(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            ?? r10 = (Object) objArr[i10];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
            i10 = i11;
        }
        t.f.g("Could not find a match");
        throw new kotlin.a0();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [E, java.lang.Object] */
    @Nullable
    public final E k(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            ?? r10 = (Object) objArr[i10];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
            i10 = i11;
        }
        return null;
    }

    public final void l(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            block.invoke(objArr[i10]);
            i10 = i11;
        }
    }

    public final void m(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12499c;
        int i10 = this.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            block.invoke(Integer.valueOf(i10));
            i10 = i11;
        }
    }

    public final void n(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12498b;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & g3.f12256c);
            block.invoke(objArr[i10]);
            i10 = i11;
        }
    }

    @androidx.annotation.g0(from = 0)
    public final int o() {
        return this.f12502f;
    }

    @androidx.annotation.g0(from = 0)
    public final int t() {
        return this.f12503g;
    }

    @NotNull
    public String toString() {
        return E(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    public final boolean v() {
        return this.f12503g == 0;
    }

    public final boolean w() {
        return this.f12503g != 0;
    }

    @oj.j
    @NotNull
    public final String x() {
        return E(this, null, null, null, 0, null, null, 63, null);
    }

    @oj.j
    @NotNull
    public final String y(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return E(this, separator, null, null, 0, null, null, 62, null);
    }

    @oj.j
    @NotNull
    public final String z(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return E(this, separator, prefix, null, 0, null, null, 60, null);
    }

    private w2() {
        this.f12497a = b3.f12145e;
        this.f12498b = t.a.f376160c;
        this.f12499c = g3.j();
        this.f12500d = Integer.MAX_VALUE;
        this.f12501e = Integer.MAX_VALUE;
    }
}
