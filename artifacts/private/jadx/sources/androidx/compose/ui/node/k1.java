package androidx.compose.ui.node;

import androidx.compose.ui.graphics.l3;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 15 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 17 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 20 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 21 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1618:1\n106#1,5:1619\n111#1,4:1667\n106#1,9:1671\n117#1:1687\n106#1,5:1688\n111#1,8:1736\n117#1:1813\n106#1,5:1814\n111#1,8:1862\n117#1:1873\n106#1,5:1874\n111#1,8:1922\n117#1:1936\n106#1,5:1937\n111#1,8:1985\n450#2,6:1624\n460#2,2:1631\n462#2,8:1636\n470#2,9:1647\n479#2,8:1659\n450#2,6:1693\n460#2,2:1700\n462#2,8:1705\n470#2,9:1716\n479#2,8:1728\n450#2,5:1751\n455#2:1757\n460#2,2:1759\n462#2,8:1764\n470#2,9:1775\n479#2,8:1787\n450#2,6:1819\n460#2,2:1826\n462#2,8:1831\n470#2,9:1842\n479#2,8:1854\n450#2,6:1879\n460#2,2:1886\n462#2,8:1891\n470#2,9:1902\n479#2,8:1914\n450#2,6:1942\n460#2,2:1949\n462#2,8:1954\n470#2,9:1965\n479#2,8:1977\n450#2,5:2042\n455#2:2059\n460#2,2:2061\n462#2,8:2066\n470#2,9:2077\n479#2,8:2089\n223#2:2176\n224#2,8:2181\n236#2:2191\n210#2:2192\n211#2,6:2197\n450#2,6:2203\n460#2,2:2210\n462#2,8:2215\n470#2,9:2226\n479#2,8:2238\n218#2,3:2246\n247#3:1630\n247#3:1699\n247#3:1749\n247#3:1758\n247#3:1825\n247#3:1885\n247#3:1948\n247#3:2060\n247#3:2209\n240#4,3:1633\n243#4,3:1656\n240#4,3:1702\n243#4,3:1725\n240#4,3:1761\n243#4,3:1784\n240#4,3:1828\n243#4,3:1851\n240#4,3:1888\n243#4,3:1911\n240#4,3:1951\n243#4,3:1974\n240#4,3:2063\n243#4,3:2086\n240#4,3:2212\n243#4,3:2235\n1107#5:1644\n1085#5,2:1645\n1107#5:1713\n1085#5,2:1714\n1107#5:1772\n1085#5,2:1773\n1107#5:1839\n1085#5,2:1840\n1107#5:1899\n1085#5,2:1900\n1107#5:1962\n1085#5,2:1963\n1107#5:2074\n1085#5,2:2075\n1107#5:2223\n1085#5,2:2224\n216#6,2:1680\n30#7:1682\n30#7:1684\n80#8:1683\n80#8:1685\n60#8:2048\n60#8:2051\n70#8:2054\n70#8:2057\n60#8:2098\n70#8:2101\n60#8:2104\n70#8:2107\n60#8:2125\n70#8:2128\n85#8:2138\n90#8:2140\n85#8:2146\n90#8:2148\n60#8:2150\n70#8:2153\n85#8:2156\n90#8:2158\n85#8:2160\n90#8:2162\n85#8:2164\n90#8:2166\n60#8:2170\n70#8:2173\n60#8:2250\n70#8:2253\n53#8,3:2256\n60#8:2260\n70#8:2263\n53#8,3:2266\n60#8:2270\n70#8:2273\n60#8:2277\n70#8:2281\n60#8:2283\n70#8:2286\n86#9:1686\n102#9:1744\n102#9:1748\n102#9:1750\n106#9:1806\n106#9:1812\n154#9:1871\n154#9:1872\n86#9:1934\n106#9:1935\n82#9:2025\n82#9:2037\n82#9:2040\n94#9:2041\n82#9:2175\n94#9:2189\n94#9:2190\n683#10,3:1745\n686#10,3:1795\n1#11:1756\n57#12,4:1798\n57#12,4:1802\n103#12,4:1930\n103#12,4:1993\n78#12,5:1997\n57#12,4:2002\n57#12,4:2109\n57#12,4:2113\n57#12,4:2117\n57#12,4:2129\n57#12,4:2133\n57#12,4:2141\n57#12,4:2177\n57#12,4:2193\n604#13,5:1807\n610#13:1870\n139#14:2006\n139#14:2007\n92#15,9:2008\n113#15,8:2017\n121#15,2:2026\n100#15:2028\n113#15,8:2029\n121#15,2:2038\n65#16:2047\n65#16:2050\n69#16:2053\n69#16:2056\n150#16:2121\n150#16:2122\n65#16:2124\n69#16:2127\n65#16:2169\n69#16:2172\n65#16:2249\n69#16:2252\n65#16:2282\n69#16:2285\n22#17:2049\n22#17:2052\n22#17:2055\n22#17:2058\n22#17:2099\n22#17:2102\n22#17:2105\n22#17:2108\n22#17:2126\n22#17:2151\n22#17:2154\n22#17:2171\n22#17:2174\n22#17:2251\n22#17:2254\n22#17:2261\n22#17:2264\n22#17:2271\n22#17:2274\n22#17:2278\n22#17:2284\n57#18:2097\n61#18:2100\n57#18:2103\n61#18:2106\n57#18:2149\n61#18:2152\n57#18:2259\n61#18:2262\n57#18:2269\n61#18:2272\n63#18:2275\n57#18:2276\n65#18:2279\n61#18:2280\n273#19:2123\n266#19,2:2167\n30#19:2255\n54#20:2137\n59#20:2139\n54#20:2145\n59#20:2147\n54#20:2155\n59#20:2157\n54#20:2159\n59#20:2161\n54#20:2163\n59#20:2165\n33#21:2265\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n117#1:1619,5\n117#1:1667,4\n125#1:1671,9\n244#1:1687\n244#1:1688,5\n244#1:1736,8\n319#1:1813\n319#1:1814,5\n319#1:1862,8\n326#1:1873\n326#1:1874,5\n326#1:1922,8\n469#1:1936\n469#1:1937,5\n469#1:1985,8\n117#1:1624,6\n117#1:1631,2\n117#1:1636,8\n117#1:1647,9\n117#1:1659,8\n244#1:1693,6\n244#1:1700,2\n244#1:1705,8\n244#1:1716,9\n244#1:1728,8\n266#1:1751,5\n266#1:1757\n266#1:1759,2\n266#1:1764,8\n266#1:1775,9\n266#1:1787,8\n319#1:1819,6\n319#1:1826,2\n319#1:1831,8\n319#1:1842,9\n319#1:1854,8\n326#1:1879,6\n326#1:1886,2\n326#1:1891,8\n326#1:1902,9\n326#1:1914,8\n469#1:1942,6\n469#1:1949,2\n469#1:1954,8\n469#1:1965,9\n469#1:1977,8\n869#1:2042,5\n869#1:2059\n869#1:2061,2\n869#1:2066,8\n869#1:2077,9\n869#1:2089,8\n1314#1:2176\n1314#1:2181,8\n1350#1:2191\n1350#1:2192\n1350#1:2197,6\n1350#1:2203,6\n1350#1:2210,2\n1350#1:2215,8\n1350#1:2226,9\n1350#1:2238,8\n1350#1:2246,3\n117#1:1630\n244#1:1699\n265#1:1749\n266#1:1758\n319#1:1825\n326#1:1885\n469#1:1948\n869#1:2060\n1350#1:2209\n117#1:1633,3\n117#1:1656,3\n244#1:1702,3\n244#1:1725,3\n266#1:1761,3\n266#1:1784,3\n319#1:1828,3\n319#1:1851,3\n326#1:1888,3\n326#1:1911,3\n469#1:1951,3\n469#1:1974,3\n869#1:2063,3\n869#1:2086,3\n1350#1:2212,3\n1350#1:2235,3\n117#1:1644\n117#1:1645,2\n244#1:1713\n244#1:1714,2\n266#1:1772\n266#1:1773,2\n319#1:1839\n319#1:1840,2\n326#1:1899\n326#1:1900,2\n469#1:1962\n469#1:1963,2\n869#1:2074\n869#1:2075,2\n1350#1:2223\n1350#1:2224,2\n197#1:1680,2\n233#1:1682\n240#1:1684\n233#1:1683\n240#1:1685\n872#1:2048\n873#1:2051\n874#1:2054\n875#1:2057\n907#1:2098\n908#1:2101\n909#1:2104\n910#1:2107\n1023#1:2125\n1023#1:2128\n1069#1:2138\n1070#1:2140\n1171#1:2146\n1172#1:2148\n1220#1:2150\n1221#1:2153\n1225#1:2156\n1226#1:2158\n1229#1:2160\n1229#1:2162\n1264#1:2164\n1264#1:2166\n1285#1:2170\n1286#1:2173\n1359#1:2250\n1361#1:2253\n1364#1:2256,3\n1373#1:2260\n1374#1:2263\n1375#1:2266,3\n1388#1:2270\n1389#1:2273\n1395#1:2277\n1395#1:2281\n1399#1:2283\n1399#1:2286\n244#1:1686\n258#1:1744\n265#1:1748\n266#1:1750\n317#1:1806\n319#1:1812\n325#1:1871\n326#1:1872\n455#1:1934\n469#1:1935\n709#1:2025\n796#1:2037\n840#1:2040\n869#1:2041\n1314#1:2175\n1344#1:2189\n1350#1:2190\n264#1:1745,3\n264#1:1795,3\n283#1:1798,4\n290#1:1802,4\n359#1:1930,4\n512#1:1993,4\n572#1:1997,5\n601#1:2002,4\n929#1:2109,4\n937#1:2113,4\n944#1:2117,4\n1058#1:2129,4\n1059#1:2133,4\n1113#1:2141,4\n1314#1:2177,4\n1350#1:2193,4\n318#1:1807,5\n318#1:1870\n655#1:2006\n680#1:2007\n708#1:2008,9\n708#1:2017,8\n708#1:2026,2\n795#1:2028\n795#1:2029,8\n795#1:2038,2\n872#1:2047\n873#1:2050\n874#1:2053\n875#1:2056\n980#1:2121\n978#1:2122\n1023#1:2124\n1023#1:2127\n1285#1:2169\n1286#1:2172\n1359#1:2249\n1361#1:2252\n1399#1:2282\n1399#1:2285\n872#1:2049\n873#1:2052\n874#1:2055\n875#1:2058\n907#1:2099\n908#1:2102\n909#1:2105\n910#1:2108\n1023#1:2126\n1220#1:2151\n1221#1:2154\n1285#1:2171\n1286#1:2174\n1359#1:2251\n1361#1:2254\n1373#1:2261\n1374#1:2264\n1388#1:2271\n1389#1:2274\n1395#1:2278\n1399#1:2284\n907#1:2097\n908#1:2100\n909#1:2103\n910#1:2106\n1220#1:2149\n1221#1:2152\n1373#1:2259\n1374#1:2262\n1388#1:2269\n1389#1:2272\n1395#1:2275\n1395#1:2276\n1395#1:2279\n1395#1:2280\n1022#1:2123\n1273#1:2167,2\n1364#1:2255\n1069#1:2137\n1070#1:2139\n1171#1:2145\n1172#1:2147\n1225#1:2155\n1226#1:2157\n1229#1:2159\n1229#1:2161\n1264#1:2163\n1264#1:2165\n1375#1:2265\n*E\n"})
public abstract class k1 extends u0 implements androidx.compose.ui.layout.z0, androidx.compose.ui.layout.g0, y1 {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f39797x3 = 0;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    public static final String f39798y3 = "LayoutCoordinate operations are only valid when isAttached is true";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    public static final String f39799z3 = "Asking for measurement result of unmeasured layout modifier";
    private boolean H1;
    private boolean X;
    private boolean Y;

    @Nullable
    private k1 Z;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.b1 f39803j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private androidx.collection.f2<androidx.compose.ui.layout.a> f39804k3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f39806m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private n0.e f39807n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private e0 f39808o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private k1 f39809p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f39810p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.graphics.r1, Unit> f39811p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f39812p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k0 f39813q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> f39814r3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f39816t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private w1 f39817u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f39818v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final l0 f39819w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @NotNull
    public static final e f39796w3 = new e(null);

    @NotNull
    private static final Function1<k1, Unit> A3 = d.f39821a;

    @NotNull
    private static final Function1<k1, Unit> B3 = c.f39820a;

    @NotNull
    private static final l3 C3 = new l3();

    @NotNull
    private static final e0 D3 = new e0();

    @NotNull
    private static final float[] E3 = androidx.compose.ui.graphics.c2.c(null, 1, null);

    @NotNull
    private static final f F3 = new a();

    @NotNull
    private static final f G3 = new b();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f39800g3 = i4().getDensity();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f39801h3 = i4().getLayoutDirection();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f39802i3 = 0.8f;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private long f39805l3 = androidx.compose.ui.unit.q.f42709b.b();

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39815s3 = new i();

    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1618:1\n94#2:1619\n94#2:1620\n450#3,6:1621\n460#3,2:1628\n462#3,8:1633\n470#3,9:1644\n479#3,8:1656\n247#4:1627\n240#5,3:1630\n243#5,3:1653\n1107#6:1641\n1085#6,2:1642\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1492#1:1619\n1495#1:1620\n1495#1:1621,6\n1495#1:1628,2\n1495#1:1633,8\n1495#1:1644,9\n1495#1:1656,8\n1495#1:1627\n1495#1:1630,3\n1495#1:1653,3\n1495#1:1641\n1495#1:1642,2\n*E\n"})
    public static final class a implements f {
        a() {
        }

        @Override // androidx.compose.ui.node.k1.f
        public int a() {
            return m1.b(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        @Override // androidx.compose.ui.node.k1.f
        public boolean b(androidx.compose.ui.a0.d r10) {
            /*
                r9 = this;
                r9 = 16
                int r0 = androidx.compose.ui.node.m1.b(r9)
                r1 = 0
                r2 = r1
            L8:
                r8 = 0
                r3 = 0
                r8 = 1
                if (r10 == 0) goto L62
                boolean r4 = r10 instanceof androidx.compose.ui.node.d2
                r8 = 2
                r5 = 1
                if (r4 == 0) goto L1c
                androidx.compose.ui.node.d2 r10 = (androidx.compose.ui.node.d2) r10
                boolean r10 = r10.p1()
                if (r10 == 0) goto L5c
                return r5
            L1c:
                int r4 = r10.T8()
                r4 = r4 & r0
                if (r4 == 0) goto L5c
                boolean r4 = r10 instanceof androidx.compose.ui.node.m
                if (r4 == 0) goto L5c
                r4 = r10
                androidx.compose.ui.node.m r4 = (androidx.compose.ui.node.m) r4
                androidx.compose.ui.a0$d r4 = r4.y9()
                r6 = r3
            L2f:
                if (r4 == 0) goto L59
                int r7 = r4.T8()
                r7 = r7 & r0
                if (r7 == 0) goto L53
                int r6 = r6 + 1
                if (r6 != r5) goto L3e
                r10 = r4
                goto L53
            L3e:
                if (r2 != 0) goto L48
                androidx.compose.runtime.collection.d r2 = new androidx.compose.runtime.collection.d
                r8 = 5
                androidx.compose.ui.a0$d[] r7 = new androidx.compose.ui.a0.d[r9]
                r2.<init>(r7, r3)
            L48:
                r8 = 3
                if (r10 == 0) goto L50
                r2.d(r10)
                r10 = r1
                r10 = r1
            L50:
                r2.d(r4)
            L53:
                androidx.compose.ui.a0$d r4 = r4.O8()
                r8 = 4
                goto L2f
            L59:
                if (r6 != r5) goto L5c
                goto L8
            L5c:
                androidx.compose.ui.a0$d r10 = androidx.compose.ui.node.k.b(r2)
                r8 = 1
                goto L8
            L62:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.k1.a.b(androidx.compose.ui.a0$d):boolean");
        }

        @Override // androidx.compose.ui.node.k1.f
        public void c(l0 l0Var, long j10, w wVar, int i10, boolean z10) {
            l0Var.R0(j10, wVar, i10, z10);
        }

        @Override // androidx.compose.ui.node.k1.f
        public boolean d(l0 l0Var) {
            return true;
        }
    }

    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1618:1\n90#2:1619\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1515#1:1619\n*E\n"})
    public static final class b implements f {
        b() {
        }

        @Override // androidx.compose.ui.node.k1.f
        public int a() {
            return m1.b(8);
        }

        @Override // androidx.compose.ui.node.k1.f
        public boolean b(androidx.compose.ui.a0.d dVar) {
            return false;
        }

        @Override // androidx.compose.ui.node.k1.f
        public void c(l0 l0Var, long j10, w wVar, int i10, boolean z10) {
            l0Var.T0(j10, wVar, i10, z10);
        }

        @Override // androidx.compose.ui.node.k1.f
        public boolean d(l0 l0Var) {
            SemanticsConfiguration semanticsConfigurationQ0 = l0Var.q0();
            boolean z10 = false;
            if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.u()) {
                z10 = true;
            }
            return !z10;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<k1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39820a = new c();

        c() {
            super(1);
        }

        public final void c(k1 k1Var) {
            w1 w1VarH4 = k1Var.H4();
            if (w1VarH4 != null) {
                w1VarH4.invalidate();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k1 k1Var) {
            c(k1Var);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<k1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f39821a = new d();

        d() {
            super(1);
        }

        public final void c(k1 k1Var) {
            if (k1Var.H2() && k1.D7(k1Var, false, 1, null)) {
                l0 l0VarI4 = k1Var.i4();
                q0 q0VarK0 = l0VarI4.k0();
                if (q0VarK0.c() > 0) {
                    if (q0VarK0.e() || q0VarK0.f()) {
                        l0.S1(l0VarI4, false, 1, null);
                    }
                    q0VarK0.v().o3();
                }
                l0VarI4.C1();
                x1 x1VarC = p0.c(l0VarI4);
                androidx.compose.ui.spatial.f rectManager = x1VarC.getRectManager();
                if (k1Var == l0VarI4.F0()) {
                    rectManager.n(l0VarI4, false);
                    rectManager.k(l0VarI4);
                } else {
                    rectManager.m(l0VarI4);
                }
                if (l0VarI4.c0() > 0) {
                    x1VarC.f(l0VarI4);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k1 k1Var) {
            c(k1Var);
            return Unit.f312394a;
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a() {
            return k1.F3;
        }

        @NotNull
        public final f b() {
            return k1.G3;
        }

        private e() {
        }
    }

    public interface f {
        int a();

        boolean b(@NotNull androidx.compose.ui.a0.d dVar);

        void c(@NotNull l0 l0Var, long j10, @NotNull w wVar, int i10, boolean z10);

        boolean d(@NotNull l0 l0Var);
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.graphics.k0, androidx.compose.ui.graphics.layer.c, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f39823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0) {
            super(2);
            this.f39823b = function0;
        }

        public final void c(androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.layer.c cVar) {
            if (!k1.this.i4().J()) {
                k1.this.f39816t3 = true;
                return;
            }
            k1.this.f39813q3 = k0Var;
            k1.this.f39812p3 = cVar;
            k1.this.T4().i(k1.this, k1.B3, this.f39823b);
            k1.this.f39816t3 = false;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.layer.c cVar) {
            c(k0Var, cVar);
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k1 k1Var = k1.this;
            androidx.compose.ui.graphics.k0 k0Var = k1Var.f39813q3;
            Intrinsics.checkNotNull(k0Var);
            k1Var.Y3(k0Var, k1.this.f39812p3);
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k1 k1VarA5 = k1.this.a5();
            if (k1VarA5 != null) {
                k1VarA5.t5();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$outOfBoundsHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1618:1\n82#2:1619\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$outOfBoundsHit$1\n*L\n747#1:1619\n*E\n"})
    static final class j extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0.d f39827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f39828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f39829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f39830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f39833h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f39834i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10, float f10, boolean z11) {
            super(0);
            this.f39827b = dVar;
            this.f39828c = fVar;
            this.f39829d = j10;
            this.f39830e = wVar;
            this.f39831f = i10;
            this.f39832g = z10;
            this.f39833h = f10;
            this.f39834i = z11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k1.this.o6(l1.d(this.f39827b, this.f39828c.a(), m1.b(2)), this.f39828c, this.f39829d, this.f39830e, this.f39831f, this.f39832g, this.f39833h, this.f39834i);
        }
    }

    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1618:1\n82#2:1619\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n828#1:1619\n*E\n"})
    static final class k extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0.d f39836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f39837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f39838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f39839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f39842h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10, float f10) {
            super(0);
            this.f39836b = dVar;
            this.f39837c = fVar;
            this.f39838d = j10;
            this.f39839e = wVar;
            this.f39840f = i10;
            this.f39841g = z10;
            this.f39842h = f10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k1.this.o6(l1.d(this.f39836b, this.f39837c.a(), m1.b(2)), this.f39837c, this.f39838d, this.f39839e, this.f39840f, this.f39841g, this.f39842h, false);
        }
    }

    static final class l extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.r1, Unit> f39843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            super(0);
            this.f39843a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f39843a.invoke(k1.C3);
            k1.C3.V();
        }
    }

    static {
        int i10 = 6 << 1;
    }

    public k1(@NotNull l0 l0Var) {
        this.f39819w = l0Var;
    }

    private final boolean A7(boolean z10) {
        x1 x1VarI0;
        if (this.f39818v3 != null) {
            return false;
        }
        w1 w1Var = this.f39817u3;
        if (w1Var == null) {
            if (!(this.f39811p2 == null)) {
                s0.a.i("null layer with a non-null layerBlock");
            }
            return false;
        }
        Function1<? super androidx.compose.ui.graphics.r1, Unit> function1 = this.f39811p2;
        if (function1 == null) {
            s0.a.j("updateLayerParameters requires a non-null layerBlock");
            throw new kotlin.a0();
        }
        l3 l3Var = C3;
        l3Var.J();
        l3Var.K(i4().getDensity());
        l3Var.M(i4().getLayoutDirection());
        l3Var.U(androidx.compose.ui.unit.v.h(a()));
        T4().i(this, A3, new l(function1));
        e0 e0Var = this.f39808o3;
        if (e0Var == null) {
            e0Var = new e0();
            this.f39808o3 = e0Var;
        }
        e0 e0Var2 = D3;
        e0Var2.b(e0Var);
        e0Var.a(l3Var);
        w1Var.i(l3Var);
        boolean z11 = this.H1;
        this.H1 = l3Var.b();
        this.f39802i3 = l3Var.r();
        boolean zC = e0Var2.c(e0Var);
        boolean z12 = !zC;
        if (z10 && ((!zC || z11 != this.H1) && (x1VarI0 = i4().I0()) != null)) {
            x1VarI0.G(i4());
        }
        return z12;
    }

    static /* synthetic */ boolean D7(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k1Var.A7(z10);
    }

    private final void G3(k1 k1Var, n0.e eVar, boolean z10) {
        if (k1Var == this) {
            return;
        }
        k1 k1Var2 = this.f39809p0;
        if (k1Var2 != null) {
            k1Var2.G3(k1Var, eVar, z10);
        }
        f4(eVar, z10);
    }

    public static /* synthetic */ void G6(k1 k1Var, n0.e eVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        k1Var.A6(eVar, z10, z11);
    }

    private final long I3(k1 k1Var, long j10, boolean z10) {
        if (k1Var == this) {
            return j10;
        }
        k1 k1Var2 = this.f39809p0;
        return (k1Var2 == null || Intrinsics.areEqual(k1Var, k1Var2)) ? c4(j10, z10) : c4(k1Var2.I3(k1Var, j10, z10), z10);
    }

    private final long L5(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - b0());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        return n0.g.g((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - q0()))) & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1 T4() {
        return p0.c(i4()).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y3(androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.layer.c cVar) {
        androidx.compose.ui.a0.d dVarJ5 = j5(m1.b(4));
        if (dVarJ5 == null) {
            q6(k0Var, cVar);
        } else {
            i4().u0().x(k0Var, androidx.compose.ui.unit.v.h(a()), this, dVarJ5, cVar);
        }
    }

    private final void Z6(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10, float f10) {
        if (dVar == null) {
            s5(fVar, j10, wVar, i10, z10);
        } else if (fVar.b(dVar)) {
            wVar.Y(dVar, f10, z10, new k(dVar, fVar, j10, wVar, i10, z10, f10));
        } else {
            o6(l1.d(dVar, fVar.a(), m1.b(2)), fVar, j10, wVar, i10, z10, f10, false);
        }
    }

    private final k1 c7(androidx.compose.ui.layout.g0 g0Var) {
        k1 k1VarB;
        androidx.compose.ui.layout.u0 u0Var = g0Var instanceof androidx.compose.ui.layout.u0 ? (androidx.compose.ui.layout.u0) g0Var : null;
        if (u0Var != null && (k1VarB = u0Var.b()) != null) {
            return k1VarB;
        }
        Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (k1) g0Var;
    }

    public static /* synthetic */ long e4(k1 k1Var, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k1Var.c4(j10, z10);
    }

    private final boolean e5(int i10) {
        androidx.compose.ui.a0.d dVarM5 = m5(n1.j(i10));
        return dVarM5 != null && androidx.compose.ui.node.k.i(dVarM5, i10);
    }

    private final void f4(n0.e eVar, boolean z10) {
        float fN = androidx.compose.ui.unit.q.n(u2());
        eVar.D(eVar.k() - fN);
        eVar.E(eVar.n() - fN);
        float fP = androidx.compose.ui.unit.q.p(u2());
        eVar.F(eVar.p() - fP);
        eVar.C(eVar.c() - fP);
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.d(eVar, true);
            if (this.H1 && z10) {
                eVar.v(0.0f, 0.0f, (int) (a() >> 32), (int) (a() & com.rabbitmq.client.k0.f265952a));
                eVar.w();
            }
        }
    }

    public static /* synthetic */ long k7(k1 k1Var, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k1Var.h7(j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.a0.d m5(boolean z10) {
        androidx.compose.ui.a0.d dVarV4;
        if (i4().F0() == this) {
            return i4().A0().l();
        }
        if (!z10) {
            k1 k1Var = this.f39809p0;
            if (k1Var != null) {
                return k1Var.V4();
            }
            return null;
        }
        k1 k1Var2 = this.f39809p0;
        if (k1Var2 == null || (dVarV4 = k1Var2.V4()) == null) {
            return null;
        }
        return dVarV4.O8();
    }

    private final Function2<androidx.compose.ui.graphics.k0, androidx.compose.ui.graphics.layer.c, Unit> n4() {
        Function2 function2 = this.f39814r3;
        if (function2 != null) {
            return function2;
        }
        g gVar = new g(new h());
        this.f39814r3 = gVar;
        return gVar;
    }

    private final void o5(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10) {
        if (dVar == null) {
            s5(fVar, j10, wVar, i10, z10);
            return;
        }
        int i11 = wVar.f40043c;
        wVar.Q(wVar.f40043c + 1, wVar.size());
        wVar.f40043c++;
        wVar.f40041a.a0(dVar);
        wVar.f40042b.b0(x.a(-1.0f, z10, false));
        o5(l1.d(dVar, fVar.a(), m1.b(2)), fVar, j10, wVar, i10, z10);
        wVar.f40043c = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o6(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10, float f10, boolean z11) {
        if (dVar == null) {
            s5(fVar, j10, wVar, i10, z10);
            return;
        }
        if (u5(dVar, j10, i10)) {
            wVar.D(dVar, z10, new j(dVar, fVar, j10, wVar, i10, z10, f10, z11));
        } else if (z11) {
            p5(dVar, fVar, j10, wVar, i10, z10, f10);
        } else {
            Z6(dVar, fVar, j10, wVar, i10, z10, f10);
        }
    }

    private final void p5(androidx.compose.ui.a0.d dVar, f fVar, long j10, w wVar, int i10, boolean z10, float f10) {
        if (dVar == null) {
            s5(fVar, j10, wVar, i10, z10);
            return;
        }
        int i11 = wVar.f40043c;
        wVar.Q(wVar.f40043c + 1, wVar.size());
        wVar.f40043c++;
        wVar.f40041a.a0(dVar);
        wVar.f40042b.b0(x.a(f10, z10, false));
        o6(l1.d(dVar, fVar.a(), m1.b(2)), fVar, j10, wVar, i10, z10, f10, true);
        wVar.f40043c = i11;
    }

    private final void r7(k1 k1Var, float[] fArr) {
        if (Intrinsics.areEqual(k1Var, this)) {
            return;
        }
        k1 k1Var2 = this.f39809p0;
        Intrinsics.checkNotNull(k1Var2);
        k1Var2.r7(k1Var, fArr);
        if (!androidx.compose.ui.unit.q.k(u2(), androidx.compose.ui.unit.q.f42709b.b())) {
            float[] fArr2 = E3;
            androidx.compose.ui.graphics.c2.m(fArr2);
            androidx.compose.ui.graphics.c2.z(fArr2, -androidx.compose.ui.unit.q.n(u2()), -androidx.compose.ui.unit.q.p(u2()), 0.0f, 4, null);
            androidx.compose.ui.graphics.c2.w(fArr, fArr2);
        }
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.j(fArr);
        }
    }

    private final void t7(k1 k1Var, float[] fArr) {
        while (!Intrinsics.areEqual(this, k1Var)) {
            w1 w1Var = this.f39817u3;
            if (w1Var != null) {
                w1Var.a(fArr);
            }
            long jU2 = this.u2();
            if (!androidx.compose.ui.unit.q.k(jU2, androidx.compose.ui.unit.q.f42709b.b())) {
                float[] fArr2 = E3;
                androidx.compose.ui.graphics.c2.m(fArr2);
                androidx.compose.ui.graphics.c2.z(fArr2, androidx.compose.ui.unit.q.n(jU2), androidx.compose.ui.unit.q.p(jU2), 0.0f, 4, null);
                androidx.compose.ui.graphics.c2.w(fArr, fArr2);
            }
            this = this.f39809p0;
            Intrinsics.checkNotNull(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    private final boolean u5(androidx.compose.ui.a0.d dVar, long j10, int i10) {
        if (dVar == 0) {
            return false;
        }
        androidx.compose.ui.input.pointer.r0.a aVar = androidx.compose.ui.input.pointer.r0.f39113b;
        if (!androidx.compose.ui.input.pointer.r0.i(i10, aVar.c()) && !androidx.compose.ui.input.pointer.r0.i(i10, aVar.a())) {
            return false;
        }
        int iB = m1.b(16);
        androidx.compose.runtime.collection.d dVar2 = null;
        while (dVar != 0) {
            if (dVar instanceof d2) {
                long jZ2 = ((d2) dVar).z2();
                int i11 = (int) (j10 >> 32);
                if (Float.intBitsToFloat(i11) >= (-n2.c(jZ2, getLayoutDirection())) && Float.intBitsToFloat(i11) < b0() + n2.d(jZ2, getLayoutDirection())) {
                    int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
                    if (Float.intBitsToFloat(i12) >= (-n2.k(jZ2)) && Float.intBitsToFloat(i12) < q0() + n2.h(jZ2)) {
                        return true;
                    }
                }
                return false;
            }
            if ((dVar.T8() & iB) != 0 && (dVar instanceof m)) {
                androidx.compose.ui.a0.d dVarY9 = ((m) dVar).y9();
                int i13 = 0;
                dVar = dVar;
                while (dVarY9 != null) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i13++;
                        if (i13 == 1) {
                            dVar = dVarY9;
                        } else {
                            if (dVar2 == null) {
                                dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            dVar = dVar;
                            if (dVar != 0) {
                                dVar2.d(dVar);
                                dVar = 0;
                            }
                            dVar2.d(dVarY9);
                        }
                    }
                    dVarY9 = dVarY9.O8();
                    dVar = dVar;
                }
                if (i13 == 1) {
                }
            }
            dVar = androidx.compose.ui.node.k.n(dVar2);
        }
        return false;
    }

    private final void v6(long j10, float f10, Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, androidx.compose.ui.graphics.layer.c cVar) {
        if (cVar != null) {
            if (!(function1 == null)) {
                s0.a.g("both ways to create layers shouldn't be used together");
            }
            if (this.f39818v3 != cVar) {
                this.f39818v3 = null;
                z7(this, null, false, 2, null);
                this.f39818v3 = cVar;
            }
            if (this.f39817u3 == null) {
                w1 w1VarP = p0.c(i4()).p(n4(), this.f39815s3, cVar);
                w1VarP.g(f1());
                w1VarP.k(j10);
                this.f39817u3 = w1VarP;
                i4().c2(true);
                this.f39815s3.invoke();
            }
        } else {
            if (this.f39818v3 != null) {
                this.f39818v3 = null;
                z7(this, null, false, 2, null);
            }
            z7(this, function1, false, 2, null);
        }
        if (!androidx.compose.ui.unit.q.k(u2(), j10)) {
            p0.c(i4()).Q(androidx.compose.ui.q.f40995b.b());
            R6(j10);
            i4().k0().v().o3();
            w1 w1Var = this.f39817u3;
            if (w1Var != null) {
                w1Var.k(j10);
            } else {
                k1 k1Var = this.f39809p0;
                if (k1Var != null) {
                    k1Var.t5();
                }
            }
            i4().C1();
            w2(this);
            x1 x1VarI0 = i4().I0();
            if (x1VarI0 != null) {
                x1VarI0.G(i4());
            }
        }
        this.f39806m3 = f10;
        if (!B2()) {
            J1(l2());
        }
        if (this == i4().F0()) {
            p0.c(i4()).getRectManager().n(i4(), !i4().v0().O2());
        }
    }

    public static /* synthetic */ void z7(k1 k1Var, Function1 function1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        k1Var.u7(function1, z10);
    }

    public final boolean A4() {
        return this.f39816t3;
    }

    public final void A6(@NotNull n0.e eVar, boolean z10, boolean z11) {
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            if (this.H1) {
                if (z11) {
                    long jQ4 = Q4();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ4 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ4 & com.rabbitmq.client.k0.f265952a)) / 2.0f;
                    eVar.v(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (a() >> 32)) + fIntBitsToFloat, ((int) (com.rabbitmq.client.k0.f265952a & a())) + fIntBitsToFloat2);
                } else if (z10) {
                    eVar.v(0.0f, 0.0f, (int) (a() >> 32), (int) (com.rabbitmq.client.k0.f265952a & a()));
                }
                if (eVar.w()) {
                    return;
                }
            }
            w1Var.d(eVar, false);
        }
        float fN = androidx.compose.ui.unit.q.n(u2());
        eVar.D(eVar.k() + fN);
        eVar.E(eVar.n() + fN);
        float fP = androidx.compose.ui.unit.q.p(u2());
        eVar.F(eVar.p() + fP);
        eVar.C(eVar.c() + fP);
    }

    public final long G4() {
        return g1();
    }

    public final void G7(int i10, boolean z10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        androidx.compose.ui.a0.d dVarV4 = V4();
        if (z10 || (dVarV4 = dVarV4.W8()) != null) {
            for (androidx.compose.ui.a0.d dVarM5 = m5(z10); dVarM5 != null && (dVarM5.N8() & i10) != 0; dVarM5 = dVarM5.O8()) {
                if ((dVarM5.T8() & i10) != 0) {
                    function1.invoke(dVarM5);
                }
                if (dVarM5 == dVarV4) {
                    break;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return (this.f39817u3 == null || this.f39810p1 || !i4().I()) ? false : true;
    }

    @Nullable
    public final w1 H4() {
        return this.f39817u3;
    }

    public final void H6() {
        if (this.f39817u3 != null) {
            if (this.f39818v3 != null) {
                this.f39818v3 = null;
            }
            z7(this, null, false, 2, null);
            l0.S1(i4(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.layout.g0
    public boolean I() {
        return V4().a9();
    }

    public final /* synthetic */ <T> void I7(int i10, Function1<? super T, Unit> function1) {
        boolean zJ = n1.j(i10);
        androidx.compose.ui.a0.d dVarV4 = V4();
        if (zJ || (dVarV4 = dVarV4.W8()) != null) {
            for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & i10) != 0; dVarM5 = dVarM5.O8()) {
                if ((dVarM5.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarM5; dVarN != null; dVarN = androidx.compose.ui.node.k.n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        function1.invoke(dVarN);
                    }
                }
                if (dVarM5 == dVarV4) {
                    break;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.g0
    public long K(long j10) {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        return p0.c(i4()).K(k0(j10));
    }

    @Override // androidx.compose.ui.layout.g0
    public void K0(@NotNull float[] fArr) {
        x1 x1VarC = p0.c(i4());
        k1 k1VarC7 = c7(androidx.compose.ui.layout.h0.d(this));
        t7(k1VarC7, fArr);
        if (x1VarC instanceof androidx.compose.ui.input.pointer.j) {
            ((androidx.compose.ui.input.pointer.j) x1VarC).j(fArr);
            return;
        }
        long jH = androidx.compose.ui.layout.h0.h(k1VarC7);
        if ((9223372034707292159L & jH) != n0.d.f332689d) {
            androidx.compose.ui.graphics.c2.y(fArr, Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & com.rabbitmq.client.k0.f265952a)), 0.0f);
        }
    }

    @Nullable
    protected final Function1<androidx.compose.ui.graphics.r1, Unit> K4() {
        return this.f39811p2;
    }

    public final void K6(boolean z10) {
        this.Y = z10;
    }

    protected final void K7(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull Function1<? super androidx.compose.ui.graphics.k0, Unit> function1) {
        float fN = androidx.compose.ui.unit.q.n(u2());
        float fP = androidx.compose.ui.unit.q.p(u2());
        k0Var.c(fN, fP);
        function1.invoke(k0Var);
        k0Var.c(-fN, -fP);
    }

    public final void L6(boolean z10) {
        this.X = z10;
    }

    public final void M5() {
        i4().k0().H();
    }

    protected abstract void M6(@Nullable v0 v0Var);

    @Nullable
    public abstract v0 N4();

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081 A[LOOP:0: B:23:0x007a->B:25:0x0081, LOOP_END] */
    public void N6(@NotNull androidx.compose.ui.layout.b1 b1Var) {
        androidx.collection.f2<androidx.compose.ui.layout.a> f2VarD;
        androidx.compose.ui.layout.b1 b1Var2 = this.f39803j3;
        if (b1Var != b1Var2) {
            this.f39803j3 = b1Var;
            if (b1Var2 == null || b1Var.getWidth() != b1Var2.getWidth() || b1Var.getHeight() != b1Var2.getHeight()) {
                Y5(b1Var.getWidth(), b1Var.getHeight());
            }
            androidx.collection.f2<androidx.compose.ui.layout.a> f2Var = this.f39804k3;
            if (f2Var != null) {
                Intrinsics.checkNotNull(f2Var);
                if (f2Var.y()) {
                    if (!l1.c(this.f39804k3, b1Var.x())) {
                        S1().x().q();
                        f2VarD = this.f39804k3;
                        if (f2VarD == null) {
                            f2VarD = androidx.collection.r2.d();
                            this.f39804k3 = f2VarD;
                        }
                        f2VarD.P();
                        for (Map.Entry<androidx.compose.ui.layout.a, Integer> entry : b1Var.x().entrySet()) {
                            f2VarD.l0(entry.getKey(), entry.getValue().intValue());
                        }
                    }
                } else if (!b1Var.x().isEmpty()) {
                    if (!l1.c(this.f39804k3, b1Var.x())) {
                        S1().x().q();
                        f2VarD = this.f39804k3;
                        if (f2VarD == null) {
                            f2VarD = androidx.collection.r2.d();
                            this.f39804k3 = f2VarD;
                        }
                        f2VarD.P();
                        while (r4.hasNext()) {
                            f2VarD.l0(entry.getKey(), entry.getValue().intValue());
                        }
                    }
                }
            } else if (!b1Var.x().isEmpty()) {
                if (!l1.c(this.f39804k3, b1Var.x())) {
                    S1().x().q();
                    f2VarD = this.f39804k3;
                    if (f2VarD == null) {
                        f2VarD = androidx.collection.r2.d();
                        this.f39804k3 = f2VarD;
                    }
                    f2VarD.P();
                    while (r4.hasNext()) {
                        f2VarD.l0(entry.getKey(), entry.getValue().intValue());
                    }
                }
            }
        }
    }

    protected final boolean P7(long j10) {
        if ((((n0.d.f332688c ^ (j10 & n0.d.f332688c)) - n0.d.f332692g) & (-9223372034707292160L)) != 0) {
            return false;
        }
        w1 w1Var = this.f39817u3;
        return w1Var == null || !this.H1 || w1Var.h(j10);
    }

    public final long Q4() {
        return this.f39800g3.k4(i4().getViewConfiguration().l());
    }

    protected final long R3(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - b0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) - q0();
        int i10 = 4 | 0;
        return n0.n.f((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & com.rabbitmq.client.k0.f265952a));
    }

    @NotNull
    protected final n0.e R4() {
        n0.e eVar = this.f39807n3;
        if (eVar != null) {
            return eVar;
        }
        n0.e eVar2 = new n0.e(0.0f, 0.0f, 0.0f, 0.0f);
        this.f39807n3 = eVar2;
        return eVar2;
    }

    protected void R6(long j10) {
        this.f39805l3 = j10;
    }

    @Override // androidx.compose.ui.layout.g0
    @NotNull
    public Set<androidx.compose.ui.layout.a> S0() {
        LinkedHashSet linkedHashSet = null;
        while (this != null) {
            androidx.compose.ui.layout.b1 b1Var = this.f39803j3;
            Map<androidx.compose.ui.layout.a, Integer> mapX = b1Var != null ? b1Var.x() : null;
            if (mapX != null && (!mapX.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(mapX.keySet());
            }
            this = this.Z;
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public androidx.compose.ui.node.b S1() {
        return i4().k0().b();
    }

    protected final float S3(long j10, long j11) {
        if (b0() >= Float.intBitsToFloat((int) (j11 >> 32)) && q0() >= Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR3 = R3(j11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR3 & com.rabbitmq.client.k0.f265952a));
        long jL5 = L5(j10);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jL5 >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jL5 & com.rabbitmq.client.k0.f265952a)) <= fIntBitsToFloat2) {
            return n0.g.n(jL5);
        }
        return Float.POSITIVE_INFINITY;
    }

    public void S5() {
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.u0
    @Nullable
    public u0 T1() {
        return this.Z;
    }

    public final void T3(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.c(k0Var, cVar);
            return;
        }
        float fN = androidx.compose.ui.unit.q.n(u2());
        float fP = androidx.compose.ui.unit.q.p(u2());
        k0Var.c(fN, fP);
        Y3(k0Var, cVar);
        k0Var.c(-fN, -fP);
    }

    @Override // androidx.compose.ui.layout.g0
    public boolean U() {
        return H0();
    }

    public final void U6(@Nullable k1 k1Var) {
        this.Z = k1Var;
    }

    @Override // androidx.compose.ui.layout.g0
    public long V(@NotNull androidx.compose.ui.layout.g0 g0Var, long j10, boolean z10) {
        if (g0Var instanceof androidx.compose.ui.layout.u0) {
            androidx.compose.ui.layout.u0 u0Var = (androidx.compose.ui.layout.u0) g0Var;
            u0Var.b().M5();
            return n0.g.g(u0Var.V(this, n0.g.g(j10 ^ (-9223372034707292160L)), z10) ^ (-9223372034707292160L));
        }
        k1 k1VarC7 = c7(g0Var);
        k1VarC7.M5();
        k1 k1VarB4 = b4(k1VarC7);
        while (k1VarC7 != k1VarB4) {
            j10 = k1VarC7.h7(j10, z10);
            k1VarC7 = k1VarC7.f39809p0;
            Intrinsics.checkNotNull(k1VarC7);
        }
        return I3(k1VarB4, j10, z10);
    }

    @NotNull
    public abstract androidx.compose.ui.a0.d V4();

    public final void V5() {
        H6();
    }

    public final void V6(@Nullable k1 k1Var) {
        this.f39809p0 = k1Var;
    }

    @Override // androidx.compose.ui.node.u0
    public void W2() {
        androidx.compose.ui.graphics.layer.c cVar = this.f39818v3;
        if (cVar != null) {
            n1(u2(), this.f39806m3, cVar);
        } else {
            p1(u2(), this.f39806m3, this.f39811p2);
        }
    }

    protected final void X3(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.graphics.h2 h2Var) {
        k0Var.x(0.5f, 0.5f, ((int) (f1() >> 32)) - 0.5f, ((int) (f1() & com.rabbitmq.client.k0.f265952a)) - 0.5f, h2Var);
    }

    protected final void X6(float f10) {
        this.f39806m3 = f10;
    }

    @Nullable
    public final k1 Y4() {
        return this.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    protected void Y5(int i10, int i11) {
        k1 k1Var;
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.g(androidx.compose.ui.unit.u.e((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a)));
        } else if (i4().J() && (k1Var = this.f39809p0) != null) {
            k1Var.t5();
        }
        q1(androidx.compose.ui.unit.u.e((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32)));
        if (this.f39811p2 != null) {
            A7(false);
        }
        int iB = m1.b(4);
        boolean zJ = n1.j(iB);
        androidx.compose.ui.a0.d dVarV4 = V4();
        if (zJ || (dVarV4 = dVarV4.W8()) != null) {
            for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
                if ((dVarM5.T8() & iB) != 0) {
                    androidx.compose.ui.a0.d dVarN = dVarM5;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != 0) {
                        if (dVarN instanceof t) {
                            ((t) dVarN).z3();
                        } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                            androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                            int i12 = 0;
                            dVarN = dVarN;
                            while (dVarY9 != null) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (dVarN != 0) {
                                            dVar.d(dVarN);
                                            dVarN = 0;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                                dVarY9 = dVarY9.O8();
                                dVarN = dVarN;
                            }
                            if (i12 == 1) {
                            }
                        }
                        dVarN = androidx.compose.ui.node.k.n(dVar);
                    }
                }
                if (dVarM5 == dVarV4) {
                    break;
                }
            }
        }
        x1 x1VarI0 = i4().I0();
        if (x1VarI0 != null) {
            x1VarI0.G(i4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean Y6() {
        /*
            r11 = this;
            r0 = 16
            int r1 = androidx.compose.ui.node.m1.b(r0)
            r10 = 0
            boolean r1 = androidx.compose.ui.node.n1.j(r1)
            androidx.compose.ui.a0$d r11 = r11.m5(r1)
            r10 = 2
            r1 = 0
            if (r11 != 0) goto L14
            return r1
        L14:
            boolean r2 = r11.a9()
            r10 = 7
            if (r2 == 0) goto Lab
            int r2 = androidx.compose.ui.node.m1.b(r0)
            androidx.compose.ui.a0$d r3 = r11.w()
            boolean r3 = r3.a9()
            if (r3 != 0) goto L2e
            java.lang.String r3 = "visitLocalDescendants called on an unattached node"
            s0.a.i(r3)
        L2e:
            androidx.compose.ui.a0$d r11 = r11.w()
            r10 = 5
            int r3 = r11.N8()
            r10 = 2
            r3 = r3 & r2
            if (r3 == 0) goto Lab
        L3b:
            if (r11 == 0) goto Lab
            int r3 = r11.T8()
            r3 = r3 & r2
            if (r3 == 0) goto La6
            r10 = 4
            r3 = 0
            r4 = r11
            r4 = r11
            r5 = r3
        L49:
            r10 = 1
            if (r4 == 0) goto La6
            boolean r6 = r4 instanceof androidx.compose.ui.node.d2
            r7 = 1
            if (r6 == 0) goto L5b
            r10 = 7
            androidx.compose.ui.node.d2 r4 = (androidx.compose.ui.node.d2) r4
            boolean r4 = r4.k8()
            if (r4 == 0) goto La1
            return r7
        L5b:
            int r6 = r4.T8()
            r6 = r6 & r2
            r10 = 2
            if (r6 == 0) goto La1
            boolean r6 = r4 instanceof androidx.compose.ui.node.m
            if (r6 == 0) goto La1
            r6 = r4
            r10 = 0
            androidx.compose.ui.node.m r6 = (androidx.compose.ui.node.m) r6
            androidx.compose.ui.a0$d r6 = r6.y9()
            r10 = 1
            r8 = r1
        L71:
            if (r6 == 0) goto L9e
            r10 = 6
            int r9 = r6.T8()
            r9 = r9 & r2
            if (r9 == 0) goto L98
            r10 = 0
            int r8 = r8 + 1
            if (r8 != r7) goto L83
            r4 = r6
            r4 = r6
            goto L98
        L83:
            if (r5 != 0) goto L8d
            androidx.compose.runtime.collection.d r5 = new androidx.compose.runtime.collection.d
            androidx.compose.ui.a0$d[] r9 = new androidx.compose.ui.a0.d[r0]
            r10 = 7
            r5.<init>(r9, r1)
        L8d:
            if (r4 == 0) goto L94
            r10 = 3
            r5.d(r4)
            r4 = r3
        L94:
            r10 = 2
            r5.d(r6)
        L98:
            androidx.compose.ui.a0$d r6 = r6.O8()
            r10 = 7
            goto L71
        L9e:
            if (r8 != r7) goto La1
            goto L49
        La1:
            androidx.compose.ui.a0$d r4 = androidx.compose.ui.node.k.b(r5)
            goto L49
        La6:
            androidx.compose.ui.a0$d r11 = r11.O8()
            goto L3b
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.k1.Y6():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void Z5() {
        androidx.compose.ui.a0.d dVarW8;
        if (e5(m1.b(128))) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                int iB = m1.b(128);
                boolean zJ = n1.j(iB);
                if (!zJ) {
                    dVarW8 = V4().W8();
                    if (dVarW8 == null) {
                    }
                    Unit unit = Unit.f312394a;
                }
                dVarW8 = V4();
                for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
                    if ((dVarM5.T8() & iB) != 0) {
                        androidx.compose.runtime.collection.d dVar = null;
                        androidx.compose.ui.a0.d dVarN = dVarM5;
                        while (dVarN != 0) {
                            if (dVarN instanceof f0) {
                                ((f0) dVarN).c0(f1());
                            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                                androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                                int i10 = 0;
                                dVarN = dVarN;
                                while (dVarY9 != null) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                            }
                                            if (dVarN != 0) {
                                                dVar.d(dVarN);
                                                dVarN = 0;
                                            }
                                            dVar.d(dVarY9);
                                        }
                                    }
                                    dVarY9 = dVarY9.O8();
                                    dVarN = dVarN;
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = androidx.compose.ui.node.k.n(dVar);
                        }
                    }
                    if (dVarM5 == dVarW8) {
                        break;
                    }
                }
                Unit unit2 = Unit.f312394a;
            } finally {
                aVar.x(mVarG, mVarM, function1L);
            }
        }
    }

    @Override // androidx.compose.ui.layout.g0
    public final long a() {
        return f1();
    }

    public abstract void a4();

    @Nullable
    public final k1 a5() {
        return this.f39809p0;
    }

    @Override // androidx.compose.ui.node.u0
    public boolean b2() {
        return this.f39803j3 != null;
    }

    @NotNull
    public final k1 b4(@NotNull k1 k1Var) {
        l0 l0VarI4 = k1Var.i4();
        l0 l0VarI5 = i4();
        if (l0VarI4 == l0VarI5) {
            androidx.compose.ui.a0.d dVarV4 = k1Var.V4();
            androidx.compose.ui.a0.d dVarV5 = V4();
            int iB = m1.b(2);
            if (!dVarV5.w().a9()) {
                s0.a.i("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.a0.d dVarW8 = dVarV5.w().W8(); dVarW8 != null; dVarW8 = dVarW8.W8()) {
                if ((dVarW8.T8() & iB) != 0 && dVarW8 == dVarV4) {
                    return k1Var;
                }
            }
            return this;
        }
        while (l0VarI4.a0() > l0VarI5.a0()) {
            l0VarI4 = l0VarI4.J0();
            Intrinsics.checkNotNull(l0VarI4);
        }
        while (l0VarI5.a0() > l0VarI4.a0()) {
            l0VarI5 = l0VarI5.J0();
            Intrinsics.checkNotNull(l0VarI5);
        }
        while (l0VarI4 != l0VarI5) {
            l0VarI4 = l0VarI4.J0();
            l0VarI5 = l0VarI5.J0();
            if (l0VarI4 == null || l0VarI5 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (l0VarI5 != i4()) {
            if (l0VarI4 != k1Var.i4()) {
                return l0VarI4.e0();
            }
            return k1Var;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.y
    @Nullable
    public Object c() {
        if (!i4().A0().s(m1.b(64))) {
            return null;
        }
        V4();
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        for (androidx.compose.ui.a0.d dVarQ = i4().A0().q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            if ((m1.b(64) & dVarQ.T8()) != 0) {
                int iB = m1.b(64);
                androidx.compose.runtime.collection.d dVar = null;
                androidx.compose.ui.a0.d dVarN = dVarQ;
                while (dVarN != 0) {
                    if (dVarN instanceof a2) {
                        hVar.f312751a = ((a2) dVarN).V(i4().getDensity(), hVar.f312751a);
                    } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                        androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                        int i10 = 0;
                        dVarN = dVarN;
                        while (dVarY9 != null) {
                            if ((dVarY9.T8() & iB) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    dVarN = dVarY9;
                                } else {
                                    if (dVar == null) {
                                        dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                    }
                                    if (dVarN != 0) {
                                        dVar.d(dVarN);
                                        dVarN = 0;
                                    }
                                    dVar.d(dVarY9);
                                }
                            }
                            dVarY9 = dVarY9.O8();
                            dVarN = dVarN;
                        }
                        if (i10 == 1) {
                        }
                    }
                    dVarN = androidx.compose.ui.node.k.n(dVar);
                }
            }
        }
        return hVar.f312751a;
    }

    @Override // androidx.compose.ui.layout.g0
    public long c0(long j10) {
        return p0.c(i4()).D(k0(j10));
    }

    public long c4(long j10, boolean z10) {
        if (z10 || !H0()) {
            j10 = androidx.compose.ui.unit.r.c(j10, u2());
        }
        w1 w1Var = this.f39817u3;
        return w1Var != null ? w1Var.f(j10, true) : j10;
    }

    public final float c5() {
        return this.f39806m3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void d6() {
        int iB = m1.b(128);
        boolean zJ = n1.j(iB);
        androidx.compose.ui.a0.d dVarV4 = V4();
        if (!zJ && (dVarV4 = dVarV4.W8()) == null) {
            return;
        }
        for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
            if ((dVarM5.T8() & iB) != 0) {
                androidx.compose.ui.a0.d dVarN = dVarM5;
                androidx.compose.runtime.collection.d dVar = null;
                while (dVarN != 0) {
                    if (dVarN instanceof f0) {
                        ((f0) dVarN).x(this);
                    } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                        androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                        int i10 = 0;
                        dVarN = dVarN;
                        while (dVarY9 != null) {
                            if ((dVarY9.T8() & iB) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    dVarN = dVarY9;
                                } else {
                                    if (dVar == null) {
                                        dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                    }
                                    dVarN = dVarN;
                                    if (dVarN != 0) {
                                        dVar.d(dVarN);
                                        dVarN = 0;
                                    }
                                    dVar.d(dVarY9);
                                }
                            }
                            dVarY9 = dVarY9.O8();
                            dVarN = dVarN;
                        }
                        if (i10 == 1) {
                        }
                    }
                    dVarN = androidx.compose.ui.node.k.n(dVar);
                }
            }
            if (dVarM5 == dVarV4) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.g0
    @NotNull
    public n0.j e0(@NotNull androidx.compose.ui.layout.g0 g0Var, boolean z10) {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        if (!g0Var.I()) {
            s0.a.i("LayoutCoordinates " + g0Var + " is not attached!");
        }
        k1 k1VarC7 = c7(g0Var);
        k1VarC7.M5();
        k1 k1VarB4 = b4(k1VarC7);
        n0.e eVarR4 = R4();
        eVarR4.D(0.0f);
        eVarR4.F(0.0f);
        eVarR4.E((int) (g0Var.a() >> 32));
        eVarR4.C((int) (g0Var.a() & com.rabbitmq.client.k0.f265952a));
        k1 k1Var = k1VarC7;
        while (k1Var != k1VarB4) {
            boolean z11 = z10;
            G6(k1Var, eVarR4, z11, false, 4, null);
            if (eVarR4.w()) {
                return n0.j.f332705e.a();
            }
            k1Var = k1Var.f39809p0;
            Intrinsics.checkNotNull(k1Var);
            z10 = z11;
        }
        G3(k1VarB4, eVarR4, z10);
        return n0.f.d(eVarR4);
    }

    @Override // androidx.compose.ui.layout.g0
    @Nullable
    public final androidx.compose.ui.layout.g0 g0() {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        M5();
        return i4().F0().f39809p0;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return i4().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.z
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return i4().getLayoutDirection();
    }

    public long h7(long j10, boolean z10) {
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            j10 = w1Var.f(j10, false);
        }
        return (z10 || !H0()) ? androidx.compose.ui.unit.r.e(j10, u2()) : j10;
    }

    @Override // androidx.compose.ui.node.u0, androidx.compose.ui.node.b1
    @NotNull
    public l0 i4() {
        return this.f39819w;
    }

    @Nullable
    public final androidx.compose.ui.a0.d j5(int i10) {
        boolean zJ = n1.j(i10);
        androidx.compose.ui.a0.d dVarV4 = V4();
        if (zJ || (dVarV4 = dVarV4.W8()) != null) {
            for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & i10) != 0; dVarM5 = dVarM5.O8()) {
                if ((dVarM5.T8() & i10) != 0) {
                    return dVarM5;
                }
                if (dVarM5 == dVarV4) {
                    break;
                }
            }
        }
        return null;
    }

    public final void j6() {
        this.f39810p1 = true;
        this.f39815s3.invoke();
        H6();
        if (!androidx.compose.ui.unit.q.k(u2(), androidx.compose.ui.unit.q.f42709b.b())) {
            i4().C1();
        }
    }

    @Override // androidx.compose.ui.layout.g0
    public long k0(long j10) {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        M5();
        long jK7 = j10;
        for (k1 k1Var = this; k1Var != null; k1Var = k1Var.f39809p0) {
            jK7 = k7(k1Var, jK7, false, 2, null);
        }
        return jK7;
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public androidx.compose.ui.layout.b1 l2() {
        androidx.compose.ui.layout.b1 b1Var = this.f39803j3;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException(f39799z3);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return i4().getDensity().m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final void m6() {
        if (e5(m1.b(1048576))) {
            int iB = m1.b(1048576);
            boolean zJ = n1.j(iB);
            androidx.compose.ui.a0.d dVarV4 = V4();
            if (!zJ && (dVarV4 = dVarV4.W8()) == null) {
                return;
            }
            for (androidx.compose.ui.a0.d dVarM5 = m5(zJ); dVarM5 != null && (dVarM5.N8() & iB) != 0; dVarM5 = dVarM5.O8()) {
                if ((dVarM5.T8() & iB) != 0) {
                    androidx.compose.ui.a0.d dVarN = dVarM5;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != 0) {
                        if (dVarN instanceof u1) {
                            ((u1) dVarN).L8();
                        } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                            androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9();
                            int i10 = 0;
                            dVarN = dVarN;
                            while (dVarY9 != null) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                        }
                                        if (dVarN != 0) {
                                            dVar.d(dVarN);
                                            dVarN = 0;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                                dVarY9 = dVarY9.O8();
                                dVarN = dVarN;
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarN = androidx.compose.ui.node.k.n(dVar);
                    }
                }
                if (dVarM5 == dVarV4) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.u0
    @NotNull
    public androidx.compose.ui.layout.g0 n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
        if (!this.X) {
            v6(j10, f10, null, cVar);
            return;
        }
        v0 v0VarN4 = N4();
        Intrinsics.checkNotNull(v0VarN4);
        v6(v0VarN4.u2(), f10, null, cVar);
    }

    public final boolean o4() {
        return this.Y;
    }

    @NotNull
    public final n0.j o7() {
        if (!I()) {
            return n0.j.f332705e.a();
        }
        androidx.compose.ui.layout.g0 g0VarD = androidx.compose.ui.layout.h0.d(this);
        n0.e eVarR4 = R4();
        long jR3 = R3(Q4());
        int i10 = (int) (jR3 >> 32);
        eVarR4.D(-Float.intBitsToFloat(i10));
        int i11 = (int) (jR3 & com.rabbitmq.client.k0.f265952a);
        eVarR4.F(-Float.intBitsToFloat(i11));
        eVarR4.E(b0() + Float.intBitsToFloat(i10));
        eVarR4.C(q0() + Float.intBitsToFloat(i11));
        while (this != g0VarD) {
            this.A6(eVarR4, false, true);
            if (eVarR4.w()) {
                return n0.j.f332705e.a();
            }
            this = this.f39809p0;
            Intrinsics.checkNotNull(this);
        }
        return n0.f.d(eVarR4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
        if (!this.X) {
            v6(j10, f10, function1, null);
            return;
        }
        v0 v0VarN4 = N4();
        Intrinsics.checkNotNull(v0VarN4);
        v6(v0VarN4.u2(), f10, function1, null);
    }

    @Override // androidx.compose.ui.node.u0
    @Nullable
    public u0 q2() {
        return this.f39809p0;
    }

    public void q6(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        k1 k1Var = this.Z;
        if (k1Var != null) {
            k1Var.T3(k0Var, cVar);
        }
    }

    @Override // androidx.compose.ui.layout.g0
    public long r0(@NotNull androidx.compose.ui.layout.g0 g0Var, long j10) {
        return V(g0Var, j10, true);
    }

    public final void r5(@NotNull f fVar, long j10, @NotNull w wVar, int i10, boolean z10) {
        boolean z11;
        androidx.compose.ui.a0.d dVarJ5 = j5(fVar.a());
        boolean z12 = false;
        if (!P7(j10)) {
            if (androidx.compose.ui.input.pointer.r0.i(i10, androidx.compose.ui.input.pointer.r0.f39113b.d())) {
                float fS3 = S3(j10, Q4());
                if ((Float.floatToRawIntBits(fS3) & Integer.MAX_VALUE) >= 2139095040 || !wVar.K(fS3, false)) {
                    return;
                }
                p5(dVarJ5, fVar, j10, wVar, i10, false, fS3);
                return;
            }
            return;
        }
        if (dVarJ5 == null) {
            s5(fVar, j10, wVar, i10, z10);
            return;
        }
        if (w5(j10)) {
            o5(dVarJ5, fVar, j10, wVar, i10, z10);
            return;
        }
        float fS4 = !androidx.compose.ui.input.pointer.r0.i(i10, androidx.compose.ui.input.pointer.r0.f39113b.d()) ? Float.POSITIVE_INFINITY : S3(j10, Q4());
        if ((Float.floatToRawIntBits(fS4) & Integer.MAX_VALUE) < 2139095040) {
            z11 = z10;
            if (wVar.K(fS4, z11)) {
                z12 = true;
            }
        } else {
            z11 = z10;
        }
        o6(dVarJ5, fVar, j10, wVar, i10, z11, fS4, z12);
    }

    @Override // androidx.compose.ui.layout.g0
    @Nullable
    public final androidx.compose.ui.layout.g0 s0() {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        M5();
        return this.f39809p0;
    }

    public void s5(@NotNull f fVar, long j10, @NotNull w wVar, int i10, boolean z10) {
        k1 k1Var = this.Z;
        if (k1Var != null) {
            k1Var.r5(fVar, e4(k1Var, j10, false, 2, null), wVar, i10, z10);
        }
    }

    @NotNull
    protected final androidx.compose.ui.layout.i2 s6(long j10, @NotNull Function0<? extends androidx.compose.ui.layout.i2> function0) {
        s1(j10);
        return function0.invoke();
    }

    public void t5() {
        w1 w1Var = this.f39817u3;
        if (w1Var != null) {
            w1Var.invalidate();
            return;
        }
        k1 k1Var = this.f39809p0;
        if (k1Var != null) {
            k1Var.t5();
        }
    }

    @Override // androidx.compose.ui.node.u0
    public long u2() {
        return this.f39805l3;
    }

    public final boolean u4() {
        return this.X;
    }

    public final void u7(@Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, boolean z10) {
        x1 x1VarI0;
        if (!(function1 == null || this.f39818v3 == null)) {
            s0.a.g("layerBlock can't be provided when explicitLayer is provided");
        }
        l0 l0VarI4 = i4();
        boolean z11 = (!z10 && this.f39811p2 == function1 && Intrinsics.areEqual(this.f39800g3, l0VarI4.getDensity()) && this.f39801h3 == l0VarI4.getLayoutDirection()) ? false : true;
        this.f39800g3 = l0VarI4.getDensity();
        this.f39801h3 = l0VarI4.getLayoutDirection();
        if (!l0VarI4.I() || function1 == null) {
            this.f39811p2 = null;
            w1 w1Var = this.f39817u3;
            if (w1Var != null) {
                if (!androidx.compose.ui.graphics.d2.b(w1Var.mo3getUnderlyingMatrixsQKQjiQ())) {
                    l0VarI4.C1();
                }
                w1Var.destroy();
                l0VarI4.c2(true);
                this.f39815s3.invoke();
                if (I() && l0VarI4.J() && (x1VarI0 = l0VarI4.I0()) != null) {
                    x1VarI0.G(l0VarI4);
                }
            }
            this.f39817u3 = null;
            this.f39816t3 = false;
            return;
        }
        this.f39811p2 = function1;
        if (this.f39817u3 != null) {
            if (z11 && D7(this, false, 1, null)) {
                l0VarI4.C1();
                p0.c(l0VarI4).getRectManager().m(l0VarI4);
            }
            return;
        }
        w1 w1VarL = x1.L(p0.c(l0VarI4), n4(), this.f39815s3, null, 4, null);
        w1VarL.g(f1());
        w1VarL.k(u2());
        this.f39817u3 = w1VarL;
        D7(this, false, 1, null);
        l0VarI4.c2(true);
        this.f39815s3.invoke();
    }

    @Override // androidx.compose.ui.layout.g0
    public long w(long j10) {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        return r0(androidx.compose.ui.layout.h0.d(this), p0.c(i4()).w(j10));
    }

    @Override // androidx.compose.ui.layout.g0
    public long w0(long j10) {
        if (!I()) {
            s0.a.i(f39798y3);
        }
        androidx.compose.ui.layout.g0 g0VarD = androidx.compose.ui.layout.h0.d(this);
        return r0(g0VarD, n0.g.v(p0.c(i4()).s(j10), androidx.compose.ui.layout.h0.f(g0VarD)));
    }

    protected final boolean w5(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) b0()) && fIntBitsToFloat2 < ((float) q0());
    }

    public final void w6(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        v6(androidx.compose.ui.unit.q.s(j10, b1()), f10, function1, cVar);
    }

    @Override // androidx.compose.ui.layout.g0
    public void y0(@NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull float[] fArr) {
        k1 k1VarC7 = c7(g0Var);
        k1VarC7.M5();
        k1 k1VarB4 = b4(k1VarC7);
        androidx.compose.ui.graphics.c2.m(fArr);
        k1VarC7.t7(k1VarB4, fArr);
        r7(k1VarB4, fArr);
    }

    public final boolean z5() {
        if (this.f39817u3 != null && this.f39802i3 <= 0.0f) {
            return true;
        }
        k1 k1Var = this.f39809p0;
        if (k1Var != null) {
            return k1Var.z5();
        }
        return false;
    }
}
