package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.v3;
import androidx.compose.foundation.gestures.v4;
import androidx.compose.foundation.gestures.x4;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.p2;
import androidx.compose.ui.layout.q2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,733:1\n85#2:734\n85#2:735\n117#2,2:736\n85#2:738\n117#2,2:739\n51#3,4:741\n1#4:745\n604#5,7:746\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n395#1:734\n484#1:735\n484#1:736,2\n487#1:738\n487#1:739,2\n505#1:741,4\n317#1:746,7\n*E\n"})
public final class x1 implements v4 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f17062z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d1 f17063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private u0 f17065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h1 f17067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3<u0> f17068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f17069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v4 f17071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private p2 f17074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final q2 f17075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.d f17076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<v0> f17077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.q f17078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.i1 f17079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final c1 f17080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.h1 f17081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final n3 f17084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n3 f17085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.k1 f17086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f17061y = new a(null);

    @NotNull
    private static final androidx.compose.runtime.saveable.c0<x1, ?> A = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.grid.r1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return x1.q((androidx.compose.runtime.saveable.g0) obj, (x1) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.lazy.grid.s1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return x1.r((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List h(androidx.compose.runtime.saveable.g0 g0Var, x1 x1Var) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(x1Var.F()), Integer.valueOf(x1Var.G())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x1 i(d1 d1Var, List list) {
            return new x1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), d1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List j(androidx.compose.runtime.saveable.g0 g0Var, x1 x1Var) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(x1Var.F()), Integer.valueOf(x1Var.G())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x1 k(androidx.compose.foundation.lazy.layout.w wVar, List list) {
            return new x1(wVar, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<x1, ?> e() {
            return x1.A;
        }

        @androidx.compose.foundation.b2
        @NotNull
        public final androidx.compose.runtime.saveable.c0<x1, ?> f(@NotNull final d1 d1Var) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.grid.v1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x1.a.h((androidx.compose.runtime.saveable.g0) obj, (x1) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.lazy.grid.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x1.a.i(d1Var, (List) obj);
                }
            });
        }

        @androidx.compose.foundation.b2
        @NotNull
        public final androidx.compose.runtime.saveable.c0<x1, ?> g(@NotNull final androidx.compose.foundation.lazy.layout.w wVar) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.grid.t1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x1.a.j((androidx.compose.runtime.saveable.g0) obj, (x1) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.lazy.grid.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x1.a.k(wVar, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", i = {}, l = {590}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17088b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17091e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f17090d = i10;
            this.f17091e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = x1.this.new b(this.f17090d, this.f17091e, dVar);
            bVar.f17088b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17087a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.layout.m1 m1VarA = j1.a(x1.this, (z3) this.f17088b);
                int i11 = this.f17090d;
                int i12 = this.f17091e;
                int iQ = x1.this.Q();
                androidx.compose.ui.unit.d dVarE = x1.this.E();
                this.f17087a = 1;
                if (androidx.compose.foundation.lazy.layout.p1.c(m1VarA, i11, i12, iQ, dVarE, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,733:1\n604#2,5:734\n610#2:744\n35#3,5:739\n59#4:745\n54#4:747\n90#5:746\n85#5:748\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n*L\n341#1:734,5\n341#1:744\n352#1:739,5\n363#1:745\n365#1:747\n363#1:746\n365#1:748\n*E\n"})
    public static final class c implements c1 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(List list, kotlin.jvm.internal.i1.f fVar, List list2, Function1 function1, int i10, u0 u0Var, androidx.compose.foundation.lazy.layout.i1.c cVar) {
            int iB = cVar.b();
            int iA = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                iA += (int) (u0Var.getOrientation() == q3.Vertical ? cVar.a(i11) & com.rabbitmq.client.k0.f265952a : cVar.a(i11) >> 32);
            }
            if (list != null) {
                list.add(Integer.valueOf(iA));
            }
            if (fVar.f312749a != list2.size()) {
                fVar.f312749a++;
            } else if (function1 != null && list != null) {
                function1.invoke(new b1(i10, list));
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.grid.c1
        public List<androidx.compose.foundation.lazy.layout.i1.b> a(final int i10, final Function1<? super a1, Unit> function1) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = function1 == null ? null : new ArrayList();
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            x1 x1Var = x1.this;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                final u0 u0VarB = x1Var.H() ? x1Var.B() : (u0) x1Var.f17068f.getValue();
                if (u0VarB != null) {
                    final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
                    fVar.f312749a = 1;
                    final List<Pair<Integer, androidx.compose.ui.unit.b>> listInvoke = u0VarB.u().invoke(Integer.valueOf(i10));
                    int size = listInvoke.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Pair<Integer, androidx.compose.ui.unit.b> pair = listInvoke.get(i11);
                        arrayList.add(x1Var.T().o(pair.getFirst().intValue(), pair.getSecond().x(), x1Var.f17066d, new Function1() { // from class: androidx.compose.foundation.lazy.grid.y1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return x1.c.d(arrayList2, fVar, listInvoke, function1, i10, u0VarB, (androidx.compose.foundation.lazy.layout.i1.c) obj);
                            }
                        }));
                    }
                    Unit unit = Unit.f312394a;
                }
                return arrayList;
            } finally {
                aVar.x(mVarG, mVarM, function1L);
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.c1
        public List<androidx.compose.foundation.lazy.layout.i1.b> b(int i10) {
            return a(i10, null);
        }
    }

    public static final class d implements q2 {
        d() {
        }

        @Override // androidx.compose.ui.layout.q2
        public void q6(p2 p2Var) {
            x1.this.f17074l = p2Var;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$requestScrollToItem$1", f = "LazyGridState.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17094a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x1.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17094a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x1 x1Var = x1.this;
                this.f17094a = 1;
                if (v3.j(x1Var, null, this, 1, null) == objL) {
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0}, l = {475, 476}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17098c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17100e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17098c = obj;
            this.f17100e |= Integer.MIN_VALUE;
            return x1.this.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17101a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17104d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f17103c = i10;
            this.f17104d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x1.this.new g(this.f17103c, this.f17104d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17101a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x1.this.n0(this.f17103c, this.f17104d, true);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.foundation.b2
    public x1() {
        this(0, 0, (d1) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void A(x1 x1Var, u0 u0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        x1Var.z(u0Var, z10, z11);
    }

    private static Object O(x1 x1Var) {
        return x1Var.f17067e.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return b0() * 100;
    }

    public static /* synthetic */ void U() {
    }

    private final void c0(float f10, n0 n0Var) {
        if (this.f17073k) {
            this.f17063a.d(this.f17080r, f10, n0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(x1 x1Var, int i10, m2 m2Var) {
        d1 d1Var = x1Var.f17063a;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        aVar.x(mVarG, aVar.m(mVarG), mVarG != null ? mVarG.l() : null);
        d1Var.a(m2Var, i10);
        return Unit.f312394a;
    }

    public static /* synthetic */ void g0(x1 x1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        x1Var.f0(i10, i11);
    }

    public static /* synthetic */ Object i0(x1 x1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return x1Var.h0(i10, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j0(x1 x1Var, float f10) {
        return -x1Var.d0(-f10);
    }

    private void k0(boolean z10) {
        this.f17085w.setValue(Boolean.valueOf(z10));
    }

    private void l0(boolean z10) {
        this.f17084v.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(androidx.compose.runtime.saveable.g0 g0Var, x1 x1Var) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(x1Var.F()), Integer.valueOf(x1Var.G())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 r(List list) {
        return new x1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object y(x1 x1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return x1Var.x(i10, i11, dVar);
    }

    @Nullable
    public final u0 B() {
        return this.f17065c;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f17076n;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.q D() {
        return this.f17078p;
    }

    @NotNull
    public final androidx.compose.ui.unit.d E() {
        return this.f17068f.getValue().q();
    }

    @e0.a
    public final int F() {
        return this.f17067e.a();
    }

    @e0.a
    public final int G() {
        return this.f17067e.c();
    }

    public final boolean H() {
        return this.f17064b;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h I() {
        return this.f17069g;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j J() {
        return this.f17069g;
    }

    @NotNull
    public final LazyLayoutItemAnimator<v0> K() {
        return this.f17077o;
    }

    @e0.a
    @NotNull
    public final n0 L() {
        return this.f17068f.getValue();
    }

    @NotNull
    public final n3<Unit> M() {
        return this.f17083u;
    }

    @NotNull
    public final IntRange N() {
        return this.f17067e.b().getValue();
    }

    public final int P() {
        return this.f17072j;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.h1 R() {
        return this.f17081s;
    }

    @NotNull
    public final n3<Unit> S() {
        return this.f17082t;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.i1 T() {
        return this.f17079q;
    }

    @NotNull
    public final d1 V() {
        return this.f17063a;
    }

    public final boolean W() {
        return this.f17073k;
    }

    @Nullable
    public final p2 X() {
        return this.f17074l;
    }

    @NotNull
    public final q2 Y() {
        return this.f17075m;
    }

    public final float Z() {
        return this.f17086x.c();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f17071i.a();
    }

    public final float a0() {
        return this.f17070h;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f17071i.b(f10);
    }

    public final int b0() {
        return this.f17068f.getValue().z();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r6.c(r7, r8, r0) == r1) goto L21;
     */
    @Override // androidx.compose.foundation.gestures.v4
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull androidx.compose.foundation.q3 r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.z3, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            r5 = 4
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.grid.x1.f
            if (r0 == 0) goto L16
            r0 = r9
            r5 = 4
            androidx.compose.foundation.lazy.grid.x1$f r0 = (androidx.compose.foundation.lazy.grid.x1.f) r0
            int r1 = r0.f17100e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r5 = 1
            r0.f17100e = r1
            goto L1b
        L16:
            androidx.compose.foundation.lazy.grid.x1$f r0 = new androidx.compose.foundation.lazy.grid.x1$f
            r0.<init>(r9)
        L1b:
            java.lang.Object r9 = r0.f17098c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 0
            int r2 = r0.f17100e
            r5 = 6
            r3 = 2
            r4 = 3
            r4 = 1
            r5 = 4
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            r5 = 4
            kotlin.ResultKt.m(r9)
            goto L6f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r7 = r0.f17097b
            r8 = r7
            r5 = 0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r0.f17096a
            androidx.compose.foundation.q3 r7 = (androidx.compose.foundation.q3) r7
            kotlin.ResultKt.m(r9)
            goto L5e
        L4a:
            kotlin.ResultKt.m(r9)
            androidx.compose.foundation.lazy.layout.d r9 = r6.f17076n
            r0.f17096a = r7
            r0.f17097b = r8
            r0.f17100e = r4
            java.lang.Object r9 = r9.b(r0)
            r5 = 2
            if (r9 != r1) goto L5e
            r5 = 3
            goto L6e
        L5e:
            androidx.compose.foundation.gestures.v4 r6 = r6.f17071i
            r9 = 5
            r9 = 0
            r0.f17096a = r9
            r0.f17097b = r9
            r0.f17100e = r3
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.x1.c(androidx.compose.foundation.q3, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public final float d0(float f10) {
        u0 u0Var;
        if ((f10 < 0.0f && !f()) || (f10 > 0.0f && !k())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f17070h) <= 0.5f)) {
            androidx.compose.foundation.internal.e.i("entered drag with non-zero pending scroll");
        }
        float f11 = this.f17070h + f10;
        this.f17070h = f11;
        if (Math.abs(f11) > 0.5f) {
            float f12 = this.f17070h;
            int iL0 = kotlin.math.b.L0(f12);
            u0 u0VarL = this.f17068f.getValue().l(iL0, !this.f17064b);
            if (u0VarL != null && (u0Var = this.f17065c) != null) {
                u0 u0VarL2 = u0Var != null ? u0Var.l(iL0, true) : null;
                if (u0VarL2 != null) {
                    this.f17065c = u0VarL2;
                } else {
                    u0VarL = null;
                }
            }
            if (u0VarL != null) {
                z(u0VarL, this.f17064b, true);
                n2.h(this.f17082t);
                c0(f12 - this.f17070h, u0VarL);
            } else {
                p2 p2Var = this.f17074l;
                if (p2Var != null) {
                    p2Var.h();
                }
                c0(f12 - this.f17070h, L());
            }
        }
        if (Math.abs(this.f17070h) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f17070h;
        this.f17070h = 0.0f;
        return f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean f() {
        return ((Boolean) this.f17084v.getValue()).booleanValue();
    }

    public final void f0(@androidx.annotation.g0(from = 0) int i10, int i11) {
        if (a()) {
            kotlinx.coroutines.k.f(this.f17068f.getValue().p(), null, null, new e(null), 3, null);
        }
        n0(i10, i11, false);
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.f17071i.g();
    }

    @Nullable
    public final Object h0(@androidx.annotation.g0(from = 0) int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = v4.h(this, null, new g(i10, i11, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.f17071i.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean k() {
        return ((Boolean) this.f17085w.getValue()).booleanValue();
    }

    public final void m0(boolean z10) {
        this.f17073k = z10;
    }

    public final void n0(int i10, int i11, boolean z10) {
        if (this.f17067e.a() != i10 || this.f17067e.c() != i11) {
            this.f17077o.p();
            Object obj = this.f17063a;
            androidx.compose.foundation.lazy.layout.g gVar = obj instanceof androidx.compose.foundation.lazy.layout.g ? (androidx.compose.foundation.lazy.layout.g) obj : null;
            if (gVar != null) {
                gVar.z();
            }
        }
        this.f17067e.d(i10, i11);
        if (!z10) {
            n2.h(this.f17083u);
            return;
        }
        p2 p2Var = this.f17074l;
        if (p2Var != null) {
            p2Var.h();
        }
    }

    public final int o0(@NotNull z zVar, int i10) {
        return this.f17067e.j(zVar, i10);
    }

    @Nullable
    public final Object x(@androidx.annotation.g0(from = 0) int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = v4.h(this, null, new b(i10, i11, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void z(@NotNull u0 u0Var, boolean z10, boolean z11) {
        this.f17079q.q(u0Var.h().size());
        if (!z10 && this.f17064b) {
            this.f17065c = u0Var;
            return;
        }
        if (z10) {
            this.f17064b = true;
        }
        this.f17070h -= u0Var.o();
        this.f17068f.setValue(u0Var);
        k0(u0Var.m());
        l0(u0Var.n());
        if (z11) {
            this.f17067e.i(u0Var.s());
        } else {
            this.f17067e.h(u0Var);
            if (this.f17073k) {
                this.f17063a.f(this.f17080r, u0Var);
            }
        }
        if (z10) {
            this.f17086x.g(u0Var.w(), u0Var.q(), u0Var.p());
        }
        this.f17072j++;
    }

    @androidx.compose.foundation.b2
    public x1(final int i10, int i11, @NotNull d1 d1Var) {
        this.f17063a = d1Var;
        h1 h1Var = new h1(i10, i11);
        this.f17067e = h1Var;
        this.f17068f = w6.k(e2.f16792a, w6.o());
        this.f17069g = androidx.compose.foundation.interaction.i.a();
        this.f17071i = x4.b(new Function1() { // from class: androidx.compose.foundation.lazy.grid.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(x1.j0(this.f16974a, ((Float) obj).floatValue()));
            }
        });
        this.f17073k = true;
        this.f17075m = new d();
        this.f17076n = new androidx.compose.foundation.lazy.layout.d();
        this.f17077o = new LazyLayoutItemAnimator<>();
        this.f17078p = new androidx.compose.foundation.lazy.layout.q();
        this.f17079q = new androidx.compose.foundation.lazy.layout.i1(d1Var.c(), new Function1() { // from class: androidx.compose.foundation.lazy.grid.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1.e0(this.f16982a, i10, (m2) obj);
            }
        });
        this.f17080r = new c();
        this.f17081s = new androidx.compose.foundation.lazy.layout.h1();
        h1Var.b();
        this.f17082t = n2.d(null, 1, null);
        this.f17083u = n2.d(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f17084v = d7.g(bool, null, 2, null);
        this.f17085w = d7.g(bool, null, 2, null);
        this.f17086x = new androidx.compose.foundation.lazy.layout.k1();
    }

    public /* synthetic */ x1(int i10, int i11, d1 d1Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? e1.b(0, 1, null) : d1Var);
    }

    public /* synthetic */ x1(androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
    }

    @androidx.compose.foundation.b2
    public x1(@NotNull androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11) {
        this(i10, i11, new androidx.compose.foundation.lazy.grid.g(wVar));
    }

    public /* synthetic */ x1(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public x1(int i10, int i11) {
        this(i10, i11, e1.b(0, 1, null));
    }
}
