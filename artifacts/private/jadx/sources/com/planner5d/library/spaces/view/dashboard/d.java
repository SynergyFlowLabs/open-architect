package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nActionButtons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButtons.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,40:1\n113#2:41\n99#3,6:42\n106#3:78\n80#4,6:48\n87#4,3:63\n90#4,2:72\n94#4:77\n391#5,9:54\n400#5,3:74\n4360#6,6:66\n*S KotlinDebug\n*F\n+ 1 ActionButtons.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonsKt\n*L\n22#1:41\n19#1:42,6\n19#1:78\n19#1:48,6\n19#1:63,3\n19#1:72,2\n19#1:77\n19#1:54,9\n19#1:74,3\n19#1:66,6\n*E\n"})
public final class d {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-74694264);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (m0.l0()) {
                m0.A0(-74694264, i12, -1, "com.planner5d.library.spaces.view.dashboard.ActionButtons (ActionButtons.kt:17)");
            }
            androidx.compose.ui.a0 a0VarT = d5.t(i6.i(i6.h(a0Var, 0.0f, 1, null), androidx.compose.ui.unit.h.r(94)), 0.0f, bb.e.f(), 1, null);
            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.u(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            y5 y5Var = y5.f16577a;
            androidx.compose.ui.graphics.vector.d.b bVar = androidx.compose.ui.graphics.vector.d.f38364k;
            int i14 = 6 ^ 4;
            b.b(u0.j.c(bVar, de.b.g.X9, c0VarR, 6), "New Project", null, c0VarR, 48, 4);
            b.b(u0.j.c(bVar, de.b.g.X9, c0VarR, 6), "Upload", null, c0VarR, 48, 4);
            b.b(u0.j.c(bVar, de.b.g.X9, c0VarR, 6), "Generate", null, c0VarR, 48, 4);
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
