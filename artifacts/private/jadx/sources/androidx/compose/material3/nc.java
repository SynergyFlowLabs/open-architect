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
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultSingleRowTopAppBarOverride\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,3517:1\n97#2:3518\n166#2:3519\n139#3:3520\n1282#4,6:3521\n1282#4,6:3527\n1282#4,6:3533\n1282#4,6:3539\n1282#4,6:3545\n1282#4,6:3551\n1282#4,6:3594\n1282#4,6:3600\n70#5:3557\n67#5,9:3558\n77#5:3609\n79#6,6:3567\n86#6,3:3582\n89#6,2:3591\n93#6:3608\n347#7,9:3573\n356#7:3593\n357#7,2:3606\n4206#8,6:3585\n85#9:3610\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultSingleRowTopAppBarOverride\n*L\n2512#1:3518\n2512#1:3519\n2512#1:3520\n2521#1:3521,6\n2551#1:3527,6\n2554#1:3533,6\n2575#1:3539,6\n2581#1:3545,6\n2582#1:3551,6\n2590#1:3594,6\n2599#1:3600,6\n2571#1:3557\n2571#1:3558,9\n2571#1:3609\n2571#1:3567,6\n2571#1:3582,3\n2571#1:3591,2\n2571#1:3608\n2571#1:3573,9\n2571#1:3593\n2571#1:3606,2\n2571#1:3585,6\n2521#1:3610\n*E\n"})
public final class nc implements iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final nc f31011a = new nc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f31012b = 0;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31013a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,3517:1\n99#2:3518\n95#2,10:3519\n106#2:3559\n79#3,6:3529\n86#3,3:3544\n89#3,2:3553\n93#3:3558\n347#4,9:3535\n356#4,3:3555\n4206#5,6:3547\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1\n*L\n2538#1:3518\n2538#1:3519,10\n2538#1:3559\n2538#1:3529,6\n2538#1:3544,3\n2538#1:3553,2\n2538#1:3558\n2538#1:3535,9\n2538#1:3555,3\n2538#1:3547,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jy f31014a;

        b(jy jyVar) {
            this.f31014a = jyVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1658896622, i10, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2537)");
            }
            androidx.compose.foundation.layout.q.e eVarO = androidx.compose.foundation.layout.q.f16330a.o();
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVarA = this.f31014a.a();
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {2555}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f31016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ jy f31017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jy jyVar, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f31017c = jyVar;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31015a;
            if (i10 == 0) {
                ResultKt.m(obj);
                float f10 = this.f31016b;
                fa0 state = this.f31017c.f().getState();
                androidx.compose.animation.core.g0<Float> g0VarD = this.f31017c.f().d();
                androidx.compose.animation.core.o<Float> oVarC = this.f31017c.f().c();
                this.f31015a = 1;
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
            c cVar = new c(this.f31017c, dVar);
            cVar.f31016b = f10;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    static final class d implements Function0<androidx.compose.ui.graphics.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jy f31018a;

        d(jy jyVar) {
            this.f31018a = jyVar;
        }

        public final long c() {
            fa0 state;
            ca0 ca0VarF = this.f31018a.f();
            return this.f31018a.b().a(((ca0VarF == null || (state = ca0VarF.getState()) == null) ? 0.0f : state.j()) > 0.01f ? 1.0f : 0.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.q0 invoke() {
            return androidx.compose.ui.graphics.q0.n(c());
        }
    }

    private nc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(jy jyVar) {
        fa0 state;
        ca0 ca0VarF = jyVar.f();
        if (ca0VarF == null || (state = ca0VarF.getState()) == null) {
            return 0.0f;
        }
        return state.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(nc ncVar, jy jyVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ncVar.a(jyVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final long k(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(jy jyVar, float f10) {
        fa0 state = jyVar.f().getState();
        state.l(state.h() + f10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        long jM = ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M();
        if (!androidx.compose.ui.graphics.q0.y(jM, androidx.compose.ui.graphics.q0.f38131b.u())) {
            androidx.compose.ui.graphics.drawscope.f.V3(fVar, jM, 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.iy
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final jy jyVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarI;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2137486921);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(jyVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2137486921, i11, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)");
            }
            if (Float.isNaN(jyVar.c()) || (Float.floatToRawIntBits(jyVar.c()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            boolean zD = c0VarR.D(jyVar.b()) | c0VarR.D(jyVar.f());
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.w6.e(new d(jyVar));
                c0VarR.Y(objI0);
            }
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(k((androidx.compose.runtime.n7) objI0), hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, null, c0VarR, 0, 12);
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-1658896622, true, new b(jyVar), c0VarR, 54);
            if (jyVar.f() == null || jyVar.f().b()) {
                c0VarR.E(690108113);
                c0VarR.A();
                a0VarI = androidx.compose.ui.a0.E;
            } else {
                c0VarR.E(689467622);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Vertical;
                int i12 = i11 & 14;
                boolean z10 = i12 == 4;
                Object objI1 = c0VarR.i0();
                if (z10 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.hc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return nc.l(jyVar, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.foundation.gestures.a3 a3VarJ = androidx.compose.foundation.gestures.x2.j((Function1) objI1, c0VarR, 0);
                boolean z11 = i12 == 4;
                Object objI2 = c0VarR.i0();
                if (z11 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new c(jyVar, null);
                    c0VarR.Y(objI2);
                }
                a0VarI = androidx.compose.foundation.gestures.x2.i(aVar, a3VarJ, q3Var, false, null, false, null, (pj.n) objI2, false, 188, null);
                c0VarR.A();
            }
            androidx.compose.ui.a0 a0VarB2 = jyVar.d().B2(a0VarI);
            boolean zD2 = c0VarR.D(n7VarC);
            Object objI3 = c0VarR.i0();
            if (zD2 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material3.ic
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return nc.m(n7VarC, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.n.b(a0VarB2, (Function1) objI3);
            Object objI4 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI4 == aVar2.a()) {
                objI4 = new Function1() { // from class: androidx.compose.material3.jc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return nc.n((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI4);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI4, 1, null);
            Unit unit = Unit.f312394a;
            Object objI5 = c0VarR.i0();
            if (objI5 == aVar2.a()) {
                objI5 = a.f31013a;
                c0VarR.Y(objI5);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.input.pointer.w0.e(a0VarF, unit, (PointerInputEventHandler) objI5);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarE);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0 a0VarU0 = o1.U0(androidx.compose.ui.draw.j.b(androidx.compose.foundation.layout.t7.h(androidx.compose.ui.a0.E, jyVar.l())), jyVar.f());
            boolean z12 = (i11 & 14) == 4;
            Object objI6 = c0VarR.i0();
            if (z12 || objI6 == aVar2.a()) {
                objI6 = new androidx.compose.material3.internal.o2() { // from class: androidx.compose.material3.kc
                    @Override // androidx.compose.material3.internal.o2
                    public final float invoke() {
                        return nc.h(jyVar);
                    }
                };
                c0VarR.Y(objI6);
            }
            androidx.compose.material3.internal.o2 o2Var = (androidx.compose.material3.internal.o2) objI6;
            long jF = jyVar.b().f();
            long jI = jyVar.b().i();
            long jD = jyVar.b().d();
            long jH = jyVar.b().h();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2I = jyVar.i();
            androidx.compose.ui.text.y3 y3VarK = jyVar.k();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2G = jyVar.g();
            androidx.compose.ui.text.y3 y3VarH = jyVar.h();
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.b bVarJ = jyVar.j();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = jyVar.e();
            float fC = jyVar.c();
            Object objI7 = c0VarR.i0();
            if (objI7 == aVar2.a()) {
                objI7 = new Function0() { // from class: androidx.compose.material3.lc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(nc.i());
                    }
                };
                c0VarR.Y(objI7);
            }
            o1.A0(a0VarU0, o2Var, jF, jI, jH, jD, function2I, y3VarK, function2G, y3VarH, (Function0) objI7, fVarM, bVarJ, 0, false, function2E, cVarE, fC, c0VarR, 0, 1600566);
            c0VarR = c0VarR;
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return nc.j(this.f30600a, jyVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
