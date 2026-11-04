package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 7 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 8 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 13 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 15 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 16 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 17 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 18 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 19 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 20 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1447:1\n1194#1,2:1477\n1378#1,3:1479\n1184#1,6:1483\n1382#1,2:1490\n1385#1:1499\n1196#1,4:1500\n1184#1,6:1505\n1194#1,2:2075\n1378#1,3:2077\n1184#1,6:2080\n1382#1,2:2087\n1385#1:2096\n1196#1,4:2097\n1194#1,2:2113\n1378#1,3:2115\n1382#1,2:2119\n1385#1:2128\n1196#1,4:2129\n1194#1,2:2230\n1378#1,3:2232\n1382#1,2:2236\n1385#1:2245\n1196#1,4:2246\n1194#1,2:2251\n1378#1,3:2253\n1382#1,2:2257\n1385#1:2266\n1196#1,4:2267\n1194#1,2:2272\n1378#1,3:2274\n1382#1,2:2285\n1385#1:2294\n1196#1,4:2295\n1378#1,3:2299\n1382#1,2:2303\n1385#1:2312\n25#2,5:1448\n33#2:1454\n33#2:1467\n33#2:1468\n33#2:1469\n33#2:1482\n33#2:1504\n33#2:1511\n33#2:1530\n33#2:1531\n33#2:2038\n33#2:2074\n33#2:2229\n33#2:2250\n33#2:2271\n33#2:2320\n33#2:2323\n33#2:2324\n33#2:2325\n33#2:2394\n1#3:1453\n1#3:1489\n1#3:1523\n1#3:2086\n1#3:2118\n1#3:2140\n1#3:2154\n1#3:2235\n1#3:2256\n1#3:2284\n1#3:2302\n1#3:2376\n1#3:2409\n49#4,4:1455\n49#4,4:1459\n49#4,4:1463\n49#4,4:1512\n49#4,4:2382\n49#4,4:2395\n91#5:1470\n34#5,5:1471\n92#5:1476\n106#5:2101\n34#5,5:2102\n107#5:2107\n34#5,3:2379\n38#5:2386\n87#6,7:1492\n87#6,3:1516\n91#6,3:1527\n87#6,7:2089\n87#6,7:2121\n87#6,3:2133\n91#6,3:2144\n87#6,7:2238\n87#6,7:2259\n87#6,7:2277\n87#6,7:2287\n87#6,7:2305\n87#6,7:2313\n87#6,7:2387\n87#6,3:2402\n91#6,3:2413\n175#7,4:1519\n180#7,3:1524\n175#7,4:2136\n180#7,3:2141\n175#7,4:2150\n180#7,3:2155\n175#7,4:2405\n180#7,3:2410\n41#8,3:1532\n46#8:1560\n48#8:1563\n41#8,3:1666\n46#8:1728\n48#8:1756\n231#9,3:1535\n200#9,7:1538\n211#9,3:1546\n214#9,9:1550\n234#9:1559\n200#9,16:1587\n217#9,6:1607\n231#9,3:1637\n200#9,7:1640\n211#9,3:1648\n214#9,9:1652\n234#9:1661\n231#9,3:1669\n200#9,7:1672\n211#9,3:1680\n214#9,2:1684\n231#9,3:1692\n200#9,7:1695\n211#9,3:1703\n214#9,9:1707\n234#9:1716\n217#9,6:1721\n234#9:1727\n231#9,3:1730\n200#9,7:1733\n211#9,3:1741\n214#9,9:1745\n234#9:1754\n200#9,7:1779\n211#9,3:1787\n214#9,2:1791\n217#9,6:1797\n200#9,7:1843\n211#9,3:1851\n214#9,2:1855\n217#9,6:1861\n200#9,16:1907\n217#9,6:1927\n200#9,7:1953\n211#9,3:1961\n214#9,2:1965\n217#9,6:1971\n231#9,3:2009\n200#9,7:2012\n211#9,3:2020\n214#9,9:2024\n234#9:2033\n231#9,3:2045\n200#9,7:2048\n211#9,3:2056\n214#9,9:2060\n234#9:2069\n200#9,16:2184\n217#9,6:2204\n231#9,3:2333\n200#9,7:2336\n211#9,3:2344\n214#9,9:2348\n234#9:2357\n1399#10:1545\n1270#10:1549\n1399#10:1572\n1270#10:1576\n1399#10:1647\n1270#10:1651\n1399#10:1679\n1270#10:1683\n1399#10:1702\n1270#10:1706\n1399#10:1740\n1270#10:1744\n1399#10:1765\n1270#10:1769\n1399#10:1786\n1270#10:1790\n1399#10:1829\n1270#10:1833\n1399#10:1850\n1270#10:1854\n1399#10:1893\n1270#10:1897\n1399#10:1960\n1270#10:1964\n1399#10:1988\n1270#10:1992\n1399#10:2019\n1270#10:2023\n1399#10:2055\n1270#10:2059\n1399#10:2170\n1270#10:2174\n1399#10:2343\n1270#10:2347\n1863#11,2:1561\n1863#11:1729\n1864#11:1755\n139#12:1564\n140#12,5:1580\n145#12,6:1614\n152#12:1630\n67#12,6:1631\n75#12,4:1662\n67#12,6:1686\n75#12,4:1717\n123#12:1757\n124#12,4:1773\n128#12,6:1804\n135#12:1820\n123#12:1821\n124#12,4:1837\n128#12,6:1868\n135#12:1884\n123#12:1885\n124#12,4:1901\n128#12,6:1934\n135#12:1950\n67#12,6:2003\n75#12,4:2034\n67#12,6:2039\n75#12,4:2070\n123#12:2162\n124#12,4:2178\n128#12,6:2211\n135#12:2227\n81#12:2326\n67#12,6:2327\n75#12,8:2358\n842#13:1565\n844#13:1579\n845#13,3:1620\n848#13:1629\n842#13:1758\n844#13:1772\n845#13,3:1810\n848#13:1819\n842#13:1822\n844#13:1836\n845#13,3:1874\n848#13:1883\n842#13:1886\n844#13:1900\n845#13,3:1940\n848#13:1949\n842#13:2163\n844#13:2177\n845#13,3:2217\n848#13:2226\n329#14,6:1566\n339#14,3:1573\n342#14,2:1577\n345#14,6:1623\n329#14,6:1759\n339#14,3:1766\n342#14,2:1770\n345#14,6:1813\n329#14,6:1823\n339#14,3:1830\n342#14,2:1834\n345#14,6:1877\n329#14,6:1887\n339#14,3:1894\n342#14,2:1898\n345#14,6:1943\n329#14,6:2164\n339#14,3:2171\n342#14,2:2175\n345#14,6:2220\n809#15,2:1585\n812#15,4:1603\n816#15:1613\n809#15,2:1777\n812#15,4:1793\n816#15:1803\n809#15,2:1841\n812#15,4:1857\n816#15:1867\n809#15,2:1905\n812#15,4:1923\n816#15:1933\n809#15,2:1951\n812#15,4:1967\n816#15:1977\n809#15,2:2182\n812#15,4:2200\n816#15:2210\n54#16:1978\n54#16:1995\n403#17,3:1979\n367#17,6:1982\n377#17,3:1989\n380#17,2:1993\n383#17,6:1996\n406#17:2002\n4809#18:2108\n4788#18,4:2109\n45#19,3:2147\n49#19:2158\n45#19,3:2159\n49#19:2228\n45#19,3:2399\n49#19:2416\n13409#20,2:2321\n11483#20,9:2366\n13409#20:2375\n13410#20:2377\n11492#20:2378\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n828#1:1477,2\n828#1:1479,3\n831#1:1483,6\n828#1:1490,2\n828#1:1499\n828#1:1500,4\n841#1:1505,6\n1073#1:2075,2\n1073#1:2077,3\n1074#1:2080,6\n1073#1:2087,2\n1073#1:2096\n1073#1:2097,4\n1087#1:2113,2\n1087#1:2115,3\n1087#1:2119,2\n1087#1:2128\n1087#1:2129,4\n1148#1:2230,2\n1148#1:2232,3\n1148#1:2236,2\n1148#1:2245\n1148#1:2246,4\n1157#1:2251,2\n1157#1:2253,3\n1157#1:2257,2\n1157#1:2266\n1157#1:2267,4\n1167#1:2272,2\n1167#1:2274,3\n1167#1:2285,2\n1167#1:2294\n1167#1:2295,4\n1195#1:2299,3\n1195#1:2303,2\n1195#1:2312\n469#1:1448,5\n630#1:1454\n720#1:1467\n730#1:1468\n747#1:1469\n829#1:1482\n839#1:1504\n848#1:1511\n894#1:1530\n917#1:1531\n1052#1:2038\n1061#1:2074\n1147#1:2229\n1156#1:2250\n1166#1:2271\n1212#1:2320\n1216#1:2323\n1259#1:2324\n1293#1:2325\n1391#1:2394\n828#1:1489\n879#1:1523\n1073#1:2086\n1087#1:2118\n1093#1:2140\n1108#1:2154\n1148#1:2235\n1157#1:2256\n1167#1:2284\n1195#1:2302\n1365#1:2376\n1401#1:2409\n679#1:1455,4\n704#1:1459,4\n714#1:1463,4\n849#1:1512,4\n1368#1:2382,4\n1392#1:2395,4\n754#1:1470\n754#1:1471,5\n754#1:1476\n1086#1:2101\n1086#1:2102,5\n1086#1:2107\n1366#1:2379,3\n1366#1:2386\n828#1:1492,7\n876#1:1516,3\n876#1:1527,3\n1073#1:2089,7\n1087#1:2121,7\n1091#1:2133,3\n1091#1:2144,3\n1148#1:2238,7\n1157#1:2259,7\n1173#1:2277,7\n1167#1:2287,7\n1195#1:2305,7\n1207#1:2313,7\n1383#1:2387,7\n1398#1:2402,3\n1398#1:2413,3\n879#1:1519,4\n879#1:1524,3\n1093#1:2136,4\n1093#1:2141,3\n1108#1:2150,4\n1108#1:2155,3\n1401#1:2405,4\n1401#1:2410,3\n925#1:1532,3\n925#1:1560\n925#1:1563\n974#1:1666,3\n974#1:1728\n974#1:1756\n925#1:1535,3\n925#1:1538,7\n925#1:1546,3\n925#1:1550,9\n925#1:1559\n942#1:1587,16\n942#1:1607,6\n959#1:1637,3\n959#1:1640,7\n959#1:1648,3\n959#1:1652,9\n959#1:1661\n974#1:1669,3\n974#1:1672,7\n974#1:1680,3\n974#1:1684,2\n979#1:1692,3\n979#1:1695,7\n979#1:1703,3\n979#1:1707,9\n979#1:1716\n974#1:1721,6\n974#1:1727\n979#1:1730,3\n979#1:1733,7\n979#1:1741,3\n979#1:1745,9\n979#1:1754\n988#1:1779,7\n988#1:1787,3\n988#1:1791,2\n988#1:1797,6\n994#1:1843,7\n994#1:1851,3\n994#1:1855,2\n994#1:1861,6\n1001#1:1907,16\n1001#1:1927,6\n1003#1:1953,7\n1003#1:1961,3\n1003#1:1965,2\n1003#1:1971,6\n1043#1:2009,3\n1043#1:2012,7\n1043#1:2020,3\n1043#1:2024,9\n1043#1:2033\n1057#1:2045,3\n1057#1:2048,7\n1057#1:2056,3\n1057#1:2060,9\n1057#1:2069\n1128#1:2184,16\n1128#1:2204,6\n1323#1:2333,3\n1323#1:2336,7\n1323#1:2344,3\n1323#1:2348,9\n1323#1:2357\n925#1:1545\n925#1:1549\n942#1:1572\n942#1:1576\n959#1:1647\n959#1:1651\n974#1:1679\n974#1:1683\n979#1:1702\n979#1:1706\n979#1:1740\n979#1:1744\n988#1:1765\n988#1:1769\n988#1:1786\n988#1:1790\n994#1:1829\n994#1:1833\n994#1:1850\n994#1:1854\n1001#1:1893\n1001#1:1897\n1003#1:1960\n1003#1:1964\n1028#1:1988\n1028#1:1992\n1043#1:2019\n1043#1:2023\n1057#1:2055\n1057#1:2059\n1128#1:2170\n1128#1:2174\n1323#1:2343\n1323#1:2347\n925#1:1561,2\n974#1:1729\n974#1:1755\n942#1:1564\n942#1:1580,5\n942#1:1614,6\n942#1:1630\n959#1:1631,6\n959#1:1662,4\n979#1:1686,6\n979#1:1717,4\n988#1:1757\n988#1:1773,4\n988#1:1804,6\n988#1:1820\n994#1:1821\n994#1:1837,4\n994#1:1868,6\n994#1:1884\n1001#1:1885\n1001#1:1901,4\n1001#1:1934,6\n1001#1:1950\n1043#1:2003,6\n1043#1:2034,4\n1057#1:2039,6\n1057#1:2070,4\n1128#1:2162\n1128#1:2178,4\n1128#1:2211,6\n1128#1:2227\n1323#1:2326\n1323#1:2327,6\n1323#1:2358,8\n942#1:1565\n942#1:1579\n942#1:1620,3\n942#1:1629\n988#1:1758\n988#1:1772\n988#1:1810,3\n988#1:1819\n994#1:1822\n994#1:1836\n994#1:1874,3\n994#1:1883\n1001#1:1886\n1001#1:1900\n1001#1:1940,3\n1001#1:1949\n1128#1:2163\n1128#1:2177\n1128#1:2217,3\n1128#1:2226\n942#1:1566,6\n942#1:1573,3\n942#1:1577,2\n942#1:1623,6\n988#1:1759,6\n988#1:1766,3\n988#1:1770,2\n988#1:1813,6\n994#1:1823,6\n994#1:1830,3\n994#1:1834,2\n994#1:1877,6\n1001#1:1887,6\n1001#1:1894,3\n1001#1:1898,2\n1001#1:1943,6\n1128#1:2164,6\n1128#1:2171,3\n1128#1:2175,2\n1128#1:2220,6\n942#1:1585,2\n942#1:1603,4\n942#1:1613\n988#1:1777,2\n988#1:1793,4\n988#1:1803\n994#1:1841,2\n994#1:1857,4\n994#1:1867\n1001#1:1905,2\n1001#1:1923,4\n1001#1:1933\n1003#1:1951,2\n1003#1:1967,4\n1003#1:1977\n1128#1:2182,2\n1128#1:2200,4\n1128#1:2210\n1019#1:1978\n1030#1:1995\n1028#1:1979,3\n1028#1:1982,6\n1028#1:1989,3\n1028#1:1993,2\n1028#1:1996,6\n1028#1:2002\n1086#1:2108\n1086#1:2109,4\n1102#1:2147,3\n1102#1:2158\n1126#1:2159,3\n1126#1:2228\n1397#1:2399,3\n1397#1:2416\n1212#1:2321,2\n1365#1:2366,9\n1365#1:2375\n1365#1:2377\n1365#1:2378\n*E\n"})
public final class s0 implements l1, p5, u4, g1, x3, androidx.compose.runtime.tooling.x {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f36344g3 = 8;
    private int H1;

    @NotNull
    private final d1 X;

    @NotNull
    private final androidx.compose.runtime.internal.t0 Y;

    @NotNull
    private final i0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f36345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i<?> f36346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f36347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f36348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<m5> f36349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w5 f36350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f36351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.collection.l2<s4> f36352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.collection.l2<s4> f36353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f36354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.changelist.a f36355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.changelist.a f36356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f36357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private androidx.collection.k2<Object, Object> f36358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36359o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private final CoroutineContext f36360p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final boolean f36361p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private Function2<? super c0, ? super Integer, Unit> f36362p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private t5 f36363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private b4 f36364t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private s0 f36365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36366w;

    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$setObserver$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,1447:1\n33#2:1448\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$setObserver$2\n*L\n736#1:1448\n*E\n"})
    public static final class a implements androidx.compose.runtime.tooling.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.tooling.o f36368b;

        a(androidx.compose.runtime.tooling.o oVar) {
            this.f36368b = oVar;
        }

        @Override // androidx.compose.runtime.tooling.p
        public void dispose() {
            Object obj = s0.this.f36348d;
            s0 s0Var = s0.this;
            androidx.compose.runtime.tooling.o oVar = this.f36368b;
            synchronized (obj) {
                try {
                    if (Intrinsics.areEqual(s0Var.I().b(), oVar)) {
                        s0Var.I().d(null);
                        int i10 = 7 ^ 0;
                        s0Var.I().e(false);
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public s0(@NotNull p0 p0Var, @NotNull i<?> iVar, @Nullable CoroutineContext coroutineContext) {
        this.f36345a = p0Var;
        this.f36346b = iVar;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f36347c = new AtomicReference<>(null);
        this.f36348d = new Object();
        int i10 = 0;
        int i11 = 1;
        Set<m5> setK = new androidx.collection.l2(i10, i11, defaultConstructorMarker).K();
        this.f36349e = setK;
        w5 w5Var = new w5();
        if (p0Var.e()) {
            w5Var.n();
        }
        if (p0Var.g()) {
            w5Var.p();
        }
        this.f36350f = w5Var;
        this.f36351g = androidx.compose.runtime.collection.h.g(null, 1, null);
        this.f36352h = new androidx.collection.l2<>(i10, i11, defaultConstructorMarker);
        this.f36353i = new androidx.collection.l2<>(i10, i11, defaultConstructorMarker);
        this.f36354j = androidx.compose.runtime.collection.h.g(null, 1, null);
        androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
        this.f36355k = aVar;
        androidx.compose.runtime.changelist.a aVar2 = new androidx.compose.runtime.changelist.a();
        this.f36356l = aVar2;
        this.f36357m = androidx.compose.runtime.collection.h.g(null, 1, null);
        this.f36358n = androidx.compose.runtime.collection.h.g(null, 1, null);
        d1 d1Var = new d1(null, false, p0Var, 3, null);
        this.X = d1Var;
        this.Y = new androidx.compose.runtime.internal.t0();
        i0 i0Var = new i0(iVar, p0Var, w5Var, setK, aVar, aVar2, d1Var, this);
        p0Var.u(i0Var);
        this.Z = i0Var;
        this.f36360p0 = coroutineContext;
        this.f36361p1 = p0Var instanceof c5;
        this.f36362p2 = r.f36325a.b();
    }

    private static /* synthetic */ void B() {
    }

    private final boolean C() {
        return this.Z.k1();
    }

    public static /* synthetic */ void d0() {
    }

    public static /* synthetic */ void g0() {
    }

    private final <T> T h0(Function0<? extends T> function0) {
        try {
            try {
                T tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                if (!this.f36349e.isEmpty()) {
                    androidx.compose.runtime.internal.t0 t0Var = this.Y;
                    try {
                        t0Var.r(this.f36349e, this.Z.p1());
                        t0Var.j();
                        kotlin.jvm.internal.h0.d(1);
                        t0Var.i();
                        kotlin.jvm.internal.h0.c(1);
                    } finally {
                        kotlin.jvm.internal.h0.d(1);
                        t0Var.i();
                        kotlin.jvm.internal.h0.c(1);
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            c0();
            throw th3;
        }
    }

    private final <T> T i0(Function1<? super androidx.compose.runtime.collection.h<s4, Object>, ? extends T> function1) {
        androidx.collection.k2<Object, Object> k2VarT0 = t0();
        try {
            return function1.invoke(androidx.compose.runtime.collection.h.d(k2VarT0));
        } catch (Throwable th2) {
            this.f36358n = k2VarT0;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x0026, LOOP:0: B:31:0x0065->B:45:0x00a8, LOOP_END, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0013, B:6:0x0018, B:14:0x002b, B:16:0x0031, B:20:0x0037, B:21:0x0040, B:23:0x0044, B:24:0x004d, B:26:0x0055, B:28:0x0059, B:31:0x0065, B:33:0x0075, B:35:0x0081, B:37:0x008d, B:41:0x009c, B:45:0x00a8, B:46:0x00ab, B:49:0x00b0), top: B:62:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[Catch: all -> 0x0026, EDGE_INSN: B:49:0x00b0->B:50:0x00b5 BREAK  A[LOOP:0: B:31:0x0065->B:45:0x00a8], TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0013, B:6:0x0018, B:14:0x002b, B:16:0x0031, B:20:0x0037, B:21:0x0040, B:23:0x0044, B:24:0x004d, B:26:0x0055, B:28:0x0059, B:31:0x0065, B:33:0x0075, B:35:0x0081, B:37:0x008d, B:41:0x009c, B:45:0x00a8, B:46:0x00ab, B:49:0x00b0), top: B:62:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0 A[SYNTHETIC] */
    private final u2 j0(s4 s4Var, g gVar, Object obj) {
        synchronized (this.f36348d) {
            try {
                s0 s0Var = this.f36365v;
                s0 s0Var2 = null;
                if (s0Var != null) {
                    if (!this.f36350f.M(this.f36366w, gVar)) {
                        s0Var = null;
                    }
                    s0Var2 = s0Var;
                }
                if (s0Var2 == null) {
                    if (v0(s4Var, obj)) {
                        return u2.IMMINENT;
                    }
                    if (obj != null && (obj instanceof q1)) {
                        Object objP = this.f36358n.p(s4Var);
                        if (objP != null) {
                            if (!(objP instanceof androidx.collection.l2)) {
                                if (objP != r5.f36336a) {
                                    androidx.compose.runtime.collection.h.a(this.f36358n, s4Var, obj);
                                    break;
                                }
                            } else {
                                androidx.collection.l2 l2Var = (androidx.collection.l2) objP;
                                Object[] objArr = l2Var.f12171b;
                                long[] jArr = l2Var.f12170a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    androidx.compose.runtime.collection.h.a(this.f36358n, s4Var, obj);
                                    break;
                                }
                                int i10 = 0;
                                loop0: while (true) {
                                    long j10 = jArr[i10];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i10 == length) {
                                            androidx.compose.runtime.collection.h.a(this.f36358n, s4Var, obj);
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        int i11 = 8;
                                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j10 & 255) < 128 && objArr[(i10 << 3) + i13] == r5.f36336a) {
                                                break loop0;
                                            }
                                            j10 >>= i11;
                                            i13++;
                                            i11 = i11;
                                        }
                                        if (i12 == i11) {
                                            if (i10 == length) {
                                                i10++;
                                            }
                                        }
                                        androidx.compose.runtime.collection.h.a(this.f36358n, s4Var, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            androidx.compose.runtime.collection.h.a(this.f36358n, s4Var, obj);
                            break;
                        }
                    } else {
                        androidx.compose.runtime.collection.h.s(this.f36358n, s4Var, r5.f36336a);
                    }
                }
                if (s0Var2 != null) {
                    return s0Var2.j0(s4Var, gVar, obj);
                }
                this.f36345a.o(this);
                return a0() ? u2.DEFERRED : u2.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void l0(Object obj) {
        Object objP = this.f36351g.p(obj);
        if (objP == null) {
            return;
        }
        if (!(objP instanceof androidx.collection.l2)) {
            s4 s4Var = (s4) objP;
            if (s4Var.x(obj) == u2.IMMINENT) {
                androidx.compose.runtime.collection.h.a(this.f36357m, obj, s4Var);
                return;
            }
            return;
        }
        androidx.collection.l2 l2Var = (androidx.collection.l2) objP;
        Object[] objArr = l2Var.f12171b;
        long[] jArr = l2Var.f12170a;
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
                        s4 s4Var2 = (s4) objArr[(i10 << 3) + i12];
                        if (s4Var2.x(obj) == u2.IMMINENT) {
                            androidx.compose.runtime.collection.h.a(this.f36357m, obj, s4Var2);
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

    private final void n(Object obj, boolean z10) {
        Object objP = this.f36351g.p(obj);
        if (objP == null) {
            return;
        }
        if (!(objP instanceof androidx.collection.l2)) {
            s4 s4Var = (s4) objP;
            if (androidx.compose.runtime.collection.h.o(this.f36357m, obj, s4Var) || s4Var.x(obj) == u2.IGNORED) {
                return;
            }
            if (!s4Var.y() || z10) {
                this.f36352h.C(s4Var);
                return;
            } else {
                this.f36353i.C(s4Var);
                return;
            }
        }
        androidx.collection.l2 l2Var = (androidx.collection.l2) objP;
        Object[] objArr = l2Var.f12171b;
        long[] jArr = l2Var.f12170a;
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
                        s4 s4Var2 = (s4) objArr[(i10 << 3) + i12];
                        if (!androidx.compose.runtime.collection.h.o(this.f36357m, obj, s4Var2) && s4Var2.x(obj) != u2.IGNORED) {
                            if (!s4Var2.y() || z10) {
                                this.f36352h.C(s4Var2);
                            } else {
                                this.f36353i.C(s4Var2);
                            }
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

    private final androidx.compose.runtime.tooling.o n0() {
        return this.X.a();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x025c A[LOOP:6: B:93:0x0202->B:110:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0379 A[LOOP:10: B:152:0x032c->B:170:0x0379, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x00d6 A[EDGE_INSN: B:193:0x00d6->B:37:0x00d6 BREAK  A[LOOP:2: B:23:0x007e->B:34:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0269 A[EDGE_INSN: B:201:0x0269->B:112:0x0269 BREAK  A[LOOP:6: B:93:0x0202->B:110:0x025c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0380 A[EDGE_INSN: B:207:0x0380->B:172:0x0380 BREAK  A[LOOP:10: B:152:0x032c->B:170:0x0379], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x019d A[EDGE_INSN: B:216:0x019d->B:74:0x019d BREAK  A[LOOP:13: B:61:0x0161->B:72:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[LOOP:2: B:23:0x007e->B:34:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0195 A[LOOP:13: B:61:0x0161->B:72:0x0195, LOOP_END] */
    private final void o(Set<? extends Object> set, boolean z10) {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        String str;
        long j13;
        boolean zE;
        long j14;
        long[] jArr2;
        int i10;
        long[] jArr3;
        int i11;
        int i12;
        long j15;
        boolean zR;
        int i13;
        long j16;
        long j17;
        char c11;
        long j18;
        int i14;
        int i15;
        Object obj = null;
        char c12 = 7;
        long j19 = -9187201950435737472L;
        int i16 = 8;
        if (set instanceof androidx.compose.runtime.collection.f) {
            androidx.collection.c3 c3VarC = ((androidx.compose.runtime.collection.f) set).c();
            Object[] objArr = c3VarC.f12171b;
            long[] jArr4 = c3VarC.f12170a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i17 = 0;
                j11 = 128;
                while (true) {
                    long j20 = jArr4[i17];
                    j12 = 255;
                    if ((((~j20) << c12) & j20 & j19) != j19) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j20 & 255) < 128) {
                                c11 = c12;
                                Object obj2 = objArr[(i17 << 3) + i19];
                                j18 = j19;
                                if (obj2 instanceof s4) {
                                    ((s4) obj2).x(obj);
                                    j17 = j20;
                                    i14 = length;
                                } else {
                                    n(obj2, z10);
                                    Object objP = this.f36354j.p(obj2);
                                    if (objP == null) {
                                        j17 = j20;
                                        i14 = length;
                                    } else if (objP instanceof androidx.collection.l2) {
                                        androidx.collection.l2 l2Var = (androidx.collection.l2) objP;
                                        Object[] objArr2 = l2Var.f12171b;
                                        long[] jArr5 = l2Var.f12170a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            j17 = j20;
                                            int i20 = 0;
                                            while (true) {
                                                long j21 = jArr5[i20];
                                                int i21 = i16;
                                                i14 = length;
                                                if ((((~j21) << c11) & j21 & j18) != j18) {
                                                    int i22 = 8 - ((~(i20 - length2)) >>> 31);
                                                    int i23 = 0;
                                                    while (i23 < i22) {
                                                        if ((j21 & 255) < 128) {
                                                            n((q1) objArr2[(i20 << 3) + i23], z10);
                                                        }
                                                        j21 >>= i21;
                                                        i23++;
                                                        i21 = i21;
                                                    }
                                                    if (i22 != i21) {
                                                        break;
                                                    }
                                                    if (i20 != length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    length = i14;
                                                    i16 = 8;
                                                } else if (i20 != length2) {
                                                    break;
                                                    break;
                                                } else {
                                                    i20++;
                                                    length = i14;
                                                    i16 = 8;
                                                }
                                            }
                                        } else {
                                            j17 = j20;
                                            i14 = length;
                                        }
                                    } else {
                                        j17 = j20;
                                        i14 = length;
                                        n((q1) objP, z10);
                                    }
                                    Unit unit = Unit.f312394a;
                                }
                                i15 = 8;
                            } else {
                                j17 = j20;
                                c11 = c12;
                                j18 = j19;
                                i14 = length;
                                i15 = i16;
                            }
                            i19++;
                            length = i14;
                            i16 = i15;
                            c12 = c11;
                            j19 = j18;
                            j20 = j17 >> i15;
                            obj = null;
                        }
                        c10 = c12;
                        j10 = j19;
                        int i24 = length;
                        if (i18 != i16) {
                            break;
                        } else {
                            length = i24;
                        }
                    } else {
                        c10 = c12;
                        j10 = j19;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    c12 = c10;
                    j19 = j10;
                    obj = null;
                    i16 = 8;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                j11 = 128;
                j12 = 255;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
            for (Object obj3 : set) {
                if (obj3 instanceof s4) {
                    ((s4) obj3).x(null);
                } else {
                    n(obj3, z10);
                    Object objP2 = this.f36354j.p(obj3);
                    if (objP2 != null) {
                        if (objP2 instanceof androidx.collection.l2) {
                            androidx.collection.l2 l2Var2 = (androidx.collection.l2) objP2;
                            Object[] objArr3 = l2Var2.f12171b;
                            long[] jArr6 = l2Var2.f12170a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j22 = jArr6[i25];
                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i25 != length3) {
                                            break;
                                            break;
                                        }
                                        i25++;
                                    } else {
                                        int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j22 & 255) < 128) {
                                                n((q1) objArr3[(i25 << 3) + i27], z10);
                                            }
                                            j22 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        } else if (i25 != length3) {
                                            break;
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                        } else {
                            n((q1) objP2, z10);
                        }
                    }
                    Unit unit2 = Unit.f312394a;
                }
            }
        }
        androidx.collection.l2<s4> l2Var3 = this.f36353i;
        androidx.collection.l2<s4> l2Var4 = this.f36352h;
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!z10 || !l2Var3.s()) {
            if (l2Var4.s()) {
                androidx.collection.k2<Object, Object> k2Var = this.f36351g;
                long[] jArr7 = k2Var.f12130a;
                int length4 = jArr7.length - 2;
                if (length4 >= 0) {
                    int i28 = 0;
                    while (true) {
                        long j23 = jArr7[i28];
                        if ((((~j23) << c10) & j23 & j10) != j10) {
                            int i29 = 8 - ((~(i28 - length4)) >>> 31);
                            int i30 = 0;
                            while (i30 < i29) {
                                if ((j23 & j12) < j11) {
                                    int i31 = (i28 << 3) + i30;
                                    Object obj4 = k2Var.f12131b[i31];
                                    Object obj5 = k2Var.f12132c[i31];
                                    if (obj5 instanceof androidx.collection.l2) {
                                        Intrinsics.checkNotNull(obj5, str2);
                                        androidx.collection.l2 l2Var5 = (androidx.collection.l2) obj5;
                                        Object[] objArr4 = l2Var5.f12171b;
                                        long[] jArr8 = l2Var5.f12170a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                long j24 = jArr8[i32];
                                                j13 = j23;
                                                if ((((~j24) << c10) & j24 & j10) != j10) {
                                                    int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j24 & j12) < j11) {
                                                            j14 = j24;
                                                            int i35 = (i32 << 3) + i34;
                                                            if (l2Var4.e((s4) objArr4[i35])) {
                                                                l2Var5.n0(i35);
                                                            }
                                                        } else {
                                                            j14 = j24;
                                                        }
                                                        i34++;
                                                        j24 = j14 >> 8;
                                                    }
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                    if (i32 != length5) {
                                                        break;
                                                    }
                                                    i32++;
                                                    j23 = j13;
                                                } else if (i32 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i32++;
                                                    j23 = j13;
                                                }
                                            }
                                        } else {
                                            j13 = j23;
                                        }
                                        zE = l2Var5.r();
                                    } else {
                                        j13 = j23;
                                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        zE = l2Var4.e((s4) obj5);
                                    }
                                    if (zE) {
                                        k2Var.o0(i31);
                                    }
                                } else {
                                    jArr7 = jArr7;
                                    str2 = str2;
                                    j13 = j23;
                                }
                                j23 = j13 >> 8;
                                i30++;
                                jArr7 = jArr7;
                                str2 = str2;
                            }
                            jArr = jArr7;
                            str = str2;
                            if (i29 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr7;
                            str = str2;
                        }
                        if (i28 == length4) {
                            break;
                        }
                        i28++;
                        jArr7 = jArr;
                        str2 = str;
                    }
                }
                q();
                l2Var4.L();
                return;
            }
            return;
        }
        androidx.collection.k2<Object, Object> k2Var2 = this.f36351g;
        long[] jArr9 = k2Var2.f12130a;
        int length6 = jArr9.length - 2;
        if (length6 >= 0) {
            int i36 = 0;
            while (true) {
                long j25 = jArr9[i36];
                if ((((~j25) << c10) & j25 & j10) != j10) {
                    int i37 = 8 - ((~(i36 - length6)) >>> 31);
                    int i38 = 0;
                    while (i38 < i37) {
                        if ((j25 & j12) < j11) {
                            int i39 = (i36 << 3) + i38;
                            Object obj6 = k2Var2.f12131b[i39];
                            Object obj7 = k2Var2.f12132c[i39];
                            if (obj7 instanceof androidx.collection.l2) {
                                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.l2 l2Var6 = (androidx.collection.l2) obj7;
                                Object[] objArr5 = l2Var6.f12171b;
                                long[] jArr10 = l2Var6.f12170a;
                                jArr3 = jArr9;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    j15 = j25;
                                    int i40 = 0;
                                    while (true) {
                                        long j26 = jArr10[i40];
                                        i11 = length6;
                                        i12 = i36;
                                        if ((((~j26) << c10) & j26 & j10) != j10) {
                                            int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                            for (int i42 = 0; i42 < i41; i42 = i13 + 1) {
                                                if ((j26 & j12) < j11) {
                                                    i13 = i42;
                                                    int i43 = (i40 << 3) + i13;
                                                    j16 = j26;
                                                    s4 s4Var = (s4) objArr5[i43];
                                                    if (l2Var3.e(s4Var) || l2Var4.e(s4Var)) {
                                                        l2Var6.n0(i43);
                                                    }
                                                } else {
                                                    i13 = i42;
                                                    j16 = j26;
                                                }
                                                j26 = j16 >> 8;
                                            }
                                            if (i41 != 8) {
                                                break;
                                            }
                                            if (i40 != length7) {
                                                break;
                                            }
                                            i40++;
                                            length6 = i11;
                                            i36 = i12;
                                        } else if (i40 != length7) {
                                            break;
                                            break;
                                        } else {
                                            i40++;
                                            length6 = i11;
                                            i36 = i12;
                                        }
                                    }
                                } else {
                                    i11 = length6;
                                    i12 = i36;
                                    j15 = j25;
                                }
                                zR = l2Var6.r();
                            } else {
                                jArr3 = jArr9;
                                i11 = length6;
                                i12 = i36;
                                j15 = j25;
                                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                s4 s4Var2 = (s4) obj7;
                                zR = l2Var3.e(s4Var2) || l2Var4.e(s4Var2);
                            }
                            if (zR) {
                                k2Var2.o0(i39);
                            }
                        } else {
                            jArr3 = jArr9;
                            i11 = length6;
                            i12 = i36;
                            j15 = j25;
                        }
                        j25 = j15 >> 8;
                        i38++;
                        length6 = i11;
                        jArr9 = jArr3;
                        i36 = i12;
                    }
                    jArr2 = jArr9;
                    int i44 = length6;
                    int i45 = i36;
                    if (i37 != 8) {
                        break;
                    }
                    length6 = i44;
                    i10 = i45;
                } else {
                    jArr2 = jArr9;
                    i10 = i36;
                }
                if (i10 == length6) {
                    break;
                }
                i36 = i10 + 1;
                jArr9 = jArr2;
            }
        }
        l2Var3.L();
        q();
    }

    private final void p(androidx.compose.runtime.changelist.a aVar) {
        i<?> iVarJ;
        androidx.compose.runtime.internal.t0 t0VarK;
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zR;
        long[] jArr3;
        this.Y.r(this.f36349e, this.Z.p1());
        try {
            if (aVar.f()) {
                try {
                    if (this.f36356l.f() && this.f36364t == null) {
                        this.Y.j();
                    }
                } finally {
                    this.Y.i();
                }
            } else {
                androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
                Object objA = b1Var.a("Compose:applyChanges");
                try {
                    b4 b4Var = this.f36364t;
                    if (b4Var == null || (iVarJ = b4Var.j()) == null) {
                        iVarJ = this.f36346b;
                    }
                    b4 b4Var2 = this.f36364t;
                    if (b4Var2 == null || (t0VarK = b4Var2.k()) == null) {
                        t0VarK = this.Y;
                    }
                    iVarJ.f();
                    z5 z5VarA0 = this.f36350f.a0();
                    int i11 = 0;
                    try {
                        aVar.d(iVarJ, z5VarA0, t0VarK, this.Z.p1());
                        Unit unit = Unit.f312394a;
                        z5VarA0.M(true);
                        iVarJ.c();
                        b1Var.b(objA);
                        this.Y.m();
                        this.Y.n();
                        if (this.f36359o) {
                            Object objA2 = b1Var.a("Compose:unobserve");
                            try {
                                this.f36359o = false;
                                androidx.collection.k2<Object, Object> k2Var = this.f36351g;
                                long[] jArr4 = k2Var.f12130a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j12 = jArr4[i12];
                                        char c11 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = i11;
                                            while (i15 < i14) {
                                                if ((j12 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    c10 = c11;
                                                    Object obj = k2Var.f12131b[i16];
                                                    Object obj2 = k2Var.f12132c[i16];
                                                    j11 = j13;
                                                    if (obj2 instanceof androidx.collection.l2) {
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        androidx.collection.l2 l2Var = (androidx.collection.l2) obj2;
                                                        Object[] objArr = l2Var.f12171b;
                                                        long[] jArr5 = l2Var.f12170a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j10 = j12;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            while (true) {
                                                                long j14 = jArr5[i18];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j14) << c10) & j14 & j11) != j11) {
                                                                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                    int i20 = 0;
                                                                    while (i20 < i19) {
                                                                        if ((j14 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i21 = (i18 << 3) + i20;
                                                                            if (!((s4) objArr2[i21]).w()) {
                                                                                l2Var.n0(i21);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j14 >>= i17;
                                                                        i20++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i19 != i17) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i18 == length2) {
                                                                    break;
                                                                }
                                                                i18++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i17 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j10 = j12;
                                                        }
                                                        zR = l2Var.r();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j10 = j12;
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zR = !((s4) obj2).w();
                                                    }
                                                    if (zR) {
                                                        k2Var.o0(i16);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j10 = j12;
                                                    c10 = c11;
                                                    j11 = j13;
                                                    i10 = i13;
                                                }
                                                j12 = j10 >> i10;
                                                i15++;
                                                i13 = i10;
                                                c11 = c10;
                                                j13 = j11;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        jArr4 = jArr;
                                        i11 = 0;
                                    }
                                }
                                q();
                                Unit unit2 = Unit.f312394a;
                                androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                            } catch (Throwable th2) {
                                androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                                throw th2;
                            }
                        }
                        try {
                            if (this.f36356l.f() && this.f36364t == null) {
                                this.Y.j();
                            }
                        } finally {
                            this.Y.i();
                        }
                    } catch (Throwable th3) {
                        z5VarA0.M(false);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    androidx.compose.runtime.internal.b1.f35891a.b(objA);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                if (this.f36356l.f() && this.f36364t == null) {
                    this.Y.j();
                }
                throw th5;
            } finally {
                this.Y.i();
            }
        }
    }

    private final void q() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zR;
        long[] jArr3;
        int i12;
        int i13;
        androidx.collection.k2<Object, Object> k2Var = this.f36354j;
        long[] jArr4 = k2Var.f12130a;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = k2Var.f12131b[i18];
                            Object obj2 = k2Var.f12132c[i18];
                            if (obj2 instanceof androidx.collection.l2) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.l2 l2Var = (androidx.collection.l2) obj2;
                                Object[] objArr = l2Var.f12171b;
                                long[] jArr5 = l2Var.f12170a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!androidx.compose.runtime.collection.h.h(this.f36351g, (q1) objArr[i24])) {
                                                        l2Var.n0(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zR = l2Var.r();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zR = !androidx.compose.runtime.collection.h.h(this.f36351g, (q1) obj2);
                            }
                            if (zR) {
                                k2Var.o0(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        if (!this.f36353i.s()) {
            return;
        }
        androidx.collection.l2<s4> l2Var2 = this.f36353i;
        Object[] objArr2 = l2Var2.f12171b;
        long[] jArr6 = l2Var2.f12170a;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((s4) objArr2[i28]).y()) {
                            l2Var2.n0(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    private final boolean r() {
        boolean z10;
        synchronized (this.f36348d) {
            try {
                z10 = true;
                if (this.H1 != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.H1 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private final void s(Function2<? super c0, ? super Integer, Unit> function2) {
        this.f36362p2 = function2;
        this.f36345a.a(this, function2);
    }

    private final a4 t(boolean z10, Function2<? super c0, ? super Integer, Unit> function2) {
        if (!(this.f36364t == null)) {
            f4.e("A pausable composition is in progress");
        }
        b4 b4Var = new b4(this, this.f36345a, this.Z, this.f36349e, function2, z10, this.f36346b, this.f36348d);
        this.f36364t = b4Var;
        return b4Var;
    }

    private final androidx.collection.k2<Object, Object> t0() {
        androidx.collection.k2<Object, Object> k2Var = this.f36358n;
        this.f36358n = androidx.compose.runtime.collection.h.g(null, 1, null);
        return k2Var;
    }

    private final void u(Function2<? super c0, ? super Integer, Unit> function2) {
        this.Z.o2();
        s(function2);
        this.Z.a1();
    }

    private final <T> T u0(Function0<? extends T> function0) {
        try {
            T tInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            if (!this.f36349e.isEmpty()) {
                androidx.compose.runtime.internal.t0 t0Var = this.Y;
                try {
                    t0Var.r(this.f36349e, this.Z.p1());
                    t0Var.j();
                    kotlin.jvm.internal.h0.d(1);
                    t0Var.i();
                    kotlin.jvm.internal.h0.c(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    t0Var.i();
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    private final boolean v0(s4 s4Var, Object obj) {
        return a0() && this.Z.q2(s4Var, obj);
    }

    private final void w() {
        Object andSet = this.f36347c.getAndSet(t0.f36635a);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, t0.f36635a)) {
                m0.z("pending composition has not been applied");
                throw new kotlin.a0();
            }
            if (andSet instanceof Set) {
                o((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                m0.z("corrupt pendingModifications drain: " + this.f36347c);
                throw new kotlin.a0();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                o(set, true);
            }
        }
    }

    private final void x() {
        Object andSet = this.f36347c.getAndSet(null);
        if (!Intrinsics.areEqual(andSet, t0.f36635a)) {
            if (andSet instanceof Set) {
                o((Set) andSet, false);
                return;
            }
            if (!(andSet instanceof Object[])) {
                if (andSet == null) {
                    m0.z("calling recordModificationsOf and applyChanges concurrently is not supported");
                    throw new kotlin.a0();
                }
                m0.z("corrupt pendingModifications drain: " + this.f36347c);
                throw new kotlin.a0();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                o(set, false);
            }
        }
    }

    private final void x0(w5 w5Var) {
        Object[] objArrG = w5Var.G();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArrG) {
            s4 s4Var = obj instanceof s4 ? (s4) obj : null;
            if (s4Var != null) {
                arrayList.add(s4Var);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4 s4Var2 = (s4) arrayList.get(i10);
            g gVarH = s4Var2.h();
            if (gVarH != null && !w5Var.s0(gVarH.d(w5Var)).contains(s4Var2)) {
                f4.e("Misaligned anchor " + gVarH + " in scope " + s4Var2 + " encountered, scope found at " + ArraysKt.indexOf((s4[]) w5Var.G(), s4Var2));
            }
        }
    }

    private final void y() {
        Object andSet = this.f36347c.getAndSet(SetsKt.emptySet());
        if (Intrinsics.areEqual(andSet, t0.f36635a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            o((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            m0.z("corrupt pendingModifications drain: " + this.f36347c);
            throw new kotlin.a0();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            o(set, false);
        }
    }

    private final void z() {
        String str;
        int i10 = this.H1;
        if (!(i10 == 0)) {
            if (i10 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i10 != 2) {
                str = i10 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            f4.e(str);
        }
        if (this.f36364t == null) {
            return;
        }
        f4.e("A pausable composition is in progress");
    }

    @NotNull
    public final List<Pair<s4, Object>> A(@NotNull g gVar) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        int i11;
        boolean zR;
        Object obj;
        Object obj2;
        long j12;
        int i12;
        if (androidx.compose.runtime.collection.h.m(this.f36358n) <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        w5 w5Var = this.f36350f;
        androidx.collection.k2<Object, Object> k2Var = this.f36358n;
        long[] jArr3 = k2Var.f12130a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr3[i13];
                char c11 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j13 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            c10 = c11;
                            Object obj3 = k2Var.f12131b[i17];
                            j11 = j14;
                            Object obj4 = k2Var.f12132c[i17];
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj4 instanceof androidx.collection.l2) {
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.l2 l2Var = (androidx.collection.l2) obj4;
                                Object[] objArr = l2Var.f12171b;
                                int i18 = i14;
                                long[] jArr4 = l2Var.f12170a;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                j10 = j13;
                                if (length2 >= 0) {
                                    Object obj5 = obj3;
                                    int i19 = 0;
                                    while (true) {
                                        long j15 = jArr4[i19];
                                        Object[] objArr2 = objArr;
                                        i10 = i16;
                                        if ((((~j15) << c10) & j15 & j11) != j11) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j15 & 255) < 128) {
                                                    obj2 = obj5;
                                                    int i22 = (i19 << 3) + i21;
                                                    j12 = j15;
                                                    Object obj6 = objArr2[i22];
                                                    s4 s4Var = (s4) obj2;
                                                    i12 = i21;
                                                    g gVarH = s4Var.h();
                                                    if (gVarH != null && w5Var.O(gVar, gVarH)) {
                                                        arrayList.add(TuplesKt.to(s4Var, obj6));
                                                        l2Var.n0(i22);
                                                    }
                                                } else {
                                                    obj2 = obj5;
                                                    j12 = j15;
                                                    i12 = i21;
                                                }
                                                j15 = j12 >> i18;
                                                i21 = i12 + 1;
                                                obj5 = obj2;
                                            }
                                            obj = obj5;
                                            if (i20 != i18) {
                                                break;
                                            }
                                        } else {
                                            obj = obj5;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i16 = i10;
                                        objArr = objArr2;
                                        obj5 = obj;
                                        i18 = 8;
                                    }
                                } else {
                                    i10 = i16;
                                }
                                zR = l2Var.r();
                            } else {
                                jArr2 = jArr3;
                                j10 = j13;
                                i10 = i16;
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                s4 s4Var2 = (s4) obj3;
                                g gVarH2 = s4Var2.h();
                                if (gVarH2 == null || !w5Var.O(gVar, gVarH2)) {
                                    zR = false;
                                } else {
                                    arrayList.add(TuplesKt.to(s4Var2, obj4));
                                    zR = true;
                                }
                            }
                            if (zR) {
                                k2Var.o0(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            j10 = j13;
                            c10 = c11;
                            j11 = j14;
                            i10 = i16;
                            i11 = i14;
                        }
                        i16 = i10 + 1;
                        i14 = i11;
                        j13 = j10 >> i11;
                        c11 = c10;
                        j14 = j11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    @NotNull
    public final Function2<c0, Integer, Unit> D() {
        return this.f36362p2;
    }

    @NotNull
    public final i0 E() {
        return this.Z;
    }

    @lm.n
    @NotNull
    public final List<s4> F() {
        return CollectionsKt.toList(this.f36353i.d());
    }

    @lm.n
    @NotNull
    public final Set<Object> G() {
        return this.f36354j.e().keySet();
    }

    @lm.n
    @NotNull
    public final Set<Object> H() {
        return this.f36351g.e().keySet();
    }

    @NotNull
    public final d1 I() {
        return this.X;
    }

    @lm.n
    @NotNull
    public final p0 J() {
        return this.f36345a;
    }

    public final boolean K() {
        return this.f36359o;
    }

    @Override // androidx.compose.runtime.l1
    public void L() {
        synchronized (this.f36348d) {
            try {
                for (Object obj : this.f36350f.G()) {
                    s4 s4Var = obj instanceof s4 ? (s4) obj : null;
                    if (s4Var != null) {
                        s4Var.invalidate();
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void M(@NotNull h3 h3Var) {
        androidx.compose.runtime.internal.t0 t0Var = this.Y;
        try {
            t0Var.r(this.f36349e, this.Z.p1());
            z5 z5VarA0 = h3Var.f().a0();
            try {
                m0.o0(z5VarA0, this.Y);
                Unit unit = Unit.f312394a;
                z5VarA0.M(true);
                t0Var.m();
                t0Var.i();
            } catch (Throwable th2) {
                z5VarA0.M(false);
                throw th2;
            }
        } catch (Throwable th3) {
            t0Var.i();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // androidx.compose.runtime.l1
    public boolean N(@NotNull Set<? extends Object> set) {
        if (set instanceof androidx.compose.runtime.collection.f) {
            androidx.collection.c3 c3VarC = ((androidx.compose.runtime.collection.f) set).c();
            Object[] objArr = c3VarC.f12171b;
            long[] jArr = c3VarC.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (androidx.compose.runtime.collection.h.h(this.f36351g, obj) || androidx.compose.runtime.collection.h.h(this.f36354j, obj)) {
                                    break loop0;
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
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (androidx.compose.runtime.collection.h.h(this.f36351g, obj2) || androidx.compose.runtime.collection.h.h(this.f36354j, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.l1
    public void O() {
        synchronized (this.f36348d) {
            try {
                this.Z.K0();
                if (!this.f36349e.isEmpty()) {
                    androidx.compose.runtime.internal.t0 t0Var = this.Y;
                    try {
                        t0Var.r(this.f36349e, this.Z.p1());
                        t0Var.j();
                        t0Var.i();
                    } catch (Throwable th2) {
                        t0Var.i();
                        throw th2;
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th3) {
                try {
                    if (!this.f36349e.isEmpty()) {
                        androidx.compose.runtime.internal.t0 t0Var2 = this.Y;
                        try {
                            t0Var2.r(this.f36349e, this.Z.p1());
                            t0Var2.j();
                            t0Var2.i();
                        } catch (Throwable th4) {
                            t0Var2.i();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    try {
                        c0();
                        throw th5;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void P(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        try {
            synchronized (this.f36348d) {
                try {
                    w();
                    androidx.collection.k2<Object, Object> k2VarT0 = t0();
                    try {
                        this.Z.N0(k2VarT0, function2, this.f36363s);
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        this.f36358n = k2VarT0;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (!this.f36349e.isEmpty()) {
                    androidx.compose.runtime.internal.t0 t0Var = this.Y;
                    try {
                        t0Var.r(this.f36349e, this.Z.p1());
                        t0Var.j();
                        t0Var.i();
                    } catch (Throwable th5) {
                        t0Var.i();
                        throw th5;
                    }
                }
                throw th4;
            } catch (Throwable th6) {
                c0();
                throw th6;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void Q() {
        synchronized (this.f36348d) {
            try {
                if (this.f36356l.g()) {
                    p(this.f36356l);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                try {
                    if (!this.f36349e.isEmpty()) {
                        androidx.compose.runtime.internal.t0 t0Var = this.Y;
                        try {
                            t0Var.r(this.f36349e, this.Z.p1());
                            t0Var.j();
                        } finally {
                            t0Var.i();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        c0();
                        throw th3;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void R(@NotNull List<Pair<i3, i3>> list) {
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!Intrinsics.areEqual(list.get(i10).getFirst().b(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            m0.y("Check failed");
        }
        try {
            this.Z.e(list);
            Unit unit = Unit.f312394a;
        } catch (Throwable th2) {
            try {
                if (!this.f36349e.isEmpty()) {
                    androidx.compose.runtime.internal.t0 t0Var = this.Y;
                    try {
                        t0Var.r(this.f36349e, this.Z.p1());
                        t0Var.j();
                        t0Var.i();
                    } catch (Throwable th3) {
                        t0Var.i();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                c0();
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    @Nullable
    public t5 S(@Nullable t5 t5Var) {
        t5 t5Var2 = this.f36363s;
        this.f36363s = t5Var;
        return t5Var2;
    }

    @Override // androidx.compose.runtime.l1
    public <R> R T(@Nullable l1 l1Var, int i10, @NotNull Function0<? extends R> function0) {
        if (l1Var == null || Intrinsics.areEqual(l1Var, this) || i10 < 0) {
            return function0.invoke();
        }
        this.f36365v = (s0) l1Var;
        this.f36366w = i10;
        try {
            R rInvoke = function0.invoke();
            this.f36365v = null;
            this.f36366w = 0;
            return rInvoke;
        } catch (Throwable th2) {
            this.f36365v = null;
            this.f36366w = 0;
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.l1
    public boolean U() {
        boolean zR1;
        synchronized (this.f36348d) {
            zR1 = this.Z.r1();
        }
        return zR1;
    }

    @Override // androidx.compose.runtime.l1
    public boolean V() {
        synchronized (this.f36348d) {
            try {
                b4 b4Var = this.f36364t;
                if (b4Var != null && !b4Var.m()) {
                    b4Var.o();
                    return false;
                }
                w();
                try {
                    androidx.collection.k2<Object, Object> k2VarT0 = t0();
                    try {
                        boolean zM1 = this.Z.M1(k2VarT0, this.f36363s);
                        if (!zM1) {
                            x();
                        }
                        return zM1;
                    } catch (Throwable th2) {
                        this.f36358n = k2VarT0;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        if (!this.f36349e.isEmpty()) {
                            androidx.compose.runtime.internal.t0 t0Var = this.Y;
                            try {
                                t0Var.r(this.f36349e, this.Z.p1());
                                t0Var.j();
                            } finally {
                                t0Var.i();
                            }
                        }
                        throw th3;
                    } catch (Throwable th4) {
                        c0();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void W() {
        synchronized (this.f36348d) {
            try {
                if (!a0()) {
                    this.Z.F2();
                    this.f36350f.z0();
                    x0(this.f36350f);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void X(@NotNull Function0<Unit> function0) {
        this.Z.K1(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.l1
    public void Y(@NotNull Set<? extends Object> set) {
        Object obj;
        Object objPlus;
        do {
            obj = this.f36347c.get();
            if (obj == null || Intrinsics.areEqual(obj, t0.f36635a)) {
                objPlus = set;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f36347c).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, set);
            }
        } while (!androidx.compose.animation.core.z1.a(this.f36347c, obj, objPlus));
        if (obj == null) {
            synchronized (this.f36348d) {
                x();
                Unit unit = Unit.f312394a;
            }
        }
    }

    @Override // androidx.compose.runtime.l1
    public void Z() {
        synchronized (this.f36348d) {
            try {
                p(this.f36355k);
                x();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                try {
                    if (!this.f36349e.isEmpty()) {
                        androidx.compose.runtime.internal.t0 t0Var = this.Y;
                        try {
                            t0Var.r(this.f36349e, this.Z.p1());
                            t0Var.j();
                            t0Var.i();
                        } catch (Throwable th3) {
                            t0Var.i();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    c0();
                    throw th4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.l1, androidx.compose.runtime.u4
    public void a(@NotNull Object obj) {
        s4 s4VarN1;
        int i10;
        int i11;
        if (C() || (s4VarN1 = this.Z.n1()) == null) {
            return;
        }
        int i12 = 1;
        s4VarN1.S(true);
        boolean zB = s4VarN1.B(obj);
        androidx.compose.runtime.tooling.o oVarN0 = n0();
        if (oVarN0 != null) {
            oVarN0.d(s4VarN1, obj);
        }
        if (zB) {
            return;
        }
        if (obj instanceof androidx.compose.runtime.snapshots.d1) {
            androidx.compose.runtime.snapshots.i.a aVar = androidx.compose.runtime.snapshots.i.f36500b;
            ((androidx.compose.runtime.snapshots.d1) obj).b(androidx.compose.runtime.snapshots.i.b(1));
        }
        androidx.compose.runtime.collection.h.a(this.f36351g, obj, s4VarN1);
        if (obj instanceof q1) {
            q1<?> q1Var = (q1) obj;
            q1.a<?> aVarD = q1Var.D();
            androidx.compose.runtime.collection.h.q(this.f36354j, obj);
            androidx.collection.q2<androidx.compose.runtime.snapshots.c1> q2VarA = aVarD.a();
            Object[] objArr = q2VarA.f12437b;
            long[] jArr = q2VarA.f12436a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr[i13];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j10 & 255) < 128) {
                                i11 = i12;
                                androidx.compose.runtime.snapshots.c1 c1Var = (androidx.compose.runtime.snapshots.c1) objArr[(i13 << 3) + i16];
                                if (c1Var instanceof androidx.compose.runtime.snapshots.d1) {
                                    androidx.compose.runtime.snapshots.i.a aVar2 = androidx.compose.runtime.snapshots.i.f36500b;
                                    ((androidx.compose.runtime.snapshots.d1) c1Var).b(androidx.compose.runtime.snapshots.i.b(i11));
                                }
                                androidx.compose.runtime.collection.h.a(this.f36354j, c1Var, obj);
                            } else {
                                i11 = i12;
                                i14 = i14;
                            }
                            j10 >>= i14;
                            i16++;
                            i12 = i11;
                            i14 = i14;
                        }
                        i10 = i12;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    i12 = i10;
                }
            }
            s4VarN1.A(q1Var, aVarD.d());
        }
    }

    @Override // androidx.compose.runtime.l1
    public boolean a0() {
        return this.Z.C1();
    }

    @Override // androidx.compose.runtime.x3
    @NotNull
    public a4 b(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        return t(r(), function2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[Catch: all -> 0x0050, LOOP:0: B:11:0x0020->B:23:0x005a, LOOP_END, TryCatch #0 {all -> 0x0050, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x0020, B:13:0x0030, B:15:0x003c, B:17:0x0045, B:20:0x0052, B:23:0x005a, B:24:0x005d, B:25:0x0062), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[EDGE_INSN: B:33:0x0062->B:25:0x0062 BREAK  A[LOOP:0: B:11:0x0020->B:23:0x005a], SYNTHETIC] */
    @Override // androidx.compose.runtime.l1
    public void b0(@NotNull Object obj) {
        synchronized (this.f36348d) {
            try {
                l0(obj);
                Object objP = this.f36354j.p(obj);
                if (objP != null) {
                    if (objP instanceof androidx.collection.l2) {
                        androidx.collection.l2 l2Var = (androidx.collection.l2) objP;
                        Object[] objArr = l2Var.f12171b;
                        long[] jArr = l2Var.f12170a;
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
                                            l0((q1) objArr[(i10 << 3) + i12]);
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
                    } else {
                        l0((q1) objP);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.u4
    public void c(@NotNull s4 s4Var) {
        this.f36359o = true;
        androidx.compose.runtime.tooling.o oVarN0 = n0();
        if (oVarN0 != null) {
            oVarN0.f(s4Var);
        }
    }

    @Override // androidx.compose.runtime.l1
    public void c0() {
        this.f36347c.set(null);
        this.f36355k.c();
        this.f36356l.c();
        if (this.f36349e.isEmpty()) {
            return;
        }
        androidx.compose.runtime.internal.t0 t0Var = this.Y;
        try {
            t0Var.r(this.f36349e, this.Z.p1());
            t0Var.j();
            t0Var.i();
        } catch (Throwable th2) {
            t0Var.i();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.p5
    public void d(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        r();
        z();
        u(function2);
    }

    @Override // androidx.compose.runtime.p5
    public void deactivate() {
        synchronized (this.f36348d) {
            try {
                if (!(this.f36364t == null)) {
                    f4.e("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.f36350f.F() > 0;
                if (z10 || !this.f36349e.isEmpty()) {
                    androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
                    Object objA = b1Var.a("Compose:deactivate");
                    try {
                        androidx.compose.runtime.internal.t0 t0Var = this.Y;
                        try {
                            t0Var.r(this.f36349e, this.Z.p1());
                            if (z10) {
                                this.f36346b.f();
                                z5 z5VarA0 = this.f36350f.a0();
                                try {
                                    m0.A(z5VarA0, this.Y);
                                    Unit unit = Unit.f312394a;
                                    z5VarA0.M(true);
                                    this.f36346b.c();
                                    t0Var.m();
                                } catch (Throwable th2) {
                                    z5VarA0.M(false);
                                    throw th2;
                                }
                            }
                            t0Var.j();
                            t0Var.i();
                            Unit unit2 = Unit.f312394a;
                            b1Var.b(objA);
                        } catch (Throwable th3) {
                            t0Var.i();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        androidx.compose.runtime.internal.b1.f35891a.b(objA);
                        throw th4;
                    }
                }
                androidx.compose.runtime.collection.h.e(this.f36351g);
                androidx.compose.runtime.collection.h.e(this.f36354j);
                androidx.compose.runtime.collection.h.e(this.f36358n);
                this.f36355k.c();
                this.f36356l.c();
                this.Z.T0();
                this.H1 = 1;
                Unit unit3 = Unit.f312394a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // androidx.compose.runtime.o0
    public void dispose() {
        synchronized (this.f36348d) {
            try {
                if (this.Z.C1()) {
                    f4.e("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.H1 != 3) {
                    this.H1 = 3;
                    this.f36362p2 = r.f36325a.a();
                    androidx.compose.runtime.changelist.a aVarO1 = this.Z.o1();
                    if (aVarO1 != null) {
                        p(aVarO1);
                    }
                    boolean z10 = this.f36350f.F() > 0;
                    if (z10 || !this.f36349e.isEmpty()) {
                        androidx.compose.runtime.internal.t0 t0Var = this.Y;
                        try {
                            t0Var.r(this.f36349e, this.Z.p1());
                            if (z10) {
                                this.f36346b.f();
                                z5 z5VarA0 = this.f36350f.a0();
                                try {
                                    m0.o0(z5VarA0, this.Y);
                                    Unit unit = Unit.f312394a;
                                    z5VarA0.M(true);
                                    this.f36346b.clear();
                                    this.f36346b.c();
                                    t0Var.m();
                                } catch (Throwable th2) {
                                    z5VarA0.M(false);
                                    throw th2;
                                }
                            }
                            t0Var.j();
                            t0Var.i();
                        } catch (Throwable th3) {
                            t0Var.i();
                            throw th3;
                        }
                    }
                    this.Z.U0();
                }
                Unit unit2 = Unit.f312394a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f36345a.A(this);
    }

    @Override // androidx.compose.runtime.tooling.x
    @NotNull
    public androidx.compose.runtime.tooling.p e(@NotNull androidx.compose.runtime.tooling.o oVar) {
        synchronized (this.f36348d) {
            try {
                this.X.d(oVar);
                this.X.e(true);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new a(oVar);
    }

    @NotNull
    public final CoroutineContext e0() {
        CoroutineContext coroutineContext = this.f36360p0;
        return coroutineContext == null ? this.f36345a.m() : coroutineContext;
    }

    @Override // androidx.compose.runtime.x3
    @NotNull
    public a4 f(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        r();
        z();
        return t(true, function2);
    }

    @NotNull
    public final w5 f0() {
        return this.f36350f;
    }

    @Override // androidx.compose.runtime.u4
    @NotNull
    public u2 g(@NotNull s4 s4Var, @Nullable Object obj) {
        androidx.compose.runtime.tooling.o oVarN0;
        s0 s0Var;
        if (s4Var.j()) {
            s4Var.H(true);
        }
        g gVarH = s4Var.h();
        if (gVarH != null && gVarH.b()) {
            if (!this.f36350f.b0(gVarH)) {
                synchronized (this.f36348d) {
                    s0Var = this.f36365v;
                }
                return (s0Var == null || !s0Var.v0(s4Var, obj)) ? u2.IGNORED : u2.IMMINENT;
            }
            if (!s4Var.i()) {
                return u2.IGNORED;
            }
            u2 u2VarJ0 = j0(s4Var, gVarH, obj);
            if (u2VarJ0 != u2.IGNORED && (oVarN0 = n0()) != null) {
                oVarN0.b(s4Var, obj);
            }
            return u2VarJ0;
        }
        return u2.IGNORED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.g1
    @Nullable
    public <T> T h(@NotNull f1<T> f1Var) {
        if (Intrinsics.areEqual(f1Var, t0.h())) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.runtime.o0
    public boolean k() {
        return this.H1 == 3;
    }

    public final void k0(int i10) {
        List<s4> listQ;
        synchronized (this.f36348d) {
            try {
                listQ = this.f36350f.Q(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listQ != null) {
            int size = listQ.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (listQ.get(i11).x(null) != u2.IGNORED) {
                }
            }
            return;
        }
        if (this.Z.j1()) {
            this.f36345a.o(this);
        }
    }

    @Override // androidx.compose.runtime.o0
    public void l(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        boolean zR = r();
        z();
        if (zR) {
            u(function2);
        } else {
            s(function2);
        }
    }

    @Override // androidx.compose.runtime.o0
    public boolean m() {
        boolean z10;
        synchronized (this.f36348d) {
            try {
                z10 = androidx.compose.runtime.collection.h.m(this.f36358n) > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final boolean m0() {
        return this.f36361p1;
    }

    public final void o0(@Nullable androidx.collection.c3<n5> c3Var) {
        this.f36364t = null;
        if (c3Var != null) {
            this.Y.q(c3Var);
            this.H1 = 2;
        }
    }

    public final void p0(@NotNull q1<?> q1Var) {
        if (!androidx.compose.runtime.collection.h.h(this.f36351g, q1Var)) {
            androidx.compose.runtime.collection.h.q(this.f36354j, q1Var);
        }
    }

    public final void q0(@NotNull Object obj, @NotNull s4 s4Var) {
        androidx.compose.runtime.collection.h.o(this.f36351g, obj, s4Var);
    }

    public final void r0(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        this.f36362p2 = function2;
    }

    public final void s0(boolean z10) {
        this.f36359o = z10;
    }

    public final int v() {
        return this.Z.j2();
    }

    public final void w0() {
        synchronized (this.f36348d) {
            try {
                y();
                androidx.collection.k2<Object, Object> k2VarT0 = t0();
                try {
                    this.Z.s2(k2VarT0);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    this.f36358n = k2VarT0;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public /* synthetic */ s0(p0 p0Var, i iVar, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p0Var, iVar, (i10 & 4) != 0 ? null : coroutineContext);
    }
}
