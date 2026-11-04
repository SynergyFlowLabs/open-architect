package androidx.compose.material;

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
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,427:1\n75#2:428\n75#2:429\n75#2:430\n67#3:431\n65#3,5:432\n71#3:443\n1247#4,6:437\n1282#4,6:451\n1832#5,7:444\n79#6:457\n77#6,8:458\n86#6,3:475\n89#6,2:484\n79#6,6:497\n86#6,3:512\n89#6,2:521\n93#6:526\n79#6,6:538\n86#6,3:553\n89#6,2:562\n93#6:567\n93#6:571\n347#7,9:466\n356#7:486\n347#7,9:503\n356#7,3:523\n347#7,9:544\n356#7,3:564\n357#7,2:569\n4206#8,6:478\n4206#8,6:515\n4206#8,6:556\n70#9:487\n67#9,9:488\n77#9:527\n70#9:528\n67#9,9:529\n77#9:568\n1#10:572\n85#11:573\n113#12:574\n113#12:575\n113#12:576\n113#12:577\n113#12:578\n113#12:579\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n96#1:428\n158#1:429\n227#1:430\n270#1:431\n270#1:432,5\n270#1:443\n270#1:437,6\n306#1:451,6\n270#1:444,7\n299#1:457\n299#1:458,8\n299#1:475,3\n299#1:484,2\n301#1:497,6\n301#1:512,3\n301#1:521,2\n301#1:526\n304#1:538,6\n304#1:553,3\n304#1:562,2\n304#1:567\n299#1:571\n299#1:466,9\n299#1:486\n301#1:503,9\n301#1:523,3\n304#1:544,9\n304#1:564,3\n299#1:569,2\n299#1:478,6\n301#1:515,6\n304#1:556,6\n301#1:487\n301#1:488,9\n301#1:527\n304#1:528\n304#1:529,9\n304#1:568\n270#1:573\n406#1:574\n407#1:575\n415#1:576\n419#1:577\n422#1:578\n426#1:579\n*E\n"})
public final class ri {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24669c = 150;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f24670d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f24671e = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f24667a = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24668b = androidx.compose.ui.unit.h.r(72);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24672f = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24673g = androidx.compose.ui.unit.h.r(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f24674h = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f24675i = androidx.compose.ui.unit.a0.m(20);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f24676j = androidx.compose.ui.unit.h.r(8);

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,427:1\n99#2,6:428\n106#2:464\n79#3,6:434\n86#3,3:449\n89#3,2:458\n93#3:463\n347#4,9:440\n356#4,3:460\n4206#5,6:452\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$1\n*L\n167#1:428,6\n167#1:464\n167#1:434,6\n167#1:449,3\n167#1:458,2\n167#1:463\n167#1:440,9\n167#1:460,3\n167#1:452,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f24677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.z2 f24680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f24681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24684h;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.z2 z2Var, boolean z11, Function0<Unit> function0, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f24677a = a0Var;
            this.f24678b = z10;
            this.f24679c = jVar;
            this.f24680d = z2Var;
            this.f24681e = z11;
            this.f24682f = function0;
            this.f24683g = function2;
            this.f24684h = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1415722219, i10, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:166)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.d5.t(androidx.compose.foundation.selection.c.a(androidx.compose.foundation.layout.i6.i(this.f24677a, ri.f24667a), this.f24678b, this.f24679c, this.f24680d, this.f24681e, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), this.f24682f), ri.f24672f, 0.0f, 2, null), 0.0f, 1, null);
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f24683g;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f24684h;
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
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.t(androidx.compose.ui.a0.E, ri.f24676j), c0Var, 6);
            wk.l(androidx.compose.ui.text.y3.m(x9.f25488a.c(c0Var, 6).e(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function3, c0Var, 0);
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
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24686b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f24685a = function2;
            this.f24686b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1088373601, i10, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
            }
            ri.j(this.f24685a, this.f24686b, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$Tab$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,427:1\n87#2,6:428\n94#2:464\n79#3,6:434\n86#3,3:449\n89#3,2:458\n93#3:463\n347#4,9:440\n356#4,3:460\n4206#5,6:452\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$Tab$3\n*L\n237#1:428,6\n237#1:464\n237#1:434,6\n237#1:449,3\n237#1:458,2\n237#1:463\n237#1:440,9\n237#1:460,3\n237#1:452,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f24687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f24689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.z2 f24690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f24691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f24693g;

        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.z2 z2Var, boolean z11, Function0<Unit> function0, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f24687a = a0Var;
            this.f24688b = z10;
            this.f24689c = jVar;
            this.f24690d = z2Var;
            this.f24691e = z11;
            this.f24692f = function0;
            this.f24693g = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-652402312, i10, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:236)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.selection.c.a(this.f24687a, this.f24688b, this.f24689c, this.f24690d, this.f24691e, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), this.f24692f), 0.0f, 1, null);
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f24693g;
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
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24694a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f24694a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1101313667, i10, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
            }
            wk.l(androidx.compose.ui.text.y3.m(x9.f25488a.c(c0Var, 6).e(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.f24694a, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n563#2,2:428\n34#2,6:430\n565#2:436\n563#2,2:438\n34#2,6:440\n565#2:446\n1#3:437\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2$1\n*L\n310#1:428,2\n310#1:430,6\n310#1:436\n320#1:438,2\n320#1:440,6\n320#1:446\n*E\n"})
    static final class e implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24696b;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f24695a = function2;
            this.f24696b = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.c1 c1Var, int i10, int i11, Integer num, Integer num2, androidx.compose.ui.layout.i2.a aVar) {
            if (i2Var != null && i2Var2 != null) {
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                ri.x(aVar, c1Var, i2Var, i2Var2, i10, i11, iIntValue, num2.intValue());
            } else if (i2Var != null) {
                ri.y(aVar, i2Var, i11);
            } else if (i2Var2 != null) {
                ri.y(aVar, i2Var2, i11);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            final androidx.compose.ui.layout.i2 i2VarP0;
            final androidx.compose.ui.layout.i2 i2VarP1;
            if (this.f24695a != null) {
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
            if (this.f24696b != null) {
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
            final int iG6 = c1Var.g6((i2VarP0 == null || i2VarP1 == null) ? ri.f24667a : ri.f24668b);
            final Integer numValueOf = i2VarP0 != null ? Integer.valueOf(i2VarP0.M(androidx.compose.ui.layout.b.a())) : null;
            final Integer numValueOf2 = i2VarP0 != null ? Integer.valueOf(i2VarP0.M(androidx.compose.ui.layout.b.b())) : null;
            return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iG6, null, new Function1() { // from class: androidx.compose.material.si
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ri.e.g(i2VarP0, i2VarP1, c1Var, iMax, iG6, numValueOf, numValueOf2, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    static final class f implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f24697a = new f();

        f() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(297582231);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(297582231, i10, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:271)");
            }
            androidx.compose.animation.core.y3 y3VarS = bVar.f(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.p.s(150, 100, androidx.compose.animation.core.u0.e()) : androidx.compose.animation.core.p.t(100, 0, androidx.compose.animation.core.u0.e(), 2, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y3VarS;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149 A[PHI: r7 r10 r14 r15 r20
      0x0149: PHI (r7v12 androidx.compose.ui.a0) = (r7v5 androidx.compose.ui.a0), (r7v2 androidx.compose.ui.a0) binds: [B:129:0x0176, B:115:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r10v14 boolean) = (r10v6 boolean), (r10v3 boolean) binds: [B:129:0x0176, B:115:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r14v9 androidx.compose.foundation.interaction.j) = (r14v5 androidx.compose.foundation.interaction.j), (r14v3 androidx.compose.foundation.interaction.j) binds: [B:129:0x0176, B:115:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r15v14 int) = (r15v10 int), (r15v16 int) binds: [B:129:0x0176, B:115:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r20v4 long) = (r20v1 long), (r20v5 long) binds: [B:129:0x0176, B:115:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x0159  */
    /* JADX WARN: Code duplicated, block: B:126:0x015f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0178  */
    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x0201  */
    /* JADX WARN: Code duplicated, block: B:141:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
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
        int i18;
        androidx.compose.foundation.interaction.j jVar2;
        int i19;
        int i20;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final long j12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final androidx.compose.foundation.interaction.j jVar3;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        long jM;
        long jW;
        int i21;
        int i22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-524682663);
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
                        i18 = i11 & 64;
                        if (i18 != 0) {
                            if ((1572864 & i10) == 0) {
                                jVar2 = jVar;
                                if (c0VarR.D(jVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                            if ((12582912 & i10) == 0) {
                                int i23 = i12;
                                if ((i11 & 128) == 0 || !c0VarR.L(j10)) {
                                    i22 = 4194304;
                                } else {
                                    i22 = 8388608;
                                }
                                i20 = i23 | i22;
                            } else {
                                i20 = i12;
                            }
                            if ((i10 & 100663296) != 0) {
                                if ((i11 & 256) == 0 || !c0VarR.L(j11)) {
                                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                                } else {
                                    i21 = 67108864;
                                }
                                i20 |= i21;
                            }
                            if ((38347923 & i20) != 38347922) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i20 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i14 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i16 != 0) {
                                        z13 = true;
                                    }
                                    if (i18 != 0) {
                                        jVar2 = null;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i20 &= -29360129;
                                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    } else {
                                        jM = j10;
                                    }
                                    if ((i11 & 256) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i20 &= -234881025;
                                    }
                                    boolean z16 = z13;
                                    androidx.compose.foundation.interaction.j jVar4 = jVar2;
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                                    }
                                    androidx.compose.ui.a0 a0Var4 = a0Var2;
                                    int i24 = i20 >> 21;
                                    long j14 = jM;
                                    l(j14, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var4, z12, jVar4, wd.h(true, 0.0f, jM, 2, null), z16, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 14) | 3072);
                                    c0Var2 = c0VarR;
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    a0Var3 = a0Var4;
                                    jVar3 = jVar4;
                                    z15 = z16;
                                    j13 = jW;
                                    j12 = jM;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 128) != 0) {
                                        i20 &= -29360129;
                                    }
                                    if ((i11 & 256) != 0) {
                                        i20 &= -234881025;
                                    }
                                    jM = j10;
                                }
                                jW = j11;
                                boolean z17 = z13;
                                androidx.compose.foundation.interaction.j jVar5 = jVar2;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                                }
                                androidx.compose.ui.a0 a0Var5 = a0Var2;
                                int i25 = i20 >> 21;
                                long j15 = jM;
                                l(j15, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var5, z12, jVar5, wd.h(true, 0.0f, jM, 2, null), z17, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | 3072);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var5;
                                jVar3 = jVar5;
                                z15 = z17;
                                j13 = jW;
                                j12 = jM;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                j12 = j10;
                                a0Var3 = a0Var2;
                                z15 = z13;
                                jVar3 = jVar2;
                                j13 = j11;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 1572864;
                        jVar2 = jVar;
                        if ((12582912 & i10) == 0) {
                            int i26 = i12;
                            if ((i11 & 128) == 0) {
                                i22 = 4194304;
                            } else {
                                i22 = 4194304;
                            }
                            i20 = i26 | i22;
                        } else {
                            i20 = i12;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i11 & 256) == 0) {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i20 |= i21;
                        }
                        if ((38347923 & i20) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            }
                            boolean z18 = z13;
                            androidx.compose.foundation.interaction.j jVar6 = jVar2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                            }
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            int i27 = i20 >> 21;
                            long j16 = jM;
                            l(j16, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var6, z12, jVar6, wd.h(true, 0.0f, jM, 2, null), z18, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var6;
                            jVar3 = jVar6;
                            z15 = z18;
                            j13 = jW;
                            j12 = jM;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j12 = j10;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z13 = z11;
                    i18 = i11 & 64;
                    if (i18 != 0) {
                        if ((1572864 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((12582912 & i10) == 0) {
                            int i28 = i12;
                            if ((i11 & 128) == 0) {
                                i22 = 4194304;
                            } else {
                                i22 = 4194304;
                            }
                            i20 = i28 | i22;
                        } else {
                            i20 = i12;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i11 & 256) == 0) {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i20 |= i21;
                        }
                        if ((38347923 & i20) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            }
                            boolean z19 = z13;
                            androidx.compose.foundation.interaction.j jVar7 = jVar2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                            }
                            androidx.compose.ui.a0 a0Var7 = a0Var2;
                            int i29 = i20 >> 21;
                            long j17 = jM;
                            l(j17, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var7, z12, jVar7, wd.h(true, 0.0f, jM, 2, null), z19, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var7;
                            jVar3 = jVar7;
                            z15 = z19;
                            j13 = jW;
                            j12 = jM;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j12 = j10;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    jVar2 = jVar;
                    if ((12582912 & i10) == 0) {
                        int i210 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i210 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z110 = z13;
                        androidx.compose.foundation.interaction.j jVar8 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        int i211 = i20 >> 21;
                        long j18 = jM;
                        l(j18, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var8, z12, jVar8, wd.h(true, 0.0f, jM, 2, null), z110, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var8;
                        jVar3 = jVar8;
                        z15 = z110;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i18 = i11 & 64;
                    if (i18 != 0) {
                        if ((1572864 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((12582912 & i10) == 0) {
                            int i212 = i12;
                            if ((i11 & 128) == 0) {
                                i22 = 4194304;
                            } else {
                                i22 = 4194304;
                            }
                            i20 = i212 | i22;
                        } else {
                            i20 = i12;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i11 & 256) == 0) {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i20 |= i21;
                        }
                        if ((38347923 & i20) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            }
                            boolean z111 = z13;
                            androidx.compose.foundation.interaction.j jVar9 = jVar2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                            }
                            androidx.compose.ui.a0 a0Var9 = a0Var2;
                            int i213 = i20 >> 21;
                            long j19 = jM;
                            l(j19, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var9, z12, jVar9, wd.h(true, 0.0f, jM, 2, null), z111, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var9;
                            jVar3 = jVar9;
                            z15 = z111;
                            j13 = jW;
                            j12 = jM;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j12 = j10;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    jVar2 = jVar;
                    if ((12582912 & i10) == 0) {
                        int i214 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i214 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z112 = z13;
                        androidx.compose.foundation.interaction.j jVar10 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        int i215 = i20 >> 21;
                        long j110 = jM;
                        l(j110, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var10, z12, jVar10, wd.h(true, 0.0f, jM, 2, null), z112, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var10;
                        jVar3 = jVar10;
                        z15 = z112;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i216 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i216 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z113 = z13;
                        androidx.compose.foundation.interaction.j jVar11 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var11 = a0Var2;
                        int i217 = i20 >> 21;
                        long j111 = jM;
                        l(j111, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var11, z12, jVar11, wd.h(true, 0.0f, jM, 2, null), z113, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var11;
                        jVar3 = jVar11;
                        z15 = z113;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i218 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i218 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z114 = z13;
                    androidx.compose.foundation.interaction.j jVar12 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var12 = a0Var2;
                    int i219 = i20 >> 21;
                    long j112 = jM;
                    l(j112, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var12, z12, jVar12, wd.h(true, 0.0f, jM, 2, null), z114, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var12;
                    jVar3 = jVar12;
                    z15 = z114;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i18 = i11 & 64;
                    if (i18 != 0) {
                        if ((1572864 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((12582912 & i10) == 0) {
                            int i2110 = i12;
                            if ((i11 & 128) == 0) {
                                i22 = 4194304;
                            } else {
                                i22 = 4194304;
                            }
                            i20 = i2110 | i22;
                        } else {
                            i20 = i12;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i11 & 256) == 0) {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i20 |= i21;
                        }
                        if ((38347923 & i20) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            }
                            boolean z115 = z13;
                            androidx.compose.foundation.interaction.j jVar13 = jVar2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                            }
                            androidx.compose.ui.a0 a0Var13 = a0Var2;
                            int i2111 = i20 >> 21;
                            long j113 = jM;
                            l(j113, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var13, z12, jVar13, wd.h(true, 0.0f, jM, 2, null), z115, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var13;
                            jVar3 = jVar13;
                            z15 = z115;
                            j13 = jW;
                            j12 = jM;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j12 = j10;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    jVar2 = jVar;
                    if ((12582912 & i10) == 0) {
                        int i2112 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i2112 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z116 = z13;
                        androidx.compose.foundation.interaction.j jVar14 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        int i2113 = i20 >> 21;
                        long j114 = jM;
                        l(j114, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var14, z12, jVar14, wd.h(true, 0.0f, jM, 2, null), z116, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2113 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var14;
                        jVar3 = jVar14;
                        z15 = z116;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i2114 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i2114 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z117 = z13;
                        androidx.compose.foundation.interaction.j jVar15 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var15 = a0Var2;
                        int i2115 = i20 >> 21;
                        long j115 = jM;
                        l(j115, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var15, z12, jVar15, wd.h(true, 0.0f, jM, 2, null), z117, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var15;
                        jVar3 = jVar15;
                        z15 = z117;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i2116 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i2116 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z118 = z13;
                    androidx.compose.foundation.interaction.j jVar16 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    int i2117 = i20 >> 21;
                    long j116 = jM;
                    l(j116, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var16, z12, jVar16, wd.h(true, 0.0f, jM, 2, null), z118, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var16;
                    jVar3 = jVar16;
                    z15 = z118;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i2118 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i2118 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z119 = z13;
                        androidx.compose.foundation.interaction.j jVar17 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var17 = a0Var2;
                        int i2119 = i20 >> 21;
                        long j117 = jM;
                        l(j117, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var17, z12, jVar17, wd.h(true, 0.0f, jM, 2, null), z119, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2119 & com.planner5d.library.engine.input.f.b.B) | (i2119 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var17;
                        jVar3 = jVar17;
                        z15 = z119;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i21110 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i21110 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z1110 = z13;
                    androidx.compose.foundation.interaction.j jVar18 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    int i21111 = i20 >> 21;
                    long j118 = jM;
                    l(j118, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var18, z12, jVar18, wd.h(true, 0.0f, jM, 2, null), z1110, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var18;
                    jVar3 = jVar18;
                    z15 = z1110;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            i18 = i11 & 64;
            if (i18 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((12582912 & i10) == 0) {
                    int i21112 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i21112 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z1111 = z13;
                    androidx.compose.foundation.interaction.j jVar19 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var19 = a0Var2;
                    int i21113 = i20 >> 21;
                    long j119 = jM;
                    l(j119, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var19, z12, jVar19, wd.h(true, 0.0f, jM, 2, null), z1111, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var19;
                    jVar3 = jVar19;
                    z15 = z1111;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((12582912 & i10) == 0) {
                int i21114 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i20 = i21114 | i22;
            } else {
                i20 = i12;
            }
            if ((i10 & 100663296) != 0) {
                if ((i11 & 256) == 0) {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i20 |= i21;
            }
            if ((38347923 & i20) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                }
                boolean z1112 = z13;
                androidx.compose.foundation.interaction.j jVar110 = jVar2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                }
                androidx.compose.ui.a0 a0Var110 = a0Var2;
                int i21115 = i20 >> 21;
                long j1110 = jM;
                l(j1110, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var110, z12, jVar110, wd.h(true, 0.0f, jM, 2, null), z1112, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21115 & com.planner5d.library.engine.input.f.b.B) | (i21115 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var110;
                jVar3 = jVar110;
                z15 = z1112;
                j13 = jW;
                j12 = jM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j12 = j10;
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i18 = i11 & 64;
                    if (i18 != 0) {
                        if ((1572864 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((12582912 & i10) == 0) {
                            int i21116 = i12;
                            if ((i11 & 128) == 0) {
                                i22 = 4194304;
                            } else {
                                i22 = 4194304;
                            }
                            i20 = i21116 | i22;
                        } else {
                            i20 = i12;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i11 & 256) == 0) {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i21 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i20 |= i21;
                        }
                        if ((38347923 & i20) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            } else {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z13 = true;
                                }
                                if (i18 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 128) != 0) {
                                    i20 &= -29360129;
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i20 &= -234881025;
                                } else {
                                    jW = j11;
                                }
                            }
                            boolean z1113 = z13;
                            androidx.compose.foundation.interaction.j jVar111 = jVar2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                            }
                            androidx.compose.ui.a0 a0Var111 = a0Var2;
                            int i21117 = i20 >> 21;
                            long j1111 = jM;
                            l(j1111, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var111, z12, jVar111, wd.h(true, 0.0f, jM, 2, null), z1113, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21117 & com.planner5d.library.engine.input.f.b.B) | (i21117 & 14) | 3072);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var111;
                            jVar3 = jVar111;
                            z15 = z1113;
                            j13 = jW;
                            j12 = jM;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j12 = j10;
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    jVar2 = jVar;
                    if ((12582912 & i10) == 0) {
                        int i21118 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i21118 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z1114 = z13;
                        androidx.compose.foundation.interaction.j jVar112 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var112 = a0Var2;
                        int i21119 = i20 >> 21;
                        long j1112 = jM;
                        l(j1112, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var112, z12, jVar112, wd.h(true, 0.0f, jM, 2, null), z1114, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21119 & com.planner5d.library.engine.input.f.b.B) | (i21119 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var112;
                        jVar3 = jVar112;
                        z15 = z1114;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i211110 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i211110 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z1115 = z13;
                        androidx.compose.foundation.interaction.j jVar113 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var113 = a0Var2;
                        int i211111 = i20 >> 21;
                        long j1113 = jM;
                        l(j1113, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var113, z12, jVar113, wd.h(true, 0.0f, jM, 2, null), z1115, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211111 & com.planner5d.library.engine.input.f.b.B) | (i211111 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var113;
                        jVar3 = jVar113;
                        z15 = z1115;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i211112 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i211112 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z1116 = z13;
                    androidx.compose.foundation.interaction.j jVar114 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var114 = a0Var2;
                    int i211113 = i20 >> 21;
                    long j1114 = jM;
                    l(j1114, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var114, z12, jVar114, wd.h(true, 0.0f, jM, 2, null), z1116, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211113 & com.planner5d.library.engine.input.f.b.B) | (i211113 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var114;
                    jVar3 = jVar114;
                    z15 = z1116;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i211114 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i211114 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z1117 = z13;
                        androidx.compose.foundation.interaction.j jVar115 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var115 = a0Var2;
                        int i211115 = i20 >> 21;
                        long j1115 = jM;
                        l(j1115, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var115, z12, jVar115, wd.h(true, 0.0f, jM, 2, null), z1117, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211115 & com.planner5d.library.engine.input.f.b.B) | (i211115 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var115;
                        jVar3 = jVar115;
                        z15 = z1117;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i211116 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i211116 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z1118 = z13;
                    androidx.compose.foundation.interaction.j jVar116 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var116 = a0Var2;
                    int i211117 = i20 >> 21;
                    long j1116 = jM;
                    l(j1116, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var116, z12, jVar116, wd.h(true, 0.0f, jM, 2, null), z1118, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211117 & com.planner5d.library.engine.input.f.b.B) | (i211117 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var116;
                    jVar3 = jVar116;
                    z15 = z1118;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            i18 = i11 & 64;
            if (i18 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((12582912 & i10) == 0) {
                    int i211118 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i211118 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z1119 = z13;
                    androidx.compose.foundation.interaction.j jVar117 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var117 = a0Var2;
                    int i211119 = i20 >> 21;
                    long j1117 = jM;
                    l(j1117, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var117, z12, jVar117, wd.h(true, 0.0f, jM, 2, null), z1119, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i211119 & com.planner5d.library.engine.input.f.b.B) | (i211119 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var117;
                    jVar3 = jVar117;
                    z15 = z1119;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((12582912 & i10) == 0) {
                int i2111110 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i20 = i2111110 | i22;
            } else {
                i20 = i12;
            }
            if ((i10 & 100663296) != 0) {
                if ((i11 & 256) == 0) {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i20 |= i21;
            }
            if ((38347923 & i20) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                }
                boolean z11110 = z13;
                androidx.compose.foundation.interaction.j jVar118 = jVar2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                }
                androidx.compose.ui.a0 a0Var118 = a0Var2;
                int i2111111 = i20 >> 21;
                long j1118 = jM;
                l(j1118, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var118, z12, jVar118, wd.h(true, 0.0f, jM, 2, null), z11110, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var118;
                jVar3 = jVar118;
                z15 = z11110;
                j13 = jW;
                j12 = jM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j12 = j10;
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i18 = i11 & 64;
                if (i18 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((12582912 & i10) == 0) {
                        int i2111112 = i12;
                        if ((i11 & 128) == 0) {
                            i22 = 4194304;
                        } else {
                            i22 = 4194304;
                        }
                        i20 = i2111112 | i22;
                    } else {
                        i20 = i12;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i11 & 256) == 0) {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i21 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i20 |= i21;
                    }
                    if ((38347923 & i20) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        } else {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 128) != 0) {
                                i20 &= -29360129;
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i20 &= -234881025;
                            } else {
                                jW = j11;
                            }
                        }
                        boolean z11111 = z13;
                        androidx.compose.foundation.interaction.j jVar119 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                        }
                        androidx.compose.ui.a0 a0Var119 = a0Var2;
                        int i2111113 = i20 >> 21;
                        long j1119 = jM;
                        l(j1119, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var119, z12, jVar119, wd.h(true, 0.0f, jM, 2, null), z11111, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111113 & com.planner5d.library.engine.input.f.b.B) | (i2111113 & 14) | 3072);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var119;
                        jVar3 = jVar119;
                        z15 = z11111;
                        j13 = jW;
                        j12 = jM;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j12 = j10;
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((12582912 & i10) == 0) {
                    int i2111114 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i2111114 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z11112 = z13;
                    androidx.compose.foundation.interaction.j jVar1110 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    int i2111115 = i20 >> 21;
                    long j11110 = jM;
                    l(j11110, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1110, z12, jVar1110, wd.h(true, 0.0f, jM, 2, null), z11112, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111115 & com.planner5d.library.engine.input.f.b.B) | (i2111115 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1110;
                    jVar3 = jVar1110;
                    z15 = z11112;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            i18 = i11 & 64;
            if (i18 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((12582912 & i10) == 0) {
                    int i2111116 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i2111116 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z11113 = z13;
                    androidx.compose.foundation.interaction.j jVar1111 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var1111 = a0Var2;
                    int i2111117 = i20 >> 21;
                    long j11111 = jM;
                    l(j11111, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1111, z12, jVar1111, wd.h(true, 0.0f, jM, 2, null), z11113, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111117 & com.planner5d.library.engine.input.f.b.B) | (i2111117 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1111;
                    jVar3 = jVar1111;
                    z15 = z11113;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((12582912 & i10) == 0) {
                int i2111118 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i20 = i2111118 | i22;
            } else {
                i20 = i12;
            }
            if ((i10 & 100663296) != 0) {
                if ((i11 & 256) == 0) {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i20 |= i21;
            }
            if ((38347923 & i20) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                }
                boolean z11114 = z13;
                androidx.compose.foundation.interaction.j jVar1112 = jVar2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                }
                androidx.compose.ui.a0 a0Var1112 = a0Var2;
                int i2111119 = i20 >> 21;
                long j11112 = jM;
                l(j11112, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1112, z12, jVar1112, wd.h(true, 0.0f, jM, 2, null), z11114, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i2111119 & com.planner5d.library.engine.input.f.b.B) | (i2111119 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1112;
                jVar3 = jVar1112;
                z15 = z11114;
                j13 = jW;
                j12 = jM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j12 = j10;
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            i18 = i11 & 64;
            if (i18 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((12582912 & i10) == 0) {
                    int i21111110 = i12;
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i20 = i21111110 | i22;
                } else {
                    i20 = i12;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i11 & 256) == 0) {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i20 |= i21;
                }
                if ((38347923 & i20) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    } else {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i20 &= -234881025;
                        } else {
                            jW = j11;
                        }
                    }
                    boolean z11115 = z13;
                    androidx.compose.foundation.interaction.j jVar1113 = jVar2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                    }
                    androidx.compose.ui.a0 a0Var1113 = a0Var2;
                    int i21111111 = i20 >> 21;
                    long j11113 = jM;
                    l(j11113, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1113, z12, jVar1113, wd.h(true, 0.0f, jM, 2, null), z11115, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21111111 & com.planner5d.library.engine.input.f.b.B) | (i21111111 & 14) | 3072);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var1113;
                    jVar3 = jVar1113;
                    z15 = z11115;
                    j13 = jW;
                    j12 = jM;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j12 = j10;
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((12582912 & i10) == 0) {
                int i21111112 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i20 = i21111112 | i22;
            } else {
                i20 = i12;
            }
            if ((i10 & 100663296) != 0) {
                if ((i11 & 256) == 0) {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i20 |= i21;
            }
            if ((38347923 & i20) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                }
                boolean z11116 = z13;
                androidx.compose.foundation.interaction.j jVar1114 = jVar2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                }
                androidx.compose.ui.a0 a0Var1114 = a0Var2;
                int i21111113 = i20 >> 21;
                long j11114 = jM;
                l(j11114, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1114, z12, jVar1114, wd.h(true, 0.0f, jM, 2, null), z11116, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21111113 & com.planner5d.library.engine.input.f.b.B) | (i21111113 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1114;
                jVar3 = jVar1114;
                z15 = z11116;
                j13 = jW;
                j12 = jM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j12 = j10;
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z13 = z11;
        i18 = i11 & 64;
        if (i18 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((12582912 & i10) == 0) {
                int i21111114 = i12;
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i20 = i21111114 | i22;
            } else {
                i20 = i12;
            }
            if ((i10 & 100663296) != 0) {
                if ((i11 & 256) == 0) {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i20 |= i21;
            }
            if ((38347923 & i20) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                } else {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 128) != 0) {
                        i20 &= -29360129;
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i20 &= -234881025;
                    } else {
                        jW = j11;
                    }
                }
                boolean z11117 = z13;
                androidx.compose.foundation.interaction.j jVar1115 = jVar2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                }
                androidx.compose.ui.a0 a0Var1115 = a0Var2;
                int i21111115 = i20 >> 21;
                long j11115 = jM;
                l(j11115, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1115, z12, jVar1115, wd.h(true, 0.0f, jM, 2, null), z11117, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21111115 & com.planner5d.library.engine.input.f.b.B) | (i21111115 & 14) | 3072);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var1115;
                jVar3 = jVar1115;
                z15 = z11117;
                j13 = jW;
                j12 = jM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j12 = j10;
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((12582912 & i10) == 0) {
            int i21111116 = i12;
            if ((i11 & 128) == 0) {
                i22 = 4194304;
            } else {
                i22 = 4194304;
            }
            i20 = i21111116 | i22;
        } else {
            i20 = i12;
        }
        if ((i10 & 100663296) != 0) {
            if ((i11 & 256) == 0) {
                i21 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i21 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i20 |= i21;
        }
        if ((38347923 & i20) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 128) != 0) {
                    i20 &= -29360129;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                } else {
                    jM = j10;
                }
                if ((i11 & 256) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i20 &= -234881025;
                } else {
                    jW = j11;
                }
            } else {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 128) != 0) {
                    i20 &= -29360129;
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                } else {
                    jM = j10;
                }
                if ((i11 & 256) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(jM, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i20 &= -234881025;
                } else {
                    jW = j11;
                }
            }
            boolean z11118 = z13;
            androidx.compose.foundation.interaction.j jVar1116 = jVar2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-524682663, i20, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
            }
            androidx.compose.ui.a0 a0Var1116 = a0Var2;
            int i21111117 = i20 >> 21;
            long j11116 = jM;
            l(j11116, jW, z10, androidx.compose.runtime.internal.w.e(-1415722219, true, new a(a0Var1116, z12, jVar1116, wd.h(true, 0.0f, jM, 2, null), z11118, function1, function4, function2), c0VarR, 54), c0VarR, ((i20 << 6) & 896) | (i21111117 & com.planner5d.library.engine.input.f.b.B) | (i21111117 & 14) | 3072);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var1116;
            jVar3 = jVar1116;
            z15 = z11118;
            j13 = jW;
            j12 = jM;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            j12 = j10;
            a0Var3 = a0Var2;
            z15 = z13;
            jVar3 = jVar2;
            j13 = j11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ri.g(z10, function0, function2, function3, a0Var3, z15, jVar3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(boolean z10, Function0 function0, Function2 function2, Function2 function3, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(z10, function0, function2, function3, a0Var, z11, jVar, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0178  */
    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:142:0x0209  */
    /* JADX WARN: Code duplicated, block: B:144:0x0213  */
    /* JADX WARN: Code duplicated, block: B:147:0x0260  */
    /* JADX WARN: Code duplicated, block: B:149:0x0272  */
    /* JADX WARN: Code duplicated, block: B:152:0x0288  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.foundation.interaction.j jVar, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
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
        int i23;
        int i24;
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
        androidx.compose.runtime.internal.c cVarE;
        androidx.compose.foundation.interaction.j jVar3;
        long jM;
        long j14;
        long jW;
        int i25;
        boolean z16;
        long j15;
        int i26;
        int i27;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-610760526);
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
        int i28 = i11 & 4;
        if (i28 == 0) {
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
                        i19 = i11 & 64;
                        if (i19 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(jVar)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        i21 = 12582912;
                        if ((i10 & 12582912) == 0) {
                            if ((i11 & 128) == 0) {
                                i27 = i12;
                                i23 = i28;
                                int i29 = c0VarR.L(j10) ? 8388608 : 4194304;
                                i22 = i27 | i29;
                            } else {
                                i27 = i12;
                                i23 = i28;
                            }
                            i22 = i27 | i29;
                        } else {
                            i22 = i12;
                            i23 = i28;
                        }
                        if ((i10 & 100663296) == 0) {
                            int i30 = i22;
                            if ((i11 & 256) == 0 || !c0VarR.L(j11)) {
                                i26 = com.google.api.client.googleapis.media.a.f115410j;
                            } else {
                                i26 = 67108864;
                            }
                            i22 = i30 | i26;
                        }
                        i24 = i22;
                        if ((i24 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i24 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i23 != 0) {
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
                                if (i19 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i11 & 128) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i24 &= -29360129;
                                } else {
                                    jM = j10;
                                }
                                if ((i11 & 256) != 0) {
                                    long j16 = jM;
                                    j14 = j16;
                                    i25 = i24 & (-234881025);
                                    jW = androidx.compose.ui.graphics.q0.w(j16, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    j14 = jM;
                                    jW = j11;
                                    i25 = i24;
                                }
                                z16 = z13;
                                j15 = j14;
                            } else {
                                c0VarR.u();
                                i25 = (i11 & 128) != 0 ? i24 & (-29360129) : i24;
                                if ((i11 & 256) != 0) {
                                    i25 &= -234881025;
                                }
                                jVar3 = jVar;
                                jW = j11;
                                i21 = 12582912;
                                z16 = z13;
                                j15 = j10;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                            }
                            if (function4 == null) {
                                c0VarR.E(-1684864799);
                            } else {
                                c0VarR.E(-1684864798);
                                cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                            }
                            c0VarR.A();
                            androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                            int i31 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                            int i32 = i25 >> 6;
                            c0Var2 = c0VarR;
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            i(z12, function1, a0Var4, z16, jVar3, j15, jW, cVarE2, c0Var2, (57344 & i32) | i31 | (458752 & i32) | (i32 & 3670016), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function6 = function4;
                            function7 = function5;
                            a0Var3 = a0Var4;
                            z15 = z16;
                            jVar2 = jVar3;
                            j12 = j15;
                            j13 = jW;
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
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function3;
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = 12582912;
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) == 0) {
                            i27 = i12;
                            i23 = i28;
                            if (c0VarR.L(j10)) {
                            }
                            i22 = i27 | i29;
                        } else {
                            i27 = i12;
                            i23 = i28;
                        }
                        i22 = i27 | i29;
                    } else {
                        i22 = i12;
                        i23 = i28;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i33 = i22;
                        if ((i11 & 256) == 0) {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i22 = i33 | i26;
                    }
                    i24 = i22;
                    if ((i24 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i24 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j17 = jM;
                                j14 = j17;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j17, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        } else {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j18 = jM;
                                j14 = j18;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j18, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1684864799);
                        } else {
                            c0VarR.E(-1684864798);
                            cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                        int i34 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                        int i35 = i25 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        i(z12, function1, a0Var5, z16, jVar3, j15, jW, cVarE3, c0Var2, (57344 & i35) | i34 | (458752 & i35) | (i35 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function6 = function4;
                        function7 = function5;
                        a0Var3 = a0Var5;
                        z15 = z16;
                        jVar2 = jVar3;
                        j12 = j15;
                        j13 = jW;
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
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = 12582912;
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) == 0) {
                            i27 = i12;
                            i23 = i28;
                            if (c0VarR.L(j10)) {
                            }
                            i22 = i27 | i29;
                        } else {
                            i27 = i12;
                            i23 = i28;
                        }
                        i22 = i27 | i29;
                    } else {
                        i22 = i12;
                        i23 = i28;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i36 = i22;
                        if ((i11 & 256) == 0) {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i22 = i36 | i26;
                    }
                    i24 = i22;
                    if ((i24 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i24 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j19 = jM;
                                j14 = j19;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j19, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        } else {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j110 = jM;
                                j14 = j110;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1684864799);
                        } else {
                            c0VarR.E(-1684864798);
                            cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                        int i37 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                        int i38 = i25 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        i(z12, function1, a0Var6, z16, jVar3, j15, jW, cVarE4, c0Var2, (57344 & i38) | i37 | (458752 & i38) | (i38 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function6 = function4;
                        function7 = function5;
                        a0Var3 = a0Var6;
                        z15 = z16;
                        jVar2 = jVar3;
                        j12 = j15;
                        j13 = jW;
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
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i39 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i39 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j111 = jM;
                            j14 = j111;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j112 = jM;
                            j14 = j112;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i310 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i311 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    i(z12, function1, a0Var7, z16, jVar3, j15, jW, cVarE5, c0Var2, (57344 & i311) | i310 | (458752 & i311) | (i311 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var7;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = 12582912;
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) == 0) {
                            i27 = i12;
                            i23 = i28;
                            if (c0VarR.L(j10)) {
                            }
                            i22 = i27 | i29;
                        } else {
                            i27 = i12;
                            i23 = i28;
                        }
                        i22 = i27 | i29;
                    } else {
                        i22 = i12;
                        i23 = i28;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i312 = i22;
                        if ((i11 & 256) == 0) {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i22 = i312 | i26;
                    }
                    i24 = i22;
                    if ((i24 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i24 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j113 = jM;
                                j14 = j113;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        } else {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j114 = jM;
                                j14 = j114;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1684864799);
                        } else {
                            c0VarR.E(-1684864798);
                            cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                        int i313 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                        int i314 = i25 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var8 = a0Var2;
                        i(z12, function1, a0Var8, z16, jVar3, j15, jW, cVarE6, c0Var2, (57344 & i314) | i313 | (458752 & i314) | (i314 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function6 = function4;
                        function7 = function5;
                        a0Var3 = a0Var8;
                        z15 = z16;
                        jVar2 = jVar3;
                        j12 = j15;
                        j13 = jW;
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
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i315 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i315 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j115 = jM;
                            j14 = j115;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j115, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j116 = jM;
                            j14 = j116;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j116, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i316 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i317 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    i(z12, function1, a0Var9, z16, jVar3, j15, jW, cVarE7, c0Var2, (57344 & i317) | i316 | (458752 & i317) | (i317 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var9;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i318 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i318 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j117 = jM;
                            j14 = j117;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j117, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j118 = jM;
                            j14 = j118;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j118, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i319 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i3110 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    i(z12, function1, a0Var10, z16, jVar3, j15, jW, cVarE8, c0Var2, (57344 & i3110) | i319 | (458752 & i3110) | (i3110 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var10;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i21 = 12582912;
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    i27 = i12;
                    i23 = i28;
                    if (c0VarR.L(j10)) {
                    }
                    i22 = i27 | i29;
                } else {
                    i27 = i12;
                    i23 = i28;
                }
                i22 = i27 | i29;
            } else {
                i22 = i12;
                i23 = i28;
            }
            if ((i10 & 100663296) == 0) {
                int i3111 = i22;
                if ((i11 & 256) == 0) {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i22 = i3111 | i26;
            }
            i24 = i22;
            if ((i24 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i24 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j119 = jM;
                        j14 = j119;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j119, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                } else {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j1110 = jM;
                        j14 = j1110;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j1110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                }
                if (function4 == null) {
                    c0VarR.E(-1684864799);
                } else {
                    c0VarR.E(-1684864798);
                    cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                int i3112 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                int i3113 = i25 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                i(z12, function1, a0Var11, z16, jVar3, j15, jW, cVarE9, c0Var2, (57344 & i3113) | i3112 | (458752 & i3113) | (i3113 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function4;
                function7 = function5;
                a0Var3 = a0Var11;
                z15 = z16;
                jVar2 = jVar3;
                j12 = j15;
                j13 = jW;
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(jVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = 12582912;
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) == 0) {
                            i27 = i12;
                            i23 = i28;
                            if (c0VarR.L(j10)) {
                            }
                            i22 = i27 | i29;
                        } else {
                            i27 = i12;
                            i23 = i28;
                        }
                        i22 = i27 | i29;
                    } else {
                        i22 = i12;
                        i23 = i28;
                    }
                    if ((i10 & 100663296) == 0) {
                        int i3114 = i22;
                        if ((i11 & 256) == 0) {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i26 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i22 = i3114 | i26;
                    }
                    i24 = i22;
                    if ((i24 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i24 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j1111 = jM;
                                j14 = j1111;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j1111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        } else {
                            if (i23 != 0) {
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
                            if (i19 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i11 & 128) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i24 &= -29360129;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 256) != 0) {
                                long j1112 = jM;
                                j14 = j1112;
                                i25 = i24 & (-234881025);
                                jW = androidx.compose.ui.graphics.q0.w(j1112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                j14 = jM;
                                jW = j11;
                                i25 = i24;
                            }
                            z16 = z13;
                            j15 = j14;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                        }
                        if (function4 == null) {
                            c0VarR.E(-1684864799);
                        } else {
                            c0VarR.E(-1684864798);
                            cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                        int i3115 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                        int i3116 = i25 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var12 = a0Var2;
                        i(z12, function1, a0Var12, z16, jVar3, j15, jW, cVarE10, c0Var2, (57344 & i3116) | i3115 | (458752 & i3116) | (i3116 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function6 = function4;
                        function7 = function5;
                        a0Var3 = a0Var12;
                        z15 = z16;
                        jVar2 = jVar3;
                        j12 = j15;
                        j13 = jW;
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
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function3;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i3117 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i3117 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j1113 = jM;
                            j14 = j1113;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j1113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j1114 = jM;
                            j14 = j1114;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j1114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i3118 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i3119 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var13 = a0Var2;
                    i(z12, function1, a0Var13, z16, jVar3, j15, jW, cVarE11, c0Var2, (57344 & i3119) | i3118 | (458752 & i3119) | (i3119 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var13;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i31110 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i31110 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j1115 = jM;
                            j14 = j1115;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j1115, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j1116 = jM;
                            j14 = j1116;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j1116, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i31111 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i31112 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    i(z12, function1, a0Var14, z16, jVar3, j15, jW, cVarE12, c0Var2, (57344 & i31112) | i31111 | (458752 & i31112) | (i31112 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var14;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i21 = 12582912;
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    i27 = i12;
                    i23 = i28;
                    if (c0VarR.L(j10)) {
                    }
                    i22 = i27 | i29;
                } else {
                    i27 = i12;
                    i23 = i28;
                }
                i22 = i27 | i29;
            } else {
                i22 = i12;
                i23 = i28;
            }
            if ((i10 & 100663296) == 0) {
                int i31113 = i22;
                if ((i11 & 256) == 0) {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i22 = i31113 | i26;
            }
            i24 = i22;
            if ((i24 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i24 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j1117 = jM;
                        j14 = j1117;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j1117, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                } else {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j1118 = jM;
                        j14 = j1118;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j1118, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                }
                if (function4 == null) {
                    c0VarR.E(-1684864799);
                } else {
                    c0VarR.E(-1684864798);
                    cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                int i31114 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                int i31115 = i25 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var15 = a0Var2;
                i(z12, function1, a0Var15, z16, jVar3, j15, jW, cVarE13, c0Var2, (57344 & i31115) | i31114 | (458752 & i31115) | (i31115 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function4;
                function7 = function5;
                a0Var3 = a0Var15;
                z15 = z16;
                jVar2 = jVar3;
                j12 = j15;
                j13 = jW;
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(jVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = 12582912;
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        i27 = i12;
                        i23 = i28;
                        if (c0VarR.L(j10)) {
                        }
                        i22 = i27 | i29;
                    } else {
                        i27 = i12;
                        i23 = i28;
                    }
                    i22 = i27 | i29;
                } else {
                    i22 = i12;
                    i23 = i28;
                }
                if ((i10 & 100663296) == 0) {
                    int i31116 = i22;
                    if ((i11 & 256) == 0) {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i26 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i22 = i31116 | i26;
                }
                i24 = i22;
                if ((i24 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i24 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j1119 = jM;
                            j14 = j1119;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j1119, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    } else {
                        if (i23 != 0) {
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
                        if (i19 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i11 & 128) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i24 &= -29360129;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 256) != 0) {
                            long j11110 = jM;
                            j14 = j11110;
                            i25 = i24 & (-234881025);
                            jW = androidx.compose.ui.graphics.q0.w(j11110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            j14 = jM;
                            jW = j11;
                            i25 = i24;
                        }
                        z16 = z13;
                        j15 = j14;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                    }
                    if (function4 == null) {
                        c0VarR.E(-1684864799);
                    } else {
                        c0VarR.E(-1684864798);
                        cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                    int i31117 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                    int i31118 = i25 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var16 = a0Var2;
                    i(z12, function1, a0Var16, z16, jVar3, j15, jW, cVarE14, c0Var2, (57344 & i31118) | i31117 | (458752 & i31118) | (i31118 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function4;
                    function7 = function5;
                    a0Var3 = a0Var16;
                    z15 = z16;
                    jVar2 = jVar3;
                    j12 = j15;
                    j13 = jW;
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
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function3;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i21 = 12582912;
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    i27 = i12;
                    i23 = i28;
                    if (c0VarR.L(j10)) {
                    }
                    i22 = i27 | i29;
                } else {
                    i27 = i12;
                    i23 = i28;
                }
                i22 = i27 | i29;
            } else {
                i22 = i12;
                i23 = i28;
            }
            if ((i10 & 100663296) == 0) {
                int i31119 = i22;
                if ((i11 & 256) == 0) {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i22 = i31119 | i26;
            }
            i24 = i22;
            if ((i24 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i24 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j11111 = jM;
                        j14 = j11111;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j11111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                } else {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j11112 = jM;
                        j14 = j11112;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j11112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                }
                if (function4 == null) {
                    c0VarR.E(-1684864799);
                } else {
                    c0VarR.E(-1684864798);
                    cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                int i311110 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                int i311111 = i25 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var17 = a0Var2;
                i(z12, function1, a0Var17, z16, jVar3, j15, jW, cVarE15, c0Var2, (57344 & i311111) | i311110 | (458752 & i311111) | (i311111 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function4;
                function7 = function5;
                a0Var3 = a0Var17;
                z15 = z16;
                jVar2 = jVar3;
                j12 = j15;
                j13 = jW;
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(jVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i21 = 12582912;
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    i27 = i12;
                    i23 = i28;
                    if (c0VarR.L(j10)) {
                    }
                    i22 = i27 | i29;
                } else {
                    i27 = i12;
                    i23 = i28;
                }
                i22 = i27 | i29;
            } else {
                i22 = i12;
                i23 = i28;
            }
            if ((i10 & 100663296) == 0) {
                int i311112 = i22;
                if ((i11 & 256) == 0) {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i26 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i22 = i311112 | i26;
            }
            i24 = i22;
            if ((i24 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i24 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j11113 = jM;
                        j14 = j11113;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j11113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                } else {
                    if (i23 != 0) {
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
                    if (i19 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i11 & 128) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i24 &= -29360129;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 256) != 0) {
                        long j11114 = jM;
                        j14 = j11114;
                        i25 = i24 & (-234881025);
                        jW = androidx.compose.ui.graphics.q0.w(j11114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j14 = jM;
                        jW = j11;
                        i25 = i24;
                    }
                    z16 = z13;
                    j15 = j14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                }
                if (function4 == null) {
                    c0VarR.E(-1684864799);
                } else {
                    c0VarR.E(-1684864798);
                    cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
                }
                c0VarR.A();
                androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
                int i311113 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
                int i311114 = i25 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                i(z12, function1, a0Var18, z16, jVar3, j15, jW, cVarE16, c0Var2, (57344 & i311114) | i311113 | (458752 & i311114) | (i311114 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function4;
                function7 = function5;
                a0Var3 = a0Var18;
                z15 = z16;
                jVar2 = jVar3;
                j12 = j15;
                j13 = jW;
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function5 = function3;
        i19 = i11 & 64;
        if (i19 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(jVar)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        i21 = 12582912;
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) == 0) {
                i27 = i12;
                i23 = i28;
                if (c0VarR.L(j10)) {
                }
                i22 = i27 | i29;
            } else {
                i27 = i12;
                i23 = i28;
            }
            i22 = i27 | i29;
        } else {
            i22 = i12;
            i23 = i28;
        }
        if ((i10 & 100663296) == 0) {
            int i311115 = i22;
            if ((i11 & 256) == 0) {
                i26 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i26 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i22 = i311115 | i26;
        }
        i24 = i22;
        if ((i24 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i24 & 1)) {
            c0VarR.l0();
            cVarE = null;
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
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
                if (i19 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i11 & 128) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i24 &= -29360129;
                } else {
                    jM = j10;
                }
                if ((i11 & 256) != 0) {
                    long j11115 = jM;
                    j14 = j11115;
                    i25 = i24 & (-234881025);
                    jW = androidx.compose.ui.graphics.q0.w(j11115, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    j14 = jM;
                    jW = j11;
                    i25 = i24;
                }
                z16 = z13;
                j15 = j14;
            } else {
                if (i23 != 0) {
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
                if (i19 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i11 & 128) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i24 &= -29360129;
                } else {
                    jM = j10;
                }
                if ((i11 & 256) != 0) {
                    long j11116 = jM;
                    j14 = j11116;
                    i25 = i24 & (-234881025);
                    jW = androidx.compose.ui.graphics.q0.w(j11116, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    j14 = jM;
                    jW = j11;
                    i25 = i24;
                }
                z16 = z13;
                j15 = j14;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-610760526, i25, -1, "androidx.compose.material.Tab (Tab.kt:97)");
            }
            if (function4 == null) {
                c0VarR.E(-1684864799);
            } else {
                c0VarR.E(-1684864798);
                cVarE = androidx.compose.runtime.internal.w.e(1101313667, true, new d(function4), c0VarR, 54);
            }
            c0VarR.A();
            androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(-1088373601, true, new b(cVarE, function5), c0VarR, 54);
            int i311116 = (i25 & 14) | i21 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168);
            int i311117 = i25 >> 6;
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0Var19 = a0Var2;
            i(z12, function1, a0Var19, z16, jVar3, j15, jW, cVarE17, c0Var2, (57344 & i311117) | i311116 | (458752 & i311117) | (i311117 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function6 = function4;
            function7 = function5;
            a0Var3 = a0Var19;
            z15 = z16;
            jVar2 = jVar3;
            j12 = j15;
            j13 = jW;
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material.oi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ri.o(z10, function0, a0Var3, z15, function6, function7, jVar2, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0150  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x0197  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0204  */
    /* JADX WARN: Code duplicated, block: B:131:0x0215  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, long j10, long j11, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        androidx.compose.foundation.interaction.j jVar2;
        int i18;
        long jM;
        int i19;
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i20;
        boolean z14;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final androidx.compose.foundation.interaction.j jVar3;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        long j14;
        int i21;
        long jW;
        androidx.compose.foundation.interaction.j jVar4;
        int i22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1847932236);
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
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((196608 & i10) == 0) {
                            if ((i11 & 32) == 0) {
                                jM = j10;
                                int i23 = c0VarR.L(jM) ? 131072 : 65536;
                                i12 |= i23;
                            } else {
                                jM = j10;
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        if ((1572864 & i10) == 0) {
                            int i24 = i12;
                            if ((i11 & 64) == 0 || !c0VarR.L(j11)) {
                                i22 = 524288;
                            } else {
                                i22 = 1048576;
                            }
                            i19 = i24 | i22;
                        } else {
                            i19 = i12;
                        }
                        if ((i11 & 128) != 0) {
                            if ((i10 & 12582912) == 0) {
                                nVar2 = nVar;
                                if (c0VarR.k0(nVar2)) {
                                    i20 = 8388608;
                                } else {
                                    i20 = 4194304;
                                }
                                i19 |= i20;
                            }
                            if ((i19 & 4793491) != 4793490) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i19 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i13 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i15 != 0) {
                                        z13 = true;
                                    }
                                    if (i17 != 0) {
                                        jVar2 = null;
                                    }
                                    if ((i11 & 32) != 0) {
                                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                        i19 &= -458753;
                                    }
                                    j14 = jM;
                                    if ((i11 & 64) != 0) {
                                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i21 = i19 & (-3670017);
                                    } else {
                                        i21 = i19;
                                        jW = j11;
                                    }
                                    jVar4 = jVar2;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 32) != 0) {
                                        i19 &= -458753;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i19 &= -3670017;
                                    }
                                    z13 = z13;
                                    j14 = jM;
                                    i21 = i19;
                                    a0Var2 = a0Var2;
                                    jVar4 = jVar2;
                                    jW = j11;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                                }
                                long j15 = j14;
                                int i25 = i21 >> 15;
                                l(j15, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j15, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 14) | 3072);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                j12 = j15;
                                jVar3 = jVar4;
                                j13 = jW;
                                a0Var3 = a0Var2;
                                z15 = z13;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                                z15 = z13;
                                jVar3 = jVar2;
                                j12 = jM;
                                j13 = j11;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i19 |= 12582912;
                        nVar2 = nVar;
                        if ((i19 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                            }
                            long j16 = j14;
                            int i26 = i21 >> 15;
                            l(j16, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j16, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 14) | 3072);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j16;
                            jVar3 = jVar4;
                            j13 = jW;
                            a0Var3 = a0Var2;
                            z15 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j12 = jM;
                            j13 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    jVar2 = jVar;
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jM = j10;
                            if (c0VarR.L(jM)) {
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((1572864 & i10) == 0) {
                        int i27 = i12;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i19 = i27 | i22;
                    } else {
                        i19 = i12;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            nVar2 = nVar;
                            if (c0VarR.k0(nVar2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i19 |= i20;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                            }
                            long j17 = j14;
                            int i28 = i21 >> 15;
                            l(j17, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j17, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 14) | 3072);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j17;
                            jVar3 = jVar4;
                            j13 = jW;
                            a0Var3 = a0Var2;
                            z15 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j12 = jM;
                            j13 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 12582912;
                    nVar2 = nVar;
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j18 = j14;
                        int i29 = i21 >> 15;
                        l(j18, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j18, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j18;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z13 = z11;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jM = j10;
                            if (c0VarR.L(jM)) {
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((1572864 & i10) == 0) {
                        int i210 = i12;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i19 = i210 | i22;
                    } else {
                        i19 = i12;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            nVar2 = nVar;
                            if (c0VarR.k0(nVar2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i19 |= i20;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                            }
                            long j19 = j14;
                            int i211 = i21 >> 15;
                            l(j19, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j19, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 14) | 3072);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j19;
                            jVar3 = jVar4;
                            j13 = jW;
                            a0Var3 = a0Var2;
                            z15 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j12 = jM;
                            j13 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 12582912;
                    nVar2 = nVar;
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j110 = j14;
                        int i212 = i21 >> 15;
                        l(j110, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j110, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j110;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i213 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i213 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j111 = j14;
                        int i214 = i21 >> 15;
                        l(j111, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j111, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j111;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j112 = j14;
                    int i215 = i21 >> 15;
                    l(j112, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j112, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j112;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jM = j10;
                            if (c0VarR.L(jM)) {
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((1572864 & i10) == 0) {
                        int i216 = i12;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i19 = i216 | i22;
                    } else {
                        i19 = i12;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            nVar2 = nVar;
                            if (c0VarR.k0(nVar2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i19 |= i20;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                            }
                            long j113 = j14;
                            int i217 = i21 >> 15;
                            l(j113, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j113, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 14) | 3072);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j113;
                            jVar3 = jVar4;
                            j13 = jW;
                            a0Var3 = a0Var2;
                            z15 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j12 = jM;
                            j13 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 12582912;
                    nVar2 = nVar;
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j114 = j14;
                        int i218 = i21 >> 15;
                        l(j114, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j114, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j114;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i219 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i219 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j115 = j14;
                        int i2110 = i21 >> 15;
                        l(j115, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j115, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j115;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j116 = j14;
                    int i2111 = i21 >> 15;
                    l(j116, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j116, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j116;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i2112 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i2112 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j117 = j14;
                        int i2113 = i21 >> 15;
                        l(j117, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j117, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2113 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j117;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j118 = j14;
                    int i2114 = i21 >> 15;
                    l(j118, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j118, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2114 & com.planner5d.library.engine.input.f.b.B) | (i2114 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j118;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((1572864 & i10) == 0) {
                int i2115 = i12;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i19 = i2115 | i22;
            } else {
                i19 = i12;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i19 |= i20;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j119 = j14;
                    int i2116 = i21 >> 15;
                    l(j119, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j119, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2116 & com.planner5d.library.engine.input.f.b.B) | (i2116 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j119;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 12582912;
            nVar2 = nVar;
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                }
                long j1110 = j14;
                int i2117 = i21 >> 15;
                l(j1110, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1110, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 14) | 3072);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j1110;
                jVar3 = jVar4;
                j13 = jW;
                a0Var3 = a0Var2;
                z15 = z13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j12 = jM;
                j13 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            jM = j10;
                            if (c0VarR.L(jM)) {
                            }
                            i12 |= i23;
                        } else {
                            jM = j10;
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    if ((1572864 & i10) == 0) {
                        int i2118 = i12;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i19 = i2118 | i22;
                    } else {
                        i19 = i12;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            nVar2 = nVar;
                            if (c0VarR.k0(nVar2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i19 |= i20;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i19 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i19 &= -458753;
                                }
                                j14 = jM;
                                if ((i11 & 64) != 0) {
                                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i21 = i19 & (-3670017);
                                } else {
                                    i21 = i19;
                                    jW = j11;
                                }
                                jVar4 = jVar2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                            }
                            long j1111 = j14;
                            int i2119 = i21 >> 15;
                            l(j1111, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1111, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2119 & com.planner5d.library.engine.input.f.b.B) | (i2119 & 14) | 3072);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j1111;
                            jVar3 = jVar4;
                            j13 = jW;
                            a0Var3 = a0Var2;
                            z15 = z13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            jVar3 = jVar2;
                            j12 = jM;
                            j13 = j11;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 12582912;
                    nVar2 = nVar;
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j1112 = j14;
                        int i21110 = i21 >> 15;
                        l(j1112, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1112, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21110 & com.planner5d.library.engine.input.f.b.B) | (i21110 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j1112;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i21111 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i21111 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j1113 = j14;
                        int i21112 = i21 >> 15;
                        l(j1113, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1113, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21112 & com.planner5d.library.engine.input.f.b.B) | (i21112 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j1113;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j1114 = j14;
                    int i21113 = i21 >> 15;
                    l(j1114, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1114, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j1114;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i21114 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i21114 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j1115 = j14;
                        int i21115 = i21 >> 15;
                        l(j1115, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1115, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21115 & com.planner5d.library.engine.input.f.b.B) | (i21115 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j1115;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j1116 = j14;
                    int i21116 = i21 >> 15;
                    l(j1116, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1116, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21116 & com.planner5d.library.engine.input.f.b.B) | (i21116 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j1116;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((1572864 & i10) == 0) {
                int i21117 = i12;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i19 = i21117 | i22;
            } else {
                i19 = i12;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i19 |= i20;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j1117 = j14;
                    int i21118 = i21 >> 15;
                    l(j1117, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1117, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21118 & com.planner5d.library.engine.input.f.b.B) | (i21118 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j1117;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 12582912;
            nVar2 = nVar;
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                }
                long j1118 = j14;
                int i21119 = i21 >> 15;
                l(j1118, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1118, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i21119 & com.planner5d.library.engine.input.f.b.B) | (i21119 & 14) | 3072);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j1118;
                jVar3 = jVar4;
                j13 = jW;
                a0Var3 = a0Var2;
                z15 = z13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j12 = jM;
                j13 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jM = j10;
                        if (c0VarR.L(jM)) {
                        }
                        i12 |= i23;
                    } else {
                        jM = j10;
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                if ((1572864 & i10) == 0) {
                    int i211110 = i12;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i19 = i211110 | i22;
                } else {
                    i19 = i12;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        nVar2 = nVar;
                        if (c0VarR.k0(nVar2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i19 |= i20;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i19 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i19 &= -458753;
                            }
                            j14 = jM;
                            if ((i11 & 64) != 0) {
                                jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i21 = i19 & (-3670017);
                            } else {
                                i21 = i19;
                                jW = j11;
                            }
                            jVar4 = jVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                        }
                        long j1119 = j14;
                        int i211111 = i21 >> 15;
                        l(j1119, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j1119, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211111 & com.planner5d.library.engine.input.f.b.B) | (i211111 & 14) | 3072);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j1119;
                        jVar3 = jVar4;
                        j13 = jW;
                        a0Var3 = a0Var2;
                        z15 = z13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                        j12 = jM;
                        j13 = j11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 12582912;
                nVar2 = nVar;
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j11110 = j14;
                    int i211112 = i21 >> 15;
                    l(j11110, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11110, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211112 & com.planner5d.library.engine.input.f.b.B) | (i211112 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j11110;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((1572864 & i10) == 0) {
                int i211113 = i12;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i19 = i211113 | i22;
            } else {
                i19 = i12;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i19 |= i20;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j11111 = j14;
                    int i211114 = i21 >> 15;
                    l(j11111, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11111, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211114 & com.planner5d.library.engine.input.f.b.B) | (i211114 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j11111;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 12582912;
            nVar2 = nVar;
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                }
                long j11112 = j14;
                int i211115 = i21 >> 15;
                l(j11112, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11112, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211115 & com.planner5d.library.engine.input.f.b.B) | (i211115 & 14) | 3072);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j11112;
                jVar3 = jVar4;
                j13 = jW;
                a0Var3 = a0Var2;
                z15 = z13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j12 = jM;
                j13 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jM = j10;
                    if (c0VarR.L(jM)) {
                    }
                    i12 |= i23;
                } else {
                    jM = j10;
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            if ((1572864 & i10) == 0) {
                int i211116 = i12;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i19 = i211116 | i22;
            } else {
                i19 = i12;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    nVar2 = nVar;
                    if (c0VarR.k0(nVar2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i19 |= i20;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i19 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i19 &= -458753;
                        }
                        j14 = jM;
                        if ((i11 & 64) != 0) {
                            jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i21 = i19 & (-3670017);
                        } else {
                            i21 = i19;
                            jW = j11;
                        }
                        jVar4 = jVar2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                    }
                    long j11113 = j14;
                    int i211117 = i21 >> 15;
                    l(j11113, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11113, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211117 & com.planner5d.library.engine.input.f.b.B) | (i211117 & 14) | 3072);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j11113;
                    jVar3 = jVar4;
                    j13 = jW;
                    a0Var3 = a0Var2;
                    z15 = z13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                    j12 = jM;
                    j13 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 12582912;
            nVar2 = nVar;
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                }
                long j11114 = j14;
                int i211118 = i21 >> 15;
                l(j11114, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11114, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i211118 & com.planner5d.library.engine.input.f.b.B) | (i211118 & 14) | 3072);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j11114;
                jVar3 = jVar4;
                j13 = jW;
                a0Var3 = a0Var2;
                z15 = z13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j12 = jM;
                j13 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                jM = j10;
                if (c0VarR.L(jM)) {
                }
                i12 |= i23;
            } else {
                jM = j10;
            }
            i12 |= i23;
        } else {
            jM = j10;
        }
        if ((1572864 & i10) == 0) {
            int i211119 = i12;
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i19 = i211119 | i22;
        } else {
            i19 = i12;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                nVar2 = nVar;
                if (c0VarR.k0(nVar2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i19 |= i20;
            }
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i19 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i19 &= -458753;
                    }
                    j14 = jM;
                    if ((i11 & 64) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i21 = i19 & (-3670017);
                    } else {
                        i21 = i19;
                        jW = j11;
                    }
                    jVar4 = jVar2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                }
                long j11115 = j14;
                int i2111110 = i21 >> 15;
                l(j11115, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11115, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111110 & com.planner5d.library.engine.input.f.b.B) | (i2111110 & 14) | 3072);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j11115;
                jVar3 = jVar4;
                j13 = jW;
                a0Var3 = a0Var2;
                z15 = z13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
                j12 = jM;
                j13 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 12582912;
        nVar2 = nVar;
        if ((i19 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i19 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i19 &= -458753;
                }
                j14 = jM;
                if ((i11 & 64) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i21 = i19 & (-3670017);
                } else {
                    i21 = i19;
                    jW = j11;
                }
                jVar4 = jVar2;
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i19 &= -458753;
                }
                j14 = jM;
                if ((i11 & 64) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i21 = i19 & (-3670017);
                } else {
                    i21 = i19;
                    jW = j11;
                }
                jVar4 = jVar2;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1847932236, i21, -1, "androidx.compose.material.Tab (Tab.kt:229)");
            }
            long j11116 = j14;
            int i2111111 = i21 >> 15;
            l(j11116, jW, z10, androidx.compose.runtime.internal.w.e(-652402312, true, new c(a0Var2, z12, jVar4, wd.h(true, 0.0f, j11116, 2, null), z13, function0, nVar2), c0VarR, 54), c0VarR, ((i21 << 6) & 896) | (i2111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111 & 14) | 3072);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j11116;
            jVar3 = jVar4;
            j13 = jW;
            a0Var3 = a0Var2;
            z15 = z13;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z15 = z13;
            jVar3 = jVar2;
            j12 = jM;
            j13 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.qi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ri.p(z10, function0, a0Var3, z15, jVar3, j12, j13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1466813041);
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
                androidx.compose.runtime.m0.A0(1466813041, i11, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:297)");
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
                c0VarR.E(-1044948645);
                androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.layout.i0.b(aVar, "text"), f24672f, 0.0f, 2, null);
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
                c0VarR.E(-1044843896);
                c0VarR.A();
            }
            if (function3 != null) {
                c0VarR.E(-1044815097);
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
                c0VarR.E(-1044752632);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ni
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ri.k(function2, function3, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1841653376);
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
                androidx.compose.runtime.m0.A0(-1841653376, i11, -1, "androidx.compose.material.TabTransition (Tab.kt:266)");
            }
            int i12 = i11 >> 6;
            androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(Boolean.valueOf(z11), null, c0VarR, i12 & 14, 2);
            f fVar = f.f24697a;
            boolean zBooleanValue = ((Boolean) l3VarJ.y()).booleanValue();
            c0VarR.E(90393475);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
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
            c0VarR.E(90393475);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(j13);
            boolean zBooleanValue3 = ((Boolean) l3VarJ.y()).booleanValue();
            c0VarR.E(90393475);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            androidx.compose.runtime.n7 n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, q0VarN, androidx.compose.ui.graphics.q0.n(j14), fVar.invoke(l3VarJ.w(), c0VarR, 0), z3Var, "ColorAnimation", c0VarR, 0);
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{x4.a().f(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.w(m(n7VarD), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(m(n7VarD))))}, function2, c0VarR, androidx.compose.runtime.n4.f36267i | (i12 & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.mi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ri.n(j10, j11, z11, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
    public static final Unit o(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function2, Function2 function3, androidx.compose.foundation.interaction.j jVar, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(z10, function0, a0Var, z11, function2, function3, jVar, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, long j10, long j11, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(z10, function0, a0Var, z11, jVar, j10, j11, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(androidx.compose.ui.layout.i2.a aVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, int i10, int i11, int i12, int i13) {
        int iG6 = dVar.g6(i12 == i13 ? f24673g : f24674h) + dVar.g6(wi.f25419a.h());
        int iC1 = (i2Var2.c1() + dVar.c8(f24675i)) - i12;
        int i14 = (i11 - i13) - iG6;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, (i10 - i2Var.h1()) / 2, i14, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, (i10 - i2Var2.h1()) / 2, i14 - iC1, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(androidx.compose.ui.layout.i2.a aVar, androidx.compose.ui.layout.i2 i2Var, int i10) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, (i10 - i2Var.c1()) / 2, 0.0f, 4, null);
    }
}
