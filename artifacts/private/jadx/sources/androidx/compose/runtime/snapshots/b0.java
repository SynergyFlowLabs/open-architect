package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2486:1\n1893#1:2487\n1893#1:2491\n1893#1:2498\n1893#1:2525\n1893#1:2529\n1893#1:2531\n2212#1,4:2537\n2216#1,4:2542\n1893#1:2575\n1893#1:2577\n1893#1:2579\n1893#1:2582\n1893#1:2584\n1893#1:2586\n1893#1:2613\n1893#1:2615\n1893#1:2619\n33#2:2488\n33#2:2489\n33#2:2492\n33#2:2499\n33#2:2526\n33#2:2530\n33#2:2532\n33#2:2576\n33#2:2578\n33#2:2580\n33#2:2583\n33#2:2585\n33#2:2587\n33#2:2614\n33#2:2616\n33#2:2620\n25#2,5:2621\n36#3:2490\n31#3:2527\n31#3:2528\n40#3:2533\n31#3:2534\n31#3:2535\n31#3:2536\n31#3:2541\n31#3:2546\n31#3:2617\n36#3:2618\n36#3:2626\n36#3:2627\n34#4,5:2493\n231#5,3:2500\n200#5,7:2503\n211#5,3:2511\n214#5,9:2515\n234#5:2524\n231#5,3:2588\n200#5,7:2591\n211#5,3:2599\n214#5,9:2603\n234#5:2612\n1399#6:2510\n1270#6:2514\n1399#6:2598\n1270#6:2602\n125#7,28:2547\n1#8:2581\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n707#1:2487\n1967#1:2491\n1986#1:2498\n2014#1:2525\n2074#1:2529\n2096#1:2531\n2196#1:2537,4\n2196#1:2542,4\n2248#1:2575\n2276#1:2577\n2286#1:2579\n2354#1:2582\n2365#1:2584\n2392#1:2586\n2448#1:2613\n2459#1:2615\n1999#1:2619\n707#1:2488\n1893#1:2489\n1967#1:2492\n1986#1:2499\n2014#1:2526\n2074#1:2530\n2096#1:2532\n2248#1:2576\n2276#1:2578\n2286#1:2580\n2354#1:2583\n2365#1:2585\n2392#1:2587\n2448#1:2614\n2459#1:2616\n1999#1:2620\n1886#1:2621,5\n1944#1:2490\n2038#1:2527\n2055#1:2528\n2121#1:2533\n2136#1:2534\n2175#1:2535\n2184#1:2536\n2196#1:2541\n2216#1:2546\n2480#1:2617\n2482#1:2618\n1904#1:2626\n1928#1:2627\n1980#1:2493,5\n1988#1:2500,3\n1988#1:2503,7\n1988#1:2511,3\n1988#1:2515,9\n1988#1:2524\n2414#1:2588,3\n2414#1:2591,7\n2414#1:2599,3\n2414#1:2603,9\n2414#1:2612\n1988#1:2510\n1988#1:2514\n2414#1:2598\n2414#1:2602\n2223#1:2547,28\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f36443b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static v f36446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f36447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final s f36448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final t0<c1> f36449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static List<? extends Function2<? super Set<? extends Object>, ? super m, Unit>> f36450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static List<? extends Function1<Object, Unit>> f36451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final c f36452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final m f36453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static androidx.compose.runtime.internal.a f36454m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<v, Unit> f36442a = new Function1() { // from class: androidx.compose.runtime.snapshots.y
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b0.O((v) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.internal.u0<m> f36444c = new androidx.compose.runtime.internal.u0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f36445d = new Object();

    static {
        v.a aVar = v.f36597e;
        f36446e = aVar.a();
        long j10 = 1;
        f36447f = w.s(1) + j10;
        f36448g = new s();
        f36449h = new t0<>();
        f36450i = CollectionsKt.emptyList();
        f36451j = CollectionsKt.emptyList();
        long j11 = f36447f;
        f36447f = j10 + j11;
        c cVar = new c(j11, aVar.a());
        f36446e = f36446e.B(cVar.p());
        f36452k = cVar;
        f36453l = cVar;
        f36454m = new androidx.compose.runtime.internal.a(0);
    }

    @kotlin.a1
    @NotNull
    public static final <T extends e1> T A0(@NotNull T t10, @NotNull c1 c1Var, @NotNull m mVar) {
        T t11;
        if (mVar.n()) {
            mVar.y(c1Var);
        }
        long jP = mVar.p();
        T t12 = (T) j0(t10, jP, mVar.i());
        if (t12 == null) {
            i0();
            throw new kotlin.a0();
        }
        if (t12.h() == mVar.p()) {
            return t12;
        }
        synchronized (Q()) {
            try {
                t11 = (T) j0(c1Var.A(), jP, mVar.i());
                if (t11 == null) {
                    i0();
                    throw new kotlin.a0();
                }
                if (t11.h() != jP) {
                    t11 = (T) b0(t11, c1Var, mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.h() != w.s(1)) {
            mVar.y(c1Var);
        }
        return t11;
    }

    @NotNull
    public static final v F(@NotNull v vVar, long j10, long j11) {
        while (Intrinsics.compare(j10, j11) < 0) {
            vVar = vVar.B(j10);
            j10 += (long) 1;
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x0096, LOOP:1: B:30:0x005e->B:42:0x00a0, LOOP_END, TryCatch #1 {all -> 0x0096, blocks: (B:25:0x004f, B:27:0x0054, B:30:0x005e, B:32:0x0073, B:34:0x0080, B:36:0x008b, B:39:0x0098, B:42:0x00a0, B:43:0x00a3), top: B:52:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3 A[EDGE_INSN: B:58:0x00a3->B:43:0x00a3 BREAK  A[LOOP:1: B:30:0x005e->B:42:0x00a0], SYNTHETIC] */
    public static final <T> T G(Function1<? super v, ? extends T> function1) {
        l2<c1> l2VarJ;
        T t10;
        c cVar = f36452k;
        synchronized (Q()) {
            try {
                l2VarJ = cVar.j();
                if (l2VarJ != null) {
                    f36454m.a(1);
                }
                t10 = (T) o0(cVar, function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l2VarJ != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super m, Unit>> list = f36450i;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke(androidx.compose.runtime.collection.g.c(l2VarJ), cVar);
                }
                f36454m.a(-1);
            } catch (Throwable th3) {
                f36454m.a(-1);
                throw th3;
            }
        }
        synchronized (Q()) {
            try {
                I();
                if (l2VarJ != null) {
                    Object[] objArr = l2VarJ.f12171b;
                    long[] jArr = l2VarJ.f12170a;
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
                                        h0((c1) objArr[(i11 << 3) + i13]);
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
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H() {
        G(f36442a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I() {
        t0<c1> t0Var = f36449h;
        int iE = t0Var.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            androidx.compose.runtime.internal.e1<c1> e1Var = t0Var.f()[i10];
            c1 c1Var = e1Var != null ? e1Var.get() : null;
            if (c1Var != null && g0(c1Var)) {
                if (i11 != i10) {
                    t0Var.f()[i11] = e1Var;
                    t0Var.d()[i11] = t0Var.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            t0Var.f()[i12] = null;
            t0Var.d()[i12] = 0;
        }
        if (i11 != iE) {
            t0Var.j(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m J(m mVar, Function1<Object, Unit> function1, boolean z10) {
        boolean z11 = mVar instanceof e;
        if (z11 || mVar == null) {
            return new i1(z11 ? (e) mVar : null, function1, null, false, z10);
        }
        return new j1(mVar, function1, false, z10);
    }

    static /* synthetic */ m K(m mVar, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return J(mVar, function1, z10);
    }

    @kotlin.a1
    @NotNull
    public static final <T extends e1> T L(@NotNull T t10) {
        T t11;
        m.a aVar = m.f36535e;
        m mVarF = aVar.f();
        T t12 = (T) j0(t10, mVarF.p(), mVarF.i());
        if (t12 != null) {
            return t12;
        }
        synchronized (Q()) {
            m mVarF2 = aVar.f();
            t11 = (T) j0(t10, mVarF2.p(), mVarF2.i());
        }
        if (t11 != null) {
            return t11;
        }
        i0();
        throw new kotlin.a0();
    }

    @kotlin.a1
    @NotNull
    public static final <T extends e1> T M(@NotNull T t10, @NotNull m mVar) {
        T t11;
        T t12 = (T) j0(t10, mVar.p(), mVar.i());
        if (t12 != null) {
            return t12;
        }
        synchronized (Q()) {
            try {
                t11 = (T) j0(t10, mVar.p(), mVar.i());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (t11 != null) {
            return t11;
        }
        i0();
        throw new kotlin.a0();
    }

    @NotNull
    public static final m N() {
        m mVarA = f36444c.a();
        return mVarA == null ? f36452k : mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(v vVar) {
        return Unit.f312394a;
    }

    private static final e1 P(e1 e1Var, Function1<? super e1, Boolean> function1) {
        e1 e1Var2 = e1Var;
        while (e1Var != null) {
            if (function1.invoke(e1Var).booleanValue()) {
                return e1Var;
            }
            if (Intrinsics.compare(e1Var2.h(), e1Var.h()) < 0) {
                e1Var2 = e1Var;
            }
            e1Var = e1Var.g();
        }
        return e1Var2;
    }

    @NotNull
    public static final Object Q() {
        return f36445d;
    }

    @kotlin.a1
    public static /* synthetic */ void R() {
    }

    @NotNull
    public static final m S() {
        return f36453l;
    }

    @kotlin.a1
    public static /* synthetic */ void T() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> U(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2, boolean z10) {
        if (!z10) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.W(function1, function2, obj);
            }
        };
    }

    static /* synthetic */ Function1 V(Function1 function1, Function1 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return U(function1, function2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> X(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.Y(function1, function2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f312394a;
    }

    @NotNull
    public static final <T extends e1> T Z(@NotNull T t10, @NotNull c1 c1Var) {
        T t11 = (T) t0(c1Var);
        if (t11 != null) {
            t11.j(Long.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.f(Long.MAX_VALUE);
        t12.i(c1Var.A());
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        c1Var.p(t12);
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    @NotNull
    public static final <T extends e1> T a0(@NotNull T t10, @NotNull c1 c1Var, @NotNull m mVar) {
        T t11;
        synchronized (Q()) {
            t11 = (T) b0(t10, c1Var, mVar);
        }
        return t11;
    }

    private static final <T extends e1> T b0(T t10, c1 c1Var, m mVar) {
        T t11 = (T) Z(t10, c1Var);
        t11.b(t10);
        t11.j(mVar.p());
        return t11;
    }

    @kotlin.a1
    public static final void c0(@NotNull m mVar, @NotNull c1 c1Var) {
        mVar.F(mVar.q() + 1);
        Function1<Object, Unit> function1R = mVar.r();
        if (function1R != null) {
            function1R.invoke(c1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<e1, e1> d0(long j10, e eVar, v vVar) {
        long[] jArr;
        Map<e1, e1> map;
        v vVar2;
        long[] jArr2;
        Map<e1, e1> map2;
        int i10;
        l2<c1> l2VarJ = eVar.j();
        Map<e1, e1> map3 = null;
        if (l2VarJ == null) {
            return null;
        }
        v vVarA = eVar.i().B(eVar.p()).A(eVar.S());
        Object[] objArr = l2VarJ.f12171b;
        long[] jArr3 = l2VarJ.f12170a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j11 = jArr3[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j11) < 128) {
                        c1 c1Var = (c1) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        e1 e1VarA = c1Var.A();
                        i10 = i12;
                        e1 e1VarJ0 = j0(e1VarA, j10, vVar);
                        if (e1VarJ0 == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            e1 e1VarJ1 = j0(e1VarA, j10, vVarA);
                            if (e1VarJ1 != null && !Intrinsics.areEqual(e1VarJ0, e1VarJ1)) {
                                e1 e1VarJ2 = j0(e1VarA, eVar.p(), eVar.i());
                                if (e1VarJ2 == null) {
                                    i0();
                                    throw new kotlin.a0();
                                }
                                e1 e1VarT = c1Var.t(e1VarJ1, e1VarJ0, e1VarJ2);
                                if (e1VarT == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(e1VarJ0, e1VarT);
                                map4 = map4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        i10 = i12;
                    }
                    j11 >>= i10;
                    i14++;
                    j10 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    vVarA = vVarA;
                }
                jArr = jArr3;
                map = map3;
                vVar2 = vVarA;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                vVar2 = vVarA;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            map3 = map;
            jArr3 = jArr;
            vVarA = vVar2;
        }
    }

    public static final <T extends e1, R> R e0(@NotNull T t10, @NotNull c1 c1Var, @NotNull T t11, @NotNull Function1<? super T, ? extends R> function1) {
        m mVarF;
        R rInvoke;
        synchronized (Q()) {
            try {
                mVarF = m.f36535e.f();
                rInvoke = function1.invoke(f0(t10, c1Var, mVarF, t11));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        c0(mVarF, c1Var);
        return rInvoke;
    }

    @NotNull
    public static final <T extends e1> T f0(@NotNull T t10, @NotNull c1 c1Var, @NotNull m mVar, @NotNull T t11) {
        T t12;
        if (mVar.n()) {
            mVar.y(c1Var);
        }
        long jP = mVar.p();
        if (t11.h() == jP) {
            return t11;
        }
        synchronized (Q()) {
            t12 = (T) Z(t10, c1Var);
        }
        t12.j(jP);
        if (t11.h() != w.s(1)) {
            mVar.y(c1Var);
        }
        return t12;
    }

    private static final boolean g0(c1 c1Var) {
        e1 e1Var;
        long jF = f36448g.f(f36447f);
        e1 e1Var2 = null;
        e1 e1VarA = null;
        int i10 = 0;
        for (e1 e1VarA2 = c1Var.A(); e1VarA2 != null; e1VarA2 = e1VarA2.g()) {
            long jH = e1VarA2.h();
            if (jH != f36443b) {
                if (Intrinsics.compare(jH, jF) >= 0) {
                    i10++;
                } else if (e1Var2 == null) {
                    i10++;
                    e1Var2 = e1VarA2;
                } else {
                    if (Intrinsics.compare(e1VarA2.h(), e1Var2.h()) < 0) {
                        e1Var = e1Var2;
                        e1Var2 = e1VarA2;
                    } else {
                        e1Var = e1VarA2;
                    }
                    if (e1VarA == null) {
                        e1VarA = c1Var.A();
                        e1 e1Var3 = e1VarA;
                        while (true) {
                            if (e1VarA == null) {
                                e1VarA = e1Var3;
                                break;
                            }
                            if (Intrinsics.compare(e1VarA.h(), jF) >= 0) {
                                break;
                            }
                            if (Intrinsics.compare(e1Var3.h(), e1VarA.h()) < 0) {
                                e1Var3 = e1VarA;
                            }
                            e1VarA = e1VarA.g();
                        }
                    }
                    e1Var2.j(f36443b);
                    e1Var2.b(e1VarA);
                    e1Var2 = e1Var;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(c1 c1Var) {
        if (g0(c1Var)) {
            f36449h.a(c1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends e1> T j0(T t10, long j10, v vVar) {
        T t11 = null;
        while (t10 != null) {
            if (v0(t10, j10, vVar) && (t11 == null || Intrinsics.compare(t11.h(), t10.h()) < 0)) {
                t11 = t10;
            }
            t10 = (T) t10.g();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @NotNull
    public static final <T extends e1> T k0(@NotNull T t10, @NotNull c1 c1Var) {
        T t11;
        m.a aVar = m.f36535e;
        m mVarF = aVar.f();
        Function1<Object, Unit> function1L = mVarF.l();
        if (function1L != null) {
            function1L.invoke(c1Var);
        }
        T t12 = (T) j0(t10, mVarF.p(), mVarF.i());
        if (t12 != null) {
            return t12;
        }
        synchronized (Q()) {
            m mVarF2 = aVar.f();
            e1 e1VarA = c1Var.A();
            Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) j0(e1VarA, mVarF2.p(), mVarF2.i());
            if (t11 == null) {
                i0();
                throw new kotlin.a0();
            }
        }
        return t11;
    }

    @NotNull
    public static final <T extends e1> T l0(@NotNull T t10, @NotNull c1 c1Var, @NotNull m mVar) {
        T t11;
        Function1<Object, Unit> function1L = mVar.l();
        if (function1L != null) {
            function1L.invoke(c1Var);
        }
        T t12 = (T) j0(t10, mVar.p(), mVar.i());
        if (t12 != null) {
            return t12;
        }
        synchronized (Q()) {
            try {
                m mVarF = m.f36535e.f();
                e1 e1VarA = c1Var.A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
                t11 = (T) j0(e1VarA, mVarF.p(), mVarF.i());
                if (t11 == null) {
                    i0();
                    throw new kotlin.a0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    public static final void m0(int i10) {
        f36448g.h(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void n0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T o0(c cVar, Function1<? super v, ? extends T> function1) {
        long jP = cVar.p();
        T tInvoke = function1.invoke(f36446e.s(jP));
        long j10 = f36447f;
        f36447f = ((long) 1) + j10;
        f36446e = f36446e.s(jP);
        cVar.E(j10);
        cVar.D(f36446e);
        cVar.F(0);
        cVar.d0(null);
        cVar.z();
        f36446e = f36446e.B(j10);
        return tInvoke;
    }

    @kotlin.a1
    public static final <T> T p0(@NotNull Function0<? extends T> function0) {
        T tInvoke;
        synchronized (Q()) {
            try {
                tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends m> T q0(final Function1<? super v, ? extends T> function1) {
        return (T) G(new Function1() { // from class: androidx.compose.runtime.snapshots.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.r0(function1, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m r0(Function1 function1, v vVar) {
        m mVar = (m) function1.invoke(vVar);
        synchronized (Q()) {
            try {
                f36446e = f36446e.B(mVar.p());
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public static final int s0(long j10, @NotNull v vVar) {
        int iA;
        long jW = vVar.w(j10);
        synchronized (Q()) {
            iA = f36448g.a(jW);
        }
        return iA;
    }

    private static final e1 t0(c1 c1Var) {
        long jF = f36448g.f(f36447f) - ((long) 1);
        v vVarA = v.f36597e.a();
        e1 e1Var = null;
        for (e1 e1VarA = c1Var.A(); e1VarA != null; e1VarA = e1VarA.g()) {
            if (e1VarA.h() != f36443b) {
                if (v0(e1VarA, jF, vVarA)) {
                    if (e1Var == null) {
                        e1Var = e1VarA;
                    } else if (Intrinsics.compare(e1VarA.h(), e1Var.h()) >= 0) {
                        return e1Var;
                    }
                }
            }
            return e1VarA;
        }
        return null;
    }

    private static final boolean u0(long j10, long j11, v vVar) {
        return (j11 == f36443b || Intrinsics.compare(j11, j10) > 0 || vVar.v(j11)) ? false : true;
    }

    private static final boolean v0(e1 e1Var, long j10, v vVar) {
        return u0(j10, e1Var.h(), vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(m mVar) {
        long jF;
        if (f36446e.v(mVar.p())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(mVar.p());
        sb2.append(", disposed=");
        sb2.append(mVar.f());
        sb2.append(", applied=");
        e eVar = mVar instanceof e ? (e) mVar : null;
        sb2.append(eVar != null ? Boolean.valueOf(eVar.Q()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (Q()) {
            try {
                jF = f36448g.f(-1L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        sb2.append(jF);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends e1, R> R x0(@NotNull T t10, @NotNull Function1<? super T, ? extends R> function1) {
        return function1.invoke(L(t10));
    }

    public static final <T extends e1, R> R y0(@NotNull T t10, @NotNull c1 c1Var, @NotNull m mVar, @NotNull Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (Q()) {
            try {
                rInvoke = function1.invoke(A0(t10, c1Var, mVar));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        c0(mVar, c1Var);
        return rInvoke;
    }

    public static final <T extends e1, R> R z0(@NotNull T t10, @NotNull c1 c1Var, @NotNull Function1<? super T, ? extends R> function1) {
        m mVarF;
        R rInvoke;
        synchronized (Q()) {
            try {
                mVarF = m.f36535e.f();
                rInvoke = function1.invoke(A0(t10, c1Var, mVarF));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        c0(mVarF, c1Var);
        return rInvoke;
    }
}
