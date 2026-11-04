package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,496:1\n85#2:497\n117#2,2:498\n85#2:500\n117#2,2:501\n1#3:503\n53#4,4:504\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n89#1:497\n89#1:498,2\n96#1:500\n96#1:501,2\n174#1:504,4\n*E\n"})
public final class c<T, V extends w> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12810o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f12811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final T f12812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f12813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q<T, V> f12814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f12815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f12816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private T f12817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private T f12818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final a2 f12819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final q2<T> f12820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final V f12821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final V f12822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private V f12823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private V f12824n;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {308}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super m<T, V>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c<T, V> f12828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f12829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g<T, V> f12830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f12831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<c<T, V>, Unit> f12832h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c<T, V> cVar, T t10, g<T, V> gVar, long j10, Function1<? super c<T, V>, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f12828d = cVar;
            this.f12829e = t10;
            this.f12830f = gVar;
            this.f12831g = j10;
            this.f12832h = function1;
            int i10 = 4 << 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit m(c cVar, q qVar, Function1 function1, kotlin.jvm.internal.i1.a aVar, n nVar) {
            f3.K(nVar, cVar.n());
            Object objK = cVar.k(nVar.g());
            if (!Intrinsics.areEqual(objK, nVar.g())) {
                cVar.n().E(objK);
                qVar.E(objK);
                if (function1 != null) {
                    function1.invoke(cVar);
                }
                nVar.a();
                aVar.f312744a = true;
            } else if (function1 != null) {
                function1.invoke(cVar);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f12828d, this.f12829e, this.f12830f, this.f12831g, this.f12832h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            kotlin.jvm.internal.i1.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f12827c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    this.f12828d.n().F(this.f12828d.t().a().invoke(this.f12829e));
                    this.f12828d.B(this.f12830f.c());
                    this.f12828d.A(true);
                    final q qVarH = r.h(this.f12828d.n(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    final kotlin.jvm.internal.i1.a aVar2 = new kotlin.jvm.internal.i1.a();
                    g<T, V> gVar = this.f12830f;
                    long j10 = this.f12831g;
                    final c<T, V> cVar = this.f12828d;
                    final Function1<c<T, V>, Unit> function1 = this.f12832h;
                    Function1 function2 = new Function1() { // from class: androidx.compose.animation.core.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return c.a.m(cVar, qVarH, function1, aVar2, (n) obj2);
                        }
                    };
                    this.f12825a = qVarH;
                    this.f12826b = aVar2;
                    this.f12827c = 1;
                    if (f3.m(qVarH, gVar, j10, function2, this) == objL) {
                        return objL;
                    }
                    qVar = qVarH;
                    aVar = aVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (kotlin.jvm.internal.i1.a) this.f12826b;
                    qVar = (q) this.f12825a;
                    ResultKt.m(obj);
                }
                i iVar = aVar.f312744a ? i.BoundReached : i.Finished;
                this.f12828d.l();
                return new m(qVar, iVar);
            } catch (CancellationException e10) {
                this.f12828d.l();
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super m<T, V>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T, V> f12834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f12835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<T, V> cVar, T t10, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f12834b = cVar;
            this.f12835c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f12834b, this.f12835c, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f12833a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f12834b.l();
            Object objK = this.f12834b.k(this.f12835c);
            this.f12834b.n().E(objK);
            this.f12834b.B(objK);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C0057c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T, V> f12837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0057c(c<T, V> cVar, kotlin.coroutines.d<? super C0057c> dVar) {
            super(1, dVar);
            this.f12837b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new C0057c(this.f12837b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f12836a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f12837b.l();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0057c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @e0.c
    public c(T t10, @NotNull z3<T, V> z3Var, @Nullable T t11, @NotNull String str) {
        this.f12811a = z3Var;
        this.f12812b = t11;
        this.f12813c = str;
        this.f12814d = new q<>(z3Var, t10, null, 0L, 0L, false, 60, null);
        this.f12815e = d7.g(Boolean.FALSE, null, 2, null);
        this.f12816f = d7.g(t10, null, 2, null);
        this.f12819i = new a2();
        this.f12820j = new q2<>(0.0f, 0.0f, t11, 3, null);
        w wVarX = x();
        V v10 = wVarX instanceof s ? d.f12865e : wVarX instanceof t ? d.f12866f : wVarX instanceof u ? d.f12867g : d.f12868h;
        Intrinsics.checkNotNull(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f12821k = v10;
        w wVarX2 = x();
        V v11 = wVarX2 instanceof s ? d.f12861a : wVarX2 instanceof t ? d.f12862b : wVarX2 instanceof u ? d.f12863c : d.f12864d;
        Intrinsics.checkNotNull(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f12822l = v11;
        this.f12823m = v10;
        this.f12824n = v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        this.f12815e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(T t10) {
        this.f12816f.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F(c cVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = cVar.f12817g;
        }
        if ((i10 & 2) != 0) {
            obj2 = cVar.f12818h;
        }
        cVar.E(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object g(c cVar, Object obj, g0 g0Var, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return cVar.f(obj, g0Var, function1, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(c cVar, Object obj, o oVar, Object obj2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            oVar = cVar.f12820j;
        }
        o oVar2 = oVar;
        if ((i10 & 4) != 0) {
            obj2 = cVar.w();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return cVar.h(obj, oVar2, obj4, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T k(T t10) {
        if (!Intrinsics.areEqual(this.f12823m, this.f12821k) || !Intrinsics.areEqual(this.f12824n, this.f12822l)) {
            V vInvoke = this.f12811a.a().invoke(t10);
            int iB = vInvoke.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (vInvoke.a(i10) < this.f12823m.a(i10) || vInvoke.a(i10) > this.f12824n.a(i10)) {
                    vInvoke.e(i10, kotlin.ranges.r.H(vInvoke.a(i10), this.f12823m.a(i10), this.f12824n.a(i10)));
                    z10 = true;
                }
            }
            if (z10) {
                return this.f12811a.b().invoke(vInvoke);
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        q<T, V> qVar = this.f12814d;
        qVar.h().d();
        qVar.t(Long.MIN_VALUE);
        A(false);
    }

    private static /* synthetic */ void q() {
    }

    private static /* synthetic */ void r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(g<T, V> gVar, T t10, Function1<? super c<T, V>, Unit> function1, kotlin.coroutines.d<? super m<T, V>> dVar) {
        return a2.e(this.f12819i, null, new a(this, t10, gVar, this.f12814d.b(), function1, null), dVar, 1, null);
    }

    @Nullable
    public final Object C(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = a2.e(this.f12819i, null, new b(this, t10, null), dVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    @Nullable
    public final Object D(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 7 << 0;
        Object objE = a2.e(this.f12819i, null, new C0057c(this, null), dVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public final void E(@Nullable T t10, @Nullable T t11) {
        V vInvoke;
        V vInvoke2;
        if (t10 == null || (vInvoke = this.f12811a.a().invoke(t10)) == null) {
            vInvoke = this.f12821k;
        }
        if (t11 == null || (vInvoke2 = this.f12811a.a().invoke(t11)) == null) {
            vInvoke2 = this.f12822l;
        }
        int iB = vInvoke.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (!(vInvoke.a(i10) <= vInvoke2.a(i10))) {
                c2.e("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i10);
            }
        }
        this.f12823m = vInvoke;
        this.f12824n = vInvoke2;
        this.f12818h = t11;
        this.f12817g = t10;
        if (y()) {
            return;
        }
        T tK = k(v());
        if (Intrinsics.areEqual(tK, v())) {
            return;
        }
        this.f12814d.E(tK);
    }

    @Nullable
    public final Object f(T t10, @NotNull g0<T> g0Var, @Nullable Function1<? super c<T, V>, Unit> function1, @NotNull kotlin.coroutines.d<? super m<T, V>> dVar) {
        return z(new f0((g0) g0Var, (z3) this.f12811a, (Object) v(), (w) this.f12811a.a().invoke(t10)), t10, function1, dVar);
    }

    @Nullable
    public final Object h(T t10, @NotNull o<T> oVar, T t11, @Nullable Function1<? super c<T, V>, Unit> function1, @NotNull kotlin.coroutines.d<? super m<T, V>> dVar) {
        return z(l.e(oVar, this.f12811a, v(), t10, t11), t11, function1, dVar);
    }

    @NotNull
    public final n7<T> j() {
        return this.f12814d;
    }

    @NotNull
    public final q2<T> m() {
        return this.f12820j;
    }

    @NotNull
    public final q<T, V> n() {
        return this.f12814d;
    }

    @NotNull
    public final String o() {
        return this.f12813c;
    }

    @Nullable
    public final T p() {
        return this.f12817g;
    }

    public final T s() {
        return this.f12816f.getValue();
    }

    @NotNull
    public final z3<T, V> t() {
        return this.f12811a;
    }

    @Nullable
    public final T u() {
        return this.f12818h;
    }

    public final T v() {
        return this.f12814d.getValue();
    }

    public final T w() {
        return (T) this.f12811a.b().invoke(x());
    }

    @NotNull
    public final V x() {
        return (V) this.f12814d.h();
    }

    public final boolean y() {
        return ((Boolean) this.f12815e.getValue()).booleanValue();
    }

    public /* synthetic */ c(Object obj, z3 z3Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z3Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ c(Object obj, z3 z3Var, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z3Var, (i10 & 4) != 0 ? null : obj2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @kotlin.b1(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ c(Object obj, z3 z3Var, Object obj2) {
        this(obj, z3Var, obj2, "Animatable");
    }
}
