package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.ni;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f230256a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f230257b = androidx.compose.runtime.internal.w.c(-1803752133, false, a.f230258a);

    @SourceDebugExtension({"SMAP\nSpaceSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceSelector.kt\ncom/planner5d/library/spaces/view/dashboard/ComposableSingletons$SpaceSelectorKt$lambda-1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,99:1\n70#2:100\n66#2,10:101\n77#2:142\n80#3,6:111\n87#3,3:126\n90#3,2:135\n94#3:141\n391#4,9:117\n400#4:137\n401#4,2:139\n4360#5,6:129\n113#6:138\n*S KotlinDebug\n*F\n+ 1 SpaceSelector.kt\ncom/planner5d/library/spaces/view/dashboard/ComposableSingletons$SpaceSelectorKt$lambda-1$1\n*L\n52#1:100\n52#1:101,10\n52#1:142\n52#1:111,6\n52#1:126,3\n52#1:135,2\n52#1:141\n52#1:117,9\n52#1:137\n52#1:139,2\n52#1:129,6\n58#1:138\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f230258a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1803752133, i10, -1, "com.planner5d.library.spaces.view.dashboard.ComposableSingletons$SpaceSelectorKt.lambda-1.<anonymous> (SpaceSelector.kt:51)");
            }
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            ni.o(u0.e.c(de.b.g.X9, c0Var, 0), "Space icon", i6.w(aVar, androidx.compose.ui.unit.h.r(36)), bb.d.j(), c0Var, 432, 0);
            c0Var.o();
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return f230257b;
    }
}
