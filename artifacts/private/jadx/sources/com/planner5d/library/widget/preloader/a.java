package com.planner5d.library.widget.preloader;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
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

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f258516a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f258517b = androidx.compose.runtime.internal.w.c(1904598380, false, C1746a.f258519a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f258518c = androidx.compose.runtime.internal.w.c(-1803156342, false, b.f258520a);

    /* JADX INFO: renamed from: com.planner5d.library.widget.preloader.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nPreloaderBoxV3View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/ComposableSingletons$PreloaderBoxV3ViewKt$lambda-1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n87#2:94\n84#2,9:95\n94#2:136\n80#3,6:104\n87#3,3:119\n90#3,2:128\n94#3:135\n391#4,9:110\n400#4:130\n401#4,2:133\n4360#5,6:122\n113#6:131\n113#6:132\n*S KotlinDebug\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/ComposableSingletons$PreloaderBoxV3ViewKt$lambda-1$1\n*L\n74#1:94\n74#1:95,9\n74#1:136\n74#1:104,6\n74#1:119,3\n74#1:128,2\n74#1:135\n74#1:110,9\n74#1:130\n74#1:133,2\n74#1:122,6\n75#1:131\n76#1:132\n*E\n"})
    static final class C1746a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1746a f258519a = new C1746a();

        C1746a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1904598380, i10, -1, "com.planner5d.library.widget.preloader.ComposableSingletons$PreloaderBoxV3ViewKt.lambda-1.<anonymous> (PreloaderBoxV3View.kt:73)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.a.a(aVar, 0.5f);
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(com.planner5d.library.engine.input.f.b.B)), c0Var, 6);
            q.d("Downloading files...", d5.t(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), null, c0Var, 54, 4);
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

    @SourceDebugExtension({"SMAP\nPreloaderBoxV3View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/ComposableSingletons$PreloaderBoxV3ViewKt$lambda-2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n87#2:94\n84#2,9:95\n94#2:136\n80#3,6:104\n87#3,3:119\n90#3,2:128\n94#3:135\n391#4,9:110\n400#4:130\n401#4,2:133\n4360#5,6:122\n113#6:131\n113#6:132\n*S KotlinDebug\n*F\n+ 1 PreloaderBoxV3View.kt\ncom/planner5d/library/widget/preloader/ComposableSingletons$PreloaderBoxV3ViewKt$lambda-2$1\n*L\n85#1:94\n85#1:95,9\n85#1:136\n85#1:104,6\n85#1:119,3\n85#1:128,2\n85#1:135\n85#1:110,9\n85#1:130\n85#1:133,2\n85#1:122,6\n86#1:131\n88#1:132\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f258520a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1803156342, i10, -1, "com.planner5d.library.widget.preloader.ComposableSingletons$PreloaderBoxV3ViewKt.lambda-2.<anonymous> (PreloaderBoxV3View.kt:84)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.a.a(aVar, 0.5f);
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(com.planner5d.library.engine.input.f.b.B)), c0Var, 6);
            q.d("1/15 files completed", d5.t(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(20), 0.0f, 2, null), "Downloading files", c0Var, 438, 0);
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
        return f258517b;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> b() {
        return f258518c;
    }
}
