package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@af
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,548:1\n1#2:549\n*E\n"})
public final class tx {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f33274h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f33275i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<vx, Boolean> f33277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.o<Float> f33279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.compose.material3.internal.d0<vx> f33280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f33281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f33282g;

    @SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,548:1\n1#2:549\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vx g(androidx.compose.runtime.saveable.g0 g0Var, tx txVar) {
            return txVar.s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tx h(boolean z10, Function0 function0, Function0 function1, Function1 function2, boolean z11, vx vxVar) {
            return new tx(z10, function0, function1, vxVar, function2, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float i(androidx.compose.ui.unit.d dVar) {
            return dVar.S7(x2.f34346a.j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float j(androidx.compose.ui.unit.d dVar) {
            return dVar.S7(x2.f34346a.n());
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<tx, vx> e(final boolean z10, @NotNull final Function0<Float> function0, @NotNull final Function0<Float> function1, @NotNull final Function1<? super vx, Boolean> function2, final boolean z11) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.px
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return tx.a.g((androidx.compose.runtime.saveable.g0) obj, (tx) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.qx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tx.a.h(z10, function0, function1, function2, z11, (vx) obj);
                }
            });
        }

        @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility.")
        public final /* synthetic */ androidx.compose.runtime.saveable.c0 f(boolean z10, Function1 function1, final androidx.compose.ui.unit.d dVar, boolean z11) {
            return e(z10, new Function0() { // from class: androidx.compose.material3.rx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(tx.a.i(dVar));
                }
            }, new Function0() { // from class: androidx.compose.material3.sx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(tx.a.j(dVar));
                }
            }, function1, z11);
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.O1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.material3.internal.r, androidx.compose.material3.internal.b2<vx>, vx, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33286d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f33288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f33289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, androidx.compose.animation.core.y0<Float> y0Var, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f33288f = f10;
            this.f33289g = y0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.material3.internal.r rVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
            rVar.a(f10, f11);
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f33283a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final androidx.compose.material3.internal.r rVar = (androidx.compose.material3.internal.r) this.f33284b;
                float fC = ((androidx.compose.material3.internal.b2) this.f33285c).c((vx) this.f33286d);
                if (!Float.isNaN(fC)) {
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    float fW = Float.isNaN(tx.this.w()) ? 0.0f : tx.this.w();
                    eVar.f312748a = fW;
                    float f10 = this.f33288f;
                    androidx.compose.animation.core.y0<Float> y0Var = this.f33289g;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.ux
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return tx.b.n(rVar, eVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f33284b = null;
                    this.f33285c = null;
                    this.f33283a = 1;
                    if (androidx.compose.animation.core.f3.l(fW, fC, f10, y0Var, function2, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.material3.internal.r rVar, androidx.compose.material3.internal.b2<vx> b2Var, vx vxVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = tx.this.new b(this.f33288f, this.f33289g, dVar);
            bVar.f33284b = rVar;
            bVar.f33285c = b2Var;
            bVar.f33286d = vxVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tx(boolean z10, @NotNull final Function0<Float> function0, @NotNull Function0<Float> function1, @NotNull vx vxVar, @NotNull Function1<? super vx, Boolean> function2, boolean z11) {
        this.f33276a = z10;
        this.f33277b = function2;
        this.f33278c = z11;
        if (z10 && vxVar == vx.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z11 && vxVar == vx.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f33279d = ix.f29397b;
        this.f33280e = new androidx.compose.material3.internal.d0<>(vxVar, new Function1() { // from class: androidx.compose.material3.jx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(tx.k(function0, ((Float) obj).floatValue()));
            }
        }, function1, new Function0() { // from class: androidx.compose.material3.kx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tx.l(this.f30128a);
            }
        }, function2);
        this.f33281f = androidx.compose.animation.core.p.p(0, 1, null);
        this.f33282g = androidx.compose.animation.core.p.p(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(vx vxVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(x2.f34346a.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(vx vxVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(x2.f34346a.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(Function0 function0, float f10) {
        return ((Number) function0.invoke()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.o l(tx txVar) {
        return txVar.f33279d;
    }

    public static /* synthetic */ Object n(tx txVar, vx vxVar, androidx.compose.animation.core.y0 y0Var, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = txVar.f33280e.B();
        }
        return txVar.m(vxVar, y0Var, f10, dVar);
    }

    @NotNull
    public final vx A() {
        return this.f33280e.F();
    }

    @Nullable
    public final Object B(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN;
        if (this.f33278c) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Function1<vx, Boolean> function1 = this.f33277b;
        vx vxVar = vx.Hidden;
        return (function1.invoke(vxVar).booleanValue() && (objN = n(this, vxVar, this.f33282g, 0.0f, dVar, 4, null)) == kotlin.coroutines.intrinsics.b.l()) ? objN : Unit.f312394a;
    }

    public final boolean C() {
        return this.f33280e.H();
    }

    public final boolean D() {
        return this.f33280e.y() != vx.Hidden;
    }

    @Nullable
    public final Object E(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN;
        if (this.f33276a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Function1<vx, Boolean> function1 = this.f33277b;
        vx vxVar = vx.PartiallyExpanded;
        return (function1.invoke(vxVar).booleanValue() && (objN = n(this, vxVar, this.f33282g, 0.0f, dVar, 4, null)) == kotlin.coroutines.intrinsics.b.l()) ? objN : Unit.f312394a;
    }

    public final float F() {
        return this.f33280e.K();
    }

    public final void G(@NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f33279d = oVar;
    }

    public final void H(@NotNull androidx.compose.material3.internal.d0<vx> d0Var) {
        this.f33280e = d0Var;
    }

    public final void I(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f33282g = y0Var;
    }

    public final void J(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f33281f = y0Var;
    }

    @Nullable
    public final Object K(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = this.f33280e.Q(f10, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    @Nullable
    public final Object L(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN;
        vx vxVar = u() ? vx.PartiallyExpanded : vx.Expanded;
        return (this.f33277b.invoke(vxVar).booleanValue() && (objN = n(this, vxVar, this.f33281f, 0.0f, dVar, 4, null)) == kotlin.coroutines.intrinsics.b.l()) ? objN : Unit.f312394a;
    }

    @Nullable
    public final Object M(@NotNull vx vxVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = androidx.compose.material3.internal.t.k(this.f33280e, vxVar, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    @Nullable
    public final Object m(@NotNull vx vxVar, @NotNull androidx.compose.animation.core.y0<Float> y0Var, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = androidx.compose.material3.internal.d0.p(this.f33280e, vxVar, null, new b(f10, y0Var, null), dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Nullable
    public final Object o(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN;
        Function1<vx, Boolean> function1 = this.f33277b;
        vx vxVar = vx.Expanded;
        return (function1.invoke(vxVar).booleanValue() && (objN = n(this, vxVar, this.f33281f, 0.0f, dVar, 4, null)) == kotlin.coroutines.intrinsics.b.l()) ? objN : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> p() {
        return this.f33279d;
    }

    @NotNull
    public final androidx.compose.material3.internal.d0<vx> q() {
        return this.f33280e;
    }

    @NotNull
    public final Function1<vx, Boolean> r() {
        return this.f33277b;
    }

    @NotNull
    public final vx s() {
        return this.f33280e.y();
    }

    public final boolean t() {
        return this.f33280e.u().d(vx.Expanded);
    }

    public final boolean u() {
        return this.f33280e.u().d(vx.PartiallyExpanded);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> v() {
        return this.f33282g;
    }

    public final float w() {
        return this.f33280e.C();
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> x() {
        return this.f33281f;
    }

    public final boolean y() {
        return this.f33278c;
    }

    public final boolean z() {
        return this.f33276a;
    }

    public /* synthetic */ tx(boolean z10, Function0 function0, Function0 function1, vx vxVar, Function1 function2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, function0, function1, (i10 & 8) != 0 ? vx.Hidden : vxVar, (i10 & 16) != 0 ? new Function1() { // from class: androidx.compose.material3.lx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(tx.g((vx) obj));
            }
        } : function2, (i10 & 32) != 0 ? false : z11);
    }

    public /* synthetic */ tx(boolean z10, androidx.compose.ui.unit.d dVar, vx vxVar, Function1 function1, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, (i10 & 4) != 0 ? vx.Hidden : vxVar, (i10 & 8) != 0 ? new Function1() { // from class: androidx.compose.material3.mx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(tx.i((vx) obj));
            }
        } : function1, (i10 & 16) != 0 ? false : z11);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility.")
    public /* synthetic */ tx(boolean z10, final androidx.compose.ui.unit.d dVar, vx vxVar, Function1 function1, boolean z11) {
        this(z10, new Function0() { // from class: androidx.compose.material3.nx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(tx.j(dVar));
            }
        }, new Function0() { // from class: androidx.compose.material3.ox
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(tx.h(dVar));
            }
        }, vxVar, function1, z11);
    }
}
