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
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,535:1\n1925#2:536\n1923#2:537\n1832#2,7:538\n1925#2:545\n1923#2:546\n1832#2,7:547\n75#3:554\n1282#4,6:555\n99#5:561\n96#5,9:562\n106#5:601\n79#6,6:571\n86#6,3:586\n89#6,2:595\n93#6:600\n347#7,9:577\n356#7,3:597\n4206#8,6:589\n85#9:602\n85#9:603\n113#10:604\n113#10:605\n113#10:606\n113#10:607\n113#10:608\n113#10:609\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n377#1:536\n377#1:537\n377#1:538,7\n382#1:545\n382#1:546\n382#1:547,7\n386#1:554\n389#1:555,6\n430#1:561\n430#1:562,9\n430#1:601\n430#1:571,6\n430#1:586,3\n430#1:595,2\n430#1:600\n430#1:577,9\n430#1:597,3\n430#1:589,6\n377#1:602\n382#1:603\n523#1:604\n524#1:605\n525#1:606\n526#1:607\n527#1:608\n528#1:609\n*E\n"})
public final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f26294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f26296c = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f26297d = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f26298e = androidx.compose.ui.unit.h.r(com.planner5d.library.engine.input.f.b.B);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f26299f = androidx.compose.ui.unit.h.r(280);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f26300g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f26301h = 0.8f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f26302i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f26303j = 0.0f;

    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,535:1\n87#2:536\n84#2,9:537\n94#2:576\n79#3,6:546\n86#3,3:561\n89#3,2:570\n93#3:575\n347#4,9:552\n356#4,3:572\n4206#5,6:564\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n*L\n407#1:536\n407#1:537,9\n407#1:576\n407#1:546,6\n407#1:561,3\n407#1:570,2\n407#1:575\n407#1:552,9\n407#1:572,3\n407#1:564,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f26304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.b5 f26305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f26306c;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.b5 b5Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f26304a = a0Var;
            this.f26305b = b5Var;
            this.f26306c = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1463404422, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:406)");
            }
            int i11 = 7 ^ 0;
            androidx.compose.ui.a0 a0VarM = androidx.compose.foundation.q4.m(androidx.compose.foundation.layout.c4.d(androidx.compose.foundation.layout.d5.t(this.f26304a, 0.0f, bk.m(), 1, null), androidx.compose.foundation.layout.e4.Max), this.f26305b, false, null, false, 14, null);
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f26306c;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarM);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
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

    static final class b implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f26307a;

        b(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f26307a = y0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(2839488);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2839488, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            androidx.compose.animation.core.y0<Float> y0Var = this.f26307a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    static final class c implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f26308a;

        c(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f26308a = y0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-745957716);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-745957716, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:376)");
            }
            androidx.compose.animation.core.y0<Float> y0Var = this.f26308a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xj f26310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x5 f26313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26314f;

        @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,535:1\n70#2:536\n67#2,9:537\n77#2:576\n79#3,6:546\n86#3,3:561\n89#3,2:570\n93#3:575\n347#4,9:552\n356#4,3:572\n4206#5,6:564\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$1\n*L\n455#1:536\n455#1:537,9\n455#1:576\n455#1:546,6\n455#1:561,3\n455#1:570,2\n455#1:575\n455#1:552,9\n455#1:572,3\n455#1:564,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26315a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f26315a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1241781204, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:454)");
                }
                androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.b(androidx.compose.ui.a0.E, d0.d1.f267807a.F(), 0.0f, 2, null);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26315a;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
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

        @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,535:1\n113#2:536\n113#2:537\n70#3:538\n67#3,9:539\n77#3:578\n79#4,6:548\n86#4,3:563\n89#4,2:572\n93#4:577\n347#5,9:554\n356#5,3:574\n4206#6,6:566\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n*L\n468#1:536\n474#1:537\n461#1:538\n461#1:539,9\n461#1:578\n461#1:548,6\n461#1:563,3\n461#1:572,2\n461#1:577\n461#1:554,9\n461#1:574,3\n461#1:566,6\n*E\n"})
        static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x5 f26316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26318c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26319d;

            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.foundation.layout.x5 x5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4) {
                this.f26316a = x5Var;
                this.f26317b = function2;
                this.f26318c = function3;
                this.f26319d = function4;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-893579015, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:460)");
                }
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.x5.q(this.f26316a, androidx.compose.ui.a0.E, 1.0f, false, 2, null), this.f26317b != null ? bk.f26296c : androidx.compose.ui.unit.h.r(0), 0.0f, this.f26318c != null ? bk.f26296c : androidx.compose.ui.unit.h.r(0), 0.0f, 10, null);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26319d;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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

        @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,535:1\n70#2:536\n67#2,9:537\n77#2:576\n79#3,6:546\n86#3,3:561\n89#3,2:570\n93#3:575\n347#4,9:552\n356#4,3:572\n4206#5,6:564\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$3\n*L\n485#1:536\n485#1:537,9\n485#1:576\n485#1:546,6\n485#1:561,3\n485#1:570,2\n485#1:575\n485#1:552,9\n485#1:572,3\n485#1:564,6\n*E\n"})
        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26320a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f26320a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-782441013, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:484)");
                }
                androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.b(androidx.compose.ui.a0.E, d0.d1.f267807a.Y(), 0.0f, 2, null);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26320a;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
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

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, xj xjVar, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.foundation.layout.x5 x5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4) {
            this.f26309a = function2;
            this.f26310b = xjVar;
            this.f26311c = z10;
            this.f26312d = function3;
            this.f26313e = x5Var;
            this.f26314f = function4;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(865999929, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:450)");
            }
            if (this.f26309a != null) {
                c0Var.E(-864613220);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(this.f26310b.i(this.f26311c))), androidx.compose.runtime.internal.w.e(1241781204, true, new a(this.f26309a), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
                c0Var.A();
            } else {
                c0Var.E(-864293207);
                c0Var.A();
            }
            androidx.compose.runtime.n4<androidx.compose.ui.graphics.q0> n4VarF = c7.a().f(androidx.compose.ui.graphics.q0.n(this.f26310b.j(this.f26311c)));
            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-893579015, true, new b(this.f26313e, this.f26309a, this.f26312d, this.f26314f), c0Var, 54);
            int i11 = androidx.compose.runtime.n4.f36267i;
            androidx.compose.runtime.a1.e(n4VarF, cVarE, c0Var, i11 | 48);
            if (this.f26312d != null) {
                c0Var.E(-863394951);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(this.f26310b.k(this.f26311c))), androidx.compose.runtime.internal.w.e(-782441013, true, new c(this.f26312d), c0Var, 54), c0Var, i11 | 48);
                c0Var.A();
            } else {
                c0Var.E(-863072055);
                c0Var.A();
            }
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
        float f10 = 48;
        f26294a = androidx.compose.ui.unit.h.r(f10);
        f26295b = androidx.compose.ui.unit.h.r(f10);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull final androidx.compose.animation.core.w1<Boolean> w1Var, @NotNull final androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> n3Var, @NotNull final androidx.compose.foundation.b5 b5Var, @NotNull final androidx.compose.ui.graphics.q3 q3Var, final long j10, final float f10, final float f11, @Nullable final androidx.compose.foundation.a1 a1Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        boolean z10;
        Object obj;
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(848986741);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(w1Var) : c0VarR.k0(w1Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(n3Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(b5Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(q3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.L(j10) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= c0VarR.I(f10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c0VarR.I(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c0VarR.D(a1Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= c0VarR.k0(nVar) ? 536870912 : 268435456;
        }
        if (c0VarR.h((i11 & 306783379) != 306783378, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(848986741, i11, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:369)");
            }
            androidx.compose.animation.core.l3 l3VarI = androidx.compose.animation.core.w3.I(w1Var, "DropDownMenu", c0VarR, androidx.compose.animation.core.w1.f13348e | 48 | ((i11 >> 3) & 14), 0);
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.FastSpatial, c0VarR, 6);
            androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            c cVar = new c(y0VarB);
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(zVar);
            boolean zBooleanValue = ((Boolean) l3VarI.p()).booleanValue();
            c0VarR.E(143964305);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) l3VarI.y()).booleanValue();
            c0VarR.E(143964305);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            final androidx.compose.runtime.n7 n7VarD = androidx.compose.animation.core.w3.D(l3VarI, fValueOf, Float.valueOf(f13), cVar.invoke(l3VarI.w(), c0VarR, 0), z3VarP, "FloatAnimation", c0VarR, 0);
            b bVar = new b(y0VarB2);
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = androidx.compose.animation.core.t4.P(zVar);
            boolean zBooleanValue3 = ((Boolean) l3VarI.p()).booleanValue();
            c0VarR.E(892761509);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf2 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) l3VarI.y()).booleanValue();
            c0VarR.E(892761509);
            if (androidx.compose.runtime.m0.l0()) {
                z10 = false;
                androidx.compose.runtime.m0.A0(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            } else {
                z10 = false;
            }
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            boolean z11 = z10;
            final androidx.compose.runtime.n7 n7VarD2 = androidx.compose.animation.core.w3.D(l3VarI, fValueOf2, Float.valueOf(f15), bVar.invoke(l3VarI.w(), c0VarR, 0), z3VarP2, "FloatAnimation", c0VarR, 0);
            final boolean zBooleanValue5 = ((Boolean) c0VarR.W(androidx.compose.ui.platform.s2.a())).booleanValue();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zG = c0VarR.G(zBooleanValue5) | c0VarR.D(n7VarD) | (((i11 & com.planner5d.library.engine.input.f.b.B) == 32 || ((i11 & 64) != 0 && c0VarR.k0(w1Var))) ? true : z11) | c0VarR.D(n7VarD2);
            if ((i11 & 896) == 256) {
                z11 = true;
            }
            boolean z12 = zG | z11;
            Object objI0 = c0VarR.i0();
            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                i12 = i11;
                obj = new Function1() { // from class: androidx.compose.material3.zj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return bk.g(zBooleanValue5, w1Var, n3Var, n7VarD, n7VarD2, (androidx.compose.ui.graphics.r1) obj2);
                    }
                };
                c0VarR.Y(obj);
            } else {
                obj = objI0;
                i12 = i11;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            u10.c(androidx.compose.ui.graphics.q1.a(aVar, (Function1) obj), q3Var, j10, 0L, f10, f11, a1Var, androidx.compose.runtime.internal.w.e(-1463404422, true, new a(a0Var, b5Var, nVar), c0VarR, 54), c0VarR, (i13 & 896) | (i13 & com.planner5d.library.engine.input.f.b.B) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ak
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return bk.h(a0Var, w1Var, n3Var, b5Var, q3Var, j10, f10, f11, a1Var, nVar, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final float e(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    private static final float f(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(boolean z10, androidx.compose.animation.core.w1 w1Var, androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.ui.graphics.r1 r1Var) {
        float fE;
        float fE2 = 0.8f;
        float f10 = 1.0f;
        if (z10) {
            fE = ((Boolean) w1Var.b()).booleanValue() ? 1.0f : 0.8f;
        } else {
            fE = e(n7Var);
        }
        r1Var.z(fE);
        if (!z10) {
            fE2 = e(n7Var);
        } else if (((Boolean) w1Var.b()).booleanValue()) {
            fE2 = 1.0f;
        }
        r1Var.C(fE2);
        if (!z10) {
            f10 = f(n7Var2);
        } else if (!((Boolean) w1Var.b()).booleanValue()) {
            f10 = 0.0f;
        }
        r1Var.setAlpha(f10);
        r1Var.W1(((androidx.compose.ui.graphics.z3) n3Var.getValue()).o());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.w1 w1Var, androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.b5 b5Var, androidx.compose.ui.graphics.q3 q3Var, long j10, float f10, float f11, androidx.compose.foundation.a1 a1Var, pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(a0Var, w1Var, n3Var, b5Var, q3Var, j10, f10, f11, a1Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function0<Unit> function0, @NotNull final androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final boolean z10, @NotNull final xj xjVar, @NotNull final androidx.compose.foundation.layout.g5 g5Var, @Nullable final androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i11;
        Function0<Unit> function1;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        xj xjVar2;
        androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1325192924);
        if ((i10 & 6) == 0) {
            function5 = function2;
            i11 = (c0VarR.k0(function5) ? 4 : 2) | i10;
        } else {
            function5 = function2;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            function1 = function0;
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            function6 = function3;
            i11 |= c0VarR.k0(function6) ? 2048 : 1024;
        } else {
            function6 = function3;
        }
        if ((i10 & 24576) == 0) {
            function7 = function4;
            i11 |= c0VarR.k0(function7) ? 16384 : 8192;
        } else {
            function7 = function4;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.G(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            xjVar2 = xjVar;
            i11 |= c0VarR.D(xjVar2) ? 1048576 : 524288;
        } else {
            xjVar2 = xjVar;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(g5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            jVar2 = jVar;
            i11 |= c0VarR.D(jVar2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        } else {
            jVar2 = jVar;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1325192924, i11, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:428)");
            }
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var, jVar2, gt.e(true, 0.0f, 0L, 6, null), z10, null, null, function1, 24, null), 0.0f, 1, null), f26298e, f26295b, f26299f, 0.0f, 8, null), g5Var);
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            xj xjVar3 = xjVar2;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function6;
            q50.o(pj.f31758a.e(c0VarR, 6).w(), androidx.compose.runtime.internal.w.e(865999929, true, new d(function8, xjVar3, z10, function7, androidx.compose.foundation.layout.y5.f16577a, function5), c0VarR, 54), c0VarR, 48);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.yj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return bk.j(function2, function0, a0Var, function3, function4, z10, xjVar, g5Var, jVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, Function0 function0, androidx.compose.ui.a0 a0Var, Function2 function3, Function2 function4, boolean z10, xj xjVar, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.foundation.interaction.j jVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        i(function2, function0, a0Var, function3, function4, z10, xjVar, g5Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static final long l(@NotNull androidx.compose.ui.unit.s sVar, @NotNull androidx.compose.ui.unit.s sVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (sVar2.t() >= sVar.x()) {
            fMax = 0.0f;
        } else if (sVar2.x() <= sVar.t()) {
            fMax = 1.0f;
        } else if (sVar2.G() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(sVar.t(), sVar2.t()) + Math.min(sVar.x(), sVar2.x())) / 2) - sVar2.t()) / sVar2.G();
        }
        if (sVar2.B() >= sVar.j()) {
            fMax2 = 0.0f;
        } else if (sVar2.j() > sVar.B()) {
            if (sVar2.r() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(sVar.B(), sVar2.B()) + Math.min(sVar.j(), sVar2.j())) / 2) - sVar2.B()) / sVar2.r();
            }
        }
        return androidx.compose.ui.graphics.a4.a(fMax, fMax2);
    }

    public static final float m() {
        return f26297d;
    }

    public static final float n() {
        return f26294a;
    }
}
