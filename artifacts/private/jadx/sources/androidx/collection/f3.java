package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1148:1\n684#1,2:1161\n633#1:1163\n635#1,2:1165\n638#1,6:1168\n251#1,2:1174\n251#1,2:1176\n251#1,2:1178\n251#1,2:1181\n251#1,2:1201\n548#1,4:1210\n1025#1,6:1214\n1035#1,3:1221\n1038#1,2:1225\n251#1,2:1227\n1041#1,6:1229\n552#1:1235\n251#1,2:1236\n1025#1,6:1238\n1035#1,3:1245\n1038#1,9:1249\n1025#1,6:1289\n1035#1,3:1296\n1038#1,9:1300\n1025#1,6:1309\n1035#1,3:1316\n1038#1,9:1320\n1025#1,6:1329\n1035#1,3:1336\n1038#1,9:1340\n548#1,4:1349\n1025#1,6:1353\n1035#1,3:1360\n1038#1,9:1364\n552#1:1373\n548#1,4:1374\n1025#1,6:1378\n1035#1,3:1385\n1038#1,9:1389\n552#1:1398\n548#1,4:1399\n1025#1,6:1403\n1035#1,3:1410\n1038#1,9:1414\n552#1:1423\n1025#1,6:1424\n1035#1,3:1431\n1038#1,9:1435\n660#1,3:1462\n663#1:1466\n665#1,2:1468\n668#1,5:1471\n674#1,8:1477\n548#1,4:1638\n1025#1,6:1642\n1035#1,3:1649\n1038#1,9:1653\n552#1:1662\n548#1,4:1663\n1025#1,6:1667\n1035#1,3:1674\n1038#1,9:1678\n552#1:1687\n59#2,5:1149\n1#3:1154\n1254#4,6:1155\n1399#4:1194\n1270#4:1198\n1399#4:1220\n1270#4:1224\n1399#4:1244\n1270#4:1248\n1399#4:1268\n1270#4:1272\n1399#4:1295\n1270#4:1299\n1399#4:1315\n1270#4:1319\n1399#4:1335\n1270#4:1339\n1399#4:1359\n1270#4:1363\n1399#4:1384\n1270#4:1388\n1399#4:1409\n1270#4:1413\n1399#4:1430\n1270#4:1434\n1230#4:1450\n1254#4,6:1451\n1242#4:1457\n1241#4,4:1458\n1165#4,3:1489\n1179#4:1492\n1175#4:1493\n1372#4,3:1494\n1386#4,3:1497\n1312#4:1500\n1303#4:1501\n1297#4:1502\n1309#4:1503\n1393#4:1504\n1165#4,3:1505\n1175#4:1508\n1179#4:1509\n1372#4,3:1510\n1386#4,3:1513\n1312#4:1516\n1303#4:1517\n1297#4:1518\n1309#4:1519\n1393#4:1520\n1265#4:1521\n1220#4:1522\n1262#4:1523\n1220#4:1524\n1230#4:1525\n1254#4,6:1526\n1242#4:1532\n1241#4,4:1533\n1372#4,3:1537\n1399#4:1540\n1297#4:1541\n1144#4,14:1542\n1220#4:1556\n1165#4,3:1557\n1175#4:1560\n1179#4:1561\n1254#4,6:1562\n1220#4:1569\n1179#4:1570\n1254#4,6:1571\n1254#4,6:1577\n1179#4:1588\n1254#4,6:1589\n1268#4:1600\n1220#4:1601\n1165#4,3:1602\n1175#4:1605\n1179#4:1606\n1230#4:1607\n1254#4,6:1608\n1242#4:1614\n1241#4,4:1615\n1399#4:1636\n1270#4:1637\n1399#4:1648\n1270#4:1652\n1399#4:1673\n1270#4:1677\n1111#5:1164\n1114#5:1167\n1130#5:1444\n1123#5:1445\n1119#5:1446\n1123#5:1447\n1111#5:1448\n1114#5:1449\n1123#5:1465\n1127#5:1467\n1117#5:1470\n1114#5:1476\n1123#5:1485\n1127#5:1486\n1117#5:1487\n1114#5:1488\n1132#5:1568\n1144#5:1583\n1138#5:1584\n1141#5:1585\n1132#5:1586\n1132#5:1587\n1144#5:1595\n1138#5:1596\n1135#5:1597\n1132#5:1598\n1132#5:1599\n1123#5:1619\n1127#5:1620\n1096#5,2:1621\n1147#5:1623\n1098#5,2:1624\n1147#5:1626\n1147#5:1627\n1147#5:1628\n1147#5:1629\n1123#5:1630\n1127#5:1631\n1103#5,4:1632\n215#6:1180\n216#6:1183\n357#7,4:1184\n329#7,6:1188\n339#7,3:1195\n342#7,2:1199\n345#7,6:1203\n361#7:1209\n231#8,3:1258\n200#8,7:1261\n211#8,3:1269\n214#8,9:1273\n234#8:1282\n287#9,6:1283\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n229#1:1161,2\n288#1:1163\n288#1:1165,2\n288#1:1168,6\n300#1:1174,2\n311#1:1176,2\n322#1:1178,2\n332#1:1181,2\n341#1:1201,2\n350#1:1210,4\n350#1:1214,6\n350#1:1221,3\n350#1:1225,2\n350#1:1227,2\n350#1:1229,6\n350#1:1235\n358#1:1236,2\n447#1:1238,6\n447#1:1245,3\n447#1:1249,9\n551#1:1289,6\n551#1:1296,3\n551#1:1300,9\n563#1:1309,6\n563#1:1316,3\n563#1:1320,9\n575#1:1329,6\n575#1:1336,3\n575#1:1340,9\n580#1:1349,4\n580#1:1353,6\n580#1:1360,3\n580#1:1364,9\n580#1:1373\n586#1:1374,4\n586#1:1378,6\n586#1:1385,3\n586#1:1389,9\n586#1:1398\n596#1:1399,4\n596#1:1403,6\n596#1:1410,3\n596#1:1414,9\n596#1:1423\n609#1:1424,6\n609#1:1431,3\n609#1:1435,9\n654#1:1462,3\n654#1:1466\n654#1:1468,2\n654#1:1471,5\n654#1:1477,8\n1055#1:1638,4\n1055#1:1642,6\n1055#1:1649,3\n1055#1:1653,9\n1055#1:1662\n1081#1:1663,4\n1081#1:1667,6\n1081#1:1674,3\n1081#1:1678,9\n1081#1:1687\n131#1:1149,5\n211#1:1155,6\n341#1:1194\n341#1:1198\n350#1:1220\n350#1:1224\n447#1:1244\n447#1:1248\n486#1:1268\n486#1:1272\n551#1:1295\n551#1:1299\n563#1:1315\n563#1:1319\n575#1:1335\n575#1:1339\n580#1:1359\n580#1:1363\n586#1:1384\n586#1:1388\n596#1:1409\n596#1:1413\n609#1:1430\n609#1:1434\n648#1:1450\n648#1:1451,6\n648#1:1457\n648#1:1458,4\n688#1:1489,3\n689#1:1492\n692#1:1493\n696#1:1494,3\n697#1:1497,3\n698#1:1500\n699#1:1501\n699#1:1502\n703#1:1503\n706#1:1504\n718#1:1505,3\n719#1:1508\n720#1:1509\n727#1:1510,3\n728#1:1513,3\n729#1:1516\n730#1:1517\n730#1:1518\n734#1:1519\n737#1:1520\n746#1:1521\n746#1:1522\n752#1:1523\n752#1:1524\n753#1:1525\n753#1:1526,6\n753#1:1532\n753#1:1533,4\n764#1:1537,3\n765#1:1540\n767#1:1541\n841#1:1542,14\n847#1:1556\n861#1:1557,3\n862#1:1560\n873#1:1561\n874#1:1562,6\n888#1:1569\n891#1:1570\n892#1:1571,6\n893#1:1577,6\n915#1:1588\n916#1:1589,6\n980#1:1600\n980#1:1601\n982#1:1602,3\n983#1:1605\n985#1:1606\n985#1:1607\n985#1:1608,6\n985#1:1614\n985#1:1615,4\n1030#1:1636\n1037#1:1637\n1055#1:1648\n1055#1:1652\n1081#1:1673\n1081#1:1677\n288#1:1164\n288#1:1167\n619#1:1444\n621#1:1445\n622#1:1446\n626#1:1447\n633#1:1448\n636#1:1449\n654#1:1465\n654#1:1467\n654#1:1470\n654#1:1476\n662#1:1485\n663#1:1486\n666#1:1487\n672#1:1488\n878#1:1568\n905#1:1583\n907#1:1584\n908#1:1585\n910#1:1586\n912#1:1587\n931#1:1595\n933#1:1596\n934#1:1597\n936#1:1598\n940#1:1599\n1001#1:1619\n1002#1:1620\n1003#1:1621,2\n1003#1:1623\n1003#1:1624,2\n1003#1:1626\n1005#1:1627\n1006#1:1628\n1007#1:1629\n1014#1:1630\n1015#1:1631\n1016#1:1632,4\n332#1:1180\n332#1:1183\n341#1:1184,4\n341#1:1188,6\n341#1:1195,3\n341#1:1199,2\n341#1:1203,6\n341#1:1209\n486#1:1258,3\n486#1:1261,7\n486#1:1269,3\n486#1:1273,9\n486#1:1282\n491#1:1283,6\n*E\n"})
public final class f3<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<K, V, Integer> f12220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<K, V> f12221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pj.o<K, V, V, Boolean, Unit> f12222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private long[] f12226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f12229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f12231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12234o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.l0 implements Function2<K, V, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12235a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(K k10, V v10) {
            Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(v10, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends kotlin.jvm.internal.l0 implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12236a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(K it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class c extends kotlin.jvm.internal.l0 implements pj.o<K, V, V, Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12237a = new c();

        c() {
            super(4);
        }

        public final void c(K k10, V v10, V v11, boolean z10) {
            Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(v10, "<anonymous parameter 1>");
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Boolean bool) {
            c(obj, obj2, obj3, bool.booleanValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f3(@androidx.annotation.g0(from = 1, to = 2147483646) int i10, @androidx.annotation.g0(from = 0, to = 2147483646) int i11, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> createValueFromKey, @NotNull pj.o<? super K, ? super V, ? super V, ? super Boolean, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(createValueFromKey, "createValueFromKey");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        this.f12220a = sizeOf;
        this.f12221b = createValueFromKey;
        this.f12222c = onEntryRemoved;
        this.f12223d = b3.f12145e;
        Object[] objArr = t.a.f376160c;
        this.f12224e = objArr;
        this.f12225f = objArr;
        this.f12226g = g3.j();
        this.f12232m = Integer.MAX_VALUE;
        this.f12233n = Integer.MAX_VALUE;
        this.f12234o = Integer.MAX_VALUE;
        if (!(i10 > 0)) {
            t.f.c("maxSize must be > 0");
        }
        this.f12230k = i10;
        G(b3.A(i11));
    }

    @kotlin.a1
    public static /* synthetic */ void B() {
    }

    @kotlin.a1
    public static /* synthetic */ void D() {
    }

    private final void E() {
        this.f12228i = b3.p(this.f12227h) - x();
    }

    private final void F(int i10) {
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
        this.f12223d = jArr;
        E();
    }

    private final void G(int i10) {
        long[] jArrJ;
        int iMax = i10 > 0 ? Math.max(7, b3.y(i10)) : 0;
        this.f12227h = iMax;
        F(iMax);
        this.f12224e = iMax == 0 ? t.a.f376160c : new Object[iMax];
        this.f12225f = iMax == 0 ? t.a.f376160c : new Object[iMax];
        if (iMax == 0) {
            jArrJ = g3.j();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            jArrJ = jArr;
        }
        this.f12226g = jArrJ;
    }

    private final void J(int i10) {
        long[] jArr = this.f12226g;
        jArr[i10] = (jArr[i10] & 4611686018427387903L) | 4611686018427387904L;
    }

    private final void Q(int i10) {
        long[] jArr = this.f12226g;
        int i11 = this.f12232m;
        jArr[i10] = (((long) i11) & g3.f12256c) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((((long) i10) & g3.f12256c) << 31) | (jArr[i11] & g3.f12260g);
        }
        this.f12232m = i10;
        if (this.f12233n == Integer.MAX_VALUE) {
            this.f12233n = i10;
        }
    }

    private final void j0(int i10) {
        long[] jArr = this.f12226g;
        long j10 = jArr[i10];
        int i11 = (int) ((j10 >> 31) & g3.f12256c);
        int i12 = (int) (j10 & g3.f12256c);
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = (jArr[i11] & g3.f12261h) | (((long) i12) & g3.f12256c);
        } else {
            this.f12232m = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((((long) i11) & g3.f12256c) << 31) | (jArr[i12] & g3.f12260g);
        } else {
            this.f12233n = i11;
        }
        if (this.f12234o == i10) {
            this.f12234o = i11;
        }
        jArr[i10] = 4611686018427387903L;
    }

    private final V k0(int i10) {
        this.f12229j--;
        long[] jArr = this.f12223d;
        int i11 = this.f12227h;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f12224e[i10] = null;
        Object[] objArr = this.f12225f;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        long[] jArr2 = this.f12226g;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & g3.f12256c);
        int i15 = (int) (j11 & g3.f12256c);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & g3.f12261h) | (((long) i15) & g3.f12256c);
        } else {
            this.f12232m = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & g3.f12256c) << 31) | (jArr2[i15] & g3.f12260g);
        } else {
            this.f12233n = i14;
        }
        if (this.f12234o == i10) {
            this.f12234o = i14;
        }
        jArr2[i10] = 4611686018427387903L;
        return v10;
    }

    private final int l() {
        long[] jArr = this.f12226g;
        int i10 = this.f12234o;
        if (i10 == Integer.MAX_VALUE) {
            i10 = this.f12233n;
        }
        while (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            if (((int) ((j10 >> 62) & 1)) == 0) {
                break;
            }
            int i11 = (int) (g3.f12256c & (j10 >> 31));
            jArr[i10] = 4611686018427387903L & j10;
            i10 = i11 != Integer.MAX_VALUE ? i11 : this.f12233n;
        }
        int i12 = (int) (g3.f12256c & (jArr[i10] >> 31));
        this.f12234o = i12 != Integer.MAX_VALUE ? i12 : Integer.MAX_VALUE;
        return i10;
    }

    private final int m(int i10) {
        int i11 = this.f12227h;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12223d;
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

    private final int n(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12227h;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12223d;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * b3.f12151k);
            for (long j13 = (~j12) & (j12 - b3.f12151k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.f12224e[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = m(i11);
                if (this.f12228i == 0 && ((this.f12223d[iM >> 3] >> ((iM & 7) << 3)) & 255) != 254) {
                    a();
                    iM = m(i11);
                }
                this.f12229j++;
                int i19 = this.f12228i;
                long[] jArr2 = this.f12223d;
                int i20 = iM >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.f12228i = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f12227h;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iM;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int o(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12227h;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12223d;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12224e[iNumberOfTrailingZeros], k10)) {
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

    private final void p(int[] iArr) {
        long[] jArr = this.f12226g;
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
        int i14 = this.f12232m;
        if (i14 != Integer.MAX_VALUE) {
            this.f12232m = iArr[i14];
        }
        int i15 = this.f12233n;
        if (i15 != Integer.MAX_VALUE) {
            this.f12233n = iArr[i15];
        }
        int i16 = this.f12234o;
        if (i16 != Integer.MAX_VALUE) {
            this.f12234o = iArr[i16];
        }
    }

    private final void q(long[] jArr) {
        long[] jArr2 = this.f12226g;
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
        int i14 = this.f12232m;
        if (i14 != Integer.MAX_VALUE) {
            this.f12232m = (int) (jArr[i14] & com.rabbitmq.client.k0.f265952a);
        }
        int i15 = this.f12233n;
        if (i15 != Integer.MAX_VALUE) {
            this.f12233n = (int) (jArr[i15] & com.rabbitmq.client.k0.f265952a);
        }
        int i16 = this.f12234o;
        if (i16 != Integer.MAX_VALUE) {
            this.f12234o = (int) (jArr[i16] & com.rabbitmq.client.k0.f265952a);
        }
    }

    public static /* synthetic */ void y() {
    }

    @kotlin.a1
    public static /* synthetic */ void z() {
    }

    public final int A() {
        return this.f12230k;
    }

    public final int C() {
        return this.f12231l;
    }

    public final boolean H() {
        return this.f12229j == 0;
    }

    public final boolean I() {
        return this.f12229j != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(@NotNull s2<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f12449a;
        int i10 = keys.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            g0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(@NotNull c3<K> keys) {
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
                        g0(objArr[(i10 << 3) + i12]);
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

    public final void M(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void N(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        g0(key);
    }

    public final void O(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void P(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            g0(k10);
        }
    }

    public final boolean R() {
        return this.f12229j == 0;
    }

    public final void S(@NotNull a3<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        a0(from);
    }

    public final void T(@NotNull f3<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        b0(from);
    }

    public final void U(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        c0(pairs);
    }

    public final void V(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        d0(from);
    }

    public final void W(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Z(pair.getFirst(), pair.getSecond());
    }

    public final void X(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        e0(pairs);
    }

    public final void Y(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        f0(pairs);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final V Z(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iN = n(key);
        if (iN < 0) {
            iN = ~iN;
        }
        Object[] objArr = this.f12225f;
        V v10 = (V) objArr[iN];
        objArr[iN] = value;
        this.f12224e[iN] = key;
        int iIntValue = this.f12231l + this.f12220a.invoke(key, value).intValue();
        this.f12231l = iIntValue;
        if (v10 != null) {
            this.f12231l = iIntValue - ((Number) this.f12220a.invoke(key, v10)).intValue();
            this.f12222c.invoke(key, v10, value, Boolean.FALSE);
            o0(this.f12230k);
            return v10;
        }
        o0(this.f12230k);
        long[] jArr = this.f12226g;
        int i10 = this.f12232m;
        jArr[iN] = (((long) i10) & g3.f12256c) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & g3.f12260g) | ((g3.f12256c & ((long) iN)) << 31);
        }
        this.f12232m = iN;
        if (this.f12233n == Integer.MAX_VALUE) {
            this.f12233n = iN;
        }
        return v10;
    }

    public final void a() {
        if (this.f12227h <= 8 || Long.compareUnsigned(kotlin.y1.n(kotlin.y1.n(x()) * 32), kotlin.y1.n(kotlin.y1.n(this.f12227h) * 25)) > 0) {
            m0(b3.x(this.f12227h));
        } else {
            j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(@NotNull a3<K, V> from) {
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
                        Z(objArr[i13], objArr2[i13]);
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

    public final boolean b(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!predicate.invoke(obj, obj2).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(@NotNull f3<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.f12224e;
        Object[] objArr2 = from.f12225f;
        long[] jArr = from.f12223d;
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
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        Z(obj, obj2);
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

    public final boolean c() {
        return this.f12229j != 0;
    }

    public final void c0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Z(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[LOOP:0: B:5:0x0014->B:18:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[SYNTHETIC] */
    public final boolean d(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj2 = objArr2[i13];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            if (predicate.invoke(obj, obj2).booleanValue()) {
                                return true;
                            }
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

    public final void d0(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            Z(entry.getKey(), entry.getValue());
        }
    }

    public final boolean e(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return o(key) >= 0;
    }

    public final void e0(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Z(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[LOOP:0: B:16:0x002d->B:28:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        if (f3Var.C() != C() || f3Var.f12229j != this.f12229j) {
            return false;
        }
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj3 = objArr2[i13];
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            if (!Intrinsics.areEqual(obj3, f3Var.v(obj2))) {
                                return false;
                            }
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

    public final boolean f(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return o(key) >= 0;
    }

    public final void f0(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            Z(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[LOOP:0: B:5:0x0014->B:19:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[SYNTHETIC] */
    public final boolean g(@NotNull V value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f12225f;
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        boolean z10 = true | false;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            if (Intrinsics.areEqual(value, obj)) {
                                int i13 = 5 << 1;
                                return true;
                            }
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

    @Nullable
    public final V g0(@NotNull K key) {
        V vK0;
        Intrinsics.checkNotNullParameter(key, "key");
        int iO = o(key);
        if (iO < 0 || (vK0 = k0(iO)) == null) {
            return null;
        }
        this.f12231l -= this.f12220a.invoke(key, vK0).intValue();
        this.f12222c.invoke(key, vK0, null, Boolean.FALSE);
        return vK0;
    }

    public final int h() {
        return C();
    }

    public final boolean h0(@NotNull K key, @NotNull V value) {
        V vK0;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iO = o(key);
        if (iO < 0 || !Intrinsics.areEqual(this.f12225f[iO], value) || (vK0 = k0(iO)) == null) {
            return false;
        }
        this.f12231l -= this.f12220a.invoke(key, vK0).intValue();
        this.f12222c.invoke(key, vK0, null, Boolean.FALSE);
        return true;
    }

    public int hashCode() {
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final int i(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
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
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i14];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            i11++;
                        }
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

    public final void i0(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12223d;
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
                        Object obj = this.f12224e[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = this.f12225f[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            V vK0 = k0(i13);
                            if (vK0 == null) {
                                return;
                            }
                            this.f12231l -= this.f12220a.invoke((K) obj, vK0).intValue();
                            this.f12222c.invoke((K) obj, vK0, null, Boolean.FALSE);
                        } else {
                            continue;
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

    public final void j() {
        Object[] objArr;
        long[] jArr = this.f12223d;
        if (jArr == null) {
            return;
        }
        int i10 = this.f12227h;
        Object[] objArr2 = this.f12224e;
        Object[] objArr3 = this.f12225f;
        long[] jArr2 = this.f12226g;
        long[] jArr3 = new long[i10];
        long j10 = 9223372034707292159L;
        int i11 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i10);
        int i12 = (i10 + 7) >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j12 = (jArr[i16] >> i17) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr2[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i11) * b3.f12150j;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                long j13 = j10;
                int iM = m(i19);
                int i20 = i19 & i10;
                if (((iM - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    int i21 = i11;
                    int i22 = i15;
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    if (jArr3[i22] == j13) {
                        long j14 = i22;
                        jArr3[i22] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i21];
                    i15 = i22 + 1;
                    j10 = j13;
                    i11 = i21;
                } else {
                    int i23 = i11;
                    int i24 = iM >> 3;
                    long j15 = jArr[i24];
                    int i25 = (iM & 7) << 3;
                    if (((j15 >> i25) & 255) == 128) {
                        objArr = objArr2;
                        jArr[i24] = (j15 & (~(255 << i25))) | (((long) (i18 & 127)) << i25);
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM] = objArr[i15];
                        objArr[i15] = null;
                        objArr3[iM] = objArr3[i15];
                        objArr3[i15] = null;
                        jArr2[iM] = jArr2[i15];
                        jArr2[i15] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i15] >> 32) & com.rabbitmq.client.k0.f265952a);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iM);
                            jArr3[i15] = (jArr3[i15] & com.rabbitmq.client.k0.f265952a) | (-4294967296L);
                        } else {
                            jArr3[i15] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM);
                        }
                        jArr3[iM] = (((long) i15) << 32) | ((long) Integer.MAX_VALUE);
                    } else {
                        objArr = objArr2;
                        jArr[i24] = (((long) (i18 & 127)) << i25) | (j15 & (~(255 << i25)));
                        Object obj2 = objArr[iM];
                        objArr[iM] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr3[iM];
                        objArr3[iM] = objArr3[i15];
                        objArr3[i15] = obj3;
                        long j16 = jArr2[iM];
                        jArr2[iM] = jArr2[i15];
                        jArr2[i15] = j16;
                        int i27 = (int) ((jArr3[i15] >> 32) & com.rabbitmq.client.k0.f265952a);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iM;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i15] = (jArr3[i15] & com.rabbitmq.client.k0.f265952a) | (j17 << 32);
                        } else {
                            long j18 = iM;
                            jArr3[i15] = j18 | (j18 << 32);
                            i27 = i15;
                        }
                        jArr3[iM] = (((long) i27) << 32) | ((long) i15);
                        i15--;
                    }
                    jArr[jArr.length - 1] = jArr[i23];
                    i15++;
                    i10 = i10;
                    j10 = j13;
                    i11 = i23;
                    objArr2 = objArr;
                }
            } else {
                i15++;
            }
        }
        E();
        q(jArr3);
    }

    public final void k() {
        o0(-1);
    }

    public final void l0(@androidx.annotation.g0(from = 1, to = 2147483646) int i10) {
        this.f12230k = i10;
        o0(i10);
    }

    public final void m0(int i10) {
        long[] jArr = this.f12223d;
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr2 = this.f12226g;
        int i11 = this.f12227h;
        int[] iArr = new int[i11];
        G(i10);
        long[] jArr3 = this.f12223d;
        Object[] objArr3 = this.f12224e;
        Object[] objArr4 = this.f12225f;
        long[] jArr4 = this.f12226g;
        int i12 = this.f12227h;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM = m(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iM >> 3;
                int i16 = (iM & 7) << 3;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iM - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr3[iM] = obj;
                objArr4[iM] = objArr2[i13];
                jArr4[iM] = jArr2[i13];
                iArr[i13] = iM;
            }
            i13++;
            jArr = jArr;
            objArr = objArr;
        }
        p(iArr);
    }

    public final void n0(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Z(key, value);
    }

    public final void o0(int i10) {
        int iL;
        while (this.f12231l > i10 && x() != 0 && (iL = l()) != Integer.MAX_VALUE) {
            Object obj = this.f12224e[iL];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vK0 = k0(iL);
            if (vK0 != null) {
                this.f12231l -= this.f12220a.invoke((K) obj, vK0).intValue();
                this.f12222c.invoke((K) obj, vK0, null, Boolean.TRUE);
            }
        }
    }

    public final void r(@NotNull Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12224e;
        Object[] objArr2 = this.f12225f;
        long[] jArr = this.f12223d;
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
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[LOOP:0: B:5:0x0013->B:18:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056 A[EDGE_INSN: B:22:0x0056->B:19:0x0056 BREAK  A[LOOP:0: B:5:0x0013->B:18:0x0052], SYNTHETIC] */
    @kotlin.a1
    public final void s(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12223d;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            block.invoke(Integer.valueOf((i10 << 3) + i12));
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
                } else {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[LOOP:0: B:5:0x0011->B:16:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[EDGE_INSN: B:20:0x0059->B:17:0x0059 BREAK  A[LOOP:0: B:5:0x0011->B:16:0x0056], SYNTHETIC] */
    public final void t(@NotNull Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12224e;
        long[] jArr = this.f12223d;
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
                            Object obj = objArr[(i10 << 3) + i12];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            block.invoke(obj);
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

    @NotNull
    public String toString() {
        return "SieveCache[maxSize=" + this.f12230k + ", size=" + this.f12231l + ", capacity=" + this.f12227h + ", count=" + this.f12229j + AbstractJsonLexerKt.END_LIST;
    }

    public final void u(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12225f;
        long[] jArr = this.f12223d;
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
                        Object obj = objArr[(i10 << 3) + i12];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj);
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

    @Nullable
    public final V v(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iO = o(key);
        if (iO >= 0) {
            long[] jArr = this.f12226g;
            jArr[iO] = (jArr[iO] & 4611686018427387903L) | 4611686018427387904L;
            return (V) this.f12225f[iO];
        }
        V vInvoke = this.f12221b.invoke(key);
        if (vInvoke == null) {
            return null;
        }
        Z(key, vInvoke);
        return vInvoke;
    }

    public final int w() {
        return this.f12227h;
    }

    public final int x() {
        return this.f12229j;
    }

    public /* synthetic */ f3(int i10, int i11, Function2 function2, Function1 function1, pj.o oVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? 6 : i11, (i12 & 4) != 0 ? a.f12235a : function2, (i12 & 8) != 0 ? b.f12236a : function1, (i12 & 16) != 0 ? c.f12237a : oVar);
    }
}
