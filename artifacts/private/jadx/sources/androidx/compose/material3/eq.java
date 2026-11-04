package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,838:1\n75#2:839\n75#2:879\n1282#3,6:840\n1282#3,6:884\n1282#3,6:890\n1282#3,6:896\n1282#3,6:906\n1282#3,6:980\n70#4,6:846\n77#4:905\n70#4:939\n67#4,9:940\n77#4:979\n70#4:986\n67#4,9:987\n77#4:1026\n79#5,6:852\n86#5,3:867\n89#5,2:876\n93#5:904\n79#5,6:912\n86#5,3:927\n89#5,2:936\n79#5,6:949\n86#5,3:964\n89#5,2:973\n93#5:978\n79#5,6:996\n86#5,3:1011\n89#5,2:1020\n93#5:1025\n93#5:1029\n347#6,9:858\n356#6:878\n357#6,2:902\n347#6,9:918\n356#6:938\n347#6,9:955\n356#6,3:975\n347#6,9:1002\n356#6,3:1022\n357#6,2:1027\n4206#7,6:870\n4206#7,6:930\n4206#7,6:967\n4206#7,6:1014\n30#8:880\n53#9,3:881\n113#10:1030\n113#10:1031\n113#10:1032\n52#11,9:1033\n52#11,9:1042\n52#11,9:1051\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n128#1:839\n278#1:879\n212#1:840,6\n284#1:884,6\n320#1:890,6\n321#1:896,6\n577#1:906,6\n569#1:980,6\n246#1:846,6\n246#1:905\n565#1:939\n565#1:940,9\n565#1:979\n568#1:986\n568#1:987,9\n568#1:1026\n246#1:852,6\n246#1:867,3\n246#1:876,2\n246#1:904\n559#1:912,6\n559#1:927,3\n559#1:936,2\n565#1:949,6\n565#1:964,3\n565#1:973,2\n565#1:978\n568#1:996,6\n568#1:1011,3\n568#1:1020,2\n568#1:1025\n559#1:1029\n246#1:858,9\n246#1:878\n246#1:902,2\n559#1:918,9\n559#1:938\n565#1:955,9\n565#1:975,3\n568#1:1002,9\n568#1:1022,3\n559#1:1027,2\n246#1:870,6\n559#1:930,6\n565#1:967,6\n568#1:1014,6\n281#1:880\n281#1:881,3\n767#1:1030\n773#1:1031\n785#1:1032\n788#1:1033,9\n792#1:1042,9\n796#1:1051,9\n*E\n"})
public final class eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f27400a = "indicatorRipple";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f27401b = "indicator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f27402c = "icon";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f27403d = "label";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f27404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f27405f = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f27406g = d0.o1.f268586a.f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f27407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f27408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f27409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f27410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f27411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<gq> f27412m;

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicator$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,838:1\n1282#2,6:839\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicator$1\n*L\n309#1:839,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f27413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ sp f27414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f27415c;

        a(androidx.compose.runtime.n7<Float> n7Var, sp spVar, androidx.compose.ui.graphics.q3 q3Var) {
            this.f27413a = n7Var;
            this.f27414b = spVar;
            this.f27415c = q3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.setAlpha(((Number) n7Var.getValue()).floatValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2137606782, i10, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:306)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, eq.f27401b);
            boolean zD = c0Var.D(this.f27413a);
            final androidx.compose.runtime.n7<Float> n7Var = this.f27413a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.dq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return eq.a.f(n7Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.c(androidx.compose.ui.graphics.q1.a(a0VarB, (Function1) objI0), this.f27414b.e(), this.f27415c), c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f27416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.z2 f27417b;

        b(androidx.compose.ui.graphics.q3 q3Var, androidx.compose.material3.internal.z2 z2Var) {
            this.f27416a = q3Var;
            this.f27417b = z2Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(455696046, i10, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:298)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.w2.d(androidx.compose.ui.draw.j.a(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, eq.f27400a), this.f27416a), this.f27417b, gt.e(false, 0.0f, 0L, 7, null)), c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,838:1\n1282#2,6:839\n70#3:845\n67#3,9:846\n77#3:885\n79#4,6:855\n86#4,3:870\n89#4,2:879\n93#4:884\n347#5,9:861\n356#5,3:881\n4206#6,6:873\n85#7:886\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n*L\n224#1:839,6\n224#1:845\n224#1:846,9\n224#1:885\n224#1:855,6\n224#1:870,3\n224#1:879,2\n224#1:884\n224#1:861,9\n224#1:881,3\n224#1:873,6\n218#1:886\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ sp f27418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f27421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f27423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27424g;

        /* JADX WARN: Multi-variable type inference failed */
        c(sp spVar, boolean z10, boolean z11, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z12, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f27418a = spVar;
            this.f27419b = z10;
            this.f27420c = z11;
            this.f27421d = y0Var;
            this.f27422e = function2;
            this.f27423f = z12;
            this.f27424g = function3;
        }

        private static final long f(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
            return n7Var.getValue().M();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(androidx.compose.ui.semantics.e0 e0Var) {
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.ui.a0 a0VarC;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(206057749, i10, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:216)");
            }
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(this.f27418a.k(this.f27419b, this.f27420c), this.f27421d, null, null, c0Var, 0, 12);
            if (this.f27422e == null || !(this.f27423f || this.f27419b)) {
                c0Var.E(453016797);
                c0Var.A();
                a0VarC = androidx.compose.ui.a0.E;
            } else {
                c0Var.E(453015884);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.fq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return eq.c.i((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(objI0);
                }
                a0VarC = androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0);
                c0Var.A();
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f27424g;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(f(n7VarC))), function2, c0Var, androidx.compose.runtime.n4.f36267i);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,838:1\n85#2:839\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n*L\n234#1:839\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ sp f27425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f27428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27429e;

        /* JADX WARN: Multi-variable type inference failed */
        d(sp spVar, boolean z10, boolean z11, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f27425a = spVar;
            this.f27426b = z10;
            this.f27427c = z11;
            this.f27428d = y0Var;
            this.f27429e = function2;
        }

        private static final long d(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
            return n7Var.getValue().M();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2056532825, i10, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:231)");
            }
            androidx.compose.material3.internal.k3.b(d(androidx.compose.animation.e1.c(this.f27425a.l(this.f27426b, this.f27427c), this.f27428d, null, null, c0Var, 0, 12)), la0.e(d0.s1.f268847a.d(), c0Var, 6), this.f27429e, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,838:1\n563#2,2:839\n34#2,6:841\n565#2:847\n563#2,2:850\n34#2,6:852\n565#2:858\n117#2,2:859\n34#2,6:861\n119#2:867\n563#2,2:868\n34#2,6:870\n565#2:876\n68#3:848\n68#3:849\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$1\n*L\n583#1:839,2\n583#1:841,6\n583#1:847\n597#1:850,2\n597#1:852,6\n597#1:858\n601#1:859,2\n601#1:861,6\n601#1:867\n608#1:868,2\n608#1:870,6\n608#1:876\n585#1:848\n593#1:849\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f27430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27432c;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function0<Float> function0, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10) {
            this.f27430a = function0;
            this.f27431b = function2;
            this.f27432c = z10;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.z0 z0Var;
            androidx.compose.ui.layout.i2 i2VarP0;
            float fT = kotlin.ranges.r.t(this.f27430a.invoke().floatValue(), 0.0f);
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var2 = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), eq.f27402c)) {
                    androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(jD);
                    float f10 = 2;
                    int iH1 = i2VarP1.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(eq.f27409j * f10));
                    int iL0 = kotlin.math.b.L0(iH1 * fT);
                    int iC1 = i2VarP1.c1() + c1Var.g6(androidx.compose.ui.unit.h.r((this.f27431b == null ? eq.f27411l : eq.f27410k) * f10));
                    List<? extends androidx.compose.ui.layout.z0> list2 = list;
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        androidx.compose.ui.layout.z0 z0Var3 = list.get(i11);
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), eq.f27400a)) {
                            androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.b.f42658b.c(iH1, iC1));
                            int size3 = list2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    z0Var = null;
                                    break;
                                }
                                z0Var = list.get(i12);
                                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), eq.f27401b)) {
                                    break;
                                }
                                i12++;
                            }
                            androidx.compose.ui.layout.z0 z0Var4 = z0Var;
                            androidx.compose.ui.layout.i2 i2VarP3 = z0Var4 != null ? z0Var4.P0(androidx.compose.ui.unit.b.f42658b.c(iL0, iC1)) : null;
                            if (this.f27431b != null) {
                                int size4 = list2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size4) {
                                        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                        throw new kotlin.a0();
                                    }
                                    androidx.compose.ui.layout.z0 z0Var5 = list.get(i13);
                                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var5), "label")) {
                                        i2VarP0 = z0Var5.P0(jD);
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i2VarP0 = null;
                            }
                            if (this.f27431b == null) {
                                return eq.E(c1Var, i2VarP1, i2VarP2, i2VarP3, j10);
                            }
                            Intrinsics.checkNotNull(i2VarP0);
                            return eq.G(c1Var, i2VarP0, i2VarP1, i2VarP2, i2VarP3, j10, this.f27432c, fT);
                        }
                    }
                    androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                    throw new kotlin.a0();
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static {
        float f10 = 4;
        f27404e = androidx.compose.ui.unit.h.r(f10);
        d0.s1 s1Var = d0.s1.f268847a;
        f27407h = s1Var.b();
        f27408i = androidx.compose.ui.unit.h.r(f10);
        float fB = s1Var.b();
        d0.n1 n1Var = d0.n1.f268535a;
        float f11 = 2;
        f27409j = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fB - n1Var.i()) / f11);
        f27410k = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(s1Var.a() - n1Var.i()) / f11);
        f27411l = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(s1Var.b() - n1Var.i()) / f11);
        f27412m = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.yp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return eq.j();
            }
        }, 1, null);
    }

    public static final float A() {
        return f27407h;
    }

    public static final float B() {
        return f27408i;
    }

    public static final float C() {
        return f27406g;
    }

    public static final float D() {
        return f27404e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 E(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, long j10) {
        final int i10 = androidx.compose.ui.unit.c.i(j10, Math.max(i2Var.h1(), Math.max(i2Var2.h1(), i2Var3 != null ? i2Var3.h1() : 0)));
        final int iH = androidx.compose.ui.unit.c.h(j10, c1Var.g6(f27407h));
        final int iH1 = (i10 - i2Var.h1()) / 2;
        final int iC1 = (iH - i2Var.c1()) / 2;
        final int iH2 = (i10 - i2Var2.h1()) / 2;
        final int iC2 = (iH - i2Var2.c1()) / 2;
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, iH, null, new Function1() { // from class: androidx.compose.material3.zp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eq.F(i2Var3, i2Var, iH1, iC1, i2Var2, iH2, iC2, i10, iH, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, int i10, int i11, androidx.compose.ui.layout.i2 i2Var3, int i12, int i13, int i14, int i15, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i14 - i2Var.h1()) / 2, (i15 - i2Var.c1()) / 2, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i10, i11, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i12, i13, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 G(final androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final androidx.compose.ui.layout.i2 i2Var4, long j10, final boolean z10, final float f10) {
        float fC1 = i2Var2.c1();
        float f11 = f27410k;
        float fS7 = fC1 + c1Var.S7(f11);
        float f12 = f27408i;
        float fS8 = fS7 + c1Var.S7(f12) + i2Var.c1();
        float f13 = 2;
        final float fT = kotlin.ranges.r.t((androidx.compose.ui.unit.b.q(j10) - fS8) / f13, c1Var.S7(f11));
        float f14 = fS8 + (fT * f13);
        final float fC2 = ((z10 ? fT : (f14 - i2Var2.c1()) / f13) - fT) * (1 - f10);
        final float fC3 = i2Var2.c1() + fT + c1Var.S7(f11) + c1Var.S7(f12);
        final int i10 = androidx.compose.ui.unit.c.i(j10, Math.max(i2Var2.h1(), Math.max(i2Var.h1(), i2Var4 != null ? i2Var4.h1() : 0)));
        final int iH1 = (i10 - i2Var.h1()) / 2;
        final int iH2 = (i10 - i2Var2.h1()) / 2;
        final int iH3 = (i10 - i2Var3.h1()) / 2;
        final float fS9 = fT - c1Var.S7(f11);
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, kotlin.math.b.L0(f14), null, new Function1() { // from class: androidx.compose.material3.up
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eq.H(i2Var4, z10, f10, i2Var, iH1, fC3, fC2, i2Var2, iH2, fT, i2Var3, iH3, fS9, i10, c1Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(androidx.compose.ui.layout.i2 i2Var, boolean z10, float f10, androidx.compose.ui.layout.i2 i2Var2, int i10, float f11, float f12, androidx.compose.ui.layout.i2 i2Var3, int i11, float f13, androidx.compose.ui.layout.i2 i2Var4, int i12, float f14, int i13, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i13 - i2Var.h1()) / 2, kotlin.math.b.L0((f13 - c1Var.S7(f27410k)) + f12), 0.0f, 4, null);
        }
        if (z10 || f10 != 0.0f) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i10, kotlin.math.b.L0(f11 + f12), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i11, kotlin.math.b.L0(f13 + f12), 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, i12, kotlin.math.b.L0(f14 + f12), 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gq j() {
        return ec.f27318a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x016e  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:116:0x018a  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    @androidx.compose.runtime.o
    public static final void k(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jA;
        long jG;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        androidx.compose.foundation.layout.v6 v6Var2;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        int i13;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5;
        final androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.v6 v6VarB;
        long j14;
        long j15;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(331386280);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
                jA = j10;
                int i15 = c0VarR.L(jA) ? 32 : 16;
                i12 |= i15;
            } else {
                jA = j10;
            }
            i12 |= i15;
        } else {
            jA = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jG = j11;
                int i16 = c0VarR.L(jG) ? 256 : 128;
                i12 |= i16;
            } else {
                jG = j11;
            }
            i12 |= i16;
        } else {
            jG = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 3072) == 0) {
                nVar3 = nVar;
                i12 |= c0VarR.k0(nVar3) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    v6Var2 = v6Var;
                    int i18 = c0VarR.D(v6Var2) ? 16384 : 8192;
                    i12 |= i18;
                } else {
                    v6Var2 = v6Var;
                }
                i12 |= i18;
            } else {
                v6Var2 = v6Var;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i12 |= i13;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = rp.f32583a.a(c0VarR, 6);
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            nVar3 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            a0Var3 = a0Var4;
                            v6VarB = rp.f32583a.b(c0VarR, 6);
                            j14 = jA;
                            j15 = jG;
                            nVar6 = nVar3;
                        } else {
                            a0Var3 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(331386280, i12, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
                        }
                        ((gq) c0VarR.W(f27412m)).a(new hq(a0Var3, j14, j15, nVar6, v6VarB, nVar4, null), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j14;
                        j13 = j15;
                        nVar5 = nVar6;
                        v6Var3 = v6VarB;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        a0Var3 = a0Var2;
                    }
                    j14 = jA;
                    j15 = jG;
                    nVar6 = nVar3;
                    v6VarB = v6Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(331386280, i12, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
                    }
                    ((gq) c0VarR.W(f27412m)).a(new hq(a0Var3, j14, j15, nVar6, v6VarB, nVar4, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j14;
                    j13 = j15;
                    nVar5 = nVar6;
                    v6Var3 = v6VarB;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j12 = jA;
                    j13 = jG;
                    nVar5 = nVar3;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var5 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.aq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.s(a0Var5, j12, j13, nVar5, v6Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = rp.f32583a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        nVar3 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarB = rp.f32583a.b(c0VarR, 6);
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                        v6VarB = v6Var2;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = rp.f32583a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        nVar3 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarB = rp.f32583a.b(c0VarR, 6);
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                        v6VarB = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(331386280, i12, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
                }
                ((gq) c0VarR.W(f27412m)).a(new hq(a0Var3, j14, j15, nVar6, v6VarB, nVar4, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j14;
                j13 = j15;
                nVar5 = nVar6;
                v6Var3 = v6VarB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jA;
                j13 = jG;
                nVar5 = nVar3;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.aq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.s(a0Var6, j12, j13, nVar5, v6Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        nVar3 = nVar;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                v6Var2 = v6Var;
                if (c0VarR.D(v6Var2)) {
                }
                i12 |= i18;
            } else {
                v6Var2 = v6Var;
            }
            i12 |= i18;
        } else {
            v6Var2 = v6Var;
        }
        if ((i11 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                nVar4 = nVar2;
                if (c0VarR.k0(nVar4)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i12 |= i13;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = rp.f32583a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        nVar3 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarB = rp.f32583a.b(c0VarR, 6);
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                        v6VarB = v6Var2;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = rp.f32583a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        nVar3 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarB = rp.f32583a.b(c0VarR, 6);
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jG;
                        nVar6 = nVar3;
                        v6VarB = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(331386280, i12, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
                }
                ((gq) c0VarR.W(f27412m)).a(new hq(a0Var3, j14, j15, nVar6, v6VarB, nVar4, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j14;
                j13 = j15;
                nVar5 = nVar6;
                v6Var3 = v6VarB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jA;
                j13 = jG;
                nVar5 = nVar3;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var7 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.aq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.s(a0Var7, j12, j13, nVar5, v6Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar4 = nVar2;
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = rp.f32583a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    nVar3 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a0Var3 = a0Var4;
                    v6VarB = rp.f32583a.b(c0VarR, 6);
                    j14 = jA;
                    j15 = jG;
                    nVar6 = nVar3;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jA;
                    j15 = jG;
                    nVar6 = nVar3;
                    v6VarB = v6Var2;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = rp.f32583a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    nVar3 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a0Var3 = a0Var4;
                    v6VarB = rp.f32583a.b(c0VarR, 6);
                    j14 = jA;
                    j15 = jG;
                    nVar6 = nVar3;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jA;
                    j15 = jG;
                    nVar6 = nVar3;
                    v6VarB = v6Var2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(331386280, i12, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
            }
            ((gq) c0VarR.W(f27412m)).a(new hq(a0Var3, j14, j15, nVar6, v6VarB, nVar4, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j14;
            j13 = j15;
            nVar5 = nVar6;
            v6Var3 = v6VarB;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = jA;
            j13 = jG;
            nVar5 = nVar3;
            v6Var3 = v6Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var8 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.aq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eq.s(a0Var8, j12, j13, nVar5, v6Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:126:0x016a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:146:0x027a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0286  */
    /* JADX WARN: Code duplicated, block: B:150:0x028a  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0356  */
    /* JADX WARN: Code duplicated, block: B:169:0x035e  */
    /* JADX WARN: Code duplicated, block: B:172:0x036b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0380  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:186:0x0403  */
    /* JADX WARN: Code duplicated, block: B:188:0x0411  */
    /* JADX WARN: Code duplicated, block: B:191:0x0422  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void l(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z12, @Nullable sp spVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i16;
        int i17;
        boolean z14;
        char c10;
        int i18;
        int i19;
        int i20;
        boolean z15;
        final androidx.compose.foundation.interaction.j jVar2;
        final boolean z16;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z17;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final sp spVar2;
        androidx.compose.runtime.s5 s5VarT;
        sp spVarA;
        sp spVar3;
        boolean z18;
        boolean z19;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        int i21;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.animation.core.y0 y0VarB;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        androidx.compose.runtime.internal.c cVar;
        androidx.compose.foundation.interaction.j jVar4;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        float f10;
        final androidx.compose.runtime.n7<Float> n7VarF;
        float f11;
        final androidx.compose.runtime.n7<Float> n7VarF2;
        long jG;
        boolean zD;
        Object objI0;
        androidx.compose.ui.graphics.q3 q3VarI;
        boolean zD2;
        Object objI1;
        boolean zD3;
        Object objI2;
        Object objI3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1620317701);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(function4) ? 256 : 128;
            }
        }
        int i22 = i11 & 8;
        if (i22 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        z14 = z12;
                        if ((i10 & 1572864) == 0) {
                            c10 = ' ';
                            if (c0VarR.G(z14)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 12582912) != 0) {
                            i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i20 = 67108864;
                                } else {
                                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i12 |= i20;
                            }
                            if ((i12 & 38347923) != 38347922) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (c0VarR.h(z15, i12 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i22 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i13 != 0) {
                                        z13 = true;
                                    }
                                    if (i15 != 0) {
                                        function5 = null;
                                    }
                                    if (i17 != 0) {
                                        z14 = true;
                                    }
                                    if ((i11 & 128) != 0) {
                                        spVarA = tp.f33241a.a(c0VarR, 6);
                                        i12 &= -29360129;
                                    } else {
                                        spVarA = spVar;
                                    }
                                    if (i19 != 0) {
                                        spVar3 = spVarA;
                                        z18 = z13;
                                        z19 = z14;
                                        function7 = function5;
                                        jVar = null;
                                    } else {
                                        spVar3 = spVarA;
                                    }
                                    i21 = i12;
                                    androidx.compose.ui.a0 a0Var3 = a0Var2;
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                                    }
                                    if (jVar == null) {
                                        c0VarR.E(253288608);
                                        objI3 = c0VarR.i0();
                                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                            objI3 = androidx.compose.foundation.interaction.i.a();
                                            c0VarR.Y(objI3);
                                        }
                                        c0VarR.A();
                                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                                    } else {
                                        c0VarR.E(1947832599);
                                        c0VarR.A();
                                        jVar3 = jVar;
                                    }
                                    d0.h1 h1Var = d0.h1.DefaultEffects;
                                    y0VarB = hm.b(h1Var, c0VarR, 6);
                                    boolean z20 = z19;
                                    androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                                    if (function7 == null) {
                                        c0VarR.E(254215848);
                                        c0VarR.A();
                                        function8 = function7;
                                        cVar = null;
                                    } else {
                                        c0VarR.E(254215849);
                                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function7;
                                        function8 = function9;
                                        androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function9), c0VarR, 54);
                                        c0VarR.A();
                                        cVar = cVarE2;
                                    }
                                    boolean z21 = z18;
                                    jVar4 = jVar3;
                                    androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var3, z10, jVar4, null, z21, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                                    float f12 = f27406g;
                                    androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.i6.D(a0VarB, f12, 0.0f, 2, null);
                                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
                                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                                    androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                                    function2B = aVar.b();
                                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                        c0VarD.Y(Integer.valueOf(iJ));
                                        c0VarD.f(Integer.valueOf(iJ), function2B);
                                    }
                                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                    if (z10) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    sp spVar4 = spVar3;
                                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                                    if (z10) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                                    androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar.g6(f12) - dVar.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                                    Unit unit = Unit.f312394a;
                                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                                    objI0 = c0VarR.i0();
                                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                        c0VarR.Y(objI0);
                                    }
                                    androidx.compose.material3.internal.z2 z2Var = (androidx.compose.material3.internal.z2) objI0;
                                    if (function8 != null) {
                                        c0VarR.E(-1825624334);
                                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                        c0VarR.A();
                                    } else {
                                        c0VarR.E(-1825528978);
                                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                        c0VarR.A();
                                    }
                                    androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var), c0VarR, 54);
                                    androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar4, q3VarI), c0VarR, 54);
                                    zD2 = c0VarR.D(n7VarF);
                                    objI1 = c0VarR.i0();
                                    if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(eq.m(n7VarF));
                                            }
                                        };
                                        c0VarR.Y(objI1);
                                    }
                                    Function0 function10 = (Function0) objI1;
                                    zD3 = c0VarR.D(n7VarF2);
                                    objI2 = c0VarR.i0();
                                    if (zD3 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Float.valueOf(eq.n(n7VarF2));
                                            }
                                        };
                                        c0VarR.Y(objI2);
                                    }
                                    p(cVarE3, cVarE4, cVarE, cVar, z20, function10, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                                    c0VarR.o();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    spVar2 = spVar4;
                                    c0Var2 = c0VarR;
                                    z17 = z20;
                                    z16 = z21;
                                    a0Var2 = a0Var3;
                                    jVar2 = jVar;
                                    function6 = function8;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    spVar3 = spVar;
                                }
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                i21 = i12;
                                androidx.compose.ui.a0 a0Var4 = a0Var2;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                                }
                                if (jVar == null) {
                                    c0VarR.E(253288608);
                                    objI3 = c0VarR.i0();
                                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI3 = androidx.compose.foundation.interaction.i.a();
                                        c0VarR.Y(objI3);
                                    }
                                    c0VarR.A();
                                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                                } else {
                                    c0VarR.E(1947832599);
                                    c0VarR.A();
                                    jVar3 = jVar;
                                }
                                d0.h1 h1Var2 = d0.h1.DefaultEffects;
                                y0VarB = hm.b(h1Var2, c0VarR, 6);
                                boolean z22 = z19;
                                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                                if (function7 == null) {
                                    c0VarR.E(254215848);
                                    c0VarR.A();
                                    function8 = function7;
                                    cVar = null;
                                } else {
                                    c0VarR.E(254215849);
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function7;
                                    function8 = function11;
                                    androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11), c0VarR, 54);
                                    c0VarR.A();
                                    cVar = cVarE6;
                                }
                                boolean z23 = z18;
                                jVar4 = jVar3;
                                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var4, z10, jVar4, null, z23, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                                float f13 = f27406g;
                                androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.layout.i6.D(a0VarB2, f13, 0.0f, 2, null);
                                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
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
                                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                                androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar2.e());
                                androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
                                function2B = aVar2.b();
                                if (c0VarD.P()) {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                } else {
                                    c0VarD.Y(Integer.valueOf(iJ));
                                    c0VarD.f(Integer.valueOf(iJ), function2B);
                                }
                                androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                                if (z10) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                sp spVar5 = spVar3;
                                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var2, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                                if (z10) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                                androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar2.g6(f13) - dVar2.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                                Unit unit2 = Unit.f312394a;
                                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                                objI0 = c0VarR.i0();
                                if (zD) {
                                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                    c0VarR.Y(objI0);
                                }
                                androidx.compose.material3.internal.z2 z2Var2 = (androidx.compose.material3.internal.z2) objI0;
                                if (function8 != null) {
                                    c0VarR.E(-1825624334);
                                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(-1825528978);
                                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                    c0VarR.A();
                                }
                                androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var2), c0VarR, 54);
                                androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar5, q3VarI), c0VarR, 54);
                                zD2 = c0VarR.D(n7VarF);
                                objI1 = c0VarR.i0();
                                if (zD2) {
                                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(eq.m(n7VarF));
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(eq.m(n7VarF));
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                Function0 function12 = (Function0) objI1;
                                zD3 = c0VarR.D(n7VarF2);
                                objI2 = c0VarR.i0();
                                if (zD3) {
                                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(eq.n(n7VarF2));
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                } else {
                                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(eq.n(n7VarF2));
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                p(cVarE7, cVarE8, cVarE5, cVar, z22, function12, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                                c0VarR.o();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                spVar2 = spVar5;
                                c0Var2 = c0VarR;
                                z17 = z22;
                                z16 = z23;
                                a0Var2 = a0Var4;
                                jVar2 = jVar;
                                function6 = function8;
                            } else {
                                c0VarR.u();
                                jVar2 = jVar;
                                z16 = z13;
                                c0Var2 = c0VarR;
                                z17 = z14;
                                function6 = function5;
                                spVar2 = spVar;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 100663296;
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            } else {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            }
                            i21 = i12;
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                            }
                            if (jVar == null) {
                                c0VarR.E(253288608);
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI3);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                            } else {
                                c0VarR.E(1947832599);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var3 = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var3, c0VarR, 6);
                            boolean z24 = z19;
                            androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                            if (function7 == null) {
                                c0VarR.E(254215848);
                                c0VarR.A();
                                function8 = function7;
                                cVar = null;
                            } else {
                                c0VarR.E(254215849);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function7;
                                function8 = function13;
                                androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function13), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE10;
                            }
                            boolean z25 = z18;
                            jVar4 = jVar3;
                            androidx.compose.ui.a0 a0VarB3 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var5, z10, jVar4, null, z25, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                            float f14 = f27406g;
                            androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.layout.i6.D(a0VarB3, f14, 0.0f, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarD3);
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
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar3.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                            androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sp spVar6 = spVar3;
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var3, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar3.g6(f14) - dVar3.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                            Unit unit3 = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI0 = c0VarR.i0();
                            if (zD) {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.material3.internal.z2 z2Var3 = (androidx.compose.material3.internal.z2) objI0;
                            if (function8 != null) {
                                c0VarR.E(-1825624334);
                                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1825528978);
                                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var3), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar6, q3VarI), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI1 = c0VarR.i0();
                            if (zD2) {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            Function0 function14 = (Function0) objI1;
                            zD3 = c0VarR.D(n7VarF2);
                            objI2 = c0VarR.i0();
                            if (zD3) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            p(cVarE11, cVarE12, cVarE9, cVar, z24, function14, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            spVar2 = spVar6;
                            c0Var2 = c0VarR;
                            z17 = z24;
                            z16 = z25;
                            a0Var2 = a0Var5;
                            jVar2 = jVar;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            jVar2 = jVar;
                            z16 = z13;
                            c0Var2 = c0VarR;
                            z17 = z14;
                            function6 = function5;
                            spVar2 = spVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    c10 = ' ';
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            } else {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            }
                            i21 = i12;
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                            }
                            if (jVar == null) {
                                c0VarR.E(253288608);
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI3);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                            } else {
                                c0VarR.E(1947832599);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var4 = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var4, c0VarR, 6);
                            boolean z26 = z19;
                            androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                            if (function7 == null) {
                                c0VarR.E(254215848);
                                c0VarR.A();
                                function8 = function7;
                                cVar = null;
                            } else {
                                c0VarR.E(254215849);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function7;
                                function8 = function15;
                                androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function15), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE14;
                            }
                            boolean z27 = z18;
                            jVar4 = jVar3;
                            androidx.compose.ui.a0 a0VarB4 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var6, z10, jVar4, null, z27, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                            float f15 = f27406g;
                            androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.layout.i6.D(a0VarB4, f15, 0.0f, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarD4);
                            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                            function0A = aVar4.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar4.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                            function2B = aVar4.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                            androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sp spVar7 = spVar3;
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var4, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar4 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar4.g6(f15) - dVar4.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                            Unit unit4 = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI0 = c0VarR.i0();
                            if (zD) {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.material3.internal.z2 z2Var4 = (androidx.compose.material3.internal.z2) objI0;
                            if (function8 != null) {
                                c0VarR.E(-1825624334);
                                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1825528978);
                                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var4), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar7, q3VarI), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI1 = c0VarR.i0();
                            if (zD2) {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            Function0 function16 = (Function0) objI1;
                            zD3 = c0VarR.D(n7VarF2);
                            objI2 = c0VarR.i0();
                            if (zD3) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            p(cVarE15, cVarE16, cVarE13, cVar, z26, function16, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            spVar2 = spVar7;
                            c0Var2 = c0VarR;
                            z17 = z26;
                            z16 = z27;
                            a0Var2 = a0Var6;
                            jVar2 = jVar;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            jVar2 = jVar;
                            z16 = z13;
                            c0Var2 = c0VarR;
                            z17 = z14;
                            function6 = function5;
                            spVar2 = spVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var5 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var5, c0VarR, 6);
                        boolean z28 = z19;
                        androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function7;
                            function8 = function17;
                            androidx.compose.runtime.internal.c cVarE18 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function17), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE18;
                        }
                        boolean z29 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB5 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var7, z10, jVar4, null, z29, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f16 = f27406g;
                        androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.layout.i6.D(a0VarB5, f16, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarD5);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        function0A = aVar5.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar5.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                        function2B = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar8 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var5, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar5 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar5.g6(f16) - dVar5.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit5 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var5 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE19 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var5), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar8, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function18 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE19, cVarE110, cVarE17, cVar, z28, function18, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar8;
                        c0Var2 = c0VarR;
                        z17 = z28;
                        z16 = z29;
                        a0Var2 = a0Var7;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                i17 = i11 & 64;
                if (i17 != 0) {
                    z14 = z12;
                    if ((i10 & 1572864) == 0) {
                        c10 = ' ';
                        if (c0VarR.G(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            } else {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            }
                            i21 = i12;
                            androidx.compose.ui.a0 a0Var8 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                            }
                            if (jVar == null) {
                                c0VarR.E(253288608);
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI3);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                            } else {
                                c0VarR.E(1947832599);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var6 = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var6, c0VarR, 6);
                            boolean z210 = z19;
                            androidx.compose.runtime.internal.c cVarE111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                            if (function7 == null) {
                                c0VarR.E(254215848);
                                c0VarR.A();
                                function8 = function7;
                                cVar = null;
                            } else {
                                c0VarR.E(254215849);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function7;
                                function8 = function19;
                                androidx.compose.runtime.internal.c cVarE112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function19), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE112;
                            }
                            boolean z211 = z18;
                            jVar4 = jVar3;
                            androidx.compose.ui.a0 a0VarB6 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var8, z10, jVar4, null, z211, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                            float f17 = f27406g;
                            androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.layout.i6.D(a0VarB6, f17, 0.0f, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarD6);
                            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                            function0A = aVar6.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar6.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                            function2B = aVar6.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                            androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sp spVar9 = spVar3;
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var6, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar6 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar6.g6(f17) - dVar6.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                            Unit unit6 = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI0 = c0VarR.i0();
                            if (zD) {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.material3.internal.z2 z2Var6 = (androidx.compose.material3.internal.z2) objI0;
                            if (function8 != null) {
                                c0VarR.E(-1825624334);
                                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1825528978);
                                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVarE113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var6), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar9, q3VarI), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI1 = c0VarR.i0();
                            if (zD2) {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            Function0 function110 = (Function0) objI1;
                            zD3 = c0VarR.D(n7VarF2);
                            objI2 = c0VarR.i0();
                            if (zD3) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            p(cVarE113, cVarE114, cVarE111, cVar, z210, function110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            spVar2 = spVar9;
                            c0Var2 = c0VarR;
                            z17 = z210;
                            z16 = z211;
                            a0Var2 = a0Var8;
                            jVar2 = jVar;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            jVar2 = jVar;
                            z16 = z13;
                            c0Var2 = c0VarR;
                            z17 = z14;
                            function6 = function5;
                            spVar2 = spVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var7 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var7, c0VarR, 6);
                        boolean z212 = z19;
                        androidx.compose.runtime.internal.c cVarE115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function7;
                            function8 = function111;
                            androidx.compose.runtime.internal.c cVarE116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE116;
                        }
                        boolean z213 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB7 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var9, z10, jVar4, null, z213, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f18 = f27406g;
                        androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.layout.i6.D(a0VarB7, f18, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarD7);
                        androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                        function0A = aVar7.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar7.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                        function2B = aVar7.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                        androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar10 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var7, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar7 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar7.g6(f18) - dVar7.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit7 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var7 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var7), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar10, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function112 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE117, cVarE118, cVarE115, cVar, z212, function112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar10;
                        c0Var2 = c0VarR;
                        z17 = z212;
                        z16 = z213;
                        a0Var2 = a0Var9;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                c10 = ' ';
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var8 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var8, c0VarR, 6);
                        boolean z214 = z19;
                        androidx.compose.runtime.internal.c cVarE119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function7;
                            function8 = function113;
                            androidx.compose.runtime.internal.c cVarE1110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function113), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE1110;
                        }
                        boolean z215 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB8 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var10, z10, jVar4, null, z215, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f19 = f27406g;
                        androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.layout.i6.D(a0VarB8, f19, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarD8);
                        androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                        function0A = aVar8.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar8.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                        androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar11 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var8, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar8 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar8.g6(f19) - dVar8.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit8 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var8 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE1111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var8), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE1112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar11, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function114 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE1111, cVarE1112, cVarE119, cVar, z214, function114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar11;
                        c0Var2 = c0VarR;
                        z17 = z214;
                        z16 = z215;
                        a0Var2 = a0Var10;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var9 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var9, c0VarR, 6);
                    boolean z216 = z19;
                    androidx.compose.runtime.internal.c cVarE1113 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function115 = function7;
                        function8 = function115;
                        androidx.compose.runtime.internal.c cVarE1114 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function115), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE1114;
                    }
                    boolean z217 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB9 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var11, z10, jVar4, null, z217, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f110 = f27406g;
                    androidx.compose.ui.a0 a0VarD9 = androidx.compose.foundation.layout.i6.D(a0VarB9, f110, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarD9);
                    androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                    function0A = aVar9.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK9, aVar9.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar9.g());
                    function2B = aVar9.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                    androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar12 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var9, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar9 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar9.g6(f110) - dVar9.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit9 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var9 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE1115 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var9), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1116 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar12, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function116 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE1115, cVarE1116, cVarE1113, cVar, z216, function116, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar12;
                    c0Var2 = c0VarR;
                    z17 = z216;
                    z16 = z217;
                    a0Var2 = a0Var11;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    z14 = z12;
                    if ((i10 & 1572864) == 0) {
                        c10 = ' ';
                        if (c0VarR.G(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            } else {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            }
                            i21 = i12;
                            androidx.compose.ui.a0 a0Var12 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                            }
                            if (jVar == null) {
                                c0VarR.E(253288608);
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI3);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                            } else {
                                c0VarR.E(1947832599);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var10 = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var10, c0VarR, 6);
                            boolean z218 = z19;
                            androidx.compose.runtime.internal.c cVarE1117 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                            if (function7 == null) {
                                c0VarR.E(254215848);
                                c0VarR.A();
                                function8 = function7;
                                cVar = null;
                            } else {
                                c0VarR.E(254215849);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function117 = function7;
                                function8 = function117;
                                androidx.compose.runtime.internal.c cVarE1118 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function117), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE1118;
                            }
                            boolean z219 = z18;
                            jVar4 = jVar3;
                            androidx.compose.ui.a0 a0VarB10 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var12, z10, jVar4, null, z219, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                            float f111 = f27406g;
                            androidx.compose.ui.a0 a0VarD10 = androidx.compose.foundation.layout.i6.D(a0VarB10, f111, 0.0f, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarD10);
                            androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                            function0A = aVar10.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK10, aVar10.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar10.g());
                            function2B = aVar10.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                            androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sp spVar13 = spVar3;
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var10, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar10 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar10.g6(f111) - dVar10.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                            Unit unit10 = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI0 = c0VarR.i0();
                            if (zD) {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.material3.internal.z2 z2Var10 = (androidx.compose.material3.internal.z2) objI0;
                            if (function8 != null) {
                                c0VarR.E(-1825624334);
                                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1825528978);
                                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVarE1119 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var10), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE11110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar13, q3VarI), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI1 = c0VarR.i0();
                            if (zD2) {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            Function0 function118 = (Function0) objI1;
                            zD3 = c0VarR.D(n7VarF2);
                            objI2 = c0VarR.i0();
                            if (zD3) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            p(cVarE1119, cVarE11110, cVarE1117, cVar, z218, function118, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            spVar2 = spVar13;
                            c0Var2 = c0VarR;
                            z17 = z218;
                            z16 = z219;
                            a0Var2 = a0Var12;
                            jVar2 = jVar;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            jVar2 = jVar;
                            z16 = z13;
                            c0Var2 = c0VarR;
                            z17 = z14;
                            function6 = function5;
                            spVar2 = spVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var11 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var11, c0VarR, 6);
                        boolean z2110 = z19;
                        androidx.compose.runtime.internal.c cVarE11111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function119 = function7;
                            function8 = function119;
                            androidx.compose.runtime.internal.c cVarE11112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function119), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11112;
                        }
                        boolean z2111 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB11 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var13, z10, jVar4, null, z2111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f112 = f27406g;
                        androidx.compose.ui.a0 a0VarD11 = androidx.compose.foundation.layout.i6.D(a0VarB11, f112, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarD11);
                        androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                        function0A = aVar11.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK11, aVar11.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar11.g());
                        function2B = aVar11.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                        androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar14 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var11, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar11 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar11.g6(f112) - dVar11.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit11 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var11 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE11113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var11), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE11114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar14, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function1110 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE11113, cVarE11114, cVarE11111, cVar, z2110, function1110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar14;
                        c0Var2 = c0VarR;
                        z17 = z2110;
                        z16 = z2111;
                        a0Var2 = a0Var13;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                c10 = ' ';
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var12 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var12, c0VarR, 6);
                        boolean z2112 = z19;
                        androidx.compose.runtime.internal.c cVarE11115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111 = function7;
                            function8 = function1111;
                            androidx.compose.runtime.internal.c cVarE11116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11116;
                        }
                        boolean z2113 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB12 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var14, z10, jVar4, null, z2113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f113 = f27406g;
                        androidx.compose.ui.a0 a0VarD12 = androidx.compose.foundation.layout.i6.D(a0VarB12, f113, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarD12);
                        androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                        function0A = aVar12.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK12, aVar12.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar12.g());
                        function2B = aVar12.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                        androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar15 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var12, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar12 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar12.g6(f113) - dVar12.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit12 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var12 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE11117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var12), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE11118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar15, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function1112 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE11117, cVarE11118, cVarE11115, cVar, z2112, function1112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar15;
                        c0Var2 = c0VarR;
                        z17 = z2112;
                        z16 = z2113;
                        a0Var2 = a0Var14;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var13 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var13, c0VarR, 6);
                    boolean z2114 = z19;
                    androidx.compose.runtime.internal.c cVarE11119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1113 = function7;
                        function8 = function1113;
                        androidx.compose.runtime.internal.c cVarE111110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1113), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111110;
                    }
                    boolean z2115 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB13 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var15, z10, jVar4, null, z2115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f114 = f27406g;
                    androidx.compose.ui.a0 a0VarD13 = androidx.compose.foundation.layout.i6.D(a0VarB13, f114, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarD13);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    function0A = aVar13.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar13.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar13.g());
                    function2B = aVar13.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar16 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var13, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar13 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar13.g6(f114) - dVar13.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit13 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var13 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE111111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var13), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE111112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar16, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function1114 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE111111, cVarE111112, cVarE11119, cVar, z2114, function1114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar16;
                    c0Var2 = c0VarR;
                    z17 = z2114;
                    z16 = z2115;
                    a0Var2 = a0Var15;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                z14 = z12;
                if ((i10 & 1572864) == 0) {
                    c10 = ' ';
                    if (c0VarR.G(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var16 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var14 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var14, c0VarR, 6);
                        boolean z2116 = z19;
                        androidx.compose.runtime.internal.c cVarE111113 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1115 = function7;
                            function8 = function1115;
                            androidx.compose.runtime.internal.c cVarE111114 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1115), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE111114;
                        }
                        boolean z2117 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB14 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var16, z10, jVar4, null, z2117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f115 = f27406g;
                        androidx.compose.ui.a0 a0VarD14 = androidx.compose.foundation.layout.i6.D(a0VarB14, f115, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarD14);
                        androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                        function0A = aVar14.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK14, aVar14.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar14.g());
                        function2B = aVar14.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                        androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar17 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var14, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar14 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar14.g6(f115) - dVar14.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit14 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var14 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE111115 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var14), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE111116 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar17, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function1116 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE111115, cVarE111116, cVarE111113, cVar, z2116, function1116, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar17;
                        c0Var2 = c0VarR;
                        z17 = z2116;
                        z16 = z2117;
                        a0Var2 = a0Var16;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var15 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var15, c0VarR, 6);
                    boolean z2118 = z19;
                    androidx.compose.runtime.internal.c cVarE111117 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1117 = function7;
                        function8 = function1117;
                        androidx.compose.runtime.internal.c cVarE111118 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1117), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111118;
                    }
                    boolean z2119 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB15 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var17, z10, jVar4, null, z2119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f116 = f27406g;
                    androidx.compose.ui.a0 a0VarD15 = androidx.compose.foundation.layout.i6.D(a0VarB15, f116, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarD15);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    function0A = aVar15.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK15, aVar15.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                    androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar18 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var15, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar15 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar15.g6(f116) - dVar15.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit15 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var15 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE111119 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var15), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1111110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar18, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function1118 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE111119, cVarE1111110, cVarE111117, cVar, z2118, function1118, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar18;
                    c0Var2 = c0VarR;
                    z17 = z2118;
                    z16 = z2119;
                    a0Var2 = a0Var17;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            c10 = ' ';
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var16 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var16, c0VarR, 6);
                    boolean z21110 = z19;
                    androidx.compose.runtime.internal.c cVarE1111111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1119 = function7;
                        function8 = function1119;
                        androidx.compose.runtime.internal.c cVarE1111112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1119), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE1111112;
                    }
                    boolean z21111 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB16 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var18, z10, jVar4, null, z21111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f117 = f27406g;
                    androidx.compose.ui.a0 a0VarD16 = androidx.compose.foundation.layout.i6.D(a0VarB16, f117, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarD16);
                    androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                    function0A = aVar16.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK16, aVar16.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar16.g());
                    function2B = aVar16.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
                    androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar19 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var16, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar16 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar16.g6(f117) - dVar16.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit16 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var16 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE1111113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var16), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1111114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar19, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function11110 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE1111113, cVarE1111114, cVarE1111111, cVar, z21110, function11110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar19;
                    c0Var2 = c0VarR;
                    z17 = z21110;
                    z16 = z21111;
                    a0Var2 = a0Var18;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                }
                i21 = i12;
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                }
                if (jVar == null) {
                    c0VarR.E(253288608);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                } else {
                    c0VarR.E(1947832599);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var17 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var17, c0VarR, 6);
                boolean z21112 = z19;
                androidx.compose.runtime.internal.c cVarE1111115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                if (function7 == null) {
                    c0VarR.E(254215848);
                    c0VarR.A();
                    function8 = function7;
                    cVar = null;
                } else {
                    c0VarR.E(254215849);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111 = function7;
                    function8 = function11111;
                    androidx.compose.runtime.internal.c cVarE1111116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11111), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1111116;
                }
                boolean z21113 = z18;
                jVar4 = jVar3;
                androidx.compose.ui.a0 a0VarB17 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var19, z10, jVar4, null, z21113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                float f118 = f27406g;
                androidx.compose.ui.a0 a0VarD17 = androidx.compose.foundation.layout.i6.D(a0VarB17, f118, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK17 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarD17);
                androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                function0A = aVar17.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK17, aVar17.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK17, aVar17.g());
                function2B = aVar17.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN17, aVar17.f());
                androidx.compose.foundation.layout.d0 d0Var17 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sp spVar110 = spVar3;
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var17, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar17 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar17.g6(f118) - dVar17.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                Unit unit17 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.material3.internal.z2 z2Var17 = (androidx.compose.material3.internal.z2) objI0;
                if (function8 != null) {
                    c0VarR.E(-1825624334);
                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1825528978);
                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVarE1111117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var17), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1111118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar110, q3VarI), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI1 = c0VarR.i0();
                if (zD2) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function11112 = (Function0) objI1;
                zD3 = c0VarR.D(n7VarF2);
                objI2 = c0VarR.i0();
                if (zD3) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                p(cVarE1111117, cVarE1111118, cVarE1111115, cVar, z21112, function11112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                spVar2 = spVar110;
                c0Var2 = c0VarR;
                z17 = z21112;
                z16 = z21113;
                a0Var2 = a0Var19;
                jVar2 = jVar;
                function6 = function8;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                z16 = z13;
                c0Var2 = c0VarR;
                z17 = z14;
                function6 = function5;
                spVar2 = spVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    z14 = z12;
                    if ((i10 & 1572864) == 0) {
                        c10 = ' ';
                        if (c0VarR.G(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            } else {
                                if (i22 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function5 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    spVarA = tp.f33241a.a(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    spVarA = spVar;
                                }
                                if (i19 != 0) {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                    jVar = null;
                                } else {
                                    spVar3 = spVarA;
                                    z18 = z13;
                                    z19 = z14;
                                    function7 = function5;
                                }
                            }
                            i21 = i12;
                            androidx.compose.ui.a0 a0Var110 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                            }
                            if (jVar == null) {
                                c0VarR.E(253288608);
                                objI3 = c0VarR.i0();
                                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI3);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                            } else {
                                c0VarR.E(1947832599);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var18 = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var18, c0VarR, 6);
                            boolean z21114 = z19;
                            androidx.compose.runtime.internal.c cVarE1111119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                            if (function7 == null) {
                                c0VarR.E(254215848);
                                c0VarR.A();
                                function8 = function7;
                                cVar = null;
                            } else {
                                c0VarR.E(254215849);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11113 = function7;
                                function8 = function11113;
                                androidx.compose.runtime.internal.c cVarE11111110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11113), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE11111110;
                            }
                            boolean z21115 = z18;
                            jVar4 = jVar3;
                            androidx.compose.ui.a0 a0VarB18 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var110, z10, jVar4, null, z21115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                            float f119 = f27406g;
                            androidx.compose.ui.a0 a0VarD18 = androidx.compose.foundation.layout.i6.D(a0VarB18, f119, 0.0f, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK18 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarD18);
                            androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                            function0A = aVar18.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK18, aVar18.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK18, aVar18.g());
                            function2B = aVar18.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN18, aVar18.f());
                            androidx.compose.foundation.layout.d0 d0Var18 = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sp spVar111 = spVar3;
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var18, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar18 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar18.g6(f119) - dVar18.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                            Unit unit18 = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI0 = c0VarR.i0();
                            if (zD) {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.material3.internal.z2 z2Var18 = (androidx.compose.material3.internal.z2) objI0;
                            if (function8 != null) {
                                c0VarR.E(-1825624334);
                                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1825528978);
                                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVarE11111111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var18), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE11111112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar111, q3VarI), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI1 = c0VarR.i0();
                            if (zD2) {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.m(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            Function0 function11114 = (Function0) objI1;
                            zD3 = c0VarR.D(n7VarF2);
                            objI2 = c0VarR.i0();
                            if (zD3) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(eq.n(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            p(cVarE11111111, cVarE11111112, cVarE1111119, cVar, z21114, function11114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            spVar2 = spVar111;
                            c0Var2 = c0VarR;
                            z17 = z21114;
                            z16 = z21115;
                            a0Var2 = a0Var110;
                            jVar2 = jVar;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            jVar2 = jVar;
                            z16 = z13;
                            c0Var2 = c0VarR;
                            z17 = z14;
                            function6 = function5;
                            spVar2 = spVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var111 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var19 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var19, c0VarR, 6);
                        boolean z21116 = z19;
                        androidx.compose.runtime.internal.c cVarE11111113 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11115 = function7;
                            function8 = function11115;
                            androidx.compose.runtime.internal.c cVarE11111114 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11115), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11111114;
                        }
                        boolean z21117 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB19 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var111, z10, jVar4, null, z21117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f1110 = f27406g;
                        androidx.compose.ui.a0 a0VarD19 = androidx.compose.foundation.layout.i6.D(a0VarB19, f1110, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK19 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarD19);
                        androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                        function0A = aVar19.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK19, aVar19.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK19, aVar19.g());
                        function2B = aVar19.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN19, aVar19.f());
                        androidx.compose.foundation.layout.d0 d0Var19 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar112 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var19, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar19 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar19.g6(f1110) - dVar19.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit19 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var19 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE11111115 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var19), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE11111116 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar112, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function11116 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE11111115, cVarE11111116, cVarE11111113, cVar, z21116, function11116, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar112;
                        c0Var2 = c0VarR;
                        z17 = z21116;
                        z16 = z21117;
                        a0Var2 = a0Var111;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z14 = z12;
                c10 = ' ';
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var112 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var110 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var110, c0VarR, 6);
                        boolean z21118 = z19;
                        androidx.compose.runtime.internal.c cVarE11111117 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11117 = function7;
                            function8 = function11117;
                            androidx.compose.runtime.internal.c cVarE11111118 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11117), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11111118;
                        }
                        boolean z21119 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB110 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var112, z10, jVar4, null, z21119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f1111 = f27406g;
                        androidx.compose.ui.a0 a0VarD110 = androidx.compose.foundation.layout.i6.D(a0VarB110, f1111, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarD110);
                        androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                        function0A = aVar110.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK110, aVar110.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK110, aVar110.g());
                        function2B = aVar110.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN110, aVar110.f());
                        androidx.compose.foundation.layout.d0 d0Var110 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar113 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var110, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar110 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar110.g6(f1111) - dVar110.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit110 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var110 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE11111119 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var110), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE111111110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar113, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function11118 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE11111119, cVarE111111110, cVarE11111117, cVar, z21118, function11118, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar113;
                        c0Var2 = c0VarR;
                        z17 = z21118;
                        z16 = z21119;
                        a0Var2 = a0Var112;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var113 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var111 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var111, c0VarR, 6);
                    boolean z211110 = z19;
                    androidx.compose.runtime.internal.c cVarE111111111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11119 = function7;
                        function8 = function11119;
                        androidx.compose.runtime.internal.c cVarE111111112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11119), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111111112;
                    }
                    boolean z211111 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB111 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var113, z10, jVar4, null, z211111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f1112 = f27406g;
                    androidx.compose.ui.a0 a0VarD111 = androidx.compose.foundation.layout.i6.D(a0VarB111, f1112, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarD111);
                    androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                    function0A = aVar111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK111, aVar111.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK111, aVar111.g());
                    function2B = aVar111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN111, aVar111.f());
                    androidx.compose.foundation.layout.d0 d0Var111 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar114 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var111, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar111 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar111.g6(f1112) - dVar111.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit111 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var111 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE111111113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var111), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE111111114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar114, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function111110 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE111111113, cVarE111111114, cVarE111111111, cVar, z211110, function111110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar114;
                    c0Var2 = c0VarR;
                    z17 = z211110;
                    z16 = z211111;
                    a0Var2 = a0Var113;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                z14 = z12;
                if ((i10 & 1572864) == 0) {
                    c10 = ' ';
                    if (c0VarR.G(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var114 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var112 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var112, c0VarR, 6);
                        boolean z211112 = z19;
                        androidx.compose.runtime.internal.c cVarE111111115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111 = function7;
                            function8 = function111111;
                            androidx.compose.runtime.internal.c cVarE111111116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111111), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE111111116;
                        }
                        boolean z211113 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB112 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var114, z10, jVar4, null, z211113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f1113 = f27406g;
                        androidx.compose.ui.a0 a0VarD112 = androidx.compose.foundation.layout.i6.D(a0VarB112, f1113, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarD112);
                        androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                        function0A = aVar112.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK112, aVar112.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK112, aVar112.g());
                        function2B = aVar112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN112, aVar112.f());
                        androidx.compose.foundation.layout.d0 d0Var112 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar115 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var112, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar112 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar112.g6(f1113) - dVar112.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit112 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var112 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE111111117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var112), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE111111118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar115, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function111112 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE111111117, cVarE111111118, cVarE111111115, cVar, z211112, function111112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar115;
                        c0Var2 = c0VarR;
                        z17 = z211112;
                        z16 = z211113;
                        a0Var2 = a0Var114;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var115 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var113 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var113, c0VarR, 6);
                    boolean z211114 = z19;
                    androidx.compose.runtime.internal.c cVarE111111119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111113 = function7;
                        function8 = function111113;
                        androidx.compose.runtime.internal.c cVarE1111111110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111113), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE1111111110;
                    }
                    boolean z211115 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB113 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var115, z10, jVar4, null, z211115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f1114 = f27406g;
                    androidx.compose.ui.a0 a0VarD113 = androidx.compose.foundation.layout.i6.D(a0VarB113, f1114, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarD113);
                    androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                    function0A = aVar113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK113, aVar113.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK113, aVar113.g());
                    function2B = aVar113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN113, aVar113.f());
                    androidx.compose.foundation.layout.d0 d0Var113 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar116 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var113, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar113 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar113.g6(f1114) - dVar113.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit113 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var113 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE1111111111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var113), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1111111112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar116, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function111114 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE1111111111, cVarE1111111112, cVarE111111119, cVar, z211114, function111114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar116;
                    c0Var2 = c0VarR;
                    z17 = z211114;
                    z16 = z211115;
                    a0Var2 = a0Var115;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            c10 = ' ';
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var116 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var114 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var114, c0VarR, 6);
                    boolean z211116 = z19;
                    androidx.compose.runtime.internal.c cVarE1111111113 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111115 = function7;
                        function8 = function111115;
                        androidx.compose.runtime.internal.c cVarE1111111114 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111115), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE1111111114;
                    }
                    boolean z211117 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB114 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var116, z10, jVar4, null, z211117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f1115 = f27406g;
                    androidx.compose.ui.a0 a0VarD114 = androidx.compose.foundation.layout.i6.D(a0VarB114, f1115, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarD114);
                    androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                    function0A = aVar114.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK114, aVar114.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK114, aVar114.g());
                    function2B = aVar114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN114, aVar114.f());
                    androidx.compose.foundation.layout.d0 d0Var114 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar117 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var114, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar114 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar114.g6(f1115) - dVar114.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit114 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var114 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE1111111115 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var114), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1111111116 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar117, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function111116 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE1111111115, cVarE1111111116, cVarE1111111113, cVar, z211116, function111116, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar117;
                    c0Var2 = c0VarR;
                    z17 = z211116;
                    z16 = z211117;
                    a0Var2 = a0Var116;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                }
                i21 = i12;
                androidx.compose.ui.a0 a0Var117 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                }
                if (jVar == null) {
                    c0VarR.E(253288608);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                } else {
                    c0VarR.E(1947832599);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var115 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var115, c0VarR, 6);
                boolean z211118 = z19;
                androidx.compose.runtime.internal.c cVarE1111111117 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                if (function7 == null) {
                    c0VarR.E(254215848);
                    c0VarR.A();
                    function8 = function7;
                    cVar = null;
                } else {
                    c0VarR.E(254215849);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111117 = function7;
                    function8 = function111117;
                    androidx.compose.runtime.internal.c cVarE1111111118 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111117), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1111111118;
                }
                boolean z211119 = z18;
                jVar4 = jVar3;
                androidx.compose.ui.a0 a0VarB115 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var117, z10, jVar4, null, z211119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                float f1116 = f27406g;
                androidx.compose.ui.a0 a0VarD115 = androidx.compose.foundation.layout.i6.D(a0VarB115, f1116, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarD115);
                androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                function0A = aVar115.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK115, aVar115.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK115, aVar115.g());
                function2B = aVar115.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN115, aVar115.f());
                androidx.compose.foundation.layout.d0 d0Var115 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sp spVar118 = spVar3;
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var115, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar115 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar115.g6(f1116) - dVar115.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                Unit unit115 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.material3.internal.z2 z2Var115 = (androidx.compose.material3.internal.z2) objI0;
                if (function8 != null) {
                    c0VarR.E(-1825624334);
                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1825528978);
                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVarE1111111119 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var115), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11111111110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar118, q3VarI), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI1 = c0VarR.i0();
                if (zD2) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function111118 = (Function0) objI1;
                zD3 = c0VarR.D(n7VarF2);
                objI2 = c0VarR.i0();
                if (zD3) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                p(cVarE1111111119, cVarE11111111110, cVarE1111111117, cVar, z211118, function111118, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                spVar2 = spVar118;
                c0Var2 = c0VarR;
                z17 = z211118;
                z16 = z211119;
                a0Var2 = a0Var117;
                jVar2 = jVar;
                function6 = function8;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                z16 = z13;
                c0Var2 = c0VarR;
                z17 = z14;
                function6 = function5;
                spVar2 = spVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                z14 = z12;
                if ((i10 & 1572864) == 0) {
                    c10 = ' ';
                    if (c0VarR.G(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                spVarA = tp.f33241a.a(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                spVarA = spVar;
                            }
                            if (i19 != 0) {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                                jVar = null;
                            } else {
                                spVar3 = spVarA;
                                z18 = z13;
                                z19 = z14;
                                function7 = function5;
                            }
                        }
                        i21 = i12;
                        androidx.compose.ui.a0 a0Var118 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                        }
                        if (jVar == null) {
                            c0VarR.E(253288608);
                            objI3 = c0VarR.i0();
                            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI3 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI3);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                        } else {
                            c0VarR.E(1947832599);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var116 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var116, c0VarR, 6);
                        boolean z2111110 = z19;
                        androidx.compose.runtime.internal.c cVarE11111111111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                        if (function7 == null) {
                            c0VarR.E(254215848);
                            c0VarR.A();
                            function8 = function7;
                            cVar = null;
                        } else {
                            c0VarR.E(254215849);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111119 = function7;
                            function8 = function111119;
                            androidx.compose.runtime.internal.c cVarE11111111112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function111119), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE11111111112;
                        }
                        boolean z2111111 = z18;
                        jVar4 = jVar3;
                        androidx.compose.ui.a0 a0VarB116 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var118, z10, jVar4, null, z2111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                        float f1117 = f27406g;
                        androidx.compose.ui.a0 a0VarD116 = androidx.compose.foundation.layout.i6.D(a0VarB116, f1117, 0.0f, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarD116);
                        androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                        function0A = aVar116.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK116, aVar116.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK116, aVar116.g());
                        function2B = aVar116.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN116, aVar116.f());
                        androidx.compose.foundation.layout.d0 d0Var116 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sp spVar119 = spVar3;
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var116, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar116 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((dVar116.g6(f1117) - dVar116.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                        Unit unit116 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI0 = c0VarR.i0();
                        if (zD) {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.material3.internal.z2 z2Var116 = (androidx.compose.material3.internal.z2) objI0;
                        if (function8 != null) {
                            c0VarR.E(-1825624334);
                            q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1825528978);
                            q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVarE11111111113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var116), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE11111111114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar119, q3VarI), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI1 = c0VarR.i0();
                        if (zD2) {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function0() { // from class: androidx.compose.material3.vp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.m(n7VarF));
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        Function0 function1111110 = (Function0) objI1;
                        zD3 = c0VarR.D(n7VarF2);
                        objI2 = c0VarR.i0();
                        if (zD3) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.wp
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(eq.n(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        p(cVarE11111111113, cVarE11111111114, cVarE11111111111, cVar, z2111110, function1111110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        spVar2 = spVar119;
                        c0Var2 = c0VarR;
                        z17 = z2111110;
                        z16 = z2111111;
                        a0Var2 = a0Var118;
                        jVar2 = jVar;
                        function6 = function8;
                    } else {
                        c0VarR.u();
                        jVar2 = jVar;
                        z16 = z13;
                        c0Var2 = c0VarR;
                        z17 = z14;
                        function6 = function5;
                        spVar2 = spVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var119 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var117 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var117, c0VarR, 6);
                    boolean z2111112 = z19;
                    androidx.compose.runtime.internal.c cVarE11111111115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111 = function7;
                        function8 = function1111111;
                        androidx.compose.runtime.internal.c cVarE11111111116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111111), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE11111111116;
                    }
                    boolean z2111113 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB117 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var119, z10, jVar4, null, z2111113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f1118 = f27406g;
                    androidx.compose.ui.a0 a0VarD117 = androidx.compose.foundation.layout.i6.D(a0VarB117, f1118, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarD117);
                    androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                    function0A = aVar117.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK117, aVar117.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK117, aVar117.g());
                    function2B = aVar117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN117, aVar117.f());
                    androidx.compose.foundation.layout.d0 d0Var117 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar1110 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var117, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar117 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar117.g6(f1118) - dVar117.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit117 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var117 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE11111111117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var117), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE11111111118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1110, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function1111112 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE11111111117, cVarE11111111118, cVarE11111111115, cVar, z2111112, function1111112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar1110;
                    c0Var2 = c0VarR;
                    z17 = z2111112;
                    z16 = z2111113;
                    a0Var2 = a0Var119;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z14 = z12;
            c10 = ' ';
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var118 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var118, c0VarR, 6);
                    boolean z2111114 = z19;
                    androidx.compose.runtime.internal.c cVarE11111111119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111113 = function7;
                        function8 = function1111113;
                        androidx.compose.runtime.internal.c cVarE111111111110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111113), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111111111110;
                    }
                    boolean z2111115 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB118 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1110, z10, jVar4, null, z2111115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f1119 = f27406g;
                    androidx.compose.ui.a0 a0VarD118 = androidx.compose.foundation.layout.i6.D(a0VarB118, f1119, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarD118);
                    androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                    function0A = aVar118.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK118, aVar118.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK118, aVar118.g());
                    function2B = aVar118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN118, aVar118.f());
                    androidx.compose.foundation.layout.d0 d0Var118 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar1111 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var118, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar118 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar118.g6(f1119) - dVar118.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit118 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var118 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE111111111111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var118), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE111111111112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1111, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function1111114 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE111111111111, cVarE111111111112, cVarE11111111119, cVar, z2111114, function1111114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar1111;
                    c0Var2 = c0VarR;
                    z17 = z2111114;
                    z16 = z2111115;
                    a0Var2 = a0Var1110;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                }
                i21 = i12;
                androidx.compose.ui.a0 a0Var1111 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                }
                if (jVar == null) {
                    c0VarR.E(253288608);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                } else {
                    c0VarR.E(1947832599);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var119 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var119, c0VarR, 6);
                boolean z2111116 = z19;
                androidx.compose.runtime.internal.c cVarE111111111113 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                if (function7 == null) {
                    c0VarR.E(254215848);
                    c0VarR.A();
                    function8 = function7;
                    cVar = null;
                } else {
                    c0VarR.E(254215849);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111115 = function7;
                    function8 = function1111115;
                    androidx.compose.runtime.internal.c cVarE111111111114 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111115), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE111111111114;
                }
                boolean z2111117 = z18;
                jVar4 = jVar3;
                androidx.compose.ui.a0 a0VarB119 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1111, z10, jVar4, null, z2111117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                float f11110 = f27406g;
                androidx.compose.ui.a0 a0VarD119 = androidx.compose.foundation.layout.i6.D(a0VarB119, f11110, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarD119);
                androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                function0A = aVar119.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK119, aVar119.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK119, aVar119.g());
                function2B = aVar119.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN119, aVar119.f());
                androidx.compose.foundation.layout.d0 d0Var119 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sp spVar1112 = spVar3;
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var119, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar119 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar119.g6(f11110) - dVar119.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                Unit unit119 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.material3.internal.z2 z2Var119 = (androidx.compose.material3.internal.z2) objI0;
                if (function8 != null) {
                    c0VarR.E(-1825624334);
                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1825528978);
                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVarE111111111115 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var119), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE111111111116 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1112, q3VarI), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI1 = c0VarR.i0();
                if (zD2) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function1111116 = (Function0) objI1;
                zD3 = c0VarR.D(n7VarF2);
                objI2 = c0VarR.i0();
                if (zD3) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                p(cVarE111111111115, cVarE111111111116, cVarE111111111113, cVar, z2111116, function1111116, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                spVar2 = spVar1112;
                c0Var2 = c0VarR;
                z17 = z2111116;
                z16 = z2111117;
                a0Var2 = a0Var1111;
                jVar2 = jVar;
                function6 = function8;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                z16 = z13;
                c0Var2 = c0VarR;
                z17 = z14;
                function6 = function5;
                spVar2 = spVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function5 = function3;
        i17 = i11 & 64;
        if (i17 != 0) {
            z14 = z12;
            if ((i10 & 1572864) == 0) {
                c10 = ' ';
                if (c0VarR.G(z14)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            spVarA = tp.f33241a.a(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            spVarA = spVar;
                        }
                        if (i19 != 0) {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                            jVar = null;
                        } else {
                            spVar3 = spVarA;
                            z18 = z13;
                            z19 = z14;
                            function7 = function5;
                        }
                    }
                    i21 = i12;
                    androidx.compose.ui.a0 a0Var1112 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                    }
                    if (jVar == null) {
                        c0VarR.E(253288608);
                        objI3 = c0VarR.i0();
                        if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI3 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI3);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                    } else {
                        c0VarR.E(1947832599);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var1110 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var1110, c0VarR, 6);
                    boolean z2111118 = z19;
                    androidx.compose.runtime.internal.c cVarE111111111117 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                    if (function7 == null) {
                        c0VarR.E(254215848);
                        c0VarR.A();
                        function8 = function7;
                        cVar = null;
                    } else {
                        c0VarR.E(254215849);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111117 = function7;
                        function8 = function1111117;
                        androidx.compose.runtime.internal.c cVarE111111111118 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111117), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111111111118;
                    }
                    boolean z2111119 = z18;
                    jVar4 = jVar3;
                    androidx.compose.ui.a0 a0VarB1110 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1112, z10, jVar4, null, z2111119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                    float f11111 = f27406g;
                    androidx.compose.ui.a0 a0VarD1110 = androidx.compose.foundation.layout.i6.D(a0VarB1110, f11111, 0.0f, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarD1110);
                    androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                    function0A = aVar1110.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK1110, aVar1110.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK1110, aVar1110.g());
                    function2B = aVar1110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN1110, aVar1110.f());
                    androidx.compose.foundation.layout.d0 d0Var1110 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    sp spVar1113 = spVar3;
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var1110, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar1110 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((dVar1110.g6(f11111) - dVar1110.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                    Unit unit1110 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.material3.internal.z2 z2Var1110 = (androidx.compose.material3.internal.z2) objI0;
                    if (function8 != null) {
                        c0VarR.E(-1825624334);
                        q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1825528978);
                        q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVarE111111111119 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var1110), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE1111111111110 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1113, q3VarI), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI1 = c0VarR.i0();
                    if (zD2) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function0() { // from class: androidx.compose.material3.vp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.m(n7VarF));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function1111118 = (Function0) objI1;
                    zD3 = c0VarR.D(n7VarF2);
                    objI2 = c0VarR.i0();
                    if (zD3) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.wp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(eq.n(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    p(cVarE111111111119, cVarE1111111111110, cVarE111111111117, cVar, z2111118, function1111118, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    spVar2 = spVar1113;
                    c0Var2 = c0VarR;
                    z17 = z2111118;
                    z16 = z2111119;
                    a0Var2 = a0Var1112;
                    jVar2 = jVar;
                    function6 = function8;
                } else {
                    c0VarR.u();
                    jVar2 = jVar;
                    z16 = z13;
                    c0Var2 = c0VarR;
                    z17 = z14;
                    function6 = function5;
                    spVar2 = spVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                }
                i21 = i12;
                androidx.compose.ui.a0 a0Var1113 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                }
                if (jVar == null) {
                    c0VarR.E(253288608);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                } else {
                    c0VarR.E(1947832599);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var1111 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var1111, c0VarR, 6);
                boolean z21111110 = z19;
                androidx.compose.runtime.internal.c cVarE1111111111111 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                if (function7 == null) {
                    c0VarR.E(254215848);
                    c0VarR.A();
                    function8 = function7;
                    cVar = null;
                } else {
                    c0VarR.E(254215849);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111119 = function7;
                    function8 = function1111119;
                    androidx.compose.runtime.internal.c cVarE1111111111112 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function1111119), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1111111111112;
                }
                boolean z21111111 = z18;
                jVar4 = jVar3;
                androidx.compose.ui.a0 a0VarB1111 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1113, z10, jVar4, null, z21111111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                float f11112 = f27406g;
                androidx.compose.ui.a0 a0VarD1111 = androidx.compose.foundation.layout.i6.D(a0VarB1111, f11112, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarD1111);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1111, aVar1111.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1111, aVar1111.g());
                function2B = aVar1111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1111, aVar1111.f());
                androidx.compose.foundation.layout.d0 d0Var1111 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sp spVar1114 = spVar3;
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var1111, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar1111 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar1111.g6(f11112) - dVar1111.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                Unit unit1111 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.material3.internal.z2 z2Var1111 = (androidx.compose.material3.internal.z2) objI0;
                if (function8 != null) {
                    c0VarR.E(-1825624334);
                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1825528978);
                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVarE1111111111113 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var1111), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1111111111114 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1114, q3VarI), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI1 = c0VarR.i0();
                if (zD2) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function11111110 = (Function0) objI1;
                zD3 = c0VarR.D(n7VarF2);
                objI2 = c0VarR.i0();
                if (zD3) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                p(cVarE1111111111113, cVarE1111111111114, cVarE1111111111111, cVar, z21111110, function11111110, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                spVar2 = spVar1114;
                c0Var2 = c0VarR;
                z17 = z21111110;
                z16 = z21111111;
                a0Var2 = a0Var1113;
                jVar2 = jVar;
                function6 = function8;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                z16 = z13;
                c0Var2 = c0VarR;
                z17 = z14;
                function6 = function5;
                spVar2 = spVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        z14 = z12;
        c10 = ' ';
        if ((i10 & 12582912) != 0) {
            i12 |= ((i11 & 128) == 0 || !c0VarR.D(spVar)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        spVarA = tp.f33241a.a(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        spVarA = spVar;
                    }
                    if (i19 != 0) {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                        jVar = null;
                    } else {
                        spVar3 = spVarA;
                        z18 = z13;
                        z19 = z14;
                        function7 = function5;
                    }
                }
                i21 = i12;
                androidx.compose.ui.a0 a0Var1114 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                }
                if (jVar == null) {
                    c0VarR.E(253288608);
                    objI3 = c0VarR.i0();
                    if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI3 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI3);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI3;
                } else {
                    c0VarR.E(1947832599);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var1112 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var1112, c0VarR, 6);
                boolean z21111112 = z19;
                androidx.compose.runtime.internal.c cVarE1111111111115 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
                if (function7 == null) {
                    c0VarR.E(254215848);
                    c0VarR.A();
                    function8 = function7;
                    cVar = null;
                } else {
                    c0VarR.E(254215849);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111 = function7;
                    function8 = function11111111;
                    androidx.compose.runtime.internal.c cVarE1111111111116 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11111111), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1111111111116;
                }
                boolean z21111113 = z18;
                jVar4 = jVar3;
                androidx.compose.ui.a0 a0VarB1112 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1114, z10, jVar4, null, z21111113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
                float f11113 = f27406g;
                androidx.compose.ui.a0 a0VarD1112 = androidx.compose.foundation.layout.i6.D(a0VarB1112, f11113, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK1112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK1112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarD1112);
                androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                function0A = aVar1112.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK1112, aVar1112.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK1112, aVar1112.g());
                function2B = aVar1112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN1112, aVar1112.f());
                androidx.compose.foundation.layout.d0 d0Var1112 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sp spVar1115 = spVar3;
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var1112, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar1112 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((dVar1112.g6(f11113) - dVar1112.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
                Unit unit1112 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI0);
                }
                androidx.compose.material3.internal.z2 z2Var1112 = (androidx.compose.material3.internal.z2) objI0;
                if (function8 != null) {
                    c0VarR.E(-1825624334);
                    q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1825528978);
                    q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVarE1111111111117 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var1112), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1111111111118 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1115, q3VarI), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI1 = c0VarR.i0();
                if (zD2) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.vp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.m(n7VarF));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function11111112 = (Function0) objI1;
                zD3 = c0VarR.D(n7VarF2);
                objI2 = c0VarR.i0();
                if (zD3) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.wp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(eq.n(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI2);
                }
                p(cVarE1111111111117, cVarE1111111111118, cVarE1111111111115, cVar, z21111112, function11111112, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                spVar2 = spVar1115;
                c0Var2 = c0VarR;
                z17 = z21111112;
                z16 = z21111113;
                a0Var2 = a0Var1114;
                jVar2 = jVar;
                function6 = function8;
            } else {
                c0VarR.u();
                jVar2 = jVar;
                z16 = z13;
                c0Var2 = c0VarR;
                z17 = z14;
                function6 = function5;
                spVar2 = spVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i12 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c0VarR.h(z15, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    spVarA = tp.f33241a.a(c0VarR, 6);
                    i12 &= -29360129;
                } else {
                    spVarA = spVar;
                }
                if (i19 != 0) {
                    spVar3 = spVarA;
                    z18 = z13;
                    z19 = z14;
                    function7 = function5;
                    jVar = null;
                } else {
                    spVar3 = spVarA;
                    z18 = z13;
                    z19 = z14;
                    function7 = function5;
                }
            } else {
                if (i22 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    spVarA = tp.f33241a.a(c0VarR, 6);
                    i12 &= -29360129;
                } else {
                    spVarA = spVar;
                }
                if (i19 != 0) {
                    spVar3 = spVarA;
                    z18 = z13;
                    z19 = z14;
                    function7 = function5;
                    jVar = null;
                } else {
                    spVar3 = spVarA;
                    z18 = z13;
                    z19 = z14;
                    function7 = function5;
                }
            }
            i21 = i12;
            androidx.compose.ui.a0 a0Var1115 = a0Var2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1620317701, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
            }
            if (jVar == null) {
                c0VarR.E(253288608);
                objI3 = c0VarR.i0();
                if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI3 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI3);
                }
                c0VarR.A();
                jVar3 = (androidx.compose.foundation.interaction.j) objI3;
            } else {
                c0VarR.E(1947832599);
                c0VarR.A();
                jVar3 = jVar;
            }
            d0.h1 h1Var1113 = d0.h1.DefaultEffects;
            y0VarB = hm.b(h1Var1113, c0VarR, 6);
            boolean z21111114 = z19;
            androidx.compose.runtime.internal.c cVarE1111111111119 = androidx.compose.runtime.internal.w.e(206057749, true, new c(spVar3, z10, z18, y0VarB, function7, z19, function4), c0VarR, 54);
            if (function7 == null) {
                c0VarR.E(254215848);
                c0VarR.A();
                function8 = function7;
                cVar = null;
            } else {
                c0VarR.E(254215849);
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111113 = function7;
                function8 = function11111113;
                androidx.compose.runtime.internal.c cVarE11111111111110 = androidx.compose.runtime.internal.w.e(-2056532825, true, new d(spVar3, z10, z18, y0VarB, function11111113), c0VarR, 54);
                c0VarR.A();
                cVar = cVarE11111111111110;
            }
            boolean z21111115 = z18;
            jVar4 = jVar3;
            androidx.compose.ui.a0 a0VarB1113 = androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var1115, z10, jVar4, null, z21111115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f27407h, 1, null);
            float f11114 = f27406g;
            androidx.compose.ui.a0 a0VarD1113 = androidx.compose.foundation.layout.i6.D(a0VarB1113, f11114, 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarK1113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK1113 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, a0VarD1113);
            androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
            function0A = aVar1113.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK1113, aVar1113.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK1113, aVar1113.g());
            function2B = aVar1113.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN1113, aVar1113.f());
            androidx.compose.foundation.layout.d0 d0Var1113 = androidx.compose.foundation.layout.d0.f15956a;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            sp spVar1116 = spVar3;
            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var1113, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            androidx.compose.ui.unit.d dVar1113 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            jG = n0.g.g((((long) Float.floatToRawIntBits((dVar1113.g6(f11114) - dVar1113.g6(d0.s1.f268847a.b())) / 2)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            Unit unit1113 = Unit.f312394a;
            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                c0VarR.Y(objI0);
            } else {
                objI0 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.material3.internal.z2 z2Var1113 = (androidx.compose.material3.internal.z2) objI0;
            if (function8 != null) {
                c0VarR.E(-1825624334);
                q3VarI = cx.i(d0.n1.f268535a.c(), c0VarR, 6);
                c0VarR.A();
            } else {
                c0VarR.E(-1825528978);
                q3VarI = cx.i(d0.j2.CornerFull, c0VarR, 6);
                c0VarR.A();
            }
            androidx.compose.runtime.internal.c cVarE11111111111111 = androidx.compose.runtime.internal.w.e(455696046, true, new b(q3VarI, z2Var1113), c0VarR, 54);
            androidx.compose.runtime.internal.c cVarE11111111111112 = androidx.compose.runtime.internal.w.e(2137606782, true, new a(n7VarF, spVar1116, q3VarI), c0VarR, 54);
            zD2 = c0VarR.D(n7VarF);
            objI1 = c0VarR.i0();
            if (zD2) {
                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(eq.m(n7VarF));
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function0() { // from class: androidx.compose.material3.vp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(eq.m(n7VarF));
                    }
                };
                c0VarR.Y(objI1);
            }
            Function0 function11111114 = (Function0) objI1;
            zD3 = c0VarR.D(n7VarF2);
            objI2 = c0VarR.i0();
            if (zD3) {
                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(eq.n(n7VarF2));
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function0() { // from class: androidx.compose.material3.wp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(eq.n(n7VarF2));
                    }
                };
                c0VarR.Y(objI2);
            }
            p(cVarE11111111111111, cVarE11111111111112, cVarE1111111111119, cVar, z21111114, function11111114, (Function0) objI2, c0VarR, (57344 & (i21 >> 6)) | 438);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            spVar2 = spVar1116;
            c0Var2 = c0VarR;
            z17 = z21111114;
            z16 = z21111115;
            a0Var2 = a0Var1115;
            jVar2 = jVar;
            function6 = function8;
        } else {
            c0VarR.u();
            jVar2 = jVar;
            z16 = z13;
            c0Var2 = c0VarR;
            z17 = z14;
            function6 = function5;
            spVar2 = spVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eq.o(z10, function0, function2, a0Var2, z16, function6, z17, spVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, boolean z12, sp spVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        l(z10, function0, function2, a0Var, z11, function3, z12, spVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private static final void p(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, final boolean z10, final Function0<Float> function0, final Function0<Float> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-759267492);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function5) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.G(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function0) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(function1) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-759267492, i11, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:557)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarJ = j2.j(aVar);
            int i12 = 57344 & i11;
            boolean z11 = ((i11 & 7168) == 2048) | ((3670016 & i11) == 1048576) | (i12 == 16384);
            Object objI0 = c0VarR.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new e(function1, function5, z10);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, f27402c);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
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
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function4.invoke(c0VarR, Integer.valueOf((i11 >> 6) & 14));
            c0VarR.o();
            if (function5 != null) {
                c0VarR.E(773116085);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, "label");
                boolean z12 = (i12 == 16384) | ((458752 & i11) == 131072);
                Object objI1 = c0VarR.i0();
                if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.bq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return eq.q(z10, function0, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.graphics.q1.a(a0VarB2, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
                function5.invoke(c0VarR, Integer.valueOf((i11 >> 9) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(773387087);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.cq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eq.r(function2, function3, function4, function5, z10, function0, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(boolean z10, Function0 function0, androidx.compose.ui.graphics.r1 r1Var) {
        r1Var.setAlpha(z10 ? 1.0f : ((Number) function0.invoke()).floatValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function2 function2, Function2 function3, Function2 function4, Function2 function5, boolean z10, Function0 function0, Function0 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        p(function2, function3, function4, function5, z10, function0, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, j10, j11, nVar, v6Var, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<gq> z() {
        return f27412m;
    }
}
