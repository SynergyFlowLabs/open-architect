package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1511:1\n1033#1:1524\n1035#1,2:1526\n1038#1,6:1529\n1033#1:1535\n1035#1,2:1537\n1038#1,6:1540\n1046#1,3:1839\n1049#1:1843\n1051#1,2:1845\n1054#1,5:1848\n1060#1,5:1854\n59#2,5:1512\n1#3:1517\n1254#4,6:1518\n1399#4:1574\n1270#4:1578\n1165#4,3:1596\n1179#4:1600\n1175#4:1603\n1372#4,3:1607\n1386#4,3:1611\n1312#4:1615\n1303#4:1617\n1297#4:1618\n1309#4:1623\n1393#4:1625\n1165#4,3:1635\n1179#4:1639\n1175#4:1642\n1372#4,3:1646\n1386#4,3:1650\n1312#4:1654\n1303#4:1656\n1297#4:1657\n1309#4:1662\n1393#4:1664\n1399#4:1701\n1270#4:1705\n1399#4:1729\n1270#4:1733\n1399#4:1750\n1270#4:1754\n1399#4:1771\n1270#4:1775\n1399#4:1792\n1270#4:1796\n1399#4:1813\n1270#4:1817\n1230#4:1827\n1254#4,6:1828\n1242#4:1834\n1241#4,4:1835\n1254#4,6:1865\n1165#4,3:1871\n1175#4:1874\n1179#4:1875\n1372#4,3:1876\n1386#4,3:1879\n1312#4:1882\n1303#4:1883\n1297#4:1884\n1309#4:1885\n1393#4:1886\n1265#4:1887\n1220#4:1888\n1262#4:1889\n1220#4:1890\n1230#4:1891\n1254#4,6:1892\n1242#4:1898\n1241#4,4:1899\n1372#4,3:1903\n1399#4:1906\n1297#4:1907\n1144#4,14:1909\n1220#4:1923\n1165#4,3:1924\n1175#4:1927\n1179#4:1928\n1254#4,6:1929\n1220#4:1936\n1179#4:1937\n1254#4,6:1938\n1254#4,6:1944\n1179#4:1955\n1254#4,6:1956\n1268#4:1967\n1220#4:1968\n1165#4,3:1969\n1175#4:1972\n1179#4:1973\n1230#4:1974\n1254#4,6:1975\n1242#4:1981\n1241#4,4:1982\n1111#5:1525\n1114#5:1528\n1111#5:1536\n1114#5:1539\n1123#5:1559\n1123#5:1686\n1123#5:1842\n1127#5:1844\n1117#5:1847\n1114#5:1853\n1111#5:1859\n1114#5:1860\n1123#5:1861\n1127#5:1862\n1117#5:1863\n1114#5:1864\n1127#5:1908\n1132#5:1935\n1144#5:1950\n1138#5:1951\n1141#5:1952\n1132#5:1953\n1132#5:1954\n1144#5:1962\n1138#5:1963\n1135#5:1964\n1132#5:1965\n1132#5:1966\n1123#5:1986\n1127#5:1987\n1096#5,2:1988\n1147#5:1990\n1098#5,2:1991\n1147#5:1993\n1147#5:1994\n1147#5:1995\n1123#5:1996\n1127#5:1997\n1103#5,4:1998\n13309#6,2:1546\n13309#6,2:1673\n1855#7,2:1548\n1855#7,2:1677\n1313#8,2:1550\n1313#8,2:1675\n301#9,7:1552\n308#9,4:1560\n510#9:1595\n511#9:1599\n513#9,2:1601\n515#9,3:1604\n518#9:1610\n519#9:1614\n520#9:1616\n521#9,4:1619\n527#9:1624\n528#9,8:1626\n510#9:1634\n511#9:1638\n513#9,2:1640\n515#9,3:1643\n518#9:1649\n519#9:1653\n520#9:1655\n521#9,4:1658\n527#9:1663\n528#9,8:1665\n301#9,7:1679\n308#9,4:1687\n269#9,7:1722\n280#9,3:1730\n283#9,9:1734\n269#9,7:1743\n280#9,3:1751\n283#9,9:1755\n269#9,7:1764\n280#9,3:1772\n283#9,9:1776\n269#9,7:1785\n280#9,3:1793\n283#9,9:1797\n269#9,7:1806\n280#9,3:1814\n283#9,9:1818\n231#10,3:1564\n200#10,7:1567\n211#10,3:1575\n214#10,9:1579\n234#10:1588\n231#10,3:1691\n200#10,7:1694\n211#10,3:1702\n214#10,9:1706\n234#10:1715\n287#11,6:1589\n287#11,6:1716\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n*L\n635#1:1524\n635#1:1526,2\n635#1:1529,6\n647#1:1535\n647#1:1537,2\n647#1:1540,6\n1029#1:1839,3\n1029#1:1843\n1029#1:1845,2\n1029#1:1848,5\n1029#1:1854,5\n587#1:1512,5\n616#1:1518,6\n770#1:1574\n770#1:1578\n790#1:1596,3\n790#1:1600\n790#1:1603\n790#1:1607,3\n790#1:1611,3\n790#1:1615\n790#1:1617\n790#1:1618\n790#1:1623\n790#1:1625\n804#1:1635,3\n804#1:1639\n804#1:1642\n804#1:1646,3\n804#1:1650,3\n804#1:1654\n804#1:1656\n804#1:1657\n804#1:1662\n804#1:1664\n924#1:1701\n924#1:1705\n939#1:1729\n939#1:1733\n956#1:1750\n956#1:1754\n973#1:1771\n973#1:1775\n991#1:1792\n991#1:1796\n1011#1:1813\n1011#1:1817\n1026#1:1827\n1026#1:1828,6\n1026#1:1834\n1026#1:1835,4\n1071#1:1865,6\n1087#1:1871,3\n1088#1:1874\n1089#1:1875\n1096#1:1876,3\n1097#1:1879,3\n1098#1:1882\n1099#1:1883\n1099#1:1884\n1103#1:1885\n1106#1:1886\n1115#1:1887\n1115#1:1888\n1121#1:1889\n1121#1:1890\n1122#1:1891\n1122#1:1892,6\n1122#1:1898\n1122#1:1899,4\n1136#1:1903,3\n1137#1:1906\n1139#1:1907\n1250#1:1909,14\n1256#1:1923\n1270#1:1924,3\n1271#1:1927\n1282#1:1928\n1283#1:1929,6\n1297#1:1936\n1300#1:1937\n1301#1:1938,6\n1302#1:1944,6\n1321#1:1955\n1322#1:1956,6\n1377#1:1967\n1377#1:1968\n1379#1:1969,3\n1380#1:1972\n1382#1:1973\n1382#1:1974\n1382#1:1975,6\n1382#1:1981\n1382#1:1982,4\n635#1:1525\n635#1:1528\n647#1:1536\n647#1:1539\n761#1:1559\n915#1:1686\n1029#1:1842\n1029#1:1844\n1029#1:1847\n1029#1:1853\n1033#1:1859\n1036#1:1860\n1048#1:1861\n1049#1:1862\n1052#1:1863\n1058#1:1864\n1173#1:1908\n1287#1:1935\n1311#1:1950\n1313#1:1951\n1314#1:1952\n1316#1:1953\n1318#1:1954\n1333#1:1962\n1335#1:1963\n1336#1:1964\n1338#1:1965\n1342#1:1966\n1397#1:1986\n1398#1:1987\n1399#1:1988,2\n1399#1:1990\n1399#1:1991,2\n1399#1:1993\n1401#1:1994\n1402#1:1995\n1409#1:1996\n1410#1:1997\n1411#1:1998,4\n734#1:1546,2\n888#1:1673,2\n743#1:1548,2\n906#1:1677,2\n752#1:1550,2\n897#1:1675,2\n761#1:1552,7\n761#1:1560,4\n790#1:1595\n790#1:1599\n790#1:1601,2\n790#1:1604,3\n790#1:1610\n790#1:1614\n790#1:1616\n790#1:1619,4\n790#1:1624\n790#1:1626,8\n804#1:1634\n804#1:1638\n804#1:1640,2\n804#1:1643,3\n804#1:1649\n804#1:1653\n804#1:1655\n804#1:1658,4\n804#1:1663\n804#1:1665,8\n915#1:1679,7\n915#1:1687,4\n939#1:1722,7\n939#1:1730,3\n939#1:1734,9\n956#1:1743,7\n956#1:1751,3\n956#1:1755,9\n973#1:1764,7\n973#1:1772,3\n973#1:1776,9\n991#1:1785,7\n991#1:1793,3\n991#1:1797,9\n1011#1:1806,7\n1011#1:1814,3\n1011#1:1818,9\n770#1:1564,3\n770#1:1567,7\n770#1:1575,3\n770#1:1579,9\n770#1:1588\n924#1:1691,3\n924#1:1694,7\n924#1:1702,3\n924#1:1706,9\n924#1:1715\n779#1:1589,6\n933#1:1716,6\n*E\n"})
public final class i2<E> extends w2<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12295h;

    public i2() {
        this(0, 1, null);
    }

    private final void C0(int i10) {
        long[] jArr = this.f12499c;
        long j10 = jArr[i10];
        int i11 = (int) ((j10 >> 31) & g3.f12256c);
        int i12 = (int) (j10 & g3.f12256c);
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = (jArr[i11] & g3.f12261h) | (((long) i12) & g3.f12256c);
        } else {
            this.f12500d = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((((long) i11) & g3.f12256c) << 31) | (jArr[i12] & g3.f12260g);
        } else {
            this.f12501e = i11;
        }
        jArr[i10] = 4611686018427387903L;
    }

    private final int X(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12502f;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12497a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.f12498b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iY = Y(i11);
                if (this.f12295h == 0 && ((this.f12497a[iY >> 3] >> ((iY & 7) << 3)) & 255) != 254) {
                    T();
                    iY = Y(i11);
                }
                this.f12503g++;
                int i19 = this.f12295h;
                long[] jArr2 = this.f12497a;
                int i20 = iY >> 3;
                long j14 = jArr2[i20];
                int i21 = (iY & 7) << 3;
                this.f12295h = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12502f;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iY - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iY;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int Y(int i10) {
        int i11 = this.f12502f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12497a;
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

    private final void Z(int[] iArr) {
        long[] jArr = this.f12499c;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & g3.f12256c);
            int i13 = (int) (j10 & g3.f12256c);
            long j11 = ((j10 & g3.f12259f) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = iArr[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.f12500d;
        if (i14 != Integer.MAX_VALUE) {
            this.f12500d = iArr[i14];
        }
        int i15 = this.f12501e;
        if (i15 != Integer.MAX_VALUE) {
            this.f12501e = iArr[i15];
        }
    }

    private final void a0(long[] jArr) {
        long[] jArr2 = this.f12499c;
        int length = jArr2.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr2[i10];
            int i12 = (int) ((j10 >> 31) & g3.f12256c);
            int i13 = (int) (j10 & g3.f12256c);
            long j11 = ((j10 & g3.f12259f) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i12] & com.rabbitmq.client.k0.f265952a)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (com.rabbitmq.client.k0.f265952a & jArr[i13]);
            }
            jArr2[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.f12500d;
        if (i14 != Integer.MAX_VALUE) {
            this.f12500d = (int) (jArr[i14] & com.rabbitmq.client.k0.f265952a);
        }
        int i15 = this.f12501e;
        if (i15 != Integer.MAX_VALUE) {
            this.f12501e = (int) (jArr[i15] & com.rabbitmq.client.k0.f265952a);
        }
    }

    private final void b0() {
        this.f12295h = b3.p(o()) - this.f12503g;
    }

    private final void c0(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = b3.f12145e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f12497a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        b0();
    }

    private final void d0(int i10) {
        long[] jArrJ;
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12502f = iMax;
        c0(iMax);
        this.f12498b = iMax == 0 ? t.a.f376160c : new Object[iMax];
        if (iMax == 0) {
            jArrJ = g3.j();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            jArrJ = jArr;
        }
        this.f12499c = jArrJ;
    }

    private final void l0(int i10) {
        long[] jArr = this.f12499c;
        int i11 = this.f12500d;
        jArr[i10] = (((long) i11) & g3.f12256c) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((((long) i10) & g3.f12256c) << 31) | (jArr[i11] & g3.f12260g);
        }
        this.f12500d = i10;
        if (this.f12501e == Integer.MAX_VALUE) {
            this.f12501e = i10;
        }
    }

    @kotlin.a1
    public final void A0(int i10) {
        this.f12503g--;
        long[] jArr = this.f12497a;
        int i11 = this.f12502f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12498b[i10] = null;
        long[] jArr2 = this.f12499c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & g3.f12256c);
        int i15 = (int) (j11 & g3.f12256c);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & g3.f12261h) | (((long) i15) & g3.f12256c);
        } else {
            this.f12500d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & g3.f12256c) << 31) | (jArr2[i15] & g3.f12260g);
        } else {
            this.f12501e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final void B0(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(objArr[i13]).booleanValue()) {
                            A0(i13);
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

    public final void D0(int i10) {
        long[] jArr = this.f12497a;
        Object[] objArr = this.f12498b;
        long[] jArr2 = this.f12499c;
        int i11 = this.f12502f;
        int[] iArr = new int[i11];
        d0(i10);
        long[] jArr3 = this.f12497a;
        Object[] objArr2 = this.f12498b;
        long[] jArr4 = this.f12499c;
        int i12 = this.f12502f;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iY = Y(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iY >> 3;
                int i16 = (iY & 7) << 3;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iY - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iY] = obj;
                jArr4[iY] = jArr2[i13];
                iArr[i13] = iY;
            }
            i13++;
            jArr = jArr;
            objArr = objArr;
        }
        Z(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12498b;
        int i10 = this.f12503g;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!elements.e(objArr[i14])) {
                                A0(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f12503g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[LOOP:0: B:5:0x0018->B:17:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[EDGE_INSN: B:24:0x005e->B:18:0x005e BREAK  A[LOOP:0: B:5:0x0018->B:17:0x005b], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean F0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12498b;
        int i10 = this.f12503g;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!elements.e(objArr[i14])) {
                                A0(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f12503g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:5:0x0019->B:17:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[EDGE_INSN: B:24:0x005d->B:18:0x005d BREAK  A[LOOP:0: B:5:0x0019->B:17:0x005a], SYNTHETIC] */
    public final boolean G0(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12498b;
        int i10 = this.f12503g;
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!CollectionsKt.contains(elements, objArr[i14])) {
                                A0(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f12503g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[LOOP:0: B:5:0x0018->B:17:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:18:0x0064 BREAK  A[LOOP:0: B:5:0x0018->B:17:0x0061], SYNTHETIC] */
    public final boolean H0(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12498b;
        int iT = t();
        long[] jArr = this.f12497a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!predicate.invoke(objArr[i13]).booleanValue()) {
                                A0(i13);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return iT != t();
    }

    @androidx.annotation.g0(from = 0)
    public final int I0() {
        int i10 = this.f12502f;
        int iY = b3.y(b3.A(this.f12503g));
        if (iY >= i10) {
            return 0;
        }
        D0(iY);
        return i10 - this.f12502f;
    }

    public final void J0(int i10) {
        int i11;
        long[] jArr = this.f12499c;
        int i12 = this.f12500d;
        while (i12 != Integer.MAX_VALUE && (i11 = this.f12503g) > i10 && i11 != 0) {
            int i13 = (int) (jArr[i12] & g3.f12256c);
            A0(i12);
            i12 = i13;
        }
    }

    public final boolean M(E e10) {
        int iT = t();
        int iX = X(e10);
        this.f12498b[iX] = e10;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        jArr[iX] = (((long) i10) & g3.f12256c) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iX) & g3.f12256c) << 31) | (jArr[i10] & g3.f12260g);
        }
        this.f12500d = iX;
        if (this.f12501e == Integer.MAX_VALUE) {
            this.f12501e = iX;
        }
        return t() != iT;
    }

    public final boolean N(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        m0(elements);
        return iT != t();
    }

    public final boolean O(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        n0(elements);
        if (iT == t()) {
            return false;
        }
        int i10 = 4 | 1;
        return true;
    }

    public final boolean P(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        o0(elements);
        return iT != t();
    }

    public final boolean Q(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        p0(elements);
        return iT != t();
    }

    public final boolean R(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        r0(elements);
        return iT != t();
    }

    public final boolean S(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        s0(elements);
        return iT != t();
    }

    public final void T() {
        if (this.f12502f <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12503g) * 32), kotlin.y1.n(kotlin.y1.n(this.f12502f) * 25)) > 0) {
            D0(b3.x(this.f12502f));
        } else {
            W();
        }
    }

    @NotNull
    public final Set<E> U() {
        return new j2(this);
    }

    public final void V() {
        this.f12503g = 0;
        long[] jArr = this.f12497a;
        if (jArr != b3.f12145e) {
            int i10 = 7 ^ 6;
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12497a;
            int i11 = this.f12502f;
            int i12 = i11 >> 3;
            long j10 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j10)) | j10;
        }
        ArraysKt.fill(this.f12498b, (Object) null, 0, this.f12502f);
        ArraysKt.fill$default(this.f12499c, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.f12500d = Integer.MAX_VALUE;
        this.f12501e = Integer.MAX_VALUE;
        b0();
    }

    public final void W() {
        int i10;
        long[] jArr = this.f12497a;
        if (jArr == null) {
            return;
        }
        int i11 = this.f12502f;
        Object[] objArr = this.f12498b;
        long[] jArr2 = this.f12499c;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i15 = lastIndex - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * b3.f12150j;
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iY = Y(i20);
                int i21 = i20 & i11;
                if (((iY - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = (((long) (i19 & 127)) << i18) | (jArr[i17] & (~(255 << i18)));
                    if (jArr3[i16] == j13) {
                        long j14 = i16;
                        jArr3[i16] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i12];
                    i16++;
                    j10 = j13;
                } else {
                    int i22 = iY >> 3;
                    long j15 = jArr[i22];
                    int i23 = (iY & 7) << 3;
                    int i24 = i12;
                    if (((j15 >> i23) & 255) == 128) {
                        int i25 = i16;
                        jArr[i22] = (j15 & (~(255 << i23))) | (((long) (i19 & 127)) << i23);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iY] = objArr[i25];
                        objArr[i25] = null;
                        jArr2[iY] = jArr2[i25];
                        jArr2[i25] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i25] >> 32) & com.rabbitmq.client.k0.f265952a);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iY);
                            jArr3[i25] = (jArr3[i25] & com.rabbitmq.client.k0.f265952a) | (-4294967296L);
                        } else {
                            jArr3[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iY);
                        }
                        i10 = i25;
                        jArr3[iY] = ((long) Integer.MAX_VALUE) | (((long) i10) << 32);
                    } else {
                        jArr[i22] = (((long) (i19 & 127)) << i23) | (j15 & (~(255 << i23)));
                        Object obj2 = objArr[iY];
                        objArr[iY] = objArr[i16];
                        objArr[i16] = obj2;
                        long j16 = jArr2[iY];
                        jArr2[iY] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & com.rabbitmq.client.k0.f265952a);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iY;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & com.rabbitmq.client.k0.f265952a) | (j17 << 32);
                        } else {
                            long j18 = iY;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iY] = (((long) i27) << 32) | ((long) i16);
                        i10 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16 = i10 + 1;
                    j10 = j13;
                    i12 = i24;
                }
            } else {
                i16++;
            }
        }
        b0();
        a0(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            i0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12498b;
        long[] jArr = elements.f12499c;
        int i10 = elements.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            i0(objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12171b;
        long[] jArr = elements.f12170a;
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
                        i0(objArr[(i10 << 3) + i12]);
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

    public final void h0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            i0(it.next());
        }
    }

    public final void i0(E e10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12502f;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12497a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12498b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            A0(iNumberOfTrailingZeros);
        }
    }

    public final void j0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            i0(it.next());
        }
    }

    public final void k0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            i0(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            q0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12498b;
        long[] jArr = elements.f12499c;
        int i10 = elements.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            q0(objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0013->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[EDGE_INSN: B:22:0x0059->B:19:0x0059 BREAK  A[LOOP:0: B:5:0x0013->B:18:0x0056], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12171b;
        long[] jArr = elements.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            q0(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    public final void p0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            q0(it.next());
        }
    }

    public final void q0(E e10) {
        int iX = X(e10);
        this.f12498b[iX] = e10;
        long[] jArr = this.f12499c;
        int i10 = this.f12500d;
        jArr[iX] = (((long) i10) & g3.f12256c) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iX) & g3.f12256c) << 31) | (jArr[i10] & g3.f12260g);
        }
        this.f12500d = iX;
        if (this.f12501e == Integer.MAX_VALUE) {
            this.f12501e = iX;
        }
    }

    public final void r0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            q0(it.next());
        }
    }

    public final void s0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            q0(e10);
        }
    }

    public final boolean t0(E e10) {
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
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            A0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean u0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        e0(elements);
        return iT != t();
    }

    public final boolean v0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        f0(elements);
        return iT != t();
    }

    public final boolean w0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        g0(elements);
        return iT != t();
    }

    public final boolean x0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        h0(elements);
        return iT != t();
    }

    public final boolean y0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        j0(elements);
        return iT != t();
    }

    public final boolean z0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iT = t();
        k0(elements);
        return iT != t();
    }

    public /* synthetic */ i2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public i2(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        d0(b3.A(i10));
    }
}
