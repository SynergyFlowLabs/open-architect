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
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1210:1\n59#2,5:1211\n1#3:1216\n1254#4,6:1217\n1399#4:1239\n1270#4:1243\n1165#4,3:1273\n1179#4:1277\n1175#4:1280\n1372#4,3:1284\n1386#4,3:1288\n1312#4:1292\n1303#4:1294\n1297#4:1295\n1309#4:1300\n1393#4:1302\n1165#4,3:1312\n1179#4:1316\n1175#4:1319\n1372#4,3:1323\n1386#4,3:1327\n1312#4:1331\n1303#4:1333\n1297#4:1334\n1309#4:1339\n1393#4:1341\n1399#4:1366\n1270#4:1370\n1399#4:1406\n1270#4:1410\n1399#4:1427\n1270#4:1431\n1399#4:1448\n1270#4:1452\n1399#4:1469\n1270#4:1473\n1399#4:1490\n1270#4:1494\n1230#4:1504\n1254#4,6:1505\n1242#4:1511\n1241#4,4:1512\n1254#4,6:1516\n1165#4,3:1522\n1175#4:1525\n1179#4:1526\n1372#4,3:1527\n1386#4,3:1530\n1312#4:1533\n1303#4:1534\n1297#4:1535\n1309#4:1536\n1393#4:1537\n1265#4:1538\n1220#4:1539\n1262#4:1540\n1220#4:1541\n1230#4:1542\n1254#4,6:1543\n1242#4:1549\n1241#4,4:1550\n1372#4,3:1554\n1399#4:1557\n1297#4:1558\n1144#4,14:1559\n1220#4:1573\n1165#4,3:1574\n1175#4:1577\n1179#4:1578\n1254#4,6:1579\n1220#4:1585\n1179#4:1586\n1254#4,6:1587\n1254#4,6:1593\n1179#4:1599\n1254#4,6:1600\n1268#4:1606\n1220#4:1607\n1165#4,3:1608\n1175#4:1611\n1179#4:1612\n1230#4:1613\n1254#4,6:1614\n1242#4:1620\n1241#4,4:1621\n13309#5,2:1223\n13309#5,2:1350\n1855#6,2:1225\n1855#6,2:1354\n1313#7,2:1227\n1313#7,2:1352\n231#8,3:1229\n200#8,7:1232\n211#8,3:1240\n214#8,9:1244\n234#8:1253\n390#8:1272\n391#8:1276\n393#8,2:1278\n395#8,3:1281\n398#8:1287\n399#8:1291\n400#8:1293\n401#8,4:1296\n407#8:1301\n408#8,8:1303\n390#8:1311\n391#8:1315\n393#8,2:1317\n395#8,3:1320\n398#8:1326\n399#8:1330\n400#8:1332\n401#8,4:1335\n407#8:1340\n408#8,8:1342\n231#8,3:1356\n200#8,7:1359\n211#8,3:1367\n214#8,9:1371\n234#8:1380\n200#8,7:1399\n211#8,3:1407\n214#8,9:1411\n200#8,7:1420\n211#8,3:1428\n214#8,9:1432\n200#8,7:1441\n211#8,3:1449\n214#8,9:1453\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n200#8,7:1483\n211#8,3:1491\n214#8,9:1495\n301#9,7:1254\n308#9,4:1262\n301#9,7:1381\n308#9,4:1389\n1123#10:1261\n1123#10:1388\n287#11,6:1266\n287#11,6:1393\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n462#1:1211,5\n489#1:1217,6\n632#1:1239\n632#1:1243\n661#1:1273,3\n661#1:1277\n661#1:1280\n661#1:1284,3\n661#1:1288,3\n661#1:1292\n661#1:1294\n661#1:1295\n661#1:1300\n661#1:1302\n675#1:1312,3\n675#1:1316\n675#1:1319\n675#1:1323,3\n675#1:1327,3\n675#1:1331\n675#1:1333\n675#1:1334\n675#1:1339\n675#1:1341\n786#1:1366\n786#1:1370\n810#1:1406\n810#1:1410\n827#1:1427\n827#1:1431\n844#1:1448\n844#1:1452\n862#1:1469\n862#1:1473\n882#1:1490\n882#1:1494\n897#1:1504\n897#1:1505,6\n897#1:1511\n897#1:1512,4\n906#1:1516,6\n919#1:1522,3\n920#1:1525\n921#1:1526\n928#1:1527,3\n929#1:1530,3\n930#1:1533\n931#1:1534\n931#1:1535\n935#1:1536\n938#1:1537\n947#1:1538\n947#1:1539\n953#1:1540\n953#1:1541\n954#1:1542\n954#1:1543,6\n954#1:1549\n954#1:1550,4\n968#1:1554,3\n969#1:1557\n971#1:1558\n1017#1:1559,14\n1023#1:1573\n1037#1:1574,3\n1038#1:1577\n1049#1:1578\n1050#1:1579,6\n1060#1:1585\n1063#1:1586\n1064#1:1587,6\n1065#1:1593,6\n1072#1:1599\n1073#1:1600,6\n1106#1:1606\n1106#1:1607\n1108#1:1608,3\n1109#1:1611\n1111#1:1612\n1111#1:1613\n1111#1:1614,6\n1111#1:1620\n1111#1:1621,4\n605#1:1223,2\n759#1:1350,2\n614#1:1225,2\n777#1:1354,2\n623#1:1227,2\n768#1:1352,2\n632#1:1229,3\n632#1:1232,7\n632#1:1240,3\n632#1:1244,9\n632#1:1253\n661#1:1272\n661#1:1276\n661#1:1278,2\n661#1:1281,3\n661#1:1287\n661#1:1291\n661#1:1293\n661#1:1296,4\n661#1:1301\n661#1:1303,8\n675#1:1311\n675#1:1315\n675#1:1317,2\n675#1:1320,3\n675#1:1326\n675#1:1330\n675#1:1332\n675#1:1335,4\n675#1:1340\n675#1:1342,8\n786#1:1356,3\n786#1:1359,7\n786#1:1367,3\n786#1:1371,9\n786#1:1380\n810#1:1399,7\n810#1:1407,3\n810#1:1411,9\n827#1:1420,7\n827#1:1428,3\n827#1:1432,9\n844#1:1441,7\n844#1:1449,3\n844#1:1453,9\n862#1:1462,7\n862#1:1470,3\n862#1:1474,9\n882#1:1483,7\n882#1:1491,3\n882#1:1495,9\n641#1:1254,7\n641#1:1262,4\n795#1:1381,7\n795#1:1389,4\n641#1:1261\n795#1:1388\n650#1:1266,6\n804#1:1393,6\n*E\n"})
public final class l2<E> extends c3<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12343e;

    public l2() {
        this(0, 1, null);
    }

    private final int N(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12172c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12170a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.f12171b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iO = O(i11);
                if (this.f12343e == 0 && ((this.f12170a[iO >> 3] >> ((iO & 7) << 3)) & 255) != 254) {
                    J();
                    iO = O(i11);
                }
                this.f12173d++;
                int i19 = this.f12343e;
                long[] jArr2 = this.f12170a;
                int i20 = iO >> 3;
                long j14 = jArr2[i20];
                int i21 = (iO & 7) << 3;
                this.f12343e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12172c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iO - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iO;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int O(int i10) {
        int i11 = this.f12172c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12170a;
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

    private final void P() {
        this.f12343e = b3.p(n()) - this.f12173d;
    }

    private final void Q(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = b3.f12145e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f12170a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        P();
    }

    private final void R(int i10) {
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12172c = iMax;
        Q(iMax);
        this.f12171b = iMax == 0 ? t.a.f376160c : new Object[iMax];
    }

    public final boolean C(E e10) {
        int iQ = q();
        this.f12171b[N(e10)] = e10;
        return q() != iQ;
    }

    public final boolean D(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        Z(elements);
        return iQ != q();
    }

    public final boolean E(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        a0(elements);
        return iQ != q();
    }

    public final boolean F(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        b0(elements);
        return iQ != q();
    }

    public final boolean G(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        c0(elements);
        return iQ != q();
    }

    public final boolean H(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        e0(elements);
        return iQ != q();
    }

    public final boolean I(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        f0(elements);
        return iQ != q();
    }

    public final void J() {
        if (this.f12172c <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(this.f12173d) * 32), kotlin.y1.n(kotlin.y1.n(this.f12172c) * 25)) > 0) {
            p0(b3.x(this.f12172c));
        } else {
            M();
        }
    }

    @NotNull
    public final Set<E> K() {
        return new m2(this);
    }

    public final void L() {
        this.f12173d = 0;
        long[] jArr = this.f12170a;
        if (jArr != b3.f12145e) {
            int i10 = 7 >> 0;
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12170a;
            int i11 = this.f12172c;
            int i12 = i11 >> 3;
            long j10 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j10)) | j10;
        }
        ArraysKt.fill(this.f12171b, (Object) null, 0, this.f12172c);
        P();
    }

    public final void M() {
        long[] jArr = this.f12170a;
        int i10 = this.f12172c;
        Object[] objArr = this.f12171b;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        long j11 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j12 = (jArr[i16] >> i17) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * b3.f12150j;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iO = O(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iO - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iO >> 3;
                    long j13 = jArr[i22];
                    int i23 = (iO & 7) << 3;
                    if (((j13 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iO] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        Object obj2 = objArr[iO];
                        objArr[iO] = objArr[i15];
                        objArr[i15] = obj2;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j11 = j11;
                }
            } else {
                i15++;
            }
        }
        P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            W(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12498b;
        long[] jArr = elements.f12499c;
        int i10 = elements.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            W(objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(@NotNull c3<E> elements) {
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
                        W(objArr[(i10 << 3) + i12]);
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

    public final void V(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            W(it.next());
        }
    }

    public final void W(E e10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12172c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12170a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12171b[iNumberOfTrailingZeros], e10)) {
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
            n0(iNumberOfTrailingZeros);
        }
    }

    public final void X(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            W(it.next());
        }
    }

    public final void Y(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            W(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            d0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12498b;
        long[] jArr = elements.f12499c;
        int i10 = elements.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            d0(objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(@NotNull c3<E> elements) {
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
                        d0(objArr[(i10 << 3) + i12]);
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

    public final void c0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            d0(it.next());
        }
    }

    public final void d0(E e10) {
        this.f12171b[N(e10)] = e10;
    }

    public final void e0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            d0(it.next());
        }
    }

    public final void f0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            d0(e10);
        }
    }

    public final boolean g0(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12172c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12170a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12171b[iNumberOfTrailingZeros], e10)) {
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
            n0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean h0(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        S(elements);
        return iQ != q();
    }

    public final boolean i0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        T(elements);
        return iQ != q();
    }

    public final boolean j0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        U(elements);
        return iQ != q();
    }

    public final boolean k0(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        V(elements);
        return iQ != q();
    }

    public final boolean l0(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        X(elements);
        return iQ != q();
    }

    public final boolean m0(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iQ = q();
        Y(elements);
        return iQ != q();
    }

    @kotlin.a1
    public final void n0(int i10) {
        this.f12173d--;
        long[] jArr = this.f12170a;
        int i11 = this.f12172c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12171b[i10] = null;
    }

    public final void o0(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        long[] jArr = this.f12170a;
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
                            n0(i13);
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

    public final void p0(int i10) {
        long[] jArr = this.f12170a;
        Object[] objArr = this.f12171b;
        int i11 = this.f12172c;
        R(i10);
        long[] jArr2 = this.f12170a;
        Object[] objArr2 = this.f12171b;
        int i12 = this.f12172c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iO = O(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iO >> 3;
                int i16 = (iO & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iO - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iO] = obj;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[LOOP:0: B:5:0x0016->B:17:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[EDGE_INSN: B:24:0x0058->B:18:0x0058 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0055], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q0(@NotNull w2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12171b;
        int i10 = this.f12173d;
        long[] jArr = this.f12170a;
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
                                n0(i14);
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
        return i10 != this.f12173d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[LOOP:0: B:5:0x0018->B:17:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[EDGE_INSN: B:24:0x0058->B:18:0x0058 BREAK  A[LOOP:0: B:5:0x0018->B:17:0x0055], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r0(@NotNull c3<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12171b;
        int i10 = this.f12173d;
        long[] jArr = this.f12170a;
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
                                n0(i14);
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
        return i10 != this.f12173d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[LOOP:0: B:5:0x0018->B:17:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[EDGE_INSN: B:24:0x005e->B:18:0x005e BREAK  A[LOOP:0: B:5:0x0018->B:17:0x005b], SYNTHETIC] */
    public final boolean s0(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f12171b;
        int i10 = this.f12173d;
        long[] jArr = this.f12170a;
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
                                n0(i14);
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
        return i10 != this.f12173d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[LOOP:0: B:5:0x001a->B:17:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[EDGE_INSN: B:24:0x005e->B:18:0x005e BREAK  A[LOOP:0: B:5:0x001a->B:17:0x005b], SYNTHETIC] */
    public final boolean t0(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12171b;
        int i10 = this.f12173d;
        long[] jArr = this.f12170a;
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
                            if (!predicate.invoke(objArr[i14]).booleanValue()) {
                                n0(i14);
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
        return i10 != this.f12173d;
    }

    @androidx.annotation.g0(from = 0)
    public final int u0() {
        int i10 = this.f12172c;
        int iY = b3.y(b3.A(this.f12173d));
        if (iY >= i10) {
            return 0;
        }
        p0(iY);
        return i10 - this.f12172c;
    }

    public l2(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            t.f.c("Capacity must be a positive value.");
        }
        R(b3.A(i10));
    }

    public /* synthetic */ l2(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
