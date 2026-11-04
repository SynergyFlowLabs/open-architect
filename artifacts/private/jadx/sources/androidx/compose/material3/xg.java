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
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,815:1\n1282#2,6:816\n1282#2,6:822\n113#3:828\n113#3:829\n113#3:830\n113#3:831\n113#3:832\n113#3:833\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n148#1:816,6\n151#1:822,6\n775#1:828\n783#1:829\n786#1:830\n788#1:831\n790#1:832\n792#1:833\n*E\n"})
public final class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f34480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f34481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f34482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f34483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f34484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final d0.f3 f34485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f34486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f34487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f34488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f34489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f34490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final d0.f3 f34491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f34492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f34493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f34494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f34495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f34496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final d0.f3 f34497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f34498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f34499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f34500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f34501v;

    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n99#2,6:816\n106#2:852\n79#3,6:822\n86#3,3:837\n89#3,2:846\n93#3:851\n347#4,9:828\n356#4,3:848\n4206#5,6:840\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$1\n*L\n331#1:816,6\n331#1:852\n331#1:822,6\n331#1:837,3\n331#1:846,2\n331#1:851\n331#1:828,9\n331#1:848,3\n331#1:840,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f34502a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f34502a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1233936436, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:330)");
            }
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.layout.i6.A(androidx.compose.ui.a0.E, xg.f34501v, 0.0f, 0.0f, 0.0f, 14, null), xg.f34500u, 0.0f, 2, null);
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f34502a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarM, cVarQ, c0Var, 54);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarT);
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

    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n113#2:816\n113#2:817\n99#3,6:818\n106#3:854\n79#4,6:824\n86#4,3:839\n89#4,2:848\n93#4:853\n347#5,9:830\n356#5,3:850\n4206#6,6:842\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3\n*L\n402#1:816\n403#1:817\n405#1:818,6\n405#1:854\n405#1:824,6\n405#1:839,3\n405#1:848,2\n405#1:853\n405#1:830,9\n405#1:850,3\n405#1:842,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34505c;

        @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n1282#2,6:816\n99#3:822\n96#3,9:823\n106#3:862\n79#4,6:832\n86#4,3:847\n89#4,2:856\n93#4:861\n347#5,9:838\n356#5,3:858\n4206#6,6:850\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1\n*L\n425#1:816,6\n425#1:822\n425#1:823,9\n425#1:862\n425#1:832,6\n425#1:847,3\n425#1:856,2\n425#1:861\n425#1:838,9\n425#1:858,3\n425#1:850,6\n*E\n"})
        static final class a implements pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34506a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f34506a = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void d(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, int i10) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-660008666, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:424)");
                }
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.yg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return xg.b.a.f((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f34506a;
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.w(), c0Var, 0);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, xg.f34499t), c0Var, 6);
                function2.invoke(c0Var, 0);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                d(lVar, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f34503a = z10;
            this.f34504b = function2;
            this.f34505c = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(632971498, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:401)");
            }
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.A(androidx.compose.ui.a0.E, this.f34503a ? xg.f34501v : d0.k0.f268351a.c(), 0.0f, 0.0f, 0.0f, 14, null), this.f34503a ? xg.f34498s : androidx.compose.ui.unit.h.r(0), 0.0f, this.f34503a ? xg.f34500u : androidx.compose.ui.unit.h.r(0), 0.0f, 10, null);
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            androidx.compose.foundation.layout.q.e eVarW = this.f34503a ? androidx.compose.foundation.layout.q.f16330a.w() : androidx.compose.foundation.layout.q.f16330a.m();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f34504b;
            boolean z10 = this.f34503a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f34505c;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, cVarQ, c0Var, 48);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            function2.invoke(c0Var, 0);
            androidx.compose.animation.k.i(y5Var, z10, null, xg.E(c0Var, 0), xg.D(c0Var, 0), null, androidx.compose.runtime.internal.w.e(-660008666, true, new a(function3), c0Var, 54), c0Var, 1572870, 18);
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

    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n1925#2:816\n1923#2:817\n1832#2,7:818\n1925#2:825\n1923#2:826\n1832#2,7:827\n1282#3,6:834\n1282#3,6:877\n1282#3,6:883\n1282#3,6:889\n99#4:840\n96#4,9:841\n99#4:895\n96#4,9:896\n106#4:935\n106#4:939\n79#5,6:850\n86#5,3:865\n89#5,2:874\n79#5,6:905\n86#5,3:920\n89#5,2:929\n93#5:934\n93#5:938\n347#6,9:856\n356#6:876\n347#6,9:911\n356#6,3:931\n357#6,2:936\n4206#7,6:868\n4206#7,6:923\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n*L\n470#1:816\n470#1:817\n470#1:818,7\n472#1:825\n472#1:826\n472#1:827,7\n475#1:834,6\n488#1:877,6\n495#1:883,6\n496#1:889,6\n473#1:840\n473#1:841,9\n494#1:895\n494#1:896,9\n494#1:935\n473#1:939\n473#1:850,6\n473#1:865,3\n473#1:874,2\n494#1:905,6\n494#1:920,3\n494#1:929,2\n494#1:934\n473#1:938\n473#1:856,9\n473#1:876\n494#1:911,9\n494#1:931,3\n473#1:936,2\n473#1:868,6\n494#1:923,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f34511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f34513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34514h;

        static final class a implements pj.n<androidx.compose.animation.core.l3.b<Float>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.y0<Float> f34515a;

            a(androidx.compose.animation.core.y0<Float> y0Var) {
                this.f34515a = y0Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Float> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
                c0Var.E(-781713402);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-781713402, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
                }
                androidx.compose.animation.core.y0<Float> y0Var = this.f34515a;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                return y0Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Float> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                return c(bVar, c0Var, num.intValue());
            }
        }

        static final class b implements pj.n<androidx.compose.animation.core.l3.b<Float>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.y0<Float> f34516a;

            b(androidx.compose.animation.core.y0<Float> y0Var) {
                this.f34516a = y0Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Float> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
                c0Var.E(-1114419602);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1114419602, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
                }
                androidx.compose.animation.core.y0<Float> y0Var = this.f34516a;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                return y0Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Float> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                return c(bVar, c0Var, num.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z10, float f10, float f11, float f12, float f13, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, float f14, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f34507a = z10;
            this.f34508b = f10;
            this.f34509c = f11;
            this.f34510d = f12;
            this.f34511e = f13;
            this.f34512f = function2;
            this.f34513g = f14;
            this.f34514h = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.setAlpha(((Number) n7Var.getValue()).floatValue());
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s(androidx.compose.animation.core.l3 l3Var) {
            return ((Number) l3Var.p()).floatValue() == 0.0f && !l3Var.D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(androidx.compose.ui.semantics.e0 e0Var) {
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 x(float f10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
            int iS = androidx.compose.ui.util.e.s(c1Var.g6(f10), z0Var.M0(androidx.compose.ui.unit.b.o(bVar.x())), ((Number) n7Var.getValue()).floatValue());
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
            return androidx.compose.ui.layout.c1.h6(c1Var, iS, i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.dh
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xg.c.y(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            m(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void m(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-827388388, i10, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:464)");
            }
            final androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(Float.valueOf(this.f34507a ? 1.0f : 0.0f), "expanded state", c0Var, 48, 0);
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.FastSpatial, c0Var, 6);
            androidx.compose.animation.core.y0 y0VarB2 = hm.b(d0.h1.FastEffects, c0Var, 6);
            b bVar = new b(y0VarB);
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(zVar);
            float fFloatValue = ((Number) l3VarJ.p()).floatValue();
            c0Var.E(-157343033);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            Float fValueOf = Float.valueOf(fFloatValue);
            float fFloatValue2 = ((Number) l3VarJ.y()).floatValue();
            c0Var.E(-157343033);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            final androidx.compose.runtime.n7 n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(fFloatValue2), bVar.invoke(l3VarJ.w(), c0Var, 0), z3VarP, "FloatAnimation", c0Var, 0);
            a aVar = new a(y0VarB2);
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = androidx.compose.animation.core.t4.P(zVar);
            float fFloatValue3 = ((Number) l3VarJ.p()).floatValue();
            c0Var.E(175363167);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            Float fValueOf2 = Float.valueOf(fFloatValue3);
            float fFloatValue4 = ((Number) l3VarJ.y()).floatValue();
            c0Var.E(175363167);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            final androidx.compose.runtime.n7 n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf2, Float.valueOf(fFloatValue4), aVar.invoke(l3VarJ.w(), c0Var, 0), z3VarP2, "FloatAnimation", c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zI = c0Var.I(this.f34508b) | c0Var.D(n7VarD);
            final float f10 = this.f34508b;
            Object objI0 = c0Var.i0();
            if (zI || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new pj.n() { // from class: androidx.compose.material3.zg
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return xg.c.x(f10, n7VarD, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.A(androidx.compose.ui.layout.q0.a(aVar2, (pj.n) objI0), this.f34508b, this.f34509c, 0.0f, 0.0f, 12, null), this.f34510d, 0.0f, this.f34511e, 0.0f, 10, null);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ = aVar3.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f34512f;
            float f11 = this.f34513g;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f34514h;
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(qVar.w(), cVarQ, c0Var, 48);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar4.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            function2.invoke(c0Var, 0);
            boolean zD = c0Var.D(l3VarJ);
            Object objI1 = c0Var.i0();
            if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.ah
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(xg.c.s(l3VarJ));
                    }
                });
                c0Var.Y(objI1);
            }
            if (((Boolean) ((androidx.compose.runtime.n7) objI1).getValue()).booleanValue()) {
                c0Var.E(65953058);
                c0Var.A();
            } else {
                c0Var.E(65675329);
                Object objI2 = c0Var.i0();
                androidx.compose.runtime.c0.a aVar5 = androidx.compose.runtime.c0.f35327a;
                if (objI2 == aVar5.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.bh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return xg.c.v((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarC = androidx.compose.ui.semantics.t.c(aVar2, (Function1) objI2);
                boolean zD2 = c0Var.D(n7VarD2);
                Object objI3 = c0Var.i0();
                if (zD2 || objI3 == aVar5.a()) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.ch
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return xg.c.n(n7VarD2, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0Var.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(a0VarC, (Function1) objI3);
                androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar3.w(), c0Var, 0);
                int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarA);
                Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
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
                androidx.compose.runtime.y7.n(c0VarD2, a1VarE2, aVar4.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar4.f());
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar2, f11), c0Var, 0);
                function3.invoke(c0Var, 0);
                c0Var.o();
                c0Var.A();
            }
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f34517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f34518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34521e;

        @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,815:1\n70#2:816\n68#2,8:817\n77#2:855\n79#3,6:825\n86#3,3:840\n89#3,2:849\n93#3:854\n347#4,9:831\n356#4,3:851\n4206#5,6:843\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3$1\n*L\n160#1:816\n160#1:817,8\n160#1:855\n160#1:825,6\n160#1:840,3\n160#1:849,2\n160#1:854\n160#1:831,9\n160#1:851,3\n160#1:843,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f34522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f34523b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34524c;

            /* JADX WARN: Multi-variable type inference failed */
            a(float f10, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f34522a = f10;
                this.f34523b = f11;
                this.f34524c = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1767363041, i10, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:159)");
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.a(androidx.compose.ui.a0.E, this.f34522a, this.f34523b);
                androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f34524c;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
        d(long j10, androidx.compose.ui.text.y3 y3Var, float f10, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f34517a = j10;
            this.f34518b = y3Var;
            this.f34519c = f10;
            this.f34520d = f11;
            this.f34521e = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1779603465, i10, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:158)");
            }
            androidx.compose.material3.internal.k3.b(this.f34517a, this.f34518b, androidx.compose.runtime.internal.w.e(-1767363041, true, new a(this.f34519c, this.f34520d, this.f34521e), c0Var, 54), c0Var, androidx.media3.exoplayer.a5.S0);
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
        d0.j0 j0Var = d0.j0.f268300a;
        f34480a = j0Var.a();
        f34481b = j0Var.a();
        f34482c = j0Var.e();
        f34483d = j0Var.f();
        f34484e = j0Var.c();
        f34485f = d0.f3.TitleMedium;
        d0.h0 h0Var = d0.h0.f268151a;
        f34486g = h0Var.a();
        f34487h = h0Var.a();
        f34488i = h0Var.d();
        f34489j = h0Var.e();
        float f10 = 12;
        f34490k = androidx.compose.ui.unit.h.r(f10);
        f34491l = d0.f3.TitleLarge;
        d0.g0 g0Var = d0.g0.f268080a;
        f34492m = g0Var.a();
        f34493n = g0Var.a();
        f34494o = g0Var.e();
        f34495p = g0Var.f();
        float f11 = 16;
        f34496q = androidx.compose.ui.unit.h.r(f11);
        f34497r = d0.f3.HeadlineSmall;
        f34498s = androidx.compose.ui.unit.h.r(f11);
        f34499t = androidx.compose.ui.unit.h.r(f10);
        f34500u = androidx.compose.ui.unit.h.r(20);
        f34501v = androidx.compose.ui.unit.h.r(80);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.animation.f0 D(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-56172201, i10, -1, "androidx.compose.material3.extendedFabCollapseAnimation (FloatingActionButton.kt:795)");
        }
        androidx.compose.animation.f0 f0VarD = androidx.compose.animation.b0.q(hm.b(d0.h1.FastEffects, c0Var, 6), 0.0f, 2, null).d(androidx.compose.animation.b0.y(hm.b(d0.h1.DefaultSpatial, c0Var, 6), androidx.compose.ui.e.f37317a.u(), false, null, 12, null));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f0VarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.animation.d0 E(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-719787506, i10, -1, "androidx.compose.material3.extendedFabExpandAnimation (FloatingActionButton.kt:806)");
        }
        androidx.compose.animation.d0 d0VarC = androidx.compose.animation.b0.o(hm.b(d0.h1.DefaultEffects, c0Var, 6), 0.0f, 2, null).c(androidx.compose.animation.b0.i(hm.b(d0.h1.FastSpatial, c0Var, 6), androidx.compose.ui.e.f37317a.u(), false, null, 12, null));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d0VarC;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189 A[PHI: r6 r8 r9 r10 r12 r17 r20
      0x0189: PHI (r6v12 androidx.compose.ui.a0) = (r6v6 androidx.compose.ui.a0), (r6v3 androidx.compose.ui.a0) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r8v7 boolean) = (r8v4 boolean), (r8v3 boolean) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r9v16 androidx.compose.ui.graphics.q3) = (r9v10 androidx.compose.ui.graphics.q3), (r9v7 androidx.compose.ui.graphics.q3) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r10v7 long) = (r10v4 long), (r10v3 long) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r12v12 androidx.compose.material3.ng) = (r12v5 androidx.compose.material3.ng), (r12v2 androidx.compose.material3.ng) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r17v17 int) = (r17v9 int), (r17v21 int) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r20v5 long) = (r20v2 long), (r20v6 long) binds: [B:152:0x0204, B:132:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:153:0x0206  */
    /* JADX WARN: Code duplicated, block: B:156:0x0215  */
    /* JADX WARN: Code duplicated, block: B:159:0x0260  */
    /* JADX WARN: Code duplicated, block: B:161:0x0275  */
    /* JADX WARN: Code duplicated, block: B:164:0x0289  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable ng ngVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarE;
        long jD;
        ng ngVarC;
        int i15;
        int i16;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j12;
        final ng ngVar2;
        final long j13;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        long jG;
        androidx.compose.foundation.interaction.j jVar3;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1161000600);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(function1) ? 256 : 128;
            }
        }
        int i21 = i11 & 8;
        if (i21 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        q3VarE = q3Var;
                        int i22 = c0VarR.D(q3VarE) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        q3VarE = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3VarE = q3Var;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        jD = j10;
                        int i23 = c0VarR.L(jD) ? 1048576 : 524288;
                        i12 |= i23;
                    } else {
                        jD = j10;
                    }
                    i12 |= i23;
                } else {
                    jD = j10;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i12 |= i20;
                }
                if ((i10 & 100663296) == 0) {
                    if ((i11 & 256) == 0) {
                        ngVarC = ngVar;
                        if (c0VarR.D(ngVarC)) {
                            i19 = 67108864;
                        }
                        i12 |= i19;
                    } else {
                        ngVarC = ngVar;
                    }
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                    i12 |= i19;
                } else {
                    ngVarC = ngVar;
                }
                i15 = i11 & 512;
                if (i15 != 0) {
                    if ((805306368 & i10) == 0) {
                        if (c0VarR.D(jVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i12 |= i16;
                    }
                    i17 = i12;
                    if ((i12 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i17 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                jD = mg.f30614a.d(c0VarR, 6);
                                i17 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if ((i11 & 256) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                i17 &= -234881025;
                            }
                            if (i15 != 0) {
                                jVar3 = null;
                            }
                            long j14 = jD;
                            ng ngVar3 = ngVarC;
                            i18 = i17;
                            androidx.compose.ui.graphics.q3 q3Var3 = q3VarE;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                            }
                            int i24 = i18 >> 6;
                            int i25 = i18 >> 9;
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            o(function1, a0Var4, q3Var3, j14, jG, ngVar3, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 14) | 12582912 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z13 = z11;
                            a0Var3 = a0Var4;
                            q3Var2 = q3Var3;
                            j12 = j14;
                            j13 = jG;
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i17 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i17 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i17 &= -234881025;
                            }
                            jG = j11;
                        }
                        jVar3 = jVar;
                        long j15 = jD;
                        ng ngVar4 = ngVarC;
                        i18 = i17;
                        androidx.compose.ui.graphics.q3 q3Var4 = q3VarE;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                        }
                        int i26 = i18 >> 6;
                        int i27 = i18 >> 9;
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        o(function1, a0Var5, q3Var4, j15, jG, ngVar4, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 14) | 12582912 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z13 = z11;
                        a0Var3 = a0Var5;
                        q3Var2 = q3Var4;
                        j12 = j15;
                        j13 = jG;
                        ngVar2 = ngVar4;
                        jVar2 = jVar3;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarE;
                        j12 = jD;
                        ngVar2 = ngVarC;
                        j13 = j11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                i17 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    long j16 = jD;
                    ng ngVar5 = ngVarC;
                    i18 = i17;
                    androidx.compose.ui.graphics.q3 q3Var5 = q3VarE;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                    }
                    int i28 = i18 >> 6;
                    int i29 = i18 >> 9;
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    o(function1, a0Var6, q3Var5, j16, jG, ngVar5, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 14) | 12582912 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var6;
                    q3Var2 = q3Var5;
                    j12 = j16;
                    j13 = jG;
                    ngVar2 = ngVar5;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarE;
                    j12 = jD;
                    ngVar2 = ngVarC;
                    j13 = j11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarE = q3Var;
                    if (c0VarR.D(q3VarE)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarE = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarE = q3Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jD = j10;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i23;
                } else {
                    jD = j10;
                }
                i12 |= i23;
            } else {
                jD = j10;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 100663296) == 0) {
                if ((i11 & 256) == 0) {
                    ngVarC = ngVar;
                    if (c0VarR.D(ngVarC)) {
                        i19 = 67108864;
                    }
                    i12 |= i19;
                } else {
                    ngVarC = ngVar;
                }
                i19 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i19;
            } else {
                ngVarC = ngVar;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                if ((805306368 & i10) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    long j17 = jD;
                    ng ngVar6 = ngVarC;
                    i18 = i17;
                    androidx.compose.ui.graphics.q3 q3Var6 = q3VarE;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                    }
                    int i210 = i18 >> 6;
                    int i211 = i18 >> 9;
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    o(function1, a0Var7, q3Var6, j17, jG, ngVar6, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 14) | 12582912 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var7;
                    q3Var2 = q3Var6;
                    j12 = j17;
                    j13 = jG;
                    ngVar2 = ngVar6;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarE;
                    j12 = jD;
                    ngVar2 = ngVarC;
                    j13 = j11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            i17 = i12;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                long j18 = jD;
                ng ngVar7 = ngVarC;
                i18 = i17;
                androidx.compose.ui.graphics.q3 q3Var7 = q3VarE;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                }
                int i212 = i18 >> 6;
                int i213 = i18 >> 9;
                androidx.compose.ui.a0 a0Var8 = a0Var2;
                o(function1, a0Var8, q3Var7, j18, jG, ngVar7, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 14) | 12582912 | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var8;
                q3Var2 = q3Var7;
                j12 = j18;
                j13 = jG;
                ngVar2 = ngVar7;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarE;
                j12 = jD;
                ngVar2 = ngVarC;
                j13 = j11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarE = q3Var;
                    if (c0VarR.D(q3VarE)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarE = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarE = q3Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jD = j10;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i23;
                } else {
                    jD = j10;
                }
                i12 |= i23;
            } else {
                jD = j10;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 100663296) == 0) {
                if ((i11 & 256) == 0) {
                    ngVarC = ngVar;
                    if (c0VarR.D(ngVarC)) {
                        i19 = 67108864;
                    }
                    i12 |= i19;
                } else {
                    ngVarC = ngVar;
                }
                i19 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i19;
            } else {
                ngVarC = ngVar;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                if ((805306368 & i10) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i17 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i17 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 256) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i17 &= -234881025;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    long j19 = jD;
                    ng ngVar8 = ngVarC;
                    i18 = i17;
                    androidx.compose.ui.graphics.q3 q3Var8 = q3VarE;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                    }
                    int i214 = i18 >> 6;
                    int i215 = i18 >> 9;
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    o(function1, a0Var9, q3Var8, j19, jG, ngVar8, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 14) | 12582912 | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var9;
                    q3Var2 = q3Var8;
                    j12 = j19;
                    j13 = jG;
                    ngVar2 = ngVar8;
                    jVar2 = jVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarE;
                    j12 = jD;
                    ngVar2 = ngVarC;
                    j13 = j11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            i17 = i12;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                long j110 = jD;
                ng ngVar9 = ngVarC;
                i18 = i17;
                androidx.compose.ui.graphics.q3 q3Var9 = q3VarE;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                }
                int i216 = i18 >> 6;
                int i217 = i18 >> 9;
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                o(function1, a0Var10, q3Var9, j110, jG, ngVar9, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 14) | 12582912 | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var10;
                q3Var2 = q3Var9;
                j12 = j110;
                j13 = jG;
                ngVar2 = ngVar9;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarE;
                j12 = jD;
                ngVar2 = ngVarC;
                j13 = j11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                q3VarE = q3Var;
                if (c0VarR.D(q3VarE)) {
                }
                i12 |= i22;
            } else {
                q3VarE = q3Var;
            }
            i12 |= i22;
        } else {
            q3VarE = q3Var;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                jD = j10;
                if (c0VarR.L(jD)) {
                }
                i12 |= i23;
            } else {
                jD = j10;
            }
            i12 |= i23;
        } else {
            jD = j10;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i20 = 4194304;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i10 & 100663296) == 0) {
            if ((i11 & 256) == 0) {
                ngVarC = ngVar;
                if (c0VarR.D(ngVarC)) {
                    i19 = 67108864;
                }
                i12 |= i19;
            } else {
                ngVarC = ngVar;
            }
            i19 = com.google.api.client.googleapis.media.a.f115410j;
            i12 |= i19;
        } else {
            ngVarC = ngVar;
        }
        i15 = i11 & 512;
        if (i15 != 0) {
            if ((805306368 & i10) == 0) {
                if (c0VarR.D(jVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i17 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i17 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 256) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i17 &= -234881025;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                long j111 = jD;
                ng ngVar10 = ngVarC;
                i18 = i17;
                androidx.compose.ui.graphics.q3 q3Var10 = q3VarE;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                }
                int i218 = i18 >> 6;
                int i219 = i18 >> 9;
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                o(function1, a0Var11, q3Var10, j111, jG, ngVar10, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 14) | 12582912 | (i219 & 896) | (i219 & 7168) | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var11;
                q3Var2 = q3Var10;
                j12 = j111;
                j13 = jG;
                ngVar2 = ngVar10;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarE;
                j12 = jD;
                ngVar2 = ngVarC;
                j13 = j11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 805306368;
        i17 = i12;
        if ((i12 & 306783379) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i17 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 32) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i17 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i17 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jG = j11;
                }
                if ((i11 & 256) != 0) {
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i17 &= -234881025;
                }
                if (i15 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 32) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i17 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i17 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jG = o6.g(jD, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jG = j11;
                }
                if ((i11 & 256) != 0) {
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i17 &= -234881025;
                }
                if (i15 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            }
            long j112 = jD;
            ng ngVar11 = ngVarC;
            i18 = i17;
            androidx.compose.ui.graphics.q3 q3Var11 = q3VarE;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1161000600, i18, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
            }
            int i2110 = i18 >> 6;
            int i2111 = i18 >> 9;
            androidx.compose.ui.a0 a0Var12 = a0Var2;
            o(function1, a0Var12, q3Var11, j112, jG, ngVar11, jVar3, androidx.compose.runtime.internal.w.e(632971498, true, new b(z11, function3, function2), c0VarR, 54), c0VarR, (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 14) | 12582912 | (i2111 & 896) | (i2111 & 7168) | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z13 = z11;
            a0Var3 = a0Var12;
            q3Var2 = q3Var11;
            j12 = j112;
            j13 = jG;
            ngVar2 = ngVar11;
            jVar2 = jVar3;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarE;
            j12 = jD;
            ngVar2 = ngVarC;
            j13 = j11;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.l(function2, function3, function0, a0Var3, z13, q3Var2, j12, j13, ngVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:135:0x0222  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable ng ngVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.graphics.q3 q3VarE;
        long jD;
        long j12;
        ng ngVarC;
        int i13;
        int i14;
        int i15;
        boolean z10;
        final androidx.compose.ui.a0 a0Var2;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final ng ngVar2;
        final long j13;
        final long j14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.graphics.q3 q3Var3;
        int i16;
        long j15;
        int i17;
        long j16;
        boolean z11;
        long j17;
        androidx.compose.foundation.interaction.j jVar3;
        ng ngVar3;
        long j18;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1039585610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    q3VarE = q3Var;
                    int i22 = c0VarR.D(q3VarE) ? 256 : 128;
                    i12 |= i22;
                } else {
                    q3VarE = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarE = q3Var;
            }
            if ((i10 & 3072) == 0) {
                jD = j10;
                if ((i11 & 8) == 0 || !c0VarR.L(jD)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((i10 & 24576) == 0) {
                j12 = j11;
                if ((i11 & 16) == 0 || !c0VarR.L(j12)) {
                    i19 = 8192;
                } else {
                    i19 = 16384;
                }
                i12 |= i19;
            } else {
                j12 = j11;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    ngVarC = ngVar;
                    int i23 = c0VarR.D(ngVarC) ? 131072 : 65536;
                    i12 |= i23;
                } else {
                    ngVarC = ngVar;
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i12 &= -897;
                    }
                    q3Var3 = q3VarE;
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    }
                    i16 = i12;
                    j15 = jD;
                    if ((i11 & 16) != 0) {
                        long jG = o6.g(j15, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j12 = jG;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = j15;
                        z11 = true;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = j15;
                        z11 = true;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        j17 = j12;
                        jVar3 = null;
                    } else {
                        j17 = j12;
                        jVar3 = jVar;
                    }
                    ngVar3 = ngVarC;
                    j18 = j16;
                    i18 = 1039585610;
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    jVar3 = jVar;
                    z11 = true;
                    ngVar3 = ngVarC;
                    j17 = j12;
                    i18 = 1039585610;
                    a0Var3 = a0Var;
                    q3Var3 = q3VarE;
                    j18 = jD;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:320)");
                }
                o(function1, a0Var3, q3Var3, j18, j17, ngVar3, jVar3, androidx.compose.runtime.internal.w.e(-1233936436, z11, new a(nVar), c0VarR, 54), c0VarR, (i12 & 14) | 12582912 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                q3Var2 = q3Var3;
                j13 = j18;
                j14 = j17;
                ngVar2 = ngVar3;
                jVar2 = jVar3;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                jVar2 = jVar;
                q3Var2 = q3VarE;
                ngVar2 = ngVarC;
                j13 = jD;
                j14 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.m(function0, a0Var2, q3Var2, j13, j14, ngVar2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3VarE = q3Var;
                if (c0VarR.D(q3VarE)) {
                }
                i12 |= i22;
            } else {
                q3VarE = q3Var;
            }
            i12 |= i22;
        } else {
            q3VarE = q3Var;
        }
        if ((i10 & 3072) == 0) {
            jD = j10;
            if ((i11 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((i10 & 24576) == 0) {
            j12 = j11;
            if ((i11 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i12 |= i19;
        } else {
            j12 = j11;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                ngVarC = ngVar;
                if (c0VarR.D(ngVarC)) {
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i12 |= i23;
        } else {
            ngVarC = ngVar;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(jVar)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(nVar)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 4) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i12 &= -897;
                }
                q3Var3 = q3VarE;
                if ((i11 & 8) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i12 &= -7169;
                }
                i16 = i12;
                j15 = jD;
                if ((i11 & 16) != 0) {
                    long jG2 = o6.g(j15, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j12 = jG2;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = j15;
                    z11 = true;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = j15;
                    z11 = true;
                    i12 = i17;
                }
                if (i13 != 0) {
                    j17 = j12;
                    jVar3 = null;
                } else {
                    j17 = j12;
                    jVar3 = jVar;
                }
                ngVar3 = ngVarC;
                j18 = j16;
                i18 = 1039585610;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if ((i11 & 4) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i12 &= -897;
                }
                q3Var3 = q3VarE;
                if ((i11 & 8) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i12 &= -7169;
                }
                i16 = i12;
                j15 = jD;
                if ((i11 & 16) != 0) {
                    long jG3 = o6.g(j15, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j12 = jG3;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = j15;
                    z11 = true;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = j15;
                    z11 = true;
                    i12 = i17;
                }
                if (i13 != 0) {
                    j17 = j12;
                    jVar3 = null;
                } else {
                    j17 = j12;
                    jVar3 = jVar;
                }
                ngVar3 = ngVarC;
                j18 = j16;
                i18 = 1039585610;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:320)");
            }
            o(function1, a0Var3, q3Var3, j18, j17, ngVar3, jVar3, androidx.compose.runtime.internal.w.e(-1233936436, z11, new a(nVar), c0VarR, 54), c0VarR, (i12 & 14) | 12582912 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            q3Var2 = q3Var3;
            j13 = j18;
            j14 = j17;
            ngVar2 = ngVar3;
            jVar2 = jVar3;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            jVar2 = jVar;
            q3Var2 = q3VarE;
            ngVar2 = ngVarC;
            j13 = jD;
            j14 = j12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.vg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.m(function0, a0Var2, q3Var2, j13, j14, ngVar2, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0169  */
    /* JADX WARN: Code duplicated, block: B:117:0x016c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:157:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0217  */
    /* JADX WARN: Code duplicated, block: B:178:0x0220  */
    /* JADX WARN: Code duplicated, block: B:180:0x0227  */
    /* JADX WARN: Code duplicated, block: B:196:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x0263  */
    /* JADX WARN: Code duplicated, block: B:198:0x0266  */
    /* JADX WARN: Code duplicated, block: B:200:0x026c  */
    /* JADX WARN: Code duplicated, block: B:201:0x026e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0275  */
    /* JADX WARN: Code duplicated, block: B:206:0x0280  */
    /* JADX WARN: Code duplicated, block: B:209:0x0289  */
    /* JADX WARN: Code duplicated, block: B:210:0x029f  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:214:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:218:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:222:0x0302  */
    /* JADX WARN: Code duplicated, block: B:225:0x030e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0391  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:233:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private static final void k(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function0<Unit> function0, final androidx.compose.ui.text.y3 y3Var, final float f10, final float f11, final float f12, final float f13, final float f14, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        long j12;
        int i28;
        boolean z11;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final boolean z12;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j13;
        final long j14;
        final ng ngVar2;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        boolean z13;
        androidx.compose.ui.graphics.q3 q3VarE;
        int i29;
        int i30;
        long jD;
        long jG;
        ng ngVarC;
        androidx.compose.foundation.interaction.j jVar3;
        long j15;
        androidx.compose.ui.graphics.q3 q3Var3;
        long j16;
        ng ngVar3;
        int i31;
        int i32;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(193103278);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c0VarR.k0(function3) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(function0)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                i15 = 1024;
                if ((i12 & 8) != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.D(y3Var)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i13 |= i16;
                    }
                    i17 = 8192;
                    if ((i12 & 16) != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.I(f10)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i13 |= i18;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= androidx.profileinstaller.n.c.f73814m;
                            f15 = f11;
                        } else {
                            f15 = f11;
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                if (c0VarR.I(f15)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i13 |= i19;
                            }
                        }
                        if ((i12 & 64) != 0) {
                            i13 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.I(f12)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                        if ((i12 & 128) != 0) {
                            if ((12582912 & i10) == 0) {
                                if (c0VarR.I(f13)) {
                                    i21 = 8388608;
                                } else {
                                    i21 = 4194304;
                                }
                                i13 |= i21;
                            }
                            if ((i12 & 256) != 0) {
                                if ((100663296 & i10) == 0) {
                                    if (c0VarR.I(f14)) {
                                        i22 = 67108864;
                                    } else {
                                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                                    }
                                    i13 |= i22;
                                }
                                i23 = i12 & 512;
                                if (i23 != 0) {
                                    i13 |= 805306368;
                                } else if ((i10 & 805306368) == 0) {
                                    if (c0VarR.D(a0Var)) {
                                        i24 = 536870912;
                                    } else {
                                        i24 = 268435456;
                                    }
                                    i13 |= i24;
                                }
                                i25 = i12 & 1024;
                                if (i25 != 0) {
                                    i26 = i11 | 6;
                                } else if ((i11 & 6) == 0) {
                                    if (c0VarR.G(z10)) {
                                        i27 = 4;
                                    } else {
                                        i27 = 2;
                                    }
                                    i26 = i11 | i27;
                                } else {
                                    i26 = i11;
                                }
                                if ((i11 & 48) != 0) {
                                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                                }
                                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                    if ((i12 & 4096) == 0 || !c0VarR.L(j10)) {
                                        i32 = 128;
                                    } else {
                                        i32 = 256;
                                    }
                                    i26 |= i32;
                                }
                                if ((i11 & 3072) == 0) {
                                    j12 = j11;
                                    if ((i12 & 8192) == 0 && c0VarR.L(j12)) {
                                        i15 = 2048;
                                    }
                                    i26 |= i15;
                                } else {
                                    j12 = j11;
                                }
                                if ((i11 & 24576) != 0) {
                                    if ((i12 & 16384) == 0 && c0VarR.D(ngVar)) {
                                        i17 = 16384;
                                    }
                                    i26 |= i17;
                                }
                                i28 = i12 & 32768;
                                if (i28 != 0) {
                                    i26 |= androidx.profileinstaller.n.c.f73814m;
                                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                                }
                                if ((i13 & 306783379) == 306783378 || (i26 & 74899) != 74898) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (c0VarR.h(z11, i13 & 1)) {
                                    c0VarR.l0();
                                    if ((i10 & 1) != 0 || c0VarR.y()) {
                                        if (i23 != 0) {
                                            a0Var3 = androidx.compose.ui.a0.E;
                                        } else {
                                            a0Var3 = a0Var;
                                        }
                                        if (i25 != 0) {
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        if ((i12 & 2048) != 0) {
                                            q3VarE = mg.f30614a.e(c0VarR, 6);
                                            i26 &= -113;
                                        } else {
                                            q3VarE = q3Var;
                                        }
                                        i29 = i26;
                                        if ((i12 & 4096) != 0) {
                                            i30 = i29 & (-897);
                                            jD = mg.f30614a.d(c0VarR, 6);
                                        } else {
                                            i30 = i29;
                                            jD = j10;
                                        }
                                        if ((i12 & 8192) != 0) {
                                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                            i30 &= -7169;
                                        } else {
                                            jG = j11;
                                        }
                                        long j17 = jD;
                                        if ((i12 & 16384) != 0) {
                                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                            c0Var2 = c0VarR;
                                            i30 &= -57345;
                                        } else {
                                            c0Var2 = c0VarR;
                                            ngVarC = ngVar;
                                        }
                                        if (i28 != 0) {
                                            jVar3 = null;
                                        } else {
                                            jVar3 = jVar;
                                        }
                                        j15 = jG;
                                        q3Var3 = q3VarE;
                                        j16 = j17;
                                        ngVar3 = ngVarC;
                                        i31 = i30;
                                    } else {
                                        c0VarR.u();
                                        if ((i12 & 2048) != 0) {
                                            i26 &= -113;
                                        }
                                        i31 = i26;
                                        if ((i12 & 4096) != 0) {
                                            i31 &= -897;
                                        }
                                        if ((i12 & 8192) != 0) {
                                            i31 &= -7169;
                                        }
                                        if ((i12 & 16384) != 0) {
                                            i31 &= -57345;
                                        }
                                        a0Var3 = a0Var;
                                        z13 = z10;
                                        q3Var3 = q3Var;
                                        j16 = j10;
                                        ngVar3 = ngVar;
                                        jVar3 = jVar;
                                        c0Var2 = c0VarR;
                                        j15 = j12;
                                    }
                                    c0Var2.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                    }
                                    androidx.compose.ui.unit.h.a aVar = androidx.compose.ui.unit.h.f42689b;
                                    float fE = aVar.e();
                                    float fE2 = aVar.e();
                                    boolean z14 = z13;
                                    int i33 = i31;
                                    androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z14, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                    int i34 = i13 >> 6;
                                    int i35 = (i34 & com.planner5d.library.engine.input.f.b.B) | (i34 & 14) | 3456 | ((i13 >> 15) & 57344);
                                    int i36 = i33 << 12;
                                    androidx.compose.ui.a0 a0Var4 = a0Var3;
                                    p(function0, y3Var, fE, fE2, a0Var4, q3Var3, j16, j15, ngVar3, jVar3, cVarE, c0Var2, i35 | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), 6, 0);
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    ngVar2 = ngVar3;
                                    jVar2 = jVar3;
                                    j14 = j15;
                                    q3Var2 = q3Var3;
                                    j13 = j16;
                                    z12 = z14;
                                    a0Var2 = a0Var4;
                                } else {
                                    c0Var2 = c0VarR;
                                    c0Var2.u();
                                    a0Var2 = a0Var;
                                    z12 = z10;
                                    q3Var2 = q3Var;
                                    j13 = j10;
                                    j14 = j11;
                                    ngVar2 = ngVar;
                                    jVar2 = jVar;
                                }
                                s5VarT = c0Var2.T();
                                if (s5VarT != null) {
                                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i13 |= 100663296;
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j18 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j18;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j19 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j19;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar2 = androidx.compose.ui.unit.h.f42689b;
                                float fE3 = aVar2.e();
                                float fE4 = aVar2.e();
                                boolean z15 = z13;
                                int i37 = i31;
                                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z15, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i38 = i13 >> 6;
                                int i39 = (i38 & com.planner5d.library.engine.input.f.b.B) | (i38 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i310 = i37 << 12;
                                androidx.compose.ui.a0 a0Var5 = a0Var3;
                                p(function0, y3Var, fE3, fE4, a0Var5, q3Var3, j16, j15, ngVar3, jVar3, cVarE2, c0Var2, i39 | (458752 & i310) | (3670016 & i310) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z15;
                                a0Var2 = a0Var5;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 12582912;
                        if ((i12 & 256) != 0) {
                            if ((100663296 & i10) == 0) {
                                if (c0VarR.I(f14)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i22;
                            }
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j110 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j110;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j111 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j111;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar3 = androidx.compose.ui.unit.h.f42689b;
                                float fE5 = aVar3.e();
                                float fE6 = aVar3.e();
                                boolean z16 = z13;
                                int i311 = i31;
                                androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z16, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i312 = i13 >> 6;
                                int i313 = (i312 & com.planner5d.library.engine.input.f.b.B) | (i312 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i314 = i311 << 12;
                                androidx.compose.ui.a0 a0Var6 = a0Var3;
                                p(function0, y3Var, fE5, fE6, a0Var6, q3Var3, j16, j15, ngVar3, jVar3, cVarE3, c0Var2, i313 | (458752 & i314) | (3670016 & i314) | (29360128 & i314) | (234881024 & i314) | (i314 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z16;
                                a0Var2 = a0Var6;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 100663296;
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j112 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j112;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j113 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j113;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar4 = androidx.compose.ui.unit.h.f42689b;
                            float fE7 = aVar4.e();
                            float fE8 = aVar4.e();
                            boolean z17 = z13;
                            int i315 = i31;
                            androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z17, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i316 = i13 >> 6;
                            int i317 = (i316 & com.planner5d.library.engine.input.f.b.B) | (i316 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i318 = i315 << 12;
                            androidx.compose.ui.a0 a0Var7 = a0Var3;
                            p(function0, y3Var, fE7, fE8, a0Var7, q3Var3, j16, j15, ngVar3, jVar3, cVarE4, c0Var2, i317 | (458752 & i318) | (3670016 & i318) | (29360128 & i318) | (234881024 & i318) | (i318 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z17;
                            a0Var2 = a0Var7;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 24576;
                    if ((i12 & 32) != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        f15 = f11;
                    } else {
                        f15 = f11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.I(f15)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 128) != 0) {
                        if ((12582912 & i10) == 0) {
                            if (c0VarR.I(f13)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 256) != 0) {
                            if ((100663296 & i10) == 0) {
                                if (c0VarR.I(f14)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i22;
                            }
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j114 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j114;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j115 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j115;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar5 = androidx.compose.ui.unit.h.f42689b;
                                float fE9 = aVar5.e();
                                float fE10 = aVar5.e();
                                boolean z18 = z13;
                                int i319 = i31;
                                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z18, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i3110 = i13 >> 6;
                                int i3111 = (i3110 & com.planner5d.library.engine.input.f.b.B) | (i3110 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i3112 = i319 << 12;
                                androidx.compose.ui.a0 a0Var8 = a0Var3;
                                p(function0, y3Var, fE9, fE10, a0Var8, q3Var3, j16, j15, ngVar3, jVar3, cVarE5, c0Var2, i3111 | (458752 & i3112) | (3670016 & i3112) | (29360128 & i3112) | (234881024 & i3112) | (i3112 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z18;
                                a0Var2 = a0Var8;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 100663296;
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j116 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j116;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j117 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j117;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar6 = androidx.compose.ui.unit.h.f42689b;
                            float fE11 = aVar6.e();
                            float fE12 = aVar6.e();
                            boolean z19 = z13;
                            int i3113 = i31;
                            androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z19, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3114 = i13 >> 6;
                            int i3115 = (i3114 & com.planner5d.library.engine.input.f.b.B) | (i3114 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i3116 = i3113 << 12;
                            androidx.compose.ui.a0 a0Var9 = a0Var3;
                            p(function0, y3Var, fE11, fE12, a0Var9, q3Var3, j16, j15, ngVar3, jVar3, cVarE6, c0Var2, i3115 | (458752 & i3116) | (3670016 & i3116) | (29360128 & i3116) | (234881024 & i3116) | (i3116 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z19;
                            a0Var2 = a0Var9;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j118 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j118;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j119 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j119;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar7 = androidx.compose.ui.unit.h.f42689b;
                            float fE13 = aVar7.e();
                            float fE14 = aVar7.e();
                            boolean z110 = z13;
                            int i3117 = i31;
                            androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3118 = i13 >> 6;
                            int i3119 = (i3118 & com.planner5d.library.engine.input.f.b.B) | (i3118 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i31110 = i3117 << 12;
                            androidx.compose.ui.a0 a0Var10 = a0Var3;
                            p(function0, y3Var, fE13, fE14, a0Var10, q3Var3, j16, j15, ngVar3, jVar3, cVarE7, c0Var2, i3119 | (458752 & i31110) | (3670016 & i31110) | (29360128 & i31110) | (234881024 & i31110) | (i31110 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z110;
                            a0Var2 = a0Var10;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1110 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1110;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar8 = androidx.compose.ui.unit.h.f42689b;
                        float fE15 = aVar8.e();
                        float fE16 = aVar8.e();
                        boolean z111 = z13;
                        int i31111 = i31;
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31112 = i13 >> 6;
                        int i31113 = (i31112 & com.planner5d.library.engine.input.f.b.B) | (i31112 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31114 = i31111 << 12;
                        androidx.compose.ui.a0 a0Var11 = a0Var3;
                        p(function0, y3Var, fE15, fE16, a0Var11, q3Var3, j16, j15, ngVar3, jVar3, cVarE8, c0Var2, i31113 | (458752 & i31114) | (3670016 & i31114) | (29360128 & i31114) | (234881024 & i31114) | (i31114 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111;
                        a0Var2 = a0Var11;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                i17 = 8192;
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.I(f10)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        f15 = f11;
                    } else {
                        f15 = f11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.I(f15)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 128) != 0) {
                        if ((12582912 & i10) == 0) {
                            if (c0VarR.I(f13)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 256) != 0) {
                            if ((100663296 & i10) == 0) {
                                if (c0VarR.I(f14)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i22;
                            }
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j1112 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j1112;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j1113 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j1113;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar9 = androidx.compose.ui.unit.h.f42689b;
                                float fE17 = aVar9.e();
                                float fE18 = aVar9.e();
                                boolean z112 = z13;
                                int i31115 = i31;
                                androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i31116 = i13 >> 6;
                                int i31117 = (i31116 & com.planner5d.library.engine.input.f.b.B) | (i31116 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i31118 = i31115 << 12;
                                androidx.compose.ui.a0 a0Var12 = a0Var3;
                                p(function0, y3Var, fE17, fE18, a0Var12, q3Var3, j16, j15, ngVar3, jVar3, cVarE9, c0Var2, i31117 | (458752 & i31118) | (3670016 & i31118) | (29360128 & i31118) | (234881024 & i31118) | (i31118 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z112;
                                a0Var2 = a0Var12;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 100663296;
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1114 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1114;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1115 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1115;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar10 = androidx.compose.ui.unit.h.f42689b;
                            float fE19 = aVar10.e();
                            float fE110 = aVar10.e();
                            boolean z113 = z13;
                            int i31119 = i31;
                            androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311110 = i13 >> 6;
                            int i311111 = (i311110 & com.planner5d.library.engine.input.f.b.B) | (i311110 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311112 = i31119 << 12;
                            androidx.compose.ui.a0 a0Var13 = a0Var3;
                            p(function0, y3Var, fE19, fE110, a0Var13, q3Var3, j16, j15, ngVar3, jVar3, cVarE10, c0Var2, i311111 | (458752 & i311112) | (3670016 & i311112) | (29360128 & i311112) | (234881024 & i311112) | (i311112 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z113;
                            a0Var2 = a0Var13;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1116 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1116;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1117 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1117;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar11 = androidx.compose.ui.unit.h.f42689b;
                            float fE111 = aVar11.e();
                            float fE112 = aVar11.e();
                            boolean z114 = z13;
                            int i311113 = i31;
                            androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311114 = i13 >> 6;
                            int i311115 = (i311114 & com.planner5d.library.engine.input.f.b.B) | (i311114 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311116 = i311113 << 12;
                            androidx.compose.ui.a0 a0Var14 = a0Var3;
                            p(function0, y3Var, fE111, fE112, a0Var14, q3Var3, j16, j15, ngVar3, jVar3, cVarE11, c0Var2, i311115 | (458752 & i311116) | (3670016 & i311116) | (29360128 & i311116) | (234881024 & i311116) | (i311116 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z114;
                            a0Var2 = a0Var14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1118 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1118;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1119 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1119;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar12 = androidx.compose.ui.unit.h.f42689b;
                        float fE113 = aVar12.e();
                        float fE114 = aVar12.e();
                        boolean z115 = z13;
                        int i311117 = i31;
                        androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i311118 = i13 >> 6;
                        int i311119 = (i311118 & com.planner5d.library.engine.input.f.b.B) | (i311118 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111110 = i311117 << 12;
                        androidx.compose.ui.a0 a0Var15 = a0Var3;
                        p(function0, y3Var, fE113, fE114, a0Var15, q3Var3, j16, j15, ngVar3, jVar3, cVarE12, c0Var2, i311119 | (458752 & i3111110) | (3670016 & i3111110) | (29360128 & i3111110) | (234881024 & i3111110) | (i3111110 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z115;
                        a0Var2 = a0Var15;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j11110 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j11110;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j11111 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j11111;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar13 = androidx.compose.ui.unit.h.f42689b;
                            float fE115 = aVar13.e();
                            float fE116 = aVar13.e();
                            boolean z116 = z13;
                            int i3111111 = i31;
                            androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3111112 = i13 >> 6;
                            int i3111113 = (i3111112 & com.planner5d.library.engine.input.f.b.B) | (i3111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i3111114 = i3111111 << 12;
                            androidx.compose.ui.a0 a0Var16 = a0Var3;
                            p(function0, y3Var, fE115, fE116, a0Var16, q3Var3, j16, j15, ngVar3, jVar3, cVarE13, c0Var2, i3111113 | (458752 & i3111114) | (3670016 & i3111114) | (29360128 & i3111114) | (234881024 & i3111114) | (i3111114 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z116;
                            a0Var2 = a0Var16;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11112 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11112;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11113 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11113;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar14 = androidx.compose.ui.unit.h.f42689b;
                        float fE117 = aVar14.e();
                        float fE118 = aVar14.e();
                        boolean z117 = z13;
                        int i3111115 = i31;
                        androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111116 = i13 >> 6;
                        int i3111117 = (i3111116 & com.planner5d.library.engine.input.f.b.B) | (i3111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111118 = i3111115 << 12;
                        androidx.compose.ui.a0 a0Var17 = a0Var3;
                        p(function0, y3Var, fE117, fE118, a0Var17, q3Var3, j16, j15, ngVar3, jVar3, cVarE14, c0Var2, i3111117 | (458752 & i3111118) | (3670016 & i3111118) | (29360128 & i3111118) | (234881024 & i3111118) | (i3111118 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z117;
                        a0Var2 = a0Var17;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11114 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11114;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11115 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11115;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar15 = androidx.compose.ui.unit.h.f42689b;
                        float fE119 = aVar15.e();
                        float fE1110 = aVar15.e();
                        boolean z118 = z13;
                        int i3111119 = i31;
                        androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z118, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111110 = i13 >> 6;
                        int i31111111 = (i31111110 & com.planner5d.library.engine.input.f.b.B) | (i31111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111112 = i3111119 << 12;
                        androidx.compose.ui.a0 a0Var18 = a0Var3;
                        p(function0, y3Var, fE119, fE1110, a0Var18, q3Var3, j16, j15, ngVar3, jVar3, cVarE15, c0Var2, i31111111 | (458752 & i31111112) | (3670016 & i31111112) | (29360128 & i31111112) | (234881024 & i31111112) | (i31111112 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z118;
                        a0Var2 = a0Var18;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11116 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11116;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11117 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11117;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar16 = androidx.compose.ui.unit.h.f42689b;
                    float fE1111 = aVar16.e();
                    float fE1112 = aVar16.e();
                    boolean z119 = z13;
                    int i31111113 = i31;
                    androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z119, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111114 = i13 >> 6;
                    int i31111115 = (i31111114 & com.planner5d.library.engine.input.f.b.B) | (i31111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111116 = i31111113 << 12;
                    androidx.compose.ui.a0 a0Var19 = a0Var3;
                    p(function0, y3Var, fE1111, fE1112, a0Var19, q3Var3, j16, j15, ngVar3, jVar3, cVarE16, c0Var2, i31111115 | (458752 & i31111116) | (3670016 & i31111116) | (29360128 & i31111116) | (234881024 & i31111116) | (i31111116 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z119;
                    a0Var2 = a0Var19;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            i15 = 1024;
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(y3Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = 8192;
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.I(f10)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        f15 = f11;
                    } else {
                        f15 = f11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.I(f15)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 128) != 0) {
                        if ((12582912 & i10) == 0) {
                            if (c0VarR.I(f13)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 256) != 0) {
                            if ((100663296 & i10) == 0) {
                                if (c0VarR.I(f14)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i22;
                            }
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j11118 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j11118;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j11119 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j11119;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar17 = androidx.compose.ui.unit.h.f42689b;
                                float fE1113 = aVar17.e();
                                float fE1114 = aVar17.e();
                                boolean z1110 = z13;
                                int i31111117 = i31;
                                androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i31111118 = i13 >> 6;
                                int i31111119 = (i31111118 & com.planner5d.library.engine.input.f.b.B) | (i31111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i311111110 = i31111117 << 12;
                                androidx.compose.ui.a0 a0Var110 = a0Var3;
                                p(function0, y3Var, fE1113, fE1114, a0Var110, q3Var3, j16, j15, ngVar3, jVar3, cVarE17, c0Var2, i31111119 | (458752 & i311111110) | (3670016 & i311111110) | (29360128 & i311111110) | (234881024 & i311111110) | (i311111110 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z1110;
                                a0Var2 = a0Var110;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 100663296;
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111110 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111110;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar18 = androidx.compose.ui.unit.h.f42689b;
                            float fE1115 = aVar18.e();
                            float fE1116 = aVar18.e();
                            boolean z1111 = z13;
                            int i311111111 = i31;
                            androidx.compose.runtime.internal.c cVarE18 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111112 = i13 >> 6;
                            int i311111113 = (i311111112 & com.planner5d.library.engine.input.f.b.B) | (i311111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111114 = i311111111 << 12;
                            androidx.compose.ui.a0 a0Var111 = a0Var3;
                            p(function0, y3Var, fE1115, fE1116, a0Var111, q3Var3, j16, j15, ngVar3, jVar3, cVarE18, c0Var2, i311111113 | (458752 & i311111114) | (3670016 & i311111114) | (29360128 & i311111114) | (234881024 & i311111114) | (i311111114 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z1111;
                            a0Var2 = a0Var111;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111112 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111112;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111113 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111113;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar19 = androidx.compose.ui.unit.h.f42689b;
                            float fE1117 = aVar19.e();
                            float fE1118 = aVar19.e();
                            boolean z1112 = z13;
                            int i311111115 = i31;
                            androidx.compose.runtime.internal.c cVarE19 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111116 = i13 >> 6;
                            int i311111117 = (i311111116 & com.planner5d.library.engine.input.f.b.B) | (i311111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111118 = i311111115 << 12;
                            androidx.compose.ui.a0 a0Var112 = a0Var3;
                            p(function0, y3Var, fE1117, fE1118, a0Var112, q3Var3, j16, j15, ngVar3, jVar3, cVarE19, c0Var2, i311111117 | (458752 & i311111118) | (3670016 & i311111118) | (29360128 & i311111118) | (234881024 & i311111118) | (i311111118 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z1112;
                            a0Var2 = a0Var112;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111114 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111114;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111115 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111115;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar110 = androidx.compose.ui.unit.h.f42689b;
                        float fE1119 = aVar110.e();
                        float fE11110 = aVar110.e();
                        boolean z1113 = z13;
                        int i311111119 = i31;
                        androidx.compose.runtime.internal.c cVarE110 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111110 = i13 >> 6;
                        int i3111111111 = (i3111111110 & com.planner5d.library.engine.input.f.b.B) | (i3111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111112 = i311111119 << 12;
                        androidx.compose.ui.a0 a0Var113 = a0Var3;
                        p(function0, y3Var, fE1119, fE11110, a0Var113, q3Var3, j16, j15, ngVar3, jVar3, cVarE110, c0Var2, i3111111111 | (458752 & i3111111112) | (3670016 & i3111111112) | (29360128 & i3111111112) | (234881024 & i3111111112) | (i3111111112 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1113;
                        a0Var2 = a0Var113;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111116 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111116;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111117 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111117;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar111 = androidx.compose.ui.unit.h.f42689b;
                            float fE11111 = aVar111.e();
                            float fE11112 = aVar111.e();
                            boolean z1114 = z13;
                            int i3111111113 = i31;
                            androidx.compose.runtime.internal.c cVarE111 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3111111114 = i13 >> 6;
                            int i3111111115 = (i3111111114 & com.planner5d.library.engine.input.f.b.B) | (i3111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i3111111116 = i3111111113 << 12;
                            androidx.compose.ui.a0 a0Var114 = a0Var3;
                            p(function0, y3Var, fE11111, fE11112, a0Var114, q3Var3, j16, j15, ngVar3, jVar3, cVarE111, c0Var2, i3111111115 | (458752 & i3111111116) | (3670016 & i3111111116) | (29360128 & i3111111116) | (234881024 & i3111111116) | (i3111111116 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z1114;
                            a0Var2 = a0Var114;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111118 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111118;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111119 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111119;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar112 = androidx.compose.ui.unit.h.f42689b;
                        float fE11113 = aVar112.e();
                        float fE11114 = aVar112.e();
                        boolean z1115 = z13;
                        int i3111111117 = i31;
                        androidx.compose.runtime.internal.c cVarE112 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111118 = i13 >> 6;
                        int i3111111119 = (i3111111118 & com.planner5d.library.engine.input.f.b.B) | (i3111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111110 = i3111111117 << 12;
                        androidx.compose.ui.a0 a0Var115 = a0Var3;
                        p(function0, y3Var, fE11113, fE11114, a0Var115, q3Var3, j16, j15, ngVar3, jVar3, cVarE112, c0Var2, i3111111119 | (458752 & i31111111110) | (3670016 & i31111111110) | (29360128 & i31111111110) | (234881024 & i31111111110) | (i31111111110 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1115;
                        a0Var2 = a0Var115;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111110 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111110;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar113 = androidx.compose.ui.unit.h.f42689b;
                        float fE11115 = aVar113.e();
                        float fE11116 = aVar113.e();
                        boolean z1116 = z13;
                        int i31111111111 = i31;
                        androidx.compose.runtime.internal.c cVarE113 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111111112 = i13 >> 6;
                        int i31111111113 = (i31111111112 & com.planner5d.library.engine.input.f.b.B) | (i31111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111114 = i31111111111 << 12;
                        androidx.compose.ui.a0 a0Var116 = a0Var3;
                        p(function0, y3Var, fE11115, fE11116, a0Var116, q3Var3, j16, j15, ngVar3, jVar3, cVarE113, c0Var2, i31111111113 | (458752 & i31111111114) | (3670016 & i31111111114) | (29360128 & i31111111114) | (234881024 & i31111111114) | (i31111111114 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1116;
                        a0Var2 = a0Var116;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111112 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111112;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111113 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111113;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar114 = androidx.compose.ui.unit.h.f42689b;
                    float fE11117 = aVar114.e();
                    float fE11118 = aVar114.e();
                    boolean z1117 = z13;
                    int i31111111115 = i31;
                    androidx.compose.runtime.internal.c cVarE114 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111116 = i13 >> 6;
                    int i31111111117 = (i31111111116 & com.planner5d.library.engine.input.f.b.B) | (i31111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111118 = i31111111115 << 12;
                    androidx.compose.ui.a0 a0Var117 = a0Var3;
                    p(function0, y3Var, fE11117, fE11118, a0Var117, q3Var3, j16, j15, ngVar3, jVar3, cVarE114, c0Var2, i31111111117 | (458752 & i31111111118) | (3670016 & i31111111118) | (29360128 & i31111111118) | (234881024 & i31111111118) | (i31111111118 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z1117;
                    a0Var2 = a0Var117;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            i17 = 8192;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1111114 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1111114;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1111115 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1111115;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar115 = androidx.compose.ui.unit.h.f42689b;
                            float fE11119 = aVar115.e();
                            float fE111110 = aVar115.e();
                            boolean z1118 = z13;
                            int i31111111119 = i31;
                            androidx.compose.runtime.internal.c cVarE115 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1118, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111111110 = i13 >> 6;
                            int i311111111111 = (i311111111110 & com.planner5d.library.engine.input.f.b.B) | (i311111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111111112 = i31111111119 << 12;
                            androidx.compose.ui.a0 a0Var118 = a0Var3;
                            p(function0, y3Var, fE11119, fE111110, a0Var118, q3Var3, j16, j15, ngVar3, jVar3, cVarE115, c0Var2, i311111111111 | (458752 & i311111111112) | (3670016 & i311111111112) | (29360128 & i311111111112) | (234881024 & i311111111112) | (i311111111112 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z1118;
                            a0Var2 = a0Var118;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111116 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111116;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111117 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111117;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar116 = androidx.compose.ui.unit.h.f42689b;
                        float fE111111 = aVar116.e();
                        float fE111112 = aVar116.e();
                        boolean z1119 = z13;
                        int i311111111113 = i31;
                        androidx.compose.runtime.internal.c cVarE116 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1119, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i311111111114 = i13 >> 6;
                        int i311111111115 = (i311111111114 & com.planner5d.library.engine.input.f.b.B) | (i311111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i311111111116 = i311111111113 << 12;
                        androidx.compose.ui.a0 a0Var119 = a0Var3;
                        p(function0, y3Var, fE111111, fE111112, a0Var119, q3Var3, j16, j15, ngVar3, jVar3, cVarE116, c0Var2, i311111111115 | (458752 & i311111111116) | (3670016 & i311111111116) | (29360128 & i311111111116) | (234881024 & i311111111116) | (i311111111116 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1119;
                        a0Var2 = a0Var119;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111118 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111118;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111119 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111119;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar117 = androidx.compose.ui.unit.h.f42689b;
                        float fE111113 = aVar117.e();
                        float fE111114 = aVar117.e();
                        boolean z11110 = z13;
                        int i311111111117 = i31;
                        androidx.compose.runtime.internal.c cVarE117 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i311111111118 = i13 >> 6;
                        int i311111111119 = (i311111111118 & com.planner5d.library.engine.input.f.b.B) | (i311111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111110 = i311111111117 << 12;
                        androidx.compose.ui.a0 a0Var1110 = a0Var3;
                        p(function0, y3Var, fE111113, fE111114, a0Var1110, q3Var3, j16, j15, ngVar3, jVar3, cVarE117, c0Var2, i311111111119 | (458752 & i3111111111110) | (3670016 & i3111111111110) | (29360128 & i3111111111110) | (234881024 & i3111111111110) | (i3111111111110 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z11110;
                        a0Var2 = a0Var1110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111110 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111110;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar118 = androidx.compose.ui.unit.h.f42689b;
                    float fE111115 = aVar118.e();
                    float fE111116 = aVar118.e();
                    boolean z11111 = z13;
                    int i3111111111111 = i31;
                    androidx.compose.runtime.internal.c cVarE118 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i3111111111112 = i13 >> 6;
                    int i3111111111113 = (i3111111111112 & com.planner5d.library.engine.input.f.b.B) | (i3111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i3111111111114 = i3111111111111 << 12;
                    androidx.compose.ui.a0 a0Var1111 = a0Var3;
                    p(function0, y3Var, fE111115, fE111116, a0Var1111, q3Var3, j16, j15, ngVar3, jVar3, cVarE118, c0Var2, i3111111111113 | (458752 & i3111111111114) | (3670016 & i3111111111114) | (29360128 & i3111111111114) | (234881024 & i3111111111114) | (i3111111111114 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11111;
                    a0Var2 = a0Var1111;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f15 = f11;
            } else {
                f15 = f11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i12 & 128) != 0) {
                if ((12582912 & i10) == 0) {
                    if (c0VarR.I(f13)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111112 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111112;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111113 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111113;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar119 = androidx.compose.ui.unit.h.f42689b;
                        float fE111117 = aVar119.e();
                        float fE111118 = aVar119.e();
                        boolean z11112 = z13;
                        int i3111111111115 = i31;
                        androidx.compose.runtime.internal.c cVarE119 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111111116 = i13 >> 6;
                        int i3111111111117 = (i3111111111116 & com.planner5d.library.engine.input.f.b.B) | (i3111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111118 = i3111111111115 << 12;
                        androidx.compose.ui.a0 a0Var1112 = a0Var3;
                        p(function0, y3Var, fE111117, fE111118, a0Var1112, q3Var3, j16, j15, ngVar3, jVar3, cVarE119, c0Var2, i3111111111117 | (458752 & i3111111111118) | (3670016 & i3111111111118) | (29360128 & i3111111111118) | (234881024 & i3111111111118) | (i3111111111118 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z11112;
                        a0Var2 = a0Var1112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111114 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111114;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111115 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111115;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar1110 = androidx.compose.ui.unit.h.f42689b;
                    float fE111119 = aVar1110.e();
                    float fE1111110 = aVar1110.e();
                    boolean z11113 = z13;
                    int i3111111111119 = i31;
                    androidx.compose.runtime.internal.c cVarE1110 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111110 = i13 >> 6;
                    int i31111111111111 = (i31111111111110 & com.planner5d.library.engine.input.f.b.B) | (i31111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111112 = i3111111111119 << 12;
                    androidx.compose.ui.a0 a0Var1113 = a0Var3;
                    p(function0, y3Var, fE111119, fE1111110, a0Var1113, q3Var3, j16, j15, ngVar3, jVar3, cVarE1110, c0Var2, i31111111111111 | (458752 & i31111111111112) | (3670016 & i31111111111112) | (29360128 & i31111111111112) | (234881024 & i31111111111112) | (i31111111111112 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11113;
                    a0Var2 = a0Var1113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.I(f14)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111116 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111116;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111117 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111117;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar1111 = androidx.compose.ui.unit.h.f42689b;
                    float fE1111111 = aVar1111.e();
                    float fE1111112 = aVar1111.e();
                    boolean z11114 = z13;
                    int i31111111111113 = i31;
                    androidx.compose.runtime.internal.c cVarE1111 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111114 = i13 >> 6;
                    int i31111111111115 = (i31111111111114 & com.planner5d.library.engine.input.f.b.B) | (i31111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111116 = i31111111111113 << 12;
                    androidx.compose.ui.a0 a0Var1114 = a0Var3;
                    p(function0, y3Var, fE1111111, fE1111112, a0Var1114, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111, c0Var2, i31111111111115 | (458752 & i31111111111116) | (3670016 & i31111111111116) | (29360128 & i31111111111116) | (234881024 & i31111111111116) | (i31111111111116 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11114;
                    a0Var2 = a0Var1114;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111118 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111118;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111119 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111119;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar1112 = androidx.compose.ui.unit.h.f42689b;
                float fE1111113 = aVar1112.e();
                float fE1111114 = aVar1112.e();
                boolean z11115 = z13;
                int i31111111111117 = i31;
                androidx.compose.runtime.internal.c cVarE1112 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i31111111111118 = i13 >> 6;
                int i31111111111119 = (i31111111111118 & com.planner5d.library.engine.input.f.b.B) | (i31111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i311111111111110 = i31111111111117 << 12;
                androidx.compose.ui.a0 a0Var1115 = a0Var3;
                p(function0, y3Var, fE1111113, fE1111114, a0Var1115, q3Var3, j16, j15, ngVar3, jVar3, cVarE1112, c0Var2, i31111111111119 | (458752 & i311111111111110) | (3670016 & i311111111111110) | (29360128 & i311111111111110) | (234881024 & i311111111111110) | (i311111111111110 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z11115;
                a0Var2 = a0Var1115;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        if ((i12 & 4) != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(function0)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            i15 = 1024;
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(y3Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = 8192;
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.I(f10)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                        f15 = f11;
                    } else {
                        f15 = f11;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.I(f15)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i12 & 128) != 0) {
                        if ((12582912 & i10) == 0) {
                            if (c0VarR.I(f13)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                        if ((i12 & 256) != 0) {
                            if ((100663296 & i10) == 0) {
                                if (c0VarR.I(f14)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i22;
                            }
                            i23 = i12 & 512;
                            if (i23 != 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c0VarR.D(a0Var)) {
                                    i24 = 536870912;
                                } else {
                                    i24 = 268435456;
                                }
                                i13 |= i24;
                            }
                            i25 = i12 & 1024;
                            if (i25 != 0) {
                                i26 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.G(z10)) {
                                    i27 = 4;
                                } else {
                                    i27 = 2;
                                }
                                i26 = i11 | i27;
                            } else {
                                i26 = i11;
                            }
                            if ((i11 & 48) != 0) {
                                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                            }
                            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                                if ((i12 & 4096) == 0) {
                                    i32 = 128;
                                } else {
                                    i32 = 128;
                                }
                                i26 |= i32;
                            }
                            if ((i11 & 3072) == 0) {
                                j12 = j11;
                                if ((i12 & 8192) == 0) {
                                    i15 = 2048;
                                }
                                i26 |= i15;
                            } else {
                                j12 = j11;
                            }
                            if ((i11 & 24576) != 0) {
                                if ((i12 & 16384) == 0) {
                                    i17 = 16384;
                                }
                                i26 |= i17;
                            }
                            i28 = i12 & 32768;
                            if (i28 != 0) {
                                i26 |= androidx.profileinstaller.n.c.f73814m;
                            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                            }
                            if ((i13 & 306783379) == 306783378) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (c0VarR.h(z11, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j111111110 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j111111110;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                } else {
                                    if (i23 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i25 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if ((i12 & 2048) != 0) {
                                        q3VarE = mg.f30614a.e(c0VarR, 6);
                                        i26 &= -113;
                                    } else {
                                        q3VarE = q3Var;
                                    }
                                    i29 = i26;
                                    if ((i12 & 4096) != 0) {
                                        i30 = i29 & (-897);
                                        jD = mg.f30614a.d(c0VarR, 6);
                                    } else {
                                        i30 = i29;
                                        jD = j10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                        i30 &= -7169;
                                    } else {
                                        jG = j11;
                                    }
                                    long j111111111 = jD;
                                    if ((i12 & 16384) != 0) {
                                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                        c0Var2 = c0VarR;
                                        i30 &= -57345;
                                    } else {
                                        c0Var2 = c0VarR;
                                        ngVarC = ngVar;
                                    }
                                    if (i28 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    j15 = jG;
                                    q3Var3 = q3VarE;
                                    j16 = j111111111;
                                    ngVar3 = ngVarC;
                                    i31 = i30;
                                }
                                c0Var2.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                }
                                androidx.compose.ui.unit.h.a aVar1113 = androidx.compose.ui.unit.h.f42689b;
                                float fE1111115 = aVar1113.e();
                                float fE1111116 = aVar1113.e();
                                boolean z11116 = z13;
                                int i311111111111111 = i31;
                                androidx.compose.runtime.internal.c cVarE1113 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                                int i311111111111112 = i13 >> 6;
                                int i311111111111113 = (i311111111111112 & com.planner5d.library.engine.input.f.b.B) | (i311111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                                int i311111111111114 = i311111111111111 << 12;
                                androidx.compose.ui.a0 a0Var1116 = a0Var3;
                                p(function0, y3Var, fE1111115, fE1111116, a0Var1116, q3Var3, j16, j15, ngVar3, jVar3, cVarE1113, c0Var2, i311111111111113 | (458752 & i311111111111114) | (3670016 & i311111111111114) | (29360128 & i311111111111114) | (234881024 & i311111111111114) | (i311111111111114 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                ngVar2 = ngVar3;
                                jVar2 = jVar3;
                                j14 = j15;
                                q3Var2 = q3Var3;
                                j13 = j16;
                                z12 = z11116;
                                a0Var2 = a0Var1116;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                z12 = z10;
                                q3Var2 = q3Var;
                                j13 = j10;
                                j14 = j11;
                                ngVar2 = ngVar;
                                jVar2 = jVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 100663296;
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111112 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111112;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111113 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111113;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar1114 = androidx.compose.ui.unit.h.f42689b;
                            float fE1111117 = aVar1114.e();
                            float fE1111118 = aVar1114.e();
                            boolean z11117 = z13;
                            int i311111111111115 = i31;
                            androidx.compose.runtime.internal.c cVarE1114 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111111111116 = i13 >> 6;
                            int i311111111111117 = (i311111111111116 & com.planner5d.library.engine.input.f.b.B) | (i311111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111111111118 = i311111111111115 << 12;
                            androidx.compose.ui.a0 a0Var1117 = a0Var3;
                            p(function0, y3Var, fE1111117, fE1111118, a0Var1117, q3Var3, j16, j15, ngVar3, jVar3, cVarE1114, c0Var2, i311111111111117 | (458752 & i311111111111118) | (3670016 & i311111111111118) | (29360128 & i311111111111118) | (234881024 & i311111111111118) | (i311111111111118 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z11117;
                            a0Var2 = a0Var1117;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 12582912;
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111114 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111114;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111115 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111115;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar1115 = androidx.compose.ui.unit.h.f42689b;
                            float fE1111119 = aVar1115.e();
                            float fE11111110 = aVar1115.e();
                            boolean z11118 = z13;
                            int i311111111111119 = i31;
                            androidx.compose.runtime.internal.c cVarE1115 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11118, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3111111111111110 = i13 >> 6;
                            int i3111111111111111 = (i3111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i3111111111111112 = i311111111111119 << 12;
                            androidx.compose.ui.a0 a0Var1118 = a0Var3;
                            p(function0, y3Var, fE1111119, fE11111110, a0Var1118, q3Var3, j16, j15, ngVar3, jVar3, cVarE1115, c0Var2, i3111111111111111 | (458752 & i3111111111111112) | (3670016 & i3111111111111112) | (29360128 & i3111111111111112) | (234881024 & i3111111111111112) | (i3111111111111112 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z11118;
                            a0Var2 = a0Var1118;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111116 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111116;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111117 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111117;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar1116 = androidx.compose.ui.unit.h.f42689b;
                        float fE11111111 = aVar1116.e();
                        float fE11111112 = aVar1116.e();
                        boolean z11119 = z13;
                        int i3111111111111113 = i31;
                        androidx.compose.runtime.internal.c cVarE1116 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11119, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111111111114 = i13 >> 6;
                        int i3111111111111115 = (i3111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111116 = i3111111111111113 << 12;
                        androidx.compose.ui.a0 a0Var1119 = a0Var3;
                        p(function0, y3Var, fE11111111, fE11111112, a0Var1119, q3Var3, j16, j15, ngVar3, jVar3, cVarE1116, c0Var2, i3111111111111115 | (458752 & i3111111111111116) | (3670016 & i3111111111111116) | (29360128 & i3111111111111116) | (234881024 & i3111111111111116) | (i3111111111111116 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z11119;
                        a0Var2 = a0Var1119;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111118 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111118;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111119 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111119;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar1117 = androidx.compose.ui.unit.h.f42689b;
                            float fE11111113 = aVar1117.e();
                            float fE11111114 = aVar1117.e();
                            boolean z111110 = z13;
                            int i3111111111111117 = i31;
                            androidx.compose.runtime.internal.c cVarE1117 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i3111111111111118 = i13 >> 6;
                            int i3111111111111119 = (i3111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i31111111111111110 = i3111111111111117 << 12;
                            androidx.compose.ui.a0 a0Var11110 = a0Var3;
                            p(function0, y3Var, fE11111113, fE11111114, a0Var11110, q3Var3, j16, j15, ngVar3, jVar3, cVarE1117, c0Var2, i3111111111111119 | (458752 & i31111111111111110) | (3670016 & i31111111111111110) | (29360128 & i31111111111111110) | (234881024 & i31111111111111110) | (i31111111111111110 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z111110;
                            a0Var2 = a0Var11110;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111110 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111110;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111111 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111111;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar1118 = androidx.compose.ui.unit.h.f42689b;
                        float fE11111115 = aVar1118.e();
                        float fE11111116 = aVar1118.e();
                        boolean z111111 = z13;
                        int i31111111111111111 = i31;
                        androidx.compose.runtime.internal.c cVarE1118 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111111111111112 = i13 >> 6;
                        int i31111111111111113 = (i31111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111111111114 = i31111111111111111 << 12;
                        androidx.compose.ui.a0 a0Var11111 = a0Var3;
                        p(function0, y3Var, fE11111115, fE11111116, a0Var11111, q3Var3, j16, j15, ngVar3, jVar3, cVarE1118, c0Var2, i31111111111111113 | (458752 & i31111111111111114) | (3670016 & i31111111111111114) | (29360128 & i31111111111111114) | (234881024 & i31111111111111114) | (i31111111111111114 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111111;
                        a0Var2 = a0Var11111;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111112 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111112;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111113 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111113;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar1119 = androidx.compose.ui.unit.h.f42689b;
                        float fE11111117 = aVar1119.e();
                        float fE11111118 = aVar1119.e();
                        boolean z111112 = z13;
                        int i31111111111111115 = i31;
                        androidx.compose.runtime.internal.c cVarE1119 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111111111111116 = i13 >> 6;
                        int i31111111111111117 = (i31111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111111111118 = i31111111111111115 << 12;
                        androidx.compose.ui.a0 a0Var11112 = a0Var3;
                        p(function0, y3Var, fE11111117, fE11111118, a0Var11112, q3Var3, j16, j15, ngVar3, jVar3, cVarE1119, c0Var2, i31111111111111117 | (458752 & i31111111111111118) | (3670016 & i31111111111111118) | (29360128 & i31111111111111118) | (234881024 & i31111111111111118) | (i31111111111111118 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111112;
                        a0Var2 = a0Var11112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111114 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111114;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111115 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111115;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar11110 = androidx.compose.ui.unit.h.f42689b;
                    float fE11111119 = aVar11110.e();
                    float fE111111110 = aVar11110.e();
                    boolean z111113 = z13;
                    int i31111111111111119 = i31;
                    androidx.compose.runtime.internal.c cVarE11110 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i311111111111111110 = i13 >> 6;
                    int i311111111111111111 = (i311111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i311111111111111112 = i31111111111111119 << 12;
                    androidx.compose.ui.a0 a0Var11113 = a0Var3;
                    p(function0, y3Var, fE11111119, fE111111110, a0Var11113, q3Var3, j16, j15, ngVar3, jVar3, cVarE11110, c0Var2, i311111111111111111 | (458752 & i311111111111111112) | (3670016 & i311111111111111112) | (29360128 & i311111111111111112) | (234881024 & i311111111111111112) | (i311111111111111112 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z111113;
                    a0Var2 = a0Var11113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            i17 = 8192;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1111111116 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1111111116;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j1111111117 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j1111111117;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar11111 = androidx.compose.ui.unit.h.f42689b;
                            float fE111111111 = aVar11111.e();
                            float fE111111112 = aVar11111.e();
                            boolean z111114 = z13;
                            int i311111111111111113 = i31;
                            androidx.compose.runtime.internal.c cVarE11111 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111111111111114 = i13 >> 6;
                            int i311111111111111115 = (i311111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111111111111116 = i311111111111111113 << 12;
                            androidx.compose.ui.a0 a0Var11114 = a0Var3;
                            p(function0, y3Var, fE111111111, fE111111112, a0Var11114, q3Var3, j16, j15, ngVar3, jVar3, cVarE11111, c0Var2, i311111111111111115 | (458752 & i311111111111111116) | (3670016 & i311111111111111116) | (29360128 & i311111111111111116) | (234881024 & i311111111111111116) | (i311111111111111116 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z111114;
                            a0Var2 = a0Var11114;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111118 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111118;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111119 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111119;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar11112 = androidx.compose.ui.unit.h.f42689b;
                        float fE111111113 = aVar11112.e();
                        float fE111111114 = aVar11112.e();
                        boolean z111115 = z13;
                        int i311111111111111117 = i31;
                        androidx.compose.runtime.internal.c cVarE11112 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i311111111111111118 = i13 >> 6;
                        int i311111111111111119 = (i311111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111111110 = i311111111111111117 << 12;
                        androidx.compose.ui.a0 a0Var11115 = a0Var3;
                        p(function0, y3Var, fE111111113, fE111111114, a0Var11115, q3Var3, j16, j15, ngVar3, jVar3, cVarE11112, c0Var2, i311111111111111119 | (458752 & i3111111111111111110) | (3670016 & i3111111111111111110) | (29360128 & i3111111111111111110) | (234881024 & i3111111111111111110) | (i3111111111111111110 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111115;
                        a0Var2 = a0Var11115;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111111110 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111111110;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111111111 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111111111;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar11113 = androidx.compose.ui.unit.h.f42689b;
                        float fE111111115 = aVar11113.e();
                        float fE111111116 = aVar11113.e();
                        boolean z111116 = z13;
                        int i3111111111111111111 = i31;
                        androidx.compose.runtime.internal.c cVarE11113 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111111111111112 = i13 >> 6;
                        int i3111111111111111113 = (i3111111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111111114 = i3111111111111111111 << 12;
                        androidx.compose.ui.a0 a0Var11116 = a0Var3;
                        p(function0, y3Var, fE111111115, fE111111116, a0Var11116, q3Var3, j16, j15, ngVar3, jVar3, cVarE11113, c0Var2, i3111111111111111113 | (458752 & i3111111111111111114) | (3670016 & i3111111111111111114) | (29360128 & i3111111111111111114) | (234881024 & i3111111111111111114) | (i3111111111111111114 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111116;
                        a0Var2 = a0Var11116;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111112 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111112;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111113 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111113;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar11114 = androidx.compose.ui.unit.h.f42689b;
                    float fE111111117 = aVar11114.e();
                    float fE111111118 = aVar11114.e();
                    boolean z111117 = z13;
                    int i3111111111111111115 = i31;
                    androidx.compose.runtime.internal.c cVarE11114 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i3111111111111111116 = i13 >> 6;
                    int i3111111111111111117 = (i3111111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i3111111111111111118 = i3111111111111111115 << 12;
                    androidx.compose.ui.a0 a0Var11117 = a0Var3;
                    p(function0, y3Var, fE111111117, fE111111118, a0Var11117, q3Var3, j16, j15, ngVar3, jVar3, cVarE11114, c0Var2, i3111111111111111117 | (458752 & i3111111111111111118) | (3670016 & i3111111111111111118) | (29360128 & i3111111111111111118) | (234881024 & i3111111111111111118) | (i3111111111111111118 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z111117;
                    a0Var2 = a0Var11117;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f15 = f11;
            } else {
                f15 = f11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i12 & 128) != 0) {
                if ((12582912 & i10) == 0) {
                    if (c0VarR.I(f13)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111111114 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111111114;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j11111111115 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j11111111115;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar11115 = androidx.compose.ui.unit.h.f42689b;
                        float fE111111119 = aVar11115.e();
                        float fE1111111110 = aVar11115.e();
                        boolean z111118 = z13;
                        int i3111111111111111119 = i31;
                        androidx.compose.runtime.internal.c cVarE11115 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111118, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111111111111111110 = i13 >> 6;
                        int i31111111111111111111 = (i31111111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111111111111112 = i3111111111111111119 << 12;
                        androidx.compose.ui.a0 a0Var11118 = a0Var3;
                        p(function0, y3Var, fE111111119, fE1111111110, a0Var11118, q3Var3, j16, j15, ngVar3, jVar3, cVarE11115, c0Var2, i31111111111111111111 | (458752 & i31111111111111111112) | (3670016 & i31111111111111111112) | (29360128 & i31111111111111111112) | (234881024 & i31111111111111111112) | (i31111111111111111112 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z111118;
                        a0Var2 = a0Var11118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111116 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111116;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111117 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111117;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar11116 = androidx.compose.ui.unit.h.f42689b;
                    float fE1111111111 = aVar11116.e();
                    float fE1111111112 = aVar11116.e();
                    boolean z111119 = z13;
                    int i31111111111111111113 = i31;
                    androidx.compose.runtime.internal.c cVarE11116 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z111119, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111111111114 = i13 >> 6;
                    int i31111111111111111115 = (i31111111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111111111116 = i31111111111111111113 << 12;
                    androidx.compose.ui.a0 a0Var11119 = a0Var3;
                    p(function0, y3Var, fE1111111111, fE1111111112, a0Var11119, q3Var3, j16, j15, ngVar3, jVar3, cVarE11116, c0Var2, i31111111111111111115 | (458752 & i31111111111111111116) | (3670016 & i31111111111111111116) | (29360128 & i31111111111111111116) | (234881024 & i31111111111111111116) | (i31111111111111111116 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z111119;
                    a0Var2 = a0Var11119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.I(f14)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111118 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111118;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111119 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111119;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar11117 = androidx.compose.ui.unit.h.f42689b;
                    float fE1111111113 = aVar11117.e();
                    float fE1111111114 = aVar11117.e();
                    boolean z1111110 = z13;
                    int i31111111111111111117 = i31;
                    androidx.compose.runtime.internal.c cVarE11117 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111111111118 = i13 >> 6;
                    int i31111111111111111119 = (i31111111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i311111111111111111110 = i31111111111111111117 << 12;
                    androidx.compose.ui.a0 a0Var111110 = a0Var3;
                    p(function0, y3Var, fE1111111113, fE1111111114, a0Var111110, q3Var3, j16, j15, ngVar3, jVar3, cVarE11117, c0Var2, i31111111111111111119 | (458752 & i311111111111111111110) | (3670016 & i311111111111111111110) | (29360128 & i311111111111111111110) | (234881024 & i311111111111111111110) | (i311111111111111111110 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z1111110;
                    a0Var2 = a0Var111110;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j111111111110 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j111111111110;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j111111111111 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j111111111111;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar11118 = androidx.compose.ui.unit.h.f42689b;
                float fE1111111115 = aVar11118.e();
                float fE1111111116 = aVar11118.e();
                boolean z1111111 = z13;
                int i311111111111111111111 = i31;
                androidx.compose.runtime.internal.c cVarE11118 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i311111111111111111112 = i13 >> 6;
                int i311111111111111111113 = (i311111111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i311111111111111111114 = i311111111111111111111 << 12;
                androidx.compose.ui.a0 a0Var111111 = a0Var3;
                p(function0, y3Var, fE1111111115, fE1111111116, a0Var111111, q3Var3, j16, j15, ngVar3, jVar3, cVarE11118, c0Var2, i311111111111111111113 | (458752 & i311111111111111111114) | (3670016 & i311111111111111111114) | (29360128 & i311111111111111111114) | (234881024 & i311111111111111111114) | (i311111111111111111114 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z1111111;
                a0Var2 = a0Var111111;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        i15 = 1024;
        if ((i12 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(y3Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = 8192;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.I(f10)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f15 = f11;
                } else {
                    f15 = f11;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f15)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i12 & 128) != 0) {
                    if ((12582912 & i10) == 0) {
                        if (c0VarR.I(f13)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((100663296 & i10) == 0) {
                            if (c0VarR.I(f14)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i22;
                        }
                        i23 = i12 & 512;
                        if (i23 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(a0Var)) {
                                i24 = 536870912;
                            } else {
                                i24 = 268435456;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 1024;
                        if (i25 != 0) {
                            i26 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.G(z10)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i11 | i27;
                        } else {
                            i26 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                        }
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if ((i12 & 4096) == 0) {
                                i32 = 128;
                            } else {
                                i32 = 128;
                            }
                            i26 |= i32;
                        }
                        if ((i11 & 3072) == 0) {
                            j12 = j11;
                            if ((i12 & 8192) == 0) {
                                i15 = 2048;
                            }
                            i26 |= i15;
                        } else {
                            j12 = j11;
                        }
                        if ((i11 & 24576) != 0) {
                            if ((i12 & 16384) == 0) {
                                i17 = 16384;
                            }
                            i26 |= i17;
                        }
                        i28 = i12 & 32768;
                        if (i28 != 0) {
                            i26 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c0VarR.h(z11, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111111112 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111111112;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            } else {
                                if (i23 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i25 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if ((i12 & 2048) != 0) {
                                    q3VarE = mg.f30614a.e(c0VarR, 6);
                                    i26 &= -113;
                                } else {
                                    q3VarE = q3Var;
                                }
                                i29 = i26;
                                if ((i12 & 4096) != 0) {
                                    i30 = i29 & (-897);
                                    jD = mg.f30614a.d(c0VarR, 6);
                                } else {
                                    i30 = i29;
                                    jD = j10;
                                }
                                if ((i12 & 8192) != 0) {
                                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                    i30 &= -7169;
                                } else {
                                    jG = j11;
                                }
                                long j111111111113 = jD;
                                if ((i12 & 16384) != 0) {
                                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                    c0Var2 = c0VarR;
                                    i30 &= -57345;
                                } else {
                                    c0Var2 = c0VarR;
                                    ngVarC = ngVar;
                                }
                                if (i28 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                j15 = jG;
                                q3Var3 = q3VarE;
                                j16 = j111111111113;
                                ngVar3 = ngVarC;
                                i31 = i30;
                            }
                            c0Var2.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                            }
                            androidx.compose.ui.unit.h.a aVar11119 = androidx.compose.ui.unit.h.f42689b;
                            float fE1111111117 = aVar11119.e();
                            float fE1111111118 = aVar11119.e();
                            boolean z1111112 = z13;
                            int i311111111111111111115 = i31;
                            androidx.compose.runtime.internal.c cVarE11119 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                            int i311111111111111111116 = i13 >> 6;
                            int i311111111111111111117 = (i311111111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                            int i311111111111111111118 = i311111111111111111115 << 12;
                            androidx.compose.ui.a0 a0Var111112 = a0Var3;
                            p(function0, y3Var, fE1111111117, fE1111111118, a0Var111112, q3Var3, j16, j15, ngVar3, jVar3, cVarE11119, c0Var2, i311111111111111111117 | (458752 & i311111111111111111118) | (3670016 & i311111111111111111118) | (29360128 & i311111111111111111118) | (234881024 & i311111111111111111118) | (i311111111111111111118 & 1879048192), 6, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            ngVar2 = ngVar3;
                            jVar2 = jVar3;
                            j14 = j15;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            z12 = z1111112;
                            a0Var2 = a0Var111112;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            q3Var2 = q3Var;
                            j13 = j10;
                            j14 = j11;
                            ngVar2 = ngVar;
                            jVar2 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111111114 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111111114;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111111115 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111111115;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar111110 = androidx.compose.ui.unit.h.f42689b;
                        float fE1111111119 = aVar111110.e();
                        float fE11111111110 = aVar111110.e();
                        boolean z1111113 = z13;
                        int i311111111111111111119 = i31;
                        androidx.compose.runtime.internal.c cVarE111110 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111111111111111110 = i13 >> 6;
                        int i3111111111111111111111 = (i3111111111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111111111112 = i311111111111111111119 << 12;
                        androidx.compose.ui.a0 a0Var111113 = a0Var3;
                        p(function0, y3Var, fE1111111119, fE11111111110, a0Var111113, q3Var3, j16, j15, ngVar3, jVar3, cVarE111110, c0Var2, i3111111111111111111111 | (458752 & i3111111111111111111112) | (3670016 & i3111111111111111111112) | (29360128 & i3111111111111111111112) | (234881024 & i3111111111111111111112) | (i3111111111111111111112 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1111113;
                        a0Var2 = a0Var111113;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111111116 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111111116;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j111111111117 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j111111111117;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar111111 = androidx.compose.ui.unit.h.f42689b;
                        float fE11111111111 = aVar111111.e();
                        float fE11111111112 = aVar111111.e();
                        boolean z1111114 = z13;
                        int i3111111111111111111113 = i31;
                        androidx.compose.runtime.internal.c cVarE111111 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i3111111111111111111114 = i13 >> 6;
                        int i3111111111111111111115 = (i3111111111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111111111116 = i3111111111111111111113 << 12;
                        androidx.compose.ui.a0 a0Var111114 = a0Var3;
                        p(function0, y3Var, fE11111111111, fE11111111112, a0Var111114, q3Var3, j16, j15, ngVar3, jVar3, cVarE111111, c0Var2, i3111111111111111111115 | (458752 & i3111111111111111111116) | (3670016 & i3111111111111111111116) | (29360128 & i3111111111111111111116) | (234881024 & i3111111111111111111116) | (i3111111111111111111116 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1111114;
                        a0Var2 = a0Var111114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j111111111118 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j111111111118;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j111111111119 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j111111111119;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar111112 = androidx.compose.ui.unit.h.f42689b;
                    float fE11111111113 = aVar111112.e();
                    float fE11111111114 = aVar111112.e();
                    boolean z1111115 = z13;
                    int i3111111111111111111117 = i31;
                    androidx.compose.runtime.internal.c cVarE111112 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i3111111111111111111118 = i13 >> 6;
                    int i3111111111111111111119 = (i3111111111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111111111111110 = i3111111111111111111117 << 12;
                    androidx.compose.ui.a0 a0Var111115 = a0Var3;
                    p(function0, y3Var, fE11111111113, fE11111111114, a0Var111115, q3Var3, j16, j15, ngVar3, jVar3, cVarE111112, c0Var2, i3111111111111111111119 | (458752 & i31111111111111111111110) | (3670016 & i31111111111111111111110) | (29360128 & i31111111111111111111110) | (234881024 & i31111111111111111111110) | (i31111111111111111111110 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z1111115;
                    a0Var2 = a0Var111115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f15 = f11;
            } else {
                f15 = f11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i12 & 128) != 0) {
                if ((12582912 & i10) == 0) {
                    if (c0VarR.I(f13)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111111110 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111111110;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111111111 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111111111;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar111113 = androidx.compose.ui.unit.h.f42689b;
                        float fE11111111115 = aVar111113.e();
                        float fE11111111116 = aVar111113.e();
                        boolean z1111116 = z13;
                        int i31111111111111111111111 = i31;
                        androidx.compose.runtime.internal.c cVarE111113 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i31111111111111111111112 = i13 >> 6;
                        int i31111111111111111111113 = (i31111111111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i31111111111111111111114 = i31111111111111111111111 << 12;
                        androidx.compose.ui.a0 a0Var111116 = a0Var3;
                        p(function0, y3Var, fE11111111115, fE11111111116, a0Var111116, q3Var3, j16, j15, ngVar3, jVar3, cVarE111113, c0Var2, i31111111111111111111113 | (458752 & i31111111111111111111114) | (3670016 & i31111111111111111111114) | (29360128 & i31111111111111111111114) | (234881024 & i31111111111111111111114) | (i31111111111111111111114 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z1111116;
                        a0Var2 = a0Var111116;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111111112 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111111112;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111111113 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111111113;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar111114 = androidx.compose.ui.unit.h.f42689b;
                    float fE11111111117 = aVar111114.e();
                    float fE11111111118 = aVar111114.e();
                    boolean z1111117 = z13;
                    int i31111111111111111111115 = i31;
                    androidx.compose.runtime.internal.c cVarE111114 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111111111111116 = i13 >> 6;
                    int i31111111111111111111117 = (i31111111111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111111111111118 = i31111111111111111111115 << 12;
                    androidx.compose.ui.a0 a0Var111117 = a0Var3;
                    p(function0, y3Var, fE11111111117, fE11111111118, a0Var111117, q3Var3, j16, j15, ngVar3, jVar3, cVarE111114, c0Var2, i31111111111111111111117 | (458752 & i31111111111111111111118) | (3670016 & i31111111111111111111118) | (29360128 & i31111111111111111111118) | (234881024 & i31111111111111111111118) | (i31111111111111111111118 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z1111117;
                    a0Var2 = a0Var111117;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.I(f14)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111111114 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111111114;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j1111111111115 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j1111111111115;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar111115 = androidx.compose.ui.unit.h.f42689b;
                    float fE11111111119 = aVar111115.e();
                    float fE111111111110 = aVar111115.e();
                    boolean z1111118 = z13;
                    int i31111111111111111111119 = i31;
                    androidx.compose.runtime.internal.c cVarE111115 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111118, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i311111111111111111111110 = i13 >> 6;
                    int i311111111111111111111111 = (i311111111111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i311111111111111111111112 = i31111111111111111111119 << 12;
                    androidx.compose.ui.a0 a0Var111118 = a0Var3;
                    p(function0, y3Var, fE11111111119, fE111111111110, a0Var111118, q3Var3, j16, j15, ngVar3, jVar3, cVarE111115, c0Var2, i311111111111111111111111 | (458752 & i311111111111111111111112) | (3670016 & i311111111111111111111112) | (29360128 & i311111111111111111111112) | (234881024 & i311111111111111111111112) | (i311111111111111111111112 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z1111118;
                    a0Var2 = a0Var111118;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j1111111111116 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j1111111111116;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j1111111111117 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j1111111111117;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar111116 = androidx.compose.ui.unit.h.f42689b;
                float fE111111111111 = aVar111116.e();
                float fE111111111112 = aVar111116.e();
                boolean z1111119 = z13;
                int i311111111111111111111113 = i31;
                androidx.compose.runtime.internal.c cVarE111116 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z1111119, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i311111111111111111111114 = i13 >> 6;
                int i311111111111111111111115 = (i311111111111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i311111111111111111111116 = i311111111111111111111113 << 12;
                androidx.compose.ui.a0 a0Var111119 = a0Var3;
                p(function0, y3Var, fE111111111111, fE111111111112, a0Var111119, q3Var3, j16, j15, ngVar3, jVar3, cVarE111116, c0Var2, i311111111111111111111115 | (458752 & i311111111111111111111116) | (3670016 & i311111111111111111111116) | (29360128 & i311111111111111111111116) | (234881024 & i311111111111111111111116) | (i311111111111111111111116 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z1111119;
                a0Var2 = a0Var111119;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        i17 = 8192;
        if ((i12 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.I(f10)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i13 |= i18;
            }
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f15 = f11;
            } else {
                f15 = f11;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i12 & 128) != 0) {
                if ((12582912 & i10) == 0) {
                    if (c0VarR.I(f13)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c0VarR.I(f14)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(a0Var)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.G(z10)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                    }
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if ((i12 & 4096) == 0) {
                            i32 = 128;
                        } else {
                            i32 = 128;
                        }
                        i26 |= i32;
                    }
                    if ((i11 & 3072) == 0) {
                        j12 = j11;
                        if ((i12 & 8192) == 0) {
                            i15 = 2048;
                        }
                        i26 |= i15;
                    } else {
                        j12 = j11;
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16384) == 0) {
                            i17 = 16384;
                        }
                        i26 |= i17;
                    }
                    i28 = i12 & 32768;
                    if (i28 != 0) {
                        i26 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111111118 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111111118;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        } else {
                            if (i23 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i25 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if ((i12 & 2048) != 0) {
                                q3VarE = mg.f30614a.e(c0VarR, 6);
                                i26 &= -113;
                            } else {
                                q3VarE = q3Var;
                            }
                            i29 = i26;
                            if ((i12 & 4096) != 0) {
                                i30 = i29 & (-897);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i30 = i29;
                                jD = j10;
                            }
                            if ((i12 & 8192) != 0) {
                                jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                                i30 &= -7169;
                            } else {
                                jG = j11;
                            }
                            long j1111111111119 = jD;
                            if ((i12 & 16384) != 0) {
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                c0Var2 = c0VarR;
                                i30 &= -57345;
                            } else {
                                c0Var2 = c0VarR;
                                ngVarC = ngVar;
                            }
                            if (i28 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            j15 = jG;
                            q3Var3 = q3VarE;
                            j16 = j1111111111119;
                            ngVar3 = ngVarC;
                            i31 = i30;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                        }
                        androidx.compose.ui.unit.h.a aVar111117 = androidx.compose.ui.unit.h.f42689b;
                        float fE111111111113 = aVar111117.e();
                        float fE111111111114 = aVar111117.e();
                        boolean z11111110 = z13;
                        int i311111111111111111111117 = i31;
                        androidx.compose.runtime.internal.c cVarE111117 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111110, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                        int i311111111111111111111118 = i13 >> 6;
                        int i311111111111111111111119 = (i311111111111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                        int i3111111111111111111111110 = i311111111111111111111117 << 12;
                        androidx.compose.ui.a0 a0Var1111110 = a0Var3;
                        p(function0, y3Var, fE111111111113, fE111111111114, a0Var1111110, q3Var3, j16, j15, ngVar3, jVar3, cVarE111117, c0Var2, i311111111111111111111119 | (458752 & i3111111111111111111111110) | (3670016 & i3111111111111111111111110) | (29360128 & i3111111111111111111111110) | (234881024 & i3111111111111111111111110) | (i3111111111111111111111110 & 1879048192), 6, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        ngVar2 = ngVar3;
                        jVar2 = jVar3;
                        j14 = j15;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        z12 = z11111110;
                        a0Var2 = a0Var1111110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        q3Var2 = q3Var;
                        j13 = j10;
                        j14 = j11;
                        ngVar2 = ngVar;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111110 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111110;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111111 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111111;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar111118 = androidx.compose.ui.unit.h.f42689b;
                    float fE111111111115 = aVar111118.e();
                    float fE111111111116 = aVar111118.e();
                    boolean z11111111 = z13;
                    int i3111111111111111111111111 = i31;
                    androidx.compose.runtime.internal.c cVarE111118 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111111, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i3111111111111111111111112 = i13 >> 6;
                    int i3111111111111111111111113 = (i3111111111111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i3111111111111111111111114 = i3111111111111111111111111 << 12;
                    androidx.compose.ui.a0 a0Var1111111 = a0Var3;
                    p(function0, y3Var, fE111111111115, fE111111111116, a0Var1111111, q3Var3, j16, j15, ngVar3, jVar3, cVarE111118, c0Var2, i3111111111111111111111113 | (458752 & i3111111111111111111111114) | (3670016 & i3111111111111111111111114) | (29360128 & i3111111111111111111111114) | (234881024 & i3111111111111111111111114) | (i3111111111111111111111114 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11111111;
                    a0Var2 = a0Var1111111;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.I(f14)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111112 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111112;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111113 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111113;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar111119 = androidx.compose.ui.unit.h.f42689b;
                    float fE111111111117 = aVar111119.e();
                    float fE111111111118 = aVar111119.e();
                    boolean z11111112 = z13;
                    int i3111111111111111111111115 = i31;
                    androidx.compose.runtime.internal.c cVarE111119 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111112, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i3111111111111111111111116 = i13 >> 6;
                    int i3111111111111111111111117 = (i3111111111111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i3111111111111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i3111111111111111111111118 = i3111111111111111111111115 << 12;
                    androidx.compose.ui.a0 a0Var1111112 = a0Var3;
                    p(function0, y3Var, fE111111111117, fE111111111118, a0Var1111112, q3Var3, j16, j15, ngVar3, jVar3, cVarE111119, c0Var2, i3111111111111111111111117 | (458752 & i3111111111111111111111118) | (3670016 & i3111111111111111111111118) | (29360128 & i3111111111111111111111118) | (234881024 & i3111111111111111111111118) | (i3111111111111111111111118 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11111112;
                    a0Var2 = a0Var1111112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111111111114 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111111111114;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111111111115 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111111111115;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar1111110 = androidx.compose.ui.unit.h.f42689b;
                float fE111111111119 = aVar1111110.e();
                float fE1111111111110 = aVar1111110.e();
                boolean z11111113 = z13;
                int i3111111111111111111111119 = i31;
                androidx.compose.runtime.internal.c cVarE1111110 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111113, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i31111111111111111111111110 = i13 >> 6;
                int i31111111111111111111111111 = (i31111111111111111111111110 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111111111110 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i31111111111111111111111112 = i3111111111111111111111119 << 12;
                androidx.compose.ui.a0 a0Var1111113 = a0Var3;
                p(function0, y3Var, fE111111111119, fE1111111111110, a0Var1111113, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111110, c0Var2, i31111111111111111111111111 | (458752 & i31111111111111111111111112) | (3670016 & i31111111111111111111111112) | (29360128 & i31111111111111111111111112) | (234881024 & i31111111111111111111111112) | (i31111111111111111111111112 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z11111113;
                a0Var2 = a0Var1111113;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        if ((i12 & 32) != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            f15 = f11;
        } else {
            f15 = f11;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.I(f15)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.I(f12)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i13 |= i20;
        }
        if ((i12 & 128) != 0) {
            if ((12582912 & i10) == 0) {
                if (c0VarR.I(f13)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            if ((i12 & 256) != 0) {
                if ((100663296 & i10) == 0) {
                    if (c0VarR.I(f14)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(a0Var)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.G(z10)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 48) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
                }
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if ((i12 & 4096) == 0) {
                        i32 = 128;
                    } else {
                        i32 = 128;
                    }
                    i26 |= i32;
                }
                if ((i11 & 3072) == 0) {
                    j12 = j11;
                    if ((i12 & 8192) == 0) {
                        i15 = 2048;
                    }
                    i26 |= i15;
                } else {
                    j12 = j11;
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 16384) == 0) {
                        i17 = 16384;
                    }
                    i26 |= i17;
                }
                i28 = i12 & 32768;
                if (i28 != 0) {
                    i26 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i26 |= c0VarR.D(jVar) ? 131072 : 65536;
                }
                if ((i13 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111116 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111116;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    } else {
                        if (i23 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i25 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if ((i12 & 2048) != 0) {
                            q3VarE = mg.f30614a.e(c0VarR, 6);
                            i26 &= -113;
                        } else {
                            q3VarE = q3Var;
                        }
                        i29 = i26;
                        if ((i12 & 4096) != 0) {
                            i30 = i29 & (-897);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i30 = i29;
                            jD = j10;
                        }
                        if ((i12 & 8192) != 0) {
                            jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                            i30 &= -7169;
                        } else {
                            jG = j11;
                        }
                        long j11111111111117 = jD;
                        if ((i12 & 16384) != 0) {
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var2 = c0VarR;
                            i30 &= -57345;
                        } else {
                            c0Var2 = c0VarR;
                            ngVarC = ngVar;
                        }
                        if (i28 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        j15 = jG;
                        q3Var3 = q3VarE;
                        j16 = j11111111111117;
                        ngVar3 = ngVarC;
                        i31 = i30;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                    }
                    androidx.compose.ui.unit.h.a aVar1111111 = androidx.compose.ui.unit.h.f42689b;
                    float fE1111111111111 = aVar1111111.e();
                    float fE1111111111112 = aVar1111111.e();
                    boolean z11111114 = z13;
                    int i31111111111111111111111113 = i31;
                    androidx.compose.runtime.internal.c cVarE1111111 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111114, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                    int i31111111111111111111111114 = i13 >> 6;
                    int i31111111111111111111111115 = (i31111111111111111111111114 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111111111114 & 14) | 3456 | ((i13 >> 15) & 57344);
                    int i31111111111111111111111116 = i31111111111111111111111113 << 12;
                    androidx.compose.ui.a0 a0Var1111114 = a0Var3;
                    p(function0, y3Var, fE1111111111111, fE1111111111112, a0Var1111114, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111111, c0Var2, i31111111111111111111111115 | (458752 & i31111111111111111111111116) | (3670016 & i31111111111111111111111116) | (29360128 & i31111111111111111111111116) | (234881024 & i31111111111111111111111116) | (i31111111111111111111111116 & 1879048192), 6, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVar3;
                    jVar2 = jVar3;
                    j14 = j15;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    z12 = z11111114;
                    a0Var2 = a0Var1111114;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    q3Var2 = q3Var;
                    j13 = j10;
                    j14 = j11;
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111111111118 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111111111118;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j11111111111119 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j11111111111119;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar1111112 = androidx.compose.ui.unit.h.f42689b;
                float fE1111111111113 = aVar1111112.e();
                float fE1111111111114 = aVar1111112.e();
                boolean z11111115 = z13;
                int i31111111111111111111111117 = i31;
                androidx.compose.runtime.internal.c cVarE1111112 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111115, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i31111111111111111111111118 = i13 >> 6;
                int i31111111111111111111111119 = (i31111111111111111111111118 & com.planner5d.library.engine.input.f.b.B) | (i31111111111111111111111118 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i311111111111111111111111110 = i31111111111111111111111117 << 12;
                androidx.compose.ui.a0 a0Var1111115 = a0Var3;
                p(function0, y3Var, fE1111111111113, fE1111111111114, a0Var1111115, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111112, c0Var2, i31111111111111111111111119 | (458752 & i311111111111111111111111110) | (3670016 & i311111111111111111111111110) | (29360128 & i311111111111111111111111110) | (234881024 & i311111111111111111111111110) | (i311111111111111111111111110 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z11111115;
                a0Var2 = a0Var1111115;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 12582912;
        if ((i12 & 256) != 0) {
            if ((100663296 & i10) == 0) {
                if (c0VarR.I(f14)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(a0Var)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.G(z10)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 48) != 0) {
                i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if ((i12 & 4096) == 0) {
                    i32 = 128;
                } else {
                    i32 = 128;
                }
                i26 |= i32;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8192) == 0) {
                    i15 = 2048;
                }
                i26 |= i15;
            } else {
                j12 = j11;
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 16384) == 0) {
                    i17 = 16384;
                }
                i26 |= i17;
            }
            i28 = i12 & 32768;
            if (i28 != 0) {
                i26 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i26 |= c0VarR.D(jVar) ? 131072 : 65536;
            }
            if ((i13 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j111111111111110 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j111111111111110;
                    ngVar3 = ngVarC;
                    i31 = i30;
                } else {
                    if (i23 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i25 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if ((i12 & 2048) != 0) {
                        q3VarE = mg.f30614a.e(c0VarR, 6);
                        i26 &= -113;
                    } else {
                        q3VarE = q3Var;
                    }
                    i29 = i26;
                    if ((i12 & 4096) != 0) {
                        i30 = i29 & (-897);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i30 = i29;
                        jD = j10;
                    }
                    if ((i12 & 8192) != 0) {
                        jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                        i30 &= -7169;
                    } else {
                        jG = j11;
                    }
                    long j111111111111111 = jD;
                    if ((i12 & 16384) != 0) {
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var2 = c0VarR;
                        i30 &= -57345;
                    } else {
                        c0Var2 = c0VarR;
                        ngVarC = ngVar;
                    }
                    if (i28 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    j15 = jG;
                    q3Var3 = q3VarE;
                    j16 = j111111111111111;
                    ngVar3 = ngVarC;
                    i31 = i30;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                }
                androidx.compose.ui.unit.h.a aVar1111113 = androidx.compose.ui.unit.h.f42689b;
                float fE1111111111115 = aVar1111113.e();
                float fE1111111111116 = aVar1111113.e();
                boolean z11111116 = z13;
                int i311111111111111111111111111 = i31;
                androidx.compose.runtime.internal.c cVarE1111113 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111116, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
                int i311111111111111111111111112 = i13 >> 6;
                int i311111111111111111111111113 = (i311111111111111111111111112 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111111111112 & 14) | 3456 | ((i13 >> 15) & 57344);
                int i311111111111111111111111114 = i311111111111111111111111111 << 12;
                androidx.compose.ui.a0 a0Var1111116 = a0Var3;
                p(function0, y3Var, fE1111111111115, fE1111111111116, a0Var1111116, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111113, c0Var2, i311111111111111111111111113 | (458752 & i311111111111111111111111114) | (3670016 & i311111111111111111111111114) | (29360128 & i311111111111111111111111114) | (234881024 & i311111111111111111111111114) | (i311111111111111111111111114 & 1879048192), 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVar3;
                jVar2 = jVar3;
                j14 = j15;
                q3Var2 = q3Var3;
                j13 = j16;
                z12 = z11111116;
                a0Var2 = a0Var1111116;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                z12 = z10;
                q3Var2 = q3Var;
                j13 = j10;
                j14 = j11;
                ngVar2 = ngVar;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.D(a0Var)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.G(z10)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        if ((i11 & 48) != 0) {
            i26 |= ((i12 & 2048) == 0 || !c0VarR.D(q3Var)) ? 16 : 32;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
            if ((i12 & 4096) == 0) {
                i32 = 128;
            } else {
                i32 = 128;
            }
            i26 |= i32;
        }
        if ((i11 & 3072) == 0) {
            j12 = j11;
            if ((i12 & 8192) == 0) {
                i15 = 2048;
            }
            i26 |= i15;
        } else {
            j12 = j11;
        }
        if ((i11 & 24576) != 0) {
            if ((i12 & 16384) == 0) {
                i17 = 16384;
            }
            i26 |= i17;
        }
        i28 = i12 & 32768;
        if (i28 != 0) {
            i26 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i26 |= c0VarR.D(jVar) ? 131072 : 65536;
        }
        if ((i13 & 306783379) == 306783378) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i25 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i12 & 2048) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i26 &= -113;
                } else {
                    q3VarE = q3Var;
                }
                i29 = i26;
                if ((i12 & 4096) != 0) {
                    i30 = i29 & (-897);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i30 = i29;
                    jD = j10;
                }
                if ((i12 & 8192) != 0) {
                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                    i30 &= -7169;
                } else {
                    jG = j11;
                }
                long j111111111111112 = jD;
                if ((i12 & 16384) != 0) {
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    c0Var2 = c0VarR;
                    i30 &= -57345;
                } else {
                    c0Var2 = c0VarR;
                    ngVarC = ngVar;
                }
                if (i28 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                j15 = jG;
                q3Var3 = q3VarE;
                j16 = j111111111111112;
                ngVar3 = ngVarC;
                i31 = i30;
            } else {
                if (i23 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i25 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if ((i12 & 2048) != 0) {
                    q3VarE = mg.f30614a.e(c0VarR, 6);
                    i26 &= -113;
                } else {
                    q3VarE = q3Var;
                }
                i29 = i26;
                if ((i12 & 4096) != 0) {
                    i30 = i29 & (-897);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i30 = i29;
                    jD = j10;
                }
                if ((i12 & 8192) != 0) {
                    jG = o6.g(jD, c0VarR, (i30 >> 6) & 14);
                    i30 &= -7169;
                } else {
                    jG = j11;
                }
                long j111111111111113 = jD;
                if ((i12 & 16384) != 0) {
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    c0Var2 = c0VarR;
                    i30 &= -57345;
                } else {
                    c0Var2 = c0VarR;
                    ngVarC = ngVar;
                }
                if (i28 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                j15 = jG;
                q3Var3 = q3VarE;
                j16 = j111111111111113;
                ngVar3 = ngVarC;
                i31 = i30;
            }
            c0Var2.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(193103278, i13, i31, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
            }
            androidx.compose.ui.unit.h.a aVar1111114 = androidx.compose.ui.unit.h.f42689b;
            float fE1111111111117 = aVar1111114.e();
            float fE1111111111118 = aVar1111114.e();
            boolean z11111117 = z13;
            int i311111111111111111111111115 = i31;
            androidx.compose.runtime.internal.c cVarE1111114 = androidx.compose.runtime.internal.w.e(-827388388, true, new c(z11111117, f10, f15, f12, f13, function3, f14, function2), c0Var2, 54);
            int i311111111111111111111111116 = i13 >> 6;
            int i311111111111111111111111117 = (i311111111111111111111111116 & com.planner5d.library.engine.input.f.b.B) | (i311111111111111111111111116 & 14) | 3456 | ((i13 >> 15) & 57344);
            int i311111111111111111111111118 = i311111111111111111111111115 << 12;
            androidx.compose.ui.a0 a0Var1111117 = a0Var3;
            p(function0, y3Var, fE1111111111117, fE1111111111118, a0Var1111117, q3Var3, j16, j15, ngVar3, jVar3, cVarE1111114, c0Var2, i311111111111111111111111117 | (458752 & i311111111111111111111111118) | (3670016 & i311111111111111111111111118) | (29360128 & i311111111111111111111111118) | (234881024 & i311111111111111111111111118) | (i311111111111111111111111118 & 1879048192), 6, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            ngVar2 = ngVar3;
            jVar2 = jVar3;
            j14 = j15;
            q3Var2 = q3Var3;
            j13 = j16;
            z12 = z11111117;
            a0Var2 = a0Var1111117;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            z12 = z10;
            q3Var2 = q3Var;
            j13 = j10;
            j14 = j11;
            ngVar2 = ngVar;
            jVar2 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.n(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var2, z12, q3Var2, j13, j14, ngVar2, jVar2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function2 function2, Function2 function3, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(function2, function3, function0, a0Var, z10, q3Var, j10, j11, ngVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(function0, a0Var, q3Var, j10, j11, ngVar, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function2 function2, Function2 function3, Function0 function0, androidx.compose.ui.text.y3 y3Var, float f10, float f11, float f12, float f13, float f14, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        k(function2, function3, function0, y3Var, f10, f11, f12, f13, f14, a0Var, z10, q3Var, j10, j11, ngVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x022a  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void o(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable ng ngVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j12;
        long j13;
        ng ngVarC;
        int i13;
        androidx.compose.foundation.interaction.j jVar2;
        int i14;
        int i15;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final ng ngVar2;
        final long j14;
        final long j15;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jD;
        int i16;
        int i17;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.ui.graphics.q3 q3Var4;
        long j16;
        long j17;
        int i18;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(748201188);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    q3Var2 = q3Var;
                    int i21 = c0VarR.D(q3Var2) ? 256 : 128;
                    i12 |= i21;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i21;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 3072) == 0) {
                j12 = j10;
                if ((i11 & 8) == 0 || !c0VarR.L(j12)) {
                    i19 = 1024;
                } else {
                    i19 = 2048;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                j13 = j11;
                if ((i11 & 16) == 0 || !c0VarR.L(j13)) {
                    i18 = 8192;
                } else {
                    i18 = 16384;
                }
                i12 |= i18;
            } else {
                j13 = j11;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    ngVarC = ngVar;
                    int i22 = c0VarR.D(ngVarC) ? 131072 : 65536;
                    i12 |= i22;
                } else {
                    ngVarC = ngVar;
                }
                i12 |= i22;
            } else {
                ngVarC = ngVar;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i12 |= i15;
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
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                q3VarH = mg.f30614a.h(c0VarR, 6);
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i11 & 8) != 0) {
                                jD = mg.f30614a.d(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                jD = j12;
                            }
                            if ((i11 & 16) != 0) {
                                long jG = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                                i12 &= -57345;
                                j13 = jG;
                            }
                            i16 = i12;
                            if ((i11 & 32) != 0) {
                                i17 = 6;
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                i12 = i16 & (-458753);
                            } else {
                                i17 = 6;
                                i12 = i16;
                            }
                            if (i13 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            q3Var4 = q3VarH;
                            j16 = jD;
                            j17 = j13;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = 6;
                            a0Var4 = a0Var2;
                            q3Var4 = q3Var2;
                            ngVarC = ngVarC;
                            j16 = j12;
                            j17 = j13;
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                        }
                        androidx.compose.ui.text.y3 y3VarE = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                        d0.k0 k0Var = d0.k0.f268351a;
                        int i23 = i12 << 9;
                        p(function1, y3VarE, k0Var.c(), k0Var.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), (i12 >> 21) & 14, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        q3Var3 = q3Var4;
                        j14 = j16;
                        j15 = j17;
                        ngVar2 = ngVarC;
                        jVar3 = jVar4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        q3Var3 = q3Var2;
                        ngVar2 = ngVarC;
                        j14 = j12;
                        j15 = j13;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG2 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG2;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG3 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG3;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    androidx.compose.ui.text.y3 y3VarE2 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                    d0.k0 k0Var2 = d0.k0.f268351a;
                    int i24 = i12 << 9;
                    p(function1, y3VarE2, k0Var2.c(), k0Var2.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), (i12 >> 21) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    q3Var3 = q3Var4;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
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
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG4 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG4;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG5 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG5;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    androidx.compose.ui.text.y3 y3VarE3 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                    d0.k0 k0Var3 = d0.k0.f268351a;
                    int i25 = i12 << 9;
                    p(function1, y3VarE3, k0Var3.c(), k0Var3.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192), (i12 >> 21) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    q3Var3 = q3Var4;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG6 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG6;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG7 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG7;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                androidx.compose.ui.text.y3 y3VarE4 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                d0.k0 k0Var4 = d0.k0.f268351a;
                int i26 = i12 << 9;
                p(function1, y3VarE4, k0Var4.c(), k0Var4.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), (i12 >> 21) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                q3Var3 = q3Var4;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i21;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i21;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 3072) == 0) {
            j12 = j10;
            if ((i11 & 8) == 0) {
                i19 = 1024;
            } else {
                i19 = 1024;
            }
            i12 |= i19;
        } else {
            j12 = j10;
        }
        if ((i10 & 24576) == 0) {
            j13 = j11;
            if ((i11 & 16) == 0) {
                i18 = 8192;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        } else {
            j13 = j11;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                ngVarC = ngVar;
                if (c0VarR.D(ngVarC)) {
                }
                i12 |= i22;
            } else {
                ngVarC = ngVar;
            }
            i12 |= i22;
        } else {
            ngVarC = ngVar;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
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
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG8 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG8;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG9 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j13 = jG9;
                        }
                        i16 = i12;
                        if ((i11 & 32) != 0) {
                            i17 = 6;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i17 = 6;
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        q3Var4 = q3VarH;
                        j16 = jD;
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                    }
                    androidx.compose.ui.text.y3 y3VarE5 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                    d0.k0 k0Var5 = d0.k0.f268351a;
                    int i27 = i12 << 9;
                    p(function1, y3VarE5, k0Var5.c(), k0Var5.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), (i12 >> 21) & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    q3Var3 = q3Var4;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG10 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG10;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG11 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG11;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                androidx.compose.ui.text.y3 y3VarE6 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                d0.k0 k0Var6 = d0.k0.f268351a;
                int i28 = i12 << 9;
                p(function1, y3VarE6, k0Var6.c(), k0Var6.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), (i12 >> 21) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                q3Var3 = q3Var4;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
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
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG12 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG12;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG13 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j13 = jG13;
                    }
                    i16 = i12;
                    if ((i11 & 32) != 0) {
                        i17 = 6;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i17 = 6;
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    q3Var4 = q3VarH;
                    j16 = jD;
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                }
                androidx.compose.ui.text.y3 y3VarE7 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
                d0.k0 k0Var7 = d0.k0.f268351a;
                int i29 = i12 << 9;
                p(function1, y3VarE7, k0Var7.c(), k0Var7.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), (i12 >> 21) & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                q3Var3 = q3Var4;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarH = mg.f30614a.h(c0VarR, 6);
                } else {
                    q3VarH = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG14 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                    j13 = jG14;
                }
                i16 = i12;
                if ((i11 & 32) != 0) {
                    i17 = 6;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i17 = 6;
                    i12 = i16;
                }
                if (i13 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                q3Var4 = q3VarH;
                j16 = jD;
                j17 = j13;
            } else {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarH = mg.f30614a.h(c0VarR, 6);
                } else {
                    q3VarH = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG15 = o6.g(jD, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                    j13 = jG15;
                }
                i16 = i12;
                if ((i11 & 32) != 0) {
                    i17 = 6;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i17 = 6;
                    i12 = i16;
                }
                if (i13 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                q3Var4 = q3VarH;
                j16 = jD;
                j17 = j13;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(748201188, i12, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
            }
            androidx.compose.ui.text.y3 y3VarE8 = la0.e(d0.i0.f268209a.n(), c0VarR, i17);
            d0.k0 k0Var8 = d0.k0.f268351a;
            int i210 = i12 << 9;
            p(function1, y3VarE8, k0Var8.c(), k0Var8.a(), a0Var4, q3Var4, j16, j17, ngVarC, jVar4, function2, c0VarR, (i12 & 14) | 3456 | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (29360128 & i210) | (234881024 & i210) | (i210 & 1879048192), (i12 >> 21) & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            q3Var3 = q3Var4;
            j14 = j16;
            j15 = j17;
            ngVar2 = ngVarC;
            jVar3 = jVar4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            ngVar2 = ngVarC;
            j14 = j12;
            j15 = j13;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ug
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.q(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:127:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01df  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:162:0x021b  */
    /* JADX WARN: Code duplicated, block: B:164:0x022d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0239  */
    /* JADX WARN: Code duplicated, block: B:169:0x0249  */
    /* JADX WARN: Code duplicated, block: B:171:0x0253  */
    /* JADX WARN: Code duplicated, block: B:173:0x0265  */
    /* JADX WARN: Code duplicated, block: B:175:0x0272  */
    /* JADX WARN: Code duplicated, block: B:178:0x0288  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:183:0x0301  */
    /* JADX WARN: Code duplicated, block: B:186:0x0316  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void p(final Function0<Unit> function0, final androidx.compose.ui.text.y3 y3Var, final float f10, final float f11, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        Function0<Unit> function1;
        int i13;
        float f12;
        float f13;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i14;
        long jG;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        final ng ngVar2;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jD;
        int i20;
        boolean z11;
        boolean z12;
        ng ngVarC;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.ui.graphics.q3 q3Var4;
        long j14;
        long j15;
        ?? r10;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        Object objI1;
        int i21;
        int i22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(121669932);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i13 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i13 = i10;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.D(y3Var) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= androidx.media3.exoplayer.a5.S0;
            f12 = f10;
        } else {
            f12 = f10;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.I(f12) ? 256 : 128;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            f13 = f11;
        } else {
            f13 = f11;
            if ((i10 & 3072) == 0) {
                i13 |= c0VarR.I(f13) ? 2048 : 1024;
            }
        }
        int i23 = i12 & 16;
        if (i23 == 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 16384 : 8192;
            }
            if ((196608 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    q3Var2 = q3Var;
                    int i24 = c0VarR.D(q3Var2) ? 131072 : 65536;
                    i13 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i13 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            if ((1572864 & i10) == 0) {
                int i25 = i13;
                if ((i12 & 64) == 0 || !c0VarR.L(j10)) {
                    i22 = 524288;
                } else {
                    i22 = 1048576;
                }
                i14 = i25 | i22;
            } else {
                i14 = i13;
            }
            if ((i10 & 12582912) == 0) {
                jG = j11;
                if ((i12 & 128) == 0 || !c0VarR.L(jG)) {
                    i21 = 4194304;
                } else {
                    i21 = 8388608;
                }
                i14 |= i21;
            } else {
                jG = j11;
            }
            if ((i10 & 100663296) != 0) {
                i14 |= ((i12 & 256) == 0 || !c0VarR.D(ngVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            i15 = i12 & 512;
            if (i15 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i12 & 1024) != 0) {
                    i17 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i11 | i18;
                } else {
                    i17 = i11;
                }
                i19 = i17;
                if ((i14 & 306783379) == 306783378 || (i19 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    c0VarR.l0();
                    char c10 = 6;
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i12 & 32) != 0) {
                            i14 &= -458753;
                            q3VarH = mg.f30614a.h(c0VarR, 6);
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 64) != 0) {
                            jD = mg.f30614a.d(c0VarR, 6);
                            i14 &= -3670017;
                        } else {
                            jD = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        }
                        i20 = i14;
                        if ((i12 & 256) != 0) {
                            z11 = false;
                            z12 = true;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i14 = i20 & (-234881025);
                        } else {
                            z11 = false;
                            z12 = true;
                            ngVarC = ngVar;
                            i14 = i20;
                        }
                        if (i15 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        q3Var4 = q3VarH;
                        j14 = jD;
                        j15 = jG;
                        r10 = z12;
                    } else {
                        c0VarR.u();
                        if ((i12 & 32) != 0) {
                            i14 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            i14 &= -3670017;
                        }
                        if ((i12 & 128) != 0) {
                            i14 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i14 &= -234881025;
                        }
                        j14 = j10;
                        ngVarC = ngVar;
                        i19 = i19;
                        c10 = 6;
                        q3Var4 = q3Var2;
                        j15 = jG;
                        z11 = false;
                        r10 = 1;
                        jVar3 = jVar;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(121669932, i14, i19, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                    }
                    if (jVar3 == null) {
                        c0VarR.E(-282833393);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0VarR.A();
                    } else {
                        c0VarR.E(960707016);
                        c0VarR.A();
                        jVar4 = jVar3;
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.sg
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return xg.r((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i26 = i14 >> 6;
                    u10.f(function1, androidx.compose.ui.semantics.t.f(a0Var2, z11, (Function1) objI0, r10, null), false, q3Var4, j14, j15, ngVarC.g(), ngVarC.f(jVar4, c0VarR, (i14 >> 21) & com.planner5d.library.engine.input.f.b.B).getValue().O(), null, jVar4, androidx.compose.runtime.internal.w.e(-1779603465, r10, new d(j15, y3Var, f12, f13, function2), c0VarR, 54), c0VarR, (i14 & 14) | (i26 & 7168) | (57344 & i26) | (i26 & 458752), 6, com.planner5d.library.engine.input.b.f160571z3);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    ngVar2 = ngVarC;
                    jVar2 = jVar3;
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var4;
                    j13 = j14;
                    j12 = j15;
                } else {
                    c0VarR.u();
                    ngVar2 = ngVar;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    j12 = jG;
                    j13 = j10;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.s(function0, y3Var, f10, f11, a0Var3, q3Var3, j13, j12, ngVar2, jVar2, function2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 805306368;
            if ((i12 & 1024) != 0) {
                i17 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i11 | i18;
            } else {
                i17 = i11;
            }
            i19 = i17;
            if ((i14 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                c0VarR.l0();
                char c11 = 6;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i14 &= -458753;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i14 &= -3670017;
                    } else {
                        jD = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    }
                    i20 = i14;
                    if ((i12 & 256) != 0) {
                        z11 = false;
                        z12 = true;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i14 = i20 & (-234881025);
                    } else {
                        z11 = false;
                        z12 = true;
                        ngVarC = ngVar;
                        i14 = i20;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    q3Var4 = q3VarH;
                    j14 = jD;
                    j15 = jG;
                    r10 = z12;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i14 &= -458753;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i14 &= -3670017;
                    } else {
                        jD = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    }
                    i20 = i14;
                    if ((i12 & 256) != 0) {
                        z11 = false;
                        z12 = true;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i14 = i20 & (-234881025);
                    } else {
                        z11 = false;
                        z12 = true;
                        ngVarC = ngVar;
                        i14 = i20;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    q3Var4 = q3VarH;
                    j14 = jD;
                    j15 = jG;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(121669932, i14, i19, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-282833393);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(960707016);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return xg.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i27 = i14 >> 6;
                u10.f(function1, androidx.compose.ui.semantics.t.f(a0Var2, z11, (Function1) objI0, r10, null), false, q3Var4, j14, j15, ngVarC.g(), ngVarC.f(jVar4, c0VarR, (i14 >> 21) & com.planner5d.library.engine.input.f.b.B).getValue().O(), null, jVar4, androidx.compose.runtime.internal.w.e(-1779603465, r10, new d(j15, y3Var, f12, f13, function2), c0VarR, 54), c0VarR, (i14 & 14) | (i27 & 7168) | (57344 & i27) | (i27 & 458752), 6, com.planner5d.library.engine.input.b.f160571z3);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVarC;
                jVar2 = jVar3;
                a0Var3 = a0Var2;
                q3Var3 = q3Var4;
                j13 = j14;
                j12 = j15;
            } else {
                c0VarR.u();
                ngVar2 = ngVar;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                j12 = jG;
                j13 = j10;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.s(function0, y3Var, f10, f11, a0Var3, q3Var3, j13, j12, ngVar2, jVar2, function2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        if ((196608 & i10) == 0) {
            if ((i12 & 32) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i13 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i13 |= i24;
        } else {
            q3Var2 = q3Var;
        }
        if ((1572864 & i10) == 0) {
            int i28 = i13;
            if ((i12 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i14 = i28 | i22;
        } else {
            i14 = i13;
        }
        if ((i10 & 12582912) == 0) {
            jG = j11;
            if ((i12 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i14 |= i21;
        } else {
            jG = j11;
        }
        if ((i10 & 100663296) != 0) {
            i14 |= ((i12 & 256) == 0 || !c0VarR.D(ngVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        i15 = i12 & 512;
        if (i15 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.D(jVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            if ((i12 & 1024) != 0) {
                i17 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i11 | i18;
            } else {
                i17 = i11;
            }
            i19 = i17;
            if ((i14 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                c0VarR.l0();
                char c12 = 6;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i14 &= -458753;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i14 &= -3670017;
                    } else {
                        jD = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    }
                    i20 = i14;
                    if ((i12 & 256) != 0) {
                        z11 = false;
                        z12 = true;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i14 = i20 & (-234881025);
                    } else {
                        z11 = false;
                        z12 = true;
                        ngVarC = ngVar;
                        i14 = i20;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    q3Var4 = q3VarH;
                    j14 = jD;
                    j15 = jG;
                    r10 = z12;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i12 & 32) != 0) {
                        i14 &= -458753;
                        q3VarH = mg.f30614a.h(c0VarR, 6);
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 64) != 0) {
                        jD = mg.f30614a.d(c0VarR, 6);
                        i14 &= -3670017;
                    } else {
                        jD = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    }
                    i20 = i14;
                    if ((i12 & 256) != 0) {
                        z11 = false;
                        z12 = true;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i14 = i20 & (-234881025);
                    } else {
                        z11 = false;
                        z12 = true;
                        ngVarC = ngVar;
                        i14 = i20;
                    }
                    if (i15 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    q3Var4 = q3VarH;
                    j14 = jD;
                    j15 = jG;
                    r10 = z12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(121669932, i14, i19, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                }
                if (jVar3 == null) {
                    c0VarR.E(-282833393);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0VarR.A();
                } else {
                    c0VarR.E(960707016);
                    c0VarR.A();
                    jVar4 = jVar3;
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.sg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return xg.r((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i29 = i14 >> 6;
                u10.f(function1, androidx.compose.ui.semantics.t.f(a0Var2, z11, (Function1) objI0, r10, null), false, q3Var4, j14, j15, ngVarC.g(), ngVarC.f(jVar4, c0VarR, (i14 >> 21) & com.planner5d.library.engine.input.f.b.B).getValue().O(), null, jVar4, androidx.compose.runtime.internal.w.e(-1779603465, r10, new d(j15, y3Var, f12, f13, function2), c0VarR, 54), c0VarR, (i14 & 14) | (i29 & 7168) | (57344 & i29) | (i29 & 458752), 6, com.planner5d.library.engine.input.b.f160571z3);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                ngVar2 = ngVarC;
                jVar2 = jVar3;
                a0Var3 = a0Var2;
                q3Var3 = q3Var4;
                j13 = j14;
                j12 = j15;
            } else {
                c0VarR.u();
                ngVar2 = ngVar;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                j12 = jG;
                j13 = j10;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.s(function0, y3Var, f10, f11, a0Var3, q3Var3, j13, j12, ngVar2, jVar2, function2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 805306368;
        if ((i12 & 1024) != 0) {
            i17 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i11 | i18;
        } else {
            i17 = i11;
        }
        i19 = i17;
        if ((i14 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            c0VarR.l0();
            char c13 = 6;
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i12 & 32) != 0) {
                    i14 &= -458753;
                    q3VarH = mg.f30614a.h(c0VarR, 6);
                } else {
                    q3VarH = q3Var2;
                }
                if ((i12 & 64) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i14 &= -3670017;
                } else {
                    jD = j10;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                    i14 &= -29360129;
                }
                i20 = i14;
                if ((i12 & 256) != 0) {
                    z11 = false;
                    z12 = true;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i14 = i20 & (-234881025);
                } else {
                    z11 = false;
                    z12 = true;
                    ngVarC = ngVar;
                    i14 = i20;
                }
                if (i15 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                q3Var4 = q3VarH;
                j14 = jD;
                j15 = jG;
                r10 = z12;
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i12 & 32) != 0) {
                    i14 &= -458753;
                    q3VarH = mg.f30614a.h(c0VarR, 6);
                } else {
                    q3VarH = q3Var2;
                }
                if ((i12 & 64) != 0) {
                    jD = mg.f30614a.d(c0VarR, 6);
                    i14 &= -3670017;
                } else {
                    jD = j10;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jD, c0VarR, (i14 >> 18) & 14);
                    i14 &= -29360129;
                }
                i20 = i14;
                if ((i12 & 256) != 0) {
                    z11 = false;
                    z12 = true;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i14 = i20 & (-234881025);
                } else {
                    z11 = false;
                    z12 = true;
                    ngVarC = ngVar;
                    i14 = i20;
                }
                if (i15 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                q3Var4 = q3VarH;
                j14 = jD;
                j15 = jG;
                r10 = z12;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(121669932, i14, i19, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
            }
            if (jVar3 == null) {
                c0VarR.E(-282833393);
                objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI1);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                c0VarR.A();
            } else {
                c0VarR.E(960707016);
                c0VarR.A();
                jVar4 = jVar3;
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.sg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return xg.r((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i210 = i14 >> 6;
            u10.f(function1, androidx.compose.ui.semantics.t.f(a0Var2, z11, (Function1) objI0, r10, null), false, q3Var4, j14, j15, ngVarC.g(), ngVarC.f(jVar4, c0VarR, (i14 >> 21) & com.planner5d.library.engine.input.f.b.B).getValue().O(), null, jVar4, androidx.compose.runtime.internal.w.e(-1779603465, r10, new d(j15, y3Var, f12, f13, function2), c0VarR, 54), c0VarR, (i14 & 14) | (i210 & 7168) | (57344 & i210) | (i210 & 458752), 6, com.planner5d.library.engine.input.b.f160571z3);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            ngVar2 = ngVarC;
            jVar2 = jVar3;
            a0Var3 = a0Var2;
            q3Var3 = q3Var4;
            j13 = j14;
            j12 = j15;
        } else {
            c0VarR.u();
            ngVar2 = ngVar;
            jVar2 = jVar;
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            j12 = jG;
            j13 = j10;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.s(function0, y3Var, f10, f11, a0Var3, q3Var3, j13, j12, ngVar2, jVar2, function2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(function0, a0Var, q3Var, j10, j11, ngVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function0 function0, androidx.compose.ui.text.y3 y3Var, float f10, float f11, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        p(function0, y3Var, f10, f11, a0Var, q3Var, j10, j11, ngVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x020f  */
    /* JADX WARN: Code duplicated, block: B:141:0x021f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0237  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void t(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable ng ngVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j12;
        long j13;
        ng ngVarC;
        int i13;
        androidx.compose.foundation.interaction.j jVar2;
        int i14;
        int i15;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final ng ngVar2;
        final long j14;
        final long j15;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.graphics.q3 q3VarG;
        int i16;
        long jD;
        int i17;
        long j16;
        int i18;
        androidx.compose.foundation.interaction.j jVar4;
        long j17;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1274576261);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    q3Var2 = q3Var;
                    int i22 = c0VarR.D(q3Var2) ? 256 : 128;
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 3072) == 0) {
                j12 = j10;
                if ((i11 & 8) == 0 || !c0VarR.L(j12)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                j13 = j11;
                if ((i11 & 16) == 0 || !c0VarR.L(j13)) {
                    i19 = 8192;
                } else {
                    i19 = 16384;
                }
                i12 |= i19;
            } else {
                j13 = j11;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    ngVarC = ngVar;
                    int i23 = c0VarR.D(ngVarC) ? 131072 : 65536;
                    i12 |= i23;
                } else {
                    ngVarC = ngVar;
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var2 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                q3VarG = mg.f30614a.g(c0VarR, 6);
                            } else {
                                q3VarG = q3Var2;
                            }
                            if ((i11 & 8) != 0) {
                                i16 = i12 & (-7169);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i16 = i12;
                                jD = j12;
                            }
                            if ((i11 & 16) != 0) {
                                long jG = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                                i16 &= -57345;
                                j13 = jG;
                            }
                            i17 = i16;
                            if ((i11 & 32) != 0) {
                                j16 = jD;
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                i12 = i17 & (-458753);
                            } else {
                                j16 = jD;
                                i12 = i17;
                            }
                            if (i13 != 0) {
                                i18 = 1274576261;
                                jVar4 = null;
                            } else {
                                i18 = 1274576261;
                                jVar4 = jVar2;
                            }
                            j17 = j13;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            ngVarC = ngVarC;
                            j16 = j12;
                            j17 = j13;
                            jVar4 = jVar2;
                            i18 = 1274576261;
                            q3VarG = q3Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                        }
                        d0.l0 l0Var = d0.l0.f268412a;
                        o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var.c(), l0Var.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        q3Var3 = q3VarG;
                        j14 = j16;
                        j15 = j17;
                        ngVar2 = ngVarC;
                        jVar3 = jVar4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        q3Var3 = q3Var2;
                        ngVar2 = ngVarC;
                        j14 = j12;
                        j15 = j13;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG2 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG2;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG3 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG3;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                    }
                    d0.l0 l0Var2 = d0.l0.f268412a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var2.c(), l0Var2.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarG;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG4 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG4;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG5 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG5;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                    }
                    d0.l0 l0Var3 = d0.l0.f268412a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var3.c(), l0Var3.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarG;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG6 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG6;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG7 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG7;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                }
                d0.l0 l0Var4 = d0.l0.f268412a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var4.c(), l0Var4.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarG;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i22;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 3072) == 0) {
            j12 = j10;
            if ((i11 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 24576) == 0) {
            j13 = j11;
            if ((i11 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i12 |= i19;
        } else {
            j13 = j11;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                ngVarC = ngVar;
                if (c0VarR.D(ngVarC)) {
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i12 |= i23;
        } else {
            ngVarC = ngVar;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG8 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG8;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarG = mg.f30614a.g(c0VarR, 6);
                        } else {
                            q3VarG = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG9 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG9;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 1274576261;
                            jVar4 = null;
                        } else {
                            i18 = 1274576261;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                    }
                    d0.l0 l0Var5 = d0.l0.f268412a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var5.c(), l0Var5.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarG;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG10 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG10;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG11 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG11;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                }
                d0.l0 l0Var6 = d0.l0.f268412a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var6.c(), l0Var6.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarG;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG12 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG12;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarG = mg.f30614a.g(c0VarR, 6);
                    } else {
                        q3VarG = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG13 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG13;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 1274576261;
                        jVar4 = null;
                    } else {
                        i18 = 1274576261;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                }
                d0.l0 l0Var7 = d0.l0.f268412a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var7.c(), l0Var7.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarG;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarG = mg.f30614a.g(c0VarR, 6);
                } else {
                    q3VarG = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    i16 = i12 & (-7169);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i16 = i12;
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG14 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j13 = jG14;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = jD;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = jD;
                    i12 = i17;
                }
                if (i13 != 0) {
                    i18 = 1274576261;
                    jVar4 = null;
                } else {
                    i18 = 1274576261;
                    jVar4 = jVar2;
                }
                j17 = j13;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarG = mg.f30614a.g(c0VarR, 6);
                } else {
                    q3VarG = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    i16 = i12 & (-7169);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i16 = i12;
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG15 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j13 = jG15;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = jD;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = jD;
                    i12 = i17;
                }
                if (i13 != 0) {
                    i18 = 1274576261;
                    jVar4 = null;
                } else {
                    i18 = 1274576261;
                    jVar4 = jVar2;
                }
                j17 = j13;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
            }
            d0.l0 l0Var8 = d0.l0.f268412a;
            o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, l0Var8.c(), l0Var8.a(), 0.0f, 0.0f, 12, null), q3VarG, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            q3Var3 = q3VarG;
            j14 = j16;
            j15 = j17;
            ngVar2 = ngVarC;
            jVar3 = jVar4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            ngVar2 = ngVarC;
            j14 = j12;
            j15 = j13;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.u(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        t(function0, a0Var, q3Var, j10, j11, ngVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x0214  */
    /* JADX WARN: Code duplicated, block: B:141:0x0225  */
    /* JADX WARN: Code duplicated, block: B:144:0x023b  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void v(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable ng ngVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j12;
        long j13;
        ng ngVarC;
        int i13;
        androidx.compose.foundation.interaction.j jVar2;
        int i14;
        int i15;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final ng ngVar2;
        final long j14;
        final long j15;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.graphics.q3 q3VarI;
        int i16;
        long jD;
        int i17;
        long j16;
        int i18;
        androidx.compose.foundation.interaction.j jVar4;
        long j17;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(26608441);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    q3Var2 = q3Var;
                    int i22 = c0VarR.D(q3Var2) ? 256 : 128;
                    i12 |= i22;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 3072) == 0) {
                j12 = j10;
                if ((i11 & 8) == 0 || !c0VarR.L(j12)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 24576) == 0) {
                j13 = j11;
                if ((i11 & 16) == 0 || !c0VarR.L(j13)) {
                    i19 = 8192;
                } else {
                    i19 = 16384;
                }
                i12 |= i19;
            } else {
                j13 = j11;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    ngVarC = ngVar;
                    int i23 = c0VarR.D(ngVarC) ? 131072 : 65536;
                    i12 |= i23;
                } else {
                    ngVarC = ngVar;
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i12 |= i15;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var2 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                q3VarI = mg.f30614a.i(c0VarR, 6);
                            } else {
                                q3VarI = q3Var2;
                            }
                            if ((i11 & 8) != 0) {
                                i16 = i12 & (-7169);
                                jD = mg.f30614a.d(c0VarR, 6);
                            } else {
                                i16 = i12;
                                jD = j12;
                            }
                            if ((i11 & 16) != 0) {
                                long jG = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                                i16 &= -57345;
                                j13 = jG;
                            }
                            i17 = i16;
                            if ((i11 & 32) != 0) {
                                j16 = jD;
                                ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                                i12 = i17 & (-458753);
                            } else {
                                j16 = jD;
                                i12 = i17;
                            }
                            if (i13 != 0) {
                                i18 = 26608441;
                                jVar4 = null;
                            } else {
                                i18 = 26608441;
                                jVar4 = jVar2;
                            }
                            j17 = j13;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            ngVarC = ngVarC;
                            j16 = j12;
                            j17 = j13;
                            jVar4 = jVar2;
                            i18 = 26608441;
                            q3VarI = q3Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                        }
                        d0.q0 q0Var = d0.q0.f268692a;
                        o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var.c(), q0Var.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        q3Var3 = q3VarI;
                        j14 = j16;
                        j15 = j17;
                        ngVar2 = ngVarC;
                        jVar3 = jVar4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        q3Var3 = q3Var2;
                        ngVar2 = ngVarC;
                        j14 = j12;
                        j15 = j13;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG2 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG2;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG3 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG3;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                    }
                    d0.q0 q0Var2 = d0.q0.f268692a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var2.c(), q0Var2.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarI;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG4 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG4;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG5 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG5;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                    }
                    d0.q0 q0Var3 = d0.q0.f268692a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var3.c(), q0Var3.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarI;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG6 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG6;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG7 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG7;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                }
                d0.q0 q0Var4 = d0.q0.f268692a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var4.c(), q0Var4.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarI;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i22;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i22;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 3072) == 0) {
            j12 = j10;
            if ((i11 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 24576) == 0) {
            j13 = j11;
            if ((i11 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i12 |= i19;
        } else {
            j13 = j11;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                ngVarC = ngVar;
                if (c0VarR.D(ngVarC)) {
                }
                i12 |= i23;
            } else {
                ngVarC = ngVar;
            }
            i12 |= i23;
        } else {
            ngVarC = ngVar;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((i12 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG8 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG8;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var2 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            q3VarI = mg.f30614a.i(c0VarR, 6);
                        } else {
                            q3VarI = q3Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i16 = i12 & (-7169);
                            jD = mg.f30614a.d(c0VarR, 6);
                        } else {
                            i16 = i12;
                            jD = j12;
                        }
                        if ((i11 & 16) != 0) {
                            long jG9 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                            i16 &= -57345;
                            j13 = jG9;
                        }
                        i17 = i16;
                        if ((i11 & 32) != 0) {
                            j16 = jD;
                            ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            i12 = i17 & (-458753);
                        } else {
                            j16 = jD;
                            i12 = i17;
                        }
                        if (i13 != 0) {
                            i18 = 26608441;
                            jVar4 = null;
                        } else {
                            i18 = 26608441;
                            jVar4 = jVar2;
                        }
                        j17 = j13;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                    }
                    d0.q0 q0Var5 = d0.q0.f268692a;
                    o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var5.c(), q0Var5.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    q3Var3 = q3VarI;
                    j14 = j16;
                    j15 = j17;
                    ngVar2 = ngVarC;
                    jVar3 = jVar4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    q3Var3 = q3Var2;
                    ngVar2 = ngVarC;
                    j14 = j12;
                    j15 = j13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG10 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG10;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG11 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG11;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                }
                d0.q0 q0Var6 = d0.q0.f268692a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var6.c(), q0Var6.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarI;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((i12 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG12 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG12;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var2 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        q3VarI = mg.f30614a.i(c0VarR, 6);
                    } else {
                        q3VarI = q3Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i16 = i12 & (-7169);
                        jD = mg.f30614a.d(c0VarR, 6);
                    } else {
                        i16 = i12;
                        jD = j12;
                    }
                    if ((i11 & 16) != 0) {
                        long jG13 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                        i16 &= -57345;
                        j13 = jG13;
                    }
                    i17 = i16;
                    if ((i11 & 32) != 0) {
                        j16 = jD;
                        ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        i12 = i17 & (-458753);
                    } else {
                        j16 = jD;
                        i12 = i17;
                    }
                    if (i13 != 0) {
                        i18 = 26608441;
                        jVar4 = null;
                    } else {
                        i18 = 26608441;
                        jVar4 = jVar2;
                    }
                    j17 = j13;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                }
                d0.q0 q0Var7 = d0.q0.f268692a;
                o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var7.c(), q0Var7.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                q3Var3 = q3VarI;
                j14 = j16;
                j15 = j17;
                ngVar2 = ngVarC;
                jVar3 = jVar4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                ngVar2 = ngVarC;
                j14 = j12;
                j15 = j13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarI = mg.f30614a.i(c0VarR, 6);
                } else {
                    q3VarI = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    i16 = i12 & (-7169);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i16 = i12;
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG14 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j13 = jG14;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = jD;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = jD;
                    i12 = i17;
                }
                if (i13 != 0) {
                    i18 = 26608441;
                    jVar4 = null;
                } else {
                    i18 = 26608441;
                    jVar4 = jVar2;
                }
                j17 = j13;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                } else {
                    a0Var2 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    q3VarI = mg.f30614a.i(c0VarR, 6);
                } else {
                    q3VarI = q3Var2;
                }
                if ((i11 & 8) != 0) {
                    i16 = i12 & (-7169);
                    jD = mg.f30614a.d(c0VarR, 6);
                } else {
                    i16 = i12;
                    jD = j12;
                }
                if ((i11 & 16) != 0) {
                    long jG15 = o6.g(jD, c0VarR, (i16 >> 9) & 14);
                    i16 &= -57345;
                    j13 = jG15;
                }
                i17 = i16;
                if ((i11 & 32) != 0) {
                    j16 = jD;
                    ngVarC = mg.f30614a.c(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    i12 = i17 & (-458753);
                } else {
                    j16 = jD;
                    i12 = i17;
                }
                if (i13 != 0) {
                    i18 = 26608441;
                    jVar4 = null;
                } else {
                    i18 = 26608441;
                    jVar4 = jVar2;
                }
                j17 = j13;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
            }
            d0.q0 q0Var8 = d0.q0.f268692a;
            o(function1, androidx.compose.foundation.layout.i6.A(a0Var2, q0Var8.c(), q0Var8.a(), 0.0f, 0.0f, 12, null), q3VarI, j16, j17, ngVarC, jVar4, function2, c0VarR, i12 & 33554318, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            q3Var3 = q3VarI;
            j14 = j16;
            j15 = j17;
            ngVar2 = ngVarC;
            jVar3 = jVar4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            ngVar2 = ngVarC;
            j14 = j12;
            j15 = j13;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return xg.w(function0, a0Var3, q3Var3, j14, j15, ngVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, ng ngVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        v(function0, a0Var, q3Var, j10, j11, ngVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
