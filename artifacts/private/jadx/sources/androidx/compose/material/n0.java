package androidx.compose.material;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,736:1\n584#1:739\n584#1:740\n584#1:741\n584#1:742\n584#1:743\n584#1:744\n75#2:737\n75#2:738\n113#3:745\n113#3:746\n113#3:747\n113#3:749\n113#3:751\n113#3:752\n113#3:753\n52#4:748\n52#4:750\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n609#1:739\n642#1:740\n643#1:741\n645#1:742\n652#1:743\n653#1:744\n338#1:737\n407#1:738\n722#1:745\n724#1:746\n726#1:747\n728#1:749\n731#1:751\n733#1:752\n735#1:753\n726#1:748\n728#1:750\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23829a = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f23831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f23832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f23833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f23834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.v6 f23835g;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f23836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f23837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23838c;

        /* JADX INFO: renamed from: androidx.compose.material.n0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$AppBar$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,736:1\n99#2,6:737\n106#2:773\n79#3,6:743\n86#3,3:758\n89#3,2:767\n93#3:772\n347#4,9:749\n356#4,3:769\n4206#5,6:761\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$AppBar$1$1\n*L\n709#1:737,6\n709#1:773\n709#1:743,6\n709#1:758,3\n709#1:767,2\n709#1:772\n709#1:749,9\n709#1:769,3\n709#1:761,6\n*E\n"})
        static final class C0182a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.v6 f23839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.g5 f23840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23841c;

            /* JADX WARN: Multi-variable type inference failed */
            C0182a(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.g5 g5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f23839a = v6Var;
                this.f23840b = g5Var;
                this.f23841c = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(597057613, i10, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:708)");
                }
                androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), this.f23839a), this.f23840b), n0.f23829a);
                androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23841c;
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, cVarQ, c0Var, 54);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarI);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                nVar.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.g5 g5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f23836a = v6Var;
            this.f23837b = g5Var;
            this.f23838c = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1628734195, i10, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:707)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.d(c0Var, 6))), androidx.compose.runtime.internal.w.e(597057613, true, new C0182a(this.f23836a, this.f23837b, this.f23838c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,736:1\n99#2:737\n96#2,9:738\n106#2:777\n99#2:778\n96#2,9:779\n106#2:818\n79#3,6:747\n86#3,3:762\n89#3,2:771\n93#3:776\n79#3,6:788\n86#3,3:803\n89#3,2:812\n93#3:817\n347#4,9:753\n356#4,3:773\n347#4,9:794\n356#4,3:814\n4206#5,6:765\n4206#5,6:806\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n106#1:737\n106#1:738,9\n106#1:777\n114#1:778\n114#1:779,9\n114#1:818\n106#1:747,6\n106#1:762,3\n106#1:771,2\n106#1:776\n114#1:788,6\n114#1:803,3\n114#1:812,2\n114#1:817\n106#1:753,9\n106#1:773,3\n114#1:794,9\n114#1:814,3\n106#1:765,6\n114#1:806,6\n*E\n"})
    static final class b implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23844c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23845a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f23845a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                boolean z10;
                if ((i10 & 3) != 2) {
                    z10 = true;
                    boolean z11 = true & true;
                } else {
                    z10 = false;
                }
                if (!c0Var.h(z10, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1206983395, i10, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:115)");
                }
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.c(c0Var, 6))), this.f23845a, c0Var, androidx.compose.runtime.n4.f36267i);
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

        /* JADX INFO: renamed from: androidx.compose.material.n0$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,736:1\n99#2,6:737\n106#2:773\n79#3,6:743\n86#3,3:758\n89#3,2:767\n93#3:772\n347#4,9:749\n356#4,3:769\n4206#5,6:761\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1$3\n*L\n124#1:737,6\n124#1:773\n124#1:743,6\n124#1:758,3\n124#1:767,2\n124#1:772\n124#1:749,9\n124#1:769,3\n124#1:761,6\n*E\n"})
        static final class C0183b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23846a;

            /* JADX WARN: Multi-variable type inference failed */
            C0183b(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f23846a = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1033635954, i10, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:123)");
                }
                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.i6.d(androidx.compose.ui.a0.E, 0.0f, 1, null);
                androidx.compose.foundation.layout.q.e eVarO = androidx.compose.foundation.layout.q.f16330a.o();
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23846a;
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarO, cVarQ, c0Var, 54);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                nVar.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f23842a = function2;
            this.f23843b = function3;
            this.f23844c = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(x5Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2019867954, i10, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:102)");
            }
            if (this.f23842a == null) {
                c0Var.E(-1394361313);
                androidx.compose.foundation.layout.l6.a(n0.f23831c, c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(-1394295686);
                androidx.compose.ui.a0 a0Var = n0.f23832d;
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f23842a;
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var, 48);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.c(c0Var, 6))), function2, c0Var, androidx.compose.runtime.n4.f36267i);
                c0Var.o();
                c0Var.A();
            }
            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.layout.i6.d(androidx.compose.ui.a0.E, 0.0f, 1, null), 1.0f, false, 2, null);
            androidx.compose.ui.e.c cVarQ2 = androidx.compose.ui.e.f37317a.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f23843b;
            androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ2, c0Var, 48);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarQ);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarE2, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.y5 y5Var2 = androidx.compose.foundation.layout.y5.f16577a;
            wk.l(x9.f25488a.c(c0Var, 6).l(), androidx.compose.runtime.internal.w.e(1206983395, true, new a(function3), c0Var, 54), c0Var, 48);
            c0Var.o();
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(u4.f25148a.d(c0Var, 6))), androidx.compose.runtime.internal.w.e(-1033635954, true, new C0183b(this.f23844c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        float f10 = 4;
        float fR = androidx.compose.ui.unit.h.r(f10);
        f23830b = fR;
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        f23831c = androidx.compose.foundation.layout.i6.B(aVar, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(16) - fR));
        f23832d = androidx.compose.foundation.layout.i6.B(androidx.compose.foundation.layout.i6.d(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(72) - fR));
        f23833e = androidx.compose.ui.unit.h.r(8);
        f23834f = androidx.compose.ui.unit.h.r(f10);
        f23835g = androidx.compose.foundation.layout.b7.e(androidx.compose.ui.unit.h.r(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float B(float f10, float f11) {
        return -((float) Math.sqrt((f10 * f10) - (f11 * f11)));
    }

    @NotNull
    public static final Pair<Float, Float> C(float f10, float f11, float f12) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f13 = f11 * f11;
        float f14 = f12 * f12;
        float f15 = (f10 * f10) + f13;
        float f16 = f13 * f14 * (f15 - f14);
        float f17 = f10 * f14;
        double d10 = f16;
        float fSqrt = (f17 - ((float) Math.sqrt(d10))) / f15;
        float fSqrt2 = (f17 + ((float) Math.sqrt(d10))) / f15;
        float fSqrt3 = (float) Math.sqrt(f14 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f14 - (fSqrt2 * fSqrt2));
        if (f11 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f10) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }

    private static final float D(float f10) {
        return f10 * f10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:104:0x016e  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x015c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void h(final long j10, final long j11, final float f10, final androidx.compose.foundation.layout.g5 g5Var, final androidx.compose.ui.graphics.q3 q3Var, final androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        float f11;
        int i13;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.a0 a0Var2;
        int i18;
        int i19;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1222317265);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.L(j11) ? 32 : 16;
        }
        if ((i11 & 4) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.D(g5Var)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(v6Var)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    i12 |= 1572864;
                    i17 = 1572864;
                    a0Var2 = a0Var;
                } else {
                    i17 = 1572864;
                    a0Var2 = a0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a0Var2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1222317265, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
                    }
                    int i20 = i12 << 6;
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, q3Var2, j10, j11, null, f11, androidx.compose.runtime.internal.w.e(-1628734195, true, new a(v6Var, g5Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 18) & 14) | i17 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | (i20 & 896) | (i20 & 7168) | (458752 & (i12 << 9)), 16);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.i(j10, j11, f10, g5Var, q3Var, v6Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            q3Var2 = q3Var;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(v6Var)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i12 |= 1572864;
                i17 = 1572864;
                a0Var2 = a0Var;
            } else {
                i17 = 1572864;
                a0Var2 = a0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1222317265, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
                }
                int i21 = i12 << 6;
                c0Var2 = c0VarR;
                ah.e(a0Var4, q3Var2, j10, j11, null, f11, androidx.compose.runtime.internal.w.e(-1628734195, true, new a(v6Var, g5Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 18) & 14) | i17 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | (i21 & 896) | (i21 & 7168) | (458752 & (i12 << 9)), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.i(j10, j11, f10, g5Var, q3Var, v6Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        f11 = f10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.D(g5Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(v6Var)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i12 |= 1572864;
                i17 = 1572864;
                a0Var2 = a0Var;
            } else {
                i17 = 1572864;
                a0Var2 = a0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1222317265, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
                }
                int i22 = i12 << 6;
                c0Var2 = c0VarR;
                ah.e(a0Var4, q3Var2, j10, j11, null, f11, androidx.compose.runtime.internal.w.e(-1628734195, true, new a(v6Var, g5Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 18) & 14) | i17 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (458752 & (i12 << 9)), 16);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.i(j10, j11, f10, g5Var, q3Var, v6Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        q3Var2 = q3Var;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.D(v6Var)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i12 |= 1572864;
            i17 = 1572864;
            a0Var2 = a0Var;
        } else {
            i17 = 1572864;
            a0Var2 = a0Var;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.D(a0Var2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(nVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i16 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1222317265, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
            }
            int i23 = i12 << 6;
            c0Var2 = c0VarR;
            ah.e(a0Var4, q3Var2, j10, j11, null, f11, androidx.compose.runtime.internal.w.e(-1628734195, true, new a(v6Var, g5Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 18) & 14) | i17 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | (i23 & 896) | (i23 & 7168) | (458752 & (i12 << 9)), 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.i(j10, j11, f10, g5Var, q3Var, v6Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(long j10, long j11, float f10, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(j10, j11, f10, g5Var, q3Var, v6Var, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012b A[PHI: r3 r5 r6 r8 r13 r15
      0x012b: PHI (r3v29 int) = (r3v22 int), (r3v30 int), (r3v31 int) binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r5v17 androidx.compose.ui.a0) = (r5v6 androidx.compose.ui.a0), (r5v3 androidx.compose.ui.a0), (r5v3 androidx.compose.ui.a0) binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r6v11 long) = (r6v7 long), (r6v6 long), (r6v6 long) binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r8v10 long) = (r8v5 long), (r8v2 long), (r8v2 long) binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r13v9 androidx.compose.ui.graphics.q3) = 
      (r13v4 androidx.compose.ui.graphics.q3)
      (r13v2 androidx.compose.ui.graphics.q3)
      (r13v2 androidx.compose.ui.graphics.q3)
     binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r15v10 float) = (r15v5 float), (r15v4 float), (r15v4 float) binds: [B:120:0x016f, B:104:0x0127, B:105:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long jH;
        long jD;
        int i13;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i14;
        int i15;
        float fA;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f11;
        final androidx.compose.foundation.layout.g5 g5Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.foundation.layout.g5 g5VarC;
        androidx.compose.ui.graphics.q3 q3Var4;
        androidx.compose.ui.graphics.q3 q3VarA;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1136595494);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(v6Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    jH = j10;
                    int i21 = c0VarR.L(jH) ? 256 : 128;
                    i12 |= i21;
                } else {
                    jH = j10;
                }
                i12 |= i21;
            } else {
                jH = j10;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j11;
                    int i22 = c0VarR.L(jD) ? 2048 : 1024;
                    i12 |= i22;
                } else {
                    jD = j11;
                }
                i12 |= i22;
            } else {
                jD = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        fA = f10;
                        if (c0VarR.I(fA)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 4793491) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i11 & 4) != 0) {
                                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                    i12 &= -7169;
                                }
                                if (i13 != 0) {
                                    q3Var2 = null;
                                }
                                if (i15 != 0) {
                                    fA = f0.f22689a.a();
                                }
                                if (i17 != 0) {
                                    g5VarC = f0.f22689a.c();
                                }
                                androidx.compose.ui.a0 a0Var4 = a0Var2;
                                q3Var4 = q3Var2;
                                float f12 = fA;
                                long j14 = jH;
                                long j15 = jD;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                                }
                                p8 p8Var = (p8) c0VarR.W(fe.q());
                                if (q3Var4 == null && p8Var != null && p8Var.d()) {
                                    q3VarA = new b2(q3Var4, p8Var);
                                } else {
                                    q3VarA = androidx.compose.ui.graphics.d3.a();
                                }
                                androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
                                int i23 = i12 >> 9;
                                int i24 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i23 & 896) | (i23 & 7168);
                                int i25 = i12 << 15;
                                c0Var2 = c0VarR;
                                h(j14, j15, f12, g5VarC, q3Var5, v6Var, a0Var4, nVar, c0Var2, i24 | (458752 & i25) | (i25 & 3670016) | (i12 & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var3 = q3Var4;
                                j12 = j14;
                                j13 = j15;
                                f11 = f12;
                                g5Var2 = g5VarC;
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                            }
                            g5VarC = g5Var;
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            q3Var4 = q3Var2;
                            float f13 = fA;
                            long j16 = jH;
                            long j17 = jD;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                            }
                            p8 p8Var2 = (p8) c0VarR.W(fe.q());
                            if (q3Var4 == null) {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            } else {
                                q3VarA = androidx.compose.ui.graphics.d3.a();
                            }
                            androidx.compose.ui.graphics.q3 q3Var6 = q3VarA;
                            int i26 = i12 >> 9;
                            int i27 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i26 & 896) | (i26 & 7168);
                            int i28 = i12 << 15;
                            c0Var2 = c0VarR;
                            h(j16, j17, f13, g5VarC, q3Var6, v6Var, a0Var5, nVar, c0Var2, i27 | (458752 & i28) | (i28 & 3670016) | (i12 & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var3 = q3Var4;
                            j12 = j16;
                            j13 = j17;
                            f11 = f13;
                            g5Var2 = g5VarC;
                            a0Var3 = a0Var5;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            j12 = jH;
                            j13 = jD;
                            q3Var3 = q3Var2;
                            f11 = fA;
                            g5Var2 = g5Var;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        }
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        q3Var4 = q3Var2;
                        float f14 = fA;
                        long j18 = jH;
                        long j19 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                        }
                        p8 p8Var3 = (p8) c0VarR.W(fe.q());
                        if (q3Var4 == null) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        androidx.compose.ui.graphics.q3 q3Var7 = q3VarA;
                        int i29 = i12 >> 9;
                        int i210 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i29 & 896) | (i29 & 7168);
                        int i211 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j18, j19, f14, g5VarC, q3Var7, v6Var, a0Var6, nVar, c0Var2, i210 | (458752 & i211) | (i211 & 3670016) | (i12 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var4;
                        j12 = j18;
                        j13 = j19;
                        f11 = f14;
                        g5Var2 = g5VarC;
                        a0Var3 = a0Var6;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        q3Var3 = q3Var2;
                        f11 = fA;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                fA = f10;
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        }
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        q3Var4 = q3Var2;
                        float f15 = fA;
                        long j110 = jH;
                        long j111 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                        }
                        p8 p8Var4 = (p8) c0VarR.W(fe.q());
                        if (q3Var4 == null) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        androidx.compose.ui.graphics.q3 q3Var8 = q3VarA;
                        int i212 = i12 >> 9;
                        int i213 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i212 & 896) | (i212 & 7168);
                        int i214 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j110, j111, f15, g5VarC, q3Var8, v6Var, a0Var7, nVar, c0Var2, i213 | (458752 & i214) | (i214 & 3670016) | (i12 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var4;
                        j12 = j110;
                        j13 = j111;
                        f11 = f15;
                        g5Var2 = g5VarC;
                        a0Var3 = a0Var7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        q3Var3 = q3Var2;
                        f11 = fA;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    q3Var4 = q3Var2;
                    float f16 = fA;
                    long j112 = jH;
                    long j113 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var5 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var9 = q3VarA;
                    int i215 = i12 >> 9;
                    int i216 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i215 & 896) | (i215 & 7168);
                    int i217 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j112, j113, f16, g5VarC, q3Var9, v6Var, a0Var8, nVar, c0Var2, i216 | (458752 & i217) | (i217 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j112;
                    j13 = j113;
                    f11 = f16;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var8;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            q3Var2 = q3Var;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    fA = f10;
                    if (c0VarR.I(fA)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        }
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        q3Var4 = q3Var2;
                        float f17 = fA;
                        long j114 = jH;
                        long j115 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                        }
                        p8 p8Var6 = (p8) c0VarR.W(fe.q());
                        if (q3Var4 == null) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        androidx.compose.ui.graphics.q3 q3Var10 = q3VarA;
                        int i218 = i12 >> 9;
                        int i219 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i218 & 896) | (i218 & 7168);
                        int i2110 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j114, j115, f17, g5VarC, q3Var10, v6Var, a0Var9, nVar, c0Var2, i219 | (458752 & i2110) | (i2110 & 3670016) | (i12 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var4;
                        j12 = j114;
                        j13 = j115;
                        f11 = f17;
                        g5Var2 = g5VarC;
                        a0Var3 = a0Var9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        q3Var3 = q3Var2;
                        f11 = fA;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    q3Var4 = q3Var2;
                    float f18 = fA;
                    long j116 = jH;
                    long j117 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var7 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var11 = q3VarA;
                    int i2111 = i12 >> 9;
                    int i2112 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i2111 & 896) | (i2111 & 7168);
                    int i2113 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j116, j117, f18, g5VarC, q3Var11, v6Var, a0Var10, nVar, c0Var2, i2112 | (458752 & i2113) | (i2113 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j116;
                    j13 = j117;
                    f11 = f18;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            fA = f10;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(g5Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    q3Var4 = q3Var2;
                    float f19 = fA;
                    long j118 = jH;
                    long j119 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var8 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var12 = q3VarA;
                    int i2114 = i12 >> 9;
                    int i2115 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i2114 & 896) | (i2114 & 7168);
                    int i2116 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j118, j119, f19, g5VarC, q3Var12, v6Var, a0Var11, nVar, c0Var2, i2115 | (458752 & i2116) | (i2116 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j118;
                    j13 = j119;
                    f11 = f19;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var11;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                }
                androidx.compose.ui.a0 a0Var12 = a0Var2;
                q3Var4 = q3Var2;
                float f110 = fA;
                long j1110 = jH;
                long j1111 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                }
                p8 p8Var9 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var13 = q3VarA;
                int i2117 = i12 >> 9;
                int i2118 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i2117 & 896) | (i2117 & 7168);
                int i2119 = i12 << 15;
                c0Var2 = c0VarR;
                h(j1110, j1111, f110, g5VarC, q3Var13, v6Var, a0Var12, nVar, c0Var2, i2118 | (458752 & i2119) | (i2119 & 3670016) | (i12 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j1110;
                j13 = j1111;
                f11 = f110;
                g5Var2 = g5VarC;
                a0Var3 = a0Var12;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i12 |= i21;
            } else {
                jH = j10;
            }
            i12 |= i21;
        } else {
            jH = j10;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i12 |= i22;
            } else {
                jD = j11;
            }
            i12 |= i22;
        } else {
            jD = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    fA = f10;
                    if (c0VarR.I(fA)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                q3Var2 = null;
                            }
                            if (i15 != 0) {
                                fA = f0.f22689a.a();
                            }
                            if (i17 != 0) {
                                g5VarC = f0.f22689a.c();
                            } else {
                                g5VarC = g5Var;
                            }
                        }
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        q3Var4 = q3Var2;
                        float f111 = fA;
                        long j1112 = jH;
                        long j1113 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                        }
                        p8 p8Var10 = (p8) c0VarR.W(fe.q());
                        if (q3Var4 == null) {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        } else {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        androidx.compose.ui.graphics.q3 q3Var14 = q3VarA;
                        int i21110 = i12 >> 9;
                        int i21111 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i21110 & 896) | (i21110 & 7168);
                        int i21112 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j1112, j1113, f111, g5VarC, q3Var14, v6Var, a0Var13, nVar, c0Var2, i21111 | (458752 & i21112) | (i21112 & 3670016) | (i12 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var4;
                        j12 = j1112;
                        j13 = j1113;
                        f11 = f111;
                        g5Var2 = g5VarC;
                        a0Var3 = a0Var13;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        q3Var3 = q3Var2;
                        f11 = fA;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    q3Var4 = q3Var2;
                    float f112 = fA;
                    long j1114 = jH;
                    long j1115 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var11 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var15 = q3VarA;
                    int i21113 = i12 >> 9;
                    int i21114 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i21113 & 896) | (i21113 & 7168);
                    int i21115 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j1114, j1115, f112, g5VarC, q3Var15, v6Var, a0Var14, nVar, c0Var2, i21114 | (458752 & i21115) | (i21115 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j1114;
                    j13 = j1115;
                    f11 = f112;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            fA = f10;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(g5Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    q3Var4 = q3Var2;
                    float f113 = fA;
                    long j1116 = jH;
                    long j1117 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var12 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var16 = q3VarA;
                    int i21116 = i12 >> 9;
                    int i21117 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i21116 & 896) | (i21116 & 7168);
                    int i21118 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j1116, j1117, f113, g5VarC, q3Var16, v6Var, a0Var15, nVar, c0Var2, i21117 | (458752 & i21118) | (i21118 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j1116;
                    j13 = j1117;
                    f11 = f113;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var15;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                }
                androidx.compose.ui.a0 a0Var16 = a0Var2;
                q3Var4 = q3Var2;
                float f114 = fA;
                long j1118 = jH;
                long j1119 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                }
                p8 p8Var13 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var17 = q3VarA;
                int i21119 = i12 >> 9;
                int i211110 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i21119 & 896) | (i21119 & 7168);
                int i211111 = i12 << 15;
                c0Var2 = c0VarR;
                h(j1118, j1119, f114, g5VarC, q3Var17, v6Var, a0Var16, nVar, c0Var2, i211110 | (458752 & i211111) | (i211111 & 3670016) | (i12 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j1118;
                j13 = j1119;
                f11 = f114;
                g5Var2 = g5VarC;
                a0Var3 = a0Var16;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        q3Var2 = q3Var;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                fA = f10;
                if (c0VarR.I(fA)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(g5Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            q3Var2 = null;
                        }
                        if (i15 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i17 != 0) {
                            g5VarC = f0.f22689a.c();
                        } else {
                            g5VarC = g5Var;
                        }
                    }
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    q3Var4 = q3Var2;
                    float f115 = fA;
                    long j11110 = jH;
                    long j11111 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                    }
                    p8 p8Var14 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var18 = q3VarA;
                    int i211112 = i12 >> 9;
                    int i211113 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i211112 & 896) | (i211112 & 7168);
                    int i211114 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j11110, j11111, f115, g5VarC, q3Var18, v6Var, a0Var17, nVar, c0Var2, i211113 | (458752 & i211114) | (i211114 & 3670016) | (i12 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j11110;
                    j13 = j11111;
                    f11 = f115;
                    g5Var2 = g5VarC;
                    a0Var3 = a0Var17;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                }
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                q3Var4 = q3Var2;
                float f116 = fA;
                long j11112 = jH;
                long j11113 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                }
                p8 p8Var15 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var19 = q3VarA;
                int i211115 = i12 >> 9;
                int i211116 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i211115 & 896) | (i211115 & 7168);
                int i211117 = i12 << 15;
                c0Var2 = c0VarR;
                h(j11112, j11113, f116, g5VarC, q3Var19, v6Var, a0Var18, nVar, c0Var2, i211116 | (458752 & i211117) | (i211117 & 3670016) | (i12 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j11112;
                j13 = j11113;
                f11 = f116;
                g5Var2 = g5VarC;
                a0Var3 = a0Var18;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        fA = f10;
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(g5Var)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        q3Var2 = null;
                    }
                    if (i15 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i17 != 0) {
                        g5VarC = f0.f22689a.c();
                    } else {
                        g5VarC = g5Var;
                    }
                }
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                q3Var4 = q3Var2;
                float f117 = fA;
                long j11114 = jH;
                long j11115 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                }
                p8 p8Var16 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var110 = q3VarA;
                int i211118 = i12 >> 9;
                int i211119 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i211118 & 896) | (i211118 & 7168);
                int i2111110 = i12 << 15;
                c0Var2 = c0VarR;
                h(j11114, j11115, f117, g5VarC, q3Var110, v6Var, a0Var19, nVar, c0Var2, i211119 | (458752 & i2111110) | (i2111110 & 3670016) | (i12 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j11114;
                j13 = j11115;
                f11 = f117;
                g5Var2 = g5VarC;
                a0Var3 = a0Var19;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i12 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    q3Var2 = null;
                }
                if (i15 != 0) {
                    fA = f0.f22689a.a();
                }
                if (i17 != 0) {
                    g5VarC = f0.f22689a.c();
                } else {
                    g5VarC = g5Var;
                }
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    q3Var2 = null;
                }
                if (i15 != 0) {
                    fA = f0.f22689a.a();
                }
                if (i17 != 0) {
                    g5VarC = f0.f22689a.c();
                } else {
                    g5VarC = g5Var;
                }
            }
            androidx.compose.ui.a0 a0Var110 = a0Var2;
            q3Var4 = q3Var2;
            float f118 = fA;
            long j11116 = jH;
            long j11117 = jD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1136595494, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
            }
            p8 p8Var17 = (p8) c0VarR.W(fe.q());
            if (q3Var4 == null) {
                q3VarA = androidx.compose.ui.graphics.d3.a();
            } else {
                q3VarA = androidx.compose.ui.graphics.d3.a();
            }
            androidx.compose.ui.graphics.q3 q3Var111 = q3VarA;
            int i2111111 = i12 >> 9;
            int i2111112 = ((i12 >> 6) & okhttp3.internal.ws.g.f334652s) | (i2111111 & 896) | (i2111111 & 7168);
            int i2111113 = i12 << 15;
            c0Var2 = c0VarR;
            h(j11116, j11117, f118, g5VarC, q3Var111, v6Var, a0Var110, nVar, c0Var2, i2111112 | (458752 & i2111113) | (i2111113 & 3670016) | (i12 & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var3 = q3Var4;
            j12 = j11116;
            j13 = j11117;
            f11 = f118;
            g5Var2 = g5VarC;
            a0Var3 = a0Var110;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jH;
            j13 = jD;
            q3Var3 = q3Var2;
            f11 = fA;
            g5Var2 = g5Var;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.l(v6Var, a0Var3, j12, j13, q3Var3, f11, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0178  */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        long jH;
        long jD;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i13;
        float fA;
        int i14;
        int i15;
        int i16;
        androidx.compose.foundation.layout.g5 g5Var2;
        int i17;
        int i18;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final long j12;
        final long j13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f11;
        final androidx.compose.foundation.layout.g5 g5Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.g5 g5VarC;
        androidx.compose.ui.graphics.q3 q3Var4;
        float f12;
        int i19;
        long j14;
        androidx.compose.ui.graphics.q3 q3VarA;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2058075642);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                jH = j10;
                int i21 = c0VarR.L(jH) ? 32 : 16;
                i12 |= i21;
            } else {
                jH = j10;
            }
            i12 |= i21;
        } else {
            jH = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jD = j11;
                int i22 = c0VarR.L(jD) ? 256 : 128;
                i12 |= i22;
            } else {
                jD = j11;
            }
            i12 |= i22;
        } else {
            jD = j11;
        }
        int i23 = i11 & 8;
        if (i23 == 0) {
            if ((i10 & 3072) == 0) {
                q3Var2 = q3Var;
                i12 |= c0VarR.D(q3Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    fA = f10;
                    if (c0VarR.I(fA)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i16 = 196608;
                    g5Var2 = g5Var;
                } else {
                    i16 = 196608;
                    g5Var2 = g5Var;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(g5Var2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i20 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if ((i11 & 2) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                        }
                        if (i23 != 0) {
                            q3Var2 = null;
                        }
                        if (i13 != 0) {
                            fA = f0.f22689a.a();
                        }
                        if (i15 != 0) {
                            a0Var4 = a0Var3;
                            g5VarC = f0.f22689a.c();
                            q3Var4 = q3Var2;
                            f12 = fA;
                            i19 = -2058075642;
                            j14 = jH;
                        } else {
                            a0Var4 = a0Var3;
                        }
                        long j15 = jD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
                        }
                        p8 p8Var = (p8) c0VarR.W(fe.q());
                        if (q3Var4 == null && p8Var != null && p8Var.d()) {
                            q3VarA = new b2(q3Var4, p8Var);
                        } else {
                            q3VarA = androidx.compose.ui.graphics.d3.a();
                        }
                        androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
                        int i24 = i12 >> 3;
                        int i25 = i12 >> 6;
                        c0Var2 = c0VarR;
                        h(j14, j15, f12, g5VarC, q3Var5, f23835g, a0Var4, nVar, c0Var2, (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 14) | i16 | (i25 & 896) | (i25 & 7168) | ((i12 << 18) & 3670016) | (29360128 & (i12 << 3)), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3Var4;
                        j12 = j14;
                        j13 = j15;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var2 = a0Var4;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        a0Var4 = a0Var;
                    }
                    q3Var4 = q3Var2;
                    g5VarC = g5Var2;
                    i19 = -2058075642;
                    j14 = jH;
                    f12 = fA;
                    long j16 = jD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
                    }
                    p8 p8Var2 = (p8) c0VarR.W(fe.q());
                    if (q3Var4 == null) {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    } else {
                        q3VarA = androidx.compose.ui.graphics.d3.a();
                    }
                    androidx.compose.ui.graphics.q3 q3Var6 = q3VarA;
                    int i26 = i12 >> 3;
                    int i27 = i12 >> 6;
                    c0Var2 = c0VarR;
                    h(j14, j16, f12, g5VarC, q3Var6, f23835g, a0Var4, nVar, c0Var2, (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 14) | i16 | (i27 & 896) | (i27 & 7168) | ((i12 << 18) & 3670016) | (29360128 & (i12 << 3)), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3Var4;
                    j12 = j14;
                    j13 = j16;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var2 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    j12 = jH;
                    j13 = jD;
                    q3Var3 = q3Var2;
                    f11 = fA;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.m(a0Var2, j12, j13, q3Var3, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            fA = f10;
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i16 = 196608;
                g5Var2 = g5Var;
            } else {
                i16 = 196608;
                g5Var2 = g5Var;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(g5Var2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i23 != 0) {
                        q3Var2 = null;
                    }
                    if (i13 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i15 != 0) {
                        a0Var4 = a0Var3;
                        g5VarC = f0.f22689a.c();
                        q3Var4 = q3Var2;
                        f12 = fA;
                        i19 = -2058075642;
                        j14 = jH;
                    } else {
                        a0Var4 = a0Var3;
                        q3Var4 = q3Var2;
                        g5VarC = g5Var2;
                        i19 = -2058075642;
                        j14 = jH;
                        f12 = fA;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i23 != 0) {
                        q3Var2 = null;
                    }
                    if (i13 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i15 != 0) {
                        a0Var4 = a0Var3;
                        g5VarC = f0.f22689a.c();
                        q3Var4 = q3Var2;
                        f12 = fA;
                        i19 = -2058075642;
                        j14 = jH;
                    } else {
                        a0Var4 = a0Var3;
                        q3Var4 = q3Var2;
                        g5VarC = g5Var2;
                        i19 = -2058075642;
                        j14 = jH;
                        f12 = fA;
                    }
                }
                long j17 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
                }
                p8 p8Var3 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var7 = q3VarA;
                int i28 = i12 >> 3;
                int i29 = i12 >> 6;
                c0Var2 = c0VarR;
                h(j14, j17, f12, g5VarC, q3Var7, f23835g, a0Var4, nVar, c0Var2, (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 14) | i16 | (i29 & 896) | (i29 & 7168) | ((i12 << 18) & 3670016) | (29360128 & (i12 << 3)), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j14;
                j13 = j17;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var2 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.m(a0Var2, j12, j13, q3Var3, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        q3Var2 = q3Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                fA = f10;
                if (c0VarR.I(fA)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i16 = 196608;
                g5Var2 = g5Var;
            } else {
                i16 = 196608;
                g5Var2 = g5Var;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(g5Var2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i23 != 0) {
                        q3Var2 = null;
                    }
                    if (i13 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i15 != 0) {
                        a0Var4 = a0Var3;
                        g5VarC = f0.f22689a.c();
                        q3Var4 = q3Var2;
                        f12 = fA;
                        i19 = -2058075642;
                        j14 = jH;
                    } else {
                        a0Var4 = a0Var3;
                        q3Var4 = q3Var2;
                        g5VarC = g5Var2;
                        i19 = -2058075642;
                        j14 = jH;
                        f12 = fA;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i23 != 0) {
                        q3Var2 = null;
                    }
                    if (i13 != 0) {
                        fA = f0.f22689a.a();
                    }
                    if (i15 != 0) {
                        a0Var4 = a0Var3;
                        g5VarC = f0.f22689a.c();
                        q3Var4 = q3Var2;
                        f12 = fA;
                        i19 = -2058075642;
                        j14 = jH;
                    } else {
                        a0Var4 = a0Var3;
                        q3Var4 = q3Var2;
                        g5VarC = g5Var2;
                        i19 = -2058075642;
                        j14 = jH;
                        f12 = fA;
                    }
                }
                long j18 = jD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
                }
                p8 p8Var4 = (p8) c0VarR.W(fe.q());
                if (q3Var4 == null) {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                } else {
                    q3VarA = androidx.compose.ui.graphics.d3.a();
                }
                androidx.compose.ui.graphics.q3 q3Var8 = q3VarA;
                int i210 = i12 >> 3;
                int i211 = i12 >> 6;
                c0Var2 = c0VarR;
                h(j14, j18, f12, g5VarC, q3Var8, f23835g, a0Var4, nVar, c0Var2, (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 14) | i16 | (i211 & 896) | (i211 & 7168) | ((i12 << 18) & 3670016) | (29360128 & (i12 << 3)), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3Var4;
                j12 = j14;
                j13 = j18;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var2 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                j12 = jH;
                j13 = jD;
                q3Var3 = q3Var2;
                f11 = fA;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.m(a0Var2, j12, j13, q3Var3, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        fA = f10;
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            i16 = 196608;
            g5Var2 = g5Var;
        } else {
            i16 = 196608;
            g5Var2 = g5Var;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(g5Var2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(nVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i23 != 0) {
                    q3Var2 = null;
                }
                if (i13 != 0) {
                    fA = f0.f22689a.a();
                }
                if (i15 != 0) {
                    a0Var4 = a0Var3;
                    g5VarC = f0.f22689a.c();
                    q3Var4 = q3Var2;
                    f12 = fA;
                    i19 = -2058075642;
                    j14 = jH;
                } else {
                    a0Var4 = a0Var3;
                    q3Var4 = q3Var2;
                    g5VarC = g5Var2;
                    i19 = -2058075642;
                    j14 = jH;
                    f12 = fA;
                }
            } else {
                if (i20 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 2) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i23 != 0) {
                    q3Var2 = null;
                }
                if (i13 != 0) {
                    fA = f0.f22689a.a();
                }
                if (i15 != 0) {
                    a0Var4 = a0Var3;
                    g5VarC = f0.f22689a.c();
                    q3Var4 = q3Var2;
                    f12 = fA;
                    i19 = -2058075642;
                    j14 = jH;
                } else {
                    a0Var4 = a0Var3;
                    q3Var4 = q3Var2;
                    g5VarC = g5Var2;
                    i19 = -2058075642;
                    j14 = jH;
                    f12 = fA;
                }
            }
            long j19 = jD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i19, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
            }
            p8 p8Var5 = (p8) c0VarR.W(fe.q());
            if (q3Var4 == null) {
                q3VarA = androidx.compose.ui.graphics.d3.a();
            } else {
                q3VarA = androidx.compose.ui.graphics.d3.a();
            }
            androidx.compose.ui.graphics.q3 q3Var9 = q3VarA;
            int i212 = i12 >> 3;
            int i213 = i12 >> 6;
            c0Var2 = c0VarR;
            h(j14, j19, f12, g5VarC, q3Var9, f23835g, a0Var4, nVar, c0Var2, (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 14) | i16 | (i213 & 896) | (i213 & 7168) | ((i12 << 18) & 3670016) | (29360128 & (i12 << 3)), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var3 = q3Var4;
            j12 = j14;
            j13 = j19;
            f11 = f12;
            g5Var3 = g5VarC;
            a0Var2 = a0Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            j12 = jH;
            j13 = jD;
            q3Var3 = q3Var2;
            f11 = fA;
            g5Var3 = g5Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.m(a0Var2, j12, j13, q3Var3, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.ui.graphics.q3 q3Var, float f10, androidx.compose.foundation.layout.g5 g5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(v6Var, a0Var, j10, j11, q3Var, f10, g5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.ui.graphics.q3 q3Var, float f10, androidx.compose.foundation.layout.g5 g5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, j10, j11, q3Var, f10, g5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x0183  */
    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:111:0x019e  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void n(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jH;
        long j12;
        float fD;
        int i13;
        androidx.compose.foundation.layout.g5 g5Var2;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j13;
        final long j14;
        final float f11;
        final androidx.compose.foundation.layout.g5 g5Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.a0 a0Var5;
        long j15;
        float f12;
        androidx.compose.foundation.layout.g5 g5VarC;
        long j16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2030536439);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                jH = j10;
                int i17 = c0VarR.L(jH) ? 32 : 16;
                i12 |= i17;
            } else {
                jH = j10;
            }
            i12 |= i17;
        } else {
            jH = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j11;
                int i18 = c0VarR.L(j12) ? 256 : 128;
                i12 |= i18;
            } else {
                j12 = j11;
            }
            i12 |= i18;
        } else {
            j12 = j11;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 3072) == 0) {
                fD = f10;
                i12 |= c0VarR.I(fD) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i12 |= i15;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            }
                            if ((i11 & 4) != 0) {
                                long jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                                i12 &= -897;
                                j12 = jD;
                            }
                            if (i19 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i13 != 0) {
                                a0Var5 = a0Var4;
                                j15 = j12;
                                f12 = fD;
                                g5VarC = f0.f22689a.c();
                                j16 = jH;
                            } else {
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                            }
                            int i20 = i12 >> 3;
                            c0Var2 = c0VarR;
                            h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i20 & 7168) | (i20 & 14) | 221184 | (i20 & com.planner5d.library.engine.input.f.b.B) | (i20 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j13 = j16;
                            j14 = j15;
                            f11 = f12;
                            g5Var3 = g5VarC;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            a0Var5 = a0Var2;
                        }
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                        }
                        int i21 = i12 >> 3;
                        c0Var2 = c0VarR;
                        h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i21 & 7168) | (i21 & 14) | 221184 | (i21 & com.planner5d.library.engine.input.f.b.B) | (i21 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j13 = j16;
                        j14 = j15;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var3 = a0Var5;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j13 = jH;
                        j14 = j12;
                        f11 = fD;
                        g5Var3 = g5Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD2 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD2;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD3 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD3;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                    }
                    int i22 = i12 >> 3;
                    c0Var2 = c0VarR;
                    h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i22 & 7168) | (i22 & 14) | 221184 | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = j16;
                    j14 = j15;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jH;
                    j14 = j12;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            g5Var2 = g5Var;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD4 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD4;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD5 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD5;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                    }
                    int i23 = i12 >> 3;
                    c0Var2 = c0VarR;
                    h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i23 & 7168) | (i23 & 14) | 221184 | (i23 & com.planner5d.library.engine.input.f.b.B) | (i23 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = j16;
                    j14 = j15;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jH;
                    j14 = j12;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD6 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD6;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD7 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD7;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                }
                int i24 = i12 >> 3;
                c0Var2 = c0VarR;
                h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i24 & 7168) | (i24 & 14) | 221184 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = j16;
                j14 = j15;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jH;
                j14 = j12;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        fD = f10;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                g5Var2 = g5Var;
                if (c0VarR.D(g5Var2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD8 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD8;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jD9 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jD9;
                        }
                        if (i19 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i13 != 0) {
                            a0Var5 = a0Var4;
                            j15 = j12;
                            f12 = fD;
                            g5VarC = f0.f22689a.c();
                            j16 = jH;
                        } else {
                            a0Var5 = a0Var4;
                            f12 = fD;
                            j16 = jH;
                            g5VarC = g5Var2;
                            j15 = j12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                    }
                    int i25 = i12 >> 3;
                    c0Var2 = c0VarR;
                    h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i25 & 7168) | (i25 & 14) | 221184 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = j16;
                    j14 = j15;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jH;
                    j14 = j12;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD10 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD10;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD11 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD11;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                }
                int i26 = i12 >> 3;
                c0Var2 = c0VarR;
                h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i26 & 7168) | (i26 & 14) | 221184 | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = j16;
                j14 = j15;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jH;
                j14 = j12;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        g5Var2 = g5Var;
        if ((i11 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD12 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD12;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jD13 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jD13;
                    }
                    if (i19 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i13 != 0) {
                        a0Var5 = a0Var4;
                        j15 = j12;
                        f12 = fD;
                        g5VarC = f0.f22689a.c();
                        j16 = jH;
                    } else {
                        a0Var5 = a0Var4;
                        f12 = fD;
                        j16 = jH;
                        g5VarC = g5Var2;
                        j15 = j12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                }
                int i27 = i12 >> 3;
                c0Var2 = c0VarR;
                h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i27 & 7168) | (i27 & 14) | 221184 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = j16;
                j14 = j15;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jH;
                j14 = j12;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                }
                if ((i11 & 4) != 0) {
                    long jD14 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jD14;
                }
                if (i19 != 0) {
                    fD = f0.f22689a.d();
                }
                if (i13 != 0) {
                    a0Var5 = a0Var4;
                    j15 = j12;
                    f12 = fD;
                    g5VarC = f0.f22689a.c();
                    j16 = jH;
                } else {
                    a0Var5 = a0Var4;
                    f12 = fD;
                    j16 = jH;
                    g5VarC = g5Var2;
                    j15 = j12;
                }
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                }
                if ((i11 & 4) != 0) {
                    long jD15 = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jD15;
                }
                if (i19 != 0) {
                    fD = f0.f22689a.d();
                }
                if (i13 != 0) {
                    a0Var5 = a0Var4;
                    j15 = j12;
                    f12 = fD;
                    g5VarC = f0.f22689a.c();
                    j16 = jH;
                } else {
                    a0Var5 = a0Var4;
                    f12 = fD;
                    j16 = jH;
                    g5VarC = g5Var2;
                    j15 = j12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2030536439, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
            }
            int i28 = i12 >> 3;
            c0Var2 = c0VarR;
            h(j16, j15, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), f23835g, a0Var5, nVar, c0Var2, (i28 & 7168) | (i28 & 14) | 221184 | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | ((i12 << 18) & 3670016) | ((i12 << 6) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j13 = j16;
            j14 = j15;
            f11 = f12;
            g5Var3 = g5VarC;
            a0Var3 = a0Var5;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j13 = jH;
            j14 = j12;
            f11 = fD;
            g5Var3 = g5Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.r(a0Var3, j13, j14, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0165  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01df  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void o(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.foundation.layout.v6 v6Var2;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i16;
        int i17;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarB;
        int i18;
        long jH;
        int i19;
        int i20;
        int i21;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        final long j12;
        final float f11;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        int i22;
        long jD;
        androidx.compose.ui.a0 a0Var4;
        long j14;
        float fD;
        int i23;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(138090236);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                v6Var2 = v6Var;
                i12 |= c0VarR.D(v6Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            nVarB = nVar;
                            if (c0VarR.k0(nVarB)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((196608 & i10) == 0) {
                            if ((i11 & 32) == 0) {
                                jH = j10;
                                int i24 = c0VarR.L(jH) ? 131072 : 65536;
                                i12 |= i24;
                            } else {
                                jH = j10;
                            }
                            i12 |= i24;
                        } else {
                            jH = j10;
                        }
                        if ((1572864 & i10) != 0) {
                            if ((i11 & 64) == 0 || !c0VarR.L(j11)) {
                                i23 = 524288;
                            } else {
                                i23 = 1048576;
                            }
                            i12 |= i23;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f10)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((4793491 & i12) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i21 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    nVarB = o4.f24030a.b();
                                }
                                if ((i11 & 32) != 0) {
                                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                    i22 = i21 & (-458753);
                                } else {
                                    i22 = i21;
                                }
                                if ((i11 & 64) != 0) {
                                    jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                    i22 &= -3670017;
                                } else {
                                    jD = j11;
                                }
                                if (i19 != 0) {
                                    a0Var4 = a0Var2;
                                    j14 = jD;
                                    fD = f0.f22689a.d();
                                } else {
                                    a0Var4 = a0Var2;
                                    j14 = jD;
                                    fD = f10;
                                }
                            } else {
                                c0VarR.u();
                                i22 = (i11 & 32) != 0 ? i21 & (-458753) : i21;
                                if ((i11 & 64) != 0) {
                                    i22 &= -3670017;
                                }
                                j14 = j11;
                                fD = f10;
                                a0Var4 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                            }
                            int i25 = i22 >> 15;
                            int i26 = i22 << 12;
                            c0Var2 = c0VarR;
                            h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i25 & 896) | (i25 & 14) | 12610560 | (i25 & com.planner5d.library.engine.input.f.b.B) | (458752 & i26) | (i26 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function5 = function4;
                            nVar2 = nVarB;
                            j12 = j14;
                            f11 = fD;
                            a0Var3 = a0Var4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            function5 = function4;
                            nVar2 = nVarB;
                            j12 = j11;
                            f11 = f10;
                        }
                        j13 = jH;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    nVarB = nVar;
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jH = j10;
                            if (c0VarR.L(jH)) {
                            }
                            i12 |= i24;
                        } else {
                            jH = j10;
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((4793491 & i12) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                        }
                        int i27 = i22 >> 15;
                        int i28 = i22 << 12;
                        c0Var2 = c0VarR;
                        h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i27 & 896) | (i27 & 14) | 12610560 | (i27 & com.planner5d.library.engine.input.f.b.B) | (458752 & i28) | (i28 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j14;
                        f11 = fD;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j11;
                        f11 = f10;
                    }
                    j13 = jH;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                function4 = function3;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        nVarB = nVar;
                        if (c0VarR.k0(nVarB)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jH = j10;
                            if (c0VarR.L(jH)) {
                            }
                            i12 |= i24;
                        } else {
                            jH = j10;
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((4793491 & i12) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                        }
                        int i29 = i22 >> 15;
                        int i210 = i22 << 12;
                        c0Var2 = c0VarR;
                        h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i29 & 896) | (i29 & 14) | 12610560 | (i29 & com.planner5d.library.engine.input.f.b.B) | (458752 & i210) | (i210 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j14;
                        f11 = fD;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j11;
                        f11 = f10;
                    }
                    j13 = jH;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVarB = nVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i211 = i22 >> 15;
                    int i212 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i211 & 896) | (i211 & 14) | 12610560 | (i211 & com.planner5d.library.engine.input.f.b.B) | (458752 & i212) | (i212 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        nVarB = nVar;
                        if (c0VarR.k0(nVarB)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jH = j10;
                            if (c0VarR.L(jH)) {
                            }
                            i12 |= i24;
                        } else {
                            jH = j10;
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((4793491 & i12) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                        }
                        int i213 = i22 >> 15;
                        int i214 = i22 << 12;
                        c0Var2 = c0VarR;
                        h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i213 & 896) | (i213 & 14) | 12610560 | (i213 & com.planner5d.library.engine.input.f.b.B) | (458752 & i214) | (i214 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j14;
                        f11 = fD;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j11;
                        f11 = f10;
                    }
                    j13 = jH;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVarB = nVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i215 = i22 >> 15;
                    int i216 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i215 & 896) | (i215 & 14) | 12610560 | (i215 & com.planner5d.library.engine.input.f.b.B) | (458752 & i216) | (i216 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    nVarB = nVar;
                    if (c0VarR.k0(nVarB)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i217 = i22 >> 15;
                    int i218 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i217 & 896) | (i217 & 14) | 12610560 | (i217 & com.planner5d.library.engine.input.f.b.B) | (458752 & i218) | (i218 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVarB = nVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jH = j10;
                    if (c0VarR.L(jH)) {
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                i12 |= i24;
            } else {
                jH = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                }
                int i219 = i22 >> 15;
                int i2110 = i22 << 12;
                c0Var2 = c0VarR;
                h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i219 & 896) | (i219 & 14) | 12610560 | (i219 & com.planner5d.library.engine.input.f.b.B) | (458752 & i2110) | (i2110 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function4;
                nVar2 = nVarB;
                j12 = j14;
                f11 = fD;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function5 = function4;
                nVar2 = nVarB;
                j12 = j11;
                f11 = f10;
            }
            j13 = jH;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        v6Var2 = v6Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        nVarB = nVar;
                        if (c0VarR.k0(nVarB)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jH = j10;
                            if (c0VarR.L(jH)) {
                            }
                            i12 |= i24;
                        } else {
                            jH = j10;
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((4793491 & i12) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                nVarB = o4.f24030a.b();
                            }
                            if ((i11 & 32) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i22 = i21 & (-458753);
                            } else {
                                i22 = i21;
                            }
                            if ((i11 & 64) != 0) {
                                jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                                i22 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if (i19 != 0) {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f0.f22689a.d();
                            } else {
                                a0Var4 = a0Var2;
                                j14 = jD;
                                fD = f10;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                        }
                        int i2111 = i22 >> 15;
                        int i2112 = i22 << 12;
                        c0Var2 = c0VarR;
                        h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i2111 & 896) | (i2111 & 14) | 12610560 | (i2111 & com.planner5d.library.engine.input.f.b.B) | (458752 & i2112) | (i2112 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j14;
                        f11 = fD;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function5 = function4;
                        nVar2 = nVarB;
                        j12 = j11;
                        f11 = f10;
                    }
                    j13 = jH;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVarB = nVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i2113 = i22 >> 15;
                    int i2114 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i2113 & 896) | (i2113 & 14) | 12610560 | (i2113 & com.planner5d.library.engine.input.f.b.B) | (458752 & i2114) | (i2114 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    nVarB = nVar;
                    if (c0VarR.k0(nVarB)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i2115 = i22 >> 15;
                    int i2116 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i2115 & 896) | (i2115 & 14) | 12610560 | (i2115 & com.planner5d.library.engine.input.f.b.B) | (458752 & i2116) | (i2116 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVarB = nVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jH = j10;
                    if (c0VarR.L(jH)) {
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                i12 |= i24;
            } else {
                jH = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                }
                int i2117 = i22 >> 15;
                int i2118 = i22 << 12;
                c0Var2 = c0VarR;
                h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i2117 & 896) | (i2117 & 14) | 12610560 | (i2117 & com.planner5d.library.engine.input.f.b.B) | (458752 & i2118) | (i2118 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function4;
                nVar2 = nVarB;
                j12 = j14;
                f11 = fD;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function5 = function4;
                nVar2 = nVarB;
                j12 = j11;
                f11 = f10;
            }
            j13 = jH;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    nVarB = nVar;
                    if (c0VarR.k0(nVarB)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jH = j10;
                        if (c0VarR.L(jH)) {
                        }
                        i12 |= i24;
                    } else {
                        jH = j10;
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            nVarB = o4.f24030a.b();
                        }
                        if ((i11 & 32) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i22 = i21 & (-458753);
                        } else {
                            i22 = i21;
                        }
                        if ((i11 & 64) != 0) {
                            jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                            i22 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if (i19 != 0) {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f0.f22689a.d();
                        } else {
                            a0Var4 = a0Var2;
                            j14 = jD;
                            fD = f10;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                    }
                    int i2119 = i22 >> 15;
                    int i21110 = i22 << 12;
                    c0Var2 = c0VarR;
                    h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i2119 & 896) | (i2119 & 14) | 12610560 | (i2119 & com.planner5d.library.engine.input.f.b.B) | (458752 & i21110) | (i21110 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j14;
                    f11 = fD;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function5 = function4;
                    nVar2 = nVarB;
                    j12 = j11;
                    f11 = f10;
                }
                j13 = jH;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVarB = nVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jH = j10;
                    if (c0VarR.L(jH)) {
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                i12 |= i24;
            } else {
                jH = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                }
                int i21111 = i22 >> 15;
                int i21112 = i22 << 12;
                c0Var2 = c0VarR;
                h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i21111 & 896) | (i21111 & 14) | 12610560 | (i21111 & com.planner5d.library.engine.input.f.b.B) | (458752 & i21112) | (i21112 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function4;
                nVar2 = nVarB;
                j12 = j14;
                f11 = fD;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function5 = function4;
                nVar2 = nVarB;
                j12 = j11;
                f11 = f10;
            }
            j13 = jH;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function4 = function3;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                nVarB = nVar;
                if (c0VarR.k0(nVarB)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jH = j10;
                    if (c0VarR.L(jH)) {
                    }
                    i12 |= i24;
                } else {
                    jH = j10;
                }
                i12 |= i24;
            } else {
                jH = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        nVarB = o4.f24030a.b();
                    }
                    if ((i11 & 32) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i22 = i21 & (-458753);
                    } else {
                        i22 = i21;
                    }
                    if ((i11 & 64) != 0) {
                        jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                        i22 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if (i19 != 0) {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f0.f22689a.d();
                    } else {
                        a0Var4 = a0Var2;
                        j14 = jD;
                        fD = f10;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                }
                int i21113 = i22 >> 15;
                int i21114 = i22 << 12;
                c0Var2 = c0VarR;
                h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i21113 & 896) | (i21113 & 14) | 12610560 | (i21113 & com.planner5d.library.engine.input.f.b.B) | (458752 & i21114) | (i21114 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function5 = function4;
                nVar2 = nVarB;
                j12 = j14;
                f11 = fD;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function5 = function4;
                nVar2 = nVarB;
                j12 = j11;
                f11 = f10;
            }
            j13 = jH;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVarB = nVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i12 |= i24;
            } else {
                jH = j10;
            }
            i12 |= i24;
        } else {
            jH = j10;
        }
        if ((1572864 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i12;
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i21 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    nVarB = o4.f24030a.b();
                }
                if ((i11 & 32) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i22 = i21 & (-458753);
                } else {
                    i22 = i21;
                }
                if ((i11 & 64) != 0) {
                    jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                    i22 &= -3670017;
                } else {
                    jD = j11;
                }
                if (i19 != 0) {
                    a0Var4 = a0Var2;
                    j14 = jD;
                    fD = f0.f22689a.d();
                } else {
                    a0Var4 = a0Var2;
                    j14 = jD;
                    fD = f10;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    nVarB = o4.f24030a.b();
                }
                if ((i11 & 32) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i22 = i21 & (-458753);
                } else {
                    i22 = i21;
                }
                if ((i11 & 64) != 0) {
                    jD = n4.d(jH, c0VarR, (i22 >> 15) & 14);
                    i22 &= -3670017;
                } else {
                    jD = j11;
                }
                if (i19 != 0) {
                    a0Var4 = a0Var2;
                    j14 = jD;
                    fD = f0.f22689a.d();
                } else {
                    a0Var4 = a0Var2;
                    j14 = jD;
                    fD = f10;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(138090236, i22, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
            }
            int i21115 = i22 >> 15;
            int i21116 = i22 << 12;
            c0Var2 = c0VarR;
            h(jH, j14, fD, f0.f22689a.c(), androidx.compose.ui.graphics.d3.a(), v6Var2, a0Var4, androidx.compose.runtime.internal.w.e(-2019867954, true, new b(function4, function2, nVarB), c0VarR, 54), c0Var2, (i21115 & 896) | (i21115 & 14) | 12610560 | (i21115 & com.planner5d.library.engine.input.f.b.B) | (458752 & i21116) | (i21116 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function5 = function4;
            nVar2 = nVarB;
            j12 = j14;
            f11 = fD;
            a0Var3 = a0Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            function5 = function4;
            nVar2 = nVarB;
            j12 = j11;
            f11 = f10;
        }
        j13 = jH;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.s(function2, v6Var, a0Var3, function5, nVar2, j13, j12, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108 A[PHI: r3 r5 r6 r8 r12
      0x0108: PHI (r3v26 int) = (r3v20 int), (r3v27 int), (r3v28 int) binds: [B:107:0x0143, B:94:0x0104, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r5v8 androidx.compose.ui.a0) = (r5v5 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0) binds: [B:107:0x0143, B:94:0x0104, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v9 long) = (r6v7 long), (r6v6 long), (r6v6 long) binds: [B:107:0x0143, B:94:0x0104, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r8v8 long) = (r8v5 long), (r8v2 long), (r8v2 long) binds: [B:107:0x0143, B:94:0x0104, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r12v8 float) = (r12v5 float), (r12v3 float), (r12v3 float) binds: [B:107:0x0143, B:94:0x0104, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void p(@NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long jH;
        long jD;
        int i13;
        float fD;
        int i14;
        int i15;
        androidx.compose.foundation.layout.g5 g5Var2;
        int i16;
        int i17;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final float f11;
        final androidx.compose.foundation.layout.g5 g5Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.foundation.layout.g5 g5VarC;
        androidx.compose.ui.a0 a0Var4;
        long j14;
        float f12;
        long j15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(684777089);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(v6Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    jH = j10;
                    int i19 = c0VarR.L(jH) ? 256 : 128;
                    i12 |= i19;
                } else {
                    jH = j10;
                }
                i12 |= i19;
            } else {
                jH = j10;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j11;
                    int i20 = c0VarR.L(jD) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jD = j11;
                }
                i12 |= i20;
            } else {
                jD = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    fD = f10;
                    if (c0VarR.I(fD)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        g5Var2 = g5Var;
                        if (c0VarR.D(g5Var2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i11 & 4) != 0) {
                                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                    i12 &= -7169;
                                }
                                if (i13 != 0) {
                                    fD = f0.f22689a.d();
                                }
                                if (i15 != 0) {
                                    g5VarC = f0.f22689a.c();
                                    a0Var4 = a0Var2;
                                    j14 = jD;
                                    f12 = fD;
                                    j15 = jH;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                                }
                                int i21 = i12 >> 6;
                                int i22 = i12 << 15;
                                c0Var2 = c0VarR;
                                h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i21 & 7168) | (i21 & 14) | 24576 | (i21 & com.planner5d.library.engine.input.f.b.B) | (i21 & 896) | (458752 & i22) | (i22 & 3670016) | ((i12 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                j12 = j15;
                                j13 = j14;
                                f11 = f12;
                                g5Var3 = g5VarC;
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                            }
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                            }
                            int i23 = i12 >> 6;
                            int i24 = i12 << 15;
                            c0Var2 = c0VarR;
                            h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i23 & 7168) | (i23 & 14) | 24576 | (i23 & com.planner5d.library.engine.input.f.b.B) | (i23 & 896) | (458752 & i24) | (i24 & 3670016) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j15;
                            j13 = j14;
                            f11 = f12;
                            g5Var3 = g5VarC;
                            a0Var3 = a0Var4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            j12 = jH;
                            j13 = jD;
                            f11 = fD;
                            g5Var3 = g5Var2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                        }
                        int i25 = i12 >> 6;
                        int i26 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i25 & 7168) | (i25 & 14) | 24576 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (458752 & i26) | (i26 & 3670016) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j15;
                        j13 = j14;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        f11 = fD;
                        g5Var3 = g5Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                g5Var2 = g5Var;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                        }
                        int i27 = i12 >> 6;
                        int i28 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i27 & 7168) | (i27 & 14) | 24576 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (458752 & i28) | (i28 & 3670016) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j15;
                        j13 = j14;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        f11 = fD;
                        g5Var3 = g5Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i29 = i12 >> 6;
                    int i210 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i29 & 7168) | (i29 & 14) | 24576 | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | (458752 & i210) | (i210 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            fD = f10;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                        }
                        int i211 = i12 >> 6;
                        int i212 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i211 & 7168) | (i211 & 14) | 24576 | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | (458752 & i212) | (i212 & 3670016) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j15;
                        j13 = j14;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        f11 = fD;
                        g5Var3 = g5Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i213 = i12 >> 6;
                    int i214 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i213 & 7168) | (i213 & 14) | 24576 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | (458752 & i214) | (i214 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            g5Var2 = g5Var;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i215 = i12 >> 6;
                    int i216 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i215 & 7168) | (i215 & 14) | 24576 | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | (458752 & i216) | (i216 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                }
                int i217 = i12 >> 6;
                int i218 = i12 << 15;
                c0Var2 = c0VarR;
                h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i217 & 7168) | (i217 & 14) | 24576 | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 896) | (458752 & i218) | (i218 & 3670016) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j15;
                j13 = j14;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i12 |= i19;
            } else {
                jH = j10;
            }
            i12 |= i19;
        } else {
            jH = j10;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i12 |= i20;
            } else {
                jD = j11;
            }
            i12 |= i20;
        } else {
            jD = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                fD = f10;
                if (c0VarR.I(fD)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fD = f0.f22689a.d();
                            }
                            if (i15 != 0) {
                                g5VarC = f0.f22689a.c();
                                a0Var4 = a0Var2;
                                j14 = jD;
                                f12 = fD;
                                j15 = jH;
                            } else {
                                a0Var4 = a0Var2;
                                f12 = fD;
                                g5VarC = g5Var2;
                                j15 = jH;
                                j14 = jD;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                        }
                        int i219 = i12 >> 6;
                        int i2110 = i12 << 15;
                        c0Var2 = c0VarR;
                        h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i219 & 7168) | (i219 & 14) | 24576 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | (458752 & i2110) | (i2110 & 3670016) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j15;
                        j13 = j14;
                        f11 = f12;
                        g5Var3 = g5VarC;
                        a0Var3 = a0Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jH;
                        j13 = jD;
                        f11 = fD;
                        g5Var3 = g5Var2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i2111 = i12 >> 6;
                    int i2112 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i2111 & 7168) | (i2111 & 14) | 24576 | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 896) | (458752 & i2112) | (i2112 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            g5Var2 = g5Var;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i2113 = i12 >> 6;
                    int i2114 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i2113 & 7168) | (i2113 & 14) | 24576 | (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2113 & 896) | (458752 & i2114) | (i2114 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                }
                int i2115 = i12 >> 6;
                int i2116 = i12 << 15;
                c0Var2 = c0VarR;
                h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i2115 & 7168) | (i2115 & 14) | 24576 | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 896) | (458752 & i2116) | (i2116 & 3670016) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j15;
                j13 = j14;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        fD = f10;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                g5Var2 = g5Var;
                if (c0VarR.D(g5Var2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fD = f0.f22689a.d();
                        }
                        if (i15 != 0) {
                            g5VarC = f0.f22689a.c();
                            a0Var4 = a0Var2;
                            j14 = jD;
                            f12 = fD;
                            j15 = jH;
                        } else {
                            a0Var4 = a0Var2;
                            f12 = fD;
                            g5VarC = g5Var2;
                            j15 = jH;
                            j14 = jD;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                    }
                    int i2117 = i12 >> 6;
                    int i2118 = i12 << 15;
                    c0Var2 = c0VarR;
                    h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i2117 & 7168) | (i2117 & 14) | 24576 | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 896) | (458752 & i2118) | (i2118 & 3670016) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j15;
                    j13 = j14;
                    f11 = f12;
                    g5Var3 = g5VarC;
                    a0Var3 = a0Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f11 = fD;
                    g5Var3 = g5Var2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                }
                int i2119 = i12 >> 6;
                int i21110 = i12 << 15;
                c0Var2 = c0VarR;
                h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i2119 & 7168) | (i2119 & 14) | 24576 | (i2119 & com.planner5d.library.engine.input.f.b.B) | (i2119 & 896) | (458752 & i21110) | (i21110 & 3670016) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j15;
                j13 = j14;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        g5Var2 = g5Var;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fD = f0.f22689a.d();
                    }
                    if (i15 != 0) {
                        g5VarC = f0.f22689a.c();
                        a0Var4 = a0Var2;
                        j14 = jD;
                        f12 = fD;
                        j15 = jH;
                    } else {
                        a0Var4 = a0Var2;
                        f12 = fD;
                        g5VarC = g5Var2;
                        j15 = jH;
                        j14 = jD;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                }
                int i21111 = i12 >> 6;
                int i21112 = i12 << 15;
                c0Var2 = c0VarR;
                h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i21111 & 7168) | (i21111 & 14) | 24576 | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 896) | (458752 & i21112) | (i21112 & 3670016) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j15;
                j13 = j14;
                f11 = f12;
                g5Var3 = g5VarC;
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f11 = fD;
                g5Var3 = g5Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fD = f0.f22689a.d();
                }
                if (i15 != 0) {
                    g5VarC = f0.f22689a.c();
                    a0Var4 = a0Var2;
                    j14 = jD;
                    f12 = fD;
                    j15 = jH;
                } else {
                    a0Var4 = a0Var2;
                    f12 = fD;
                    g5VarC = g5Var2;
                    j15 = jH;
                    j14 = jD;
                }
            } else {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fD = f0.f22689a.d();
                }
                if (i15 != 0) {
                    g5VarC = f0.f22689a.c();
                    a0Var4 = a0Var2;
                    j14 = jD;
                    f12 = fD;
                    j15 = jH;
                } else {
                    a0Var4 = a0Var2;
                    f12 = fD;
                    g5VarC = g5Var2;
                    j15 = jH;
                    j14 = jD;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(684777089, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
            }
            int i21113 = i12 >> 6;
            int i21114 = i12 << 15;
            c0Var2 = c0VarR;
            h(j15, j14, f12, g5VarC, androidx.compose.ui.graphics.d3.a(), v6Var, a0Var4, nVar, c0Var2, (i21113 & 7168) | (i21113 & 14) | 24576 | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 896) | (458752 & i21114) | (i21114 & 3670016) | ((i12 << 3) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j15;
            j13 = j14;
            f11 = f12;
            g5Var3 = g5VarC;
            a0Var3 = a0Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jH;
            j13 = jD;
            f11 = fD;
            g5Var3 = g5Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.t(v6Var, a0Var3, j12, j13, f11, g5Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x019d  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f A[PHI: r0 r4 r6 r8 r12 r14
      0x010f: PHI (r0v24 int) = (r0v11 int), (r0v29 int), (r0v30 int) binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r4v14 androidx.compose.ui.a0) = (r4v6 androidx.compose.ui.a0), (r4v3 androidx.compose.ui.a0), (r4v3 androidx.compose.ui.a0) binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r6v7 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>) = 
      (r6v4 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r6v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r6v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r8v7 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>) = 
      (r8v3 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r8v2 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
      (r8v2 pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r12v7 long) = (r12v3 long), (r12v1 long), (r12v1 long) binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r14v7 long) = (r14v2 long), (r14v1 long), (r14v1 long) binds: [B:109:0x0154, B:92:0x010c, B:93:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void q(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i14;
        int i15;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarA;
        int i16;
        long jH;
        long jD;
        int i17;
        int i18;
        int i19;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final float f11;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        int i20;
        float fD;
        int i21;
        int i22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-350082398);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function4) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        nVarA = nVar;
                        if (c0VarR.k0(nVarA)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        jH = j10;
                        if ((i11 & 16) == 0 || !c0VarR.L(jH)) {
                            i22 = 8192;
                        } else {
                            i22 = 16384;
                        }
                        i12 |= i22;
                    } else {
                        jH = j10;
                    }
                    if ((196608 & i10) == 0) {
                        jD = j11;
                        if ((i11 & 32) == 0 || !c0VarR.L(jD)) {
                            i21 = 65536;
                        } else {
                            i21 = 131072;
                        }
                        i12 |= i21;
                    } else {
                        jD = j11;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f10)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i12;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i15 != 0) {
                                nVarA = o4.f24030a.a();
                            }
                            if ((i11 & 16) != 0) {
                                jH = n4.h(x9.f25488a.a(c0VarR, 6));
                                i20 = i19 & (-57345);
                            } else {
                                i20 = i19;
                            }
                            if ((i11 & 32) != 0) {
                                jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                                i20 &= -458753;
                            }
                            if (i17 != 0) {
                                fD = f0.f22689a.d();
                            }
                            long j14 = jH;
                            long j15 = jD;
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function5;
                            pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3 = nVarA;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                            }
                            int i24 = (i20 & 14) | 48;
                            int i25 = i20 << 3;
                            c0Var2 = c0VarR;
                            o(function4, f23835g, a0Var4, function7, nVar3, j14, j15, fD, c0Var2, i24 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            function6 = function7;
                            nVar2 = nVar3;
                            j12 = j14;
                            j13 = j15;
                            f11 = fD;
                        } else {
                            c0VarR.u();
                            i20 = (i11 & 16) != 0 ? i19 & (-57345) : i19;
                            if ((i11 & 32) != 0) {
                                i20 &= -458753;
                            }
                        }
                        fD = f10;
                        long j16 = jH;
                        long j17 = jD;
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function5;
                        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4 = nVarA;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                        }
                        int i26 = (i20 & 14) | 48;
                        int i27 = i20 << 3;
                        c0Var2 = c0VarR;
                        o(function4, f23835g, a0Var5, function8, nVar4, j16, j17, fD, c0Var2, i26 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        function6 = function8;
                        nVar2 = nVar4;
                        j12 = j16;
                        j13 = j17;
                        f11 = fD;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f11 = f10;
                        a0Var3 = a0Var2;
                        function6 = function5;
                        nVar2 = nVarA;
                        j12 = jH;
                        j13 = jD;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                nVarA = nVar;
                if ((i10 & 24576) == 0) {
                    jH = j10;
                    if ((i11 & 16) == 0) {
                        i22 = 8192;
                    } else {
                        i22 = 8192;
                    }
                    i12 |= i22;
                } else {
                    jH = j10;
                }
                if ((196608 & i10) == 0) {
                    jD = j11;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    }
                    long j18 = jH;
                    long j19 = jD;
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function5;
                    pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5 = nVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                    }
                    int i28 = (i20 & 14) | 48;
                    int i29 = i20 << 3;
                    c0Var2 = c0VarR;
                    o(function4, f23835g, a0Var6, function9, nVar5, j18, j19, fD, c0Var2, i28 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    function6 = function9;
                    nVar2 = nVar5;
                    j12 = j18;
                    j13 = j19;
                    f11 = fD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    a0Var3 = a0Var2;
                    function6 = function5;
                    nVar2 = nVarA;
                    j12 = jH;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function5 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    nVarA = nVar;
                    if (c0VarR.k0(nVarA)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    jH = j10;
                    if ((i11 & 16) == 0) {
                        i22 = 8192;
                    } else {
                        i22 = 8192;
                    }
                    i12 |= i22;
                } else {
                    jH = j10;
                }
                if ((196608 & i10) == 0) {
                    jD = j11;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    }
                    long j110 = jH;
                    long j111 = jD;
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function5;
                    pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6 = nVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                    }
                    int i210 = (i20 & 14) | 48;
                    int i211 = i20 << 3;
                    c0Var2 = c0VarR;
                    o(function4, f23835g, a0Var7, function10, nVar6, j110, j111, fD, c0Var2, i210 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var7;
                    function6 = function10;
                    nVar2 = nVar6;
                    j12 = j110;
                    j13 = j111;
                    f11 = fD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    a0Var3 = a0Var2;
                    function6 = function5;
                    nVar2 = nVarA;
                    j12 = jH;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            nVarA = nVar;
            if ((i10 & 24576) == 0) {
                jH = j10;
                if ((i11 & 16) == 0) {
                    i22 = 8192;
                } else {
                    i22 = 8192;
                }
                i12 |= i22;
            } else {
                jH = j10;
            }
            if ((196608 & i10) == 0) {
                jD = j11;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                }
                long j112 = jH;
                long j113 = jD;
                androidx.compose.ui.a0 a0Var8 = a0Var2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function5;
                pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar7 = nVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                }
                int i212 = (i20 & 14) | 48;
                int i213 = i20 << 3;
                c0Var2 = c0VarR;
                o(function4, f23835g, a0Var8, function11, nVar7, j112, j113, fD, c0Var2, i212 | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                function6 = function11;
                nVar2 = nVar7;
                j12 = j112;
                j13 = j113;
                f11 = fD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                a0Var3 = a0Var2;
                function6 = function5;
                nVar2 = nVarA;
                j12 = jH;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    nVarA = nVar;
                    if (c0VarR.k0(nVarA)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    jH = j10;
                    if ((i11 & 16) == 0) {
                        i22 = 8192;
                    } else {
                        i22 = 8192;
                    }
                    i12 |= i22;
                } else {
                    jH = j10;
                }
                if ((196608 & i10) == 0) {
                    jD = j11;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i15 != 0) {
                            nVarA = o4.f24030a.a();
                        }
                        if ((i11 & 16) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i20 = i19 & (-57345);
                        } else {
                            i20 = i19;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                            i20 &= -458753;
                        }
                        if (i17 != 0) {
                            fD = f0.f22689a.d();
                        } else {
                            fD = f10;
                        }
                    }
                    long j114 = jH;
                    long j115 = jD;
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function5;
                    pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar8 = nVarA;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                    }
                    int i214 = (i20 & 14) | 48;
                    int i215 = i20 << 3;
                    c0Var2 = c0VarR;
                    o(function4, f23835g, a0Var9, function12, nVar8, j114, j115, fD, c0Var2, i214 | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    function6 = function12;
                    nVar2 = nVar8;
                    j12 = j114;
                    j13 = j115;
                    f11 = fD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f11 = f10;
                    a0Var3 = a0Var2;
                    function6 = function5;
                    nVar2 = nVarA;
                    j12 = jH;
                    j13 = jD;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            nVarA = nVar;
            if ((i10 & 24576) == 0) {
                jH = j10;
                if ((i11 & 16) == 0) {
                    i22 = 8192;
                } else {
                    i22 = 8192;
                }
                i12 |= i22;
            } else {
                jH = j10;
            }
            if ((196608 & i10) == 0) {
                jD = j11;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                }
                long j116 = jH;
                long j117 = jD;
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function5;
                pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar9 = nVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                }
                int i216 = (i20 & 14) | 48;
                int i217 = i20 << 3;
                c0Var2 = c0VarR;
                o(function4, f23835g, a0Var10, function13, nVar9, j116, j117, fD, c0Var2, i216 | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (3670016 & i217) | (i217 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var10;
                function6 = function13;
                nVar2 = nVar9;
                j12 = j116;
                j13 = j117;
                f11 = fD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                a0Var3 = a0Var2;
                function6 = function5;
                nVar2 = nVarA;
                j12 = jH;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function5 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                nVarA = nVar;
                if (c0VarR.k0(nVarA)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                jH = j10;
                if ((i11 & 16) == 0) {
                    i22 = 8192;
                } else {
                    i22 = 8192;
                }
                i12 |= i22;
            } else {
                jH = j10;
            }
            if ((196608 & i10) == 0) {
                jD = j11;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i12;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i15 != 0) {
                        nVarA = o4.f24030a.a();
                    }
                    if ((i11 & 16) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i20 = i19 & (-57345);
                    } else {
                        i20 = i19;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                        i20 &= -458753;
                    }
                    if (i17 != 0) {
                        fD = f0.f22689a.d();
                    } else {
                        fD = f10;
                    }
                }
                long j118 = jH;
                long j119 = jD;
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function5;
                pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar10 = nVarA;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                }
                int i218 = (i20 & 14) | 48;
                int i219 = i20 << 3;
                c0Var2 = c0VarR;
                o(function4, f23835g, a0Var11, function14, nVar10, j118, j119, fD, c0Var2, i218 | (i219 & 896) | (i219 & 7168) | (57344 & i219) | (458752 & i219) | (3670016 & i219) | (i219 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var11;
                function6 = function14;
                nVar2 = nVar10;
                j12 = j118;
                j13 = j119;
                f11 = fD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f11 = f10;
                a0Var3 = a0Var2;
                function6 = function5;
                nVar2 = nVarA;
                j12 = jH;
                j13 = jD;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        nVarA = nVar;
        if ((i10 & 24576) == 0) {
            jH = j10;
            if ((i11 & 16) == 0) {
                i22 = 8192;
            } else {
                i22 = 8192;
            }
            i12 |= i22;
        } else {
            jH = j10;
        }
        if ((196608 & i10) == 0) {
            jD = j11;
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i12 |= i21;
        } else {
            jD = j11;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f10)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        i19 = i12;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i19 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    nVarA = o4.f24030a.a();
                }
                if ((i11 & 16) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i20 = i19 & (-57345);
                } else {
                    i20 = i19;
                }
                if ((i11 & 32) != 0) {
                    jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                    i20 &= -458753;
                }
                if (i17 != 0) {
                    fD = f0.f22689a.d();
                } else {
                    fD = f10;
                }
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i15 != 0) {
                    nVarA = o4.f24030a.a();
                }
                if ((i11 & 16) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i20 = i19 & (-57345);
                } else {
                    i20 = i19;
                }
                if ((i11 & 32) != 0) {
                    jD = n4.d(jH, c0VarR, (i20 >> 12) & 14);
                    i20 &= -458753;
                }
                if (i17 != 0) {
                    fD = f0.f22689a.d();
                } else {
                    fD = f10;
                }
            }
            long j1110 = jH;
            long j1111 = jD;
            androidx.compose.ui.a0 a0Var12 = a0Var2;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function5;
            pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar11 = nVarA;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-350082398, i20, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
            }
            int i2110 = (i20 & 14) | 48;
            int i2111 = i20 << 3;
            c0Var2 = c0VarR;
            o(function4, f23835g, a0Var12, function15, nVar11, j1110, j1111, fD, c0Var2, i2110 | (i2111 & 896) | (i2111 & 7168) | (57344 & i2111) | (458752 & i2111) | (3670016 & i2111) | (i2111 & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var12;
            function6 = function15;
            nVar2 = nVar11;
            j12 = j1110;
            j13 = j1111;
            f11 = fD;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            f11 = f10;
            a0Var3 = a0Var2;
            function6 = function5;
            nVar2 = nVarA;
            j12 = jH;
            j13 = jD;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.u(function2, a0Var3, function6, nVar2, j12, j13, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.g5 g5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n(a0Var, j10, j11, f10, g5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function2 function2, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, Function2 function3, pj.n nVar, long j10, long j11, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(function2, v6Var, a0Var, function3, nVar, j10, j11, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.g5 g5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        p(v6Var, a0Var, j10, j11, f10, g5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function2 function2, androidx.compose.ui.a0 a0Var, Function2 function3, pj.n nVar, long j10, long j11, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        q(function2, a0Var, function3, nVar, j10, j11, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
