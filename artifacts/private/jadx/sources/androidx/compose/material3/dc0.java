package androidx.compose.material3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWideNavigationRail.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/WideNavigationRail_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,487:1\n75#2:488\n75#2:489\n75#2:490\n1282#3,6:491\n1282#3,6:497\n1282#3,6:503\n1282#3,6:509\n85#4:515\n66#5,5:516\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/WideNavigationRail_androidKt\n*L\n126#1:488\n127#1:489\n128#1:490\n131#1:491,6\n134#1:497,6\n154#1:503,6\n163#1:509,6\n130#1:515\n157#1:516,5\n*E\n"})
public final class dc0 {

    @SourceDebugExtension({"SMAP\nWideNavigationRail.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/WideNavigationRail_androidKt$ModalWideNavigationRailDialog$dialog$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,487:1\n1282#2,6:488\n70#3:494\n67#3,9:495\n77#3:534\n79#4,6:504\n86#4,3:519\n89#4,2:528\n93#4:533\n347#5,9:510\n356#5,3:530\n4206#6,6:522\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/WideNavigationRail_androidKt$ModalWideNavigationRailDialog$dialog$1$1$1\n*L\n149#1:488,6\n149#1:494\n149#1:495,9\n149#1:534\n149#1:504,6\n149#1:519,3\n149#1:528,2\n149#1:533\n149#1:510,9\n149#1:530,3\n149#1:522,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Function2<androidx.compose.runtime.c0, Integer, Unit>> f27095a;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.runtime.n7<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var) {
            this.f27095a = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.m(e0Var);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-406777160, i10, -1, "androidx.compose.material3.ModalWideNavigationRailDialog.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.android.kt:148)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.cc0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return dc0.a.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            androidx.compose.runtime.n7<Function2<androidx.compose.runtime.c0, Integer, Unit>> n7Var = this.f27095a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            dc0.f(n7Var).invoke(c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WideNavigationRail.android.kt\nandroidx/compose/material3/WideNavigationRail_androidKt\n*L\n1#1,69:1\n158#2,3:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xl f27096a;

        public b(xl xlVar) {
            this.f27096a = xlVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f27096a.dismiss();
            this.f27096a.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull Function0<Unit> function0, @NotNull final am amVar, @NotNull final Function1<? super Float, Unit> function1, @NotNull final Function0<Unit> function2, @NotNull final vs vsVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        int i12;
        int i13;
        final Function0<Unit> function4 = function0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2015914411);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(amVar) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(vsVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function3) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2015914411, i11, -1, "androidx.compose.material3.ModalWideNavigationRailDialog (WideNavigationRail.android.kt:124)");
            }
            View view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            final androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
            androidx.compose.runtime.p0 p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w(function3, c0VarR, (i11 >> 15) & 14);
            Object[] objArr = new Object[0];
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.yb0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return dc0.h();
                    }
                };
                c0VarR.Y(objI0);
            }
            UUID uuid = (UUID) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 48);
            boolean zA = androidx.compose.foundation.t1.a(c0VarR, 0);
            boolean zD = c0VarR.D(view) | c0VarR.D(dVar);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == aVar.a()) {
                i12 = 0;
                function4 = function0;
                xl xlVar = new xl(function4, amVar, view, wVar, dVar, uuid, function1, function2, vsVar, zA);
                a aVar2 = new a(n7VarW);
                i13 = 1;
                xlVar.k(p0VarY, androidx.compose.runtime.internal.w.c(-406777160, true, aVar2));
                c0VarR.Y(xlVar);
                objI1 = xlVar;
            } else {
                i13 = 1;
                i12 = 0;
                function4 = function0;
            }
            final xl xlVar2 = (xl) objI1;
            boolean zK0 = c0VarR.k0(xlVar2);
            Object objI2 = c0VarR.i0();
            if (zK0 || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.zb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return dc0.i(xlVar2, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.b2.d(xlVar2, (Function1) objI2, c0VarR, i12);
            int i14 = (c0VarR.k0(xlVar2) ? 1 : 0) | ((i11 & 14) == 4 ? i13 : i12);
            if ((i11 & com.planner5d.library.engine.input.f.b.B) != 32) {
                i13 = i12;
            }
            int i15 = i14 | i13 | (c0VarR.K(wVar.ordinal()) ? 1 : 0);
            Object objI3 = c0VarR.i0();
            if (i15 != 0 || objI3 == aVar.a()) {
                objI3 = new Function0() { // from class: androidx.compose.material3.ac0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return dc0.j(xlVar2, function4, amVar, wVar);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.b2.m((Function0) objI3, c0VarR, i12);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.bc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return dc0.g(function4, amVar, function1, function2, vsVar, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<androidx.compose.runtime.c0, Integer, Unit> f(androidx.compose.runtime.n7<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> n7Var) {
        return (Function2) n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function0 function0, am amVar, Function1 function1, Function0 function2, vs vsVar, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(function0, amVar, function1, function2, vsVar, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID h() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 i(xl xlVar, androidx.compose.runtime.v1 v1Var) {
        xlVar.show();
        return new b(xlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(xl xlVar, Function0 function0, am amVar, androidx.compose.ui.unit.w wVar) {
        xlVar.n(function0, amVar, wVar);
        return Unit.f312394a;
    }

    @NotNull
    public static final am l() {
        return new am(false, 1, null);
    }
}
