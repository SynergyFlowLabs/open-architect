package com.planner5d.library.contest.view.rules;

import androidx.annotation.f1;
import androidx.annotation.v;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.s2;
import androidx.compose.material.wk;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.style.u;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nContestRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestRules.kt\ncom/planner5d/library/contest/view/rules/ContestRulesKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,72:1\n87#2:73\n83#2,10:74\n94#2:114\n87#2:152\n84#2,9:153\n94#2:192\n80#3,6:84\n87#3,3:99\n90#3,2:108\n94#3:113\n80#3,6:125\n87#3,3:140\n90#3,2:149\n80#3,6:162\n87#3,3:177\n90#3,2:186\n94#3:191\n94#3:195\n391#4,9:90\n400#4,3:110\n391#4,9:131\n400#4:151\n391#4,9:168\n400#4,3:188\n401#4,2:193\n4360#5,6:102\n4360#5,6:143\n4360#5,6:180\n99#6:115\n96#6,9:116\n106#6:196\n*S KotlinDebug\n*F\n+ 1 ContestRules.kt\ncom/planner5d/library/contest/view/rules/ContestRulesKt\n*L\n25#1:73\n25#1:74,10\n25#1:114\n56#1:152\n56#1:153,9\n56#1:192\n25#1:84,6\n25#1:99,3\n25#1:108,2\n25#1:113\n51#1:125,6\n51#1:140,3\n51#1:149,2\n56#1:162,6\n56#1:177,3\n56#1:186,2\n56#1:191\n51#1:195\n25#1:90,9\n25#1:110,3\n51#1:131,9\n51#1:151\n56#1:168,9\n56#1:188,3\n51#1:193,2\n25#1:102,6\n51#1:143,6\n56#1:180,6\n51#1:115\n51#1:116,9\n51#1:196\n*E\n"})
public final class l {
    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void c(@v final int i10, @f1 final int i11, @f1 final int i12, @Nullable c0 c0Var, final int i13) {
        int i14;
        c0 c0VarR = c0Var.R(-909505301);
        if ((i13 & 6) == 0) {
            i14 = (c0VarR.K(i10) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c0VarR.K(i11) ? 32 : 16;
        }
        if ((i13 & a5.S0) == 0) {
            i14 |= c0VarR.K(i12) ? 256 : 128;
        }
        int i15 = i14;
        if ((i15 & com.planner5d.library.engine.input.f.b.F1) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-909505301, i15, -1, "com.planner5d.library.contest.view.rules.ContestRule (ContestRules.kt:49)");
            }
            a0.a aVar = a0.E;
            a0 a0VarV = d5.v(aVar, 0.0f, u0.f.b(com.planner5d.library.contest.e.f.f150188qf, c0VarR, 0), 0.0f, 0.0f, 13, null);
            q qVar = q.f16330a;
            q.e eVarW = qVar.w();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarE = u5.e(eVarW, aVar2.w(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            y5 y5Var = y5.f16577a;
            s2.d(u0.e.c(i10, c0VarR, i15 & 14), "Contest rule background", d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.f150112mf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), null, null, 0.0f, null, c0VarR, 48, 120);
            a0 a0VarV2 = d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.Df, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null);
            a1 a1VarB = j0.b(qVar.y(), aVar2.u(), c0VarR, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            n0 n0Var = n0.f16227a;
            String strD = u0.i.d(i11, c0VarR, (i15 >> 3) & 14);
            ab.b bVar = ab.b.f589a;
            int i16 = ab.b.f591c;
            long jB = bVar.b(c0VarR, i16);
            y yVarA = bVar.a();
            v0.a aVar4 = v0.f41742b;
            wk.o(strD, null, 0L, jB, null, aVar4.c(), yVarA, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(0L, 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777087, (DefaultConstructorMarker) null), c0VarR, androidx.profileinstaller.n.c.f73814m, 1572864, 65430);
            wk.o(u0.i.d(i12, c0VarR, (i15 >> 6) & 14), d5.v(aVar, 0.0f, u0.f.b(com.planner5d.library.contest.e.f.Af, c0VarR, 0), u0.f.b(com.planner5d.library.contest.e.f.f150112mf, c0VarR, 0), 0.0f, 9, null), 0L, bVar.c(c0VarR, i16), null, aVar4.m(), bVar.a(), 0L, null, null, 0L, 0, false, 0, 0, null, new y3(0L, 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777087, (DefaultConstructorMarker) null), c0VarR, androidx.profileinstaller.n.c.f73814m, 1572864, 65428);
            c0VarR = c0VarR;
            c0VarR.o();
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.d(i10, i11, i12, i13, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, int i11, int i12, int i13, c0 c0Var, int i14) {
        c(i10, i11, i12, c0Var, t4.a(i13 | 1));
        return Unit.f312394a;
    }

    @o
    @d1.c
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-994785853);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-994785853, i10, -1, "com.planner5d.library.contest.view.rules.ContestRules (ContestRules.kt:23)");
            }
            a0.a aVar = a0.E;
            a1 a1VarB = j0.b(q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            String strD = u0.i.d(com.planner5d.library.contest.e.r.D3, c0VarR, 0);
            ab.b bVar = ab.b.f589a;
            long jD = bVar.d(c0VarR, ab.b.f591c);
            y yVarA = bVar.a();
            wk.o(strD, d5.v(aVar, u0.f.b(com.planner5d.library.contest.e.f.f150112mf, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), 0L, jD, null, v0.f41742b.c(), yVarA, 0L, null, null, 0L, 0, false, 0, 0, null, new y3(0L, 0L, (v0) null, (q0) null, (r0) null, (y) null, (String) null, androidx.compose.ui.unit.a0.m(0), (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, 0, 0L, (s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (u) null, 16777087, (DefaultConstructorMarker) null), c0VarR, androidx.profileinstaller.n.c.f73814m, 1572864, 65428);
            c0VarR = c0VarR;
            c(com.planner5d.library.contest.e.g.f150667u4, com.planner5d.library.contest.e.r.f151993z5, com.planner5d.library.contest.e.r.f151969y5, c0VarR, 0);
            c(com.planner5d.library.contest.e.g.f150682v4, com.planner5d.library.contest.e.r.H5, com.planner5d.library.contest.e.r.G5, c0VarR, 0);
            c(com.planner5d.library.contest.e.g.f150697w4, com.planner5d.library.contest.e.r.K5, com.planner5d.library.contest.e.r.J5, c0VarR, 0);
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: com.planner5d.library.contest.view.rules.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.f(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10, c0 c0Var, int i11) {
        e(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
