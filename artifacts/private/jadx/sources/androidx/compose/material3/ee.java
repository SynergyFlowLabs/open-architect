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
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1315:1\n85#2:1316\n117#2,2:1317\n1#3:1319\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n251#1:1316\n251#1:1317,2\n*E\n"})
public final class ee {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f27327h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27328i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<ge, Boolean> f27329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f27330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.b0<ge> f27331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7<Float> f27332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f27333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f27334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f27335g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ge d(androidx.compose.runtime.saveable.g0 g0Var, ee eeVar) {
            return eeVar.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ee e(Function1 function1, ge geVar) {
            return new ee(geVar, function1);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<ee, ge> c(@NotNull final Function1<? super ge, Boolean> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.ce
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ee.a.d((androidx.compose.runtime.saveable.g0) obj, (ee) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.de
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ee.a.e(function1, (ge) obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.o<androidx.compose.foundation.gestures.b, androidx.compose.foundation.gestures.t2<ge>, ge, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27339d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f27341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f27342g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f27341f = f10;
            this.f27342g = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.foundation.gestures.b bVar, kotlin.jvm.internal.i1.e eVar, float f10, float f11) {
            bVar.a(f10, f11);
            eVar.f312748a = f10;
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float fQ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27336a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final androidx.compose.foundation.gestures.b bVar = (androidx.compose.foundation.gestures.b) this.f27337b;
                float fC = ((androidx.compose.foundation.gestures.t2) this.f27338c).c((ge) this.f27339d);
                if (!Float.isNaN(fC)) {
                    final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
                    if (Float.isNaN(ee.this.q())) {
                        fQ = 0.0f;
                        int i11 = 6 & 0;
                    } else {
                        fQ = ee.this.q();
                    }
                    float f10 = fQ;
                    eVar.f312748a = f10;
                    float f11 = this.f27341f;
                    androidx.compose.animation.core.o<Float> oVar = this.f27342g;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material3.fe
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return ee.b.n(bVar, eVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f27337b = null;
                    this.f27338c = null;
                    this.f27336a = 1;
                    if (androidx.compose.animation.core.f3.l(f10, fC, f11, oVar, function2, this) == objL) {
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
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, androidx.compose.foundation.gestures.t2<ge> t2Var, ge geVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar2 = ee.this.new b(this.f27341f, this.f27342g, dVar);
            bVar2.f27337b = bVar;
            bVar2.f27338c = t2Var;
            bVar2.f27339d = geVar;
            return bVar2.invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c implements androidx.compose.runtime.n7<Float> {
        c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.n7
        public Float getValue() {
            return Float.valueOf(ee.this.m().y());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ee(@NotNull ge geVar, @NotNull Function1<? super ge, Boolean> function1) {
        this.f27329a = function1;
        androidx.compose.animation.core.y3 y3Var = no.f31067g;
        this.f27330b = y3Var;
        this.f27331c = androidx.compose.foundation.gestures.k.j(geVar, new Function1() { // from class: androidx.compose.material3.ae
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(ee.f(((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material3.be
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ee.g(this.f26282a));
            }
        }, y3Var, androidx.compose.foundation.gestures.d.f14520a.d(), function1);
        this.f27332d = new c();
        int i10 = 4 | 0;
        this.f27333e = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f27334f = androidx.compose.animation.core.p.p(0, 1, null);
        this.f27335g = androidx.compose.animation.core.p.p(0, 1, null);
    }

    private final androidx.compose.ui.unit.d B() {
        androidx.compose.ui.unit.d dVarS = s();
        if (dVarS != null) {
            return dVarS;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(ge geVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        return f10 * no.f31061a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(ee eeVar) {
        return eeVar.B().S7(no.f31062b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(ge geVar, androidx.compose.animation.core.o<Float> oVar, float f10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objO = androidx.compose.foundation.gestures.b0.o(this.f27331c, geVar, null, new b(f10, oVar, null), dVar, 2, null);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    static /* synthetic */ Object j(ee eeVar, ge geVar, androidx.compose.animation.core.o oVar, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = eeVar.f27331c.x();
        }
        return eeVar.h(geVar, oVar, f10, dVar);
    }

    public static /* synthetic */ void n() {
    }

    @kotlin.l(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @kotlin.b1(expression = "currentOffset", imports = {}))
    public static /* synthetic */ void u() {
    }

    @Nullable
    public final Object A(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = j(this, ge.Open, this.f27334f, 0.0f, dVar, 4, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    public final float C() {
        return this.f27331c.N();
    }

    public final void D(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f27330b = y0Var;
    }

    public final void E(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f27335g = y0Var;
    }

    public final void F(@Nullable androidx.compose.ui.unit.d dVar) {
        this.f27333e.setValue(dVar);
    }

    public final void G(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f27334f = y0Var;
    }

    @Nullable
    public final Object H(@NotNull ge geVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objU = androidx.compose.foundation.gestures.k.U(this.f27331c, geVar, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @kotlin.l(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object i(@NotNull ge geVar, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = j(this, geVar, oVar, 0.0f, dVar, 4, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    @Nullable
    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = j(this, ge.Closed, this.f27335g, 0.0f, dVar, 4, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> l() {
        return this.f27330b;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.b0<ge> m() {
        return this.f27331c;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> o() {
        return this.f27335g;
    }

    @NotNull
    public final Function1<ge, Boolean> p() {
        return this.f27329a;
    }

    public final float q() {
        return this.f27331c.y();
    }

    @NotNull
    public final ge r() {
        return this.f27331c.C();
    }

    @Nullable
    public final androidx.compose.ui.unit.d s() {
        return (androidx.compose.ui.unit.d) this.f27333e.getValue();
    }

    @NotNull
    public final androidx.compose.runtime.n7<Float> t() {
        return this.f27332d;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> v() {
        return this.f27334f;
    }

    @NotNull
    public final ge w() {
        return this.f27331c.F();
    }

    public final boolean x() {
        return this.f27331c.J();
    }

    public final boolean y() {
        return r() == ge.Closed;
    }

    public final boolean z() {
        return r() == ge.Open;
    }

    public /* synthetic */ ee(ge geVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(geVar, (i10 & 2) != 0 ? new Function1() { // from class: androidx.compose.material3.zd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ee.d((ge) obj));
            }
        } : function1);
    }
}
