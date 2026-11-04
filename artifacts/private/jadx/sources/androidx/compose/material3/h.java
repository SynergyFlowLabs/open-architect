package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,513:1\n75#2:514\n1282#3,6:515\n79#4:521\n77#4,8:522\n86#4,3:539\n89#4,2:548\n93#4:553\n347#5,9:530\n356#5,3:550\n4206#6,6:542\n113#7:554\n113#7:555\n113#7:556\n113#7:557\n113#7:558\n113#7:559\n113#7:560\n113#7:561\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n145#1:514\n381#1:515,6\n381#1:521\n381#1:522,8\n381#1:539,3\n381#1:548,2\n381#1:553\n381#1:530,9\n381#1:550,3\n381#1:542,6\n468#1:554\n469#1:555\n471#1:556\n472#1:557\n475#1:558\n476#1:559\n477#1:560\n478#1:561\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f28047h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f28040a = androidx.compose.ui.unit.h.r(280);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f28041b = androidx.compose.ui.unit.h.r(560);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f28042c = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f28043d = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<m2> f28048i = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.q();
        }
    }, 1, null);

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,513:1\n87#2:514\n84#2,9:515\n94#2:595\n79#3,6:524\n86#3,3:539\n89#3,2:548\n79#3,6:561\n86#3,3:576\n89#3,2:585\n93#3:590\n93#3:594\n347#4,9:530\n356#4:550\n347#4,9:567\n356#4,3:587\n357#4,2:592\n4206#5,6:542\n4206#5,6:579\n70#6:551\n67#6,9:552\n77#6:591\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n316#1:514\n316#1:515,9\n316#1:595\n316#1:524,6\n316#1:539,3\n316#1:548,2\n359#1:561,6\n359#1:576,3\n359#1:585,2\n359#1:590\n316#1:594\n316#1:530,9\n316#1:550\n359#1:567,9\n359#1:587,3\n316#1:592,2\n316#1:542,6\n359#1:579,6\n359#1:551\n359#1:552,9\n359#1:591\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f28052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f28053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f28054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f28055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28056h;

        /* JADX INFO: renamed from: androidx.compose.material3.h$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,513:1\n70#2:514\n67#2,9:515\n77#2:554\n79#3,6:524\n86#3,3:539\n89#3,2:548\n93#3:553\n347#4,9:530\n356#4,3:550\n4206#5,6:542\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$1$1\n*L\n319#1:514\n319#1:515,9\n319#1:554\n319#1:524,6\n319#1:539,3\n319#1:548,2\n319#1:553\n319#1:530,9\n319#1:550,3\n319#1:542,6\n*E\n"})
        static final class C0219a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.m0 f28057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28058b;

            /* JADX WARN: Multi-variable type inference failed */
            C0219a(androidx.compose.foundation.layout.m0 m0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f28057a = m0Var;
                this.f28058b = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1128150638, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:318)");
                }
                androidx.compose.foundation.layout.m0 m0Var = this.f28057a;
                androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, h.f28045f);
                androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarP2 = m0Var.p(a0VarP, aVar.m());
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28058b;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP2);
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
                function2.invoke(c0Var, 0);
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

        @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,513:1\n70#2:514\n67#2,9:515\n77#2:554\n79#3,6:524\n86#3,3:539\n89#3,2:548\n93#3:553\n347#4,9:530\n356#4,3:550\n4206#5,6:542\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$2$1\n*L\n329#1:514\n329#1:515,9\n329#1:554\n329#1:524,6\n329#1:539,3\n329#1:548,2\n329#1:553\n329#1:530,9\n329#1:550,3\n329#1:542,6\n*E\n"})
        static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.m0 f28059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28061c;

            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.foundation.layout.m0 m0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
                this.f28059a = m0Var;
                this.f28060b = function2;
                this.f28061c = function3;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(71284337, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:328)");
                }
                androidx.compose.ui.a0 a0VarP = this.f28059a.p(androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, h.f28046g), this.f28060b == null ? androidx.compose.ui.e.f37317a.u() : androidx.compose.ui.e.f37317a.m());
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28061c;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0Var, 0);
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

        @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,513:1\n70#2:514\n67#2,9:515\n77#2:554\n79#3,6:524\n86#3,3:539\n89#3,2:548\n93#3:553\n347#4,9:530\n356#4,3:550\n4206#5,6:542\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$3$1\n*L\n350#1:514\n350#1:515,9\n350#1:554\n350#1:524,6\n350#1:539,3\n350#1:548,2\n350#1:553\n350#1:530,9\n350#1:550,3\n350#1:542,6\n*E\n"})
        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.m0 f28062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28063b;

            /* JADX WARN: Multi-variable type inference failed */
            c(androidx.compose.foundation.layout.m0 m0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f28062a = m0Var;
                this.f28063b = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(705583346, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:349)");
                }
                androidx.compose.foundation.layout.m0 m0Var = this.f28062a;
                androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(m0Var.h(androidx.compose.ui.a0.E, 1.0f, false), h.f28047h);
                androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.a0 a0VarP2 = m0Var.p(a0VarP, aVar.u());
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28063b;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP2);
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
                function2.invoke(c0Var, 0);
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
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, long j10, long j11, long j12, long j13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5) {
            this.f28049a = function2;
            this.f28050b = function3;
            this.f28051c = function4;
            this.f28052d = j10;
            this.f28053e = j11;
            this.f28054f = j12;
            this.f28055g = j13;
            this.f28056h = function5;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-652798794, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:315)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(aVar, h.f28044e);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28049a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f28050b;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f28051c;
            long j10 = this.f28052d;
            long j11 = this.f28053e;
            long j12 = this.f28054f;
            long j13 = this.f28055g;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function5 = this.f28056h;
            androidx.compose.foundation.layout.q.m mVarY = androidx.compose.foundation.layout.q.f16330a.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (function2 == null) {
                c0Var.E(346092326);
            } else {
                c0Var.E(346092327);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j10)), androidx.compose.runtime.internal.w.e(-1128150638, true, new C0219a(n0Var, function2), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
            }
            c0Var.A();
            if (function3 == null) {
                c0Var.E(346396529);
                c0Var.A();
            } else {
                c0Var.E(346396530);
                androidx.compose.material3.internal.k3.b(j11, la0.e(d0.y.f269322a.j(), c0Var, 6), androidx.compose.runtime.internal.w.e(71284337, true, new b(n0Var, function2, function3), c0Var, 54), c0Var, androidx.media3.exoplayer.a5.S0);
                c0Var.A();
            }
            if (function4 == null) {
                c0Var.E(347174009);
            } else {
                c0Var.E(347174010);
                androidx.compose.material3.internal.k3.b(j12, la0.e(d0.y.f269322a.n(), c0Var, 6), androidx.compose.runtime.internal.w.e(705583346, true, new c(n0Var, function4), c0Var, 54), c0Var, androidx.media3.exoplayer.a5.S0);
            }
            c0Var.A();
            androidx.compose.ui.a0 a0VarP2 = n0Var.p(aVar, aVar2.s());
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarP2);
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
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.material3.internal.k3.b(j13, la0.e(d0.y.f269322a.d(), c0Var, 6), function5, c0Var, 0);
            c0Var.o();
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

    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,513:1\n34#2,6:514\n70#2,4:520\n70#2,6:524\n75#2:530\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n*L\n417#1:514,6\n444#1:520,4\n460#1:524,6\n444#1:530\n*E\n"})
    static final class b implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28065b;

        b(float f10, float f11) {
            this.f28064a = f10;
            this.f28065b = f11;
        }

        private static final boolean g(List<androidx.compose.ui.layout.i2> list, kotlin.jvm.internal.i1.f fVar, androidx.compose.ui.layout.c1 c1Var, float f10, long j10, androidx.compose.ui.layout.i2 i2Var) {
            if (!list.isEmpty() && fVar.f312749a + c1Var.g6(f10) + i2Var.h1() > androidx.compose.ui.unit.b.p(j10)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(List list, androidx.compose.ui.layout.c1 c1Var, float f10, int i10, List list2, androidx.compose.ui.layout.i2.a aVar) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                List list3 = (List) list.get(i11);
                int size2 = list3.size();
                int[] iArr = new int[size2];
                int i12 = 0;
                while (i12 < size2) {
                    iArr[i12] = ((androidx.compose.ui.layout.i2) list3.get(i12)).h1() + (i12 < CollectionsKt.getLastIndex(list3) ? c1Var.g6(f10) : 0);
                    i12++;
                }
                int[] iArr2 = new int[size2];
                androidx.compose.foundation.layout.q.f16330a.o().c(c1Var, i10, iArr, c1Var.getLayoutDirection(), iArr2);
                int size3 = list3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    androidx.compose.ui.layout.i2.a.P(aVar, (androidx.compose.ui.layout.i2) list3.get(i13), iArr2[i13], ((Number) list2.get(i11)).intValue(), 0.0f, 4, null);
                }
            }
            return Unit.f312394a;
        }

        private static final void i(List<List<androidx.compose.ui.layout.i2>> list, kotlin.jvm.internal.i1.f fVar, androidx.compose.ui.layout.c1 c1Var, float f10, List<androidx.compose.ui.layout.i2> list2, List<Integer> list3, kotlin.jvm.internal.i1.f fVar2, List<Integer> list4, kotlin.jvm.internal.i1.f fVar3, kotlin.jvm.internal.i1.f fVar4) {
            if (!list.isEmpty()) {
                fVar.f312749a += c1Var.g6(f10);
            }
            list.add(0, CollectionsKt.toList(list2));
            list3.add(Integer.valueOf(fVar2.f312749a));
            list4.add(Integer.valueOf(fVar.f312749a));
            fVar.f312749a += fVar2.f312749a;
            fVar3.f312749a = Math.max(fVar3.f312749a, fVar4.f312749a);
            list2.clear();
            fVar4.f312749a = 0;
            fVar2.f312749a = 0;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
            kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
            ArrayList arrayList4 = new ArrayList();
            kotlin.jvm.internal.i1.f fVar3 = new kotlin.jvm.internal.i1.f();
            kotlin.jvm.internal.i1.f fVar4 = new kotlin.jvm.internal.i1.f();
            float f10 = this.f28064a;
            ArrayList arrayList5 = arrayList3;
            float f11 = this.f28065b;
            int size = list2.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList6 = arrayList;
                androidx.compose.ui.layout.i2 i2VarP0 = list2.get(i10).P0(j10);
                int i11 = i10;
                if (!g(arrayList4, fVar3, c1Var, f10, j10, i2VarP0)) {
                    kotlin.jvm.internal.i1.f fVar5 = fVar4;
                    ArrayList arrayList7 = arrayList2;
                    ArrayList arrayList8 = arrayList4;
                    kotlin.jvm.internal.i1.f fVar6 = fVar;
                    ArrayList arrayList9 = arrayList5;
                    i(arrayList6, fVar2, c1Var, f11, arrayList8, arrayList7, fVar5, arrayList9, fVar6, fVar3);
                    arrayList4 = arrayList8;
                    arrayList2 = arrayList7;
                    fVar4 = fVar5;
                    arrayList5 = arrayList9;
                    fVar = fVar6;
                    arrayList6 = arrayList6;
                }
                kotlin.jvm.internal.i1.f fVar7 = fVar2;
                if (!arrayList4.isEmpty()) {
                    fVar3.f312749a += c1Var.g6(f10);
                }
                arrayList4.add(i2VarP0);
                fVar3.f312749a += i2VarP0.h1();
                fVar4.f312749a = Math.max(fVar4.f312749a, i2VarP0.c1());
                i10 = i11 + 1;
                list2 = list;
                fVar2 = fVar7;
                size = size;
                arrayList = arrayList6;
            }
            final ArrayList arrayList10 = arrayList;
            kotlin.jvm.internal.i1.f fVar8 = fVar2;
            if (!arrayList4.isEmpty()) {
                i(arrayList10, fVar8, c1Var, this.f28065b, arrayList4, arrayList2, fVar4, arrayList5, fVar, fVar3);
            }
            final int iMax = Math.max(fVar.f312749a, androidx.compose.ui.unit.b.r(j10));
            int iMax2 = Math.max(fVar8.f312749a, androidx.compose.ui.unit.b.q(j10));
            final float f12 = this.f28064a;
            final ArrayList arrayList11 = arrayList5;
            return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iMax2, null, new Function1() { // from class: androidx.compose.material3.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.b.h(arrayList10, c1Var, f12, iMax, arrayList11, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f28069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f28070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f28071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f28072g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f28073h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f28074i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28075j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28076k;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28078b;

            /* JADX INFO: renamed from: androidx.compose.material3.h$c$a$a, reason: collision with other inner class name */
            static final class C0220a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28079a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28080b;

                /* JADX WARN: Multi-variable type inference failed */
                C0220a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
                    this.f28079a = function2;
                    this.f28080b = function3;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-459506658, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:272)");
                    }
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28079a;
                    if (function2 == null) {
                        c0Var.E(-1102039173);
                    } else {
                        c0Var.E(795734342);
                        function2.invoke(c0Var, 0);
                    }
                    c0Var.A();
                    this.f28080b.invoke(c0Var, 0);
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
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
                this.f28077a = function2;
                this.f28078b = function3;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1367541877, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:268)");
                }
                h.k(h.f28042c, h.f28043d, androidx.compose.runtime.internal.w.e(-459506658, true, new C0220a(this.f28077a, this.f28078b), c0Var, 54), c0Var, 438);
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
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, long j11, long j12, long j13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6) {
            this.f28066a = function2;
            this.f28067b = function3;
            this.f28068c = function4;
            this.f28069d = q3Var;
            this.f28070e = j10;
            this.f28071f = f10;
            this.f28072g = j11;
            this.f28073h = j12;
            this.f28074i = j13;
            this.f28075j = function5;
            this.f28076k = function6;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(527420759, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:266)");
            }
            h.i(androidx.compose.runtime.internal.w.e(1367541877, true, new a(this.f28075j, this.f28076k), c0Var, 54), null, this.f28066a, this.f28067b, this.f28068c, this.f28069d, this.f28070e, this.f28071f, o6.r(d0.y.f269322a.c(), c0Var, 6), this.f28072g, this.f28073h, this.f28074i, c0Var, 6, 0, 2);
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

    static {
        float f10 = 24;
        f28044e = androidx.compose.foundation.layout.d5.f(androidx.compose.ui.unit.h.r(f10));
        float f11 = 16;
        int i10 = 6 & 0;
        f28045f = androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f11), 7, null);
        int i11 = 4 ^ 0;
        f28046g = androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f11), 7, null);
        f28047h = androidx.compose.foundation.layout.d5.j(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use BasicAlertDialog instead", replaceWith = @kotlin.b1(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    @af
    public static final void g(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.window.k kVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        int i14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        int i15;
        boolean z10;
        final androidx.compose.ui.window.k kVar2;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.window.k kVar3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(402506956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 6) == 0) {
            function1 = function0;
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(kVar)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.k0(function3)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i12 |= i15;
                    }
                }
                if ((i12 & 1171) != 1170) {
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
                    if (i13 != 0) {
                        kVar3 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    } else {
                        kVar3 = kVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(402506956, i12, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:215)");
                    }
                    o(function1, a0Var4, kVar3, function3, c0VarR, i12 & 8190, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    kVar2 = kVar3;
                } else {
                    c0VarR.u();
                    kVar2 = kVar;
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.h(function0, a0Var3, kVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(function3)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
            }
            if ((i12 & 1171) != 1170) {
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
                if (i13 != 0) {
                    kVar3 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    kVar3 = kVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(402506956, i12, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:215)");
                }
                o(function1, a0Var4, kVar3, function3, c0VarR, i12 & 8190, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                kVar2 = kVar3;
            } else {
                c0VarR.u();
                kVar2 = kVar;
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.h(function0, a0Var3, kVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(kVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(function3)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
            }
            if ((i12 & 1171) != 1170) {
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
                if (i13 != 0) {
                    kVar3 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    kVar3 = kVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(402506956, i12, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:215)");
                }
                o(function1, a0Var4, kVar3, function3, c0VarR, i12 & 8190, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                kVar2 = kVar3;
            } else {
                c0VarR.u();
                kVar2 = kVar;
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.h(function0, a0Var3, kVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
        }
        if ((i12 & 1171) != 1170) {
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
            if (i13 != 0) {
                kVar3 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
            } else {
                kVar3 = kVar;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(402506956, i12, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:215)");
            }
            o(function1, a0Var4, kVar3, function3, c0VarR, i12 & 8190, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            kVar2 = kVar3;
        } else {
            c0VarR.u();
            kVar2 = kVar;
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.h(function0, a0Var3, kVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.window.k kVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(function0, a0Var, kVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x0159  */
    /* JADX WARN: Code duplicated, block: B:125:0x015d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x0168  */
    /* JADX WARN: Code duplicated, block: B:132:0x0177  */
    /* JADX WARN: Code duplicated, block: B:136:0x0180  */
    /* JADX WARN: Code duplicated, block: B:139:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x018c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0190  */
    /* JADX WARN: Code duplicated, block: B:144:0x0197  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @NotNull final androidx.compose.ui.graphics.q3 q3Var, final long j10, final float f10, final long j11, final long j12, final long j13, final long j14, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        int i14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        int i16;
        int i17;
        long j15;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1378716401);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i25 = i12 & 2;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= androidx.media3.exoplayer.a5.S0;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function6)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
            }
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    function7 = function4;
                    if (c0VarR.k0(function7)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        function8 = function5;
                        if (c0VarR.k0(function8)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    if ((i12 & 32) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.D(q3Var)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i13 |= i17;
                        }
                        if ((i12 & 64) != 0) {
                            i13 |= 1572864;
                            j15 = j10;
                        } else {
                            j15 = j10;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.L(j15)) {
                                    i18 = 1048576;
                                } else {
                                    i18 = 524288;
                                }
                                i13 |= i18;
                            }
                        }
                        if ((i12 & 128) != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.I(f10)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i13 |= i19;
                            }
                            if ((i12 & 256) != 0) {
                                i13 |= 100663296;
                            } else if ((i10 & 100663296) == 0) {
                                if (c0VarR.L(j11)) {
                                    i20 = 67108864;
                                } else {
                                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i20;
                            }
                            if ((i12 & 512) != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.L(j12)) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i13 |= i21;
                            }
                            if ((i12 & 1024) != 0) {
                                i22 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.L(j13)) {
                                    i23 = 4;
                                } else {
                                    i23 = 2;
                                }
                                i22 = i11 | i23;
                            } else {
                                i22 = i11;
                            }
                            if ((i12 & 2048) != 0) {
                                if ((i11 & 48) == 0) {
                                    if (c0VarR.L(j14)) {
                                        i24 = 32;
                                    } else {
                                        i24 = 16;
                                    }
                                    i22 |= i24;
                                }
                                if ((i13 & 306783379) == 306783378 || (i22 & 19) != 18) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (c0VarR.h(z10, i13 & 1)) {
                                    if (i25 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                    }
                                    int i26 = i13 >> 12;
                                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | ((i13 >> 9) & 57344), 104);
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    a0Var3 = a0Var4;
                                } else {
                                    c0VarR.u();
                                    a0Var3 = a0Var2;
                                }
                                s5VarT = c0VarR.T();
                                if (s5VarT != null) {
                                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i22 |= 48;
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i27 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 12582912;
                        if ((i12 & 256) != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.L(j11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.L(j12)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 1024) != 0) {
                            i22 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.L(j13)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i11 | i23;
                        } else {
                            i22 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.L(j14)) {
                                    i24 = 32;
                                } else {
                                    i24 = 16;
                                }
                                i22 |= i24;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i28 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i22 |= 48;
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i29 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                        j15 = j10;
                    } else {
                        j15 = j10;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.L(j15)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f10)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 256) != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.L(j11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.L(j12)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 1024) != 0) {
                            i22 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.L(j13)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i11 | i23;
                        } else {
                            i22 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.L(j14)) {
                                    i24 = 32;
                                } else {
                                    i24 = 16;
                                }
                                i22 |= i24;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i210 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i22 |= 48;
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i211 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i212 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i213 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                function8 = function5;
                if ((i12 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(q3Var)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                        j15 = j10;
                    } else {
                        j15 = j10;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.L(j15)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f10)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 256) != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.L(j11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.L(j12)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 1024) != 0) {
                            i22 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.L(j13)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i11 | i23;
                        } else {
                            i22 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.L(j14)) {
                                    i24 = 32;
                                } else {
                                    i24 = 16;
                                }
                                i22 |= i24;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i214 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i22 |= 48;
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i215 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i216 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i217 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i218 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i219 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2110 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2111 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function7 = function4;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function8 = function5;
                    if (c0VarR.k0(function8)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(q3Var)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                        j15 = j10;
                    } else {
                        j15 = j10;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.L(j15)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f10)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 256) != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.L(j11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.L(j12)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 1024) != 0) {
                            i22 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.L(j13)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i11 | i23;
                        } else {
                            i22 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.L(j14)) {
                                    i24 = 32;
                                } else {
                                    i24 = 16;
                                }
                                i22 |= i24;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i2112 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2112 & com.planner5d.library.engine.input.f.b.B) | (i2112 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i22 |= 48;
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i2113 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2113 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i2114 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2114 & com.planner5d.library.engine.input.f.b.B) | (i2114 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2115 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i2116 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2116 & com.planner5d.library.engine.input.f.b.B) | (i2116 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2117 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2118 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2118 & com.planner5d.library.engine.input.f.b.B) | (i2118 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2119 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2119 & com.planner5d.library.engine.input.f.b.B) | (i2119 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            function8 = function5;
            if ((i12 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i21110 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21110 & com.planner5d.library.engine.input.f.b.B) | (i21110 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i21111 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i21112 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21112 & com.planner5d.library.engine.input.f.b.B) | (i21112 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21113 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
                j15 = j10;
            } else {
                j15 = j10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.L(j15)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i21114 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21114 & com.planner5d.library.engine.input.f.b.B) | (i21114 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21115 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21115 & com.planner5d.library.engine.input.f.b.B) | (i21115 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.L(j11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.L(j12)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.L(j13)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.L(j14)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21116 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21116 & com.planner5d.library.engine.input.f.b.B) | (i21116 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 48;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i21117 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21117 & com.planner5d.library.engine.input.f.b.B) | (i21117 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i12 & 4) != 0) {
            i13 |= androidx.media3.exoplayer.a5.S0;
            function6 = function3;
        } else {
            function6 = function3;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function6)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
        }
        if ((i12 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                function7 = function4;
                if (c0VarR.k0(function7)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    function8 = function5;
                    if (c0VarR.k0(function8)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(q3Var)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                        j15 = j10;
                    } else {
                        j15 = j10;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.L(j15)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f10)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 256) != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.L(j11)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.L(j12)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 1024) != 0) {
                            i22 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.L(j13)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i11 | i23;
                        } else {
                            i22 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.L(j14)) {
                                    i24 = 32;
                                } else {
                                    i24 = 16;
                                }
                                i22 |= i24;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                if (i25 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                }
                                int i21118 = i13 >> 12;
                                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21118 & com.planner5d.library.engine.input.f.b.B) | (i21118 & 896) | ((i13 >> 9) & 57344), 104);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i22 |= 48;
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i21119 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21119 & com.planner5d.library.engine.input.f.b.B) | (i21119 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i211110 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211110 & com.planner5d.library.engine.input.f.b.B) | (i211110 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i211111 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211111 & com.planner5d.library.engine.input.f.b.B) | (i211111 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i211112 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211112 & com.planner5d.library.engine.input.f.b.B) | (i211112 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i211113 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211113 & com.planner5d.library.engine.input.f.b.B) | (i211113 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i211114 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211114 & com.planner5d.library.engine.input.f.b.B) | (i211114 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i211115 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211115 & com.planner5d.library.engine.input.f.b.B) | (i211115 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            function8 = function5;
            if ((i12 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i211116 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211116 & com.planner5d.library.engine.input.f.b.B) | (i211116 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i211117 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211117 & com.planner5d.library.engine.input.f.b.B) | (i211117 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i211118 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211118 & com.planner5d.library.engine.input.f.b.B) | (i211118 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i211119 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i211119 & com.planner5d.library.engine.input.f.b.B) | (i211119 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
                j15 = j10;
            } else {
                j15 = j10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.L(j15)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2111110 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111110 & com.planner5d.library.engine.input.f.b.B) | (i2111110 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2111111 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.L(j11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.L(j12)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.L(j13)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.L(j14)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2111112 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111112 & com.planner5d.library.engine.input.f.b.B) | (i2111112 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 48;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i2111113 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111113 & com.planner5d.library.engine.input.f.b.B) | (i2111113 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        function7 = function4;
        if ((i12 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                function8 = function5;
                if (c0VarR.k0(function8)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(q3Var)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                    j15 = j10;
                } else {
                    j15 = j10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.L(j15)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f10)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 256) != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.L(j11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.L(j12)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.L(j13)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.L(j14)) {
                                i24 = 32;
                            } else {
                                i24 = 16;
                            }
                            i22 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            if (i25 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                            }
                            int i2111114 = i13 >> 12;
                            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111114 & com.planner5d.library.engine.input.f.b.B) | (i2111114 & 896) | ((i13 >> 9) & 57344), 104);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i22 |= 48;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2111115 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111115 & com.planner5d.library.engine.input.f.b.B) | (i2111115 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2111116 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111116 & com.planner5d.library.engine.input.f.b.B) | (i2111116 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2111117 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111117 & com.planner5d.library.engine.input.f.b.B) | (i2111117 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
                j15 = j10;
            } else {
                j15 = j10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.L(j15)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i2111118 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111118 & com.planner5d.library.engine.input.f.b.B) | (i2111118 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i2111119 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i2111119 & com.planner5d.library.engine.input.f.b.B) | (i2111119 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.L(j11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.L(j12)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.L(j13)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.L(j14)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21111110 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111110 & com.planner5d.library.engine.input.f.b.B) | (i21111110 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 48;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i21111111 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111111 & com.planner5d.library.engine.input.f.b.B) | (i21111111 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        function8 = function5;
        if ((i12 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(q3Var)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
                j15 = j10;
            } else {
                j15 = j10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.L(j15)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.L(j11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.L(j12)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.L(j13)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.L(j14)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        if (i25 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                        }
                        int i21111112 = i13 >> 12;
                        u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111112 & com.planner5d.library.engine.input.f.b.B) | (i21111112 & 896) | ((i13 >> 9) & 57344), 104);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 48;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21111113 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111113 & com.planner5d.library.engine.input.f.b.B) | (i21111113 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.L(j11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.L(j12)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.L(j13)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.L(j14)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21111114 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111114 & com.planner5d.library.engine.input.f.b.B) | (i21111114 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 48;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i21111115 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111115 & com.planner5d.library.engine.input.f.b.B) | (i21111115 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
            j15 = j10;
        } else {
            j15 = j10;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.L(j15)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
        }
        if ((i12 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.L(j11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.L(j12)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.L(j13)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.L(j14)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i25 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                    }
                    int i21111116 = i13 >> 12;
                    u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111116 & com.planner5d.library.engine.input.f.b.B) | (i21111116 & 896) | ((i13 >> 9) & 57344), 104);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 48;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i21111117 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111117 & com.planner5d.library.engine.input.f.b.B) | (i21111117 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 12582912;
        if ((i12 & 256) != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.L(j11)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i20;
        }
        if ((i12 & 512) != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.L(j12)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i13 |= i21;
        }
        if ((i12 & 1024) != 0) {
            i22 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.L(j13)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i11 | i23;
        } else {
            i22 = i11;
        }
        if ((i12 & 2048) != 0) {
            if ((i11 & 48) == 0) {
                if (c0VarR.L(j14)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
                i22 |= i24;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i25 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                }
                int i21111118 = i13 >> 12;
                u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111118 & com.planner5d.library.engine.input.f.b.B) | (i21111118 & 896) | ((i13 >> 9) & 57344), 104);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i22 |= 48;
        if ((i13 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            if (i25 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1378716401, i13, i22, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
            }
            int i21111119 = i13 >> 12;
            u10.c(a0Var4, q3Var, j15, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.w.e(-652798794, true, new a(function6, function7, function8, j12, j13, j14, j11, function2), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 12582912 | (i21111119 & com.planner5d.library.engine.input.f.b.B) | (i21111119 & 896) | ((i13 >> 9) & 57344), 104);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.j(function2, a0Var3, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, androidx.compose.ui.a0 a0Var, Function2 function3, Function2 function4, Function2 function5, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, long j11, long j12, long j13, long j14, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        i(function2, a0Var, function3, function4, function5, q3Var, j10, f10, j11, j12, j13, j14, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(final float f10, final float f11, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-917637668);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.I(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.I(f11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-917637668, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:379)");
            }
            boolean z10 = ((i11 & 14) == 4) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new b(f10, f11);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int i12 = (i11 >> 6) & 14;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            int i13 = ((i12 << 6) & 896) | 6;
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            function2.invoke(c0VarR, Integer.valueOf((i13 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.l(f10, f11, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(float f10, float f11, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(f10, f11, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void m(@NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @NotNull final androidx.compose.ui.graphics.q3 q3Var, final long j10, final long j11, final long j12, final long j13, final float f10, @NotNull final androidx.compose.ui.window.k kVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        int i13;
        float f11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-867616355);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            function7 = function2;
            i12 |= c0VarR.k0(function7) ? 32 : 16;
        } else {
            function7 = function2;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            function8 = function3;
            i12 |= c0VarR.k0(function8) ? 2048 : 1024;
        } else {
            function8 = function3;
        }
        if ((i10 & 24576) == 0) {
            function9 = function4;
            i12 |= c0VarR.k0(function9) ? 16384 : 8192;
        } else {
            function9 = function4;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i12 |= c0VarR.k0(function5) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0VarR.k0(function6) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.D(q3Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.L(j10) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0VarR.L(j11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.L(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.L(j13) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            f11 = f10;
            i13 |= c0VarR.I(f11) ? 256 : 128;
        } else {
            f11 = f10;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.D(kVar) ? 2048 : 1024;
        }
        int i14 = i13;
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-867616355, i12, i14, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:260)");
            }
            o(function0, a0Var, kVar, androidx.compose.runtime.internal.w.e(527420759, true, new c(function9, function5, function6, q3Var, j10, f11, j11, j12, j13, function8, function7), c0VarR, 54), c0VarR, (i12 & 14) | 3072 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i14 >> 3) & 896), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.n(function0, function2, a0Var, function3, function4, function5, function6, q3Var, j10, j11, j12, j13, f10, kVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0, Function2 function2, androidx.compose.ui.a0 a0Var, Function2 function3, Function2 function4, Function2 function5, Function2 function6, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.k kVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m(function0, function2, a0Var, function3, function4, function5, function6, q3Var, j10, j11, j12, j13, f10, kVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @af
    public static final void o(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.window.k kVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.ui.window.k kVar2;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.window.k kVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(24925658);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    kVar2 = kVar;
                    if (c0VarR.D(kVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        kVar2 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(24925658, i12, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
                    }
                    ((m2) c0VarR.W(f28048i)).a(new n2(function0, a0Var3, kVar2, function2), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                kVar3 = kVar2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return h.p(function0, a0Var4, kVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            kVar2 = kVar;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    kVar2 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(24925658, i12, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
                }
                ((m2) c0VarR.W(f28048i)).a(new n2(function0, a0Var3, kVar2, function2), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            kVar3 = kVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.p(function0, a0Var5, kVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                kVar2 = kVar;
                if (c0VarR.D(kVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    kVar2 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(24925658, i12, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
                }
                ((m2) c0VarR.W(f28048i)).a(new n2(function0, a0Var3, kVar2, function2), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            kVar3 = kVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.p(function0, a0Var6, kVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        kVar2 = kVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(function2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                kVar2 = new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(24925658, i12, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
            }
            ((m2) c0VarR.W(f28048i)).a(new n2(function0, a0Var3, kVar2, function2), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        kVar3 = kVar2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.p(function0, a0Var7, kVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.window.k kVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(function0, a0Var, kVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 q() {
        return qb.f32217a;
    }

    public static final float x() {
        return f28041b;
    }

    public static final float y() {
        return f28040a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<m2> z() {
        return f28048i;
    }
}
