package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.q4;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.lifecycle.m2;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSpacesInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesInfoKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n68#2:68\n57#2,10:69\n113#3:79\n85#4:80\n*S KotlinDebug\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesInfoKt\n*L\n29#1:68\n29#1:69,10\n36#1:79\n31#1:80\n*E\n"})
public final class h0 {

    @SourceDebugExtension({"SMAP\nSpacesInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesInfoKt$SpacesInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,67:1\n87#2:68\n84#2,9:69\n87#2:105\n85#2,8:106\n94#2:144\n94#2:148\n80#3,6:78\n87#3,3:93\n90#3,2:102\n80#3,6:114\n87#3,3:129\n90#3,2:138\n94#3:143\n94#3:147\n391#4,9:84\n400#4:104\n391#4,9:120\n400#4,3:140\n401#4,2:145\n4360#5,6:96\n4360#5,6:132\n*S KotlinDebug\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesInfoKt$SpacesInfo$1\n*L\n38#1:68\n38#1:69,9\n44#1:105\n44#1:106,8\n44#1:144\n38#1:148\n38#1:78,6\n38#1:93,3\n38#1:102,2\n44#1:114,6\n44#1:129,3\n44#1:138,2\n44#1:143\n38#1:147\n38#1:84,9\n38#1:104\n44#1:120,9\n44#1:140,3\n38#1:145,2\n38#1:96,6\n44#1:132,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f230268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<i> f230269b;

        a(Function0<Unit> function0, n7<i> n7Var) {
            this.f230268a = function0;
            this.f230269b = n7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1519634424, i10, -1, "com.planner5d.library.spaces.view.dashboard.SpacesInfo.<anonymous> (SpacesInfo.kt:37)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = d5.v(q4.m(i6.f(aVar, 0.0f, 1, null), q4.f(0, c0Var, 0, 1), false, null, false, 14, null), bb.e.i(), bb.e.e(), bb.e.i(), 0.0f, 8, null);
            Function0<Unit> function0 = this.f230268a;
            n7<i> n7Var = this.f230269b;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarB = j0.b(mVarY, aVar2.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            y7.n(c0VarD, a1VarB, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            n0 n0Var = n0.f16227a;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            a1 a1VarB2 = j0.b(qVar.G(bb.e.h()), aVar2.u(), c0Var, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarH);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var);
            y7.n(c0VarD2, a1VarB2, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            t.b(null, function0, c0Var, 0, 1);
            k.b(null, h0.f(n7Var).h(), h0.f(n7Var).i(), h0.f(n7Var).g(), h0.f(n7Var).j(), c0Var, 0, 1);
            c0Var.o();
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

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void c(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-899707036);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-899707036, i10, -1, "com.planner5d.library.spaces.view.dashboard.DashboardPreview (SpacesInfo.kt:61)");
            }
            ab.d.b(h.f230265a.a(), c0VarR, 6);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h0.d(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x012e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Function0<Unit> onSpaceSelectorClick, @Nullable i0 i0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        i0 i0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final i0 i0Var3;
        Intrinsics.checkNotNullParameter(onSpaceSelectorClick, "onSpaceSelectorClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1194930269);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(onSpaceSelectorClick) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                i0Var2 = i0Var;
                int i14 = c0VarR.k0(i0Var2) ? 256 : 128;
                i12 |= i14;
            } else {
                i0Var2 = i0Var;
            }
            i12 |= i14;
        } else {
            i0Var2 = i0Var;
        }
        int i15 = i12;
        if ((i15 & com.planner5d.library.engine.input.f.b.F1) == 146 && c0VarR.d()) {
            c0VarR.u();
            a0Var3 = a0Var2;
            i0Var3 = i0Var2;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i11 & 4) != 0) {
                    m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0VarR, 6);
                    if (m2VarC == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    i0Var3 = (i0) androidx.lifecycle.viewmodel.compose.l.h(j1.d(i0.class), m2VarC, null, null, m2VarC instanceof androidx.lifecycle.z ? ((androidx.lifecycle.z) m2VarC).getDefaultViewModelCreationExtras() : v2.a.b.f381327c, c0VarR, 0, 0);
                    i15 &= -897;
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(1194930269, i15, -1, "com.planner5d.library.spaces.view.dashboard.SpacesInfo (SpacesInfo.kt:29)");
                }
                u10.c(i6.f(a0Var3, 0.0f, 1, null), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(0)), bb.d.d(), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1519634424, true, new a(onSpaceSelectorClick, w6.b(i0Var3.V(), null, c0VarR, 0, 1)), c0VarR, 54), c0VarR, 12582912, 120);
                c0VarR = c0VarR;
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i15 &= -897;
                }
                a0Var3 = a0Var2;
            }
            i0Var3 = i0Var2;
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(1194930269, i15, -1, "com.planner5d.library.spaces.view.dashboard.SpacesInfo (SpacesInfo.kt:29)");
            }
            u10.c(i6.f(a0Var3, 0.0f, 1, null), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(0)), bb.d.d(), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1519634424, true, new a(onSpaceSelectorClick, w6.b(i0Var3.V(), null, c0VarR, 0, 1)), c0VarR, 54), c0VarR, 12582912, 120);
            c0VarR = c0VarR;
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h0.g(a0Var3, onSpaceSelectorClick, i0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i f(n7<i> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.a0 a0Var, Function0 function0, i0 i0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(a0Var, function0, i0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
