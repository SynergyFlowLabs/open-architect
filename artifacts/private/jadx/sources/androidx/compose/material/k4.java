package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,728:1\n1282#2,6:729\n1282#2,6:735\n85#3:741\n113#4:742\n113#4:743\n113#4:744\n113#4:745\n113#4:746\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n104#1:729,6\n201#1:735,6\n101#1:741\n707#1:742\n710#1:743\n713#1:744\n716#1:745\n727#1:746\n*E\n"})
public final class k4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f23434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f23435e = 0.12f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f23436f = 0.16f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23431a = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23432b = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f23437g = androidx.compose.ui.unit.h.r(24);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f23438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e4 f23440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23442e;

        /* JADX INFO: renamed from: androidx.compose.material.k4$a$a, reason: collision with other inner class name */
        static final class C0178a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23443a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e4 f23444b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f23445c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23446d;

            /* JADX INFO: renamed from: androidx.compose.material.k4$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,728:1\n113#2:729\n99#3,6:730\n106#3:766\n79#4,6:736\n86#4,3:751\n89#4,2:760\n93#4:765\n347#5,9:742\n356#5,3:762\n4206#6,6:754\n85#7:767\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$2$1$1\n*L\n120#1:729\n114#1:730,6\n114#1:766\n114#1:736,6\n114#1:751,3\n114#1:760,2\n114#1:765\n114#1:742,9\n114#1:762,3\n114#1:754,6\n128#1:767\n*E\n"})
            static final class C0179a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23447a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ e4 f23448b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f23449c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23450d;

                /* JADX WARN: Multi-variable type inference failed */
                C0179a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, e4 e4Var, boolean z10, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                    this.f23447a = function2;
                    this.f23448b = e4Var;
                    this.f23449c = z10;
                    this.f23450d = nVar;
                }

                private static final long d(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
                    return n7Var.getValue().M();
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    int i11 = 6 | 1;
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1507027814, i10, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:113)");
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.b(aVar, 0.0f, f4.f22712a.d(), 1, null), this.f23447a == null ? k4.f23431a : androidx.compose.ui.unit.h.r(0), 0.0f, k4.f23431a, 0.0f, 10, null);
                    androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
                    androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f23447a;
                    e4 e4Var = this.f23448b;
                    boolean z10 = this.f23449c;
                    pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23450d;
                    androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, cVarQ, c0Var, 54);
                    int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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
                    if (function2 != null) {
                        c0Var.E(1856981007);
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23432b), c0Var, 6);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = e4Var.c(z10, c0Var, 0);
                        androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{x4.a().f(androidx.compose.ui.graphics.q0.n(d(n7VarC))), w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(d(n7VarC))))}, function2, c0Var, androidx.compose.runtime.n4.f36267i);
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23433c), c0Var, 6);
                        c0Var.A();
                    } else {
                        c0Var.E(1857512440);
                        c0Var.A();
                    }
                    nVar.invoke(y5Var, c0Var, 6);
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
            C0178a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, e4 e4Var, boolean z10, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f23443a = function2;
                this.f23444b = e4Var;
                this.f23445c = z10;
                this.f23446d = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1808091765, i10, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:112)");
                }
                wk.l(x9.f25488a.c(c0Var, 6).d(), androidx.compose.runtime.internal.w.e(1507027814, true, new C0179a(this.f23443a, this.f23444b, this.f23445c, this.f23446d), c0Var, 54), c0Var, 48);
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
        a(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, e4 e4Var, boolean z10, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f23438a = n7Var;
            this.f23439b = function2;
            this.f23440c = e4Var;
            this.f23441d = z10;
            this.f23442e = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1849195083, i10, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:111)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(k4.f(this.f23438a)))), androidx.compose.runtime.internal.w.e(1808091765, true, new C0178a(this.f23439b, this.f23440c, this.f23441d, this.f23442e), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f23451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ qe f23457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f23458h;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f23460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23461c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23462d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23463e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ qe f23464f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f23465g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f23466h;

            /* JADX INFO: renamed from: androidx.compose.material.k4$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,728:1\n113#2:729\n113#2:730\n99#3,6:731\n99#3,6:846\n106#3:882\n106#3:886\n79#4,6:737\n86#4,3:752\n89#4,2:761\n79#4,6:775\n86#4,3:790\n89#4,2:799\n79#4,6:811\n86#4,3:826\n89#4,2:835\n93#4:840\n93#4:844\n79#4,6:852\n86#4,3:867\n89#4,2:876\n93#4:881\n93#4:885\n347#5,9:743\n356#5:763\n347#5,9:781\n356#5:801\n347#5,9:817\n356#5,3:837\n357#5,2:842\n347#5,9:858\n356#5,3:878\n357#5,2:883\n4206#6,6:755\n4206#6,6:793\n4206#6,6:829\n4206#6,6:870\n70#7:764\n66#7,10:765\n70#7:802\n68#7,8:803\n77#7:841\n77#7:845\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$2$1$1\n*L\n217#1:729\n225#1:730\n211#1:731,6\n269#1:846,6\n269#1:882\n211#1:886\n211#1:737,6\n211#1:752,3\n211#1:761,2\n233#1:775,6\n233#1:790,3\n233#1:799,2\n256#1:811,6\n256#1:826,3\n256#1:835,2\n256#1:840\n233#1:844\n269#1:852,6\n269#1:867,3\n269#1:876,2\n269#1:881\n211#1:885\n211#1:743,9\n211#1:763\n233#1:781,9\n233#1:801\n256#1:817,9\n256#1:837,3\n233#1:842,2\n269#1:858,9\n269#1:878,3\n211#1:883,2\n211#1:755,6\n233#1:793,6\n256#1:829,6\n269#1:870,6\n233#1:764\n233#1:765,10\n256#1:802\n256#1:803,8\n256#1:841\n233#1:845\n*E\n"})
            static final class C0180a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23467a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f23468b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23469c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f23470d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23471e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ qe f23472f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f23473g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f23474h;

                /* JADX WARN: Multi-variable type inference failed */
                C0180a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, qe qeVar, boolean z11, androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
                    this.f23467a = function2;
                    this.f23468b = z10;
                    this.f23469c = function3;
                    this.f23470d = function4;
                    this.f23471e = nVar;
                    this.f23472f = qeVar;
                    this.f23473g = z11;
                    this.f23474h = n7Var;
                }

                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    ?? r10;
                    androidx.compose.ui.a0 a0VarA;
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-44453990, i10, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:210)");
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.layout.c4.d(aVar, androidx.compose.foundation.layout.e4.Max), 0.0f, f4.f22712a.d(), 1, null), (this.f23467a != null || (this.f23468b && this.f23469c != null)) ? androidx.compose.ui.unit.h.r(0) : k4.f23431a, 0.0f, this.f23470d == null ? k4.f23431a : androidx.compose.ui.unit.h.r(0), 0.0f, 10, null);
                    androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.foundation.layout.q.e eVarW = qVar.w();
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ = aVar2.q();
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f23467a;
                    boolean z10 = this.f23468b;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f23469c;
                    pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23471e;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function4 = this.f23470d;
                    qe qeVar = this.f23472f;
                    boolean z11 = this.f23473g;
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var = this.f23474h;
                    androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, cVarQ, c0Var, 54);
                    int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar3.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
                    androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                    if (function2 != null || (z10 && function3 != null)) {
                        c0Var.E(-1505271403);
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23432b), c0Var, 6);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                        int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, aVar);
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
                        if (function2 != null) {
                            c0Var.E(-2077339967);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = qeVar.b(z11, z10, c0Var, 0);
                            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{x4.a().f(n7VarB.getValue()), w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(n7VarB.getValue().M())))}, function2, c0Var, androidx.compose.runtime.n4.f36267i);
                            c0Var.A();
                        } else {
                            c0Var.E(-2076897907);
                            c0Var.A();
                        }
                        if (!z10 || function3 == null) {
                            c0Var.E(-2075540851);
                            c0Var.A();
                        } else {
                            c0Var.E(-2076791112);
                            long jM = n7Var.getValue().M();
                            if (function2 != null) {
                                c0Var.E(-2076615869);
                                a0VarA = androidx.compose.ui.draw.j.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.o(aVar, k4.f23437g), n7Var.getValue().M(), androidx.compose.foundation.shape.o.k()), androidx.compose.foundation.shape.o.k());
                                r10 = 0;
                                jM = qeVar.d(z11, z10, c0Var, 0).getValue().M();
                                c0Var.A();
                            } else {
                                r10 = 0;
                                c0Var.E(-2076052723);
                                c0Var.A();
                                a0VarA = aVar;
                            }
                            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.i(), r10);
                            int iJ3 = androidx.compose.runtime.v.j(c0Var, r10);
                            androidx.compose.runtime.b1 b1VarK3 = c0Var.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var, a0VarA);
                            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
                            if (c0Var.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var.q();
                            if (c0Var.P()) {
                                c0Var.q0(function0A3);
                            } else {
                                c0Var.l();
                            }
                            androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0Var);
                            androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar3.e());
                            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar3.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
                            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                                c0VarD3.Y(Integer.valueOf(iJ3));
                                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                            }
                            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar3.f());
                            androidx.compose.runtime.a1.e(x4.a().f(androidx.compose.ui.graphics.q0.n(jM)), function3, c0Var, androidx.compose.runtime.n4.f36267i);
                            c0Var.o();
                            c0Var.A();
                        }
                        c0Var.o();
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23433c), c0Var, 6);
                        c0Var.A();
                    } else {
                        c0Var.E(-1503250420);
                        c0Var.A();
                    }
                    androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(y5Var, aVar, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar2.q(), c0Var, 54);
                    int iJ4 = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0Var.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var, a0VarQ);
                    Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
                    if (c0Var.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0Var.q();
                    if (c0Var.P()) {
                        c0Var.q0(function0A4);
                    } else {
                        c0Var.l();
                    }
                    androidx.compose.runtime.c0 c0VarD4 = androidx.compose.runtime.y7.d(c0Var);
                    androidx.compose.runtime.y7.n(c0VarD4, a1VarE2, aVar3.e());
                    androidx.compose.runtime.y7.n(c0VarD4, b1VarK4, aVar3.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
                    if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iJ4))) {
                        c0VarD4.Y(Integer.valueOf(iJ4));
                        c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                    }
                    androidx.compose.runtime.y7.n(c0VarD4, a0VarN4, aVar3.f());
                    nVar.invoke(y5Var, c0Var, 6);
                    c0Var.o();
                    if (function4 != null) {
                        c0Var.E(-1502914938);
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23434d), c0Var, 6);
                        function4.invoke(c0Var, 0);
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, k4.f23434d), c0Var, 6);
                        c0Var.A();
                    } else {
                        c0Var.E(-1502724660);
                        c0Var.A();
                    }
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
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, qe qeVar, boolean z11, androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
                this.f23459a = function2;
                this.f23460b = z10;
                this.f23461c = function3;
                this.f23462d = function4;
                this.f23463e = nVar;
                this.f23464f = qeVar;
                this.f23465g = z11;
                this.f23466h = n7Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-773543317, i10, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:209)");
                }
                wk.l(x9.f25488a.c(c0Var, 6).d(), androidx.compose.runtime.internal.w.e(-44453990, true, new C0180a(this.f23459a, this.f23460b, this.f23461c, this.f23462d, this.f23463e, this.f23464f, this.f23465g, this.f23466h), c0Var, 54), c0Var, 48);
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
        b(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, qe qeVar, boolean z11) {
            this.f23451a = n7Var;
            this.f23452b = function2;
            this.f23453c = z10;
            this.f23454d = function3;
            this.f23455e = function4;
            this.f23456f = nVar;
            this.f23457g = qeVar;
            this.f23458h = z11;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-60565717, i10, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:208)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(this.f23451a.getValue().M()))), androidx.compose.runtime.internal.w.e(-773543317, true, new a(this.f23452b, this.f23453c, this.f23454d, this.f23455e, this.f23456f, this.f23457g, this.f23458h, this.f23451a), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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
        float f10 = 8;
        f23433c = androidx.compose.ui.unit.h.r(f10);
        f23434d = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:129:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0280  */
    /* JADX WARN: Code duplicated, block: B:150:0x028d  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable e4 e4Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i17;
        androidx.compose.foundation.a1 a1Var2;
        int i18;
        e4 e4VarA;
        int i19;
        int i20;
        int i21;
        int i22;
        ?? r13;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final androidx.compose.foundation.a1 a1Var3;
        final e4 e4Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.graphics.q3 q3VarA;
        androidx.compose.foundation.a1 a1Var4;
        androidx.compose.runtime.c0 c0Var3;
        boolean z14;
        androidx.compose.ui.graphics.q3 q3Var4;
        e4 e4Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        androidx.compose.foundation.a1 a1Var5;
        boolean z15;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1232125330);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
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
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            q3Var2 = q3Var;
                            int i24 = c0VarR.D(q3Var2) ? 16384 : 8192;
                            i12 |= i24;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i24;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            a1Var2 = a1Var;
                            if (c0VarR.D(a1Var2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i11 & 64) == 0) {
                                e4VarA = e4Var;
                                int i25 = c0VarR.D(e4VarA) ? 1048576 : 524288;
                                i12 |= i25;
                            } else {
                                e4VarA = e4Var;
                            }
                            i12 |= i25;
                        } else {
                            e4VarA = e4Var;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                            i20 = i17;
                        } else {
                            i20 = i17;
                            if ((i10 & 12582912) == 0) {
                                if (c0VarR.k0(function2)) {
                                    i21 = 8388608;
                                } else {
                                    i21 = 4194304;
                                }
                                i12 |= i21;
                            }
                        }
                        if ((i11 & 256) != 0) {
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i22 = 67108864;
                                } else {
                                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i12 |= i22;
                            }
                            r13 = 1;
                            if ((i12 & 38347923) != 38347922) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (c0VarR.h(z12, i12 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i23 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i13 != 0) {
                                        z11 = true;
                                    }
                                    if (i15 != 0) {
                                        jVar2 = null;
                                    }
                                    if ((i11 & 16) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i12 &= -57345;
                                    } else {
                                        q3VarA = q3Var2;
                                    }
                                    if (i20 != 0) {
                                        a1Var4 = null;
                                    } else {
                                        a1Var4 = a1Var2;
                                    }
                                    if ((i11 & 64) != 0) {
                                        z14 = false;
                                        c0Var3 = c0VarR;
                                        i12 &= -3670017;
                                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                    } else {
                                        c0Var3 = c0VarR;
                                        z14 = false;
                                    }
                                    e4 e4Var4 = e4VarA;
                                    q3Var4 = q3VarA;
                                    e4Var3 = e4Var4;
                                    if (i19 != 0) {
                                        function4 = null;
                                    } else {
                                        function4 = function2;
                                    }
                                    a1Var5 = a1Var4;
                                    z15 = z11;
                                    jVar4 = jVar2;
                                } else {
                                    c0VarR.u();
                                    if ((i11 & 16) != 0) {
                                        i12 &= -57345;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    jVar4 = jVar2;
                                    r13 = 1;
                                    a1Var5 = a1Var2;
                                    e4Var3 = e4VarA;
                                    z14 = false;
                                    z15 = z11;
                                    q3Var4 = q3Var2;
                                    c0Var3 = c0VarR;
                                    function4 = function2;
                                }
                                c0Var3.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                                }
                                int i26 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = e4Var3.b(z15, c0Var3, i26);
                                objI0 = c0Var3.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0Var3.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5 = function4;
                                c0Var2 = c0Var3;
                                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i26).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB, function5, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                e4Var2 = e4Var3;
                                function3 = function5;
                                a0Var3 = a0Var2;
                                z13 = z15;
                                q3Var3 = q3Var4;
                                a1Var3 = a1Var5;
                                jVar3 = jVar4;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                function3 = function2;
                                a0Var3 = a0Var2;
                                z13 = z11;
                                jVar3 = jVar2;
                                q3Var3 = q3Var2;
                                a1Var3 = a1Var2;
                                e4Var2 = e4VarA;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 100663296;
                        r13 = 1;
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var5 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var5;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            } else {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var6 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var6;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                            }
                            int i27 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB2 = e4Var3.b(z15, c0Var3, i27);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.i4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6 = function4;
                            c0Var2 = c0Var3;
                            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i27).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB2, function6, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            e4Var2 = e4Var3;
                            function3 = function6;
                            a0Var3 = a0Var2;
                            z13 = z15;
                            q3Var3 = q3Var4;
                            a1Var3 = a1Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function3 = function2;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var3 = q3Var2;
                            a1Var3 = a1Var2;
                            e4Var2 = e4VarA;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    a1Var2 = a1Var;
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            e4VarA = e4Var;
                            if (c0VarR.D(e4VarA)) {
                            }
                            i12 |= i25;
                        } else {
                            e4VarA = e4Var;
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        r13 = 1;
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var7 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var7;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            } else {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var8 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var8;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                            }
                            int i28 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB3 = e4Var3.b(z15, c0Var3, i28);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.i4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function4;
                            c0Var2 = c0Var3;
                            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i28).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB3), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB3, function7, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            e4Var2 = e4Var3;
                            function3 = function7;
                            a0Var3 = a0Var2;
                            z13 = z15;
                            q3Var3 = q3Var4;
                            a1Var3 = a1Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function3 = function2;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var3 = q3Var2;
                            a1Var3 = a1Var2;
                            e4Var2 = e4VarA;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var9 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var9;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var10 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var10;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i29 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB4 = e4Var3.b(z15, c0Var3, i29);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i29).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB4), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB4, function8, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function8;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                jVar2 = jVar;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i24;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        a1Var2 = a1Var;
                        if (c0VarR.D(a1Var2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            e4VarA = e4Var;
                            if (c0VarR.D(e4VarA)) {
                            }
                            i12 |= i25;
                        } else {
                            e4VarA = e4Var;
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        r13 = 1;
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var11 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var11;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            } else {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var12 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var12;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                            }
                            int i210 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB5 = e4Var3.b(z15, c0Var3, i210);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.i4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function4;
                            c0Var2 = c0Var3;
                            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i210).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB5), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB5, function9, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            e4Var2 = e4Var3;
                            function3 = function9;
                            a0Var3 = a0Var2;
                            z13 = z15;
                            q3Var3 = q3Var4;
                            a1Var3 = a1Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function3 = function2;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var3 = q3Var2;
                            a1Var3 = a1Var2;
                            e4Var2 = e4VarA;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var13 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var13;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var14 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var14;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i211 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB6 = e4Var3.b(z15, c0Var3, i211);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i211).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB6, function10, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function10;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                a1Var2 = a1Var;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var15 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var15;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var16 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var16;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i212 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB7 = e4Var3.b(z15, c0Var3, i212);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i212).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB7), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB7, function11, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function11;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var17 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var17;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var18 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var18;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i213 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB8 = e4Var3.b(z15, c0Var3, i213);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i213).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB8), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB8, function12, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function12;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i24;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        a1Var2 = a1Var;
                        if (c0VarR.D(a1Var2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            e4VarA = e4Var;
                            if (c0VarR.D(e4VarA)) {
                            }
                            i12 |= i25;
                        } else {
                            e4VarA = e4Var;
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        r13 = 1;
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var19 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var19;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            } else {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var110 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var110;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                            }
                            int i214 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB9 = e4Var3.b(z15, c0Var3, i214);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.i4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function4;
                            c0Var2 = c0Var3;
                            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i214).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB9), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB9, function13, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            e4Var2 = e4Var3;
                            function3 = function13;
                            a0Var3 = a0Var2;
                            z13 = z15;
                            q3Var3 = q3Var4;
                            a1Var3 = a1Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function3 = function2;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var3 = q3Var2;
                            a1Var3 = a1Var2;
                            e4Var2 = e4VarA;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var111 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var111;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var112 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var112;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i215 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB10 = e4Var3.b(z15, c0Var3, i215);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i215).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB10), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB10, function14, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function14;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                a1Var2 = a1Var;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var113 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var113;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var114 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var114;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i216 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB11 = e4Var3.b(z15, c0Var3, i216);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i216).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB11), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB11, function15, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function15;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var115 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var115;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var116 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var116;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i217 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB12 = e4Var3.b(z15, c0Var3, i217);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i217).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB12), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB12, function16, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function16;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var117 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var117;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var118 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var118;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i218 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB13 = e4Var3.b(z15, c0Var3, i218);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i218).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB13), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB13, function17, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function17;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var119 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var119;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var1110 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var1110;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i219 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB14 = e4Var3.b(z15, c0Var3, i219);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i219).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB14), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB14, function18, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function18;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            a1Var2 = a1Var;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    e4VarA = e4Var;
                    if (c0VarR.D(e4VarA)) {
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i12 |= i25;
            } else {
                e4VarA = e4Var;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                i20 = i17;
            } else {
                i20 = i17;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var1111 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var1111;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var1112 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var1112;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i2110 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB15 = e4Var3.b(z15, c0Var3, i2110);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2110).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB15), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB15, function19, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function19;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            r13 = 1;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1113 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1113;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1114 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1114;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                }
                int i2111 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB16 = e4Var3.b(z15, c0Var3, i2111);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function4;
                c0Var2 = c0Var3;
                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2111).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB16), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB16, function110, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                e4Var2 = e4Var3;
                function3 = function110;
                a0Var3 = a0Var2;
                z13 = z15;
                q3Var3 = q3Var4;
                a1Var3 = a1Var5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                a1Var3 = a1Var2;
                e4Var2 = e4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i24;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        a1Var2 = a1Var;
                        if (c0VarR.D(a1Var2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            e4VarA = e4Var;
                            if (c0VarR.D(e4VarA)) {
                            }
                            i12 |= i25;
                        } else {
                            e4VarA = e4Var;
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        r13 = 1;
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var1115 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var1115;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            } else {
                                if (i23 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i12 &= -57345;
                                } else {
                                    q3VarA = q3Var2;
                                }
                                if (i20 != 0) {
                                    a1Var4 = null;
                                } else {
                                    a1Var4 = a1Var2;
                                }
                                if ((i11 & 64) != 0) {
                                    z14 = false;
                                    c0Var3 = c0VarR;
                                    i12 &= -3670017;
                                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                    z14 = false;
                                }
                                e4 e4Var1116 = e4VarA;
                                q3Var4 = q3VarA;
                                e4Var3 = e4Var1116;
                                if (i19 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                a1Var5 = a1Var4;
                                z15 = z11;
                                jVar4 = jVar2;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                            }
                            int i2112 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB17 = e4Var3.b(z15, c0Var3, i2112);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.i4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function4;
                            c0Var2 = c0Var3;
                            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2112).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB17), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB17, function111, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            e4Var2 = e4Var3;
                            function3 = function111;
                            a0Var3 = a0Var2;
                            z13 = z15;
                            q3Var3 = q3Var4;
                            a1Var3 = a1Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function3 = function2;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var3 = q3Var2;
                            a1Var3 = a1Var2;
                            e4Var2 = e4VarA;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var1117 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var1117;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var1118 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var1118;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i2113 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB18 = e4Var3.b(z15, c0Var3, i2113);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2113).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB18), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB18, function112, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function112;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                a1Var2 = a1Var;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var1119 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var1119;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var11110 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var11110;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i2114 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB19 = e4Var3.b(z15, c0Var3, i2114);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2114).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB19), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB19, function113, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function113;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11111 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11111;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11112 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11112;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i2115 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB110 = e4Var3.b(z15, c0Var3, i2115);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function114 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2115).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB110), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB110, function114, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function114;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var11113 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var11113;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var11114 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var11114;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i2116 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB111 = e4Var3.b(z15, c0Var3, i2116);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function115 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2116).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB111), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB111, function115, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function115;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11115 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11115;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11116 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11116;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i2117 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB112 = e4Var3.b(z15, c0Var3, i2117);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2117).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB112), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB112, function116, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function116;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            a1Var2 = a1Var;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    e4VarA = e4Var;
                    if (c0VarR.D(e4VarA)) {
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i12 |= i25;
            } else {
                e4VarA = e4Var;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                i20 = i17;
            } else {
                i20 = i17;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11117 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11117;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var11118 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var11118;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i2118 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB113 = e4Var3.b(z15, c0Var3, i2118);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function117 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2118).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB113), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB113, function117, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function117;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            r13 = 1;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var11119 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var11119;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var111110 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var111110;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                }
                int i2119 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB114 = e4Var3.b(z15, c0Var3, i2119);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function118 = function4;
                c0Var2 = c0Var3;
                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i2119).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB114), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB114, function118, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                e4Var2 = e4Var3;
                function3 = function118;
                a0Var3 = a0Var2;
                z13 = z15;
                q3Var3 = q3Var4;
                a1Var3 = a1Var5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                a1Var3 = a1Var2;
                e4Var2 = e4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        e4VarA = e4Var;
                        if (c0VarR.D(e4VarA)) {
                        }
                        i12 |= i25;
                    } else {
                        e4VarA = e4Var;
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    i20 = i17;
                } else {
                    i20 = i17;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    r13 = 1;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var111111 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var111111;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        } else {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i12 &= -57345;
                            } else {
                                q3VarA = q3Var2;
                            }
                            if (i20 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var2;
                            }
                            if ((i11 & 64) != 0) {
                                z14 = false;
                                c0Var3 = c0VarR;
                                i12 &= -3670017;
                                e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                                z14 = false;
                            }
                            e4 e4Var111112 = e4VarA;
                            q3Var4 = q3VarA;
                            e4Var3 = e4Var111112;
                            if (i19 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            a1Var5 = a1Var4;
                            z15 = z11;
                            jVar4 = jVar2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                        }
                        int i21110 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB115 = e4Var3.b(z15, c0Var3, i21110);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.i4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.g((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function119 = function4;
                        c0Var2 = c0Var3;
                        ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21110).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB115), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB115, function119, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        e4Var2 = e4Var3;
                        function3 = function119;
                        a0Var3 = a0Var2;
                        z13 = z15;
                        q3Var3 = q3Var4;
                        a1Var3 = a1Var5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function3 = function2;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var3 = q3Var2;
                        a1Var3 = a1Var2;
                        e4Var2 = e4VarA;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var111113 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var111113;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var111114 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var111114;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i21111 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB116 = e4Var3.b(z15, c0Var3, i21111);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1110 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21111).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB116), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB116, function1110, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function1110;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            a1Var2 = a1Var;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    e4VarA = e4Var;
                    if (c0VarR.D(e4VarA)) {
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i12 |= i25;
            } else {
                e4VarA = e4Var;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                i20 = i17;
            } else {
                i20 = i17;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var111115 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var111115;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var111116 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var111116;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i21112 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB117 = e4Var3.b(z15, c0Var3, i21112);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21112).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB117), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB117, function1111, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function1111;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            r13 = 1;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var111117 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var111117;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var111118 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var111118;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                }
                int i21113 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB118 = e4Var3.b(z15, c0Var3, i21113);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1112 = function4;
                c0Var2 = c0Var3;
                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21113).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB118), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB118, function1112, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                e4Var2 = e4Var3;
                function3 = function1112;
                a0Var3 = a0Var2;
                z13 = z15;
                q3Var3 = q3Var4;
                a1Var3 = a1Var5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                a1Var3 = a1Var2;
                e4Var2 = e4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        jVar2 = jVar;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i24;
        } else {
            q3Var2 = q3Var;
        }
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                a1Var2 = a1Var;
                if (c0VarR.D(a1Var2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    e4VarA = e4Var;
                    if (c0VarR.D(e4VarA)) {
                    }
                    i12 |= i25;
                } else {
                    e4VarA = e4Var;
                }
                i12 |= i25;
            } else {
                e4VarA = e4Var;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                i20 = i17;
            } else {
                i20 = i17;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                r13 = 1;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var111119 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var111119;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    } else {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -57345;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if (i20 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var2;
                        }
                        if ((i11 & 64) != 0) {
                            z14 = false;
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                            e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                            z14 = false;
                        }
                        e4 e4Var1111110 = e4VarA;
                        q3Var4 = q3VarA;
                        e4Var3 = e4Var1111110;
                        if (i19 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        a1Var5 = a1Var4;
                        z15 = z11;
                        jVar4 = jVar2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                    }
                    int i21114 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB119 = e4Var3.b(z15, c0Var3, i21114);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.i4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1113 = function4;
                    c0Var2 = c0Var3;
                    ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21114).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB119), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB119, function1113, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    e4Var2 = e4Var3;
                    function3 = function1113;
                    a0Var3 = a0Var2;
                    z13 = z15;
                    q3Var3 = q3Var4;
                    a1Var3 = a1Var5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function3 = function2;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    a1Var3 = a1Var2;
                    e4Var2 = e4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            r13 = 1;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1111111 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1111111;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1111112 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1111112;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                }
                int i21115 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB1110 = e4Var3.b(z15, c0Var3, i21115);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1114 = function4;
                c0Var2 = c0Var3;
                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21115).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB1110), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB1110, function1114, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                e4Var2 = e4Var3;
                function3 = function1114;
                a0Var3 = a0Var2;
                z13 = z15;
                q3Var3 = q3Var4;
                a1Var3 = a1Var5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                a1Var3 = a1Var2;
                e4Var2 = e4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        a1Var2 = a1Var;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                e4VarA = e4Var;
                if (c0VarR.D(e4VarA)) {
                }
                i12 |= i25;
            } else {
                e4VarA = e4Var;
            }
            i12 |= i25;
        } else {
            e4VarA = e4Var;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
            i20 = i17;
        } else {
            i20 = i17;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i22;
            }
            r13 = 1;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1111113 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1111113;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -57345;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if (i20 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var2;
                    }
                    if ((i11 & 64) != 0) {
                        z14 = false;
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                        e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        z14 = false;
                    }
                    e4 e4Var1111114 = e4VarA;
                    q3Var4 = q3VarA;
                    e4Var3 = e4Var1111114;
                    if (i19 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    a1Var5 = a1Var4;
                    z15 = z11;
                    jVar4 = jVar2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                }
                int i21116 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB1111 = e4Var3.b(z15, c0Var3, i21116);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.i4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1115 = function4;
                c0Var2 = c0Var3;
                ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21116).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB1111), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB1111, function1115, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                e4Var2 = e4Var3;
                function3 = function1115;
                a0Var3 = a0Var2;
                z13 = z15;
                q3Var3 = q3Var4;
                a1Var3 = a1Var5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function3 = function2;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                a1Var3 = a1Var2;
                e4Var2 = e4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        r13 = 1;
        if ((i12 & 38347923) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i12 &= -57345;
                } else {
                    q3VarA = q3Var2;
                }
                if (i20 != 0) {
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var2;
                }
                if ((i11 & 64) != 0) {
                    z14 = false;
                    c0Var3 = c0VarR;
                    i12 &= -3670017;
                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                    z14 = false;
                }
                e4 e4Var1111115 = e4VarA;
                q3Var4 = q3VarA;
                e4Var3 = e4Var1111115;
                if (i19 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                a1Var5 = a1Var4;
                z15 = z11;
                jVar4 = jVar2;
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i12 &= -57345;
                } else {
                    q3VarA = q3Var2;
                }
                if (i20 != 0) {
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var2;
                }
                if ((i11 & 64) != 0) {
                    z14 = false;
                    c0Var3 = c0VarR;
                    i12 &= -3670017;
                    e4VarA = f4.f22712a.a(0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                    z14 = false;
                }
                e4 e4Var1111116 = e4VarA;
                q3Var4 = q3VarA;
                e4Var3 = e4Var1111116;
                if (i19 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                a1Var5 = a1Var4;
                z15 = z11;
                jVar4 = jVar2;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1232125330, i12, -1, "androidx.compose.material.Chip (Chip.kt:99)");
            }
            int i21117 = ((i12 >> 6) & 14) | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB1112 = e4Var3.b(z15, c0Var3, i21117);
            objI0 = c0Var3.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.i4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k4.g((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var3.Y(objI0);
            }
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1116 = function4;
            c0Var2 = c0Var3;
            ah.f(function0, androidx.compose.ui.semantics.t.f(a0Var2, z14, (Function1) objI0, r13, null), z15, q3Var4, e4Var3.a(z15, c0Var3, i21117).getValue().M(), androidx.compose.ui.graphics.q0.w(f(n7VarB1112), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var5, 0.0f, jVar4, androidx.compose.runtime.internal.w.e(-1849195083, r13, new a(n7VarB1112, function1116, e4Var3, z15, nVar), c0Var3, 54), c0Var2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            e4Var2 = e4Var3;
            function3 = function1116;
            a0Var3 = a0Var2;
            z13 = z15;
            q3Var3 = q3Var4;
            a1Var3 = a1Var5;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            function3 = function2;
            a0Var3 = a0Var2;
            z13 = z11;
            jVar3 = jVar2;
            q3Var3 = q3Var2;
            a1Var3 = a1Var2;
            e4Var2 = e4VarA;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.j4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k4.h(function0, a0Var3, z13, jVar3, q3Var3, a1Var3, e4Var2, function3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.foundation.a1 a1Var, e4 e4Var, Function2 function2, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(function0, a0Var, z10, jVar, q3Var, a1Var, e4Var, function2, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0217  */
    /* JADX WARN: Code duplicated, block: B:172:0x021d  */
    /* JADX WARN: Code duplicated, block: B:173:0x026c  */
    /* JADX WARN: Code duplicated, block: B:175:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0281  */
    /* JADX WARN: Code duplicated, block: B:178:0x0283  */
    /* JADX WARN: Code duplicated, block: B:180:0x0287  */
    /* JADX WARN: Code duplicated, block: B:182:0x029c  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:191:0x0387  */
    /* JADX WARN: Code duplicated, block: B:193:0x039c  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable qe qeVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.graphics.q3 q3VarA;
        int i20;
        androidx.compose.foundation.a1 a1Var2;
        int i21;
        int i22;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.foundation.interaction.j jVar2;
        final qe qeVar2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final androidx.compose.foundation.a1 a1Var3;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        final boolean z14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar3;
        int i31;
        int i32;
        qe qeVarB;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11;
        androidx.compose.ui.a0 a0Var5;
        Object objI0;
        int i33;
        boolean zK0;
        int i34;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(69602198);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c0VarR.k0(function0) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i10 & 3072) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.D(jVar)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            q3VarA = q3Var;
                            if ((i12 & 32) == 0 || !c0VarR.D(q3VarA)) {
                                i34 = 65536;
                            } else {
                                i34 = 131072;
                            }
                            i13 |= i34;
                        } else {
                            q3VarA = q3Var;
                        }
                        i20 = i12 & 64;
                        if (i20 != 0) {
                            i13 |= 1572864;
                            a1Var2 = a1Var;
                        } else {
                            a1Var2 = a1Var;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.D(a1Var2)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i13 |= i21;
                            }
                        }
                        if ((i10 & 12582912) == 0) {
                            if ((i12 & 128) != 0) {
                                i33 = 4194304;
                            } else {
                                if ((16777216 & i10) == 0) {
                                    zK0 = c0VarR.D(qeVar);
                                } else {
                                    zK0 = c0VarR.k0(qeVar);
                                }
                                if (zK0) {
                                    i33 = 8388608;
                                } else {
                                    i33 = 4194304;
                                }
                            }
                            i13 |= i33;
                        }
                        i22 = i12 & 256;
                        if (i22 != 0) {
                            i13 |= 100663296;
                            function5 = function2;
                        } else {
                            function5 = function2;
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.k0(function5)) {
                                    i23 = 67108864;
                                } else {
                                    i23 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i13 |= i23;
                            }
                        }
                        i24 = i12 & 512;
                        if (i24 != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c0VarR.k0(function3)) {
                                    i25 = 536870912;
                                } else {
                                    i25 = 268435456;
                                }
                                i13 |= i25;
                            }
                            i26 = i12 & 1024;
                            if (i26 != 0) {
                                i27 = i11 | 6;
                            } else if ((i11 & 6) == 0) {
                                if (c0VarR.k0(function4)) {
                                    i28 = 4;
                                } else {
                                    i28 = 2;
                                }
                                i27 = i11 | i28;
                            } else {
                                i27 = i11;
                            }
                            if ((i12 & 2048) != 0) {
                                if ((i11 & 48) == 0) {
                                    if (c0VarR.k0(nVar)) {
                                        i29 = 32;
                                    } else {
                                        i29 = 16;
                                    }
                                    i27 |= i29;
                                }
                                i30 = i27;
                                if ((i13 & 306783379) == 306783378 || (i30 & 19) != 18) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (c0VarR.h(z13, i13 & 1)) {
                                    c0VarR.l0();
                                    if ((i10 & 1) != 0 || c0VarR.y()) {
                                        if (i14 != 0) {
                                            a0Var4 = androidx.compose.ui.a0.E;
                                        } else {
                                            a0Var4 = a0Var2;
                                        }
                                        if (i16 != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = z12;
                                        }
                                        if (i18 != 0) {
                                            jVar3 = null;
                                        } else {
                                            jVar3 = jVar;
                                        }
                                        if ((i12 & 32) != 0) {
                                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                            i13 &= -458753;
                                        }
                                        i31 = i13;
                                        q3VarA = q3VarA;
                                        if (i20 != 0) {
                                            a1Var2 = null;
                                        } else {
                                            a1Var2 = a1Var2;
                                        }
                                        if ((i12 & 128) != 0) {
                                            i32 = i22;
                                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                            i31 &= -29360129;
                                        } else {
                                            i32 = i22;
                                            qeVarB = qeVar;
                                        }
                                        if (i32 != 0) {
                                            c0VarR = c0VarR;
                                            function5 = null;
                                        }
                                        if (i24 != 0) {
                                            function9 = null;
                                        } else {
                                            function9 = function3;
                                        }
                                        if (i26 != 0) {
                                            function10 = null;
                                        } else {
                                            function10 = function4;
                                        }
                                        function11 = function5;
                                        a0Var5 = a0Var4;
                                    } else {
                                        c0VarR.u();
                                        if ((i12 & 32) != 0) {
                                            i13 &= -458753;
                                        }
                                        if ((i12 & 128) != 0) {
                                            i13 &= -29360129;
                                        }
                                        jVar3 = jVar;
                                        function9 = function3;
                                        function10 = function4;
                                        i30 = i30;
                                        function11 = function5;
                                        a0Var5 = a0Var2;
                                        i31 = i13;
                                        qeVarB = qeVar;
                                    }
                                    c0VarR.Z();
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                    }
                                    int i35 = i31 << 3;
                                    int i36 = ((i31 >> 9) & 14) | (i35 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = qeVarB.c(z12, z10, c0VarR, i36);
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                                            }
                                        };
                                        c0VarR.Y(objI0);
                                    }
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function11;
                                    androidx.compose.ui.graphics.q3 q3Var3 = q3VarA;
                                    qe qeVar3 = qeVarB;
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function9;
                                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function10;
                                    boolean z15 = z12;
                                    androidx.compose.ui.a0 a0Var6 = a0Var5;
                                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z15, q3Var3, qeVarB.d(z12, z10, c0VarR, i36).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC, function12, z10, function13, function14, nVar, qeVar3, z15), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i35 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                    c0Var2 = c0VarR;
                                    if (androidx.compose.runtime.m0.l0()) {
                                        androidx.compose.runtime.m0.z0();
                                    }
                                    q3Var2 = q3Var3;
                                    a1Var3 = a1Var2;
                                    jVar2 = jVar3;
                                    qeVar2 = qeVar3;
                                    function8 = function12;
                                    function6 = function13;
                                    function7 = function14;
                                    z14 = z15;
                                    a0Var3 = a0Var6;
                                } else {
                                    c0Var2 = c0VarR;
                                    c0Var2.u();
                                    jVar2 = jVar;
                                    qeVar2 = qeVar;
                                    function6 = function3;
                                    function7 = function4;
                                    q3Var2 = q3VarA;
                                    a1Var3 = a1Var2;
                                    a0Var3 = a0Var2;
                                    function8 = function5;
                                    z14 = z12;
                                }
                                s5VarT = c0Var2.T();
                                if (s5VarT != null) {
                                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i27 |= 48;
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i37 = i31 << 3;
                                int i38 = ((i31 >> 9) & 14) | (i37 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC2 = qeVarB.c(z12, z10, c0VarR, i38);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function11;
                                androidx.compose.ui.graphics.q3 q3Var4 = q3VarA;
                                qe qeVar4 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function10;
                                boolean z16 = z12;
                                androidx.compose.ui.a0 a0Var7 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z16, q3Var4, qeVarB.d(z12, z10, c0VarR, i38).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC2.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC2, function15, z10, function16, function17, nVar, qeVar4, z16), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i37 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var4;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar4;
                                function8 = function15;
                                function6 = function16;
                                function7 = function17;
                                z14 = z16;
                                a0Var3 = a0Var7;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i29 = 32;
                                } else {
                                    i29 = 16;
                                }
                                i27 |= i29;
                            }
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i39 = i31 << 3;
                                int i310 = ((i31 >> 9) & 14) | (i39 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC3 = qeVarB.c(z12, z10, c0VarR, i310);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function11;
                                androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
                                qe qeVar5 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function10;
                                boolean z17 = z12;
                                androidx.compose.ui.a0 a0Var8 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z17, q3Var5, qeVarB.d(z12, z10, c0VarR, i310).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC3.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC3, function18, z10, function19, function110, nVar, qeVar5, z17), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i39 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var5;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar5;
                                function8 = function18;
                                function6 = function19;
                                function7 = function110;
                                z14 = z17;
                                a0Var3 = a0Var8;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 48;
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311 = i31 << 3;
                            int i312 = ((i31 >> 9) & 14) | (i311 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC4 = qeVarB.c(z12, z10, c0VarR, i312);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function11;
                            androidx.compose.ui.graphics.q3 q3Var6 = q3VarA;
                            qe qeVar6 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function113 = function10;
                            boolean z18 = z12;
                            androidx.compose.ui.a0 a0Var9 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z18, q3Var6, qeVarB.d(z12, z10, c0VarR, i312).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC4.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC4, function111, z10, function112, function113, nVar, qeVar6, z18), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var6;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar6;
                            function8 = function111;
                            function6 = function112;
                            function7 = function113;
                            z14 = z18;
                            a0Var3 = a0Var9;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 24576;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarA = q3Var;
                        if ((i12 & 32) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i13 |= i34;
                    } else {
                        q3VarA = q3Var;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        i13 |= 1572864;
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = a1Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(a1Var2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i12 & 128) != 0) {
                            i33 = 4194304;
                        } else {
                            if ((16777216 & i10) == 0) {
                                zK0 = c0VarR.D(qeVar);
                            } else {
                                zK0 = c0VarR.k0(qeVar);
                            }
                            if (zK0) {
                                i33 = 8388608;
                            } else {
                                i33 = 4194304;
                            }
                        }
                        i13 |= i33;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        function5 = function2;
                    } else {
                        function5 = function2;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function5)) {
                                i23 = 67108864;
                            } else {
                                i23 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function3)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i13 |= i25;
                        }
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i29 = 32;
                                } else {
                                    i29 = 16;
                                }
                                i27 |= i29;
                            }
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i313 = i31 << 3;
                                int i314 = ((i31 >> 9) & 14) | (i313 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC5 = qeVarB.c(z12, z10, c0VarR, i314);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function114 = function11;
                                androidx.compose.ui.graphics.q3 q3Var7 = q3VarA;
                                qe qeVar7 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function115 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function10;
                                boolean z19 = z12;
                                androidx.compose.ui.a0 a0Var10 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z19, q3Var7, qeVarB.d(z12, z10, c0VarR, i314).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC5.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC5, function114, z10, function115, function116, nVar, qeVar7, z19), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i313 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var7;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar7;
                                function8 = function114;
                                function6 = function115;
                                function7 = function116;
                                z14 = z19;
                                a0Var3 = a0Var10;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 48;
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i315 = i31 << 3;
                            int i316 = ((i31 >> 9) & 14) | (i315 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC6 = qeVarB.c(z12, z10, c0VarR, i316);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function117 = function11;
                            androidx.compose.ui.graphics.q3 q3Var8 = q3VarA;
                            qe qeVar8 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function118 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function119 = function10;
                            boolean z110 = z12;
                            androidx.compose.ui.a0 a0Var11 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z110, q3Var8, qeVarB.d(z12, z10, c0VarR, i316).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC6.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC6, function117, z10, function118, function119, nVar, qeVar8, z110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i315 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var8;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar8;
                            function8 = function117;
                            function6 = function118;
                            function7 = function119;
                            z14 = z110;
                            a0Var3 = a0Var11;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i317 = i31 << 3;
                            int i318 = ((i31 >> 9) & 14) | (i317 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC7 = qeVarB.c(z12, z10, c0VarR, i318);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1110 = function11;
                            androidx.compose.ui.graphics.q3 q3Var9 = q3VarA;
                            qe qeVar9 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1112 = function10;
                            boolean z111 = z12;
                            androidx.compose.ui.a0 a0Var12 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111, q3Var9, qeVarB.d(z12, z10, c0VarR, i318).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC7.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC7, function1110, z10, function1111, function1112, nVar, qeVar9, z111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i317 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var9;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar9;
                            function8 = function1110;
                            function6 = function1111;
                            function7 = function1112;
                            z14 = z111;
                            a0Var3 = a0Var12;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i319 = i31 << 3;
                        int i3110 = ((i31 >> 9) & 14) | (i319 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC8 = qeVarB.c(z12, z10, c0VarR, i3110);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1113 = function11;
                        androidx.compose.ui.graphics.q3 q3Var10 = q3VarA;
                        qe qeVar10 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1114 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1115 = function10;
                        boolean z112 = z12;
                        androidx.compose.ui.a0 a0Var13 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z112, q3Var10, qeVarB.d(z12, z10, c0VarR, i3110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC8.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC8, function1113, z10, function1114, function1115, nVar, qeVar10, z112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i319 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var10;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar10;
                        function8 = function1113;
                        function6 = function1114;
                        function7 = function1115;
                        z14 = z112;
                        a0Var3 = a0Var13;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                z12 = z11;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarA = q3Var;
                        if ((i12 & 32) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i13 |= i34;
                    } else {
                        q3VarA = q3Var;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        i13 |= 1572864;
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = a1Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(a1Var2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i12 & 128) != 0) {
                            i33 = 4194304;
                        } else {
                            if ((16777216 & i10) == 0) {
                                zK0 = c0VarR.D(qeVar);
                            } else {
                                zK0 = c0VarR.k0(qeVar);
                            }
                            if (zK0) {
                                i33 = 8388608;
                            } else {
                                i33 = 4194304;
                            }
                        }
                        i13 |= i33;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        function5 = function2;
                    } else {
                        function5 = function2;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function5)) {
                                i23 = 67108864;
                            } else {
                                i23 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function3)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i13 |= i25;
                        }
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i29 = 32;
                                } else {
                                    i29 = 16;
                                }
                                i27 |= i29;
                            }
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i3111 = i31 << 3;
                                int i3112 = ((i31 >> 9) & 14) | (i3111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC9 = qeVarB.c(z12, z10, c0VarR, i3112);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1116 = function11;
                                androidx.compose.ui.graphics.q3 q3Var11 = q3VarA;
                                qe qeVar11 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1117 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1118 = function10;
                                boolean z113 = z12;
                                androidx.compose.ui.a0 a0Var14 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z113, q3Var11, qeVarB.d(z12, z10, c0VarR, i3112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC9.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC9, function1116, z10, function1117, function1118, nVar, qeVar11, z113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var11;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar11;
                                function8 = function1116;
                                function6 = function1117;
                                function7 = function1118;
                                z14 = z113;
                                a0Var3 = a0Var14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 48;
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i3113 = i31 << 3;
                            int i3114 = ((i31 >> 9) & 14) | (i3113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC10 = qeVarB.c(z12, z10, c0VarR, i3114);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1119 = function11;
                            androidx.compose.ui.graphics.q3 q3Var12 = q3VarA;
                            qe qeVar12 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11110 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111 = function10;
                            boolean z114 = z12;
                            androidx.compose.ui.a0 a0Var15 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z114, q3Var12, qeVarB.d(z12, z10, c0VarR, i3114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC10.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC10, function1119, z10, function11110, function11111, nVar, qeVar12, z114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var12;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar12;
                            function8 = function1119;
                            function6 = function11110;
                            function7 = function11111;
                            z14 = z114;
                            a0Var3 = a0Var15;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i3115 = i31 << 3;
                            int i3116 = ((i31 >> 9) & 14) | (i3115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11 = qeVarB.c(z12, z10, c0VarR, i3116);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11112 = function11;
                            androidx.compose.ui.graphics.q3 q3Var13 = q3VarA;
                            qe qeVar13 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11113 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11114 = function10;
                            boolean z115 = z12;
                            androidx.compose.ui.a0 a0Var16 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z115, q3Var13, qeVarB.d(z12, z10, c0VarR, i3116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11, function11112, z10, function11113, function11114, nVar, qeVar13, z115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var13;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar13;
                            function8 = function11112;
                            function6 = function11113;
                            function7 = function11114;
                            z14 = z115;
                            a0Var3 = a0Var16;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3117 = i31 << 3;
                        int i3118 = ((i31 >> 9) & 14) | (i3117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC12 = qeVarB.c(z12, z10, c0VarR, i3118);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11115 = function11;
                        androidx.compose.ui.graphics.q3 q3Var14 = q3VarA;
                        qe qeVar14 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11116 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11117 = function10;
                        boolean z116 = z12;
                        androidx.compose.ui.a0 a0Var17 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z116, q3Var14, qeVarB.d(z12, z10, c0VarR, i3118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC12.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC12, function11115, z10, function11116, function11117, nVar, qeVar14, z116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var14;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar14;
                        function8 = function11115;
                        function6 = function11116;
                        function7 = function11117;
                        z14 = z116;
                        a0Var3 = a0Var17;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i3119 = i31 << 3;
                            int i31110 = ((i31 >> 9) & 14) | (i3119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC13 = qeVarB.c(z12, z10, c0VarR, i31110);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11118 = function11;
                            androidx.compose.ui.graphics.q3 q3Var15 = q3VarA;
                            qe qeVar15 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11119 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111110 = function10;
                            boolean z117 = z12;
                            androidx.compose.ui.a0 a0Var18 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z117, q3Var15, qeVarB.d(z12, z10, c0VarR, i31110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC13.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC13, function11118, z10, function11119, function111110, nVar, qeVar15, z117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var15;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar15;
                            function8 = function11118;
                            function6 = function11119;
                            function7 = function111110;
                            z14 = z117;
                            a0Var3 = a0Var18;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i31111 = i31 << 3;
                        int i31112 = ((i31 >> 9) & 14) | (i31111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC14 = qeVarB.c(z12, z10, c0VarR, i31112);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111 = function11;
                        androidx.compose.ui.graphics.q3 q3Var16 = q3VarA;
                        qe qeVar16 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111112 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111113 = function10;
                        boolean z118 = z12;
                        androidx.compose.ui.a0 a0Var19 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z118, q3Var16, qeVarB.d(z12, z10, c0VarR, i31112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC14.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC14, function111111, z10, function111112, function111113, nVar, qeVar16, z118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var16;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar16;
                        function8 = function111111;
                        function6 = function111112;
                        function7 = function111113;
                        z14 = z118;
                        a0Var3 = a0Var19;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i31113 = i31 << 3;
                        int i31114 = ((i31 >> 9) & 14) | (i31113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC15 = qeVarB.c(z12, z10, c0VarR, i31114);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111114 = function11;
                        androidx.compose.ui.graphics.q3 q3Var17 = q3VarA;
                        qe qeVar17 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111115 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111116 = function10;
                        boolean z119 = z12;
                        androidx.compose.ui.a0 a0Var110 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z119, q3Var17, qeVarB.d(z12, z10, c0VarR, i31114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC15.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC15, function111114, z10, function111115, function111116, nVar, qeVar17, z119), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var17;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar17;
                        function8 = function111114;
                        function6 = function111115;
                        function7 = function111116;
                        z14 = z119;
                        a0Var3 = a0Var110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31115 = i31 << 3;
                    int i31116 = ((i31 >> 9) & 14) | (i31115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC16 = qeVarB.c(z12, z10, c0VarR, i31116);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111117 = function11;
                    androidx.compose.ui.graphics.q3 q3Var18 = q3VarA;
                    qe qeVar18 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111118 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111119 = function10;
                    boolean z1110 = z12;
                    androidx.compose.ui.a0 a0Var111 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1110, q3Var18, qeVarB.d(z12, z10, c0VarR, i31116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC16.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC16, function111117, z10, function111118, function111119, nVar, qeVar18, z1110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var18;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar18;
                    function8 = function111117;
                    function6 = function111118;
                    function7 = function111119;
                    z14 = z1110;
                    a0Var3 = a0Var111;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarA = q3Var;
                        if ((i12 & 32) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i13 |= i34;
                    } else {
                        q3VarA = q3Var;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        i13 |= 1572864;
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = a1Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(a1Var2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i12 & 128) != 0) {
                            i33 = 4194304;
                        } else {
                            if ((16777216 & i10) == 0) {
                                zK0 = c0VarR.D(qeVar);
                            } else {
                                zK0 = c0VarR.k0(qeVar);
                            }
                            if (zK0) {
                                i33 = 8388608;
                            } else {
                                i33 = 4194304;
                            }
                        }
                        i13 |= i33;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        function5 = function2;
                    } else {
                        function5 = function2;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function5)) {
                                i23 = 67108864;
                            } else {
                                i23 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function3)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i13 |= i25;
                        }
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i29 = 32;
                                } else {
                                    i29 = 16;
                                }
                                i27 |= i29;
                            }
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i31117 = i31 << 3;
                                int i31118 = ((i31 >> 9) & 14) | (i31117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC17 = qeVarB.c(z12, z10, c0VarR, i31118);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111110 = function11;
                                androidx.compose.ui.graphics.q3 q3Var19 = q3VarA;
                                qe qeVar19 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111112 = function10;
                                boolean z1111 = z12;
                                androidx.compose.ui.a0 a0Var112 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111, q3Var19, qeVarB.d(z12, z10, c0VarR, i31118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC17.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC17, function1111110, z10, function1111111, function1111112, nVar, qeVar19, z1111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var19;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar19;
                                function8 = function1111110;
                                function6 = function1111111;
                                function7 = function1111112;
                                z14 = z1111;
                                a0Var3 = a0Var112;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 48;
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i31119 = i31 << 3;
                            int i311110 = ((i31 >> 9) & 14) | (i31119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC18 = qeVarB.c(z12, z10, c0VarR, i311110);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111113 = function11;
                            androidx.compose.ui.graphics.q3 q3Var110 = q3VarA;
                            qe qeVar110 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111114 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111115 = function10;
                            boolean z1112 = z12;
                            androidx.compose.ui.a0 a0Var113 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1112, q3Var110, qeVarB.d(z12, z10, c0VarR, i311110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC18.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC18, function1111113, z10, function1111114, function1111115, nVar, qeVar110, z1112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var110;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar110;
                            function8 = function1111113;
                            function6 = function1111114;
                            function7 = function1111115;
                            z14 = z1112;
                            a0Var3 = a0Var113;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311111 = i31 << 3;
                            int i311112 = ((i31 >> 9) & 14) | (i311111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC19 = qeVarB.c(z12, z10, c0VarR, i311112);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111116 = function11;
                            androidx.compose.ui.graphics.q3 q3Var111 = q3VarA;
                            qe qeVar111 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111117 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111118 = function10;
                            boolean z1113 = z12;
                            androidx.compose.ui.a0 a0Var114 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1113, q3Var111, qeVarB.d(z12, z10, c0VarR, i311112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC19.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC19, function1111116, z10, function1111117, function1111118, nVar, qeVar111, z1113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var111;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar111;
                            function8 = function1111116;
                            function6 = function1111117;
                            function7 = function1111118;
                            z14 = z1113;
                            a0Var3 = a0Var114;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311113 = i31 << 3;
                        int i311114 = ((i31 >> 9) & 14) | (i311113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC110 = qeVarB.c(z12, z10, c0VarR, i311114);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111119 = function11;
                        androidx.compose.ui.graphics.q3 q3Var112 = q3VarA;
                        qe qeVar112 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111110 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111 = function10;
                        boolean z1114 = z12;
                        androidx.compose.ui.a0 a0Var115 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1114, q3Var112, qeVarB.d(z12, z10, c0VarR, i311114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC110.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC110, function1111119, z10, function11111110, function11111111, nVar, qeVar112, z1114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var112;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar112;
                        function8 = function1111119;
                        function6 = function11111110;
                        function7 = function11111111;
                        z14 = z1114;
                        a0Var3 = a0Var115;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311115 = i31 << 3;
                            int i311116 = ((i31 >> 9) & 14) | (i311115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111 = qeVarB.c(z12, z10, c0VarR, i311116);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111112 = function11;
                            androidx.compose.ui.graphics.q3 q3Var113 = q3VarA;
                            qe qeVar113 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111113 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111114 = function10;
                            boolean z1115 = z12;
                            androidx.compose.ui.a0 a0Var116 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1115, q3Var113, qeVarB.d(z12, z10, c0VarR, i311116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111, function11111112, z10, function11111113, function11111114, nVar, qeVar113, z1115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var113;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar113;
                            function8 = function11111112;
                            function6 = function11111113;
                            function7 = function11111114;
                            z14 = z1115;
                            a0Var3 = a0Var116;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311117 = i31 << 3;
                        int i311118 = ((i31 >> 9) & 14) | (i311117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC112 = qeVarB.c(z12, z10, c0VarR, i311118);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111115 = function11;
                        androidx.compose.ui.graphics.q3 q3Var114 = q3VarA;
                        qe qeVar114 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111116 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111117 = function10;
                        boolean z1116 = z12;
                        androidx.compose.ui.a0 a0Var117 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1116, q3Var114, qeVarB.d(z12, z10, c0VarR, i311118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC112.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC112, function11111115, z10, function11111116, function11111117, nVar, qeVar114, z1116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var114;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar114;
                        function8 = function11111115;
                        function6 = function11111116;
                        function7 = function11111117;
                        z14 = z1116;
                        a0Var3 = a0Var117;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311119 = i31 << 3;
                        int i3111110 = ((i31 >> 9) & 14) | (i311119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC113 = qeVarB.c(z12, z10, c0VarR, i3111110);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111118 = function11;
                        androidx.compose.ui.graphics.q3 q3Var115 = q3VarA;
                        qe qeVar115 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111119 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111110 = function10;
                        boolean z1117 = z12;
                        androidx.compose.ui.a0 a0Var118 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1117, q3Var115, qeVarB.d(z12, z10, c0VarR, i3111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC113.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC113, function11111118, z10, function11111119, function111111110, nVar, qeVar115, z1117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var115;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar115;
                        function8 = function11111118;
                        function6 = function11111119;
                        function7 = function111111110;
                        z14 = z1117;
                        a0Var3 = a0Var118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111111 = i31 << 3;
                    int i3111112 = ((i31 >> 9) & 14) | (i3111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC114 = qeVarB.c(z12, z10, c0VarR, i3111112);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111 = function11;
                    androidx.compose.ui.graphics.q3 q3Var116 = q3VarA;
                    qe qeVar116 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111112 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111113 = function10;
                    boolean z1118 = z12;
                    androidx.compose.ui.a0 a0Var119 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1118, q3Var116, qeVarB.d(z12, z10, c0VarR, i3111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC114.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC114, function111111111, z10, function111111112, function111111113, nVar, qeVar116, z1118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var116;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar116;
                    function8 = function111111111;
                    function6 = function111111112;
                    function7 = function111111113;
                    z14 = z1118;
                    a0Var3 = a0Var119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z12 = z11;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i3111113 = i31 << 3;
                            int i3111114 = ((i31 >> 9) & 14) | (i3111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC115 = qeVarB.c(z12, z10, c0VarR, i3111114);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111114 = function11;
                            androidx.compose.ui.graphics.q3 q3Var117 = q3VarA;
                            qe qeVar117 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111115 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111116 = function10;
                            boolean z1119 = z12;
                            androidx.compose.ui.a0 a0Var1110 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1119, q3Var117, qeVarB.d(z12, z10, c0VarR, i3111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC115.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC115, function111111114, z10, function111111115, function111111116, nVar, qeVar117, z1119), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var117;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar117;
                            function8 = function111111114;
                            function6 = function111111115;
                            function7 = function111111116;
                            z14 = z1119;
                            a0Var3 = a0Var1110;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111115 = i31 << 3;
                        int i3111116 = ((i31 >> 9) & 14) | (i3111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC116 = qeVarB.c(z12, z10, c0VarR, i3111116);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111117 = function11;
                        androidx.compose.ui.graphics.q3 q3Var118 = q3VarA;
                        qe qeVar118 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111118 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111119 = function10;
                        boolean z11110 = z12;
                        androidx.compose.ui.a0 a0Var1111 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11110, q3Var118, qeVarB.d(z12, z10, c0VarR, i3111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC116.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC116, function111111117, z10, function111111118, function111111119, nVar, qeVar118, z11110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var118;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar118;
                        function8 = function111111117;
                        function6 = function111111118;
                        function7 = function111111119;
                        z14 = z11110;
                        a0Var3 = a0Var1111;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111117 = i31 << 3;
                        int i3111118 = ((i31 >> 9) & 14) | (i3111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC117 = qeVarB.c(z12, z10, c0VarR, i3111118);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111110 = function11;
                        androidx.compose.ui.graphics.q3 q3Var119 = q3VarA;
                        qe qeVar119 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111112 = function10;
                        boolean z11111 = z12;
                        androidx.compose.ui.a0 a0Var1112 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111, q3Var119, qeVarB.d(z12, z10, c0VarR, i3111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC117.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC117, function1111111110, z10, function1111111111, function1111111112, nVar, qeVar119, z11111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var119;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar119;
                        function8 = function1111111110;
                        function6 = function1111111111;
                        function7 = function1111111112;
                        z14 = z11111;
                        a0Var3 = a0Var1112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111119 = i31 << 3;
                    int i31111110 = ((i31 >> 9) & 14) | (i3111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC118 = qeVarB.c(z12, z10, c0VarR, i31111110);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111113 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1110 = q3VarA;
                    qe qeVar1110 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111114 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111115 = function10;
                    boolean z11112 = z12;
                    androidx.compose.ui.a0 a0Var1113 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11112, q3Var1110, qeVarB.d(z12, z10, c0VarR, i31111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC118.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC118, function1111111113, z10, function1111111114, function1111111115, nVar, qeVar1110, z11112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1110;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1110;
                    function8 = function1111111113;
                    function6 = function1111111114;
                    function7 = function1111111115;
                    z14 = z11112;
                    a0Var3 = a0Var1113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarA = q3Var;
                if ((i12 & 32) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i13 |= i34;
            } else {
                q3VarA = q3Var;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                a1Var2 = a1Var;
            } else {
                a1Var2 = a1Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) != 0) {
                    i33 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(qeVar);
                    } else {
                        zK0 = c0VarR.k0(qeVar);
                    }
                    if (zK0) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                i13 |= i33;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                function5 = function2;
            } else {
                function5 = function2;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function5)) {
                        i23 = 67108864;
                    } else {
                        i23 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i31111111 = i31 << 3;
                        int i31111112 = ((i31 >> 9) & 14) | (i31111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC119 = qeVarB.c(z12, z10, c0VarR, i31111112);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111116 = function11;
                        androidx.compose.ui.graphics.q3 q3Var1111 = q3VarA;
                        qe qeVar1111 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111117 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111118 = function10;
                        boolean z11113 = z12;
                        androidx.compose.ui.a0 a0Var1114 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11113, q3Var1111, qeVarB.d(z12, z10, c0VarR, i31111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC119.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC119, function1111111116, z10, function1111111117, function1111111118, nVar, qeVar1111, z11113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var1111;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar1111;
                        function8 = function1111111116;
                        function6 = function1111111117;
                        function7 = function1111111118;
                        z14 = z11113;
                        a0Var3 = a0Var1114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111113 = i31 << 3;
                    int i31111114 = ((i31 >> 9) & 14) | (i31111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1110 = qeVarB.c(z12, z10, c0VarR, i31111114);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111119 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1112 = q3VarA;
                    qe qeVar1112 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111110 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111 = function10;
                    boolean z11114 = z12;
                    androidx.compose.ui.a0 a0Var1115 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11114, q3Var1112, qeVarB.d(z12, z10, c0VarR, i31111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1110.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1110, function1111111119, z10, function11111111110, function11111111111, nVar, qeVar1112, z11114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1112;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1112;
                    function8 = function1111111119;
                    function6 = function11111111110;
                    function7 = function11111111111;
                    z14 = z11114;
                    a0Var3 = a0Var1115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i27 |= i29;
                }
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111115 = i31 << 3;
                    int i31111116 = ((i31 >> 9) & 14) | (i31111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111 = qeVarB.c(z12, z10, c0VarR, i31111116);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111112 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1113 = q3VarA;
                    qe qeVar1113 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111113 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111114 = function10;
                    boolean z11115 = z12;
                    androidx.compose.ui.a0 a0Var1116 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11115, q3Var1113, qeVarB.d(z12, z10, c0VarR, i31111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111, function11111111112, z10, function11111111113, function11111111114, nVar, qeVar1113, z11115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1113;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1113;
                    function8 = function11111111112;
                    function6 = function11111111113;
                    function7 = function11111111114;
                    z14 = z11115;
                    a0Var3 = a0Var1116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 48;
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i31111117 = i31 << 3;
                int i31111118 = ((i31 >> 9) & 14) | (i31111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1112 = qeVarB.c(z12, z10, c0VarR, i31111118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111115 = function11;
                androidx.compose.ui.graphics.q3 q3Var1114 = q3VarA;
                qe qeVar1114 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111116 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111117 = function10;
                boolean z11116 = z12;
                androidx.compose.ui.a0 a0Var1117 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11116, q3Var1114, qeVarB.d(z12, z10, c0VarR, i31111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1112.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1112, function11111111115, z10, function11111111116, function11111111117, nVar, qeVar1114, z11116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var1114;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar1114;
                function8 = function11111111115;
                function6 = function11111111116;
                function7 = function11111111117;
                z14 = z11116;
                a0Var3 = a0Var1117;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarA = q3Var;
                        if ((i12 & 32) == 0) {
                            i34 = 65536;
                        } else {
                            i34 = 65536;
                        }
                        i13 |= i34;
                    } else {
                        q3VarA = q3Var;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        i13 |= 1572864;
                        a1Var2 = a1Var;
                    } else {
                        a1Var2 = a1Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(a1Var2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i12 & 128) != 0) {
                            i33 = 4194304;
                        } else {
                            if ((16777216 & i10) == 0) {
                                zK0 = c0VarR.D(qeVar);
                            } else {
                                zK0 = c0VarR.k0(qeVar);
                            }
                            if (zK0) {
                                i33 = 8388608;
                            } else {
                                i33 = 4194304;
                            }
                        }
                        i13 |= i33;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        function5 = function2;
                    } else {
                        function5 = function2;
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function5)) {
                                i23 = 67108864;
                            } else {
                                i23 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function3)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i13 |= i25;
                        }
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.k0(function4)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            if ((i11 & 48) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i29 = 32;
                                } else {
                                    i29 = 16;
                                }
                                i27 |= i29;
                            }
                            i30 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (c0VarR.h(z13, i13 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0) {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                } else {
                                    if (i14 != 0) {
                                        a0Var4 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var4 = a0Var2;
                                    }
                                    if (i16 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = z12;
                                    }
                                    if (i18 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if ((i12 & 32) != 0) {
                                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                        i13 &= -458753;
                                    }
                                    i31 = i13;
                                    q3VarA = q3VarA;
                                    if (i20 != 0) {
                                        a1Var2 = null;
                                    } else {
                                        a1Var2 = a1Var2;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i32 = i22;
                                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                        i31 &= -29360129;
                                    } else {
                                        i32 = i22;
                                        qeVarB = qeVar;
                                    }
                                    if (i32 != 0) {
                                        c0VarR = c0VarR;
                                        function5 = null;
                                    }
                                    if (i24 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function3;
                                    }
                                    if (i26 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function4;
                                    }
                                    function11 = function5;
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                }
                                int i31111119 = i31 << 3;
                                int i311111110 = ((i31 >> 9) & 14) | (i31111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1113 = qeVarB.c(z12, z10, c0VarR, i311111110);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111118 = function11;
                                androidx.compose.ui.graphics.q3 q3Var1115 = q3VarA;
                                qe qeVar1115 = qeVarB;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111119 = function9;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111110 = function10;
                                boolean z11117 = z12;
                                androidx.compose.ui.a0 a0Var1118 = a0Var5;
                                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11117, q3Var1115, qeVarB.d(z12, z10, c0VarR, i311111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1113.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1113, function11111111118, z10, function11111111119, function111111111110, nVar, qeVar1115, z11117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                                c0Var2 = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                q3Var2 = q3Var1115;
                                a1Var3 = a1Var2;
                                jVar2 = jVar3;
                                qeVar2 = qeVar1115;
                                function8 = function11111111118;
                                function6 = function11111111119;
                                function7 = function111111111110;
                                z14 = z11117;
                                a0Var3 = a0Var1118;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                jVar2 = jVar;
                                qeVar2 = qeVar;
                                function6 = function3;
                                function7 = function4;
                                q3Var2 = q3VarA;
                                a1Var3 = a1Var2;
                                a0Var3 = a0Var2;
                                function8 = function5;
                                z14 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 48;
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311111111 = i31 << 3;
                            int i311111112 = ((i31 >> 9) & 14) | (i311111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1114 = qeVarB.c(z12, z10, c0VarR, i311111112);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111 = function11;
                            androidx.compose.ui.graphics.q3 q3Var1116 = q3VarA;
                            qe qeVar1116 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111112 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111113 = function10;
                            boolean z11118 = z12;
                            androidx.compose.ui.a0 a0Var1119 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11118, q3Var1116, qeVarB.d(z12, z10, c0VarR, i311111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1114.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1114, function111111111111, z10, function111111111112, function111111111113, nVar, qeVar1116, z11118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var1116;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar1116;
                            function8 = function111111111111;
                            function6 = function111111111112;
                            function7 = function111111111113;
                            z14 = z11118;
                            a0Var3 = a0Var1119;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311111113 = i31 << 3;
                            int i311111114 = ((i31 >> 9) & 14) | (i311111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1115 = qeVarB.c(z12, z10, c0VarR, i311111114);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111114 = function11;
                            androidx.compose.ui.graphics.q3 q3Var1117 = q3VarA;
                            qe qeVar1117 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111115 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111116 = function10;
                            boolean z11119 = z12;
                            androidx.compose.ui.a0 a0Var11110 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11119, q3Var1117, qeVarB.d(z12, z10, c0VarR, i311111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1115.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1115, function111111111114, z10, function111111111115, function111111111116, nVar, qeVar1117, z11119), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var1117;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar1117;
                            function8 = function111111111114;
                            function6 = function111111111115;
                            function7 = function111111111116;
                            z14 = z11119;
                            a0Var3 = a0Var11110;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311111115 = i31 << 3;
                        int i311111116 = ((i31 >> 9) & 14) | (i311111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1116 = qeVarB.c(z12, z10, c0VarR, i311111116);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111117 = function11;
                        androidx.compose.ui.graphics.q3 q3Var1118 = q3VarA;
                        qe qeVar1118 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111118 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111119 = function10;
                        boolean z111110 = z12;
                        androidx.compose.ui.a0 a0Var11111 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111110, q3Var1118, qeVarB.d(z12, z10, c0VarR, i311111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1116.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1116, function111111111117, z10, function111111111118, function111111111119, nVar, qeVar1118, z111110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var1118;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar1118;
                        function8 = function111111111117;
                        function6 = function111111111118;
                        function7 = function111111111119;
                        z14 = z111110;
                        a0Var3 = a0Var11111;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311111117 = i31 << 3;
                            int i311111118 = ((i31 >> 9) & 14) | (i311111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1117 = qeVarB.c(z12, z10, c0VarR, i311111118);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111110 = function11;
                            androidx.compose.ui.graphics.q3 q3Var1119 = q3VarA;
                            qe qeVar1119 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111112 = function10;
                            boolean z111111 = z12;
                            androidx.compose.ui.a0 a0Var11112 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111111, q3Var1119, qeVarB.d(z12, z10, c0VarR, i311111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1117.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1117, function1111111111110, z10, function1111111111111, function1111111111112, nVar, qeVar1119, z111111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var1119;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar1119;
                            function8 = function1111111111110;
                            function6 = function1111111111111;
                            function7 = function1111111111112;
                            z14 = z111111;
                            a0Var3 = a0Var11112;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311111119 = i31 << 3;
                        int i3111111110 = ((i31 >> 9) & 14) | (i311111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1118 = qeVarB.c(z12, z10, c0VarR, i3111111110);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111113 = function11;
                        androidx.compose.ui.graphics.q3 q3Var11110 = q3VarA;
                        qe qeVar11110 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111114 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111115 = function10;
                        boolean z111112 = z12;
                        androidx.compose.ui.a0 a0Var11113 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111112, q3Var11110, qeVarB.d(z12, z10, c0VarR, i3111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1118.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1118, function1111111111113, z10, function1111111111114, function1111111111115, nVar, qeVar11110, z111112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var11110;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar11110;
                        function8 = function1111111111113;
                        function6 = function1111111111114;
                        function7 = function1111111111115;
                        z14 = z111112;
                        a0Var3 = a0Var11113;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111111111 = i31 << 3;
                        int i3111111112 = ((i31 >> 9) & 14) | (i3111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1119 = qeVarB.c(z12, z10, c0VarR, i3111111112);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111116 = function11;
                        androidx.compose.ui.graphics.q3 q3Var11111 = q3VarA;
                        qe qeVar11111 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111117 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111118 = function10;
                        boolean z111113 = z12;
                        androidx.compose.ui.a0 a0Var11114 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111113, q3Var11111, qeVarB.d(z12, z10, c0VarR, i3111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1119.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1119, function1111111111116, z10, function1111111111117, function1111111111118, nVar, qeVar11111, z111113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var11111;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar11111;
                        function8 = function1111111111116;
                        function6 = function1111111111117;
                        function7 = function1111111111118;
                        z14 = z111113;
                        a0Var3 = a0Var11114;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111111113 = i31 << 3;
                    int i3111111114 = ((i31 >> 9) & 14) | (i3111111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11110 = qeVarB.c(z12, z10, c0VarR, i3111111114);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111119 = function11;
                    androidx.compose.ui.graphics.q3 q3Var11112 = q3VarA;
                    qe qeVar11112 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111110 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111 = function10;
                    boolean z111114 = z12;
                    androidx.compose.ui.a0 a0Var11115 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111114, q3Var11112, qeVarB.d(z12, z10, c0VarR, i3111111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11110.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11110, function1111111111119, z10, function11111111111110, function11111111111111, nVar, qeVar11112, z111114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var11112;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar11112;
                    function8 = function1111111111119;
                    function6 = function11111111111110;
                    function7 = function11111111111111;
                    z14 = z111114;
                    a0Var3 = a0Var11115;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z12 = z11;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i3111111115 = i31 << 3;
                            int i3111111116 = ((i31 >> 9) & 14) | (i3111111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11111 = qeVarB.c(z12, z10, c0VarR, i3111111116);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111112 = function11;
                            androidx.compose.ui.graphics.q3 q3Var11113 = q3VarA;
                            qe qeVar11113 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111113 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111114 = function10;
                            boolean z111115 = z12;
                            androidx.compose.ui.a0 a0Var11116 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111115, q3Var11113, qeVarB.d(z12, z10, c0VarR, i3111111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11111.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11111, function11111111111112, z10, function11111111111113, function11111111111114, nVar, qeVar11113, z111115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var11113;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar11113;
                            function8 = function11111111111112;
                            function6 = function11111111111113;
                            function7 = function11111111111114;
                            z14 = z111115;
                            a0Var3 = a0Var11116;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111111117 = i31 << 3;
                        int i3111111118 = ((i31 >> 9) & 14) | (i3111111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11112 = qeVarB.c(z12, z10, c0VarR, i3111111118);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111115 = function11;
                        androidx.compose.ui.graphics.q3 q3Var11114 = q3VarA;
                        qe qeVar11114 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111116 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111117 = function10;
                        boolean z111116 = z12;
                        androidx.compose.ui.a0 a0Var11117 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111116, q3Var11114, qeVarB.d(z12, z10, c0VarR, i3111111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11112.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11112, function11111111111115, z10, function11111111111116, function11111111111117, nVar, qeVar11114, z111116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var11114;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar11114;
                        function8 = function11111111111115;
                        function6 = function11111111111116;
                        function7 = function11111111111117;
                        z14 = z111116;
                        a0Var3 = a0Var11117;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111111119 = i31 << 3;
                        int i31111111110 = ((i31 >> 9) & 14) | (i3111111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11113 = qeVarB.c(z12, z10, c0VarR, i31111111110);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111118 = function11;
                        androidx.compose.ui.graphics.q3 q3Var11115 = q3VarA;
                        qe qeVar11115 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111119 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111110 = function10;
                        boolean z111117 = z12;
                        androidx.compose.ui.a0 a0Var11118 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111117, q3Var11115, qeVarB.d(z12, z10, c0VarR, i31111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11113.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11113, function11111111111118, z10, function11111111111119, function111111111111110, nVar, qeVar11115, z111117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var11115;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar11115;
                        function8 = function11111111111118;
                        function6 = function11111111111119;
                        function7 = function111111111111110;
                        z14 = z111117;
                        a0Var3 = a0Var11118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111111111 = i31 << 3;
                    int i31111111112 = ((i31 >> 9) & 14) | (i31111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11114 = qeVarB.c(z12, z10, c0VarR, i31111111112);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111 = function11;
                    androidx.compose.ui.graphics.q3 q3Var11116 = q3VarA;
                    qe qeVar11116 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111112 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111113 = function10;
                    boolean z111118 = z12;
                    androidx.compose.ui.a0 a0Var11119 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111118, q3Var11116, qeVarB.d(z12, z10, c0VarR, i31111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11114.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11114, function111111111111111, z10, function111111111111112, function111111111111113, nVar, qeVar11116, z111118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var11116;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar11116;
                    function8 = function111111111111111;
                    function6 = function111111111111112;
                    function7 = function111111111111113;
                    z14 = z111118;
                    a0Var3 = a0Var11119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarA = q3Var;
                if ((i12 & 32) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i13 |= i34;
            } else {
                q3VarA = q3Var;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                a1Var2 = a1Var;
            } else {
                a1Var2 = a1Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) != 0) {
                    i33 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(qeVar);
                    } else {
                        zK0 = c0VarR.k0(qeVar);
                    }
                    if (zK0) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                i13 |= i33;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                function5 = function2;
            } else {
                function5 = function2;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function5)) {
                        i23 = 67108864;
                    } else {
                        i23 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i31111111113 = i31 << 3;
                        int i31111111114 = ((i31 >> 9) & 14) | (i31111111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11115 = qeVarB.c(z12, z10, c0VarR, i31111111114);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111114 = function11;
                        androidx.compose.ui.graphics.q3 q3Var11117 = q3VarA;
                        qe qeVar11117 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111115 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111116 = function10;
                        boolean z111119 = z12;
                        androidx.compose.ui.a0 a0Var111110 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z111119, q3Var11117, qeVarB.d(z12, z10, c0VarR, i31111111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11115.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11115, function111111111111114, z10, function111111111111115, function111111111111116, nVar, qeVar11117, z111119), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var11117;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar11117;
                        function8 = function111111111111114;
                        function6 = function111111111111115;
                        function7 = function111111111111116;
                        z14 = z111119;
                        a0Var3 = a0Var111110;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111111115 = i31 << 3;
                    int i31111111116 = ((i31 >> 9) & 14) | (i31111111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11116 = qeVarB.c(z12, z10, c0VarR, i31111111116);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111117 = function11;
                    androidx.compose.ui.graphics.q3 q3Var11118 = q3VarA;
                    qe qeVar11118 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111118 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111119 = function10;
                    boolean z1111110 = z12;
                    androidx.compose.ui.a0 a0Var111111 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111110, q3Var11118, qeVarB.d(z12, z10, c0VarR, i31111111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11116.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11116, function111111111111117, z10, function111111111111118, function111111111111119, nVar, qeVar11118, z1111110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var11118;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar11118;
                    function8 = function111111111111117;
                    function6 = function111111111111118;
                    function7 = function111111111111119;
                    z14 = z1111110;
                    a0Var3 = a0Var111111;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i27 |= i29;
                }
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111111117 = i31 << 3;
                    int i31111111118 = ((i31 >> 9) & 14) | (i31111111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11117 = qeVarB.c(z12, z10, c0VarR, i31111111118);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111110 = function11;
                    androidx.compose.ui.graphics.q3 q3Var11119 = q3VarA;
                    qe qeVar11119 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111112 = function10;
                    boolean z1111111 = z12;
                    androidx.compose.ui.a0 a0Var111112 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111111, q3Var11119, qeVarB.d(z12, z10, c0VarR, i31111111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11117.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11117, function1111111111111110, z10, function1111111111111111, function1111111111111112, nVar, qeVar11119, z1111111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var11119;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar11119;
                    function8 = function1111111111111110;
                    function6 = function1111111111111111;
                    function7 = function1111111111111112;
                    z14 = z1111111;
                    a0Var3 = a0Var111112;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 48;
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i31111111119 = i31 << 3;
                int i311111111110 = ((i31 >> 9) & 14) | (i31111111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11118 = qeVarB.c(z12, z10, c0VarR, i311111111110);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111113 = function11;
                androidx.compose.ui.graphics.q3 q3Var111110 = q3VarA;
                qe qeVar111110 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111114 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111115 = function10;
                boolean z1111112 = z12;
                androidx.compose.ui.a0 a0Var111113 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111112, q3Var111110, qeVarB.d(z12, z10, c0VarR, i311111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11118.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11118, function1111111111111113, z10, function1111111111111114, function1111111111111115, nVar, qeVar111110, z1111112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var111110;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar111110;
                function8 = function1111111111111113;
                function6 = function1111111111111114;
                function7 = function1111111111111115;
                z14 = z1111112;
                a0Var3 = a0Var111113;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarA = q3Var;
                    if ((i12 & 32) == 0) {
                        i34 = 65536;
                    } else {
                        i34 = 65536;
                    }
                    i13 |= i34;
                } else {
                    q3VarA = q3Var;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    a1Var2 = a1Var;
                } else {
                    a1Var2 = a1Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) != 0) {
                        i33 = 4194304;
                    } else {
                        if ((16777216 & i10) == 0) {
                            zK0 = c0VarR.D(qeVar);
                        } else {
                            zK0 = c0VarR.k0(qeVar);
                        }
                        if (zK0) {
                            i33 = 8388608;
                        } else {
                            i33 = 4194304;
                        }
                    }
                    i13 |= i33;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    function5 = function2;
                } else {
                    function5 = function2;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function5)) {
                            i23 = 67108864;
                        } else {
                            i23 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function4)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i29 = 32;
                            } else {
                                i29 = 16;
                            }
                            i27 |= i29;
                        }
                        i30 = i27;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c0VarR.h(z13, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            } else {
                                if (i14 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if ((i12 & 32) != 0) {
                                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                    i13 &= -458753;
                                }
                                i31 = i13;
                                q3VarA = q3VarA;
                                if (i20 != 0) {
                                    a1Var2 = null;
                                } else {
                                    a1Var2 = a1Var2;
                                }
                                if ((i12 & 128) != 0) {
                                    i32 = i22;
                                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                    i31 &= -29360129;
                                } else {
                                    i32 = i22;
                                    qeVarB = qeVar;
                                }
                                if (i32 != 0) {
                                    c0VarR = c0VarR;
                                    function5 = null;
                                }
                                if (i24 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function3;
                                }
                                if (i26 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function4;
                                }
                                function11 = function5;
                                a0Var5 = a0Var4;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                            }
                            int i311111111111 = i31 << 3;
                            int i311111111112 = ((i31 >> 9) & 14) | (i311111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC11119 = qeVarB.c(z12, z10, c0VarR, i311111111112);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.g4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111116 = function11;
                            androidx.compose.ui.graphics.q3 q3Var111111 = q3VarA;
                            qe qeVar111111 = qeVarB;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111117 = function9;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111118 = function10;
                            boolean z1111113 = z12;
                            androidx.compose.ui.a0 a0Var111114 = a0Var5;
                            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111113, q3Var111111, qeVarB.d(z12, z10, c0VarR, i311111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC11119.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC11119, function1111111111111116, z10, function1111111111111117, function1111111111111118, nVar, qeVar111111, z1111113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var2 = q3Var111111;
                            a1Var3 = a1Var2;
                            jVar2 = jVar3;
                            qeVar2 = qeVar111111;
                            function8 = function1111111111111116;
                            function6 = function1111111111111117;
                            function7 = function1111111111111118;
                            z14 = z1111113;
                            a0Var3 = a0Var111114;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            jVar2 = jVar;
                            qeVar2 = qeVar;
                            function6 = function3;
                            function7 = function4;
                            q3Var2 = q3VarA;
                            a1Var3 = a1Var2;
                            a0Var3 = a0Var2;
                            function8 = function5;
                            z14 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 48;
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311111111113 = i31 << 3;
                        int i311111111114 = ((i31 >> 9) & 14) | (i311111111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111110 = qeVarB.c(z12, z10, c0VarR, i311111111114);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111119 = function11;
                        androidx.compose.ui.graphics.q3 q3Var111112 = q3VarA;
                        qe qeVar111112 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111110 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111 = function10;
                        boolean z1111114 = z12;
                        androidx.compose.ui.a0 a0Var111115 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111114, q3Var111112, qeVarB.d(z12, z10, c0VarR, i311111111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111110.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111110, function1111111111111119, z10, function11111111111111110, function11111111111111111, nVar, qeVar111112, z1111114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var111112;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar111112;
                        function8 = function1111111111111119;
                        function6 = function11111111111111110;
                        function7 = function11111111111111111;
                        z14 = z1111114;
                        a0Var3 = a0Var111115;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311111111115 = i31 << 3;
                        int i311111111116 = ((i31 >> 9) & 14) | (i311111111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111111 = qeVarB.c(z12, z10, c0VarR, i311111111116);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111112 = function11;
                        androidx.compose.ui.graphics.q3 q3Var111113 = q3VarA;
                        qe qeVar111113 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111113 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111114 = function10;
                        boolean z1111115 = z12;
                        androidx.compose.ui.a0 a0Var111116 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111115, q3Var111113, qeVarB.d(z12, z10, c0VarR, i311111111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111111.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111111, function11111111111111112, z10, function11111111111111113, function11111111111111114, nVar, qeVar111113, z1111115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var111113;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar111113;
                        function8 = function11111111111111112;
                        function6 = function11111111111111113;
                        function7 = function11111111111111114;
                        z14 = z1111115;
                        a0Var3 = a0Var111116;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i311111111117 = i31 << 3;
                    int i311111111118 = ((i31 >> 9) & 14) | (i311111111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111112 = qeVarB.c(z12, z10, c0VarR, i311111111118);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111115 = function11;
                    androidx.compose.ui.graphics.q3 q3Var111114 = q3VarA;
                    qe qeVar111114 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111116 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111117 = function10;
                    boolean z1111116 = z12;
                    androidx.compose.ui.a0 a0Var111117 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111116, q3Var111114, qeVarB.d(z12, z10, c0VarR, i311111111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111112.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111112, function11111111111111115, z10, function11111111111111116, function11111111111111117, nVar, qeVar111114, z1111116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var111114;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar111114;
                    function8 = function11111111111111115;
                    function6 = function11111111111111116;
                    function7 = function11111111111111117;
                    z14 = z1111116;
                    a0Var3 = a0Var111117;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarA = q3Var;
                if ((i12 & 32) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i13 |= i34;
            } else {
                q3VarA = q3Var;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                a1Var2 = a1Var;
            } else {
                a1Var2 = a1Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) != 0) {
                    i33 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(qeVar);
                    } else {
                        zK0 = c0VarR.k0(qeVar);
                    }
                    if (zK0) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                i13 |= i33;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                function5 = function2;
            } else {
                function5 = function2;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function5)) {
                        i23 = 67108864;
                    } else {
                        i23 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i311111111119 = i31 << 3;
                        int i3111111111110 = ((i31 >> 9) & 14) | (i311111111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111113 = qeVarB.c(z12, z10, c0VarR, i3111111111110);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111118 = function11;
                        androidx.compose.ui.graphics.q3 q3Var111115 = q3VarA;
                        qe qeVar111115 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111119 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111110 = function10;
                        boolean z1111117 = z12;
                        androidx.compose.ui.a0 a0Var111118 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111117, q3Var111115, qeVarB.d(z12, z10, c0VarR, i3111111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111113.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111113, function11111111111111118, z10, function11111111111111119, function111111111111111110, nVar, qeVar111115, z1111117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var111115;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar111115;
                        function8 = function11111111111111118;
                        function6 = function11111111111111119;
                        function7 = function111111111111111110;
                        z14 = z1111117;
                        a0Var3 = a0Var111118;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111111111111 = i31 << 3;
                    int i3111111111112 = ((i31 >> 9) & 14) | (i3111111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111114 = qeVarB.c(z12, z10, c0VarR, i3111111111112);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111111 = function11;
                    androidx.compose.ui.graphics.q3 q3Var111116 = q3VarA;
                    qe qeVar111116 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111112 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111113 = function10;
                    boolean z1111118 = z12;
                    androidx.compose.ui.a0 a0Var111119 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111118, q3Var111116, qeVarB.d(z12, z10, c0VarR, i3111111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111114.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111114, function111111111111111111, z10, function111111111111111112, function111111111111111113, nVar, qeVar111116, z1111118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var111116;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar111116;
                    function8 = function111111111111111111;
                    function6 = function111111111111111112;
                    function7 = function111111111111111113;
                    z14 = z1111118;
                    a0Var3 = a0Var111119;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i27 |= i29;
                }
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111111111113 = i31 << 3;
                    int i3111111111114 = ((i31 >> 9) & 14) | (i3111111111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111115 = qeVarB.c(z12, z10, c0VarR, i3111111111114);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111114 = function11;
                    androidx.compose.ui.graphics.q3 q3Var111117 = q3VarA;
                    qe qeVar111117 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111115 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111116 = function10;
                    boolean z1111119 = z12;
                    androidx.compose.ui.a0 a0Var1111110 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z1111119, q3Var111117, qeVarB.d(z12, z10, c0VarR, i3111111111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111115.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111115, function111111111111111114, z10, function111111111111111115, function111111111111111116, nVar, qeVar111117, z1111119), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var111117;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar111117;
                    function8 = function111111111111111114;
                    function6 = function111111111111111115;
                    function7 = function111111111111111116;
                    z14 = z1111119;
                    a0Var3 = a0Var1111110;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 48;
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i3111111111115 = i31 << 3;
                int i3111111111116 = ((i31 >> 9) & 14) | (i3111111111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111116 = qeVarB.c(z12, z10, c0VarR, i3111111111116);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111117 = function11;
                androidx.compose.ui.graphics.q3 q3Var111118 = q3VarA;
                qe qeVar111118 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111118 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111119 = function10;
                boolean z11111110 = z12;
                androidx.compose.ui.a0 a0Var1111111 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111110, q3Var111118, qeVarB.d(z12, z10, c0VarR, i3111111111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111116.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111116, function111111111111111117, z10, function111111111111111118, function111111111111111119, nVar, qeVar111118, z11111110), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var111118;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar111118;
                function8 = function111111111111111117;
                function6 = function111111111111111118;
                function7 = function111111111111111119;
                z14 = z11111110;
                a0Var3 = a0Var1111111;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z12 = z11;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(jVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarA = q3Var;
                if ((i12 & 32) == 0) {
                    i34 = 65536;
                } else {
                    i34 = 65536;
                }
                i13 |= i34;
            } else {
                q3VarA = q3Var;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                a1Var2 = a1Var;
            } else {
                a1Var2 = a1Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) != 0) {
                    i33 = 4194304;
                } else {
                    if ((16777216 & i10) == 0) {
                        zK0 = c0VarR.D(qeVar);
                    } else {
                        zK0 = c0VarR.k0(qeVar);
                    }
                    if (zK0) {
                        i33 = 8388608;
                    } else {
                        i33 = 4194304;
                    }
                }
                i13 |= i33;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                function5 = function2;
            } else {
                function5 = function2;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function5)) {
                        i23 = 67108864;
                    } else {
                        i23 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function4)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i12 & 2048) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i27 |= i29;
                    }
                    i30 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c0VarR.h(z13, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        } else {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if ((i12 & 32) != 0) {
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                                i13 &= -458753;
                            }
                            i31 = i13;
                            q3VarA = q3VarA;
                            if (i20 != 0) {
                                a1Var2 = null;
                            } else {
                                a1Var2 = a1Var2;
                            }
                            if ((i12 & 128) != 0) {
                                i32 = i22;
                                qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                                i31 &= -29360129;
                            } else {
                                i32 = i22;
                                qeVarB = qeVar;
                            }
                            if (i32 != 0) {
                                c0VarR = c0VarR;
                                function5 = null;
                            }
                            if (i24 != 0) {
                                function9 = null;
                            } else {
                                function9 = function3;
                            }
                            if (i26 != 0) {
                                function10 = null;
                            } else {
                                function10 = function4;
                            }
                            function11 = function5;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                        }
                        int i3111111111117 = i31 << 3;
                        int i3111111111118 = ((i31 >> 9) & 14) | (i3111111111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111117 = qeVarB.c(z12, z10, c0VarR, i3111111111118);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.g4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return k4.j((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111110 = function11;
                        androidx.compose.ui.graphics.q3 q3Var111119 = q3VarA;
                        qe qeVar111119 = qeVarB;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111111 = function9;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111112 = function10;
                        boolean z11111111 = z12;
                        androidx.compose.ui.a0 a0Var1111112 = a0Var5;
                        ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111111, q3Var111119, qeVarB.d(z12, z10, c0VarR, i3111111111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111117.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111117, function1111111111111111110, z10, function1111111111111111111, function1111111111111111112, nVar, qeVar111119, z11111111), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var2 = q3Var111119;
                        a1Var3 = a1Var2;
                        jVar2 = jVar3;
                        qeVar2 = qeVar111119;
                        function8 = function1111111111111111110;
                        function6 = function1111111111111111111;
                        function7 = function1111111111111111112;
                        z14 = z11111111;
                        a0Var3 = a0Var1111112;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        jVar2 = jVar;
                        qeVar2 = qeVar;
                        function6 = function3;
                        function7 = function4;
                        q3Var2 = q3VarA;
                        a1Var3 = a1Var2;
                        a0Var3 = a0Var2;
                        function8 = function5;
                        z14 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 48;
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i3111111111119 = i31 << 3;
                    int i31111111111110 = ((i31 >> 9) & 14) | (i3111111111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111118 = qeVarB.c(z12, z10, c0VarR, i31111111111110);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111113 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1111110 = q3VarA;
                    qe qeVar1111110 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111114 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111115 = function10;
                    boolean z11111112 = z12;
                    androidx.compose.ui.a0 a0Var1111113 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111112, q3Var1111110, qeVarB.d(z12, z10, c0VarR, i31111111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111118.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111118, function1111111111111111113, z10, function1111111111111111114, function1111111111111111115, nVar, qeVar1111110, z11111112), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i3111111111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1111110;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1111110;
                    function8 = function1111111111111111113;
                    function6 = function1111111111111111114;
                    function7 = function1111111111111111115;
                    z14 = z11111112;
                    a0Var3 = a0Var1111113;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i27 |= i29;
                }
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111111111111 = i31 << 3;
                    int i31111111111112 = ((i31 >> 9) & 14) | (i31111111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC111119 = qeVarB.c(z12, z10, c0VarR, i31111111111112);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111116 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1111111 = q3VarA;
                    qe qeVar1111111 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111117 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111118 = function10;
                    boolean z11111113 = z12;
                    androidx.compose.ui.a0 a0Var1111114 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111113, q3Var1111111, qeVarB.d(z12, z10, c0VarR, i31111111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC111119.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC111119, function1111111111111111116, z10, function1111111111111111117, function1111111111111111118, nVar, qeVar1111111, z11111113), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1111111;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1111111;
                    function8 = function1111111111111111116;
                    function6 = function1111111111111111117;
                    function7 = function1111111111111111118;
                    z14 = z11111113;
                    a0Var3 = a0Var1111114;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 48;
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i31111111111113 = i31 << 3;
                int i31111111111114 = ((i31 >> 9) & 14) | (i31111111111113 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111110 = qeVarB.c(z12, z10, c0VarR, i31111111111114);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1111111111111111119 = function11;
                androidx.compose.ui.graphics.q3 q3Var1111112 = q3VarA;
                qe qeVar1111112 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111110 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111111 = function10;
                boolean z11111114 = z12;
                androidx.compose.ui.a0 a0Var1111115 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111114, q3Var1111112, qeVarB.d(z12, z10, c0VarR, i31111111111114).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111110.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111110, function1111111111111111119, z10, function11111111111111111110, function11111111111111111111, nVar, qeVar1111112, z11111114), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111113 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var1111112;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar1111112;
                function8 = function1111111111111111119;
                function6 = function11111111111111111110;
                function7 = function11111111111111111111;
                z14 = z11111114;
                a0Var3 = a0Var1111115;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            q3VarA = q3Var;
            if ((i12 & 32) == 0) {
                i34 = 65536;
            } else {
                i34 = 65536;
            }
            i13 |= i34;
        } else {
            q3VarA = q3Var;
        }
        i20 = i12 & 64;
        if (i20 != 0) {
            i13 |= 1572864;
            a1Var2 = a1Var;
        } else {
            a1Var2 = a1Var;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.D(a1Var2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
        }
        if ((i10 & 12582912) == 0) {
            if ((i12 & 128) != 0) {
                i33 = 4194304;
            } else {
                if ((16777216 & i10) == 0) {
                    zK0 = c0VarR.D(qeVar);
                } else {
                    zK0 = c0VarR.k0(qeVar);
                }
                if (zK0) {
                    i33 = 8388608;
                } else {
                    i33 = 4194304;
                }
            }
            i13 |= i33;
        }
        i22 = i12 & 256;
        if (i22 != 0) {
            i13 |= 100663296;
            function5 = function2;
        } else {
            function5 = function2;
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function5)) {
                    i23 = 67108864;
                } else {
                    i23 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i23;
            }
        }
        i24 = i12 & 512;
        if (i24 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function3)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function4)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i12 & 2048) != 0) {
                if ((i11 & 48) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i27 |= i29;
                }
                i30 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    } else {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if ((i12 & 32) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i13 &= -458753;
                        }
                        i31 = i13;
                        q3VarA = q3VarA;
                        if (i20 != 0) {
                            a1Var2 = null;
                        } else {
                            a1Var2 = a1Var2;
                        }
                        if ((i12 & 128) != 0) {
                            i32 = i22;
                            qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                            i31 &= -29360129;
                        } else {
                            i32 = i22;
                            qeVarB = qeVar;
                        }
                        if (i32 != 0) {
                            c0VarR = c0VarR;
                            function5 = null;
                        }
                        if (i24 != 0) {
                            function9 = null;
                        } else {
                            function9 = function3;
                        }
                        if (i26 != 0) {
                            function10 = null;
                        } else {
                            function10 = function4;
                        }
                        function11 = function5;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                    }
                    int i31111111111115 = i31 << 3;
                    int i31111111111116 = ((i31 >> 9) & 14) | (i31111111111115 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111111 = qeVarB.c(z12, z10, c0VarR, i31111111111116);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.g4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return k4.j((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111112 = function11;
                    androidx.compose.ui.graphics.q3 q3Var1111113 = q3VarA;
                    qe qeVar1111113 = qeVarB;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111113 = function9;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111114 = function10;
                    boolean z11111115 = z12;
                    androidx.compose.ui.a0 a0Var1111116 = a0Var5;
                    ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111115, q3Var1111113, qeVarB.d(z12, z10, c0VarR, i31111111111116).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111111.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111111, function11111111111111111112, z10, function11111111111111111113, function11111111111111111114, nVar, qeVar1111113, z11111115), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111115 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var2 = q3Var1111113;
                    a1Var3 = a1Var2;
                    jVar2 = jVar3;
                    qeVar2 = qeVar1111113;
                    function8 = function11111111111111111112;
                    function6 = function11111111111111111113;
                    function7 = function11111111111111111114;
                    z14 = z11111115;
                    a0Var3 = a0Var1111116;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    jVar2 = jVar;
                    qeVar2 = qeVar;
                    function6 = function3;
                    function7 = function4;
                    q3Var2 = q3VarA;
                    a1Var3 = a1Var2;
                    a0Var3 = a0Var2;
                    function8 = function5;
                    z14 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 48;
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i31111111111117 = i31 << 3;
                int i31111111111118 = ((i31 >> 9) & 14) | (i31111111111117 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111112 = qeVarB.c(z12, z10, c0VarR, i31111111111118);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111115 = function11;
                androidx.compose.ui.graphics.q3 q3Var1111114 = q3VarA;
                qe qeVar1111114 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111116 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111117 = function10;
                boolean z11111116 = z12;
                androidx.compose.ui.a0 a0Var1111117 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111116, q3Var1111114, qeVarB.d(z12, z10, c0VarR, i31111111111118).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111112.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111112, function11111111111111111115, z10, function11111111111111111116, function11111111111111111117, nVar, qeVar1111114, z11111116), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111117 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var1111114;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar1111114;
                function8 = function11111111111111111115;
                function6 = function11111111111111111116;
                function7 = function11111111111111111117;
                z14 = z11111116;
                a0Var3 = a0Var1111117;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        i26 = i12 & 1024;
        if (i26 != 0) {
            i27 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function4)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i11 | i28;
        } else {
            i27 = i11;
        }
        if ((i12 & 2048) != 0) {
            if ((i11 & 48) == 0) {
                if (c0VarR.k0(nVar)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i27 |= i29;
            }
            i30 = i27;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if ((i12 & 32) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i13 &= -458753;
                    }
                    i31 = i13;
                    q3VarA = q3VarA;
                    if (i20 != 0) {
                        a1Var2 = null;
                    } else {
                        a1Var2 = a1Var2;
                    }
                    if ((i12 & 128) != 0) {
                        i32 = i22;
                        qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                        i31 &= -29360129;
                    } else {
                        i32 = i22;
                        qeVarB = qeVar;
                    }
                    if (i32 != 0) {
                        c0VarR = c0VarR;
                        function5 = null;
                    }
                    if (i24 != 0) {
                        function9 = null;
                    } else {
                        function9 = function3;
                    }
                    if (i26 != 0) {
                        function10 = null;
                    } else {
                        function10 = function4;
                    }
                    function11 = function5;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
                }
                int i31111111111119 = i31 << 3;
                int i311111111111110 = ((i31 >> 9) & 14) | (i31111111111119 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111113 = qeVarB.c(z12, z10, c0VarR, i311111111111110);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.g4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k4.j((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111118 = function11;
                androidx.compose.ui.graphics.q3 q3Var1111115 = q3VarA;
                qe qeVar1111115 = qeVarB;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11111111111111111119 = function9;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111111110 = function10;
                boolean z11111117 = z12;
                androidx.compose.ui.a0 a0Var1111118 = a0Var5;
                ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111117, q3Var1111115, qeVarB.d(z12, z10, c0VarR, i311111111111110).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111113.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111113, function11111111111111111118, z10, function11111111111111111119, function111111111111111111110, nVar, qeVar1111115, z11111117), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i31111111111119 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var2 = q3Var1111115;
                a1Var3 = a1Var2;
                jVar2 = jVar3;
                qeVar2 = qeVar1111115;
                function8 = function11111111111111111118;
                function6 = function11111111111111111119;
                function7 = function111111111111111111110;
                z14 = z11111117;
                a0Var3 = a0Var1111118;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                jVar2 = jVar;
                qeVar2 = qeVar;
                function6 = function3;
                function7 = function4;
                q3Var2 = q3VarA;
                a1Var3 = a1Var2;
                a0Var3 = a0Var2;
                function8 = function5;
                z14 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 |= 48;
        i30 = i27;
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i12 & 32) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i13 &= -458753;
                }
                i31 = i13;
                q3VarA = q3VarA;
                if (i20 != 0) {
                    a1Var2 = null;
                } else {
                    a1Var2 = a1Var2;
                }
                if ((i12 & 128) != 0) {
                    i32 = i22;
                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                    i31 &= -29360129;
                } else {
                    i32 = i22;
                    qeVarB = qeVar;
                }
                if (i32 != 0) {
                    c0VarR = c0VarR;
                    function5 = null;
                }
                if (i24 != 0) {
                    function9 = null;
                } else {
                    function9 = function3;
                }
                if (i26 != 0) {
                    function10 = null;
                } else {
                    function10 = function4;
                }
                function11 = function5;
                a0Var5 = a0Var4;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if ((i12 & 32) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i13 &= -458753;
                }
                i31 = i13;
                q3VarA = q3VarA;
                if (i20 != 0) {
                    a1Var2 = null;
                } else {
                    a1Var2 = a1Var2;
                }
                if ((i12 & 128) != 0) {
                    i32 = i22;
                    qeVarB = f4.f22712a.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0VarR, 805306368, 511);
                    i31 &= -29360129;
                } else {
                    i32 = i22;
                    qeVarB = qeVar;
                }
                if (i32 != 0) {
                    c0VarR = c0VarR;
                    function5 = null;
                }
                if (i24 != 0) {
                    function9 = null;
                } else {
                    function9 = function3;
                }
                if (i26 != 0) {
                    function10 = null;
                } else {
                    function10 = function4;
                }
                function11 = function5;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(69602198, i31, i30, "androidx.compose.material.FilterChip (Chip.kt:194)");
            }
            int i311111111111111 = i31 << 3;
            int i311111111111112 = ((i31 >> 9) & 14) | (i311111111111111 & com.planner5d.library.engine.input.f.b.B) | ((i31 >> 15) & 896);
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC1111114 = qeVarB.c(z12, z10, c0VarR, i311111111111112);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.g4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k4.j((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111111111 = function11;
            androidx.compose.ui.graphics.q3 q3Var1111116 = q3VarA;
            qe qeVar1111116 = qeVarB;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111111112 = function9;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111111111111111111113 = function10;
            boolean z11111118 = z12;
            androidx.compose.ui.a0 a0Var1111119 = a0Var5;
            ah.g(z10, function0, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z11111118, q3Var1111116, qeVarB.d(z12, z10, c0VarR, i311111111111112).getValue().M(), androidx.compose.ui.graphics.q0.w(n7VarC1111114.getValue().M(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), a1Var2, 0.0f, jVar3, androidx.compose.runtime.internal.w.e(-60565717, true, new b(n7VarC1111114, function111111111111111111111, z10, function111111111111111111112, function111111111111111111113, nVar, qeVar1111116, z11111118), c0VarR, 54), c0VarR, (i31 & 7294) | ((i31 >> 3) & 57344) | (i311111111111111 & 29360128) | ((i31 << 15) & 1879048192), 6, 256);
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var2 = q3Var1111116;
            a1Var3 = a1Var2;
            jVar2 = jVar3;
            qeVar2 = qeVar1111116;
            function8 = function111111111111111111111;
            function6 = function111111111111111111112;
            function7 = function111111111111111111113;
            z14 = z11111118;
            a0Var3 = a0Var1111119;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            jVar2 = jVar;
            qeVar2 = qeVar;
            function6 = function3;
            function7 = function4;
            q3Var2 = q3VarA;
            a1Var3 = a1Var2;
            a0Var3 = a0Var2;
            function8 = function5;
            z14 = z12;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.h4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k4.k(z10, function0, a0Var3, z14, jVar2, q3Var2, a1Var3, qeVar2, function8, function6, function7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z10, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.foundation.a1 a1Var, qe qeVar, Function2 function2, Function2 function3, Function2 function4, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        i(z10, function0, a0Var, z11, jVar, q3Var, a1Var, qeVar, function2, function3, function4, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }
}
