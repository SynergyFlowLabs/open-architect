package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1787:1\n59#2,5:1788\n1254#3,6:1793\n1399#3:1812\n1270#3:1816\n1165#3,3:1828\n1179#3:1832\n1175#3:1835\n1372#3,3:1840\n1386#3,3:1844\n1312#3:1848\n1303#3:1850\n1297#3:1851\n1309#3:1856\n1393#3:1858\n1165#3,3:1868\n1179#3:1872\n1175#3:1875\n1372#3,3:1880\n1386#3,3:1884\n1312#3:1888\n1303#3:1890\n1297#3:1891\n1309#3:1896\n1393#3:1898\n1399#3:1913\n1270#3:1917\n1399#3:1937\n1270#3:1941\n1230#3:1958\n1254#3,6:1959\n1242#3:1965\n1241#3,4:1966\n1254#3,6:1970\n1165#3,3:1976\n1175#3:1979\n1179#3:1980\n1372#3,3:1981\n1386#3,3:1984\n1312#3:1987\n1303#3:1988\n1297#3:1989\n1309#3:1990\n1393#3:1991\n1265#3:1992\n1220#3:1993\n1262#3:1994\n1220#3:1995\n1230#3:1996\n1254#3,6:1997\n1242#3:2003\n1241#3,4:2004\n1372#3,3:2008\n1399#3:2011\n1297#3:2012\n1144#3,14:2013\n1220#3:2027\n1165#3,3:2028\n1175#3:2031\n1179#3:2032\n1254#3,6:2033\n1220#3:2039\n1179#3:2040\n1254#3,6:2041\n1254#3,6:2047\n1179#3:2053\n1254#3,6:2054\n1268#3:2060\n1220#3:2061\n1165#3,3:2062\n1175#3:2065\n1179#3:2066\n1230#3:2067\n1254#3,6:2068\n1242#3:2074\n1241#3,4:2075\n1#4:1799\n215#5,2:1800\n357#6,4:1802\n329#6,6:1806\n339#6,3:1813\n342#6,9:1817\n361#6:1826\n555#6:1827\n556#6:1831\n558#6,2:1833\n560#6,4:1836\n564#6:1843\n565#6:1847\n566#6:1849\n567#6,4:1852\n573#6:1857\n574#6,8:1859\n555#6:1867\n556#6:1871\n558#6,2:1873\n560#6,4:1876\n564#6:1883\n565#6:1887\n566#6:1889\n567#6,4:1892\n573#6:1897\n574#6,8:1899\n329#6,6:1907\n339#6,3:1914\n342#6,9:1918\n231#7,3:1927\n200#7,7:1930\n211#7,3:1938\n214#7,9:1942\n234#7:1951\n287#8,6:1952\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n639#1:1788,5\n667#1:1793,6\n776#1:1812\n776#1:1816\n818#1:1828,3\n818#1:1832\n818#1:1835\n818#1:1840,3\n818#1:1844,3\n818#1:1848\n818#1:1850\n818#1:1851\n818#1:1856\n818#1:1858\n830#1:1868,3\n830#1:1872\n830#1:1875\n830#1:1880,3\n830#1:1884,3\n830#1:1888\n830#1:1890\n830#1:1891\n830#1:1896\n830#1:1898\n842#1:1913\n842#1:1917\n878#1:1937\n878#1:1941\n892#1:1958\n892#1:1959,6\n892#1:1965\n892#1:1966,4\n905#1:1970,6\n920#1:1976,3\n921#1:1979\n922#1:1980\n929#1:1981,3\n930#1:1984,3\n931#1:1987\n932#1:1988\n932#1:1989\n936#1:1990\n939#1:1991\n948#1:1992\n948#1:1993\n954#1:1994\n954#1:1995\n955#1:1996\n955#1:1997,6\n955#1:2003\n955#1:2004,4\n970#1:2008,3\n971#1:2011\n973#1:2012\n1019#1:2013,14\n1025#1:2027\n1039#1:2028,3\n1040#1:2031\n1051#1:2032\n1052#1:2033,6\n1061#1:2039\n1064#1:2040\n1065#1:2041,6\n1066#1:2047,6\n1076#1:2053\n1077#1:2054,6\n1116#1:2060\n1116#1:2061\n1118#1:2062,3\n1119#1:2065\n1121#1:2066\n1121#1:2067\n1121#1:2068,6\n1121#1:2074\n1121#1:2075,4\n771#1:1800,2\n776#1:1802,4\n776#1:1806,6\n776#1:1813,3\n776#1:1817,9\n776#1:1826\n818#1:1827\n818#1:1831\n818#1:1833,2\n818#1:1836,4\n818#1:1843\n818#1:1847\n818#1:1849\n818#1:1852,4\n818#1:1857\n818#1:1859,8\n830#1:1867\n830#1:1871\n830#1:1873,2\n830#1:1876,4\n830#1:1883\n830#1:1887\n830#1:1889\n830#1:1892,4\n830#1:1897\n830#1:1899,8\n842#1:1907,6\n842#1:1914,3\n842#1:1918,9\n878#1:1927,3\n878#1:1930,7\n878#1:1938,3\n878#1:1942,9\n878#1:1951\n883#1:1952,6\n*E\n"})
public final class k2<K, V> extends a3<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12326f;

    public k2() {
        this(0, 1, null);
    }

    private final int N(int i10) {
        int i11 = this.f12133d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12130a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void Q() {
        this.f12326f = b3.p(q()) - this.f12134e;
    }

    private final void R(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = b3.f12145e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f12130a = jArr;
        Q();
    }

    private final void S(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12133d = iMax;
        R(iMax);
        this.f12131b = iMax == 0 ? t.a.f376160c : new Object[iMax];
        this.f12132c = iMax == 0 ? t.a.f376160c : new Object[iMax];
    }

    public final void I() {
        if (this.f12133d <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12134e) * 32), kotlin.y1.n(kotlin.y1.n(this.f12133d) * 25)) > 0) {
            p0(b3.x(this.f12133d));
        } else {
            M();
        }
    }

    @NotNull
    public final Map<K, V> J() {
        return new d2(this);
    }

    public final void K() {
        this.f12134e = 0;
        long[] jArr = this.f12130a;
        if (jArr != b3.f12145e) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12130a;
            int i10 = this.f12133d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.fill(this.f12132c, (Object) null, 0, this.f12133d);
        ArraysKt.fill(this.f12131b, (Object) null, 0, this.f12133d);
        Q();
    }

    public final V L(K k10, @NotNull Function2<? super K, ? super V, ? extends V> computeBlock) {
        Intrinsics.checkNotNullParameter(computeBlock, "computeBlock");
        int iO = O(k10);
        boolean z10 = iO < 0;
        V vInvoke = computeBlock.invoke(k10, z10 ? null : this.f12132c[iO]);
        if (!z10) {
            this.f12132c[iO] = vInvoke;
            return vInvoke;
        }
        int i10 = ~iO;
        this.f12131b[i10] = k10;
        this.f12132c[i10] = vInvoke;
        return vInvoke;
    }

    public final void M() {
        long[] jArr = this.f12130a;
        int i10 = this.f12133d;
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * b3.f12150j;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iN = N(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iN - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i21];
                } else {
                    int i22 = iN >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iN & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iN] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iN] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iN];
                        objArr[iN] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iN];
                        objArr2[iN] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        Q();
    }

    @kotlin.a1
    public final int O(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12133d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12130a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f12326f == 0 && ((this.f12130a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    I();
                    iN = N(i11);
                }
                this.f12134e++;
                int i19 = this.f12326f;
                long[] jArr2 = this.f12130a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f12326f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12133d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iN;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final V P(K k10, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V vP = p(k10);
        if (vP != null) {
            return vP;
        }
        V vInvoke = defaultValue.invoke();
        q0(k10, vInvoke);
        return vInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@NotNull s2<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f12449a;
        int i10 = keys.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(@NotNull c3<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f12171b;
        long[] jArr = keys.f12170a;
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
                        l0(objArr[(i10 << 3) + i12]);
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

    public final void V(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            l0(it.next());
        }
    }

    public final void W(K k10) {
        l0(k10);
    }

    public final void X(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            l0(it.next());
        }
    }

    public final void Y(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            l0(k10);
        }
    }

    public final void Z(@NotNull a3<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        g0(from);
    }

    public final void a0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        h0(pairs);
    }

    public final void b0(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        i0(from);
    }

    public final void c0(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        q0(pair.getFirst(), pair.getSecond());
    }

    public final void d0(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        j0(pairs);
    }

    public final void e0(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        k0(pairs);
    }

    @Nullable
    public final V f0(K k10, V v10) {
        int iO = O(k10);
        if (iO < 0) {
            iO = ~iO;
        }
        Object[] objArr = this.f12132c;
        V v11 = (V) objArr[iO];
        this.f12131b[iO] = k10;
        objArr[iO] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(@NotNull a3<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.f12131b;
        Object[] objArr2 = from.f12132c;
        long[] jArr = from.f12130a;
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
                        int i13 = (i10 << 3) + i12;
                        q0(objArr[i13], objArr2[i13]);
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

    public final void h0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.component1(), pair.component2());
        }
    }

    public final void i0(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            q0(entry.getKey(), entry.getValue());
        }
    }

    public final void j0(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.component1(), pair.component2());
        }
    }

    public final void k0(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.component1(), pair.component2());
        }
    }

    @Nullable
    public final V l0(K k10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12133d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12130a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return o0(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final boolean m0(K k10, V v10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12133d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12130a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
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
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.f12132c[iNumberOfTrailingZeros], v10)) {
            return false;
        }
        o0(iNumberOfTrailingZeros);
        return true;
    }

    public final void n0(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12130a;
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(this.f12131b[i13], this.f12132c[i13]).booleanValue()) {
                            o0(i13);
                        }
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
    @Nullable
    public final V o0(int i10) {
        this.f12134e--;
        long[] jArr = this.f12130a;
        int i11 = this.f12133d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12131b[i10] = null;
        Object[] objArr = this.f12132c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void p0(int i10) {
        int i11;
        long[] jArr = this.f12130a;
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        int i12 = this.f12133d;
        S(i10);
        long[] jArr2 = this.f12130a;
        Object[] objArr3 = this.f12131b;
        Object[] objArr4 = this.f12132c;
        int i13 = this.f12133d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iN = N(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iN >> 3;
                int i17 = (iN & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iN - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iN] = obj;
                objArr4[iN] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void q0(K k10, V v10) {
        int iO = O(k10);
        if (iO < 0) {
            iO = ~iO;
        }
        this.f12131b[iO] = k10;
        this.f12132c[iO] = v10;
    }

    public final int r0() {
        int i10 = this.f12133d;
        int iY = b3.y(b3.A(this.f12134e));
        if (iY >= i10) {
            return 0;
        }
        p0(iY);
        return i10 - this.f12133d;
    }

    public /* synthetic */ k2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public k2(int i10) {
        boolean z10;
        super(null);
        if (i10 >= 0) {
            z10 = true;
            int i11 = 6 >> 1;
        } else {
            z10 = false;
        }
        if (!z10) {
            t.f.c("Capacity must be a positive value.");
        }
        S(b3.A(i10));
    }
}
