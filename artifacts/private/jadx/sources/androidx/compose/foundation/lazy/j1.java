package androidx.compose.foundation.lazy;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.q3;
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
import java.util.List;
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
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,719:1\n85#2:720\n85#2:721\n117#2,2:722\n85#2:724\n117#2,2:725\n51#3,4:727\n26#4:731\n1#5:732\n604#6,7:733\n604#6,7:740\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n360#1:720\n452#1:721\n452#1:722,2\n455#1:724\n455#1:725,2\n475#1:727,4\n486#1:731\n577#1:733,7\n319#1:740,7\n*E\n"})
public final class j1 implements v4 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f17170z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t0 f17171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private m0 f17173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0 f17175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3<m0> f17176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f17177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v4 f17179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private p2 f17182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final q2 f17183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.d f17184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<n0> f17185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.q f17186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.i1 f17187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final s0 f17188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.h1 f17189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final n3 f17191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final n3 f17192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.k1 f17194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f17169y = new a(null);

    @NotNull
    private static final androidx.compose.runtime.saveable.c0<j1, ?> A = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.b1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return j1.q((androidx.compose.runtime.saveable.g0) obj, (j1) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.lazy.c1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j1.r((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List h(androidx.compose.runtime.saveable.g0 g0Var, j1 j1Var) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(j1Var.E()), Integer.valueOf(j1Var.F())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j1 i(t0 t0Var, List list) {
            return new j1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), t0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List j(androidx.compose.runtime.saveable.g0 g0Var, j1 j1Var) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(j1Var.E()), Integer.valueOf(j1Var.F())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j1 k(androidx.compose.foundation.lazy.layout.w wVar, List list) {
            return new j1(wVar, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<j1, ?> e() {
            return j1.A;
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<j1, ?> f(@NotNull final t0 t0Var) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j1.a.h((androidx.compose.runtime.saveable.g0) obj, (j1) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.lazy.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.a.i(t0Var, (List) obj);
                }
            });
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<j1, ?> g(@NotNull final androidx.compose.foundation.lazy.layout.w wVar) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.h1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j1.a.j((androidx.compose.runtime.saveable.g0) obj, (j1) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.lazy.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j1.a.k(wVar, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17196b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17199e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f17198d = i10;
            this.f17199e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = j1.this.new b(this.f17198d, this.f17199e, dVar);
            bVar.f17196b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17195a;
            boolean z10 = true & true;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.layout.m1 m1VarA = z0.a(j1.this, (z3) this.f17196b);
                int i11 = this.f17198d;
                int i12 = this.f17199e;
                androidx.compose.ui.unit.d dVarD = j1.this.D();
                this.f17195a = 1;
                if (androidx.compose.foundation.lazy.layout.p1.c(m1VarA, i11, i12, 100, dVarD, this) == objL) {
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

    @SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchScope$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,719:1\n604#2,7:720\n59#3:727\n54#3:729\n90#4:728\n85#4:730\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchScope$1\n*L\n332#1:720,7\n343#1:727\n345#1:729\n343#1:728\n345#1:730\n*E\n"})
    public static final class c implements s0 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i10, m0 m0Var, androidx.compose.foundation.lazy.layout.i1.c cVar) {
            if (function1 != null) {
                int iB = cVar.b();
                int iA = 0;
                for (int i11 = 0; i11 < iB; i11++) {
                    iA += (int) (m0Var.getOrientation() == q3.Vertical ? cVar.a(i11) & com.rabbitmq.client.k0.f265952a : cVar.a(i11) >> 32);
                }
                function1.invoke(new r0(i10, iA));
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.foundation.lazy.s0
        public androidx.compose.foundation.lazy.layout.i1.b a(final int i10, final Function1<? super q0, Unit> function1) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            j1 j1Var = j1.this;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                final m0 m0Var = (m0) j1Var.f17176f.getValue();
                aVar.x(mVarG, mVarM, function1L);
                return j1.this.R().o(i10, m0Var.t(), j1.this.f17174d, new Function1() { // from class: androidx.compose.foundation.lazy.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j1.c.d(function1, i10, m0Var, (androidx.compose.foundation.lazy.layout.i1.c) obj);
                    }
                });
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
    }

    public static final class d implements q2 {
        d() {
        }

        @Override // androidx.compose.ui.layout.q2
        public void q6(p2 p2Var) {
            j1.this.f17182l = p2Var;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17202a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17204a;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f17204a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j1.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17202a;
            if (i10 == 0) {
                ResultKt.m(obj);
                j1 j1Var = j1.this;
                a aVar = new a(null);
                this.f17202a = 1;
                if (v4.h(j1Var, null, aVar, this, 1, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0}, l = {443, 444}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17207c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17209e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17207c = obj;
            this.f17209e |= Integer.MIN_VALUE;
            return j1.this.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17210a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17213d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f17212c = i10;
            this.f17213d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j1.this.new g(this.f17212c, this.f17213d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17210a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            j1.this.k0(this.f17212c, this.f17213d, true);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @b2
    public j1() {
        this(0, 0, (t0) null, 7, (DefaultConstructorMarker) null);
    }

    private static Object N(j1 j1Var) {
        return j1Var.f17175e.b();
    }

    public static /* synthetic */ void S() {
    }

    private final void Z(float f10, f0 f0Var) {
        if (this.f17181k) {
            this.f17171a.e(this.f17188r, f10, f0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(j1 j1Var, int i10, m2 m2Var) {
        t0 t0Var = j1Var.f17171a;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        aVar.x(mVarG, aVar.m(mVarG), mVarG != null ? mVarG.l() : null);
        t0Var.a(m2Var, i10);
        return Unit.f312394a;
    }

    public static /* synthetic */ void d0(j1 j1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        j1Var.c0(i10, i11);
    }

    public static /* synthetic */ Object f0(j1 j1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return j1Var.e0(i10, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g0(j1 j1Var, float f10) {
        return -j1Var.a0(-f10);
    }

    private void h0(boolean z10) {
        this.f17192v.setValue(Boolean.valueOf(z10));
    }

    private void i0(boolean z10) {
        this.f17191u.setValue(Boolean.valueOf(z10));
    }

    private final void l0(m0 m0Var) {
        n0 n0Var = (n0) CollectionsKt.firstOrNull((List) m0Var.h());
        n0 n0Var2 = (n0) CollectionsKt.lastOrNull((List) m0Var.h());
        androidx.compose.ui.util.a.b("firstVisibleItem:index", n0Var != null ? n0Var.getIndex() : -1L);
        androidx.compose.ui.util.a.b("lastVisibleItem:index", n0Var2 != null ? n0Var2.getIndex() : -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(androidx.compose.runtime.saveable.g0 g0Var, j1 j1Var) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(j1Var.E()), Integer.valueOf(j1Var.F())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 r(List list) {
        return new j1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object x(j1 j1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return j1Var.w(i10, i11, dVar);
    }

    public static /* synthetic */ void z(j1 j1Var, m0 m0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        j1Var.y(m0Var, z10, z11);
    }

    @Nullable
    public final m0 A() {
        return this.f17173c;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.d B() {
        return this.f17184n;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.q C() {
        return this.f17186p;
    }

    @NotNull
    public final androidx.compose.ui.unit.d D() {
        return this.f17176f.getValue().w();
    }

    @e0.a
    public final int E() {
        return this.f17175e.a();
    }

    @e0.a
    public final int F() {
        return this.f17175e.c();
    }

    public final boolean G() {
        return this.f17172b;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h H() {
        return this.f17177g;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j I() {
        return this.f17177g;
    }

    @NotNull
    public final LazyLayoutItemAnimator<n0> J() {
        return this.f17185o;
    }

    @e0.a
    @NotNull
    public final f0 K() {
        return this.f17176f.getValue();
    }

    @NotNull
    public final n3<Unit> L() {
        return this.f17190t;
    }

    @NotNull
    public final IntRange M() {
        return this.f17175e.b().getValue();
    }

    public final int O() {
        return this.f17180j;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.h1 P() {
        return this.f17189s;
    }

    @NotNull
    public final n3<Unit> Q() {
        return this.f17193w;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.i1 R() {
        return this.f17187q;
    }

    @NotNull
    public final t0 T() {
        return this.f17171a;
    }

    public final boolean U() {
        return this.f17181k;
    }

    @Nullable
    public final p2 V() {
        return this.f17182l;
    }

    @NotNull
    public final q2 W() {
        return this.f17183m;
    }

    public final float X() {
        return this.f17194x.c();
    }

    public final float Y() {
        return this.f17178h;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f17179i.a();
    }

    public final float a0(float f10) {
        m0 m0Var;
        if ((f10 < 0.0f && !f()) || (f10 > 0.0f && !k())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f17178h) <= 0.5f)) {
            androidx.compose.foundation.internal.e.i("entered drag with non-zero pending scroll");
        }
        this.f17174d = true;
        float f11 = this.f17178h + f10;
        this.f17178h = f11;
        if (Math.abs(f11) > 0.5f) {
            float f12 = this.f17178h;
            int iRound = Math.round(f12);
            m0 m0VarQ = this.f17176f.getValue().q(iRound, !this.f17172b);
            if (m0VarQ != null && (m0Var = this.f17173c) != null) {
                m0 m0VarQ2 = m0Var != null ? m0Var.q(iRound, true) : null;
                if (m0VarQ2 != null) {
                    this.f17173c = m0VarQ2;
                } else {
                    m0VarQ = null;
                }
            }
            if (m0VarQ != null) {
                y(m0VarQ, this.f17172b, true);
                n2.h(this.f17193w);
                Z(f12 - this.f17178h, m0VarQ);
            } else {
                p2 p2Var = this.f17182l;
                if (p2Var != null) {
                    p2Var.h();
                }
                Z(f12 - this.f17178h, K());
            }
        }
        if (Math.abs(this.f17178h) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f17178h;
        this.f17178h = 0.0f;
        return f13;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f17179i.b(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
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
            r5 = 1
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.j1.f
            if (r0 == 0) goto L17
            r0 = r9
            r5 = 7
            androidx.compose.foundation.lazy.j1$f r0 = (androidx.compose.foundation.lazy.j1.f) r0
            int r1 = r0.f17209e
            r5 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r5 = 3
            r0.f17209e = r1
            goto L1e
        L17:
            r5 = 4
            androidx.compose.foundation.lazy.j1$f r0 = new androidx.compose.foundation.lazy.j1$f
            r5 = 1
            r0.<init>(r9)
        L1e:
            java.lang.Object r9 = r0.f17207c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f17209e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L35
            r5 = 1
            kotlin.ResultKt.m(r9)
            r5 = 6
            goto L76
        L35:
            r5 = 5
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 7
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            r5 = 0
            java.lang.Object r7 = r0.f17206b
            r8 = r7
            r5 = 3
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r0.f17205a
            r5 = 1
            androidx.compose.foundation.q3 r7 = (androidx.compose.foundation.q3) r7
            kotlin.ResultKt.m(r9)
            r5 = 0
            goto L65
        L50:
            kotlin.ResultKt.m(r9)
            r5 = 0
            androidx.compose.foundation.lazy.layout.d r9 = r6.f17184n
            r5 = 6
            r0.f17205a = r7
            r0.f17206b = r8
            r0.f17209e = r4
            java.lang.Object r9 = r9.b(r0)
            r5 = 7
            if (r9 != r1) goto L65
            goto L75
        L65:
            androidx.compose.foundation.gestures.v4 r6 = r6.f17179i
            r9 = 0
            r0.f17205a = r9
            r0.f17206b = r9
            r0.f17209e = r3
            java.lang.Object r6 = r6.c(r7, r8, r0)
            r5 = 5
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            r5 = 1
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.j1.c(androidx.compose.foundation.q3, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public final void c0(@androidx.annotation.g0(from = 0) int i10, int i11) {
        if (a()) {
            kotlinx.coroutines.k.f(this.f17176f.getValue().v(), null, null, new e(null), 3, null);
        }
        k0(i10, i11, false);
    }

    @Nullable
    public final Object e0(@androidx.annotation.g0(from = 0) int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = v4.h(this, null, new g(i10, i11, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean f() {
        return ((Boolean) this.f17191u.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.f17179i.g();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.f17179i.j();
    }

    public final void j0(boolean z10) {
        this.f17181k = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean k() {
        return ((Boolean) this.f17192v.getValue()).booleanValue();
    }

    public final void k0(int i10, int i11, boolean z10) {
        if (this.f17175e.a() != i10 || this.f17175e.c() != i11) {
            this.f17185o.p();
            Object obj = this.f17171a;
            androidx.compose.foundation.lazy.layout.g gVar = obj instanceof androidx.compose.foundation.lazy.layout.g ? (androidx.compose.foundation.lazy.layout.g) obj : null;
            if (gVar != null) {
                gVar.z();
            }
        }
        this.f17175e.d(i10, i11);
        if (!z10) {
            n2.h(this.f17190t);
            return;
        }
        p2 p2Var = this.f17182l;
        if (p2Var != null) {
            p2Var.h();
        }
    }

    public final int m0(@NotNull w wVar, int i10) {
        return this.f17175e.j(wVar, i10);
    }

    @Nullable
    public final Object w(@androidx.annotation.g0(from = 0) int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = v4.h(this, null, new b(i10, i11, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void y(@NotNull m0 m0Var, boolean z10, boolean z11) {
        n0 n0VarZ;
        this.f17187q.q(m0Var.h().size());
        if (z10 || !this.f17172b) {
            if (z10) {
                this.f17172b = true;
            }
            h0(m0Var.r());
            i0(m0Var.s());
            this.f17178h -= m0Var.u();
            this.f17176f.setValue(m0Var);
            if (z11) {
                this.f17175e.i(m0Var.A());
            } else {
                l0(m0Var);
                this.f17175e.h(m0Var);
                if (this.f17181k) {
                    this.f17171a.g(this.f17188r, m0Var);
                }
            }
            if (z10) {
                this.f17194x.g(m0Var.C(), m0Var.w(), m0Var.v());
            }
            this.f17180j++;
            return;
        }
        this.f17173c = m0Var;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            if (this.f17194x.d() && (n0VarZ = m0Var.z()) != null && n0VarZ.getIndex() == this.f17175e.a() && m0Var.A() == this.f17175e.c()) {
                this.f17194x.f();
            }
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    @b2
    public j1(final int i10, int i11, @NotNull t0 t0Var) {
        this.f17171a = t0Var;
        x0 x0Var = new x0(i10, i11);
        this.f17175e = x0Var;
        this.f17176f = w6.k(o1.f17689a, w6.o());
        this.f17177g = androidx.compose.foundation.interaction.i.a();
        this.f17179i = x4.b(new Function1() { // from class: androidx.compose.foundation.lazy.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(j1.g0(this.f16694a, ((Float) obj).floatValue()));
            }
        });
        this.f17181k = true;
        this.f17183m = new d();
        this.f17184n = new androidx.compose.foundation.lazy.layout.d();
        this.f17185o = new LazyLayoutItemAnimator<>();
        this.f17186p = new androidx.compose.foundation.lazy.layout.q();
        this.f17187q = new androidx.compose.foundation.lazy.layout.i1(t0Var.c(), new Function1() { // from class: androidx.compose.foundation.lazy.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j1.b0(this.f16730a, i10, (m2) obj);
            }
        });
        this.f17188r = new c();
        this.f17189s = new androidx.compose.foundation.lazy.layout.h1();
        x0Var.b();
        this.f17190t = n2.d(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f17191u = d7.g(bool, null, 2, null);
        this.f17192v = d7.g(bool, null, 2, null);
        this.f17193w = n2.d(null, 1, null);
        this.f17194x = new androidx.compose.foundation.lazy.layout.k1();
    }

    public /* synthetic */ j1(int i10, int i11, t0 t0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? u0.b(0, 1, null) : t0Var);
    }

    public /* synthetic */ j1(androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
    }

    @b2
    public j1(@NotNull androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11) {
        this(i10, i11, new p(wVar));
    }

    public /* synthetic */ j1(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public j1(int i10, int i11) {
        this(i10, i11, u0.b(0, 1, null));
    }
}
