package androidx.compose.material3;

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
public final class ec implements gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ec f27318a = new ec();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27319b = 0;

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/DefaultNavigationRailOverride$NavigationRail$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,838:1\n1282#2,6:839\n87#3,6:845\n94#3:881\n79#4,6:851\n86#4,3:866\n89#4,2:875\n93#4:880\n347#5,9:857\n356#5,3:877\n4206#6,6:869\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/DefaultNavigationRailOverride$NavigationRail$1\n*L\n156#1:839,6\n150#1:845,6\n150#1:881\n150#1:851,6\n150#1:866,3\n150#1:875,2\n150#1:880\n150#1:857,9\n150#1:877,3\n150#1:869,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ hq f27320a;

        a(hq hqVar) {
            this.f27320a = hqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.b2(e0Var, true);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 5 & 1;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1027527987, i10, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail.<anonymous> (NavigationRail.kt:149)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.selection.b.b(androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.layout.i6.D(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.d(aVar, 0.0f, 1, null), this.f27320a.f()), d0.o1.f268586a.f(), 0.0f, 2, null), 0.0f, eq.D(), 1, null));
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.dc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ec.a.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI0, 1, null);
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(eq.D());
            hq hqVar = this.f27320a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, bVarM, c0Var, 54);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVarD = hqVar.d();
            if (nVarD != null) {
                c0Var.E(-548298554);
                nVarD.invoke(n0Var, c0Var, 6);
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.i(aVar, eq.f27405f), c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(-548182273);
                c0Var.A();
            }
            hqVar.b().invoke(n0Var, c0Var, 6);
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

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ec ecVar, hq hqVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ecVar.a(hqVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.gq
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final hq hqVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-433653496);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(hqVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-433653496, i11, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail (NavigationRail.kt:147)");
            }
            u10.c(hqVar.e(), null, hqVar.a(), hqVar.c(), 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(-1027527987, true, new a(hqVar), c0VarR, 54), c0VarR, 12582912, 114);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.cc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ec.c(this.f26749a, hqVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
