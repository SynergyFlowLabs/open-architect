package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButton.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,58:1\n113#2:59\n113#2:93\n113#2:94\n87#3,6:60\n94#3:98\n80#4,6:66\n87#4,3:81\n90#4,2:90\n94#4:97\n391#5,9:72\n400#5:92\n401#5,2:95\n4360#6,6:84\n*S KotlinDebug\n*F\n+ 1 ActionButton.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonKt\n*L\n32#1:59\n35#1:93\n38#1:94\n29#1:60,6\n29#1:98\n29#1:66,6\n29#1:81,3\n29#1:90,2\n29#1:97\n29#1:72,9\n29#1:92\n29#1:95,2\n29#1:84,6\n*E\n"})
public final class b {

    @SourceDebugExtension({"SMAP\nActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButton.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonKt$ActionButton$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n70#2:59\n68#2,8:60\n77#2:99\n80#3,6:68\n87#3,3:83\n90#3,2:92\n94#3:98\n391#4,9:74\n400#4:94\n401#4,2:96\n4360#5,6:86\n113#6:95\n*S KotlinDebug\n*F\n+ 1 ActionButton.kt\ncom/planner5d/library/spaces/view/dashboard/ActionButtonKt$ActionButton$1$1\n*L\n40#1:59\n40#1:60,8\n40#1:99\n40#1:68,6\n40#1:83,3\n40#1:92,2\n40#1:98\n40#1:74,9\n40#1:94\n40#1:96,2\n40#1:86,6\n47#1:95\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.vector.d f230234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f230235b;

        a(androidx.compose.ui.graphics.vector.d dVar, String str) {
            this.f230234a = dVar;
            this.f230235b = str;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                int i11 = 0 ^ (-1);
                m0.A0(1939838834, i10, -1, "com.planner5d.library.spaces.view.dashboard.ActionButton.<anonymous>.<anonymous> (ActionButton.kt:39)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarR = d5.r(aVar, bb.e.g());
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            androidx.compose.ui.graphics.vector.d dVar = this.f230234a;
            String str = this.f230235b;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarR);
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
            ni.p(dVar, str, i6.w(aVar, androidx.compose.ui.unit.h.r(24)), bb.d.j(), c0Var, a5.S0, 0);
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

    /* JADX WARN: Code duplicated, block: B:40:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@NotNull final androidx.compose.ui.graphics.vector.d icon, @NotNull final String label, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-114565917);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(icon) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(label) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (m0.l0()) {
                    m0.A0(-114565917, i12, -1, "com.planner5d.library.spaces.view.dashboard.ActionButton (ActionButton.kt:27)");
                }
                a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(6)), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarB, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                n0 n0Var = n0.f16227a;
                androidx.compose.ui.a0 a0Var5 = a0Var3;
                u10.c(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(56)), androidx.compose.foundation.shape.o.k(), bb.d.i(), 0L, 0.0f, androidx.compose.ui.unit.h.r(4), null, androidx.compose.runtime.internal.w.e(1939838834, true, new a(icon, label), c0VarR, 54), c0VarR, 12779526, 88);
                q50.t(label, null, bb.d.e(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bb.f.c(c0VarR, 0), c0VarR, (i12 >> 3) & 14, 0, 131066);
                c0VarR = c0VarR;
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                a0Var4 = a0Var5;
            } else {
                c0VarR.u();
                a0Var4 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b.c(icon, label, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) == 146) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (m0.l0()) {
                m0.A0(-114565917, i12, -1, "com.planner5d.library.spaces.view.dashboard.ActionButton (ActionButton.kt:27)");
            }
            a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(6)), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB2, aVar2.e());
            y7.n(c0VarD, b1VarK2, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar2.f());
            n0 n0Var2 = n0.f16227a;
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            u10.c(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(56)), androidx.compose.foundation.shape.o.k(), bb.d.i(), 0L, 0.0f, androidx.compose.ui.unit.h.r(4), null, androidx.compose.runtime.internal.w.e(1939838834, true, new a(icon, label), c0VarR, 54), c0VarR, 12779526, 88);
            q50.t(label, null, bb.d.e(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bb.f.c(c0VarR, 0), c0VarR, (i12 >> 3) & 14, 0, 131066);
            c0VarR = c0VarR;
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            a0Var4 = a0Var6;
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (m0.l0()) {
                m0.A0(-114565917, i12, -1, "com.planner5d.library.spaces.view.dashboard.ActionButton (ActionButton.kt:27)");
            }
            a1 a1VarB3 = j0.b(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(6)), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            function0A = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB3, aVar3.e());
            y7.n(c0VarD, b1VarK3, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar3.f());
            n0 n0Var3 = n0.f16227a;
            androidx.compose.ui.a0 a0Var7 = a0Var3;
            u10.c(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(56)), androidx.compose.foundation.shape.o.k(), bb.d.i(), 0L, 0.0f, androidx.compose.ui.unit.h.r(4), null, androidx.compose.runtime.internal.w.e(1939838834, true, new a(icon, label), c0VarR, 54), c0VarR, 12779526, 88);
            q50.t(label, null, bb.d.e(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bb.f.c(c0VarR, 0), c0VarR, (i12 >> 3) & 14, 0, 131066);
            c0VarR = c0VarR;
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            a0Var4 = a0Var7;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.c(icon, label, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.graphics.vector.d dVar, String str, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(dVar, str, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
