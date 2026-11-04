package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ObjectList.kt\nandroidx/collection/ObjectList\n+ 11 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 13 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 16 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 17 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 18 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 19 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 20 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 21 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 22 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1903:1\n1511#1,3:1997\n1510#1,7:2000\n1518#1:2012\n1511#1,3:2035\n1510#1,7:2038\n1518#1:2050\n1511#1,3:2074\n1510#1,7:2077\n1518#1:2139\n25#2,5:1904\n33#2:1912\n33#2:1915\n33#2:1918\n33#2:1924\n33#2:1925\n33#2:1926\n33#2:1940\n33#2:1941\n33#2:1942\n33#2:1943\n33#2:1949\n33#2:1964\n33#2:1972\n33#2:1973\n33#2:1974\n33#2:1980\n33#2:1991\n33#2:1994\n33#2:1995\n33#2:1996\n33#2:2013\n33#2:2014\n33#2:2027\n33#2:2087\n33#2:2129\n33#2:2140\n33#2:2162\n33#2:2165\n33#2:2166\n33#2:2169\n33#2:2172\n33#2:2175\n33#2:2176\n33#2:2177\n33#2:2178\n33#2:2204\n33#2:2205\n33#2:2206\n33#2:2207\n33#2:2208\n33#2:2217\n33#2:2241\n33#2:2243\n1107#3:1909\n1085#3,2:1910\n519#4:1913\n424#4,8:1932\n519#4:1981\n519#4:2163\n519#4:2164\n648#4,2:2170\n643#4,2:2173\n424#4,8:2223\n1#5:1914\n1#5:2126\n1251#6,2:1916\n34#7,5:1919\n34#7,5:1927\n34#7,5:1967\n34#7,5:1975\n91#7:2028\n34#7,5:2029\n92#7:2034\n114#7,2:2051\n34#7,3:2053\n116#7,2:2056\n118#7,2:2065\n38#7:2067\n120#7:2068\n82#7,2:2088\n34#7,5:2090\n84#7:2095\n91#7:2096\n34#7,5:2097\n92#7:2102\n106#7:2107\n34#7,5:2108\n107#7:2113\n106#7:2114\n34#7,5:2115\n107#7:2120\n204#7,2:2121\n34#7,3:2123\n38#7:2127\n206#7:2128\n223#7,2:2130\n64#7,5:2132\n225#7:2137\n34#7,5:2218\n34#7,5:2231\n34#7,5:2236\n34#7,5:2269\n149#8,5:1944\n149#8,5:2007\n149#8,5:2045\n149#8,3:2084\n153#8:2138\n149#8,5:2157\n1863#9,2:1950\n1557#9:2103\n1628#9,3:2104\n287#10,6:1952\n287#10,6:1958\n287#10,4:2143\n292#10:2149\n287#10,6:2151\n919#11,2:1965\n919#11,2:2147\n318#12,9:1982\n327#12,2:1992\n317#13,6:2015\n317#13,6:2021\n381#14,7:2058\n4809#15:2069\n4788#15,4:2070\n23#16,2:2141\n25#16:2150\n84#17:2167\n30#18:2168\n357#19,4:2179\n329#19,6:2183\n339#19,3:2190\n342#19,9:2194\n361#19:2203\n1399#20:2189\n1270#20:2193\n1399#20:2254\n1270#20:2258\n45#21,5:2209\n45#21,3:2214\n49#21:2242\n231#22,3:2244\n200#22,7:2247\n211#22,3:2255\n214#22,9:2259\n234#22:2268\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1233#1:1997,3\n1233#1:2000,7\n1233#1:2012\n1365#1:2035,3\n1365#1:2038,7\n1365#1:2050\n1388#1:2074,3\n1388#1:2077,7\n1388#1:2139\n225#1:1904,5\n318#1:1912\n370#1:1915\n457#1:1918\n481#1:1924\n484#1:1925\n496#1:1926\n509#1:1940\n517#1:1941\n770#1:1942\n797#1:1943\n844#1:1949\n900#1:1964\n924#1:1972\n937#1:1973\n953#1:1974\n1092#1:1980\n1104#1:1991\n1189#1:1994\n1204#1:1995\n1220#1:1996\n1236#1:2013\n1243#1:2014\n1329#1:2027\n1392#1:2087\n1450#1:2129\n1472#1:2140\n1542#1:2162\n1583#1:2165\n1596#1:2166\n1629#1:2169\n1637#1:2172\n1647#1:2175\n1655#1:2176\n1663#1:2177\n1688#1:2178\n1701#1:2204\n1712#1:2205\n168#1:2206\n288#1:2207\n272#1:2208\n1055#1:2217\n1084#1:2241\n1335#1:2243\n233#1:1909\n233#1:1910,2\n352#1:1913\n507#1:1932,8\n1094#1:1981\n1544#1:2163\n1553#1:2164\n1631#1:2170,2\n1639#1:2173,2\n1058#1:2223,8\n1447#1:2126\n370#1:1916,2\n467#1:1919,5\n503#1:1927,5\n908#1:1967,5\n954#1:1975,5\n1330#1:2028\n1330#1:2029,5\n1330#1:2034\n1385#1:2051,2\n1385#1:2053,3\n1385#1:2056,2\n1385#1:2065,2\n1385#1:2067\n1385#1:2068\n1394#1:2088,2\n1394#1:2090,5\n1394#1:2095\n1406#1:2096\n1406#1:2097,5\n1406#1:2102\n1439#1:2107\n1439#1:2108,5\n1439#1:2113\n1439#1:2114\n1439#1:2115,5\n1439#1:2120\n1447#1:2121,2\n1447#1:2123,3\n1447#1:2127\n1447#1:2128\n1453#1:2130,2\n1453#1:2132,5\n1453#1:2137\n1056#1:2218,5\n1066#1:2231,5\n1079#1:2236,5\n1668#1:2269,5\n833#1:1944,5\n1233#1:2007,5\n1365#1:2045,5\n1388#1:2084,3\n1388#1:2138\n1516#1:2157,5\n859#1:1950,2\n1415#1:2103\n1415#1:2104,3\n880#1:1952,6\n889#1:1958,6\n1479#1:2143,4\n1479#1:2149\n1484#1:2151,6\n907#1:1965,2\n1479#1:2147,2\n1103#1:1982,9\n1103#1:1992,2\n1286#1:2015,6\n1303#1:2021,6\n1385#1:2058,7\n1387#1:2069\n1387#1:2070,4\n1479#1:2141,2\n1479#1:2150\n1607#1:2167\n1607#1:2168\n1693#1:2179,4\n1693#1:2183,6\n1693#1:2190,3\n1693#1:2194,9\n1693#1:2203\n1693#1:2189\n1693#1:2193\n1370#1:2254\n1370#1:2258\n1040#1:2209,5\n1050#1:2214,3\n1050#1:2242\n1370#1:2244,3\n1370#1:2247,7\n1370#1:2255,3\n1370#1:2259,9\n1370#1:2268\n*E\n"})
public final class c5 extends p0 {

    @NotNull
    public static final a D = new a(null);
    public static final int E = 8;

    @NotNull
    private static final kotlinx.coroutines.flow.k0<androidx.compose.runtime.external.kotlinx.collections.immutable.i<d>> F = kotlinx.coroutines.flow.b1.a(androidx.compose.runtime.external.kotlinx.collections.immutable.a.K());

    @NotNull
    private static final AtomicReference<Boolean> G = new AtomicReference<>(Boolean.FALSE);

    @NotNull
    private final CoroutineContext A;

    @Nullable
    private androidx.collection.g2<androidx.compose.runtime.tooling.r> B;

    @NotNull
    private final d C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l f35341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f35342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f35343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Throwable f35344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<l1> f35345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private List<? extends l1> f35346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private androidx.collection.l2<Object> f35347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<l1> f35348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<l1> f35349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<i3> f35350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f35351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final p3 f35352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<i3, h3> f35353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f35354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private List<l1> f35355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private Set<l1> f35356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super Unit> f35357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private c f35360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<e> f35362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.internal.u0<androidx.collection.l2<s4>> f35363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f35364z;

    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1903:1\n1368#2:1904\n1454#2,5:1905\n1863#2,2:1910\n1863#2,2:1922\n1863#2,2:1924\n1611#2,9:1926\n1863#2:1935\n1864#2:1937\n1620#2:1938\n1611#2,9:1939\n1863#2:1948\n1864#2:1950\n1620#2:1951\n34#3,5:1912\n34#3,5:1917\n1#4:1936\n1#4:1949\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1766#1:1904\n1766#1:1905,5\n1774#1:1910,2\n1780#1:1922,2\n1785#1:1924,2\n1799#1:1926,9\n1799#1:1935\n1799#1:1937\n1799#1:1938\n1802#1:1939,9\n1802#1:1948\n1802#1:1950\n1802#1:1951\n1777#1:1912,5\n1778#1:1917,5\n1799#1:1936\n1802#1:1949\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(d dVar) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVar;
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVarAdd;
            do {
                iVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.i) c5.F.getValue();
                iVarAdd = iVar.add(dVar);
                if (iVar == iVarAdd) {
                    return;
                }
            } while (!c5.F.compareAndSet(iVar, iVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j(d dVar) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVar;
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVarRemove;
            do {
                iVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.i) c5.F.getValue();
                iVarRemove = iVar.remove(dVar);
                if (iVar == iVarRemove) {
                    return;
                }
            } while (!c5.F.compareAndSet(iVar, iVarRemove));
        }

        public final void d() {
            Iterable iterable = (Iterable) c5.F.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c cVarF = ((d) it.next()).f();
                if (cVarF != null) {
                    arrayList.add(cVarF);
                }
            }
        }

        @NotNull
        public final Set<g5> e() {
            return (Set) c5.F.getValue();
        }

        @NotNull
        public final List<f5> f() {
            Iterable iterable = (Iterable) c5.F.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                f5 f5VarD = ((d) it.next()).d();
                if (f5VarD != null) {
                    arrayList.add(f5VarD);
                }
            }
            return arrayList;
        }

        @NotNull
        public final kotlinx.coroutines.flow.z0<Set<g5>> g() {
            return c5.F;
        }

        public final void h(int i10) {
            c5.G.set(Boolean.TRUE);
            for (d dVar : (Iterable) c5.F.getValue()) {
                f5 f5VarD = dVar.d();
                if (f5VarD == null || f5VarD.b()) {
                    dVar.f();
                    dVar.e(i10);
                    dVar.g();
                }
            }
        }

        public final void i(@NotNull Object obj) {
            c5.G.set(Boolean.TRUE);
            Iterator it = ((Iterable) c5.F.getValue()).iterator();
            while (it.hasNext()) {
                ((d) it.next()).f();
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            List list2 = list;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) list.get(i10)).c();
            }
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) list.get(i11)).b();
            }
            Iterator it2 = ((Iterable) c5.F.getValue()).iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).g();
            }
        }

        @NotNull
        public final Object k() {
            c5.G.set(Boolean.TRUE);
            Iterable iterable = (Iterable) c5.F.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((d) it.next()).h());
            }
            return arrayList;
        }

        public final void l(boolean z10) {
            c5.G.set(Boolean.valueOf(z10));
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final s0 f35365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Function2<? super c0, ? super Integer, Unit> f35366b;

        public b(@NotNull s0 s0Var) {
            this.f35365a = s0Var;
            this.f35366b = s0Var.D();
        }

        public final void a() {
            if (this.f35365a.m0()) {
                this.f35365a.l(s.f36341a.a());
            }
        }

        public final void b() {
            if (this.f35365a.m0()) {
                this.f35365a.l(this.f35366b);
            }
        }

        public final void c() {
            this.f35365a.r0(this.f35366b);
        }
    }

    private static final class c implements f5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f35367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Throwable f35368b;

        public c(boolean z10, @NotNull Throwable th2) {
            this.f35367a = z10;
            this.f35368b = th2;
        }

        @Override // androidx.compose.runtime.f5
        @NotNull
        public Throwable a() {
            return this.f35368b;
        }

        @Override // androidx.compose.runtime.f5
        public boolean b() {
            return this.f35367a;
        }
    }

    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1903:1\n33#2:1904\n204#3,2:1905\n34#3,3:1907\n38#3:1911\n206#3:1912\n34#3,5:1913\n204#3,2:1918\n34#3,3:1920\n38#3:1924\n206#3:1925\n82#3,2:1926\n34#3,3:1928\n38#3:1932\n84#3:1933\n1#4:1910\n1#4:1923\n1#4:1931\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n394#1:1904\n403#1:1905,2\n403#1:1907,3\n403#1:1911\n403#1:1912\n404#1:1913,5\n410#1:1918,2\n410#1:1920,3\n410#1:1924\n410#1:1925\n411#1:1926,2\n411#1:1928,3\n411#1:1932\n411#1:1933\n403#1:1910\n410#1:1923\n*E\n"})
    private final class d implements g5 {
        public d() {
        }

        @Override // androidx.compose.runtime.g5
        public long a() {
            return c5.this.K0();
        }

        @Override // androidx.compose.runtime.g5
        @NotNull
        public androidx.compose.runtime.tooling.p b(@NotNull androidx.compose.runtime.tooling.r rVar) {
            return androidx.compose.runtime.tooling.q.a(c5.this, rVar);
        }

        @Override // androidx.compose.runtime.g5
        public boolean c() {
            return c5.this.Q0();
        }

        @Nullable
        public final f5 d() {
            c cVar;
            Object obj = c5.this.f35342d;
            c5 c5Var = c5.this;
            synchronized (obj) {
                try {
                    cVar = c5Var.f35360v;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }

        public final void e(int i10) {
            List listX0 = c5.this.X0();
            ArrayList arrayList = new ArrayList(listX0.size());
            int size = listX0.size();
            for (int i11 = 0; i11 < size; i11++) {
                l1 l1Var = (l1) listX0.get(i11);
                s0 s0Var = l1Var instanceof s0 ? (s0) l1Var : null;
                if (s0Var != null) {
                    arrayList.add(s0Var);
                }
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((s0) arrayList.get(i12)).k0(i10);
            }
        }

        @Nullable
        public final c f() {
            return c5.this.q1();
        }

        public final void g() {
            c5.this.s1();
        }

        @Override // androidx.compose.runtime.g5
        @NotNull
        public kotlinx.coroutines.flow.i<e> getState() {
            return c5.this.L0();
        }

        @NotNull
        public final List<b> h() {
            List listX0 = c5.this.X0();
            ArrayList arrayList = new ArrayList(listX0.size());
            int size = listX0.size();
            for (int i10 = 0; i10 < size; i10++) {
                l1 l1Var = (l1) listX0.get(i10);
                s0 s0Var = l1Var instanceof s0 ? (s0) l1Var : null;
                if (s0Var != null) {
                    arrayList.add(s0Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = new b((s0) arrayList.get(i11));
                bVar.a();
                arrayList2.add(bVar);
            }
            return arrayList2;
        }
    }

    public enum e {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f35377h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f35377h;
        }
    }

    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$addCompositionRegistrationObserver$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,1903:1\n33#2:1904\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$addCompositionRegistrationObserver$2\n*L\n917#1:1904\n*E\n"})
    public static final class f implements androidx.compose.runtime.tooling.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.tooling.r f35379b;

        f(androidx.compose.runtime.tooling.r rVar) {
            this.f35379b = rVar;
        }

        @Override // androidx.compose.runtime.tooling.p
        public void dispose() {
            Object obj = c5.this.f35342d;
            c5 c5Var = c5.this;
            androidx.compose.runtime.tooling.r rVar = this.f35379b;
            synchronized (obj) {
                try {
                    androidx.collection.g2 g2Var = c5Var.B;
                    if (g2Var != null) {
                        g2Var.C0(rVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<e, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35381b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f35381b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f35380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((e) this.f35381b).compareTo(e.Idle) > 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((g) create(eVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<e, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35383b;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f35383b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f35382a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((e) this.f35383b) == e.ShutDown);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((h) create(eVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1159}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1903:1\n34#2,5:1904\n33#3:1909\n33#3:1910\n41#4,3:1911\n46#4:1939\n48#4:1942\n231#5,3:1914\n200#5,7:1917\n211#5,3:1925\n214#5,2:1929\n217#5,6:1932\n234#5:1938\n1399#6:1924\n1270#6:1928\n54#7:1931\n1863#8,2:1940\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1157#1:1904,5\n1162#1:1909\n1132#1:1910\n1135#1:1911,3\n1135#1:1939\n1135#1:1942\n1135#1:1914,3\n1135#1:1917,7\n1135#1:1925,3\n1135#1:1929,2\n1135#1:1932,6\n1135#1:1938\n1135#1:1924\n1135#1:1928\n1138#1:1931\n1135#1:1940,2\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f35386c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.s0, c3, kotlin.coroutines.d<? super Unit>, Object> f35388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c3 f35389f;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {1159}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35391b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<kotlinx.coroutines.s0, c3, kotlin.coroutines.d<? super Unit>, Object> f35392c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c3 f35393d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super kotlinx.coroutines.s0, ? super c3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, c3 c3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f35392c = nVar;
                this.f35393d = c3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f35392c, this.f35393d, dVar);
                aVar.f35391b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f35390a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f35391b;
                    pj.n<kotlinx.coroutines.s0, c3, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f35392c;
                    c3 c3Var = this.f35393d;
                    this.f35390a = 1;
                    if (nVar.invoke(s0Var, c3Var, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(pj.n<? super kotlinx.coroutines.s0, ? super c3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, c3 c3Var, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f35388e = nVar;
            this.f35389f = c3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:4:0x0007, B:6:0x0019, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0073, B:25:0x0076, B:28:0x007e, B:38:0x00a9, B:29:0x0081, B:30:0x0087, B:32:0x008d, B:34:0x0095, B:37:0x00a5), top: B:48:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x0071, LOOP:0: B:11:0x0033->B:28:0x007e, LOOP_END, TryCatch #0 {all -> 0x0071, blocks: (B:4:0x0007, B:6:0x0019, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0073, B:25:0x0076, B:28:0x007e, B:38:0x00a9, B:29:0x0081, B:30:0x0087, B:32:0x008d, B:34:0x0095, B:37:0x00a5), top: B:48:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[EDGE_INSN: B:51:0x00a9->B:38:0x00a9 BREAK  A[LOOP:0: B:11:0x0033->B:28:0x007e], SYNTHETIC] */
        public static final Unit m(c5 c5Var, Set set, androidx.compose.runtime.snapshots.m mVar) {
            kotlinx.coroutines.n nVarG0;
            synchronized (c5Var.f35342d) {
                try {
                    if (((e) c5Var.f35362x.getValue()).compareTo(e.Idle) >= 0) {
                        androidx.collection.l2 l2Var = c5Var.f35347i;
                        if (set instanceof androidx.compose.runtime.collection.f) {
                            androidx.collection.c3 c3VarC = ((androidx.compose.runtime.collection.f) set).c();
                            Object[] objArr = c3VarC.f12171b;
                            long[] jArr = c3VarC.f12170a;
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
                                                if (obj instanceof androidx.compose.runtime.snapshots.d1) {
                                                    androidx.compose.runtime.snapshots.i.a aVar = androidx.compose.runtime.snapshots.i.f36500b;
                                                    if (((androidx.compose.runtime.snapshots.d1) obj).a(androidx.compose.runtime.snapshots.i.b(1))) {
                                                        l2Var.C(obj);
                                                    }
                                                } else {
                                                    l2Var.C(obj);
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
                        } else {
                            for (Object obj2 : set) {
                                if (obj2 instanceof androidx.compose.runtime.snapshots.d1) {
                                    androidx.compose.runtime.snapshots.i.a aVar2 = androidx.compose.runtime.snapshots.i.f36500b;
                                    if (!((androidx.compose.runtime.snapshots.d1) obj2).a(androidx.compose.runtime.snapshots.i.b(1))) {
                                    }
                                }
                                l2Var.C(obj2);
                            }
                        }
                        nVarG0 = c5Var.G0();
                    } else {
                        nVarG0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (nVarG0 != null) {
                Result.a aVar3 = Result.Companion;
                nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = c5.this.new i(this.f35388e, this.f35389f, dVar);
            iVar.f35386c = obj;
            return iVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:26:0x00ab, B:28:0x00b2, B:31:0x00b9), top: B:51:0x00ab }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e4 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:39:0x00dd, B:41:0x00e4, B:44:0x00eb), top: B:53:0x00dd }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.p2 p2VarA;
            androidx.compose.runtime.snapshots.h hVar;
            Throwable th2;
            Object obj2;
            c5 c5Var;
            Object obj3;
            c5 c5Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35385b;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (androidx.compose.runtime.snapshots.h) this.f35384a;
                p2VarA = (kotlinx.coroutines.p2) this.f35386c;
                try {
                    ResultKt.m(obj);
                    hVar.dispose();
                    obj3 = c5.this.f35342d;
                    c5Var2 = c5.this;
                    synchronized (obj3) {
                        try {
                            if (c5Var2.f35343e == p2VarA) {
                                c5Var2.f35343e = null;
                            }
                            c5Var2.G0();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c5.D.j(c5.this.C);
                    return Unit.f312394a;
                } catch (Throwable th4) {
                    th2 = th4;
                    hVar.dispose();
                    obj2 = c5.this.f35342d;
                    c5Var = c5.this;
                    synchronized (obj2) {
                        try {
                            if (c5Var.f35343e == p2VarA) {
                                c5Var.f35343e = null;
                            }
                            c5Var.G0();
                            c5.D.j(c5.this.C);
                            throw th2;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            ResultKt.m(obj);
            p2VarA = kotlinx.coroutines.s2.A(((kotlinx.coroutines.s0) this.f35386c).getCoroutineContext());
            c5.this.o1(p2VarA);
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            final c5 c5Var3 = c5.this;
            androidx.compose.runtime.snapshots.h hVarR = aVar.r(new Function2() { // from class: androidx.compose.runtime.d5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return c5.i.m(c5Var3, (Set) obj4, (androidx.compose.runtime.snapshots.m) obj5);
                }
            });
            c5.D.c(c5.this.C);
            try {
                List listX0 = c5.this.X0();
                int size = listX0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((l1) listX0.get(i11)).L();
                }
                a aVar2 = new a(this.f35388e, this.f35389f, null);
                this.f35386c = p2VarA;
                this.f35384a = hVarR;
                this.f35385b = 1;
                if (kotlinx.coroutines.t0.g(aVar2, this) == objL) {
                    return objL;
                }
                hVar = hVarR;
                hVar.dispose();
                obj3 = c5.this.f35342d;
                c5Var2 = c5.this;
                synchronized (obj3) {
                    if (c5Var2.f35343e == p2VarA) {
                        c5Var2.f35343e = null;
                    }
                    c5Var2.G0();
                    c5.D.j(c5.this.C);
                    return Unit.f312394a;
                }
            } catch (Throwable th6) {
                hVar = hVarR;
                th2 = th6;
                hVar.dispose();
                obj2 = c5.this.f35342d;
                c5Var = c5.this;
                synchronized (obj2) {
                    if (c5Var.f35343e == p2VarA) {
                        c5Var.f35343e = null;
                    }
                    c5Var.G0();
                }
                c5.D.j(c5.this.C);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {1029, 1036}, m = "runFrameLoop", n = {"parentFrameClock", "frameSignal", "toRecompose", "toApply", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f35397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35398e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f35400g;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35398e = obj;
            this.f35400g |= Integer.MIN_VALUE;
            return c5.this.t1(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {587, 598}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1903:1\n33#2:1904\n33#2:1985\n33#2:1999\n33#2:2015\n33#2:2124\n34#3,5:1905\n34#3,5:1986\n34#3,5:2008\n34#3,5:2016\n34#3,5:2060\n34#3,5:2065\n231#4,3:1910\n200#4,7:1913\n211#4,3:1921\n214#4,9:1925\n234#4:1934\n231#4,3:1935\n200#4,7:1938\n211#4,3:1946\n214#4,9:1950\n234#4:1959\n231#4,3:1960\n200#4,7:1963\n211#4,3:1971\n214#4,9:1975\n234#4:1984\n231#4,3:2072\n200#4,7:2075\n211#4,3:2083\n214#4,9:2087\n234#4:2096\n231#4,3:2097\n200#4,7:2100\n211#4,3:2108\n214#4,9:2112\n234#4:2121\n1399#5:1920\n1270#5:1924\n1399#5:1945\n1270#5:1949\n1399#5:1970\n1270#5:1974\n1399#5:2082\n1270#5:2086\n1399#5:2107\n1270#5:2111\n45#6,5:1991\n45#6,3:1996\n49#6:2013\n424#7,8:2000\n519#7:2014\n742#7,15:2021\n813#8,21:2036\n835#8:2071\n836#8,2:2122\n149#9,3:2057\n153#9:2070\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n549#1:1904\n580#1:1985\n616#1:1999\n647#1:2015\n746#1:2124\n553#1:1905,5\n581#1:1986,5\n626#1:2008,5\n648#1:2016,5\n701#1:2060,5\n704#1:2065,5\n559#1:1910,3\n559#1:1913,7\n559#1:1921,3\n559#1:1925,9\n559#1:1934\n565#1:1935,3\n565#1:1938,7\n565#1:1946,3\n565#1:1950,9\n565#1:1959\n570#1:1960,3\n570#1:1963,7\n570#1:1971,3\n570#1:1975,9\n570#1:1984\n719#1:2072,3\n719#1:2075,7\n719#1:2083,3\n719#1:2087,9\n719#1:2096\n733#1:2097,3\n733#1:2100,7\n733#1:2108,3\n733#1:2112,9\n733#1:2121\n559#1:1920\n559#1:1924\n565#1:1945\n565#1:1949\n570#1:1970\n570#1:1974\n719#1:2082\n719#1:2086\n733#1:2107\n733#1:2111\n602#1:1991,5\n612#1:1996,3\n612#1:2013\n617#1:2000,8\n645#1:2014\n661#1:2021,15\n691#1:2036,21\n691#1:2071\n691#1:2122,2\n691#1:2057,3\n691#1:2070\n*E\n"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, c3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f35404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f35405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f35406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f35407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f35408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f35409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f35410j;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(3, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x007b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x007d A[Catch: all -> 0x0031, LOOP:1: B:12:0x0047->B:22:0x007d, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0011, B:6:0x0022, B:9:0x0034, B:12:0x0047, B:14:0x0058, B:16:0x0062, B:18:0x0068, B:19:0x0075, B:24:0x0088, B:27:0x0095, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00ba, B:37:0x00c2, B:38:0x00c5, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:47:0x00f0, B:48:0x00fd, B:51:0x0105, B:52:0x0108, B:22:0x007d), top: B:57:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: all -> 0x0031, LOOP:3: B:27:0x0095->B:37:0x00c2, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0011, B:6:0x0022, B:9:0x0034, B:12:0x0047, B:14:0x0058, B:16:0x0062, B:18:0x0068, B:19:0x0075, B:24:0x0088, B:27:0x0095, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00ba, B:37:0x00c2, B:38:0x00c5, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:47:0x00f0, B:48:0x00fd, B:51:0x0105, B:52:0x0108, B:22:0x007d), top: B:57:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0103 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0105 A[Catch: all -> 0x0031, LOOP:5: B:41:0x00d5->B:51:0x0105, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0011, B:6:0x0022, B:9:0x0034, B:12:0x0047, B:14:0x0058, B:16:0x0062, B:18:0x0068, B:19:0x0075, B:24:0x0088, B:27:0x0095, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00ba, B:37:0x00c2, B:38:0x00c5, B:41:0x00d5, B:43:0x00e0, B:45:0x00ea, B:47:0x00f0, B:48:0x00fd, B:51:0x0105, B:52:0x0108, B:22:0x007d), top: B:57:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0088 A[EDGE_INSN: B:61:0x0088->B:24:0x0088 BREAK  A[LOOP:1: B:12:0x0047->B:22:0x007d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00c5 A[EDGE_INSN: B:66:0x00c5->B:38:0x00c5 BREAK  A[LOOP:3: B:27:0x0095->B:37:0x00c2], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x0108 A[EDGE_INSN: B:71:0x0108->B:52:0x0108 BREAK  A[LOOP:5: B:41:0x00d5->B:51:0x0105], SYNTHETIC] */
        private static final void n(c5 c5Var, List<l1> list, List<i3> list2, List<l1> list3, androidx.collection.l2<l1> l2Var, androidx.collection.l2<l1> l2Var2, androidx.collection.l2<Object> l2Var3, androidx.collection.l2<l1> l2Var4) {
            char c10;
            long j10;
            long j11;
            synchronized (c5Var.f35342d) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        l1 l1Var = list3.get(i10);
                        l1Var.c0();
                        c5Var.m1(l1Var);
                    }
                    list3.clear();
                    Object[] objArr = l2Var.f12171b;
                    long[] jArr = l2Var.f12170a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        j10 = 255;
                        while (true) {
                            long j12 = jArr[i11];
                            c10 = 7;
                            j11 = -9187201950435737472L;
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j12 & 255) < 128) {
                                        l1 l1Var2 = (l1) objArr[(i11 << 3) + i13];
                                        l1Var2.c0();
                                        c5Var.m1(l1Var2);
                                    }
                                    j12 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                } else if (i11 != length) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        c10 = 7;
                        j10 = 255;
                        j11 = -9187201950435737472L;
                    }
                    l2Var.L();
                    Object[] objArr2 = l2Var2.f12171b;
                    long[] jArr2 = l2Var2.f12170a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j13 = jArr2[i14];
                            if ((((~j13) << c10) & j13 & j11) == j11) {
                                if (i14 != length2) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j13 & j10) < 128) {
                                        ((l1) objArr2[(i14 << 3) + i16]).O();
                                    }
                                    j13 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                } else if (i14 != length2) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    l2Var2.L();
                    l2Var3.L();
                    Object[] objArr3 = l2Var4.f12171b;
                    long[] jArr3 = l2Var4.f12170a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j14 = jArr3[i17];
                            if ((((~j14) << c10) & j14 & j11) == j11) {
                                if (i17 != length3) {
                                    break;
                                    break;
                                }
                                i17++;
                            } else {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j14 & j10) < 128) {
                                        l1 l1Var3 = (l1) objArr3[(i17 << 3) + i19];
                                        l1Var3.c0();
                                        c5Var.m1(l1Var3);
                                    }
                                    j14 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                } else if (i17 != length3) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    l2Var4.L();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private static final void s(List<i3> list, c5 c5Var) {
            list.clear();
            synchronized (c5Var.f35342d) {
                try {
                    List list2 = c5Var.f35350l;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((i3) list2.get(i10));
                    }
                    c5Var.f35350l.clear();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:100:0x0203 A[Catch: all -> 0x021e, TryCatch #14 {all -> 0x021e, blocks: (B:95:0x01ed, B:98:0x01f7, B:100:0x0203, B:102:0x020d, B:104:0x0213), top: B:226:0x01ed, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x020d A[Catch: all -> 0x021e, TryCatch #14 {all -> 0x021e, blocks: (B:95:0x01ed, B:98:0x01f7, B:100:0x0203, B:102:0x020d, B:104:0x0213), top: B:226:0x01ed, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0213 A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #14 {all -> 0x021e, blocks: (B:95:0x01ed, B:98:0x01f7, B:100:0x0203, B:102:0x020d, B:104:0x0213), top: B:226:0x01ed, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:110:0x0227 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:111:0x0229 A[LOOP:4: B:98:0x01f7->B:111:0x0229, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:209:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:218:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:226:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:236:0x022c A[EDGE_INSN: B:236:0x022c->B:112:0x022c BREAK  A[LOOP:4: B:98:0x01f7->B:111:0x0229], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:237:0x022c A[EDGE_INSN: B:237:0x022c->B:112:0x022c BREAK  A[LOOP:4: B:98:0x01f7->B:111:0x0229], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:239:0x0221 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:241:0x01ac A[EDGE_INSN: B:241:0x01ac->B:82:0x01ac BREAK  A[LOOP:6: B:67:0x0162->B:80:0x019e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:242:0x01ac A[EDGE_INSN: B:242:0x01ac->B:82:0x01ac BREAK  A[LOOP:6: B:67:0x0162->B:80:0x019e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:244:0x0196 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0159  */
        /* JADX WARN: Code duplicated, block: B:69:0x0178 A[Catch: all -> 0x0193, TryCatch #9 {all -> 0x0193, blocks: (B:64:0x014b, B:67:0x0162, B:69:0x0178, B:71:0x0182, B:73:0x0188), top: B:218:0x014b, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0182 A[Catch: all -> 0x0193, TryCatch #9 {all -> 0x0193, blocks: (B:64:0x014b, B:67:0x0162, B:69:0x0178, B:71:0x0182, B:73:0x0188), top: B:218:0x014b, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0188 A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #9 {all -> 0x0193, blocks: (B:64:0x014b, B:67:0x0162, B:69:0x0178, B:71:0x0182, B:73:0x0188), top: B:218:0x014b, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x019c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x019e A[LOOP:6: B:67:0x0162->B:80:0x019e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:92:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:97:0x01f6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24, types: [int] */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26, types: [int] */
        /* JADX WARN: Type inference failed for: r3v30 */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r5v8, types: [T[], java.lang.Object[]] */
        public static final Unit v(c5 c5Var, androidx.collection.l2 l2Var, androidx.collection.l2 l2Var2, List list, List list2, androidx.collection.l2 l2Var3, List list3, androidx.collection.l2 l2Var4, Set set, long j10) {
            boolean z10;
            Unit unit;
            androidx.compose.runtime.snapshots.m i1Var;
            androidx.compose.runtime.snapshots.m mVarU;
            Object[] objArr;
            char c10;
            long[] jArr;
            int length;
            long j11;
            long j12;
            long j13;
            int i10;
            long j14;
            int i11;
            int i12;
            Object[] objArr2;
            long[] jArr2;
            int length2;
            int i13;
            long j15;
            int i14;
            int i15;
            c5 c5Var2 = c5Var;
            if (c5Var2.M0()) {
                androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
                Object objA = b1Var.a("Recomposer:animation");
                try {
                    c5Var2.f35341c.p(j10);
                    androidx.compose.runtime.snapshots.m.f36535e.y();
                    Unit unit2 = Unit.f312394a;
                    b1Var.b(objA);
                } catch (Throwable th2) {
                    androidx.compose.runtime.internal.b1.f35891a.b(objA);
                    throw th2;
                }
            }
            Object objA2 = androidx.compose.runtime.internal.b1.f35891a.a("Recomposer:recompose");
            try {
                c5Var2.l1();
                synchronized (c5Var2.f35342d) {
                    try {
                        androidx.compose.runtime.collection.d dVar = c5Var2.f35348j;
                        Object[] objArr3 = dVar.f35552a;
                        int iR = dVar.R();
                        z10 = false;
                        for (int i16 = 0; i16 < iR; i16++) {
                            list.add((l1) objArr3[i16]);
                        }
                        c5Var2.f35348j.r();
                        Unit unit3 = Unit.f312394a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                l2Var.L();
                l2Var2.L();
                try {
                    try {
                        while (true) {
                            if (list.isEmpty() && list2.isEmpty()) {
                                break;
                            }
                            try {
                                int size = list.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    l1 l1Var = (l1) list.get(i17);
                                    l1 l1VarD1 = c5Var2.d1(l1Var, l2Var);
                                    if (l1VarD1 != null) {
                                        list3.add(l1VarD1);
                                        Unit unit4 = Unit.f312394a;
                                    }
                                    l2Var2.C(l1Var);
                                }
                                list.clear();
                                if (l2Var.s() || c5Var2.f35348j.R() != 0) {
                                    synchronized (c5Var2.f35342d) {
                                        try {
                                            List listY0 = c5Var2.Y0();
                                            int size2 = listY0.size();
                                            for (int i18 = 0; i18 < size2; i18++) {
                                                l1 l1Var2 = (l1) listY0.get(i18);
                                                if (!l2Var2.e(l1Var2) && l1Var2.N(set)) {
                                                    list.add(l1Var2);
                                                }
                                            }
                                            androidx.compose.runtime.collection.d dVar2 = c5Var2.f35348j;
                                            int iR2 = dVar2.R();
                                            int i19 = 0;
                                            for (int i20 = 0; i20 < iR2; i20++) {
                                                l1 l1Var3 = (l1) dVar2.f35552a[i20];
                                                if (!l2Var2.e(l1Var3) && !list.contains(l1Var3)) {
                                                    list.add(l1Var3);
                                                    i19++;
                                                } else if (i19 > 0) {
                                                    Object[] objArr4 = dVar2.f35552a;
                                                    objArr4[i20 - i19] = objArr4[i20];
                                                }
                                            }
                                            int i21 = iR2 - i19;
                                            ArraysKt.fill((Object[]) dVar2.f35552a, (Object) null, i21, iR2);
                                            dVar2.z0(i21);
                                            Unit unit5 = Unit.f312394a;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        s(list2, c5Var2);
                                        while (!list2.isEmpty()) {
                                            l2Var3.c0(c5Var2.c1(list2, l2Var));
                                            s(list2, c5Var2);
                                        }
                                    } catch (Throwable th5) {
                                        c5.g1(c5Var2, th5, null, true, 2, null);
                                        n(c5Var, list, list2, list3, l2Var3, l2Var4, l2Var, l2Var2);
                                        unit = Unit.f312394a;
                                    }
                                } else {
                                    c5Var2 = c5Var;
                                }
                                z10 = false;
                            } catch (Throwable th6) {
                                try {
                                    c5.g1(c5Var, th6, null, true, 2, null);
                                    n(c5Var, list, list2, list3, l2Var3, l2Var4, l2Var, l2Var2);
                                    unit = Unit.f312394a;
                                    list.clear();
                                } catch (Throwable th7) {
                                    list.clear();
                                    throw th7;
                                }
                            }
                            androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                            return unit;
                        }
                        if (list3.isEmpty()) {
                            if (l2Var3.s()) {
                                l2Var4.b0(l2Var3);
                                objArr = l2Var3.f12171b;
                                c10 = 7;
                                jArr = l2Var3.f12170a;
                                length = jArr.length - 2;
                                if (length >= 0) {
                                    i10 = 0;
                                    j11 = 128;
                                    j12 = 255;
                                    while (true) {
                                        j14 = jArr[i10];
                                        j13 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            if (i10 != length) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (i12 = 0; i12 < i11; i12++) {
                                                if ((j14 & 255) < 128) {
                                                    ((l1) objArr[(i10 << 3) + i12]).Q();
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i11 == 8) {
                                                break;
                                                break;
                                            }
                                            if (i10 != length) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                } else {
                                    j11 = 128;
                                    j12 = 255;
                                    j13 = -9187201950435737472L;
                                }
                                l2Var3.L();
                            } else {
                                c10 = 7;
                                j11 = 128;
                                j12 = 255;
                                j13 = -9187201950435737472L;
                            }
                            if (l2Var4.s()) {
                                objArr2 = l2Var4.f12171b;
                                jArr2 = l2Var4.f12170a;
                                length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    i13 = 0;
                                    while (true) {
                                        j15 = jArr2[i13];
                                        if ((((~j15) << c10) & j15 & j13) != j13) {
                                            if (i13 != length2) {
                                                break;
                                                break;
                                            }
                                            i13++;
                                        } else {
                                            i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            for (i15 = 0; i15 < i14; i15++) {
                                                if ((j15 & j12) < j11) {
                                                    ((l1) objArr2[(i13 << 3) + i15]).O();
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i14 == 8) {
                                                break;
                                                break;
                                            }
                                            if (i13 != length2) {
                                                break;
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                }
                                l2Var4.L();
                            }
                            unit = Unit.f312394a;
                            i1Var.B(mVarU);
                            i1Var.d();
                            synchronized (c5Var.f35342d) {
                                c5Var.G0();
                                androidx.compose.runtime.snapshots.m.f36535e.n();
                                l2Var2.L();
                                l2Var.L();
                                c5Var.f35356r = null;
                            }
                        } else {
                            c5Var2.f35340b = c5Var2.K0() + 1;
                            try {
                                int size3 = list3.size();
                                for (?? r10 = z10; r10 < size3; r10++) {
                                    l2Var4.C((l1) list3.get(r10));
                                }
                                int size4 = list3.size();
                                for (?? r11 = z10; r11 < size4; r11++) {
                                    ((l1) list3.get(r11)).Z();
                                }
                                list3.clear();
                                if (l2Var3.s()) {
                                    try {
                                        l2Var4.b0(l2Var3);
                                        objArr = l2Var3.f12171b;
                                        c10 = 7;
                                        jArr = l2Var3.f12170a;
                                        length = jArr.length - 2;
                                        if (length >= 0) {
                                            i10 = 0;
                                            j11 = 128;
                                            j12 = 255;
                                            while (true) {
                                                j14 = jArr[i10];
                                                j13 = -9187201950435737472L;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    if (i10 != length) {
                                                        break;
                                                        break;
                                                    }
                                                    i10++;
                                                } else {
                                                    i11 = 8 - ((~(i10 - length)) >>> 31);
                                                    while (i12 < i11) {
                                                        if ((j14 & 255) < 128) {
                                                            ((l1) objArr[(i10 << 3) + i12]).Q();
                                                        }
                                                        j14 >>= 8;
                                                    }
                                                    if (i11 == 8) {
                                                        break;
                                                    }
                                                    if (i10 != length) {
                                                        break;
                                                    }
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            j11 = 128;
                                            j12 = 255;
                                            j13 = -9187201950435737472L;
                                        }
                                        l2Var3.L();
                                    } catch (Throwable th8) {
                                        try {
                                            c5.g1(c5Var, th8, null, false, 6, null);
                                            n(c5Var, list, list2, list3, l2Var3, l2Var4, l2Var, l2Var2);
                                            unit = Unit.f312394a;
                                            l2Var3.L();
                                            i1Var.B(mVarU);
                                            i1Var.d();
                                            androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                                            return unit;
                                        } catch (Throwable th9) {
                                            l2Var3.L();
                                            throw th9;
                                        }
                                    }
                                } else {
                                    c10 = 7;
                                    j11 = 128;
                                    j12 = 255;
                                    j13 = -9187201950435737472L;
                                }
                                if (l2Var4.s()) {
                                    try {
                                        objArr2 = l2Var4.f12171b;
                                        jArr2 = l2Var4.f12170a;
                                        length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            i13 = 0;
                                            while (true) {
                                                j15 = jArr2[i13];
                                                if ((((~j15) << c10) & j15 & j13) != j13) {
                                                    if (i13 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i13++;
                                                } else {
                                                    i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                    while (i15 < i14) {
                                                        if ((j15 & j12) < j11) {
                                                            ((l1) objArr2[(i13 << 3) + i15]).O();
                                                        }
                                                        j15 >>= 8;
                                                    }
                                                    if (i14 == 8) {
                                                        break;
                                                    }
                                                    if (i13 != length2) {
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                            }
                                        }
                                        l2Var4.L();
                                    } catch (Throwable th10) {
                                        try {
                                            c5.g1(c5Var, th10, null, false, 6, null);
                                            n(c5Var, list, list2, list3, l2Var3, l2Var4, l2Var, l2Var2);
                                            unit = Unit.f312394a;
                                            l2Var4.L();
                                            i1Var.B(mVarU);
                                            i1Var.d();
                                            androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                                            return unit;
                                        } catch (Throwable th11) {
                                            l2Var4.L();
                                            throw th11;
                                        }
                                    }
                                }
                                unit = Unit.f312394a;
                                i1Var.B(mVarU);
                                i1Var.d();
                                synchronized (c5Var.f35342d) {
                                    c5Var.G0();
                                }
                                androidx.compose.runtime.snapshots.m.f36535e.n();
                                l2Var2.L();
                                l2Var.L();
                                c5Var.f35356r = null;
                            } catch (Throwable th12) {
                                try {
                                    c5.g1(c5Var2, th12, null, false, 6, null);
                                    n(c5Var, list, list2, list3, l2Var3, l2Var4, l2Var, l2Var2);
                                    unit = Unit.f312394a;
                                    list3.clear();
                                    i1Var.B(mVarU);
                                    i1Var.d();
                                    androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                                    return unit;
                                } catch (Throwable th13) {
                                    list3.clear();
                                    throw th13;
                                }
                            }
                        }
                        androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                        return unit;
                    } catch (Throwable th14) {
                        i1Var.B(mVarU);
                        throw th14;
                    }
                    mVarU = i1Var.u();
                } catch (Throwable th15) {
                    i1Var.d();
                    throw th15;
                }
                androidx.compose.runtime.snapshots.m mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
                i1Var = mVarF instanceof androidx.compose.runtime.snapshots.e ? new androidx.compose.runtime.snapshots.i1((androidx.compose.runtime.snapshots.e) mVarF, null, null, true, false) : new androidx.compose.runtime.snapshots.j1(mVarF, null, true, z10);
            } catch (Throwable th16) {
                androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                throw th16;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:17:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:20:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:23:0x010a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0119  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x010a -> B:24:0x0113). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0119 -> B:12:0x00b3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c5.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.s0 s0Var, c3 c3Var, kotlin.coroutines.d<? super Unit> dVar) {
            k kVar = c5.this.new k(dVar);
            kVar.f35410j = c3Var;
            return kVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {androidx.datastore.preferences.protobuf.e0.d.f50107s, 1018, 1019}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1903:1\n34#2,4:1904\n496#3:1908\n497#3,5:1910\n495#3,9:1915\n504#3,2:1927\n507#3:1930\n508#3,7:1940\n33#4:1909\n33#4:1936\n33#4:1947\n34#5,3:1924\n38#5:1929\n424#6,5:1931\n429#6,3:1937\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n989#1:1904,4\n1001#1:1908\n1001#1:1910,5\n1001#1:1915,9\n1001#1:1927,2\n1001#1:1930\n1001#1:1940,7\n1001#1:1909\n1002#1:1936\n1013#1:1947\n1001#1:1924,3\n1001#1:1929\n1001#1:1931,5\n1001#1:1937,3\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, c3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f35414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f35416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c5 f35417f;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1903:1\n33#2:1904\n1#3:1905\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n1005#1:1904\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5 f35419b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l1 f35420c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c5 c5Var, l1 l1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f35419b = c5Var;
                this.f35420c = l1Var;
                int i10 = 0 >> 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35419b, this.f35420c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.n nVarG0;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f35418a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                l1 l1VarD1 = this.f35419b.d1(this.f35420c, null);
                Object obj2 = this.f35419b.f35342d;
                c5 c5Var = this.f35419b;
                synchronized (obj2) {
                    if (l1VarD1 != null) {
                        try {
                            c5Var.f35349k.add(l1VarD1);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c5Var.f35358t--;
                    nVarG0 = c5Var.G0();
                }
                if (nVarG0 != null) {
                    Result.a aVar = Result.Companion;
                    nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", i = {}, l = {996}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5 f35422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c3 f35423c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j4 f35424d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c5 c5Var, c3 c3Var, j4 j4Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f35422b = c5Var;
                this.f35423c = c3Var;
                this.f35424d = j4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f35422b, this.f35423c, this.f35424d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f35421a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c5 c5Var = this.f35422b;
                    c3 c3Var = this.f35423c;
                    j4 j4Var = this.f35424d;
                    this.f35421a = 1;
                    if (c5Var.t1(c3Var, j4Var, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CoroutineContext coroutineContext, c5 c5Var, kotlin.coroutines.d<? super l> dVar) {
            super(3, dVar);
            this.f35416e = coroutineContext;
            this.f35417f = c5Var;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00af  */
        /* JADX WARN: Code duplicated, block: B:78:0x0195  */
        /* JADX WARN: Code duplicated, block: B:81:0x01ac A[PHI: r2
          0x01ac: PHI (r2v7 kotlinx.coroutines.p2) = (r2v5 kotlinx.coroutines.p2), (r2v11 kotlinx.coroutines.p2) binds: [B:79:0x01a9, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
        
            if (r10.z0(r18) == r1) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
        
            if (kotlinx.coroutines.s2.l(r2, r18) == r1) goto L83;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bd -> B:25:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c5.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.s0 s0Var, c3 c3Var, kotlin.coroutines.d<? super Unit> dVar) {
            l lVar = new l(this.f35416e, this.f35417f, dVar);
            lVar.f35414c = s0Var;
            lVar.f35415d = c3Var;
            return lVar.invokeSuspend(Unit.f312394a);
        }
    }

    public c5(@NotNull CoroutineContext coroutineContext) {
        androidx.compose.runtime.l lVar = new androidx.compose.runtime.l(new Function0() { // from class: androidx.compose.runtime.x4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c5.A0(this.f36785a);
            }
        });
        this.f35341c = lVar;
        this.f35342d = new Object();
        this.f35345g = new ArrayList();
        this.f35347i = new androidx.collection.l2<>(0, 1, null);
        this.f35348j = new androidx.compose.runtime.collection.d<>(new l1[16], 0);
        this.f35349k = new ArrayList();
        this.f35350l = new ArrayList();
        this.f35351m = androidx.compose.runtime.collection.c.e(null, 1, null);
        this.f35352n = new p3();
        this.f35353o = androidx.collection.b3.u();
        this.f35354p = androidx.compose.runtime.collection.c.e(null, 1, null);
        this.f35362x = kotlinx.coroutines.flow.b1.a(e.Inactive);
        this.f35363y = new androidx.compose.runtime.internal.u0<>();
        kotlinx.coroutines.a0 a0VarA = kotlinx.coroutines.s2.a((kotlinx.coroutines.p2) coroutineContext.get(kotlinx.coroutines.p2.M2));
        a0VarA.E(new Function1() { // from class: androidx.compose.runtime.y4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c5.I0(this.f36812a, (Throwable) obj);
            }
        });
        this.f35364z = a0VarA;
        this.A = coroutineContext.plus(lVar).plus(a0VarA);
        this.C = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(c5 c5Var) {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (c5Var.f35342d) {
            try {
                nVarG0 = c5Var.G0();
                if (c5Var.f35362x.getValue().compareTo(e.ShuttingDown) <= 0) {
                    throw kotlinx.coroutines.x1.a("Recomposer shutdown; frame clock awaiter will never resume", c5Var.f35344f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(l1 l1Var, androidx.collection.l2 l2Var, Object obj) {
        l1Var.b0(obj);
        if (l2Var != null) {
            l2Var.C(obj);
        }
        return Unit.f312394a;
    }

    private final void C0() {
        Iterator<T> it = Y0().iterator();
        while (it.hasNext()) {
            x1((l1) it.next());
        }
        this.f35345g.clear();
        this.f35346h = CollectionsKt.emptyList();
    }

    private final <T> T E0(l1 l1Var, androidx.collection.l2<Object> l2Var, Function0<? extends T> function0) {
        androidx.compose.runtime.snapshots.e eVarZ = androidx.compose.runtime.snapshots.m.f36535e.z(h1(l1Var), z1(l1Var, l2Var));
        try {
            androidx.compose.runtime.snapshots.m mVarU = eVarZ.u();
            try {
                T tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
                eVarZ.B(mVarU);
                kotlin.jvm.internal.h0.c(1);
                kotlin.jvm.internal.h0.d(1);
                w0(eVarZ);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                eVarZ.B(mVarU);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        } catch (Throwable th3) {
            kotlin.jvm.internal.h0.d(1);
            w0(eVarZ);
            kotlin.jvm.internal.h0.c(1);
            throw th3;
        }
    }

    private static final void F0(c5 c5Var, i3 i3Var, i3 i3Var2) {
        List<i3> listF = i3Var2.f();
        if (listF != null) {
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                i3 i3Var3 = listF.get(i10);
                c5Var.f35352n.b(i3Var3.c(), new q3(i3Var3, i3Var));
                F0(c5Var, i3Var, i3Var3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.n<Unit> G0() {
        e eVar;
        int i10 = 0;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this.f35362x.getValue().compareTo(e.ShuttingDown) <= 0) {
            C0();
            this.f35347i = new androidx.collection.l2<>(i10, i11, defaultConstructorMarker);
            this.f35348j.r();
            this.f35349k.clear();
            this.f35350l.clear();
            this.f35355q = null;
            kotlinx.coroutines.n<? super Unit> nVar = this.f35357s;
            if (nVar != null) {
                kotlinx.coroutines.n.a.a(nVar, null, 1, null);
            }
            this.f35357s = null;
            this.f35360v = null;
            return null;
        }
        if (this.f35360v != null) {
            eVar = e.Inactive;
        } else if (this.f35343e == null) {
            this.f35347i = new androidx.collection.l2<>(i10, i11, defaultConstructorMarker);
            this.f35348j.r();
            eVar = N0() ? e.InactivePendingWork : e.Inactive;
        } else {
            eVar = (this.f35348j.R() == 0 && !this.f35347i.s() && this.f35349k.isEmpty() && this.f35350l.isEmpty() && this.f35358t <= 0 && !N0() && !androidx.compose.runtime.collection.c.m(this.f35351m)) ? e.Idle : e.PendingWork;
        }
        this.f35362x.setValue(eVar);
        if (eVar != e.PendingWork) {
            return null;
        }
        kotlinx.coroutines.n nVar2 = this.f35357s;
        this.f35357s = null;
        return nVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        int i10;
        androidx.collection.s2 s2VarF;
        synchronized (this.f35342d) {
            try {
                if (androidx.compose.runtime.collection.c.m(this.f35351m)) {
                    androidx.collection.s2 s2VarS = androidx.compose.runtime.collection.c.s(this.f35351m);
                    androidx.compose.runtime.collection.c.c(this.f35351m);
                    this.f35352n.c();
                    androidx.compose.runtime.collection.c.c(this.f35354p);
                    androidx.collection.g2 g2Var = new androidx.collection.g2(s2VarS.C());
                    Object[] objArr = s2VarS.f12449a;
                    int i11 = s2VarS.f12450b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        i3 i3Var = (i3) objArr[i12];
                        g2Var.a0(TuplesKt.to(i3Var, this.f35353o.p(i3Var)));
                    }
                    this.f35353o.K();
                    s2VarF = g2Var;
                } else {
                    s2VarF = androidx.collection.t2.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = s2VarF.f12449a;
        int i13 = s2VarF.f12450b;
        for (i10 = 0; i10 < i13; i10++) {
            Pair pair = (Pair) objArr2[i10];
            i3 i3Var2 = (i3) pair.component1();
            h3 h3Var = (h3) pair.component2();
            if (h3Var != null) {
                i3Var2.b().M(h3Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0(final c5 c5Var, final Throwable th2) {
        kotlinx.coroutines.n<? super Unit> nVar;
        kotlinx.coroutines.n<? super Unit> nVar2;
        CancellationException cancellationExceptionA = kotlinx.coroutines.x1.a("Recomposer effect job completed", th2);
        synchronized (c5Var.f35342d) {
            try {
                kotlinx.coroutines.p2 p2Var = c5Var.f35343e;
                nVar = null;
                if (p2Var != null) {
                    c5Var.f35362x.setValue(e.ShuttingDown);
                    if (c5Var.f35359u) {
                        nVar2 = c5Var.f35357s;
                        if (nVar2 != null) {
                        }
                        c5Var.f35357s = null;
                        p2Var.E(new Function1() { // from class: androidx.compose.runtime.v4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return c5.J0(this.f36731a, th2, (Throwable) obj);
                            }
                        });
                        nVar = nVar2;
                    } else {
                        p2Var.e(cancellationExceptionA);
                    }
                    nVar2 = null;
                    c5Var.f35357s = null;
                    p2Var.E(new Function1() { // from class: androidx.compose.runtime.v4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return c5.J0(this.f36731a, th2, (Throwable) obj);
                        }
                    });
                    nVar = nVar2;
                } else {
                    c5Var.f35344f = cancellationExceptionA;
                    c5Var.f35362x.setValue(e.ShutDown);
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(c5 c5Var, Throwable th2, Throwable th3) {
        Unit unit;
        synchronized (c5Var.f35342d) {
            if (th2 == null) {
                th2 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        kotlin.p.a(th2, th3);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            c5Var.f35344f = th2;
            c5Var.f35362x.setValue(e.ShutDown);
            unit = Unit.f312394a;
        }
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0() {
        boolean zN0;
        synchronized (this.f35342d) {
            zN0 = N0();
        }
        return zN0;
    }

    private final boolean N0() {
        return !this.f35361w && this.f35341c.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O0() {
        return !this.f35349k.isEmpty() || N0();
    }

    private final boolean P0() {
        if (this.f35348j.R() == 0 && !N0() && !androidx.compose.runtime.collection.c.m(this.f35351m)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0() {
        boolean z10;
        synchronized (this.f35342d) {
            try {
                z10 = this.f35347i.s() || this.f35348j.R() != 0 || N0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private static /* synthetic */ void S0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T0() {
        boolean z10;
        synchronized (this.f35342d) {
            z10 = this.f35359u;
        }
        if (!z10) {
            return true;
        }
        Iterator<kotlinx.coroutines.p2> it = this.f35364z.r0().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.l(message = "Replaced by currentState as a StateFlow", replaceWith = @kotlin.b1(expression = "currentState", imports = {}))
    public static /* synthetic */ void V0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l1> X0() {
        List<l1> listY0;
        synchronized (this.f35342d) {
            try {
                listY0 = Y0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listY0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l1> Y0() {
        List list = this.f35346h;
        if (list != null) {
            return list;
        }
        List<l1> list2 = this.f35345g;
        List<l1> listEmptyList = list2.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list2);
        this.f35346h = listEmptyList;
        return listEmptyList;
    }

    private final void a1(l1 l1Var) {
        synchronized (this.f35342d) {
            List<i3> list = this.f35350l;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(list.get(i10).b(), l1Var)) {
                    Unit unit = Unit.f312394a;
                    ArrayList arrayList = new ArrayList();
                    b1(arrayList, this, l1Var);
                    while (!arrayList.isEmpty()) {
                        c1(arrayList, null);
                        b1(arrayList, this, l1Var);
                    }
                    return;
                }
            }
        }
    }

    private static final void b1(List<i3> list, c5 c5Var, l1 l1Var) {
        list.clear();
        synchronized (c5Var.f35342d) {
            try {
                Iterator<i3> it = c5Var.f35350l.iterator();
                while (it.hasNext()) {
                    i3 next = it.next();
                    if (Intrinsics.areEqual(next.b(), l1Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l1> c1(List<i3> list, androidx.collection.l2<Object> l2Var) {
        ArrayList<Pair<i3, i3>> arrayList;
        q3 q3VarE;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i3 i3Var = list.get(i10);
            l1 l1VarB = i3Var.b();
            Object arrayList2 = map.get(l1VarB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(l1VarB, arrayList2);
            }
            ((ArrayList) arrayList2).add(i3Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            l1 l1Var = (l1) entry.getKey();
            List list2 = (List) entry.getValue();
            if (l1Var.a0()) {
                m0.y("Check failed");
            }
            androidx.compose.runtime.snapshots.e eVarZ = androidx.compose.runtime.snapshots.m.f36535e.z(h1(l1Var), z1(l1Var, l2Var));
            try {
                androidx.compose.runtime.snapshots.m mVarU = eVarZ.u();
                try {
                    synchronized (this.f35342d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                i3 i3Var2 = (i3) list2.get(i11);
                                Object objO = androidx.compose.runtime.collection.c.o(this.f35351m, i3Var2.c());
                                i3 i3Var3 = (i3) objO;
                                if (i3Var3 != null) {
                                    this.f35352n.f(i3Var3);
                                }
                                arrayList.add(TuplesKt.to(i3Var2, objO));
                            }
                            if (a0.f35293b) {
                                int size3 = arrayList.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    Pair<i3, i3> pair = arrayList.get(i12);
                                    if (pair.getSecond() == null && this.f35352n.d(pair.getFirst().c())) {
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        for (Pair<i3, i3> pair2 : arrayList) {
                                            if (pair2.getSecond() == null && (q3VarE = this.f35352n.e(pair2.getFirst().c())) != null) {
                                                i3 i3VarB = q3VarE.b();
                                                androidx.compose.runtime.collection.c.a(this.f35354p, q3VarE.a(), i3VarB);
                                                pair2 = TuplesKt.to(pair2.getFirst(), i3VarB);
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        if (arrayList.get(i13).getSecond() != null) {
                            int size5 = arrayList.size();
                            for (int i14 = 0; i14 < size5; i14++) {
                                if (arrayList.get(i14).getSecond() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i15 = 0; i15 < size6; i15++) {
                                        Pair<i3, i3> pair3 = arrayList.get(i15);
                                        i3 first = pair3.getSecond() == null ? pair3.getFirst() : null;
                                        if (first != null) {
                                            arrayList4.add(first);
                                        }
                                    }
                                    synchronized (this.f35342d) {
                                        CollectionsKt.addAll(this.f35350l, arrayList4);
                                        Unit unit = Unit.f312394a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i16 = 0; i16 < size7; i16++) {
                                        Pair<i3, i3> pair4 = arrayList.get(i16);
                                        if (pair4.getSecond() != null) {
                                            arrayList5.add(pair4);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    l1Var.R(arrayList);
                    Unit unit2 = Unit.f312394a;
                    eVarZ.B(mVarU);
                    w0(eVarZ);
                } catch (Throwable th3) {
                    eVarZ.B(mVarU);
                    throw th3;
                }
            } catch (Throwable th4) {
                w0(eVarZ);
                throw th4;
            }
        }
        return CollectionsKt.toList(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1 d1(final l1 l1Var, final androidx.collection.l2<Object> l2Var) {
        Set<l1> set;
        if (l1Var.a0() || l1Var.k() || ((set = this.f35356r) != null && set.contains(l1Var))) {
            return null;
        }
        androidx.compose.runtime.snapshots.e eVarZ = androidx.compose.runtime.snapshots.m.f36535e.z(h1(l1Var), z1(l1Var, l2Var));
        try {
            androidx.compose.runtime.snapshots.m mVarU = eVarZ.u();
            if (l2Var != null) {
                try {
                    if (l2Var.s()) {
                        l1Var.X(new Function0() { // from class: androidx.compose.runtime.b5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c5.e1(l2Var, l1Var);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    eVarZ.B(mVarU);
                    throw th2;
                }
            }
            boolean zV = l1Var.V();
            eVarZ.B(mVarU);
            w0(eVarZ);
            if (zV) {
                return l1Var;
            }
            return null;
        } catch (Throwable th3) {
            w0(eVarZ);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x000c->B:15:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x000c->B:15:0x0046], SYNTHETIC] */
    public static final Unit e1(androidx.collection.l2 l2Var, l1 l1Var) {
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
                            l1Var.b0(objArr[(i10 << 3) + i12]);
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
        return Unit.f312394a;
    }

    private final void f1(Throwable th2, l1 l1Var, boolean z10) throws Throwable {
        int i10 = 0;
        if (!G.get().booleanValue() || (th2 instanceof z)) {
            synchronized (this.f35342d) {
                try {
                    c cVar = this.f35360v;
                    if (cVar != null) {
                        throw cVar.a();
                    }
                    this.f35360v = new c(false, th2);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            throw th2;
        }
        synchronized (this.f35342d) {
            try {
                androidx.compose.runtime.internal.d1.a("Error was captured in composition while live edit was enabled.", th2);
                this.f35349k.clear();
                this.f35348j.r();
                boolean z11 = false & true;
                this.f35347i = new androidx.collection.l2<>(i10, 1, null);
                this.f35350l.clear();
                androidx.compose.runtime.collection.c.c(this.f35351m);
                this.f35353o.K();
                this.f35360v = new c(z10, th2);
                if (l1Var != null) {
                    m1(l1Var);
                }
                G0();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static /* synthetic */ void g1(c5 c5Var, Throwable th2, l1 l1Var, boolean z10, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            l1Var = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c5Var.f1(th2, l1Var, z10);
    }

    private final Function1<Object, Unit> h1(final l1 l1Var) {
        return new Function1() { // from class: androidx.compose.runtime.w4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c5.i1(l1Var, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(l1 l1Var, Object obj) {
        l1Var.a(obj);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j1(pj.n<? super kotlinx.coroutines.s0, ? super c3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f35341c, new i(nVar, d3.a(dVar.getContext()), null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k1(Function1<? super l1, Unit> function1) {
        androidx.collection.l2 l2Var;
        int i10;
        synchronized (this.f35342d) {
            int i11 = 1;
            try {
                l2Var = this.f35347i;
                i10 = 0;
                if (l2Var.s()) {
                    this.f35347i = new androidx.collection.l2(i10, i11, null);
                }
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        Set<? extends Object> setC = androidx.compose.runtime.collection.g.c(l2Var);
        if (!setC.isEmpty()) {
            List listY0 = Y0();
            int size = listY0.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((l1) listY0.get(i12)).Y(setC);
            }
        }
        androidx.compose.runtime.collection.d dVar = this.f35348j;
        T[] tArr = dVar.f35552a;
        int iR = dVar.R();
        while (i10 < iR) {
            function1.invoke(tArr[i10]);
            i10++;
        }
        this.f35348j.r();
        synchronized (this.f35342d) {
            try {
                if (G0() != null) {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
        kotlin.jvm.internal.h0.c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l1() {
        boolean zP0;
        CollectionsKt.emptyList();
        synchronized (this.f35342d) {
            if (this.f35347i.r()) {
                return P0();
            }
            List<l1> listY0 = Y0();
            Set<? extends Object> setC = androidx.compose.runtime.collection.g.c(this.f35347i);
            int i10 = 0;
            this.f35347i = new androidx.collection.l2<>(i10, 1, null);
            try {
                int size = listY0.size();
                while (i10 < size) {
                    listY0.get(i10).Y(setC);
                    if (this.f35362x.getValue().compareTo(e.ShuttingDown) <= 0) {
                        break;
                    }
                    i10++;
                }
                synchronized (this.f35342d) {
                    if (G0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zP0 = P0();
                }
                return zP0;
            } catch (Throwable th2) {
                synchronized (this.f35342d) {
                    try {
                        this.f35347i.G(setC);
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(l1 l1Var) {
        List arrayList = this.f35355q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f35355q = arrayList;
        }
        if (!arrayList.contains(l1Var)) {
            arrayList.add(l1Var);
        }
        p1(l1Var);
    }

    private final void n1(l1 l1Var) {
        androidx.collection.g2<androidx.compose.runtime.tooling.r> g2Var = this.B;
        if (g2Var != null) {
            Object[] objArr = g2Var.f12449a;
            int i10 = g2Var.f12450b;
            int i11 = 3 << 0;
            for (int i12 = 0; i12 < i10; i12++) {
                androidx.compose.runtime.tooling.r rVar = (androidx.compose.runtime.tooling.r) objArr[i12];
                if (l1Var instanceof androidx.compose.runtime.tooling.x) {
                    rVar.b((androidx.compose.runtime.tooling.x) l1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(kotlinx.coroutines.p2 p2Var) {
        synchronized (this.f35342d) {
            try {
                Throwable th2 = this.f35344f;
                if (th2 != null) {
                    throw th2;
                }
                if (this.f35362x.getValue().compareTo(e.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (this.f35343e != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                this.f35343e = p2Var;
                G0();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void p1(l1 l1Var) {
        if (this.f35345g.remove(l1Var)) {
            this.f35346h = null;
            x1(l1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c q1() {
        c cVar;
        synchronized (this.f35342d) {
            try {
                cVar = this.f35360v;
                if (cVar != null) {
                    int i10 = 4 << 0;
                    this.f35360v = null;
                    G0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1() {
        List<l1> list;
        int i10;
        synchronized (this.f35342d) {
            try {
                list = this.f35355q;
                this.f35355q = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            while (true) {
                i10 = 0;
                try {
                    if (list.isEmpty()) {
                        break;
                    }
                    l1 l1Var = (l1) CollectionsKt.removeLast(list);
                    if (l1Var instanceof s0) {
                        ((s0) l1Var).L();
                        ((s0) l1Var).l(((s0) l1Var).D());
                        if (this.f35360v != null) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    if (!list.isEmpty()) {
                        synchronized (this.f35342d) {
                            try {
                                int size = list.size();
                                while (i10 < size) {
                                    m1(list.get(i10));
                                    i10++;
                                }
                                Unit unit = Unit.f312394a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    throw th3;
                }
            }
            if (!list.isEmpty()) {
                synchronized (this.f35342d) {
                    try {
                        int size2 = list.size();
                        while (i10 < size2) {
                            m1(list.get(i10));
                            i10++;
                        }
                        Unit unit2 = Unit.f312394a;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r5.y(r10, r0) == r1) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:14:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(androidx.compose.runtime.c3 r8, androidx.compose.runtime.j4 r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.c5.j
            if (r0 == 0) goto L15
            r0 = r10
            r0 = r10
            r6 = 3
            androidx.compose.runtime.c5$j r0 = (androidx.compose.runtime.c5.j) r0
            int r1 = r0.f35400g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f35400g = r1
            goto L1a
        L15:
            androidx.compose.runtime.c5$j r0 = new androidx.compose.runtime.c5$j
            r0.<init>(r10)
        L1a:
            r6 = 6
            java.lang.Object r10 = r0.f35398e
            r6 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f35400g
            r3 = 2
            r4 = 1
            r6 = 3
            if (r2 == 0) goto L6a
            r6 = 2
            if (r2 == r4) goto L54
            if (r2 != r3) goto L4a
            java.lang.Object r8 = r0.f35397d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f35396c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f35395b
            androidx.compose.runtime.j4 r2 = (androidx.compose.runtime.j4) r2
            java.lang.Object r5 = r0.f35394a
            r6 = 2
            androidx.compose.runtime.c3 r5 = (androidx.compose.runtime.c3) r5
            r6 = 7
            kotlin.ResultKt.m(r10)
        L43:
            r10 = r9
            r9 = r2
            r2 = r8
            r2 = r8
            r8 = r5
            r6 = 3
            goto L79
        L4a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 4
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 0
            r7.<init>(r8)
            throw r7
        L54:
            java.lang.Object r8 = r0.f35397d
            r6 = 6
            java.util.List r8 = (java.util.List) r8
            r6 = 0
            java.lang.Object r9 = r0.f35396c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f35395b
            androidx.compose.runtime.j4 r2 = (androidx.compose.runtime.j4) r2
            java.lang.Object r5 = r0.f35394a
            androidx.compose.runtime.c3 r5 = (androidx.compose.runtime.c3) r5
            kotlin.ResultKt.m(r10)
            goto L96
        L6a:
            r6 = 0
            kotlin.ResultKt.m(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 2
            r2.<init>()
        L79:
            r6 = 5
            java.lang.Object r5 = r7.f35342d
            r6 = 4
            r0.f35394a = r8
            r0.f35395b = r9
            r0.f35396c = r10
            r0.f35397d = r2
            r6 = 0
            r0.f35400g = r4
            java.lang.Object r5 = r9.c(r5, r0)
            r6 = 4
            if (r5 != r1) goto L90
            goto Lac
        L90:
            r5 = r8
            r5 = r8
            r8 = r2
            r8 = r2
            r2 = r9
            r9 = r10
        L96:
            androidx.compose.runtime.a5 r10 = new androidx.compose.runtime.a5
            r10.<init>()
            r0.f35394a = r5
            r0.f35395b = r2
            r0.f35396c = r9
            r6 = 3
            r0.f35397d = r8
            r0.f35400g = r3
            java.lang.Object r10 = r5.y(r10, r0)
            if (r10 != r1) goto L43
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c5.t1(androidx.compose.runtime.c3, androidx.compose.runtime.j4, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.n u1(c5 c5Var, List list, List list2, j4 j4Var, long j10) {
        int i10;
        kotlinx.coroutines.n<Unit> nVarG0;
        if (c5Var.M0()) {
            androidx.compose.runtime.internal.b1 b1Var = androidx.compose.runtime.internal.b1.f35891a;
            Object objA = b1Var.a("Recomposer:animation");
            try {
                c5Var.f35341c.p(j10);
                androidx.compose.runtime.snapshots.m.f36535e.y();
                Unit unit = Unit.f312394a;
                b1Var.b(objA);
            } catch (Throwable th2) {
                androidx.compose.runtime.internal.b1.f35891a.b(objA);
                throw th2;
            }
        }
        Object objA2 = androidx.compose.runtime.internal.b1.f35891a.a("Recomposer:recompose");
        try {
            c5Var.l1();
            synchronized (c5Var.f35342d) {
                try {
                    List<l1> list3 = c5Var.f35349k;
                    int size = list3.size();
                    i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        list2.add(list3.get(i11));
                    }
                    c5Var.f35349k.clear();
                    androidx.compose.runtime.collection.d<l1> dVar = c5Var.f35348j;
                    l1[] l1VarArr = dVar.f35552a;
                    int iR = dVar.R();
                    for (int i12 = 0; i12 < iR; i12++) {
                        list.add(l1VarArr[i12]);
                    }
                    c5Var.f35348j.r();
                    j4Var.e();
                    Unit unit2 = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            androidx.collection.l2<Object> l2Var = new androidx.collection.l2<>(i10, 1, null);
            try {
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    l1 l1VarD1 = c5Var.d1((l1) list.get(i13), l2Var);
                    if (l1VarD1 != null) {
                        list2.add(l1VarD1);
                    }
                }
                list.clear();
                if (!list2.isEmpty()) {
                    c5Var.f35340b++;
                }
                try {
                    int size3 = list2.size();
                    while (i10 < size3) {
                        ((l1) list2.get(i10)).Z();
                        i10++;
                    }
                    list2.clear();
                    synchronized (c5Var.f35342d) {
                        nVarG0 = c5Var.G0();
                    }
                    androidx.compose.runtime.internal.b1.f35891a.b(objA2);
                    return nVarG0;
                } catch (Throwable th4) {
                    list2.clear();
                    throw th4;
                }
            } catch (Throwable th5) {
                list.clear();
                throw th5;
            }
        } catch (Throwable th6) {
            androidx.compose.runtime.internal.b1.f35891a.b(objA2);
            throw th6;
        }
    }

    private final void v0(l1 l1Var) {
        this.f35345g.add(l1Var);
        int i10 = 7 ^ 0;
        this.f35346h = null;
    }

    private final void w0(androidx.compose.runtime.snapshots.e eVar) {
        try {
            if (eVar.P() instanceof androidx.compose.runtime.snapshots.o.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            eVar.d();
        } catch (Throwable th2) {
            eVar.d();
            throw th2;
        }
    }

    private final void x1(l1 l1Var) {
        androidx.collection.g2<androidx.compose.runtime.tooling.r> g2Var = this.B;
        if (g2Var != null) {
            Object[] objArr = g2Var.f12449a;
            int i10 = g2Var.f12450b;
            for (int i11 = 0; i11 < i10; i11++) {
                androidx.compose.runtime.tooling.r rVar = (androidx.compose.runtime.tooling.r) objArr[i11];
                if (l1Var instanceof androidx.compose.runtime.tooling.x) {
                    rVar.a((androidx.compose.runtime.tooling.x) l1Var);
                }
            }
        }
    }

    private final void y1(Function0<Unit> function0) {
        androidx.compose.runtime.snapshots.m mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
        androidx.compose.runtime.snapshots.m i1Var = mVarF instanceof androidx.compose.runtime.snapshots.e ? new androidx.compose.runtime.snapshots.i1((androidx.compose.runtime.snapshots.e) mVarF, null, null, true, false) : new androidx.compose.runtime.snapshots.j1(mVarF, null, true, false);
        try {
            androidx.compose.runtime.snapshots.m mVarU = i1Var.u();
            try {
                function0.invoke();
                kotlin.jvm.internal.h0.d(1);
                i1Var.B(mVarU);
                kotlin.jvm.internal.h0.c(1);
                kotlin.jvm.internal.h0.d(1);
                i1Var.d();
                kotlin.jvm.internal.h0.c(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                i1Var.B(mVarU);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        } catch (Throwable th3) {
            kotlin.jvm.internal.h0.d(1);
            i1Var.d();
            kotlin.jvm.internal.h0.c(1);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z0(kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar;
        if (R0()) {
            return Unit.f312394a;
        }
        kotlinx.coroutines.p pVar2 = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar2.p0();
        synchronized (this.f35342d) {
            try {
                if (R0()) {
                    pVar = pVar2;
                } else {
                    this.f35357s = pVar2;
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        Object objU = pVar2.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    private final Function1<Object, Unit> z1(final l1 l1Var, final androidx.collection.l2<Object> l2Var) {
        return new Function1() { // from class: androidx.compose.runtime.z4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c5.A1(l1Var, l2Var, obj);
            }
        };
    }

    @Override // androidx.compose.runtime.p0
    public void A(@NotNull l1 l1Var) {
        synchronized (this.f35342d) {
            p1(l1Var);
            this.f35348j.n0(l1Var);
            this.f35349k.remove(l1Var);
            Unit unit = Unit.f312394a;
        }
    }

    public final void B0() {
        synchronized (this.f35342d) {
            try {
                if (this.f35362x.getValue().compareTo(e.Idle) >= 0) {
                    this.f35362x.setValue(e.ShuttingDown);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kotlinx.coroutines.p2.a.b(this.f35364z, null, 1, null);
    }

    public final void D0() {
        if (this.f35364z.complete()) {
            synchronized (this.f35342d) {
                try {
                    this.f35359u = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final long K0() {
        return this.f35340b;
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<e> L0() {
        return this.f35362x;
    }

    public final boolean Q0() {
        boolean z10;
        synchronized (this.f35342d) {
            z10 = this.f35347i.s() || this.f35348j.R() != 0 || this.f35358t > 0 || !this.f35349k.isEmpty() || N0() || androidx.compose.runtime.collection.c.m(this.f35351m);
        }
        return z10;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<e> U0() {
        return L0();
    }

    @Nullable
    public final Object W0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objX0 = kotlinx.coroutines.flow.k.x0(L0(), new h(null), dVar);
        return objX0 == kotlin.coroutines.intrinsics.b.l() ? objX0 : Unit.f312394a;
    }

    public final void Z0() {
        synchronized (this.f35342d) {
            this.f35361w = true;
            Unit unit = Unit.f312394a;
        }
    }

    @Override // androidx.compose.runtime.p0
    @p(scheme = "[0[0]]")
    public void a(@NotNull l1 l1Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) throws Throwable {
        e eVar;
        boolean z10;
        boolean zA0 = l1Var.a0();
        synchronized (this.f35342d) {
            try {
                e value = this.f35362x.getValue();
                eVar = e.ShuttingDown;
                if (value.compareTo(eVar) > 0) {
                    boolean zContains = Y0().contains(l1Var);
                    z10 = !zContains;
                    if (!zContains) {
                        n1(l1Var);
                    }
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.e eVarZ = aVar.z(h1(l1Var), z1(l1Var, null));
            try {
                androidx.compose.runtime.snapshots.m mVarU = eVarZ.u();
                try {
                    l1Var.P(function2);
                    Unit unit = Unit.f312394a;
                    eVarZ.B(mVarU);
                    w0(eVarZ);
                    synchronized (this.f35342d) {
                        try {
                            if (this.f35362x.getValue().compareTo(eVar) <= 0) {
                                x1(l1Var);
                            } else if (!Y0().contains(l1Var)) {
                                v0(l1Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!zA0) {
                        aVar.n();
                    }
                    try {
                        a1(l1Var);
                        try {
                            l1Var.Z();
                            l1Var.Q();
                            if (!zA0) {
                                aVar.n();
                            }
                        } catch (Throwable th4) {
                            g1(this, th4, null, false, 6, null);
                        }
                    } catch (Throwable th5) {
                        f1(th5, l1Var, true);
                    }
                } catch (Throwable th6) {
                    try {
                        eVarZ.B(mVarU);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            w0(eVarZ);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            Throwable th10 = th;
                            if (z10) {
                                synchronized (this.f35342d) {
                                    try {
                                        this.x1(l1Var);
                                        Unit unit2 = Unit.f312394a;
                                    } catch (Throwable th11) {
                                        throw th11;
                                    }
                                }
                            }
                            this.f1(th10, l1Var, true);
                        }
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            this = this;
        }
    }

    @Override // androidx.compose.runtime.p0
    @p(scheme = "[0[0]]")
    @NotNull
    public androidx.collection.c3<s4> b(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        try {
            t5 t5VarS = l1Var.S(t5Var);
            try {
                a(l1Var, function2);
                androidx.collection.c3<s4> c3VarA = (androidx.collection.l2) this.f35363y.a();
                if (c3VarA == null) {
                    c3VarA = androidx.collection.d3.a();
                }
                l1Var.S(t5VarS);
                this.f35363y.b(null);
                return c3VarA;
            } catch (Throwable th2) {
                l1Var.S(t5VarS);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f35363y.b(null);
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.p0
    public void c(@NotNull i3 i3Var) {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (this.f35342d) {
            try {
                androidx.compose.runtime.collection.c.a(this.f35351m, i3Var.c(), i3Var);
                if (i3Var.f() != null) {
                    F0(this, i3Var, i3Var);
                }
                nVarG0 = G0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    @Override // androidx.compose.runtime.p0
    public boolean e() {
        return G.get().booleanValue();
    }

    @Override // androidx.compose.runtime.p0
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.p0
    public boolean g() {
        return m0.K();
    }

    @Override // androidx.compose.runtime.p0
    public long h() {
        return 1000;
    }

    @Override // androidx.compose.runtime.p0
    @Nullable
    public o0 i() {
        return null;
    }

    @Override // androidx.compose.runtime.p0
    @NotNull
    public CoroutineContext k() {
        return this.A;
    }

    @Override // androidx.compose.runtime.p0
    @NotNull
    public CoroutineContext m() {
        return kotlin.coroutines.h.f312451a;
    }

    @Override // androidx.compose.runtime.p0
    public void n(@NotNull i3 i3Var) {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (this.f35342d) {
            this.f35350l.add(i3Var);
            nVarG0 = G0();
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    @Override // androidx.compose.runtime.p0
    public void o(@NotNull l1 l1Var) {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (this.f35342d) {
            if (this.f35348j.s(l1Var)) {
                nVarG0 = null;
            } else {
                this.f35348j.d(l1Var);
                nVarG0 = G0();
            }
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    @Override // androidx.compose.runtime.p0
    public void p(@NotNull s4 s4Var) {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (this.f35342d) {
            try {
                this.f35347i.C(s4Var);
                nVarG0 = G0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0070 A[Catch: all -> 0x0066, LOOP:0: B:9:0x002d->B:21:0x0070, LOOP_END, TryCatch #0 {all -> 0x0066, blocks: (B:4:0x0009, B:6:0x001a, B:9:0x002d, B:11:0x003d, B:13:0x004a, B:15:0x0055, B:18:0x0068, B:21:0x0070, B:22:0x0073), top: B:27:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[EDGE_INSN: B:30:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:9:0x002d->B:21:0x0070], SYNTHETIC] */
    @Override // androidx.compose.runtime.p0
    public void q(@NotNull i3 i3Var, @NotNull h3 h3Var, @NotNull androidx.compose.runtime.i<?> iVar) {
        synchronized (this.f35342d) {
            try {
                this.f35353o.q0(i3Var, h3Var);
                androidx.collection.s2<i3> s2VarJ = androidx.compose.runtime.collection.c.j(this.f35354p, i3Var);
                if (s2VarJ.I()) {
                    androidx.collection.a3<i3, h3> a3VarE = h3Var.e(iVar, s2VarJ);
                    Object[] objArr = a3VarE.f12131b;
                    Object[] objArr2 = a3VarE.f12132c;
                    long[] jArr = a3VarE.f12130a;
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
                                        Object obj = objArr[i13];
                                        this.f35353o.q0((i3) obj, (h3) objArr2[i13]);
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
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.p0
    @Nullable
    public h3 r(@NotNull i3 i3Var) {
        h3 h3VarL0;
        synchronized (this.f35342d) {
            try {
                h3VarL0 = this.f35353o.l0(i3Var);
            } finally {
            }
        }
        return h3VarL0;
    }

    public final void r1() {
        kotlinx.coroutines.n<Unit> nVarG0;
        synchronized (this.f35342d) {
            try {
                if (this.f35361w) {
                    this.f35361w = false;
                    nVarG0 = G0();
                } else {
                    nVarG0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVarG0 != null) {
            Result.a aVar = Result.Companion;
            nVarG0.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    @Override // androidx.compose.runtime.p0
    @NotNull
    public androidx.collection.c3<s4> s(@NotNull l1 l1Var, @NotNull t5 t5Var, @NotNull androidx.collection.c3<s4> c3Var) {
        try {
            l1();
            l1Var.Y(androidx.compose.runtime.collection.g.c(c3Var));
            t5 t5VarS = l1Var.S(t5Var);
            try {
                l1 l1VarD1 = d1(l1Var, null);
                if (l1VarD1 != null) {
                    a1(l1Var);
                    l1VarD1.Z();
                    l1VarD1.Q();
                }
                androidx.collection.c3<s4> c3VarA = (androidx.collection.l2) this.f35363y.a();
                if (c3VarA == null) {
                    c3VarA = androidx.collection.d3.a();
                }
                l1Var.S(t5VarS);
                this.f35363y.b(null);
                return c3VarA;
            } catch (Throwable th2) {
                l1Var.S(t5VarS);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f35363y.b(null);
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.p0
    public void t(@NotNull Set<androidx.compose.runtime.tooling.f> set) {
    }

    @NotNull
    public final androidx.compose.runtime.tooling.p u0(@NotNull androidx.compose.runtime.tooling.r rVar) {
        synchronized (this.f35342d) {
            try {
                androidx.collection.g2<androidx.compose.runtime.tooling.r> g2Var = this.B;
                int i10 = 0;
                if (g2Var == null) {
                    g2Var = new androidx.collection.g2<>(i10, 1, null);
                    this.B = g2Var;
                }
                g2Var.a0(rVar);
                List<l1> list = this.f35345g;
                int size = list.size();
                while (i10 < size) {
                    l1 l1Var = list.get(i10);
                    if (l1Var instanceof androidx.compose.runtime.tooling.x) {
                        rVar.b((androidx.compose.runtime.tooling.x) l1Var);
                    }
                    i10++;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new f(rVar);
    }

    @Override // androidx.compose.runtime.p0
    public void v(@NotNull l1 l1Var) {
    }

    @Nullable
    public final Object v1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ1 = j1(new k(null), dVar);
        return objJ1 == kotlin.coroutines.intrinsics.b.l() ? objJ1 : Unit.f312394a;
    }

    @Override // androidx.compose.runtime.p0
    public void w(@NotNull s4 s4Var) {
        androidx.collection.l2<s4> l2VarA = this.f35363y.a();
        if (l2VarA == null) {
            l2VarA = androidx.collection.d3.b();
            this.f35363y.b(l2VarA);
        }
        l2VarA.C(s4Var);
    }

    @c2
    @Nullable
    public final Object w1(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ1 = j1(new l(coroutineContext, this, null), dVar);
        return objJ1 == kotlin.coroutines.intrinsics.b.l() ? objJ1 : Unit.f312394a;
    }

    @Override // androidx.compose.runtime.p0
    public void x(@NotNull l1 l1Var) {
        synchronized (this.f35342d) {
            try {
                Set linkedHashSet = this.f35356r;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f35356r = linkedHashSet;
                }
                linkedHashSet.add(l1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final g5 x0() {
        return this.C;
    }

    @Nullable
    public final Object y0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objZ = kotlinx.coroutines.flow.k.z(kotlinx.coroutines.flow.k.X1(L0(), new g(null)), dVar);
        return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Unit.f312394a;
    }
}
