package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultTwoRowsTopAppBarOverride\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,3517:1\n97#2:3518\n166#2:3519\n97#2:3521\n166#2:3522\n139#3:3520\n139#3:3523\n75#4:3524\n1#5:3525\n1282#6,6:3526\n1282#6,6:3532\n1282#6,6:3538\n1282#6,6:3544\n1282#6,6:3550\n1282#6,6:3556\n1282#6,6:3562\n1282#6,6:3568\n1282#6,6:3574\n1282#6,6:3580\n1282#6,6:3661\n1282#6,6:3667\n70#7:3586\n67#7,9:3587\n77#7:3681\n79#8,6:3596\n86#8,3:3611\n89#8,2:3620\n79#8,6:3634\n86#8,3:3649\n89#8,2:3658\n93#8:3676\n93#8:3680\n347#9,9:3602\n356#9:3622\n347#9,9:3640\n356#9:3660\n357#9,2:3674\n357#9,2:3678\n4206#10,6:3614\n4206#10,6:3652\n87#11:3623\n83#11,10:3624\n94#11:3677\n52#12:3673\n85#13:3682\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultTwoRowsTopAppBarOverride\n*L\n2734#1:3518\n2734#1:3519\n2737#1:3521\n2737#1:3522\n2734#1:3520\n2737#1:3523\n2743#1:3524\n2750#1:3526,6\n2751#1:3532,6\n2762#1:3538,6\n2763#1:3544,6\n2767#1:3550,6\n2778#1:3556,6\n2781#1:3562,6\n2798#1:3568,6\n2799#1:3574,6\n2800#1:3580,6\n2808#1:3661,6\n2834#1:3667,6\n2794#1:3586\n2794#1:3587,9\n2794#1:3681\n2794#1:3596,6\n2794#1:3611,3\n2794#1:3620,2\n2802#1:3634,6\n2802#1:3649,3\n2802#1:3658,2\n2802#1:3676\n2794#1:3680\n2794#1:3602,9\n2794#1:3622\n2802#1:3640,9\n2802#1:3660\n2802#1:3674,2\n2794#1:3678,2\n2794#1:3614,6\n2802#1:3652,6\n2802#1:3623\n2802#1:3624,10\n2802#1:3677\n2850#1:3673\n2767#1:3682\n*E\n"})
public final class zc implements ha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zc f35109a = new zc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35110b = 0;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35111a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$actionsRow$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,3517:1\n99#2:3518\n95#2,10:3519\n106#2:3559\n79#3,6:3529\n86#3,3:3544\n89#3,2:3553\n93#3:3558\n347#4,9:3535\n356#4,3:3555\n4206#5,6:3547\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$actionsRow$1\n*L\n2756#1:3518\n2756#1:3519,10\n2756#1:3559\n2756#1:3529,6\n2756#1:3544,3\n2756#1:3553,2\n2756#1:3558\n2756#1:3535,9\n2756#1:3555,3\n2756#1:3547,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ia0 f35112a;

        b(ia0 ia0Var) {
            this.f35112a = ia0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1333673671, i10, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2755)");
            }
            androidx.compose.foundation.layout.q.e eVarO = androidx.compose.foundation.layout.q.f16330a.o();
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVarA = this.f35112a.a();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarO, cVarQ, c0Var, 54);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            nVarA.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function0<androidx.compose.ui.graphics.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ia0 f35113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f35114b;

        c(ia0 ia0Var, Function0<Float> function0) {
            this.f35113a = ia0Var;
            this.f35114b = function0;
        }

        public final long c() {
            return this.f35113a.c().a(this.f35114b.invoke().floatValue());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.q0 invoke() {
            return androidx.compose.ui.graphics.q0.n(c());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {2782}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f35116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ia0 f35117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ia0 ia0Var, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f35117c = ia0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35115a;
            if (i10 == 0) {
                ResultKt.m(obj);
                float f10 = this.f35116b;
                fa0 state = this.f35117c.g().getState();
                androidx.compose.animation.core.g0<Float> g0VarD = this.f35117c.g().d();
                androidx.compose.animation.core.o<Float> oVarC = this.f35117c.g().c();
                this.f35115a = 1;
                if (o1.h1(state, f10, g0VarD, oVarC, this) == objL) {
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

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            d dVar2 = new d(this.f35117c, dVar);
            dVar2.f35116b = f10;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    private zc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(Function0 function0) {
        return 1.0f - ((Number) function0.invoke()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Function0 function0) {
        return ((Number) function0.invoke()).floatValue() < 0.5f;
    }

    private static final boolean n(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(ia0 ia0Var, float f10) {
        fa0 state = ia0Var.g().getState();
        state.l(state.h() + f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function0 function0, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, ((androidx.compose.ui.graphics.q0) function0.invoke()).M(), 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s(ia0 ia0Var) {
        fa0 state;
        ca0 ca0VarG = ia0Var.g();
        if (ca0VarG == null || (state = ca0VarG.getState()) == null) {
            return 0.0f;
        }
        return state.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(zc zcVar, ia0 ia0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        zcVar.a(ia0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float u(ia0 ia0Var) {
        fa0 state;
        ca0 ca0VarG = ia0Var.g();
        if (ca0VarG == null || (state = ca0VarG.getState()) == null) {
            return 0.0f;
        }
        return state.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float v(Function0 function0) {
        return o1.b1().a(((Number) function0.invoke()).floatValue());
    }

    @Override // androidx.compose.material3.ha0
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final ia0 ia0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final ia0 ia0Var2;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.ui.a0 a0VarI;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1640665680);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c0VarR.D(ia0Var) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1640665680, i11, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar (AppBar.kt:2732)");
            }
            if (Float.isNaN(ia0Var.b()) || (Float.floatToRawIntBits(ia0Var.b()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            if (Float.isNaN(ia0Var.d()) || (Float.floatToRawIntBits(ia0Var.d()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            if (androidx.compose.ui.unit.h.q(ia0Var.d(), ia0Var.b()) < 0) {
                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
            }
            int iG6 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).g6(ia0Var.o());
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.pc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(zc.u(ia0Var));
                    }
                };
                c0VarR.Y(objI0);
            }
            final Function0 function0 = (Function0) objI0;
            boolean zD = (i12 == 4) | c0VarR.D(function0);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new c(ia0Var, function0);
                c0VarR.Y(objI1);
            }
            final Function0 function1 = (Function0) objI1;
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-1333673671, true, new b(ia0Var), c0VarR, 54);
            boolean zD2 = c0VarR.D(function0);
            Object objI2 = c0VarR.i0();
            if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function0() { // from class: androidx.compose.material3.qc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(zc.v(function0));
                    }
                };
                c0VarR.Y(objI2);
            }
            Function0 function2 = (Function0) objI2;
            boolean zD3 = c0VarR.D(function0);
            Object objI3 = c0VarR.i0();
            if (zD3 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function0() { // from class: androidx.compose.material3.rc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(zc.l(function0));
                    }
                };
                c0VarR.Y(objI3);
            }
            Function0 function3 = (Function0) objI3;
            boolean zD4 = c0VarR.D(function0);
            Object objI4 = c0VarR.i0();
            if (zD4 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                objI4 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.sc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(zc.m(function0));
                    }
                });
                c0VarR.Y(objI4);
            }
            androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI4;
            boolean z11 = !n(n7Var);
            if (ia0Var.g() == null || ia0Var.g().b()) {
                c0VarR.E(-340499894);
                c0VarR.A();
                a0VarI = androidx.compose.ui.a0.E;
            } else {
                c0VarR.E(-341140385);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Vertical;
                boolean z12 = i12 == 4;
                Object objI5 = c0VarR.i0();
                if (z12 || objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI5 = new Function1() { // from class: androidx.compose.material3.tc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return zc.o(ia0Var, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI5);
                }
                androidx.compose.foundation.gestures.a3 a3VarJ = androidx.compose.foundation.gestures.x2.j((Function1) objI5, c0VarR, 0);
                boolean z13 = i12 == 4;
                Object objI6 = c0VarR.i0();
                if (z13 || objI6 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI6 = new d(ia0Var, null);
                    c0VarR.Y(objI6);
                }
                a0VarI = androidx.compose.foundation.gestures.x2.i(aVar, a3VarJ, q3Var, false, null, false, null, (pj.n) objI6, false, 188, null);
                c0VarR.A();
            }
            androidx.compose.ui.a0 a0VarB2 = ia0Var.e().B2(a0VarI);
            boolean zD5 = c0VarR.D(function1);
            Object objI7 = c0VarR.i0();
            if (zD5 || objI7 == androidx.compose.runtime.c0.f35327a.a()) {
                objI7 = new Function1() { // from class: androidx.compose.material3.uc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return zc.p(function1, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI7);
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.n.b(a0VarB2, (Function1) objI7);
            Object objI8 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI8 == aVar2.a()) {
                objI8 = new Function1() { // from class: androidx.compose.material3.vc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return zc.q((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI8);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI8, 1, null);
            Unit unit = Unit.f312394a;
            Object objI9 = c0VarR.i0();
            if (objI9 == aVar2.a()) {
                objI9 = a.f35111a;
                c0VarR.Y(objI9);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.input.pointer.w0.e(a0VarF, unit, (PointerInputEventHandler) objI9);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarE);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar3.u(), c0VarR, 0);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar5);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarB, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.a0 a0VarB3 = androidx.compose.ui.draw.j.b(androidx.compose.foundation.layout.t7.h(aVar5, ia0Var.r()));
            Object objI10 = c0VarR.i0();
            if (objI10 == aVar2.a()) {
                objI10 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.wc
                    @Override // androidx.compose.material3.internal.o2
                    public final float invoke() {
                        return zc.r();
                    }
                };
                c0VarR.Y(objI10);
            }
            o1.A0(a0VarB3, (androidx.compose.material3.internal.o2) objI10, ia0Var.c().f(), ia0Var.c().i(), ia0Var.c().h(), ia0Var.c().d(), ia0Var.j(), ia0Var.k(), ia0Var.h(), ia0Var.i(), function2, qVar.m(), ia0Var.p(), 0, n(n7Var), ia0Var.f(), cVarE, ia0Var.b(), c0VarR, 0, 1575984);
            androidx.compose.ui.a0 a0VarU0 = o1.U0(androidx.compose.ui.draw.j.b(androidx.compose.foundation.layout.t7.h(aVar5, androidx.compose.foundation.layout.b7.k(ia0Var.r(), androidx.compose.foundation.layout.v7.f16497b.g()))), ia0Var.g());
            boolean z14 = i12 == 4;
            Object objI11 = c0VarR.i0();
            if (z14 || objI11 == aVar2.a()) {
                ia0Var2 = ia0Var;
                objI11 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.xc
                    @Override // androidx.compose.material3.internal.o2
                    public final float invoke() {
                        return zc.s(ia0Var2);
                    }
                };
                c0VarR.Y(objI11);
            } else {
                ia0Var2 = ia0Var;
            }
            androidx.compose.material3.internal.o2 o2Var = (androidx.compose.material3.internal.o2) objI11;
            long jF = ia0Var2.c().f();
            long jI = ia0Var2.c().i();
            long jD = ia0Var2.c().d();
            long jH = ia0Var2.c().h();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2N = ia0Var2.n();
            androidx.compose.ui.text.y3 y3VarQ = ia0Var2.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2L = ia0Var2.l();
            androidx.compose.ui.text.y3 y3VarM = ia0Var2.m();
            androidx.compose.foundation.layout.q.m mVarK = qVar.k();
            androidx.compose.ui.e.b bVarP = ia0Var2.p();
            float fR = androidx.compose.ui.unit.h.r(ia0Var2.d() - ia0Var2.b());
            p6 p6Var = p6.f31608a;
            c0Var2 = c0VarR;
            o1.A0(a0VarU0, o2Var, jF, jI, jH, jD, function2N, y3VarQ, function2L, y3VarM, function3, mVarK, bVarP, iG6, z11, p6Var.k(), p6Var.A(), fR, c0Var2, 0, 1769520);
            c0Var2.o();
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            ia0Var2 = ia0Var;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.yc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return zc.t(this.f34750a, ia0Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
