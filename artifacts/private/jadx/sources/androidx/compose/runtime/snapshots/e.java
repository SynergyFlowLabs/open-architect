package androidx.compose.runtime.snapshots;

import androidx.collection.d3;
import androidx.collection.l2;
import androidx.compose.runtime.f4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2486:1\n1102#1,2:2499\n1108#1,3:2505\n1111#1:2510\n1112#1,5:2513\n1102#1,2:2601\n1108#1,3:2608\n1111#1:2613\n1112#1,5:2616\n1102#1,9:2701\n1111#1:2712\n1112#1,5:2715\n166#2,12:2487\n178#2,2:2518\n166#2,12:2589\n178#2,2:2621\n1893#3:2501\n1893#3:2508\n1893#3:2520\n1893#3:2532\n1893#3:2603\n1893#3:2611\n1893#3:2689\n1893#3:2697\n1893#3:2710\n1893#3:2720\n1893#3:2722\n33#4:2502\n33#4:2509\n33#4:2521\n33#4:2533\n33#4:2604\n33#4:2612\n33#4:2690\n33#4:2698\n33#4:2711\n33#4:2721\n33#4:2723\n36#5:2503\n36#5:2504\n36#5:2512\n36#5:2606\n36#5:2607\n36#5:2615\n36#5:2699\n36#5:2700\n36#5:2714\n1#6:2511\n1#6:2605\n1#6:2614\n1#6:2678\n1#6:2713\n1#6:2724\n34#7,5:2522\n34#7,5:2527\n34#7,5:2584\n34#7,3:2686\n38#7:2691\n34#7,5:2692\n231#8,3:2534\n200#8,7:2537\n211#8,3:2545\n214#8,9:2549\n234#8:2558\n231#8,3:2559\n200#8,7:2562\n211#8,3:2570\n214#8,9:2574\n234#8:2583\n231#8,3:2636\n200#8,7:2639\n211#8,3:2647\n214#8,9:2651\n234#8:2660\n231#8,3:2661\n200#8,7:2664\n211#8,3:2672\n214#8,2:2676\n217#8,6:2679\n234#8:2685\n1399#9:2544\n1270#9:2548\n1399#9:2569\n1270#9:2573\n1399#9:2646\n1270#9:2650\n1399#9:2671\n1270#9:2675\n34#10,4:2623\n49#10,4:2627\n49#10,4:2632\n206#11:2631\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n772#1:2499,2\n772#1:2505,3\n772#1:2510\n772#1:2513,5\n924#1:2601,2\n924#1:2608,3\n924#1:2613\n924#1:2616,5\n1119#1:2701,9\n1119#1:2712\n1119#1:2715,5\n769#1:2487,12\n769#1:2518,2\n918#1:2589,12\n918#1:2621,2\n773#1:2501\n772#1:2508\n831#1:2520\n887#1:2532\n925#1:2603\n924#1:2611\n1085#1:2689\n1110#1:2697\n1119#1:2710\n1122#1:2720\n1143#1:2722\n773#1:2502\n772#1:2509\n831#1:2521\n887#1:2533\n925#1:2604\n924#1:2612\n1085#1:2690\n1110#1:2698\n1119#1:2711\n1122#1:2721\n1143#1:2723\n775#1:2503\n781#1:2504\n772#1:2512\n926#1:2606\n930#1:2607\n924#1:2615\n1111#1:2699\n1114#1:2700\n1119#1:2714\n772#1:2511\n924#1:2614\n1119#1:2713\n873#1:2522,5\n879#1:2527,5\n892#1:2584,5\n1082#1:2686,3\n1082#1:2691\n1093#1:2692,5\n890#1:2534,3\n890#1:2537,7\n890#1:2545,3\n890#1:2549,9\n890#1:2558\n891#1:2559,3\n891#1:2562,7\n891#1:2570,3\n891#1:2574,9\n891#1:2583\n990#1:2636,3\n990#1:2639,7\n990#1:2647,3\n990#1:2651,9\n990#1:2660\n1025#1:2661,3\n1025#1:2664,7\n1025#1:2672,3\n1025#1:2676,2\n1025#1:2679,6\n1025#1:2685\n890#1:2544\n890#1:2548\n891#1:2569\n891#1:2573\n990#1:2646\n990#1:2650\n1025#1:2671\n1025#1:2675\n944#1:2623,4\n968#1:2627,4\n972#1:2632,4\n972#1:2631\n*E\n"})
public class e extends m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final a f36461q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f36462r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final int[] f36463s = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f36464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f36465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private l2<c1> f36467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private List<? extends c1> f36468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private v f36469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private int[] f36470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36472p;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(long j10, @NotNull v vVar, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        super(j10, vVar, (DefaultConstructorMarker) null);
        this.f36464h = function1;
        this.f36465i = function2;
        this.f36469m = v.f36597e.a();
        this.f36470n = f36463s;
        this.f36471o = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[LOOP:0: B:7:0x001f->B:24:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[EDGE_INSN: B:28:0x0085->B:25:0x0085 BREAK  A[LOOP:0: B:7:0x001f->B:24:0x0082], SYNTHETIC] */
    private final void M() {
        l2<c1> l2VarJ = j();
        if (l2VarJ != null) {
            i0();
            d0(null);
            long jP = p();
            Object[] objArr = l2VarJ.f12171b;
            long[] jArr = l2VarJ.f12170a;
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
                                for (e1 e1VarA = ((c1) objArr[(i10 << 3) + i12]).A(); e1VarA != null; e1VarA = e1VarA.g()) {
                                    if (e1VarA.h() == jP || CollectionsKt.contains(this.f36469m, Long.valueOf(e1VarA.h()))) {
                                        e1VarA.j(b0.f36443b);
                                    }
                                }
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
        b();
    }

    private final void a0() {
        int length = this.f36470n.length;
        for (int i10 = 0; i10 < length; i10++) {
            b0.m0(this.f36470n[i10]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e h0(e eVar, Function1 function1, Function1 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return eVar.g0(function1, function2);
    }

    private final void i0() {
        if (this.f36472p) {
            f4.e("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void j0() {
        if (!(!this.f36472p || ((m) this).f36541d >= 0)) {
            f4.e("Unsupported operation on a disposed or applied snapshot");
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void A() {
        a0();
        super.A();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void F(int i10) {
        this.f36466j = i10;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m G(@Nullable Function1<Object, Unit> function1) {
        Map<m0.b, m0.a> second;
        long j10;
        g gVar;
        L();
        j0();
        long jP = p();
        e eVar = this instanceof c ? null : this;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar2 = m0.e.f322707a;
        Function1<Object, Unit> function2 = function1;
        if (gVar2 != null) {
            Pair<m0.a, Map<m0.b, m0.a>> pairI = m0.e.i(gVar2, eVar, true, function2, null);
            m0.a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            first.b();
            second = pairI.getSecond();
            function2 = function1A;
        } else {
            second = null;
        }
        W(p());
        synchronized (b0.Q()) {
            long j11 = b0.f36447f;
            j10 = 1;
            b0.f36447f += j10;
            b0.f36446e = b0.f36446e.B(j11);
            gVar = new g(j11, b0.F(i(), jP + j10, j11), b0.V(function2, l(), false, 4, null), this);
        }
        if (!Q() && !f()) {
            long jP2 = p();
            synchronized (b0.Q()) {
                long j12 = b0.f36447f;
                b0.f36447f += j10;
                E(j12);
                b0.f36446e = b0.f36446e.B(p());
                Unit unit = Unit.f312394a;
            }
            D(b0.F(i(), jP2 + j10, p()));
        }
        if (gVar2 != null) {
            m0.e.e(gVar2, eVar, gVar, second);
        }
        return gVar;
    }

    public final <T> T N(@NotNull Function0<? extends T> function0) {
        long j10;
        W(p());
        T tInvoke = function0.invoke();
        if (Q() || f()) {
            return tInvoke;
        }
        long jP = p();
        synchronized (b0.Q()) {
            try {
                long j11 = b0.f36447f;
                j10 = 1;
                b0.f36447f += j10;
                E(j11);
                b0.f36446e = b0.f36446e.B(p());
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        D(b0.F(i(), jP + j10, p()));
        return tInvoke;
    }

    public final void O() {
        long j10;
        W(p());
        Unit unit = Unit.f312394a;
        if (Q() || f()) {
            return;
        }
        long jP = p();
        synchronized (b0.Q()) {
            try {
                long j11 = b0.f36447f;
                j10 = 1;
                b0.f36447f += j10;
                E(j11);
                b0.f36446e = b0.f36446e.B(p());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        D(b0.F(i(), jP + j10, p()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018d A[EDGE_INSN: B:102:0x018d->B:77:0x018d BREAK  A[LOOP:4: B:66:0x015e->B:76:0x018a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0149 A[Catch: all -> 0x013e, LOOP:2: B:48:0x0114->B:60:0x0149, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f3, B:45:0x0108, B:48:0x0114, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:63:0x0154, B:66:0x015e, B:68:0x0168, B:70:0x0172, B:72:0x0178, B:73:0x0182, B:76:0x018a, B:77:0x018d, B:79:0x0191, B:81:0x019b, B:82:0x01a7, B:60:0x0149), top: B:92:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x018a A[Catch: all -> 0x013e, LOOP:4: B:66:0x015e->B:76:0x018a, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f3, B:45:0x0108, B:48:0x0114, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:63:0x0154, B:66:0x015e, B:68:0x0168, B:70:0x0172, B:72:0x0178, B:73:0x0182, B:76:0x018a, B:77:0x018d, B:79:0x0191, B:81:0x019b, B:82:0x01a7, B:60:0x0149), top: B:92:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0152 A[EDGE_INSN: B:97:0x0152->B:62:0x0152 BREAK  A[LOOP:2: B:48:0x0114->B:60:0x0149], SYNTHETIC] */
    @NotNull
    public o P() {
        Map<e1, ? extends e1> mapD0;
        List list;
        l2<c1> l2VarJ;
        long j10;
        long j11;
        l2<c1> l2VarJ2 = j();
        if (l2VarJ2 != null) {
            c cVar = b0.f36452k;
            mapD0 = b0.d0(cVar.p(), this, b0.f36446e.s(cVar.p()));
        } else {
            mapD0 = null;
        }
        List listEmptyList = CollectionsKt.emptyList();
        synchronized (b0.Q()) {
            try {
                b0.w0(this);
                if (l2VarJ2 == null || l2VarJ2.q() == 0) {
                    c();
                    c cVar2 = b0.f36452k;
                    l2<c1> l2VarJ3 = cVar2.j();
                    b0.o0(cVar2, b0.f36442a);
                    if (l2VarJ3 == null || !l2VarJ3.s()) {
                        list = listEmptyList;
                        l2VarJ = null;
                    } else {
                        list = b0.f36450i;
                        l2VarJ = l2VarJ3;
                    }
                } else {
                    c cVar3 = b0.f36452k;
                    o oVarV = V(b0.f36447f, l2VarJ2, mapD0, b0.f36446e.s(cVar3.p()));
                    if (!Intrinsics.areEqual(oVarV, o.b.f36549b)) {
                        return oVarV;
                    }
                    c();
                    l2VarJ = cVar3.j();
                    b0.o0(cVar3, b0.f36442a);
                    d0(null);
                    cVar3.d0(null);
                    list = b0.f36450i;
                }
                Unit unit = Unit.f312394a;
                this.f36472p = true;
                if (l2VarJ != null) {
                    Set setC = androidx.compose.runtime.collection.g.c(l2VarJ);
                    if (!setC.isEmpty()) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((Function2) list.get(i10)).invoke(setC, this);
                        }
                    }
                }
                if (l2VarJ2 != null && l2VarJ2.s()) {
                    Set setC2 = androidx.compose.runtime.collection.g.c(l2VarJ2);
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((Function2) list.get(i11)).invoke(setC2, this);
                    }
                }
                m0.e.f(this, l2VarJ2);
                synchronized (b0.Q()) {
                    try {
                        A();
                        b0.I();
                        if (l2VarJ != null) {
                            Object[] objArr = l2VarJ.f12171b;
                            long[] jArr = l2VarJ.f12170a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j10 = 128;
                                while (true) {
                                    long j12 = jArr[i12];
                                    j11 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j12 & 255) < 128) {
                                                b0.h0((c1) objArr[(i12 << 3) + i14]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j10 = 128;
                                j11 = 255;
                            }
                        } else {
                            j10 = 128;
                            j11 = 255;
                        }
                        if (l2VarJ2 != null) {
                            Object[] objArr2 = l2VarJ2.f12171b;
                            long[] jArr2 = l2VarJ2.f12170a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j13 = jArr2[i15];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j13 & j11) < j10) {
                                                b0.h0((c1) objArr2[(i15 << 3) + i17]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        List<? extends c1> list2 = this.f36468l;
                        if (list2 != null) {
                            int size3 = list2.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                b0.h0(list2.get(i18));
                            }
                        }
                        this.f36468l = null;
                        Unit unit2 = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return o.b.f36549b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean Q() {
        return this.f36472p;
    }

    @Nullable
    public final List<c1> R() {
        return this.f36468l;
    }

    @NotNull
    public final v S() {
        return this.f36469m;
    }

    @NotNull
    public final int[] T() {
        return this.f36470n;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    /* JADX INFO: renamed from: U */
    public Function1<Object, Unit> l() {
        return this.f36464h;
    }

    @NotNull
    public final o V(long j10, @NotNull l2<c1> l2Var, @Nullable Map<e1, ? extends e1> map, @NotNull v vVar) {
        v vVar2;
        Object[] objArr;
        long[] jArr;
        v vVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j11;
        int i11;
        e1 e1VarT;
        v vVarA = i().B(p()).A(this.f36469m);
        Object[] objArr3 = l2Var.f12171b;
        long[] jArr3 = l2Var.f12170a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends c1> listPlus = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j12 = jArr3[i12];
                List<? extends c1> arrayList2 = listPlus;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            i10 = i13;
                            c1 c1Var = (c1) objArr3[(i12 << 3) + i15];
                            objArr2 = objArr3;
                            e1 e1VarA = c1Var.A();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            e1 e1VarJ0 = b0.j0(e1VarA, j10, vVar);
                            if (e1VarJ0 == null) {
                                j11 = j12;
                            } else {
                                j11 = j12;
                                e1 e1VarJ1 = b0.j0(e1VarA, p(), vVarA);
                                if (e1VarJ1 != null && e1VarJ1.h() != w.s(1) && !Intrinsics.areEqual(e1VarJ0, e1VarJ1)) {
                                    i11 = i15;
                                    vVar3 = vVarA;
                                    e1 e1VarJ2 = b0.j0(e1VarA, p(), i());
                                    if (e1VarJ2 == null) {
                                        b0.i0();
                                        throw new kotlin.a0();
                                    }
                                    if (map == null || (e1VarT = map.get(e1VarJ0)) == null) {
                                        e1VarT = c1Var.t(e1VarJ1, e1VarJ0, e1VarJ2);
                                    }
                                    if (e1VarT == null) {
                                        return new o.a(this);
                                    }
                                    if (!Intrinsics.areEqual(e1VarT, e1VarJ2)) {
                                        if (Intrinsics.areEqual(e1VarT, e1VarJ0)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(TuplesKt.to(c1Var, e1VarJ0.f(p())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends c1> list = arrayList2;
                                            list.add(c1Var);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!Intrinsics.areEqual(e1VarT, e1VarJ1) ? TuplesKt.to(c1Var, e1VarT) : TuplesKt.to(c1Var, e1VarJ1.f(p())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            vVar3 = vVarA;
                            i11 = i15;
                            arrayList = arrayList3;
                        } else {
                            vVar3 = vVarA;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j11 = j12;
                            i11 = i15;
                        }
                        j12 = j11 >> i10;
                        i15 = i11 + 1;
                        objArr3 = objArr2;
                        i13 = i10;
                        jArr3 = jArr2;
                        vVarA = vVar3;
                    }
                    vVar2 = vVarA;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i14 != i13) {
                        listPlus = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    vVar2 = vVarA;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listPlus = arrayList2;
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                vVarA = vVar2;
            }
        }
        if (arrayList != null) {
            O();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Pair pair = (Pair) arrayList.get(i16);
                c1 c1Var2 = (c1) pair.component1();
                e1 e1Var = (e1) pair.component2();
                e1Var.j(j10);
                synchronized (b0.Q()) {
                    e1Var.i(c1Var2.A());
                    c1Var2.p(e1Var);
                    Unit unit = Unit.f312394a;
                }
            }
        }
        if (listPlus != null) {
            int size2 = listPlus.size();
            for (int i17 = 0; i17 < size2; i17++) {
                l2Var.g0(listPlus.get(i17));
            }
            List<? extends c1> list2 = this.f36468l;
            if (list2 != null) {
                listPlus = CollectionsKt.plus((Collection) list2, (Iterable) listPlus);
            }
            this.f36468l = listPlus;
        }
        return o.b.f36549b;
    }

    public final void W(long j10) {
        synchronized (b0.Q()) {
            try {
                this.f36469m = this.f36469m.B(j10);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void X(@NotNull v vVar) {
        synchronized (b0.Q()) {
            try {
                this.f36469m = this.f36469m.A(vVar);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0) {
            this.f36470n = ArraysKt.plus(this.f36470n, i10);
        }
    }

    public final void Z(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f36470n;
        if (iArr2.length != 0) {
            iArr = ArraysKt.plus(iArr2, iArr);
        }
        this.f36470n = iArr;
    }

    public final void b0(boolean z10) {
        this.f36472p = z10;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void c() {
        b0.f36446e = b0.f36446e.s(p()).p(this.f36469m);
    }

    public final void c0(@Nullable List<? extends c1> list) {
        this.f36468l = list;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (f()) {
            return;
        }
        super.d();
        w(this);
        m0.e.g(this);
    }

    public void d0(@Nullable l2<c1> l2Var) {
        this.f36467k = l2Var;
    }

    public final void e0(@NotNull v vVar) {
        this.f36469m = vVar;
    }

    public final void f0(@NotNull int[] iArr) {
        this.f36470n = iArr;
    }

    @NotNull
    public e g0(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        Map<m0.b, m0.a> second;
        long j10;
        f fVar;
        L();
        j0();
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = m0.e.f322707a;
        Function1<Object, Unit> function3 = function1;
        Function1<Object, Unit> function1B = function2;
        if (gVar != null) {
            Pair<m0.a, Map<m0.b, m0.a>> pairI = m0.e.i(gVar, this, false, function3, function1B);
            m0.a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            function1B = first.b();
            second = pairI.getSecond();
            function3 = function1A;
        } else {
            second = null;
        }
        W(p());
        synchronized (b0.Q()) {
            long j11 = b0.f36447f;
            j10 = 1;
            b0.f36447f += j10;
            b0.f36446e = b0.f36446e.B(j11);
            v vVarI = i();
            D(vVarI.B(j11));
            fVar = new f(j11, b0.F(vVarI, p() + j10, j11), b0.V(function3, l(), false, 4, null), b0.X(function1B, r()), this);
        }
        if (!Q() && !f()) {
            long jP = p();
            synchronized (b0.Q()) {
                long j12 = b0.f36447f;
                b0.f36447f += j10;
                E(j12);
                b0.f36446e = b0.f36446e.B(p());
                Unit unit = Unit.f312394a;
            }
            D(b0.F(i(), jP + j10, p()));
        }
        if (gVar != null) {
            m0.e.e(gVar, this, fVar, second);
        }
        return fVar;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public l2<c1> j() {
        return this.f36467k;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean n() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m o() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public int q() {
        return this.f36466j;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public Function1<Object, Unit> r() {
        return this.f36465i;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean s() {
        l2<c1> l2VarJ = j();
        return l2VarJ != null && l2VarJ.s();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void v(@NotNull m mVar) {
        this.f36471o++;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void w(@NotNull m mVar) {
        if (!(this.f36471o > 0)) {
            f4.d("no pending nested snapshots");
        }
        int i10 = this.f36471o - 1;
        this.f36471o = i10;
        if (i10 == 0 && !this.f36472p) {
            M();
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void x() {
        if (!this.f36472p && !f()) {
            O();
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void y(@NotNull c1 c1Var) {
        l2<c1> l2VarJ = j();
        if (l2VarJ == null) {
            l2VarJ = d3.b();
            d0(l2VarJ);
        }
        l2VarJ.C(c1Var);
    }
}
