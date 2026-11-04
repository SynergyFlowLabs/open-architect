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
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,439:1\n75#2:440\n75#2:441\n75#2:442\n67#3:443\n65#3,5:444\n71#3:455\n1247#4,6:449\n1282#4,6:463\n1832#5,7:456\n79#6:469\n77#6,8:470\n86#6,3:487\n89#6,2:496\n79#6,6:509\n86#6,3:524\n89#6,2:533\n93#6:538\n79#6,6:550\n86#6,3:565\n89#6,2:574\n93#6:579\n93#6:583\n347#7,9:478\n356#7:498\n347#7,9:515\n356#7,3:535\n347#7,9:556\n356#7,3:576\n357#7,2:581\n4206#8,6:490\n4206#8,6:527\n4206#8,6:568\n70#9:499\n67#9,9:500\n77#9:539\n70#9:540\n67#9,9:541\n77#9:580\n85#10:584\n113#11:585\n113#11:586\n113#11:587\n113#11:588\n113#11:589\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n98#1:440\n162#1:441\n234#1:442\n279#1:443\n279#1:444,5\n279#1:455\n279#1:449,6\n309#1:463,6\n279#1:456,7\n302#1:469\n302#1:470,8\n302#1:487,3\n302#1:496,2\n304#1:509,6\n304#1:524,3\n304#1:533,2\n304#1:538\n307#1:550,6\n307#1:565,3\n307#1:574,2\n307#1:579\n302#1:583\n302#1:478,9\n302#1:498\n304#1:515,9\n304#1:535,3\n307#1:556,9\n307#1:576,3\n302#1:581,2\n302#1:490,6\n304#1:527,6\n307#1:568,6\n304#1:499\n304#1:500,9\n304#1:539\n307#1:540\n307#1:541,9\n307#1:580\n279#1:584\n421#1:585\n424#1:586\n428#1:587\n432#1:588\n438#1:589\n*E\n"})
public final class d30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f26980a = d0.b2.f267655a.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26981b = androidx.compose.ui.unit.h.r(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f26982c = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f26983d = androidx.compose.ui.unit.h.r(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f26984e = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f26985f = androidx.compose.ui.unit.a0.m(20);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f26986g = androidx.compose.ui.unit.h.r(8);

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,439:1\n99#2,6:440\n106#2:476\n79#3,6:446\n86#3,3:461\n89#3,2:470\n93#3:475\n347#4,9:452\n356#4,3:472\n4206#5,6:464\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$1\n*L\n172#1:440,6\n172#1:476\n172#1:446,6\n172#1:461,3\n172#1:470,2\n172#1:475\n172#1:452,9\n172#1:472,3\n172#1:464,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f26987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f26989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.z2 f26990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f26991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26994h;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.z2 z2Var, boolean z11, Function0<Unit> function0, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f26987a = a0Var;
            this.f26988b = z10;
            this.f26989c = jVar;
            this.f26990d = z2Var;
            this.f26991e = z11;
            this.f26992f = function0;
            this.f26993g = function2;
            this.f26994h = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1831009258, i10, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:171)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.selection.c.a(androidx.compose.foundation.layout.i6.i(this.f26987a, d30.f26980a), this.f26988b, this.f26989c, this.f26990d, this.f26991e, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), this.f26992f), d30.x(), 0.0f, 2, null), 0.0f, 1, null);
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26993g;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f26994h;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarM, cVarQ, c0Var, 54);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
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
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.t(androidx.compose.ui.a0.E, d30.f26986g), c0Var, 6);
            q50.o(androidx.compose.ui.text.y3.m(la0.e(d0.b2.f267655a.z(), c0Var, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function3, c0Var, 0);
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

    static final class b implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26996b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f26995a = function2;
            this.f26996b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-906085472, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:120)");
            }
            d30.j(this.f26995a, this.f26996b, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,439:1\n87#2,6:440\n94#2:476\n79#3,6:446\n86#3,3:461\n89#3,2:470\n93#3:475\n347#4,9:452\n356#4,3:472\n4206#5,6:464\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$3\n*L\n245#1:440,6\n245#1:476\n245#1:446,6\n245#1:461,3\n245#1:470,2\n245#1:475\n245#1:452,9\n245#1:472,3\n245#1:464,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f26997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f26999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.z2 f27000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f27001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f27002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f27003g;

        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.z2 z2Var, boolean z11, Function0<Unit> function0, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f26997a = a0Var;
            this.f26998b = z10;
            this.f26999c = jVar;
            this.f27000d = z2Var;
            this.f27001e = z11;
            this.f27002f = function0;
            this.f27003g = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1128552423, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:244)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.selection.c.a(this.f26997a, this.f26998b, this.f26999c, this.f27000d, this.f27001e, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), this.f27002f), 0.0f, 1, null);
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f27003g;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarM, bVarM, c0Var, 54);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
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

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27004a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f27004a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1745256900, i10, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
            }
            q50.o(androidx.compose.ui.text.y3.m(la0.e(d0.b2.f267655a.z(), c0Var, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.f27004a, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,439:1\n563#2,2:440\n34#2,6:442\n565#2:448\n563#2,2:450\n34#2,6:452\n565#2:458\n1#3:449\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n*L\n313#1:440,2\n313#1:442,6\n313#1:448\n323#1:450,2\n323#1:452,6\n323#1:458\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27006b;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f27005a = function2;
            this.f27006b = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.c1 c1Var, int i10, int i11, Integer num, Integer num2, androidx.compose.ui.layout.i2.a aVar) {
            if (i2Var != null && i2Var2 != null) {
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                d30.y(aVar, c1Var, i2Var, i2Var2, i10, i11, iIntValue, num2.intValue());
            } else if (i2Var != null) {
                d30.z(aVar, i2Var, i11);
            } else if (i2Var2 != null) {
                d30.z(aVar, i2Var2, i11);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.i2 i2VarP0;
            androidx.compose.ui.layout.i2 i2VarP1;
            if (this.f27005a != null) {
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                        throw new kotlin.a0();
                    }
                    androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "text")) {
                        i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null));
                        break;
                    }
                    i10++;
                }
            } else {
                i2VarP0 = null;
            }
            if (this.f27006b != null) {
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                        throw new kotlin.a0();
                    }
                    androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "icon")) {
                        i2VarP1 = z0Var2.P0(j10);
                        break;
                    }
                    i11++;
                }
            } else {
                i2VarP1 = null;
            }
            final int iMax = Math.max(i2VarP0 != null ? i2VarP0.h1() : 0, i2VarP1 != null ? i2VarP1.h1() : 0);
            final int iMax2 = Math.max(c1Var.g6((i2VarP0 == null || i2VarP1 == null) ? d30.f26980a : d30.f26981b), (i2VarP1 != null ? i2VarP1.c1() : 0) + (i2VarP0 != null ? i2VarP0.c1() : 0) + c1Var.c8(d30.f26985f));
            final Integer numValueOf = i2VarP0 != null ? Integer.valueOf(i2VarP0.M(androidx.compose.ui.layout.b.a())) : null;
            final Integer numValueOf2 = i2VarP0 != null ? Integer.valueOf(i2VarP0.M(androidx.compose.ui.layout.b.b())) : null;
            final androidx.compose.ui.layout.i2 i2Var = i2VarP0;
            final androidx.compose.ui.layout.i2 i2Var2 = i2VarP1;
            return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iMax2, null, new Function1() { // from class: androidx.compose.material3.e30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d30.e.g(i2Var, i2Var2, c1Var, iMax, iMax2, numValueOf, numValueOf2, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    static final class f implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27007a = new f();

        f() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> y0VarB;
            c0Var.E(1058649156);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1058649156, i10, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:280)");
            }
            if (bVar.f(Boolean.FALSE, Boolean.TRUE)) {
                c0Var.E(272207019);
                y0VarB = hm.b(d0.h1.DefaultEffects, c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(272326989);
                y0VarB = hm.b(d0.h1.FastEffects, c0Var, 6);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0VarB;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154 A[PHI: r7 r10 r11 r14 r18
      0x0154: PHI (r7v10 androidx.compose.ui.a0) = (r7v5 androidx.compose.ui.a0), (r7v3 androidx.compose.ui.a0) binds: [B:129:0x0182, B:115:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r10v13 boolean) = (r10v5 boolean), (r10v4 boolean) binds: [B:129:0x0182, B:115:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r11v26 int) = (r11v16 int), (r11v28 int) binds: [B:129:0x0182, B:115:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v7 long) = (r14v4 long), (r14v1 long) binds: [B:129:0x0182, B:115:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r18v10 long) = (r18v7 long), (r18v11 long) binds: [B:129:0x0182, B:115:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0160  */
    /* JADX WARN: Code duplicated, block: B:124:0x0165  */
    /* JADX WARN: Code duplicated, block: B:127:0x0179  */
    /* JADX WARN: Code duplicated, block: B:128:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:142:0x020e  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, long j10, long j11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function0<Unit> function1;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        boolean z13;
        int i17;
        long jM;
        int i18;
        int i19;
        int i20;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        long j14;
        androidx.compose.foundation.interaction.j jVar3;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-611535578);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
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
        if ((i11 & 4) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(function2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i12 |= i13;
                }
                i14 = i11 & 16;
                if (i14 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    i16 = i11 & 32;
                    if (i16 != 0) {
                        if ((196608 & i10) == 0) {
                            z13 = z11;
                            if (c0VarR.G(z13)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i12 |= i17;
                        }
                        if ((1572864 & i10) == 0) {
                            jM = j10;
                            if ((i11 & 64) == 0 || !c0VarR.L(jM)) {
                                i23 = 524288;
                            } else {
                                i23 = 1048576;
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        if ((12582912 & i10) == 0) {
                            int i24 = i12;
                            if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                                i22 = 4194304;
                            } else {
                                i22 = 8388608;
                            }
                            i18 = i24 | i22;
                        } else {
                            i18 = i12;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i20 = 67108864;
                                } else {
                                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i18 |= i20;
                            }
                            if ((i18 & 38347923) != 38347922) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i18 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if ((i11 & 64) != 0) {
                                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                        i18 &= -3670017;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i18 &= -29360129;
                                        j14 = jM;
                                    } else {
                                        j14 = j11;
                                    }
                                    if (i19 != 0) {
                                        jVar3 = null;
                                    }
                                    boolean z16 = z13;
                                    i21 = i18;
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                                    }
                                    androidx.compose.ui.a0 a0Var4 = a0Var2;
                                    int i25 = i21 >> 18;
                                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z16, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | 3072);
                                    c0Var2 = c0VarR;
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    a0Var3 = a0Var4;
                                    jVar2 = jVar3;
                                    z15 = z16;
                                    j12 = j14;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 64) != 0) {
                                        i18 &= -3670017;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    j14 = j11;
                                }
                                jVar3 = jVar;
                                boolean z17 = z13;
                                i21 = i18;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                                }
                                androidx.compose.ui.a0 a0Var5 = a0Var2;
                                int i26 = i21 >> 18;
                                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var5, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z17, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 14) | 3072);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var5;
                                jVar2 = jVar3;
                                z15 = z17;
                                j12 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                a0Var3 = a0Var2;
                                z15 = z13;
                                j12 = j11;
                            }
                            j13 = jM;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i18 |= 100663296;
                        if ((i18 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            boolean z18 = z13;
                            i21 = i18;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                            }
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            int i27 = i21 >> 18;
                            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var6, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z18, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var6;
                            jVar2 = jVar3;
                            z15 = z18;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j12 = j11;
                        }
                        j13 = jM;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z13 = z11;
                    if ((1572864 & i10) == 0) {
                        jM = j10;
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((12582912 & i10) == 0) {
                        int i28 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i18 = i28 | i22;
                    } else {
                        i18 = i12;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i18 |= i20;
                        }
                        if ((i18 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            boolean z19 = z13;
                            i21 = i18;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                            }
                            androidx.compose.ui.a0 a0Var7 = a0Var2;
                            int i29 = i21 >> 18;
                            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var7, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z19, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var7;
                            jVar2 = jVar3;
                            z15 = z19;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j12 = j11;
                        }
                        j13 = jM;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 100663296;
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z110 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        int i210 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var8, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z110, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var8;
                        jVar2 = jVar3;
                        z15 = z110;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                a0Var2 = a0Var;
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((1572864 & i10) == 0) {
                        jM = j10;
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((12582912 & i10) == 0) {
                        int i211 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i18 = i211 | i22;
                    } else {
                        i18 = i12;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i18 |= i20;
                        }
                        if ((i18 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            boolean z111 = z13;
                            i21 = i18;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                            }
                            androidx.compose.ui.a0 a0Var9 = a0Var2;
                            int i212 = i21 >> 18;
                            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var9, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z111, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var9;
                            jVar2 = jVar3;
                            z15 = z111;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j12 = j11;
                        }
                        j13 = jM;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 100663296;
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z112 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        int i213 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var10, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z112, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var10;
                        jVar2 = jVar3;
                        z15 = z112;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i214 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i214 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z113 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var11 = a0Var2;
                        int i215 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var11, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z113, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var11;
                        jVar2 = jVar3;
                        z15 = z113;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z114 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var12 = a0Var2;
                    int i216 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var12, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z114, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var12;
                    jVar2 = jVar3;
                    z15 = z114;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function3;
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((1572864 & i10) == 0) {
                        jM = j10;
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((12582912 & i10) == 0) {
                        int i217 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i18 = i217 | i22;
                    } else {
                        i18 = i12;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i18 |= i20;
                        }
                        if ((i18 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            boolean z115 = z13;
                            i21 = i18;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                            }
                            androidx.compose.ui.a0 a0Var13 = a0Var2;
                            int i218 = i21 >> 18;
                            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var13, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z115, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var13;
                            jVar2 = jVar3;
                            z15 = z115;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j12 = j11;
                        }
                        j13 = jM;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 100663296;
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z116 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        int i219 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var14, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z116, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var14;
                        jVar2 = jVar3;
                        z15 = z116;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i2110 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i2110 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z117 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var15 = a0Var2;
                        int i2111 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var15, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z117, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var15;
                        jVar2 = jVar3;
                        z15 = z117;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z118 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    int i2112 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var16, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z118, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2112 & com.planner5d.library.engine.input.f.b.B) | (i2112 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var16;
                    jVar2 = jVar3;
                    z15 = z118;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            a0Var2 = a0Var;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i2113 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i2113 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z119 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var17 = a0Var2;
                        int i2114 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var17, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z119, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2114 & com.planner5d.library.engine.input.f.b.B) | (i2114 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var17;
                        jVar2 = jVar3;
                        z15 = z119;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z1110 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    int i2115 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var18, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1110, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var18;
                    jVar2 = jVar3;
                    z15 = z1110;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((1572864 & i10) == 0) {
                jM = j10;
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((12582912 & i10) == 0) {
                int i2116 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i18 = i2116 | i22;
            } else {
                i18 = i12;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z1111 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var19 = a0Var2;
                    int i2117 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var19, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1111, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var19;
                    jVar2 = jVar3;
                    z15 = z1111;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                boolean z1112 = z13;
                i21 = i18;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                }
                androidx.compose.ui.a0 a0Var110 = a0Var2;
                int i2118 = i21 >> 18;
                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var110, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1112, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2118 & com.planner5d.library.engine.input.f.b.B) | (i2118 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var110;
                jVar2 = jVar3;
                z15 = z1112;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                j12 = j11;
            }
            j13 = jM;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        if ((i11 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((1572864 & i10) == 0) {
                        jM = j10;
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((12582912 & i10) == 0) {
                        int i2119 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i18 = i2119 | i22;
                    } else {
                        i18 = i12;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i18 |= i20;
                        }
                        if ((i18 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i18 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i18 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                            }
                            boolean z1113 = z13;
                            i21 = i18;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                            }
                            androidx.compose.ui.a0 a0Var111 = a0Var2;
                            int i21110 = i21 >> 18;
                            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var111, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1113, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21110 & com.planner5d.library.engine.input.f.b.B) | (i21110 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var111;
                            jVar2 = jVar3;
                            z15 = z1113;
                            j12 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j12 = j11;
                        }
                        j13 = jM;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 100663296;
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z1114 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var112 = a0Var2;
                        int i21111 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var112, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1114, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var112;
                        jVar2 = jVar3;
                        z15 = z1114;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i21112 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i21112 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z1115 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var113 = a0Var2;
                        int i21113 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var113, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1115, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var113;
                        jVar2 = jVar3;
                        z15 = z1115;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z1116 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var114 = a0Var2;
                    int i21114 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var114, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1116, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21114 & com.planner5d.library.engine.input.f.b.B) | (i21114 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var114;
                    jVar2 = jVar3;
                    z15 = z1116;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            a0Var2 = a0Var;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i21115 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i21115 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z1117 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var115 = a0Var2;
                        int i21116 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var115, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1117, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21116 & com.planner5d.library.engine.input.f.b.B) | (i21116 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var115;
                        jVar2 = jVar3;
                        z15 = z1117;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z1118 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var116 = a0Var2;
                    int i21117 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var116, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1118, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21117 & com.planner5d.library.engine.input.f.b.B) | (i21117 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var116;
                    jVar2 = jVar3;
                    z15 = z1118;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((1572864 & i10) == 0) {
                jM = j10;
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((12582912 & i10) == 0) {
                int i21118 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i18 = i21118 | i22;
            } else {
                i18 = i12;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z1119 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var117 = a0Var2;
                    int i21119 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var117, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1119, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21119 & com.planner5d.library.engine.input.f.b.B) | (i21119 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var117;
                    jVar2 = jVar3;
                    z15 = z1119;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                boolean z11110 = z13;
                i21 = i18;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                }
                androidx.compose.ui.a0 a0Var118 = a0Var2;
                int i211110 = i21 >> 18;
                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var118, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11110, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211110 & com.planner5d.library.engine.input.f.b.B) | (i211110 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var118;
                jVar2 = jVar3;
                z15 = z11110;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                j12 = j11;
            }
            j13 = jM;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function4 = function3;
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((1572864 & i10) == 0) {
                    jM = j10;
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((12582912 & i10) == 0) {
                    int i211111 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i18 = i211111 | i22;
                } else {
                    i18 = i12;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i18 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i18 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i18 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                        }
                        boolean z11111 = z13;
                        i21 = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                        }
                        androidx.compose.ui.a0 a0Var119 = a0Var2;
                        int i211112 = i21 >> 18;
                        l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var119, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11111, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211112 & com.planner5d.library.engine.input.f.b.B) | (i211112 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var119;
                        jVar2 = jVar3;
                        z15 = z11111;
                        j12 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j12 = j11;
                    }
                    j13 = jM;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z11112 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    int i211113 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1110, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11112, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211113 & com.planner5d.library.engine.input.f.b.B) | (i211113 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1110;
                    jVar2 = jVar3;
                    z15 = z11112;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((1572864 & i10) == 0) {
                jM = j10;
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((12582912 & i10) == 0) {
                int i211114 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i18 = i211114 | i22;
            } else {
                i18 = i12;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z11113 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var1111 = a0Var2;
                    int i211115 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1111, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11113, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211115 & com.planner5d.library.engine.input.f.b.B) | (i211115 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1111;
                    jVar2 = jVar3;
                    z15 = z11113;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                boolean z11114 = z13;
                i21 = i18;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                }
                androidx.compose.ui.a0 a0Var1112 = a0Var2;
                int i211116 = i21 >> 18;
                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1112, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11114, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211116 & com.planner5d.library.engine.input.f.b.B) | (i211116 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1112;
                jVar2 = jVar3;
                z15 = z11114;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                j12 = j11;
            }
            j13 = jM;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a0Var2 = a0Var;
        i16 = i11 & 32;
        if (i16 != 0) {
            if ((196608 & i10) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((1572864 & i10) == 0) {
                jM = j10;
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((12582912 & i10) == 0) {
                int i211117 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i18 = i211117 | i22;
            } else {
                i18 = i12;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i18 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i18 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                    }
                    boolean z11115 = z13;
                    i21 = i18;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                    }
                    androidx.compose.ui.a0 a0Var1113 = a0Var2;
                    int i211118 = i21 >> 18;
                    l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1113, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11115, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211118 & com.planner5d.library.engine.input.f.b.B) | (i211118 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1113;
                    jVar2 = jVar3;
                    z15 = z11115;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j12 = j11;
                }
                j13 = jM;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                boolean z11116 = z13;
                i21 = i18;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                }
                androidx.compose.ui.a0 a0Var1114 = a0Var2;
                int i211119 = i21 >> 18;
                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1114, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11116, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211119 & com.planner5d.library.engine.input.f.b.B) | (i211119 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1114;
                jVar2 = jVar3;
                z15 = z11116;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                j12 = j11;
            }
            j13 = jM;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z13 = z11;
        if ((1572864 & i10) == 0) {
            jM = j10;
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        } else {
            jM = j10;
        }
        if ((12582912 & i10) == 0) {
            int i2111110 = i12;
            if ((i11 & 128) == 0) {
                i22 = 4194304;
            } else {
                i22 = 4194304;
            }
            i18 = i2111110 | i22;
        } else {
            i18 = i12;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i18 |= i20;
            }
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i18 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                }
                boolean z11117 = z13;
                i21 = i18;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                }
                androidx.compose.ui.a0 a0Var1115 = a0Var2;
                int i2111111 = i21 >> 18;
                l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1115, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11117, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1115;
                jVar2 = jVar3;
                z15 = z11117;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                j12 = j11;
            }
            j13 = jM;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 100663296;
        if ((i18 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i18 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 &= -29360129;
                    j14 = jM;
                } else {
                    j14 = j11;
                }
                if (i19 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            } else {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i18 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 &= -29360129;
                    j14 = jM;
                } else {
                    j14 = j11;
                }
                if (i19 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
            }
            boolean z11118 = z13;
            i21 = i18;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-611535578, i21, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
            }
            androidx.compose.ui.a0 a0Var1116 = a0Var2;
            int i2111112 = i21 >> 18;
            l(jM, j14, z10, androidx.compose.runtime.internal.w.e(1831009258, true, new a(a0Var1116, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z11118, function1, function4, function2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111112 & com.planner5d.library.engine.input.f.b.B) | (i2111112 & 14) | 3072);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var1116;
            jVar2 = jVar3;
            z15 = z11118;
            j12 = j14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            jVar2 = jVar;
            a0Var3 = a0Var2;
            z15 = z13;
            j12 = j11;
        }
        j13 = jM;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d30.g(z10, function0, function2, function3, a0Var3, z15, j13, j12, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(boolean z10, Function0 function0, Function2 function2, Function2 function3, androidx.compose.ui.a0 a0Var, boolean z11, long j10, long j11, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(z10, function0, function2, function3, a0Var, z11, j10, j11, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x012d A[PHI: r0 r4 r8 r9 r13
      0x012d: PHI (r0v29 int) = (r0v17 int), (r0v33 int), (r0v34 int) binds: [B:120:0x015f, B:105:0x012a, B:106:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r4v8 androidx.compose.ui.a0) = (r4v5 androidx.compose.ui.a0), (r4v2 androidx.compose.ui.a0), (r4v2 androidx.compose.ui.a0) binds: [B:120:0x015f, B:105:0x012a, B:106:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r8v9 boolean) = (r8v3 boolean), (r8v2 boolean), (r8v2 boolean) binds: [B:120:0x015f, B:105:0x012a, B:106:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r9v13 long) = (r9v9 long), (r9v6 long), (r9v6 long) binds: [B:120:0x015f, B:105:0x012a, B:106:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r13v9 long) = (r13v5 long), (r13v3 long), (r13v3 long) binds: [B:120:0x015f, B:105:0x012a, B:106:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x01df  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, long j10, long j11, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        boolean z13;
        int i16;
        long jM;
        long j12;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z14;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final long j13;
        final long j14;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        int i21;
        androidx.compose.ui.a0 a0Var4;
        long j15;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1573136853);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function0) ? 32 : 16;
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
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            jM = j10;
                            int i22 = c0VarR.L(jM) ? 16384 : 8192;
                            i12 |= i22;
                        } else {
                            jM = j10;
                        }
                        i12 |= i22;
                    } else {
                        jM = j10;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            j12 = j11;
                            int i23 = c0VarR.L(j12) ? 131072 : 65536;
                            i12 |= i23;
                        } else {
                            j12 = j11;
                        }
                        i12 |= i23;
                    } else {
                        j12 = j11;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(jVar)) {
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
                        i20 = i12;
                        if ((i12 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i21 = i20 & (-57345);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    j12 = jM;
                                }
                                if (i17 != 0) {
                                    a0Var4 = a0Var2;
                                    j15 = j12;
                                    jVar3 = null;
                                }
                                boolean z16 = z13;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                                }
                                int i24 = i21 >> 12;
                                l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z16, function0, nVar), c0VarR, 54), c0VarR, (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 14) | 3072 | ((i21 << 6) & 896));
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                j13 = jM;
                                jVar2 = jVar3;
                                j14 = j15;
                                a0Var3 = a0Var4;
                                z15 = z16;
                            } else {
                                c0VarR.u();
                                i21 = (i11 & 16) != 0 ? i20 & (-57345) : i20;
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                }
                            }
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                            boolean z17 = z13;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                            }
                            int i25 = i21 >> 12;
                            l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z17, function0, nVar), c0VarR, 54), c0VarR, (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | 3072 | ((i21 << 6) & 896));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j13 = jM;
                            jVar2 = jVar3;
                            j14 = j15;
                            a0Var3 = a0Var4;
                            z15 = z17;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            j13 = jM;
                            j14 = j12;
                            jVar2 = jVar;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    i20 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        }
                        boolean z18 = z13;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i26 = i21 >> 12;
                        l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z18, function0, nVar), c0VarR, 54), c0VarR, (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 14) | 3072 | ((i21 << 6) & 896));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j13 = jM;
                        jVar2 = jVar3;
                        j14 = j15;
                        a0Var3 = a0Var4;
                        z15 = z18;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j13 = jM;
                        j14 = j12;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z13 = z11;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i22;
                    } else {
                        jM = j10;
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j11;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j11;
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
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
                    i20 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        }
                        boolean z19 = z13;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i27 = i21 >> 12;
                        l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z19, function0, nVar), c0VarR, 54), c0VarR, (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 14) | 3072 | ((i21 << 6) & 896));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j13 = jM;
                        jVar2 = jVar3;
                        j14 = j15;
                        a0Var3 = a0Var4;
                        z15 = z19;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j13 = jM;
                        j14 = j12;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z110 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i28 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z110, function0, nVar), c0VarR, 54), c0VarR, (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z110;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i22;
                    } else {
                        jM = j10;
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j11;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j11;
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
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
                    i20 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        }
                        boolean z111 = z13;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i29 = i21 >> 12;
                        l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z111, function0, nVar), c0VarR, 54), c0VarR, (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 14) | 3072 | ((i21 << 6) & 896));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j13 = jM;
                        jVar2 = jVar3;
                        j14 = j15;
                        a0Var3 = a0Var4;
                        z15 = z111;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j13 = jM;
                        j14 = j12;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z112 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i210 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z112, function0, nVar), c0VarR, 54), c0VarR, (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z112;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j11;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i12 |= i23;
            } else {
                j12 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
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
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z113 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i211 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z113, function0, nVar), c0VarR, 54), c0VarR, (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z113;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i20 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                }
                boolean z114 = z13;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i212 = i21 >> 12;
                l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z114, function0, nVar), c0VarR, 54), c0VarR, (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 14) | 3072 | ((i21 << 6) & 896));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = jM;
                jVar2 = jVar3;
                j14 = j15;
                a0Var3 = a0Var4;
                z15 = z114;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                j13 = jM;
                j14 = j12;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
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
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i22;
                    } else {
                        jM = j10;
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j11;
                        if (c0VarR.L(j12)) {
                        }
                        i12 |= i23;
                    } else {
                        j12 = j11;
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
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
                    i20 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i21 = i20 & (-57345);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                j12 = jM;
                            }
                            if (i17 != 0) {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = null;
                            } else {
                                a0Var4 = a0Var2;
                                j15 = j12;
                                jVar3 = jVar;
                            }
                        }
                        boolean z115 = z13;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i213 = i21 >> 12;
                        l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z115, function0, nVar), c0VarR, 54), c0VarR, (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 14) | 3072 | ((i21 << 6) & 896));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j13 = jM;
                        jVar2 = jVar3;
                        j14 = j15;
                        a0Var3 = a0Var4;
                        z15 = z115;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        j13 = jM;
                        j14 = j12;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z116 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i214 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z116, function0, nVar), c0VarR, 54), c0VarR, (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z116;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j11;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i12 |= i23;
            } else {
                j12 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
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
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z117 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i215 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z117, function0, nVar), c0VarR, 54), c0VarR, (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z117;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i20 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                }
                boolean z118 = z13;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i216 = i21 >> 12;
                l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z118, function0, nVar), c0VarR, 54), c0VarR, (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 14) | 3072 | ((i21 << 6) & 896));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = jM;
                jVar2 = jVar3;
                j14 = j15;
                a0Var3 = a0Var4;
                z15 = z118;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                j13 = jM;
                j14 = j12;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j11;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i23;
                } else {
                    j12 = j11;
                }
                i12 |= i23;
            } else {
                j12 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
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
                i20 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i21 = i20 & (-57345);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            j12 = jM;
                        }
                        if (i17 != 0) {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = null;
                        } else {
                            a0Var4 = a0Var2;
                            j15 = j12;
                            jVar3 = jVar;
                        }
                    }
                    boolean z119 = z13;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i217 = i21 >> 12;
                    l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z119, function0, nVar), c0VarR, 54), c0VarR, (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 14) | 3072 | ((i21 << 6) & 896));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j13 = jM;
                    jVar2 = jVar3;
                    j14 = j15;
                    a0Var3 = a0Var4;
                    z15 = z119;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    j13 = jM;
                    j14 = j12;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i20 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                }
                boolean z1110 = z13;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i218 = i21 >> 12;
                l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1110, function0, nVar), c0VarR, 54), c0VarR, (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 14) | 3072 | ((i21 << 6) & 896));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = jM;
                jVar2 = jVar3;
                j14 = j15;
                a0Var3 = a0Var4;
                z15 = z1110;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                j13 = jM;
                j14 = j12;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jM = j10;
                if (c0VarR.L(jM)) {
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            i12 |= i22;
        } else {
            jM = j10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j12 = j11;
                if (c0VarR.L(j12)) {
                }
                i12 |= i23;
            } else {
                j12 = j11;
            }
            i12 |= i23;
        } else {
            j12 = j11;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(jVar)) {
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
            i20 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i21 = i20 & (-57345);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        j12 = jM;
                    }
                    if (i17 != 0) {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = null;
                    } else {
                        a0Var4 = a0Var2;
                        j15 = j12;
                        jVar3 = jVar;
                    }
                }
                boolean z1111 = z13;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i219 = i21 >> 12;
                l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1111, function0, nVar), c0VarR, 54), c0VarR, (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 14) | 3072 | ((i21 << 6) & 896));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j13 = jM;
                jVar2 = jVar3;
                j14 = j15;
                a0Var3 = a0Var4;
                z15 = z1111;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                j13 = jM;
                j14 = j12;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        i20 = i12;
        if ((i12 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i21 = i20 & (-57345);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    i21 &= -458753;
                    j12 = jM;
                }
                if (i17 != 0) {
                    a0Var4 = a0Var2;
                    j15 = j12;
                    jVar3 = null;
                } else {
                    a0Var4 = a0Var2;
                    j15 = j12;
                    jVar3 = jVar;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i21 = i20 & (-57345);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    i21 &= -458753;
                    j12 = jM;
                }
                if (i17 != 0) {
                    a0Var4 = a0Var2;
                    j15 = j12;
                    jVar3 = null;
                } else {
                    a0Var4 = a0Var2;
                    j15 = j12;
                    jVar3 = jVar;
                }
            }
            boolean z1112 = z13;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1573136853, i21, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
            }
            int i2110 = i21 >> 12;
            l(jM, j15, z10, androidx.compose.runtime.internal.w.e(1128552423, true, new c(a0Var4, z12, jVar3, gt.e(true, 0.0f, jM, 2, null), z1112, function0, nVar), c0VarR, 54), c0VarR, (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 14) | 3072 | ((i21 << 6) & 896));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j13 = jM;
            jVar2 = jVar3;
            j14 = j15;
            a0Var3 = a0Var4;
            z15 = z1112;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z15 = z13;
            j13 = jM;
            j14 = j12;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.y20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d30.o(z10, function0, a0Var3, z15, j13, j14, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:144:0x01da  */
    /* JADX WARN: Code duplicated, block: B:147:0x0223  */
    /* JADX WARN: Code duplicated, block: B:149:0x0235  */
    /* JADX WARN: Code duplicated, block: B:152:0x024c  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, long j10, long j11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function0<Unit> function1;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i16;
        int i17;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        long jM;
        long j14;
        boolean z16;
        androidx.compose.runtime.internal.c cVarE;
        long j15;
        long j16;
        int i23;
        androidx.compose.foundation.interaction.j jVar3;
        int i24;
        int i25;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1015017965);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
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
        int i26 = i11 & 4;
        if (i26 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        function4 = function2;
                        if (c0VarR.k0(function4)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            function5 = function3;
                            if (c0VarR.k0(function5)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i11 & 64) == 0) {
                                i25 = i12;
                                i20 = i26;
                                int i27 = c0VarR.L(j10) ? 1048576 : 524288;
                                i19 = i25 | i27;
                            } else {
                                i25 = i12;
                                i20 = i26;
                            }
                            i19 = i25 | i27;
                        } else {
                            i19 = i12;
                            i20 = i26;
                        }
                        if ((i10 & 12582912) != 0) {
                            if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                                i24 = 4194304;
                            } else {
                                i24 = 8388608;
                            }
                            i19 |= i24;
                        }
                        i21 = i11 & 256;
                        if (i21 != 0) {
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.D(jVar)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i19 |= i22;
                            }
                            if ((i19 & 38347923) != 38347922) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i19 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i20 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i13 != 0) {
                                        z13 = true;
                                    }
                                    if (i15 != 0) {
                                        function4 = null;
                                    }
                                    if (i17 != 0) {
                                        function5 = null;
                                    }
                                    if ((i11 & 64) != 0) {
                                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                        i19 &= -3670017;
                                    } else {
                                        jM = j10;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i19 &= -29360129;
                                        j14 = jM;
                                    } else {
                                        j14 = j11;
                                    }
                                    z16 = z13;
                                    cVarE = null;
                                    if (i21 != 0) {
                                        j15 = jM;
                                        i23 = 1015017965;
                                        jVar3 = null;
                                        j16 = j14;
                                    } else {
                                        j15 = jM;
                                        j16 = j14;
                                        i23 = 1015017965;
                                        jVar3 = jVar;
                                    }
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 64) != 0) {
                                        i19 &= -3670017;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i19 &= -29360129;
                                    }
                                    j15 = j10;
                                    jVar3 = jVar;
                                    z16 = z13;
                                    cVarE = null;
                                    i23 = 1015017965;
                                    j16 = j11;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                                }
                                if (function4 == null) {
                                    c0VarR.E(1830899669);
                                } else {
                                    c0VarR.E(1830899670);
                                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                                }
                                c0VarR.A();
                                int i28 = i19 >> 6;
                                c0Var2 = c0VarR;
                                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var2;
                                function6 = function4;
                                function7 = function5;
                                z15 = z16;
                                j12 = j15;
                                j13 = j16;
                                jVar2 = jVar3;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                a0Var3 = a0Var2;
                                z15 = z13;
                                function6 = function4;
                                function7 = function5;
                                j12 = j10;
                                j13 = j11;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i19 |= 100663296;
                        if ((i19 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                c0VarR.E(1830899669);
                            } else {
                                c0VarR.E(1830899670);
                                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            int i29 = i19 >> 6;
                            c0Var2 = c0VarR;
                            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var2;
                            function6 = function4;
                            function7 = function5;
                            z15 = z16;
                            j12 = j15;
                            j13 = j16;
                            jVar2 = jVar3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            function6 = function4;
                            function7 = function5;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function3;
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            i25 = i12;
                            i20 = i26;
                            if (c0VarR.L(j10)) {
                            }
                            i19 = i25 | i27;
                        } else {
                            i25 = i12;
                            i20 = i26;
                        }
                        i19 = i25 | i27;
                    } else {
                        i19 = i12;
                        i20 = i26;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i19 |= i24;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i19 |= i22;
                        }
                        if ((i19 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                c0VarR.E(1830899669);
                            } else {
                                c0VarR.E(1830899670);
                                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            int i210 = i19 >> 6;
                            c0Var2 = c0VarR;
                            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var2;
                            function6 = function4;
                            function7 = function5;
                            z15 = z16;
                            j12 = j15;
                            j13 = j16;
                            jVar2 = jVar3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            function6 = function4;
                            function7 = function5;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 100663296;
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i211 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function4 = function2;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            i25 = i12;
                            i20 = i26;
                            if (c0VarR.L(j10)) {
                            }
                            i19 = i25 | i27;
                        } else {
                            i25 = i12;
                            i20 = i26;
                        }
                        i19 = i25 | i27;
                    } else {
                        i19 = i12;
                        i20 = i26;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i19 |= i24;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i19 |= i22;
                        }
                        if ((i19 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                c0VarR.E(1830899669);
                            } else {
                                c0VarR.E(1830899670);
                                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            int i212 = i19 >> 6;
                            c0Var2 = c0VarR;
                            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var2;
                            function6 = function4;
                            function7 = function5;
                            z15 = z16;
                            j12 = j15;
                            j13 = j16;
                            jVar2 = jVar3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            function6 = function4;
                            function7 = function5;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 100663296;
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i213 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i214 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i214) | (458752 & i214) | (i214 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i215 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            i25 = i12;
                            i20 = i26;
                            if (c0VarR.L(j10)) {
                            }
                            i19 = i25 | i27;
                        } else {
                            i25 = i12;
                            i20 = i26;
                        }
                        i19 = i25 | i27;
                    } else {
                        i19 = i12;
                        i20 = i26;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i19 |= i24;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i19 |= i22;
                        }
                        if ((i19 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                c0VarR.E(1830899669);
                            } else {
                                c0VarR.E(1830899670);
                                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            int i216 = i19 >> 6;
                            c0Var2 = c0VarR;
                            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i216) | (458752 & i216) | (i216 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var2;
                            function6 = function4;
                            function7 = function5;
                            z15 = z16;
                            j12 = j15;
                            j13 = j16;
                            jVar2 = jVar3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            function6 = function4;
                            function7 = function5;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 100663296;
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i217 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i218 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i218) | (458752 & i218) | (i218 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i219 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function4 = function2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i2110 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2110) | (458752 & i2110) | (i2110 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i2111 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i25 = i12;
                    i20 = i26;
                    if (c0VarR.L(j10)) {
                    }
                    i19 = i25 | i27;
                } else {
                    i25 = i12;
                    i20 = i26;
                }
                i19 = i25 | i27;
            } else {
                i19 = i12;
                i20 = i26;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i19 |= i24;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i19 |= i22;
                }
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i2112 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2112) | (458752 & i2112) | (i2112 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    c0VarR.E(1830899669);
                } else {
                    c0VarR.E(1830899670);
                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                int i2113 = i19 >> 6;
                c0Var2 = c0VarR;
                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                function6 = function4;
                function7 = function5;
                z15 = z16;
                j12 = j15;
                j13 = j16;
                jVar2 = jVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                function6 = function4;
                function7 = function5;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c0VarR.k0(function4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            i25 = i12;
                            i20 = i26;
                            if (c0VarR.L(j10)) {
                            }
                            i19 = i25 | i27;
                        } else {
                            i25 = i12;
                            i20 = i26;
                        }
                        i19 = i25 | i27;
                    } else {
                        i19 = i12;
                        i20 = i26;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i19 |= i24;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i19 |= i22;
                        }
                        if ((i19 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            } else {
                                if (i20 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                    i19 &= -3670017;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    i19 &= -29360129;
                                    j14 = jM;
                                } else {
                                    j14 = j11;
                                }
                                z16 = z13;
                                cVarE = null;
                                if (i21 != 0) {
                                    j15 = jM;
                                    i23 = 1015017965;
                                    jVar3 = null;
                                    j16 = j14;
                                } else {
                                    j15 = jM;
                                    j16 = j14;
                                    i23 = 1015017965;
                                    jVar3 = jVar;
                                }
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                c0VarR.E(1830899669);
                            } else {
                                c0VarR.E(1830899670);
                                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            int i2114 = i19 >> 6;
                            c0Var2 = c0VarR;
                            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2114) | (458752 & i2114) | (i2114 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var2;
                            function6 = function4;
                            function7 = function5;
                            z15 = z16;
                            j12 = j15;
                            j13 = j16;
                            jVar2 = jVar3;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            function6 = function4;
                            function7 = function5;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 100663296;
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i2115 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i2116 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2116) | (458752 & i2116) | (i2116 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i2117 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function4 = function2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i2118 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2118) | (458752 & i2118) | (i2118 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i2119 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i25 = i12;
                    i20 = i26;
                    if (c0VarR.L(j10)) {
                    }
                    i19 = i25 | i27;
                } else {
                    i25 = i12;
                    i20 = i26;
                }
                i19 = i25 | i27;
            } else {
                i19 = i12;
                i20 = i26;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i19 |= i24;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i19 |= i22;
                }
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i21110 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21110) | (458752 & i21110) | (i21110 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    c0VarR.E(1830899669);
                } else {
                    c0VarR.E(1830899670);
                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                int i21111 = i19 >> 6;
                c0Var2 = c0VarR;
                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                function6 = function4;
                function7 = function5;
                z15 = z16;
                j12 = j15;
                j13 = j16;
                jVar2 = jVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                function6 = function4;
                function7 = function5;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                function4 = function2;
                if (c0VarR.k0(function4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i25 = i12;
                        i20 = i26;
                        if (c0VarR.L(j10)) {
                        }
                        i19 = i25 | i27;
                    } else {
                        i25 = i12;
                        i20 = i26;
                    }
                    i19 = i25 | i27;
                } else {
                    i19 = i12;
                    i20 = i26;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i19 |= i24;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i19 |= i22;
                    }
                    if ((i19 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                                i19 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                                j14 = jM;
                            } else {
                                j14 = j11;
                            }
                            z16 = z13;
                            cVarE = null;
                            if (i21 != 0) {
                                j15 = jM;
                                i23 = 1015017965;
                                jVar3 = null;
                                j16 = j14;
                            } else {
                                j15 = jM;
                                j16 = j14;
                                i23 = 1015017965;
                                jVar3 = jVar;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            c0VarR.E(1830899669);
                        } else {
                            c0VarR.E(1830899670);
                            cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        int i21112 = i19 >> 6;
                        c0Var2 = c0VarR;
                        h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21112) | (458752 & i21112) | (i21112 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        function6 = function4;
                        function7 = function5;
                        z15 = z16;
                        j12 = j15;
                        j13 = j16;
                        jVar2 = jVar3;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        function6 = function4;
                        function7 = function5;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i21113 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i25 = i12;
                    i20 = i26;
                    if (c0VarR.L(j10)) {
                    }
                    i19 = i25 | i27;
                } else {
                    i25 = i12;
                    i20 = i26;
                }
                i19 = i25 | i27;
            } else {
                i19 = i12;
                i20 = i26;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i19 |= i24;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i19 |= i22;
                }
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i21114 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21114) | (458752 & i21114) | (i21114 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    c0VarR.E(1830899669);
                } else {
                    c0VarR.E(1830899670);
                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                int i21115 = i19 >> 6;
                c0Var2 = c0VarR;
                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21115) | (458752 & i21115) | (i21115 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                function6 = function4;
                function7 = function5;
                z15 = z16;
                j12 = j15;
                j13 = j16;
                jVar2 = jVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                function6 = function4;
                function7 = function5;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function4 = function2;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i25 = i12;
                    i20 = i26;
                    if (c0VarR.L(j10)) {
                    }
                    i19 = i25 | i27;
                } else {
                    i25 = i12;
                    i20 = i26;
                }
                i19 = i25 | i27;
            } else {
                i19 = i12;
                i20 = i26;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i19 |= i24;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i19 |= i22;
                }
                if ((i19 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                            i19 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i19 &= -29360129;
                            j14 = jM;
                        } else {
                            j14 = j11;
                        }
                        z16 = z13;
                        cVarE = null;
                        if (i21 != 0) {
                            j15 = jM;
                            i23 = 1015017965;
                            jVar3 = null;
                            j16 = j14;
                        } else {
                            j15 = jM;
                            j16 = j14;
                            i23 = 1015017965;
                            jVar3 = jVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        c0VarR.E(1830899669);
                    } else {
                        c0VarR.E(1830899670);
                        cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    int i21116 = i19 >> 6;
                    c0Var2 = c0VarR;
                    h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21116) | (458752 & i21116) | (i21116 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    function6 = function4;
                    function7 = function5;
                    z15 = z16;
                    j12 = j15;
                    j13 = j16;
                    jVar2 = jVar3;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    function6 = function4;
                    function7 = function5;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    c0VarR.E(1830899669);
                } else {
                    c0VarR.E(1830899670);
                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                int i21117 = i19 >> 6;
                c0Var2 = c0VarR;
                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21117) | (458752 & i21117) | (i21117 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                function6 = function4;
                function7 = function5;
                z15 = z16;
                j12 = j15;
                j13 = j16;
                jVar2 = jVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                function6 = function4;
                function7 = function5;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function5 = function3;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                i25 = i12;
                i20 = i26;
                if (c0VarR.L(j10)) {
                }
                i19 = i25 | i27;
            } else {
                i25 = i12;
                i20 = i26;
            }
            i19 = i25 | i27;
        } else {
            i19 = i12;
            i20 = i26;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i24 = 4194304;
            } else {
                i24 = 4194304;
            }
            i19 |= i24;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i19 |= i22;
            }
            if ((i19 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                        i19 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i19 &= -29360129;
                        j14 = jM;
                    } else {
                        j14 = j11;
                    }
                    z16 = z13;
                    cVarE = null;
                    if (i21 != 0) {
                        j15 = jM;
                        i23 = 1015017965;
                        jVar3 = null;
                        j16 = j14;
                    } else {
                        j15 = jM;
                        j16 = j14;
                        i23 = 1015017965;
                        jVar3 = jVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    c0VarR.E(1830899669);
                } else {
                    c0VarR.E(1830899670);
                    cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                int i21118 = i19 >> 6;
                c0Var2 = c0VarR;
                h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21118) | (458752 & i21118) | (i21118 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                function6 = function4;
                function7 = function5;
                z15 = z16;
                j12 = j15;
                j13 = j16;
                jVar2 = jVar3;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z15 = z13;
                function6 = function4;
                function7 = function5;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 100663296;
        if ((i19 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i19 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i19 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i19 &= -29360129;
                    j14 = jM;
                } else {
                    j14 = j11;
                }
                z16 = z13;
                cVarE = null;
                if (i21 != 0) {
                    j15 = jM;
                    i23 = 1015017965;
                    jVar3 = null;
                    j16 = j14;
                } else {
                    j15 = jM;
                    j16 = j14;
                    i23 = 1015017965;
                    jVar3 = jVar;
                }
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(c7.a())).M();
                    i19 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i19 &= -29360129;
                    j14 = jM;
                } else {
                    j14 = j11;
                }
                z16 = z13;
                cVarE = null;
                if (i21 != 0) {
                    j15 = jM;
                    i23 = 1015017965;
                    jVar3 = null;
                    j16 = j14;
                } else {
                    j15 = jM;
                    j16 = j14;
                    i23 = 1015017965;
                    jVar3 = jVar;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i23, i19, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
            }
            if (function4 == null) {
                c0VarR.E(1830899669);
            } else {
                c0VarR.E(1830899670);
                cVarE = androidx.compose.runtime.internal.w.e(-1745256900, true, new d(function4), c0VarR, 54);
            }
            c0VarR.A();
            int i21119 = i19 >> 6;
            c0Var2 = c0VarR;
            h(z12, function1, j2.j(a0Var2), z16, j15, j16, jVar3, androidx.compose.runtime.internal.w.e(-906085472, true, new b(cVarE, function5), c0VarR, 54), c0Var2, (i19 & 14) | 12582912 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i21119) | (458752 & i21119) | (i21119 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            function6 = function4;
            function7 = function5;
            z15 = z16;
            j12 = j15;
            j13 = j16;
            jVar2 = jVar3;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            jVar2 = jVar;
            a0Var3 = a0Var2;
            z15 = z13;
            function6 = function4;
            function7 = function5;
            j12 = j10;
            j13 = j11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d30.p(z10, function0, a0Var3, z15, function6, function7, j12, j13, jVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1349901398);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1349901398, i11, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:300)");
            }
            int i12 = i11 & 14;
            boolean z10 = (i12 == 4) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new e(function2, function3);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            if (function2 != null) {
                c0VarR.E(870361332);
                androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.layout.i0.b(aVar, "text"), f26982c, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
                function2.invoke(c0VarR, Integer.valueOf(i12));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(870466081);
                c0VarR.A();
            }
            if (function3 != null) {
                c0VarR.E(870494880);
                androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, "icon");
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB);
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
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(870557345);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.c30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d30.k(function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function2 function2, Function2 function3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        j(function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final void l(final long j10, final long j11, boolean z10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final boolean z11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-833145221);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            z11 = z10;
            i11 |= c0VarR.G(z11) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-833145221, i11, -1, "androidx.compose.material3.TabTransition (Tab.kt:274)");
            }
            int i12 = i11 >> 6;
            androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(Boolean.valueOf(z11), null, c0VarR, i12 & 14, 2);
            f fVar = f.f27007a;
            boolean zBooleanValue = ((Boolean) l3VarJ.y()).booleanValue();
            c0VarR.E(-1069234984);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j12 = zBooleanValue ? j10 : j11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.ui.graphics.colorspace.c cVarE = androidx.compose.ui.graphics.q0.E(j12);
            boolean zD = c0VarR.D(cVarE);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = (androidx.compose.animation.core.z3) androidx.compose.animation.v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(cVarE);
                c0VarR.Y(objI0);
            }
            androidx.compose.animation.core.z3 z3Var = (androidx.compose.animation.core.z3) objI0;
            boolean zBooleanValue2 = ((Boolean) l3VarJ.p()).booleanValue();
            c0VarR.E(-1069234984);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(j13);
            boolean zBooleanValue3 = ((Boolean) l3VarJ.y()).booleanValue();
            c0VarR.E(-1069234984);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(m(androidx.compose.animation.core.w3.D(l3VarJ, q0VarN, androidx.compose.ui.graphics.q0.n(j14), fVar.invoke(l3VarJ.w(), c0VarR, 0), z3Var, "ColorAnimation", c0VarR, 0)))), function2, c0VarR, androidx.compose.runtime.n4.f36267i | (i12 & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.b30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d30.n(j10, j11, z11, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long m(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(long j10, long j11, boolean z10, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        l(j10, j11, z10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, long j10, long j11, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(z10, function0, a0Var, z11, j10, j11, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function2, Function2 function3, long j10, long j11, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(z10, function0, a0Var, z11, function2, function3, j10, j11, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final float x() {
        return f26982c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(androidx.compose.ui.layout.i2.a aVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, int i10, int i11, int i12, int i13) {
        int iG6 = dVar.g6(i12 == i13 ? f26983d : f26984e) + dVar.g6(d0.b2.f267655a.g());
        int iC1 = (i2Var2.c1() + dVar.c8(f26985f)) - i12;
        int i14 = (i11 - i13) - iG6;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i10 - i2Var.h1()) / 2, i14, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, (i10 - i2Var2.h1()) / 2, i14 - iC1, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(androidx.compose.ui.layout.i2.a aVar, androidx.compose.ui.layout.i2 i2Var, int i10) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, (i10 - i2Var.c1()) / 2, 0.0f, 4, null);
    }
}
