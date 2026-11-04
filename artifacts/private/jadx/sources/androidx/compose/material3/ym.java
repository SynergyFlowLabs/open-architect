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
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,815:1\n75#2:816\n75#2:868\n1282#3,6:817\n1282#3,6:823\n1282#3,6:829\n1282#3,6:873\n1282#3,6:879\n1282#3,6:885\n1282#3,6:895\n1282#3,6:969\n70#4,6:835\n77#4:894\n70#4:928\n67#4,9:929\n77#4:968\n70#4:975\n67#4,9:976\n77#4:1015\n79#5,6:841\n86#5,3:856\n89#5,2:865\n93#5:893\n79#5,6:901\n86#5,3:916\n89#5,2:925\n79#5,6:938\n86#5,3:953\n89#5,2:962\n93#5:967\n79#5,6:985\n86#5,3:1000\n89#5,2:1009\n93#5:1014\n93#5:1018\n347#6,9:847\n356#6:867\n357#6,2:891\n347#6,9:907\n356#6:927\n347#6,9:944\n356#6,3:964\n347#6,9:991\n356#6,3:1011\n357#6,2:1016\n4206#7,6:859\n4206#7,6:919\n4206#7,6:956\n4206#7,6:1003\n30#8:869\n53#9,3:870\n85#9:1023\n78#10:1019\n111#10,2:1020\n54#11:1022\n113#12:1024\n113#12:1025\n113#12:1044\n113#12:1045\n52#13,9:1026\n52#13,9:1035\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n120#1:816\n276#1:868\n208#1:817,6\n242#1:823,6\n256#1:829,6\n282#1:873,6\n314#1:879,6\n315#1:885,6\n573#1:895,6\n565#1:969,6\n244#1:835,6\n244#1:894\n561#1:928\n561#1:929,9\n561#1:968\n564#1:975\n564#1:976,9\n564#1:1015\n244#1:841,6\n244#1:856,3\n244#1:865,2\n244#1:893\n555#1:901,6\n555#1:916,3\n555#1:925,2\n561#1:938,6\n561#1:953,3\n561#1:962,2\n561#1:967\n564#1:985,6\n564#1:1000,3\n564#1:1009,2\n564#1:1014\n555#1:1018\n244#1:847,9\n244#1:867\n244#1:891,2\n555#1:907,9\n555#1:927\n561#1:944,9\n561#1:964,3\n564#1:991,9\n564#1:1011,3\n555#1:1016,2\n244#1:859,6\n555#1:919,6\n561#1:956,6\n564#1:1003,6\n279#1:869\n279#1:870,3\n256#1:1023\n242#1:1019\n242#1:1020,2\n256#1:1022\n755#1:1024\n758#1:1025\n769#1:1044\n772#1:1045\n761#1:1026,9\n766#1:1035,9\n*E\n"})
public final class ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f34781a = "indicatorRipple";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f34782b = "indicator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f34783c = "icon";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f34784d = "label";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f34785e = d0.k1.f268357a.n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f34786f = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f34787g = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f34788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f34789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f34790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f34791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<an> f34792l;

    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,815:1\n1282#2,6:816\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1\n*L\n300#1:816,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f34793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lm f34794b;

        a(androidx.compose.runtime.n7<Float> n7Var, lm lmVar) {
            this.f34793a = n7Var;
            this.f34794b = lmVar;
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
                androidx.compose.runtime.m0.A0(-799524251, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:297)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, ym.f34782b);
            boolean zD = c0Var.D(this.f34793a);
            final androidx.compose.runtime.n7<Float> n7Var = this.f34793a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.xm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ym.a.f(n7Var, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.c(androidx.compose.ui.graphics.q1.a(a0VarB, (Function1) objI0), this.f34794b.e(), cx.i(d0.k1.f268357a.g(), c0Var, 6)), c0Var, 0);
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
        final /* synthetic */ androidx.compose.material3.internal.z2 f34795a;

        b(androidx.compose.material3.internal.z2 z2Var) {
            this.f34795a = z2Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2082182507, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:289)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.w2.d(androidx.compose.ui.draw.j.a(androidx.compose.ui.layout.i0.b(androidx.compose.ui.a0.E, ym.f34781a), cx.i(d0.k1.f268357a.g(), c0Var, 6)), this.f34795a, gt.e(false, 0.0f, 0L, 7, null)), c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,815:1\n1282#2,6:816\n70#3:822\n67#3,9:823\n77#3:862\n79#4,6:832\n86#4,3:847\n89#4,2:856\n93#4:861\n347#5,9:838\n356#5,3:858\n4206#6,6:850\n85#7:863\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n*L\n220#1:816,6\n220#1:822\n220#1:823,9\n220#1:862\n220#1:832,6\n220#1:847,3\n220#1:856,2\n220#1:861\n220#1:838,9\n220#1:858,3\n220#1:850,6\n214#1:863\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lm f34796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f34799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f34801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34802g;

        /* JADX WARN: Multi-variable type inference failed */
        c(lm lmVar, boolean z10, boolean z11, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z12, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f34796a = lmVar;
            this.f34797b = z10;
            this.f34798c = z11;
            this.f34799d = y0Var;
            this.f34800e = function2;
            this.f34801f = z12;
            this.f34802g = function3;
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
            int i11 = 2 & 0;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-876637252, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:212)");
            }
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(this.f34796a.k(this.f34797b, this.f34798c), this.f34799d, null, null, c0Var, 0, 12);
            if (this.f34800e == null || !(this.f34801f || this.f34797b)) {
                c0Var.E(-634793532);
                c0Var.A();
                a0VarC = androidx.compose.ui.a0.E;
            } else {
                c0Var.E(-634794445);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                Object objI0 = c0Var.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.zm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.c.i((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(objI0);
                }
                a0VarC = androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0);
                c0Var.A();
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f34802g;
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

    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,815:1\n85#2:816\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n*L\n230#1:816\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lm f34803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> f34806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34807e;

        /* JADX WARN: Multi-variable type inference failed */
        d(lm lmVar, boolean z10, boolean z11, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f34803a = lmVar;
            this.f34804b = z10;
            this.f34805c = z11;
            this.f34806d = y0Var;
            this.f34807e = function2;
        }

        private static final long d(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
            return n7Var.getValue().M();
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 3 << 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(802208206, i10, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:227)");
            }
            androidx.compose.material3.internal.k3.b(d(androidx.compose.animation.e1.c(this.f34803a.l(this.f34804b, this.f34805c), this.f34806d, null, null, c0Var, 0, 12)), la0.e(d0.k1.f268357a.l(), c0Var, 6), this.f34807e, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,815:1\n563#2,2:816\n34#2,6:818\n565#2:824\n563#2,2:827\n34#2,6:829\n565#2:835\n117#2,2:836\n34#2,6:838\n119#2:844\n563#2,2:845\n34#2,6:847\n565#2:853\n68#3:825\n68#3:826\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$1\n*L\n579#1:816,2\n579#1:818,6\n579#1:824\n586#1:827,2\n586#1:829,6\n586#1:835\n590#1:836,2\n590#1:838,6\n590#1:844\n597#1:845,2\n597#1:847,6\n597#1:853\n581#1:825\n583#1:826\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f34808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f34809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34810c;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function0<Float> function0, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10) {
            this.f34808a = function0;
            this.f34809b = function2;
            this.f34810c = z10;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.z0 z0Var;
            androidx.compose.ui.layout.i2 i2VarP0;
            float fT = kotlin.ranges.r.t(this.f34808a.invoke().floatValue(), 0.0f);
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var2 = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), ym.f34783c)) {
                    androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(jD);
                    float f10 = 2;
                    int iH1 = i2VarP1.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(ym.f34788h * f10));
                    int iL0 = kotlin.math.b.L0(iH1 * fT);
                    int iC1 = i2VarP1.c1() + c1Var.g6(androidx.compose.ui.unit.h.r(ym.B() * f10));
                    List<? extends androidx.compose.ui.layout.z0> list2 = list;
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        androidx.compose.ui.layout.z0 z0Var3 = list.get(i11);
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), ym.f34781a)) {
                            androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.b.f42658b.c(iH1, iC1));
                            int size3 = list2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    z0Var = null;
                                    break;
                                }
                                z0Var = list.get(i12);
                                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), ym.f34782b)) {
                                    break;
                                }
                                i12++;
                            }
                            androidx.compose.ui.layout.z0 z0Var4 = z0Var;
                            androidx.compose.ui.layout.i2 i2VarP3 = z0Var4 != null ? z0Var4.P0(androidx.compose.ui.unit.b.f42658b.c(iL0, iC1)) : null;
                            if (this.f34809b != null) {
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
                            if (this.f34809b == null) {
                                return ym.G(c1Var, i2VarP1, i2VarP2, i2VarP3, j10);
                            }
                            Intrinsics.checkNotNull(i2VarP0);
                            return ym.I(c1Var, i2VarP0, i2VarP1, i2VarP2, i2VarP3, j10, this.f34810c, fT);
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
        d0.l1 l1Var = d0.l1.f268418a;
        float f10 = 2;
        f34788h = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(l1Var.b() - l1Var.d()) / f10);
        f34789i = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(l1Var.a() - l1Var.d()) / f10);
        f34790j = androidx.compose.ui.unit.h.r(12);
        f34791k = androidx.compose.ui.unit.h.r(44);
        f34792l = androidx.compose.runtime.a1.k(null, new Function0() { // from class: androidx.compose.material3.nm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ym.k();
            }
        }, 1, null);
    }

    public static final float B() {
        return f34789i;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<an> C() {
        return f34792l;
    }

    public static final float D() {
        return f34787g;
    }

    public static final float E() {
        return f34786f;
    }

    public static final float F() {
        return f34791k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 G(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, long j10) {
        final int iH1 = androidx.compose.ui.unit.b.p(j10) == Integer.MAX_VALUE ? i2Var.h1() + (c1Var.g6(f34791k) * 2) : androidx.compose.ui.unit.b.p(j10);
        final int iH = androidx.compose.ui.unit.c.h(j10, c1Var.g6(f34785e));
        final int iH2 = (iH1 - i2Var.h1()) / 2;
        final int iC1 = (iH - i2Var.c1()) / 2;
        final int iH3 = (iH1 - i2Var2.h1()) / 2;
        final int iC2 = (iH - i2Var2.c1()) / 2;
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iH, null, new Function1() { // from class: androidx.compose.material3.um
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ym.H(i2Var3, i2Var, iH2, iC1, i2Var2, iH3, iC2, iH1, iH, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, int i10, int i11, androidx.compose.ui.layout.i2 i2Var3, int i12, int i13, int i14, int i15, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i14 - i2Var.h1()) / 2, (i15 - i2Var.c1()) / 2, 0.0f, 4, null);
        }
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i10, i11, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i12, i13, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 I(final androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final androidx.compose.ui.layout.i2 i2Var4, long j10, final boolean z10, final float f10) {
        float fC1 = i2Var2.c1();
        float f11 = f34789i;
        float fS7 = fC1 + c1Var.S7(f11);
        float f12 = f34787g;
        float fS8 = fS7 + c1Var.S7(f12) + i2Var.c1();
        float f13 = 2;
        final float fT = kotlin.ranges.r.t((androidx.compose.ui.unit.b.q(j10) - fS8) / f13, c1Var.S7(f11));
        float f14 = fS8 + (fT * f13);
        final float fC2 = ((z10 ? fT : (f14 - i2Var2.c1()) / f13) - fT) * (1 - f10);
        final float fC3 = i2Var2.c1() + fT + c1Var.S7(f11) + c1Var.S7(f12);
        final int iH1 = androidx.compose.ui.unit.b.p(j10) == Integer.MAX_VALUE ? i2Var2.h1() + (c1Var.g6(f34791k) * 2) : androidx.compose.ui.unit.b.p(j10);
        final int iH2 = (iH1 - i2Var.h1()) / 2;
        final int iH3 = (iH1 - i2Var2.h1()) / 2;
        final int iH4 = (iH1 - i2Var3.h1()) / 2;
        final float fS9 = fT - c1Var.S7(f11);
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, kotlin.math.b.L0(f14), null, new Function1() { // from class: androidx.compose.material3.om
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ym.J(i2Var4, z10, f10, i2Var, iH2, fC3, fC2, i2Var2, iH3, fT, i2Var3, iH4, fS9, iH1, c1Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.compose.ui.layout.i2 i2Var, boolean z10, float f10, androidx.compose.ui.layout.i2 i2Var2, int i10, float f11, float f12, androidx.compose.ui.layout.i2 i2Var3, int i11, float f13, androidx.compose.ui.layout.i2 i2Var4, int i12, float f14, int i13, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i13 - i2Var.h1()) / 2, kotlin.math.b.L0((f13 - c1Var.g6(f34789i)) + f12), 0.0f, 4, null);
        }
        if (z10 || f10 != 0.0f) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i10, kotlin.math.b.L0(f11 + f12), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i11, kotlin.math.b.L0(f13 + f12), 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, i12, kotlin.math.b.L0(f14 + f12), 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final an k() {
        return bc.f26270a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:116:0x018c  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    @androidx.compose.runtime.o
    public static final void l(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jA;
        long jF;
        float fB;
        androidx.compose.foundation.layout.v6 v6Var2;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i13;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final float f11;
        final androidx.compose.foundation.layout.v6 v6Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.layout.v6 v6VarC;
        long j14;
        long j15;
        float f12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1054099326);
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
                jF = j11;
                int i16 = c0VarR.L(jF) ? 256 : 128;
                i12 |= i16;
            } else {
                jF = j11;
            }
            i12 |= i16;
        } else {
            jF = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 3072) == 0) {
                fB = f10;
                i12 |= c0VarR.I(fB) ? 2048 : 1024;
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
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
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
                            jA = km.f30067a.a(c0VarR, 6);
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            fB = km.f30067a.b();
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            a0Var3 = a0Var4;
                            v6VarC = km.f30067a.c(c0VarR, 6);
                            j14 = jA;
                            j15 = jF;
                            f12 = fB;
                        } else {
                            a0Var3 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1054099326, i12, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
                        }
                        ((an) c0VarR.W(f34792l)).a(new bn(a0Var3, j14, j15, f12, v6VarC, nVar2, null), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j14;
                        j13 = j15;
                        f11 = f12;
                        v6Var3 = v6VarC;
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
                    j15 = jF;
                    f12 = fB;
                    v6VarC = v6Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1054099326, i12, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
                    }
                    ((an) c0VarR.W(f34792l)).a(new bn(a0Var3, j14, j15, f12, v6VarC, nVar2, null), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j14;
                    j13 = j15;
                    f11 = f12;
                    v6Var3 = v6VarC;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j12 = jA;
                    j13 = jF;
                    f11 = fB;
                    v6Var3 = v6Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var5 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.w(a0Var5, j12, j13, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar2 = nVar;
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
                        jA = km.f30067a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = km.f30067a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarC = km.f30067a.c(c0VarR, 6);
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                        v6VarC = v6Var2;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = km.f30067a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = km.f30067a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarC = km.f30067a.c(c0VarR, 6);
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                        v6VarC = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1054099326, i12, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
                }
                ((an) c0VarR.W(f34792l)).a(new bn(a0Var3, j14, j15, f12, v6VarC, nVar2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j14;
                j13 = j15;
                f11 = f12;
                v6Var3 = v6VarC;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jA;
                j13 = jF;
                f11 = fB;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.w(a0Var6, j12, j13, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        fB = f10;
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
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
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
                        jA = km.f30067a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = km.f30067a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarC = km.f30067a.c(c0VarR, 6);
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                        v6VarC = v6Var2;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = km.f30067a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = km.f30067a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a0Var3 = a0Var4;
                        v6VarC = km.f30067a.c(c0VarR, 6);
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                    } else {
                        a0Var3 = a0Var4;
                        j14 = jA;
                        j15 = jF;
                        f12 = fB;
                        v6VarC = v6Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1054099326, i12, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
                }
                ((an) c0VarR.W(f34792l)).a(new bn(a0Var3, j14, j15, f12, v6VarC, nVar2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j14;
                j13 = j15;
                f11 = f12;
                v6Var3 = v6VarC;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jA;
                j13 = jF;
                f11 = fB;
                v6Var3 = v6Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var7 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.w(a0Var7, j12, j13, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar2 = nVar;
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
                    jA = km.f30067a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = km.f30067a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a0Var3 = a0Var4;
                    v6VarC = km.f30067a.c(c0VarR, 6);
                    j14 = jA;
                    j15 = jF;
                    f12 = fB;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jA;
                    j15 = jF;
                    f12 = fB;
                    v6VarC = v6Var2;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = km.f30067a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jF = o6.f(pj.f31758a.a(c0VarR, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = km.f30067a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a0Var3 = a0Var4;
                    v6VarC = km.f30067a.c(c0VarR, 6);
                    j14 = jA;
                    j15 = jF;
                    f12 = fB;
                } else {
                    a0Var3 = a0Var4;
                    j14 = jA;
                    j15 = jF;
                    f12 = fB;
                    v6VarC = v6Var2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1054099326, i12, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
            }
            ((an) c0VarR.W(f34792l)).a(new bn(a0Var3, j14, j15, f12, v6VarC, nVar2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j14;
            j13 = j15;
            f11 = f12;
            v6Var3 = v6VarC;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = jA;
            j13 = jF;
            f11 = fB;
            v6Var3 = v6Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var8 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ym.w(a0Var8, j12, j13, f11, v6Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x018e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:129:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x0234  */
    /* JADX WARN: Code duplicated, block: B:154:0x0241  */
    /* JADX WARN: Code duplicated, block: B:157:0x0274  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x0308  */
    /* JADX WARN: Code duplicated, block: B:166:0x0314  */
    /* JADX WARN: Code duplicated, block: B:167:0x0318  */
    /* JADX WARN: Code duplicated, block: B:170:0x0339  */
    /* JADX WARN: Code duplicated, block: B:172:0x0347  */
    /* JADX WARN: Code duplicated, block: B:175:0x0360  */
    /* JADX WARN: Code duplicated, block: B:177:0x0365  */
    /* JADX WARN: Code duplicated, block: B:180:0x0386  */
    /* JADX WARN: Code duplicated, block: B:181:0x0389  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:189:0x0428  */
    /* JADX WARN: Code duplicated, block: B:191:0x042e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0442  */
    /* JADX WARN: Code duplicated, block: B:196:0x0448  */
    /* JADX WARN: Code duplicated, block: B:199:0x0475  */
    /* JADX WARN: Code duplicated, block: B:201:0x0484  */
    /* JADX WARN: Code duplicated, block: B:204:0x0497  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void m(@NotNull final androidx.compose.foundation.layout.x5 x5Var, final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z12, @Nullable lm lmVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.foundation.layout.x5 x5Var2;
        int i12;
        Function0<Unit> function1;
        final androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        char c10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z14;
        final boolean z15;
        final lm lmVar2;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z16;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        androidx.compose.runtime.s5 s5VarT;
        boolean z17;
        lm lmVarA;
        int i22;
        androidx.compose.ui.a0 a0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        boolean z18;
        int i23;
        lm lmVar3;
        boolean z19;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.animation.core.y0 y0VarB;
        androidx.compose.foundation.interaction.j jVar4;
        lm lmVar4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        androidx.compose.runtime.internal.c cVar;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.l3 l3Var;
        Object objI1;
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
        Object objI2;
        boolean zD2;
        Object objI3;
        boolean zD3;
        Object objI4;
        Object objI5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(974293026);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
            x5Var2 = x5Var;
        } else {
            x5Var2 = x5Var;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.D(x5Var2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(function1) ? 256 : 128;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        int i24 = i11 & 8;
        if (i24 == 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 16384 : 8192;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    function4 = function3;
                    if ((i10 & 1572864) == 0) {
                        c10 = ' ';
                        if (c0VarR.k0(function4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((i12 & 306783379) != 306783378) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i24 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = z12;
                                }
                                if ((i11 & 128) != 0) {
                                    lmVarA = mm.f30654a.a(c0VarR, 6);
                                    i22 = i21 & (-234881025);
                                } else {
                                    lmVarA = lmVar;
                                    i22 = i21;
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function4;
                                a0Var3 = a0Var2;
                                function6 = function8;
                                if (i19 != 0) {
                                    z18 = z17;
                                    i23 = i22;
                                    lmVar3 = lmVarA;
                                    z19 = z13;
                                    jVar = null;
                                } else {
                                    z18 = z17;
                                    i23 = i22;
                                    lmVar3 = lmVarA;
                                    z19 = z13;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 128) != 0) {
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function4;
                                    a0Var3 = a0Var2;
                                    function6 = function9;
                                    z18 = z12;
                                    jVar = jVar;
                                    i23 = i21 & (-234881025);
                                    z19 = z13;
                                    lmVar3 = lmVar;
                                } else {
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function4;
                                    a0Var3 = a0Var2;
                                    function6 = function10;
                                    z18 = z12;
                                    lmVar3 = lmVar;
                                    i23 = i21;
                                    z19 = z13;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                            }
                            if (jVar == null) {
                                c0VarR.E(-224963495);
                                objI5 = c0VarR.i0();
                                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI5 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI5);
                                }
                                c0VarR.A();
                                jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                            } else {
                                c0VarR.E(-7257538);
                                c0VarR.A();
                                jVar3 = jVar;
                            }
                            d0.h1 h1Var = d0.h1.DefaultEffects;
                            y0VarB = hm.b(h1Var, c0VarR, 6);
                            int i25 = i23;
                            jVar4 = jVar3;
                            lmVar4 = lmVar3;
                            boolean z20 = z18;
                            androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                            if (function6 == null) {
                                c0VarR.E(-224036658);
                                c0VarR.A();
                                function7 = function6;
                                cVar = null;
                            } else {
                                c0VarR.E(-224036657);
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function6;
                                function7 = function11;
                                androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function11), c0VarR, 54);
                                c0VarR.A();
                                cVar = cVarE2;
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.e6.b(0);
                                c0VarR.Y(objI0);
                            }
                            l3Var = (androidx.compose.runtime.l3) objI0;
                            boolean z21 = z19;
                            androidx.compose.ui.a0 a0Var4 = a0Var3;
                            androidx.compose.runtime.internal.c cVar2 = cVar;
                            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var4, z10, jVar4, null, z21, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.qm
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.y1.a(a0VarQ, (Function1) objI1);
                            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                            function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                            jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar.S7(f34790j)))));
                            Unit unit = Unit.f312394a;
                            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                            objI2 = c0VarR.i0();
                            if (zD || objI2 == aVar.a()) {
                                objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                            androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                            zD2 = c0VarR.D(n7VarF);
                            objI3 = c0VarR.i0();
                            if (zD2 || objI3 == aVar.a()) {
                                objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(ym.n(n7VarF));
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            Function0 function12 = (Function0) objI3;
                            zD3 = c0VarR.D(n7VarF2);
                            objI4 = c0VarR.i0();
                            if (zD3 || objI4 == aVar.a()) {
                                objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(ym.o(n7VarF2));
                                    }
                                };
                                c0VarR.Y(objI4);
                            }
                            t(cVarE3, cVarE4, cVarE, cVar2, z20, function12, (Function0) objI4, c0VarR, ((i25 >> 9) & 57344) | 438);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            c0Var2 = c0VarR;
                            lmVar2 = lmVar4;
                            z16 = z21;
                            a0Var2 = a0Var4;
                            jVar2 = jVar;
                            z15 = z20;
                            function5 = function7;
                        } else {
                            c0VarR.u();
                            z15 = z12;
                            lmVar2 = lmVar;
                            jVar2 = jVar;
                            c0Var2 = c0VarR;
                            z16 = z13;
                            function5 = function4;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    i21 = i12;
                    if ((i12 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function4;
                            a0Var3 = a0Var2;
                            function6 = function13;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function4;
                            a0Var3 = a0Var2;
                            function6 = function14;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                        }
                        if (jVar == null) {
                            c0VarR.E(-224963495);
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI5);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                        } else {
                            c0VarR.E(-7257538);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var2 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var2, c0VarR, 6);
                        int i26 = i23;
                        jVar4 = jVar3;
                        lmVar4 = lmVar3;
                        boolean z22 = z18;
                        androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                        if (function6 == null) {
                            c0VarR.E(-224036658);
                            c0VarR.A();
                            function7 = function6;
                            cVar = null;
                        } else {
                            c0VarR.E(-224036657);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function6;
                            function7 = function15;
                            androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function15), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE6;
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.e6.b(0);
                            c0VarR.Y(objI0);
                        }
                        l3Var = (androidx.compose.runtime.l3) objI0;
                        boolean z23 = z19;
                        androidx.compose.ui.a0 a0Var5 = a0Var3;
                        androidx.compose.runtime.internal.c cVar3 = cVar;
                        androidx.compose.ui.a0 a0VarQ2 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var5, z10, jVar4, null, z23, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.qm
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.y1.a(a0VarQ2, (Function1) objI1);
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar3.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar3.f());
                        androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var2, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar2.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar2.S7(f34790j)))));
                        Unit unit2 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI3 = c0VarR.i0();
                        if (zD2) {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function0 function16 = (Function0) objI3;
                        zD3 = c0VarR.D(n7VarF2);
                        objI4 = c0VarR.i0();
                        if (zD3) {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        t(cVarE7, cVarE8, cVarE5, cVar3, z22, function16, (Function0) objI4, c0VarR, ((i26 >> 9) & 57344) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        lmVar2 = lmVar4;
                        z16 = z23;
                        a0Var2 = a0Var5;
                        jVar2 = jVar;
                        z15 = z22;
                        function5 = function7;
                    } else {
                        c0VarR.u();
                        z15 = z12;
                        lmVar2 = lmVar;
                        jVar2 = jVar;
                        c0Var2 = c0VarR;
                        z16 = z13;
                        function5 = function4;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function4 = function3;
                c10 = ' ';
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i12 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function4;
                            a0Var3 = a0Var2;
                            function6 = function17;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function4;
                            a0Var3 = a0Var2;
                            function6 = function18;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                        }
                        if (jVar == null) {
                            c0VarR.E(-224963495);
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI5);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                        } else {
                            c0VarR.E(-7257538);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var3 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var3, c0VarR, 6);
                        int i27 = i23;
                        jVar4 = jVar3;
                        lmVar4 = lmVar3;
                        boolean z24 = z18;
                        androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                        if (function6 == null) {
                            c0VarR.E(-224036658);
                            c0VarR.A();
                            function7 = function6;
                            cVar = null;
                        } else {
                            c0VarR.E(-224036657);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function6;
                            function7 = function19;
                            androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function19), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE10;
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.e6.b(0);
                            c0VarR.Y(objI0);
                        }
                        l3Var = (androidx.compose.runtime.l3) objI0;
                        boolean z25 = z19;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        androidx.compose.runtime.internal.c cVar4 = cVar;
                        androidx.compose.ui.a0 a0VarQ3 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var6, z10, jVar4, null, z25, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.qm
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.layout.y1.a(a0VarQ3, (Function1) objI1);
                        androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA3);
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar4.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar4.f());
                        androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var3, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar3 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar3.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar3.S7(f34790j)))));
                        Unit unit3 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI3 = c0VarR.i0();
                        if (zD2) {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function0 function110 = (Function0) objI3;
                        zD3 = c0VarR.D(n7VarF2);
                        objI4 = c0VarR.i0();
                        if (zD3) {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        t(cVarE11, cVarE12, cVarE9, cVar4, z24, function110, (Function0) objI4, c0VarR, ((i27 >> 9) & 57344) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        lmVar2 = lmVar4;
                        z16 = z25;
                        a0Var2 = a0Var6;
                        jVar2 = jVar;
                        z15 = z24;
                        function5 = function7;
                    } else {
                        c0VarR.u();
                        z15 = z12;
                        lmVar2 = lmVar;
                        jVar2 = jVar;
                        c0Var2 = c0VarR;
                        z16 = z13;
                        function5 = function4;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function4;
                        a0Var3 = a0Var2;
                        function6 = function111;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function4;
                        a0Var3 = a0Var2;
                        function6 = function112;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var4 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var4, c0VarR, 6);
                    int i28 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z26 = z18;
                    androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function6;
                        function7 = function113;
                        androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function113), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE14;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z27 = z19;
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    androidx.compose.runtime.internal.c cVar5 = cVar;
                    androidx.compose.ui.a0 a0VarQ4 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var7, z10, jVar4, null, z27, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.layout.y1.a(a0VarQ4, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar5.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var4, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar4 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar4.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar4.S7(f34790j)))));
                    Unit unit4 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function114 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE15, cVarE16, cVarE13, cVar5, z26, function114, (Function0) objI4, c0VarR, ((i28 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z27;
                    a0Var2 = a0Var7;
                    jVar2 = jVar;
                    z15 = z26;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                function4 = function3;
                if ((i10 & 1572864) == 0) {
                    c10 = ' ';
                    if (c0VarR.k0(function4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i12 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function115 = function4;
                            a0Var3 = a0Var2;
                            function6 = function115;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function4;
                            a0Var3 = a0Var2;
                            function6 = function116;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                        }
                        if (jVar == null) {
                            c0VarR.E(-224963495);
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI5);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                        } else {
                            c0VarR.E(-7257538);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var5 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var5, c0VarR, 6);
                        int i29 = i23;
                        jVar4 = jVar3;
                        lmVar4 = lmVar3;
                        boolean z28 = z18;
                        androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                        if (function6 == null) {
                            c0VarR.E(-224036658);
                            c0VarR.A();
                            function7 = function6;
                            cVar = null;
                        } else {
                            c0VarR.E(-224036657);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function117 = function6;
                            function7 = function117;
                            androidx.compose.runtime.internal.c cVarE18 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function117), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE18;
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.e6.b(0);
                            c0VarR.Y(objI0);
                        }
                        l3Var = (androidx.compose.runtime.l3) objI0;
                        boolean z29 = z19;
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        androidx.compose.runtime.internal.c cVar6 = cVar;
                        androidx.compose.ui.a0 a0VarQ5 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var8, z10, jVar4, null, z29, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.qm
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarA5 = androidx.compose.ui.layout.y1.a(a0VarQ5, (Function1) objI1);
                        androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarA5);
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar6.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar6.g());
                        function2B = aVar6.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar6.f());
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var5, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar5 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar5.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar5.S7(f34790j)))));
                        Unit unit5 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.internal.c cVarE19 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE110 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI3 = c0VarR.i0();
                        if (zD2) {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function0 function118 = (Function0) objI3;
                        zD3 = c0VarR.D(n7VarF2);
                        objI4 = c0VarR.i0();
                        if (zD3) {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        t(cVarE19, cVarE110, cVarE17, cVar6, z28, function118, (Function0) objI4, c0VarR, ((i29 >> 9) & 57344) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        lmVar2 = lmVar4;
                        z16 = z29;
                        a0Var2 = a0Var8;
                        jVar2 = jVar;
                        z15 = z28;
                        function5 = function7;
                    } else {
                        c0VarR.u();
                        z15 = z12;
                        lmVar2 = lmVar;
                        jVar2 = jVar;
                        c0Var2 = c0VarR;
                        z16 = z13;
                        function5 = function4;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function119 = function4;
                        a0Var3 = a0Var2;
                        function6 = function119;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1110 = function4;
                        a0Var3 = a0Var2;
                        function6 = function1110;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var6 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var6, c0VarR, 6);
                    int i210 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z210 = z18;
                    androidx.compose.runtime.internal.c cVarE111 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111 = function6;
                        function7 = function1111;
                        androidx.compose.runtime.internal.c cVarE112 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function1111), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE112;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z211 = z19;
                    androidx.compose.ui.a0 a0Var9 = a0Var3;
                    androidx.compose.runtime.internal.c cVar7 = cVar;
                    androidx.compose.ui.a0 a0VarQ6 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var9, z10, jVar4, null, z211, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA6 = androidx.compose.ui.layout.y1.a(a0VarQ6, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarA6);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar7.f());
                    androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var6, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar6 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar6.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar6.S7(f34790j)))));
                    Unit unit6 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE113 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE114 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function1112 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE113, cVarE114, cVarE111, cVar7, z210, function1112, (Function0) objI4, c0VarR, ((i210 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z211;
                    a0Var2 = a0Var9;
                    jVar2 = jVar;
                    z15 = z210;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function4 = function3;
            c10 = ' ';
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1113 = function4;
                        a0Var3 = a0Var2;
                        function6 = function1113;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1114 = function4;
                        a0Var3 = a0Var2;
                        function6 = function1114;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var7 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var7, c0VarR, 6);
                    int i211 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z212 = z18;
                    androidx.compose.runtime.internal.c cVarE115 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1115 = function6;
                        function7 = function1115;
                        androidx.compose.runtime.internal.c cVarE116 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function1115), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE116;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z213 = z19;
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    androidx.compose.runtime.internal.c cVar8 = cVar;
                    androidx.compose.ui.a0 a0VarQ7 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var10, z10, jVar4, null, z213, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA7 = androidx.compose.ui.layout.y1.a(a0VarQ7, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarA7);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar8.f());
                    androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var7, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar7 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar7.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar7.S7(f34790j)))));
                    Unit unit7 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE117 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE118 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function1116 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE117, cVarE118, cVarE115, cVar8, z212, function1116, (Function0) objI4, c0VarR, ((i211 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z213;
                    a0Var2 = a0Var10;
                    jVar2 = jVar;
                    z15 = z212;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            i21 = i12;
            if ((i12 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1117 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1117;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1118 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1118;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                }
                if (jVar == null) {
                    c0VarR.E(-224963495);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-7257538);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var8 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var8, c0VarR, 6);
                int i212 = i23;
                jVar4 = jVar3;
                lmVar4 = lmVar3;
                boolean z214 = z18;
                androidx.compose.runtime.internal.c cVarE119 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                if (function6 == null) {
                    c0VarR.E(-224036658);
                    c0VarR.A();
                    function7 = function6;
                    cVar = null;
                } else {
                    c0VarR.E(-224036657);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1119 = function6;
                    function7 = function1119;
                    androidx.compose.runtime.internal.c cVarE1110 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function1119), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE1110;
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                boolean z215 = z19;
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                androidx.compose.runtime.internal.c cVar9 = cVar;
                androidx.compose.ui.a0 a0VarQ8 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var11, z10, jVar4, null, z215, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.qm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA8 = androidx.compose.ui.layout.y1.a(a0VarQ8, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarA8);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar9.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar9.g());
                function2B = aVar9.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar9.f());
                androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var8, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar8 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar8.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar8.S7(f34790j)))));
                Unit unit8 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.internal.c cVarE1111 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1112 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function0 function11110 = (Function0) objI3;
                zD3 = c0VarR.D(n7VarF2);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                t(cVarE1111, cVarE1112, cVarE119, cVar9, z214, function11110, (Function0) objI4, c0VarR, ((i212 >> 9) & 57344) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                lmVar2 = lmVar4;
                z16 = z215;
                a0Var2 = a0Var11;
                jVar2 = jVar;
                z15 = z214;
                function5 = function7;
            } else {
                c0VarR.u();
                z15 = z12;
                lmVar2 = lmVar;
                jVar2 = jVar;
                c0Var2 = c0VarR;
                z16 = z13;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a0Var2 = a0Var;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                function4 = function3;
                if ((i10 & 1572864) == 0) {
                    c10 = ' ';
                    if (c0VarR.k0(function4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i12 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111 = function4;
                            a0Var3 = a0Var2;
                            function6 = function11111;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                z17 = true;
                            } else {
                                z17 = z12;
                            }
                            if ((i11 & 128) != 0) {
                                lmVarA = mm.f30654a.a(c0VarR, 6);
                                i22 = i21 & (-234881025);
                            } else {
                                lmVarA = lmVar;
                                i22 = i21;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11112 = function4;
                            a0Var3 = a0Var2;
                            function6 = function11112;
                            if (i19 != 0) {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                                jVar = null;
                            } else {
                                z18 = z17;
                                i23 = i22;
                                lmVar3 = lmVarA;
                                z19 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                        }
                        if (jVar == null) {
                            c0VarR.E(-224963495);
                            objI5 = c0VarR.i0();
                            if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI5 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI5);
                            }
                            c0VarR.A();
                            jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                        } else {
                            c0VarR.E(-7257538);
                            c0VarR.A();
                            jVar3 = jVar;
                        }
                        d0.h1 h1Var9 = d0.h1.DefaultEffects;
                        y0VarB = hm.b(h1Var9, c0VarR, 6);
                        int i213 = i23;
                        jVar4 = jVar3;
                        lmVar4 = lmVar3;
                        boolean z216 = z18;
                        androidx.compose.runtime.internal.c cVarE1113 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                        if (function6 == null) {
                            c0VarR.E(-224036658);
                            c0VarR.A();
                            function7 = function6;
                            cVar = null;
                        } else {
                            c0VarR.E(-224036657);
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11113 = function6;
                            function7 = function11113;
                            androidx.compose.runtime.internal.c cVarE1114 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function11113), c0VarR, 54);
                            c0VarR.A();
                            cVar = cVarE1114;
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.e6.b(0);
                            c0VarR.Y(objI0);
                        }
                        l3Var = (androidx.compose.runtime.l3) objI0;
                        boolean z217 = z19;
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        androidx.compose.runtime.internal.c cVar10 = cVar;
                        androidx.compose.ui.a0 a0VarQ9 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var12, z10, jVar4, null, z217, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.qm
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarA9 = androidx.compose.ui.layout.y1.a(a0VarQ9, (Function1) objI1);
                        androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarA9);
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK9, aVar10.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar10.f());
                        androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var9, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                        androidx.compose.ui.unit.d dVar9 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                        jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar9.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar9.S7(f34790j)))));
                        Unit unit9 = Unit.f312394a;
                        zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.internal.c cVarE1115 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                        androidx.compose.runtime.internal.c cVarE1116 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                        zD2 = c0VarR.D(n7VarF);
                        objI3 = c0VarR.i0();
                        if (zD2) {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function0() { // from class: androidx.compose.material3.rm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.n(n7VarF));
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function0 function11114 = (Function0) objI3;
                        zD3 = c0VarR.D(n7VarF2);
                        objI4 = c0VarR.i0();
                        if (zD3) {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = new Function0() { // from class: androidx.compose.material3.sm
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(ym.o(n7VarF2));
                                }
                            };
                            c0VarR.Y(objI4);
                        }
                        t(cVarE1115, cVarE1116, cVarE1113, cVar10, z216, function11114, (Function0) objI4, c0VarR, ((i213 >> 9) & 57344) | 438);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        lmVar2 = lmVar4;
                        z16 = z217;
                        a0Var2 = a0Var12;
                        jVar2 = jVar;
                        z15 = z216;
                        function5 = function7;
                    } else {
                        c0VarR.u();
                        z15 = z12;
                        lmVar2 = lmVar;
                        jVar2 = jVar;
                        c0Var2 = c0VarR;
                        z16 = z13;
                        function5 = function4;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11115 = function4;
                        a0Var3 = a0Var2;
                        function6 = function11115;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11116 = function4;
                        a0Var3 = a0Var2;
                        function6 = function11116;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var10 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var10, c0VarR, 6);
                    int i214 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z218 = z18;
                    androidx.compose.runtime.internal.c cVarE1117 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11117 = function6;
                        function7 = function11117;
                        androidx.compose.runtime.internal.c cVarE1118 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function11117), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE1118;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z219 = z19;
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    androidx.compose.runtime.internal.c cVar11 = cVar;
                    androidx.compose.ui.a0 a0VarQ10 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var13, z10, jVar4, null, z219, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA10 = androidx.compose.ui.layout.y1.a(a0VarQ10, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarA10);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK10, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar11.f());
                    androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var10, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar10 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar10.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar10.S7(f34790j)))));
                    Unit unit10 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE1119 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE11110 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function11118 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE1119, cVarE11110, cVarE1117, cVar11, z218, function11118, (Function0) objI4, c0VarR, ((i214 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z219;
                    a0Var2 = a0Var13;
                    jVar2 = jVar;
                    z15 = z218;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function4 = function3;
            c10 = ' ';
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11119 = function4;
                        a0Var3 = a0Var2;
                        function6 = function11119;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111110 = function4;
                        a0Var3 = a0Var2;
                        function6 = function111110;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var11 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var11, c0VarR, 6);
                    int i215 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z2110 = z18;
                    androidx.compose.runtime.internal.c cVarE11111 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111 = function6;
                        function7 = function111111;
                        androidx.compose.runtime.internal.c cVarE11112 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function111111), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE11112;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z2111 = z19;
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    androidx.compose.runtime.internal.c cVar12 = cVar;
                    androidx.compose.ui.a0 a0VarQ11 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var14, z10, jVar4, null, z2111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA11 = androidx.compose.ui.layout.y1.a(a0VarQ11, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarA11);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11, aVar12.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar12.f());
                    androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var11, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar11 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar11.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar11.S7(f34790j)))));
                    Unit unit11 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE11113 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE11114 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function111112 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE11113, cVarE11114, cVarE11111, cVar12, z2110, function111112, (Function0) objI4, c0VarR, ((i215 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z2111;
                    a0Var2 = a0Var14;
                    jVar2 = jVar;
                    z15 = z2110;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            i21 = i12;
            if ((i12 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111113 = function4;
                    a0Var3 = a0Var2;
                    function6 = function111113;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111114 = function4;
                    a0Var3 = a0Var2;
                    function6 = function111114;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                }
                if (jVar == null) {
                    c0VarR.E(-224963495);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-7257538);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var12 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var12, c0VarR, 6);
                int i216 = i23;
                jVar4 = jVar3;
                lmVar4 = lmVar3;
                boolean z2112 = z18;
                androidx.compose.runtime.internal.c cVarE11115 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                if (function6 == null) {
                    c0VarR.E(-224036658);
                    c0VarR.A();
                    function7 = function6;
                    cVar = null;
                } else {
                    c0VarR.E(-224036657);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111115 = function6;
                    function7 = function111115;
                    androidx.compose.runtime.internal.c cVarE11116 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function111115), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE11116;
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                boolean z2113 = z19;
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                androidx.compose.runtime.internal.c cVar13 = cVar;
                androidx.compose.ui.a0 a0VarQ12 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var15, z10, jVar4, null, z2113, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.qm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA12 = androidx.compose.ui.layout.y1.a(a0VarQ12, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarA12);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK12, aVar13.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar13.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var12, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar12 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar12.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar12.S7(f34790j)))));
                Unit unit12 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.internal.c cVarE11117 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE11118 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function0 function111116 = (Function0) objI3;
                zD3 = c0VarR.D(n7VarF2);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                t(cVarE11117, cVarE11118, cVarE11115, cVar13, z2112, function111116, (Function0) objI4, c0VarR, ((i216 >> 9) & 57344) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                lmVar2 = lmVar4;
                z16 = z2113;
                a0Var2 = a0Var15;
                jVar2 = jVar;
                z15 = z2112;
                function5 = function7;
            } else {
                c0VarR.u();
                z15 = z12;
                lmVar2 = lmVar;
                jVar2 = jVar;
                c0Var2 = c0VarR;
                z16 = z13;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            function4 = function3;
            if ((i10 & 1572864) == 0) {
                c10 = ' ';
                if (c0VarR.k0(function4)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i12 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111117 = function4;
                        a0Var3 = a0Var2;
                        function6 = function111117;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            z17 = true;
                        } else {
                            z17 = z12;
                        }
                        if ((i11 & 128) != 0) {
                            lmVarA = mm.f30654a.a(c0VarR, 6);
                            i22 = i21 & (-234881025);
                        } else {
                            lmVarA = lmVar;
                            i22 = i21;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111118 = function4;
                        a0Var3 = a0Var2;
                        function6 = function111118;
                        if (i19 != 0) {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                            jVar = null;
                        } else {
                            z18 = z17;
                            i23 = i22;
                            lmVar3 = lmVarA;
                            z19 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                    }
                    if (jVar == null) {
                        c0VarR.E(-224963495);
                        objI5 = c0VarR.i0();
                        if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI5 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI5);
                        }
                        c0VarR.A();
                        jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                    } else {
                        c0VarR.E(-7257538);
                        c0VarR.A();
                        jVar3 = jVar;
                    }
                    d0.h1 h1Var13 = d0.h1.DefaultEffects;
                    y0VarB = hm.b(h1Var13, c0VarR, 6);
                    int i217 = i23;
                    jVar4 = jVar3;
                    lmVar4 = lmVar3;
                    boolean z2114 = z18;
                    androidx.compose.runtime.internal.c cVarE11119 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                    if (function6 == null) {
                        c0VarR.E(-224036658);
                        c0VarR.A();
                        function7 = function6;
                        cVar = null;
                    } else {
                        c0VarR.E(-224036657);
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111119 = function6;
                        function7 = function111119;
                        androidx.compose.runtime.internal.c cVarE111110 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function111119), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE111110;
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.e6.b(0);
                        c0VarR.Y(objI0);
                    }
                    l3Var = (androidx.compose.runtime.l3) objI0;
                    boolean z2115 = z19;
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    androidx.compose.runtime.internal.c cVar14 = cVar;
                    androidx.compose.ui.a0 a0VarQ13 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var16, z10, jVar4, null, z2115, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.qm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarA13 = androidx.compose.ui.layout.y1.a(a0VarQ13, (Function1) objI1);
                    androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarA13);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar14.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar14.f());
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var13, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                    androidx.compose.ui.unit.d dVar13 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                    jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar13.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar13.S7(f34790j)))));
                    Unit unit13 = Unit.f312394a;
                    zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.internal.c cVarE111111 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                    androidx.compose.runtime.internal.c cVarE111112 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                    zD2 = c0VarR.D(n7VarF);
                    objI3 = c0VarR.i0();
                    if (zD2) {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function0() { // from class: androidx.compose.material3.rm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.n(n7VarF));
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function0 function1111110 = (Function0) objI3;
                    zD3 = c0VarR.D(n7VarF2);
                    objI4 = c0VarR.i0();
                    if (zD3) {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = new Function0() { // from class: androidx.compose.material3.sm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ym.o(n7VarF2));
                            }
                        };
                        c0VarR.Y(objI4);
                    }
                    t(cVarE111111, cVarE111112, cVarE11119, cVar14, z2114, function1111110, (Function0) objI4, c0VarR, ((i217 >> 9) & 57344) | 438);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    lmVar2 = lmVar4;
                    z16 = z2115;
                    a0Var2 = a0Var16;
                    jVar2 = jVar;
                    z15 = z2114;
                    function5 = function7;
                } else {
                    c0VarR.u();
                    z15 = z12;
                    lmVar2 = lmVar;
                    jVar2 = jVar;
                    c0Var2 = c0VarR;
                    z16 = z13;
                    function5 = function4;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            i21 = i12;
            if ((i12 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1111111;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111112 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1111112;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                }
                if (jVar == null) {
                    c0VarR.E(-224963495);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-7257538);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var14 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var14, c0VarR, 6);
                int i218 = i23;
                jVar4 = jVar3;
                lmVar4 = lmVar3;
                boolean z2116 = z18;
                androidx.compose.runtime.internal.c cVarE111113 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                if (function6 == null) {
                    c0VarR.E(-224036658);
                    c0VarR.A();
                    function7 = function6;
                    cVar = null;
                } else {
                    c0VarR.E(-224036657);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111113 = function6;
                    function7 = function1111113;
                    androidx.compose.runtime.internal.c cVarE111114 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function1111113), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE111114;
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                boolean z2117 = z19;
                androidx.compose.ui.a0 a0Var17 = a0Var3;
                androidx.compose.runtime.internal.c cVar15 = cVar;
                androidx.compose.ui.a0 a0VarQ14 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var17, z10, jVar4, null, z2117, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.qm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA14 = androidx.compose.ui.layout.y1.a(a0VarQ14, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarA14);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK14, aVar15.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar15.f());
                androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var14, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar14 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar14.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar14.S7(f34790j)))));
                Unit unit14 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.internal.c cVarE111115 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE111116 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function0 function1111114 = (Function0) objI3;
                zD3 = c0VarR.D(n7VarF2);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                t(cVarE111115, cVarE111116, cVarE111113, cVar15, z2116, function1111114, (Function0) objI4, c0VarR, ((i218 >> 9) & 57344) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                lmVar2 = lmVar4;
                z16 = z2117;
                a0Var2 = a0Var17;
                jVar2 = jVar;
                z15 = z2116;
                function5 = function7;
            } else {
                c0VarR.u();
                z15 = z12;
                lmVar2 = lmVar;
                jVar2 = jVar;
                c0Var2 = c0VarR;
                z16 = z13;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        function4 = function3;
        c10 = ' ';
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.G(z12)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 128) == 0 || !c0VarR.D(lmVar)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((i12 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111115 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1111115;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    if ((i11 & 128) != 0) {
                        lmVarA = mm.f30654a.a(c0VarR, 6);
                        i22 = i21 & (-234881025);
                    } else {
                        lmVarA = lmVar;
                        i22 = i21;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111116 = function4;
                    a0Var3 = a0Var2;
                    function6 = function1111116;
                    if (i19 != 0) {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                        jVar = null;
                    } else {
                        z18 = z17;
                        i23 = i22;
                        lmVar3 = lmVarA;
                        z19 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                }
                if (jVar == null) {
                    c0VarR.E(-224963495);
                    objI5 = c0VarR.i0();
                    if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI5 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI5);
                    }
                    c0VarR.A();
                    jVar3 = (androidx.compose.foundation.interaction.j) objI5;
                } else {
                    c0VarR.E(-7257538);
                    c0VarR.A();
                    jVar3 = jVar;
                }
                d0.h1 h1Var15 = d0.h1.DefaultEffects;
                y0VarB = hm.b(h1Var15, c0VarR, 6);
                int i219 = i23;
                jVar4 = jVar3;
                lmVar4 = lmVar3;
                boolean z2118 = z18;
                androidx.compose.runtime.internal.c cVarE111117 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
                if (function6 == null) {
                    c0VarR.E(-224036658);
                    c0VarR.A();
                    function7 = function6;
                    cVar = null;
                } else {
                    c0VarR.E(-224036657);
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111117 = function6;
                    function7 = function1111117;
                    androidx.compose.runtime.internal.c cVarE111118 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function1111117), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE111118;
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI0);
                }
                l3Var = (androidx.compose.runtime.l3) objI0;
                boolean z2119 = z19;
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                androidx.compose.runtime.internal.c cVar16 = cVar;
                androidx.compose.ui.a0 a0VarQ15 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var18, z10, jVar4, null, z2119, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.qm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarA15 = androidx.compose.ui.layout.y1.a(a0VarQ15, (Function1) objI1);
                androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarA15);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK15, aVar16.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar16.g());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar16.f());
                androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var15, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.ui.unit.d dVar15 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar15.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar15.S7(f34790j)))));
                Unit unit15 = Unit.f312394a;
                zD = c0VarR.D(jVar4) | c0VarR.L(jG);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.internal.c cVarE111119 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
                androidx.compose.runtime.internal.c cVarE1111110 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
                zD2 = c0VarR.D(n7VarF);
                objI3 = c0VarR.i0();
                if (zD2) {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function0() { // from class: androidx.compose.material3.rm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.n(n7VarF));
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function0 function1111118 = (Function0) objI3;
                zD3 = c0VarR.D(n7VarF2);
                objI4 = c0VarR.i0();
                if (zD3) {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                } else {
                    objI4 = new Function0() { // from class: androidx.compose.material3.sm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ym.o(n7VarF2));
                        }
                    };
                    c0VarR.Y(objI4);
                }
                t(cVarE111119, cVarE1111110, cVarE111117, cVar16, z2118, function1111118, (Function0) objI4, c0VarR, ((i219 >> 9) & 57344) | 438);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                lmVar2 = lmVar4;
                z16 = z2119;
                a0Var2 = a0Var18;
                jVar2 = jVar;
                z15 = z2118;
                function5 = function7;
            } else {
                c0VarR.u();
                z15 = z12;
                lmVar2 = lmVar;
                jVar2 = jVar;
                c0Var2 = c0VarR;
                z16 = z13;
                function5 = function4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 805306368;
        i21 = i12;
        if ((i12 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i21 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z12;
                }
                if ((i11 & 128) != 0) {
                    lmVarA = mm.f30654a.a(c0VarR, 6);
                    i22 = i21 & (-234881025);
                } else {
                    lmVarA = lmVar;
                    i22 = i21;
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111119 = function4;
                a0Var3 = a0Var2;
                function6 = function1111119;
                if (i19 != 0) {
                    z18 = z17;
                    i23 = i22;
                    lmVar3 = lmVarA;
                    z19 = z13;
                    jVar = null;
                } else {
                    z18 = z17;
                    i23 = i22;
                    lmVar3 = lmVarA;
                    z19 = z13;
                }
            } else {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z12;
                }
                if ((i11 & 128) != 0) {
                    lmVarA = mm.f30654a.a(c0VarR, 6);
                    i22 = i21 & (-234881025);
                } else {
                    lmVarA = lmVar;
                    i22 = i21;
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111110 = function4;
                a0Var3 = a0Var2;
                function6 = function11111110;
                if (i19 != 0) {
                    z18 = z17;
                    i23 = i22;
                    lmVar3 = lmVarA;
                    z19 = z13;
                    jVar = null;
                } else {
                    z18 = z17;
                    i23 = i22;
                    lmVar3 = lmVarA;
                    z19 = z13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(974293026, i23, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
            }
            if (jVar == null) {
                c0VarR.E(-224963495);
                objI5 = c0VarR.i0();
                if (objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI5 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI5);
                }
                c0VarR.A();
                jVar3 = (androidx.compose.foundation.interaction.j) objI5;
            } else {
                c0VarR.E(-7257538);
                c0VarR.A();
                jVar3 = jVar;
            }
            d0.h1 h1Var16 = d0.h1.DefaultEffects;
            y0VarB = hm.b(h1Var16, c0VarR, 6);
            int i2110 = i23;
            jVar4 = jVar3;
            lmVar4 = lmVar3;
            boolean z21110 = z18;
            androidx.compose.runtime.internal.c cVarE1111111 = androidx.compose.runtime.internal.w.e(-876637252, true, new c(lmVar4, z10, z19, y0VarB, function6, z18, function2), c0VarR, 54);
            if (function6 == null) {
                c0VarR.E(-224036658);
                c0VarR.A();
                function7 = function6;
                cVar = null;
            } else {
                c0VarR.E(-224036657);
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111 = function6;
                function7 = function11111111;
                androidx.compose.runtime.internal.c cVarE1111112 = androidx.compose.runtime.internal.w.e(802208206, true, new d(lmVar4, z10, z19, y0VarB, function11111111), c0VarR, 54);
                c0VarR.A();
                cVar = cVarE1111112;
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI0);
            }
            l3Var = (androidx.compose.runtime.l3) objI0;
            boolean z21111 = z19;
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            androidx.compose.runtime.internal.c cVar17 = cVar;
            androidx.compose.ui.a0 a0VarQ16 = androidx.compose.foundation.layout.x5.q(x5Var2, androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.selection.c.a(a0Var19, z10, jVar4, null, z21111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 0.0f, f34785e, 1, null), 1.0f, false, 2, null);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.qm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ym.s(l3Var, (androidx.compose.ui.unit.u) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA16 = androidx.compose.ui.layout.y1.a(a0VarQ16, (Function1) objI1);
            androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), true);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarA16);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK16, aVar17.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar17.f());
            androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            n7VarF = androidx.compose.animation.core.f.f(f10, hm.b(h1Var16, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            n7VarF2 = androidx.compose.animation.core.f.f(f11, hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            androidx.compose.ui.unit.d dVar16 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            jG = n0.g.g((((long) Float.floatToRawIntBits((q(l3Var) - dVar16.g6(d0.l1.f268418a.b())) / 2)) << c10) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(dVar16.S7(f34790j)))));
            Unit unit16 = Unit.f312394a;
            zD = c0VarR.D(jVar4) | c0VarR.L(jG);
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                c0VarR.Y(objI2);
            } else {
                objI2 = new androidx.compose.material3.internal.z2(jVar4, jG, null);
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.internal.c cVarE1111113 = androidx.compose.runtime.internal.w.e(-2082182507, true, new b((androidx.compose.material3.internal.z2) objI2), c0VarR, 54);
            androidx.compose.runtime.internal.c cVarE1111114 = androidx.compose.runtime.internal.w.e(-799524251, true, new a(n7VarF, lmVar4), c0VarR, 54);
            zD2 = c0VarR.D(n7VarF);
            objI3 = c0VarR.i0();
            if (zD2) {
                objI3 = new Function0() { // from class: androidx.compose.material3.rm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ym.n(n7VarF));
                    }
                };
                c0VarR.Y(objI3);
            } else {
                objI3 = new Function0() { // from class: androidx.compose.material3.rm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ym.n(n7VarF));
                    }
                };
                c0VarR.Y(objI3);
            }
            Function0 function11111112 = (Function0) objI3;
            zD3 = c0VarR.D(n7VarF2);
            objI4 = c0VarR.i0();
            if (zD3) {
                objI4 = new Function0() { // from class: androidx.compose.material3.sm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ym.o(n7VarF2));
                    }
                };
                c0VarR.Y(objI4);
            } else {
                objI4 = new Function0() { // from class: androidx.compose.material3.sm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ym.o(n7VarF2));
                    }
                };
                c0VarR.Y(objI4);
            }
            t(cVarE1111113, cVarE1111114, cVarE1111111, cVar17, z21110, function11111112, (Function0) objI4, c0VarR, ((i2110 >> 9) & 57344) | 438);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var2 = c0VarR;
            lmVar2 = lmVar4;
            z16 = z21111;
            a0Var2 = a0Var19;
            jVar2 = jVar;
            z15 = z21110;
            function5 = function7;
        } else {
            c0VarR.u();
            z15 = z12;
            lmVar2 = lmVar;
            jVar2 = jVar;
            c0Var2 = c0VarR;
            z16 = z13;
            function5 = function4;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.tm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ym.p(x5Var, z10, function0, function2, a0Var2, z16, function5, z15, lmVar2, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.foundation.layout.x5 x5Var, boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, boolean z12, lm lmVar, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        m(x5Var, z10, function0, function2, a0Var, z11, function3, z12, lmVar, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final int q(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    private static final void r(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.compose.runtime.l3 l3Var, androidx.compose.ui.unit.u uVar) {
        r(l3Var, (int) (uVar.q() >> 32));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    private static final void t(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, final boolean z10, final Function0<Float> function0, final Function0<Float> function1, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1019541078);
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
                androidx.compose.runtime.m0.A0(-1019541078, i11, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:553)");
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
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, f34783c);
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
                c0VarR.E(-660471321);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, "label");
                boolean z12 = (i12 == 16384) | ((458752 & i11) == 131072);
                Object objI1 = c0VarR.i0();
                if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.vm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ym.u(z10, function0, (androidx.compose.ui.graphics.r1) obj);
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
                c0VarR.E(-660200319);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ym.v(function2, function3, function4, function5, z10, function0, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(boolean z10, Function0 function0, androidx.compose.ui.graphics.r1 r1Var) {
        r1Var.setAlpha(z10 ? 1.0f : ((Number) function0.invoke()).floatValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function2 function2, Function2 function3, Function2 function4, Function2 function5, boolean z10, Function0 function0, Function0 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        t(function2, function3, function4, function5, z10, function0, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        l(a0Var, j10, j11, f10, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
