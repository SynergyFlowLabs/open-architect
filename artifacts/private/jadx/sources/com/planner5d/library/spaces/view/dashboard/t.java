package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSpaceSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceSelector.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceSelectorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,99:1\n113#2:100\n113#2:134\n113#2:209\n99#3,6:101\n99#3:171\n95#3,10:172\n106#3:213\n106#3:221\n80#4,6:107\n87#4,3:122\n90#4,2:131\n80#4,6:144\n87#4,3:159\n90#4,2:168\n80#4,6:182\n87#4,3:197\n90#4,2:206\n94#4:212\n94#4:216\n94#4:220\n391#5,9:113\n400#5:133\n391#5,9:150\n400#5:170\n391#5,9:188\n400#5:208\n401#5,2:210\n401#5,2:214\n401#5,2:218\n4360#6,6:125\n4360#6,6:162\n4360#6,6:200\n87#7:135\n85#7,8:136\n94#7:217\n*S KotlinDebug\n*F\n+ 1 SpaceSelector.kt\ncom/planner5d/library/spaces/view/dashboard/SpaceSelectorKt\n*L\n42#1:100\n48#1:134\n83#1:209\n39#1:101,6\n69#1:171\n69#1:172,10\n69#1:213\n39#1:221\n39#1:107,6\n39#1:122,3\n39#1:131,2\n65#1:144,6\n65#1:159,3\n65#1:168,2\n69#1:182,6\n69#1:197,3\n69#1:206,2\n69#1:212\n65#1:216\n39#1:220\n39#1:113,9\n39#1:133\n65#1:150,9\n65#1:170\n69#1:188,9\n69#1:208\n69#1:210,2\n65#1:214,2\n39#1:218,2\n39#1:125,6\n65#1:162,6\n69#1:200,6\n65#1:135\n65#1:136,8\n65#1:217\n*E\n"})
public final class t {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Function0<Unit> onSpaceSelectorClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        Intrinsics.checkNotNullParameter(onSpaceSelectorClick, "onSpaceSelectorClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1335598140);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i12 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            if (m0.l0()) {
                m0.A0(1335598140, i12, -1, "com.planner5d.library.spaces.view.dashboard.SpaceSelector (SpaceSelector.kt:36)");
            }
            androidx.compose.ui.a0 a0VarT = d5.t(i6.i(i6.h(a0Var3, 0.0f, 1, null), androidx.compose.ui.unit.h.r(56)), bb.e.e(), 0.0f, 2, null);
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ = aVar.q();
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE = u5.e(qVar.G(bb.e.h()), cVarQ, c0VarR, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0Var4 = a0Var3;
            u10.c(i6.w(aVar3, androidx.compose.ui.unit.h.r(36)), androidx.compose.foundation.shape.o.k(), bb.d.h(), 0L, 0.0f, 0.0f, null, f.f230256a.a(), c0VarR, 12582918, 120);
            androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, aVar3, 1.0f, false, 2, null);
            a1 a1VarB = j0.b(qVar.G(bb.e.c()), aVar.u(), c0VarR, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB, aVar2.e());
            y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar2.f());
            n0 n0Var = n0.f16227a;
            a1 a1VarE2 = u5.e(qVar.G(bb.e.c()), aVar.q(), c0VarR, 48);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar3);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarE2, aVar2.e());
            y7.n(c0VarD3, b1VarK3, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar2.f());
            y3 y3VarD = bb.f.d(c0VarR, 0);
            long j10 = bb.d.j();
            androidx.compose.ui.text.style.v.a aVar4 = androidx.compose.ui.text.style.v.f42256b;
            q50.t("Family Home", null, j10, null, 0L, null, null, null, 0L, null, null, 0L, aVar4.c(), false, 1, 0, null, y3VarD, c0VarR, 6, 24960, 110586);
            ni.p(u0.j.c(androidx.compose.ui.graphics.vector.d.f38364k, de.b.g.N9, c0VarR, 6), "Expand", i6.w(aVar3, androidx.compose.ui.unit.h.r(24)), bb.d.j(), c0VarR, 432, 0);
            c0VarR.o();
            q50.t("Space", null, bb.d.e(), null, 0L, null, null, null, 0L, null, null, 0L, aVar4.c(), false, 1, 0, null, bb.f.b(c0VarR, 0), c0VarR, 6, 24960, 110586);
            c0VarR = c0VarR;
            c0VarR.o();
            o.c(c0VarR, 0);
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            a0Var2 = a0Var4;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t.c(a0Var2, onSpaceSelectorClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(a0Var, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
