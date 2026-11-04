package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,364:1\n1282#2,6:365\n1282#2,6:371\n1282#2,6:377\n1282#2,6:383\n1282#2,6:389\n1282#2,6:395\n1282#2,6:401\n1282#2,6:407\n1282#2,6:413\n1#3:419\n113#4:420\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n95#1:365,6\n98#1:371,6\n143#1:377,6\n159#1:383,6\n160#1:389,6\n161#1:395,6\n163#1:401,6\n164#1:407,6\n165#1:413,6\n355#1:420\n*E\n"})
public final class pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f31868a = androidx.compose.ui.unit.h.r(16);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f31871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.b3 f31874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31875g;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, androidx.compose.material3.internal.b3 b3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5) {
            this.f31869a = i10;
            this.f31870b = function2;
            this.f31871c = nVar;
            this.f31872d = function3;
            this.f31873e = function4;
            this.f31874f = b3Var;
            this.f31875g = function5;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(848889571, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
            }
            pt.g(this.f31869a, this.f31870b, this.f31871c, this.f31872d, this.f31873e, this.f31874f, this.f31875g, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$bodyContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,364:1\n70#2:365\n66#2,10:366\n77#2:406\n79#3,6:376\n86#3,3:391\n89#3,2:400\n93#3:405\n347#4,9:382\n356#4,3:402\n4206#5,6:394\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$bodyContent$1$1\n*L\n163#1:365\n163#1:366,10\n163#1:406\n163#1:376,6\n163#1:391,3\n163#1:400,2\n163#1:405\n163#1:382,9\n163#1:402,3\n163#1:394,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> f31876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f31877b;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, d dVar) {
            this.f31876a = nVar;
            this.f31877b = dVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1776388365, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:162)");
            }
            pj.n<androidx.compose.foundation.layout.g5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f31876a;
            d dVar = this.f31877b;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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
            nVar.invoke(dVar, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,364:1\n70#2:365\n66#2,10:366\n77#2:406\n79#3,6:376\n86#3,3:391\n89#3,2:400\n93#3:405\n347#4,9:382\n356#4,3:402\n4206#5,6:394\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1\n*L\n164#1:365\n164#1:366,10\n164#1:406\n164#1:376,6\n164#1:391,3\n164#1:400,2\n164#1:405\n164#1:382,9\n164#1:402,3\n164#1:394,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31878a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f31878a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1731662488, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f31878a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$contentPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n113#2:365\n85#3:366\n117#3,2:367\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$contentPadding$1$1\n*L\n145#1:365\n145#1:366\n145#1:367,2\n*E\n"})
    public static final class d implements androidx.compose.foundation.layout.g5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.compose.runtime.n3 f31879b = androidx.compose.runtime.d7.g(androidx.compose.foundation.layout.d5.f(androidx.compose.ui.unit.h.r(0)), null, 2, null);

        d() {
        }

        @Override // androidx.compose.foundation.layout.g5
        public float a() {
            return e().a();
        }

        @Override // androidx.compose.foundation.layout.g5
        public float b(androidx.compose.ui.unit.w wVar) {
            return e().b(wVar);
        }

        @Override // androidx.compose.foundation.layout.g5
        public float c(androidx.compose.ui.unit.w wVar) {
            return e().c(wVar);
        }

        @Override // androidx.compose.foundation.layout.g5
        public float d() {
            return e().d();
        }

        public final androidx.compose.foundation.layout.g5 e() {
            return (androidx.compose.foundation.layout.g5) this.f31879b.getValue();
        }

        public final void f(androidx.compose.foundation.layout.g5 g5Var) {
            this.f31879b.setValue(g5Var);
        }
    }

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$fabContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,364:1\n70#2:365\n66#2,10:366\n77#2:406\n79#3,6:376\n86#3,3:391\n89#3,2:400\n93#3:405\n347#4,9:382\n356#4,3:402\n4206#5,6:394\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$fabContent$1$1\n*L\n161#1:365\n161#1:366,10\n161#1:406\n161#1:376,6\n161#1:391,3\n161#1:400,2\n161#1:405\n161#1:382,9\n161#1:402,3\n161#1:394,6\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31880a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f31880a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(338600263, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f31880a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$snackbarContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,364:1\n70#2:365\n66#2,10:366\n77#2:406\n79#3,6:376\n86#3,3:391\n89#3,2:400\n93#3:405\n347#4,9:382\n356#4,3:402\n4206#5,6:394\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$snackbarContent$1$1\n*L\n160#1:365\n160#1:366,10\n160#1:406\n160#1:376,6\n160#1:391,3\n160#1:400,2\n160#1:405\n160#1:382,9\n160#1:402,3\n160#1:394,6\n*E\n"})
    static final class f implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31881a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f31881a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(418899191, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f31881a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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

    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$topBarContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,364:1\n70#2:365\n66#2,10:366\n77#2:406\n79#3,6:376\n86#3,3:391\n89#3,2:400\n93#3:405\n347#4,9:382\n356#4,3:402\n4206#5,6:394\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$topBarContent$1$1\n*L\n159#1:365\n159#1:366,10\n159#1:406\n159#1:376,6\n159#1:391,3\n159#1:400,2\n159#1:405\n159#1:382,9\n159#1:402,3\n159#1:394,6\n*E\n"})
    static final class g implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f31882a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f31882a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            int i11 = 2 & 0;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(605195056, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:158)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f31882a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x014e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:130:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x019a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:158:0x0200  */
    /* JADX WARN: Code duplicated, block: B:160:0x0212  */
    /* JADX WARN: Code duplicated, block: B:163:0x0220  */
    /* JADX WARN: Code duplicated, block: B:164:0x022c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0237  */
    /* JADX WARN: Code duplicated, block: B:169:0x023d  */
    /* JADX WARN: Code duplicated, block: B:175:0x024a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0252  */
    /* JADX WARN: Code duplicated, block: B:180:0x0266  */
    /* JADX WARN: Code duplicated, block: B:182:0x026c  */
    /* JADX WARN: Code duplicated, block: B:188:0x027b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0283  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:198:0x0303  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, int i10, long j10, long j11, @Nullable androidx.compose.foundation.layout.v6 v6Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        int i14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        int i15;
        int i16;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        int i17;
        int i18;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final androidx.compose.foundation.layout.v6 v6Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13;
        final int i23;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2B;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2C;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2D;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2A;
        int iB;
        long jG;
        long jG2;
        final androidx.compose.foundation.layout.v6 v6VarA;
        long j14;
        boolean z11;
        Object objI0;
        final androidx.compose.material3.internal.b3 b3Var;
        boolean zD;
        Object objI1;
        int i24;
        int i25;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1211482744);
        int i26 = i12 & 1;
        if (i26 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i27 = i12 & 2;
        if (i27 == 0) {
            if ((i11 & 48) == 0) {
                function6 = function2;
                i13 |= c0VarR.k0(function6) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function7 = function3;
                    if (c0VarR.k0(function7)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        function8 = function4;
                        if (c0VarR.k0(function8)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            function9 = function5;
                            if (c0VarR.k0(function9)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 32;
                        if (i20 != 0) {
                            i13 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i10)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 64) == 0 || !c0VarR.L(j10)) {
                                i25 = 524288;
                            } else {
                                i25 = 1048576;
                            }
                            i13 |= i25;
                        }
                        if ((i11 & 12582912) != 0) {
                            if ((i12 & 128) == 0 || !c0VarR.L(j11)) {
                                i24 = 4194304;
                            } else {
                                i24 = 8388608;
                            }
                            i13 |= i24;
                        }
                        if ((i11 & 100663296) != 0) {
                            i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i13 |= i22;
                            }
                            if ((i13 & 306783379) != 306783378) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i13 & 1)) {
                                c0VarR.l0();
                                if ((i11 & 1) != 0 || c0VarR.y()) {
                                    if (i26 != 0) {
                                        a0Var3 = androidx.compose.ui.a0.E;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                    if (i27 != 0) {
                                        function2B = u6.f33517a.b();
                                    } else {
                                        function2B = function6;
                                    }
                                    if (i14 != 0) {
                                        function2C = u6.f33517a.c();
                                    } else {
                                        function2C = function7;
                                    }
                                    if (i16 != 0) {
                                        function2D = u6.f33517a.d();
                                    } else {
                                        function2D = function8;
                                    }
                                    if (i18 != 0) {
                                        function2A = u6.f33517a.a();
                                    } else {
                                        function2A = function9;
                                    }
                                    if (i20 != 0) {
                                        iB = ig.f28587b.b();
                                    } else {
                                        iB = i10;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                        jG = pj.f31758a.a(c0VarR, 6).g();
                                    } else {
                                        jG = j10;
                                    }
                                    if ((i12 & 128) != 0) {
                                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                        i13 &= -29360129;
                                    } else {
                                        jG2 = j11;
                                    }
                                    if ((i12 & 256) != 0) {
                                        v6VarA = jt.f29833a.a(c0VarR, 6);
                                        i13 &= -234881025;
                                    } else {
                                        v6VarA = v6Var;
                                    }
                                    j14 = jG2;
                                } else {
                                    c0VarR.u();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i13 &= -234881025;
                                    }
                                    a0Var3 = a0Var;
                                    iB = i10;
                                    jG = j10;
                                    function2B = function6;
                                    function2C = function7;
                                    function2D = function8;
                                    function2A = function9;
                                    j14 = j11;
                                    v6VarA = v6Var;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                                }
                                int i28 = (234881024 & i13) ^ r19;
                                z11 = (i28 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & r19) == 67108864;
                                objI0 = c0VarR.i0();
                                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                    c0VarR.Y(objI0);
                                }
                                b3Var = (androidx.compose.material3.internal.b3) objI0;
                                long j15 = jG;
                                zD = c0VarR.D(b3Var) | ((i28 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                                objI1 = c0VarR.i0();
                                if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                int i29 = i13 >> 12;
                                c0Var2 = c0VarR;
                                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j15, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i29 & 896) | 12582912 | (i29 & 7168), 114);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var2 = a0Var3;
                                function10 = function2B;
                                function11 = function2C;
                                function12 = function2D;
                                function13 = function2A;
                                i23 = iB;
                                v6Var2 = v6VarA;
                                j12 = j15;
                                j13 = j14;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                a0Var2 = a0Var;
                                v6Var2 = v6Var;
                                function10 = function6;
                                function11 = function7;
                                function12 = function8;
                                function13 = function9;
                                i23 = i10;
                                j12 = j10;
                                j13 = j11;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i13 |= 805306368;
                        if ((i13 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            } else {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i210 = (234881024 & i13) ^ r19;
                            if (i210 <= 67108864) {
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            }
                            b3Var = (androidx.compose.material3.internal.b3) objI0;
                            long j16 = jG;
                            zD = c0VarR.D(b3Var) | ((i210 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                            objI1 = c0VarR.i0();
                            if (zD) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            int i211 = i13 >> 12;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j16, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211 & 896) | 12582912 | (i211 & 7168), 114);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i23 = iB;
                            v6Var2 = v6VarA;
                            j12 = j16;
                            j13 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            v6Var2 = v6Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i23 = i10;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 24576;
                    function9 = function5;
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 12582912) != 0) {
                        if ((i12 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i13 |= i24;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            } else {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i212 = (234881024 & i13) ^ r19;
                            if (i212 <= 67108864) {
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            }
                            b3Var = (androidx.compose.material3.internal.b3) objI0;
                            long j17 = jG;
                            zD = c0VarR.D(b3Var) | ((i212 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                            objI1 = c0VarR.i0();
                            if (zD) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            int i213 = i13 >> 12;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j17, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i213 & 896) | 12582912 | (i213 & 7168), 114);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i23 = iB;
                            v6Var2 = v6VarA;
                            j12 = j17;
                            j13 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            v6Var2 = v6Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i23 = i10;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i214 = (234881024 & i13) ^ r19;
                        if (i214 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j18 = jG;
                        zD = c0VarR.D(b3Var) | ((i214 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i215 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j18, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i215 & 896) | 12582912 | (i215 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j18;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 3072;
                function8 = function4;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        function9 = function5;
                        if (c0VarR.k0(function9)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 12582912) != 0) {
                        if ((i12 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i13 |= i24;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            } else {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i216 = (234881024 & i13) ^ r19;
                            if (i216 <= 67108864) {
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            }
                            b3Var = (androidx.compose.material3.internal.b3) objI0;
                            long j19 = jG;
                            zD = c0VarR.D(b3Var) | ((i216 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                            objI1 = c0VarR.i0();
                            if (zD) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            int i217 = i13 >> 12;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j19, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i217 & 896) | 12582912 | (i217 & 7168), 114);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i23 = iB;
                            v6Var2 = v6VarA;
                            j12 = j19;
                            j13 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            v6Var2 = v6Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i23 = i10;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i218 = (234881024 & i13) ^ r19;
                        if (i218 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j110 = jG;
                        zD = c0VarR.D(b3Var) | ((i218 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i219 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j110, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i219 & 896) | 12582912 | (i219 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j110;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                function9 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i2110 = (234881024 & i13) ^ r19;
                        if (i2110 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j111 = jG;
                        zD = c0VarR.D(b3Var) | ((i2110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i2111 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j111, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111 & 896) | 12582912 | (i2111 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j111;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i2112 = (234881024 & i13) ^ r19;
                    if (i2112 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j112 = jG;
                    zD = c0VarR.D(b3Var) | ((i2112 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i2113 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j112, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2113 & 896) | 12582912 | (i2113 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j112;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            function7 = function3;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    function8 = function4;
                    if (c0VarR.k0(function8)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        function9 = function5;
                        if (c0VarR.k0(function9)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 12582912) != 0) {
                        if ((i12 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i13 |= i24;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            } else {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i2114 = (234881024 & i13) ^ r19;
                            if (i2114 <= 67108864) {
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            }
                            b3Var = (androidx.compose.material3.internal.b3) objI0;
                            long j113 = jG;
                            zD = c0VarR.D(b3Var) | ((i2114 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                            objI1 = c0VarR.i0();
                            if (zD) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            int i2115 = i13 >> 12;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j113, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2115 & 896) | 12582912 | (i2115 & 7168), 114);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i23 = iB;
                            v6Var2 = v6VarA;
                            j12 = j113;
                            j13 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            v6Var2 = v6Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i23 = i10;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i2116 = (234881024 & i13) ^ r19;
                        if (i2116 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j114 = jG;
                        zD = c0VarR.D(b3Var) | ((i2116 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i2117 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j114, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2117 & 896) | 12582912 | (i2117 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j114;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                function9 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i2118 = (234881024 & i13) ^ r19;
                        if (i2118 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j115 = jG;
                        zD = c0VarR.D(b3Var) | ((i2118 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i2119 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j115, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2119 & 896) | 12582912 | (i2119 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j115;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i21110 = (234881024 & i13) ^ r19;
                    if (i21110 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j116 = jG;
                    zD = c0VarR.D(b3Var) | ((i21110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i21111 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j116, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111 & 896) | 12582912 | (i21111 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j116;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function8 = function4;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    function9 = function5;
                    if (c0VarR.k0(function9)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i21112 = (234881024 & i13) ^ r19;
                        if (i21112 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j117 = jG;
                        zD = c0VarR.D(b3Var) | ((i21112 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i21113 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j117, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21113 & 896) | 12582912 | (i21113 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j117;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i21114 = (234881024 & i13) ^ r19;
                    if (i21114 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j118 = jG;
                    zD = c0VarR.D(b3Var) | ((i21114 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i21115 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j118, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21115 & 896) | 12582912 | (i21115 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j118;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            function9 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i13 |= i24;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i21116 = (234881024 & i13) ^ r19;
                    if (i21116 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j119 = jG;
                    zD = c0VarR.D(b3Var) | ((i21116 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i21117 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j119, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21117 & 896) | 12582912 | (i21117 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j119;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                } else {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i21118 = (234881024 & i13) ^ r19;
                if (i21118 <= 67108864) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                }
                b3Var = (androidx.compose.material3.internal.b3) objI0;
                long j1110 = jG;
                zD = c0VarR.D(b3Var) | ((i21118 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                int i21119 = i13 >> 12;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1110, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21119 & 896) | 12582912 | (i21119 & 7168), 114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i23 = iB;
                v6Var2 = v6VarA;
                j12 = j1110;
                j13 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                v6Var2 = v6Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i23 = i10;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        function6 = function2;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                function7 = function3;
                if (c0VarR.k0(function7)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    function8 = function4;
                    if (c0VarR.k0(function8)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        function9 = function5;
                        if (c0VarR.k0(function9)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 12582912) != 0) {
                        if ((i12 & 128) == 0) {
                            i24 = 4194304;
                        } else {
                            i24 = 4194304;
                        }
                        i13 |= i24;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i11 & 1) != 0) {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            } else {
                                if (i26 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i27 != 0) {
                                    function2B = u6.f33517a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i14 != 0) {
                                    function2C = u6.f33517a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i16 != 0) {
                                    function2D = u6.f33517a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i18 != 0) {
                                    function2A = u6.f33517a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i20 != 0) {
                                    iB = ig.f28587b.b();
                                } else {
                                    iB = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                    jG = pj.f31758a.a(c0VarR, 6).g();
                                } else {
                                    jG = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                    i13 &= -29360129;
                                } else {
                                    jG2 = j11;
                                }
                                if ((i12 & 256) != 0) {
                                    v6VarA = jt.f29833a.a(c0VarR, 6);
                                    i13 &= -234881025;
                                } else {
                                    v6VarA = v6Var;
                                }
                                j14 = jG2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i211110 = (234881024 & i13) ^ r19;
                            if (i211110 <= 67108864) {
                            }
                            objI0 = c0VarR.i0();
                            if (z11) {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                                c0VarR.Y(objI0);
                            }
                            b3Var = (androidx.compose.material3.internal.b3) objI0;
                            long j1111 = jG;
                            zD = c0VarR.D(b3Var) | ((i211110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                            objI1 = c0VarR.i0();
                            if (zD) {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            int i211111 = i13 >> 12;
                            c0Var2 = c0VarR;
                            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1111, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211111 & 896) | 12582912 | (i211111 & 7168), 114);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var2 = a0Var3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i23 = iB;
                            v6Var2 = v6VarA;
                            j12 = j1111;
                            j13 = j14;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            v6Var2 = v6Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i23 = i10;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i211112 = (234881024 & i13) ^ r19;
                        if (i211112 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j1112 = jG;
                        zD = c0VarR.D(b3Var) | ((i211112 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i211113 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1112, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211113 & 896) | 12582912 | (i211113 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j1112;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                function9 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i211114 = (234881024 & i13) ^ r19;
                        if (i211114 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j1113 = jG;
                        zD = c0VarR.D(b3Var) | ((i211114 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i211115 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1113, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211115 & 896) | 12582912 | (i211115 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j1113;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i211116 = (234881024 & i13) ^ r19;
                    if (i211116 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j1114 = jG;
                    zD = c0VarR.D(b3Var) | ((i211116 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i211117 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1114, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211117 & 896) | 12582912 | (i211117 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j1114;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function8 = function4;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    function9 = function5;
                    if (c0VarR.k0(function9)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i211118 = (234881024 & i13) ^ r19;
                        if (i211118 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j1115 = jG;
                        zD = c0VarR.D(b3Var) | ((i211118 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i211119 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1115, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211119 & 896) | 12582912 | (i211119 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j1115;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i2111110 = (234881024 & i13) ^ r19;
                    if (i2111110 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j1116 = jG;
                    zD = c0VarR.D(b3Var) | ((i2111110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i2111111 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1116, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111111 & 896) | 12582912 | (i2111111 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j1116;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            function9 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i13 |= i24;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i2111112 = (234881024 & i13) ^ r19;
                    if (i2111112 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j1117 = jG;
                    zD = c0VarR.D(b3Var) | ((i2111112 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i2111113 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1117, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111113 & 896) | 12582912 | (i2111113 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j1117;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                } else {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i2111114 = (234881024 & i13) ^ r19;
                if (i2111114 <= 67108864) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                }
                b3Var = (androidx.compose.material3.internal.b3) objI0;
                long j1118 = jG;
                zD = c0VarR.D(b3Var) | ((i2111114 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                int i2111115 = i13 >> 12;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1118, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111115 & 896) | 12582912 | (i2111115 & 7168), 114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i23 = iB;
                v6Var2 = v6VarA;
                j12 = j1118;
                j13 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                v6Var2 = v6Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i23 = i10;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function7 = function3;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                function8 = function4;
                if (c0VarR.k0(function8)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    function9 = function5;
                    if (c0VarR.k0(function9)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i11 & 12582912) != 0) {
                    if ((i12 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        } else {
                            if (i26 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i27 != 0) {
                                function2B = u6.f33517a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i14 != 0) {
                                function2C = u6.f33517a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i16 != 0) {
                                function2D = u6.f33517a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i18 != 0) {
                                function2A = u6.f33517a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i20 != 0) {
                                iB = ig.f28587b.b();
                            } else {
                                iB = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                                jG = pj.f31758a.a(c0VarR, 6).g();
                            } else {
                                jG = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                                i13 &= -29360129;
                            } else {
                                jG2 = j11;
                            }
                            if ((i12 & 256) != 0) {
                                v6VarA = jt.f29833a.a(c0VarR, 6);
                                i13 &= -234881025;
                            } else {
                                v6VarA = v6Var;
                            }
                            j14 = jG2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i2111116 = (234881024 & i13) ^ r19;
                        if (i2111116 <= 67108864) {
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                            c0VarR.Y(objI0);
                        }
                        b3Var = (androidx.compose.material3.internal.b3) objI0;
                        long j1119 = jG;
                        zD = c0VarR.D(b3Var) | ((i2111116 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                        objI1 = c0VarR.i0();
                        if (zD) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.material3.kt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        int i2111117 = i13 >> 12;
                        c0Var2 = c0VarR;
                        u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j1119, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111117 & 896) | 12582912 | (i2111117 & 7168), 114);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var2 = a0Var3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i23 = iB;
                        v6Var2 = v6VarA;
                        j12 = j1119;
                        j13 = j14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        v6Var2 = v6Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i23 = i10;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i2111118 = (234881024 & i13) ^ r19;
                    if (i2111118 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j11110 = jG;
                    zD = c0VarR.D(b3Var) | ((i2111118 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i2111119 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11110, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i2111119 & 896) | 12582912 | (i2111119 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j11110;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            function9 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i13 |= i24;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i21111110 = (234881024 & i13) ^ r19;
                    if (i21111110 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j11111 = jG;
                    zD = c0VarR.D(b3Var) | ((i21111110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i21111111 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11111, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111111 & 896) | 12582912 | (i21111111 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j11111;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                } else {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i21111112 = (234881024 & i13) ^ r19;
                if (i21111112 <= 67108864) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                }
                b3Var = (androidx.compose.material3.internal.b3) objI0;
                long j11112 = jG;
                zD = c0VarR.D(b3Var) | ((i21111112 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                int i21111113 = i13 >> 12;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11112, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111113 & 896) | 12582912 | (i21111113 & 7168), 114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i23 = iB;
                v6Var2 = v6VarA;
                j12 = j11112;
                j13 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                v6Var2 = v6Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i23 = i10;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        function8 = function4;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                function9 = function5;
                if (c0VarR.k0(function9)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i13 |= i24;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    } else {
                        if (i26 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i27 != 0) {
                            function2B = u6.f33517a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i14 != 0) {
                            function2C = u6.f33517a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i16 != 0) {
                            function2D = u6.f33517a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i18 != 0) {
                            function2A = u6.f33517a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i20 != 0) {
                            iB = ig.f28587b.b();
                        } else {
                            iB = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                            jG = pj.f31758a.a(c0VarR, 6).g();
                        } else {
                            jG = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                            i13 &= -29360129;
                        } else {
                            jG2 = j11;
                        }
                        if ((i12 & 256) != 0) {
                            v6VarA = jt.f29833a.a(c0VarR, 6);
                            i13 &= -234881025;
                        } else {
                            v6VarA = v6Var;
                        }
                        j14 = jG2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i21111114 = (234881024 & i13) ^ r19;
                    if (i21111114 <= 67108864) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                        c0VarR.Y(objI0);
                    }
                    b3Var = (androidx.compose.material3.internal.b3) objI0;
                    long j11113 = jG;
                    zD = c0VarR.D(b3Var) | ((i21111114 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.kt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    int i21111115 = i13 >> 12;
                    c0Var2 = c0VarR;
                    u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11113, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111115 & 896) | 12582912 | (i21111115 & 7168), 114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i23 = iB;
                    v6Var2 = v6VarA;
                    j12 = j11113;
                    j13 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    v6Var2 = v6Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i23 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                } else {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i21111116 = (234881024 & i13) ^ r19;
                if (i21111116 <= 67108864) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                }
                b3Var = (androidx.compose.material3.internal.b3) objI0;
                long j11114 = jG;
                zD = c0VarR.D(b3Var) | ((i21111116 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                int i21111117 = i13 >> 12;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11114, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111117 & 896) | 12582912 | (i21111117 & 7168), 114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i23 = iB;
                v6Var2 = v6VarA;
                j12 = j11114;
                j13 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                v6Var2 = v6Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i23 = i10;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        function9 = function5;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i10)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i13 |= i25;
        }
        if ((i11 & 12582912) != 0) {
            if ((i12 & 128) == 0) {
                i24 = 4194304;
            } else {
                i24 = 4194304;
            }
            i13 |= i24;
        }
        if ((i11 & 100663296) != 0) {
            i13 |= ((i12 & 256) == 0 || !c0VarR.D(v6Var)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        if ((i12 & 512) != 0) {
            if ((i11 & 805306368) == 0) {
                if (c0VarR.k0(nVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            if ((i13 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                } else {
                    if (i26 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i27 != 0) {
                        function2B = u6.f33517a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i14 != 0) {
                        function2C = u6.f33517a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i16 != 0) {
                        function2D = u6.f33517a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i18 != 0) {
                        function2A = u6.f33517a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i20 != 0) {
                        iB = ig.f28587b.b();
                    } else {
                        iB = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i13 &= -3670017;
                        jG = pj.f31758a.a(c0VarR, 6).g();
                    } else {
                        jG = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                        i13 &= -29360129;
                    } else {
                        jG2 = j11;
                    }
                    if ((i12 & 256) != 0) {
                        v6VarA = jt.f29833a.a(c0VarR, 6);
                        i13 &= -234881025;
                    } else {
                        v6VarA = v6Var;
                    }
                    j14 = jG2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i21111118 = (234881024 & i13) ^ r19;
                if (i21111118 <= 67108864) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                    c0VarR.Y(objI0);
                }
                b3Var = (androidx.compose.material3.internal.b3) objI0;
                long j11115 = jG;
                zD = c0VarR.D(b3Var) | ((i21111118 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.kt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                int i21111119 = i13 >> 12;
                c0Var2 = c0VarR;
                u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11115, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i21111119 & 896) | 12582912 | (i21111119 & 7168), 114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i23 = iB;
                v6Var2 = v6VarA;
                j12 = j11115;
                j13 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                v6Var2 = v6Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i23 = i10;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i13 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i26 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i27 != 0) {
                    function2B = u6.f33517a.b();
                } else {
                    function2B = function6;
                }
                if (i14 != 0) {
                    function2C = u6.f33517a.c();
                } else {
                    function2C = function7;
                }
                if (i16 != 0) {
                    function2D = u6.f33517a.d();
                } else {
                    function2D = function8;
                }
                if (i18 != 0) {
                    function2A = u6.f33517a.a();
                } else {
                    function2A = function9;
                }
                if (i20 != 0) {
                    iB = ig.f28587b.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    jG = pj.f31758a.a(c0VarR, 6).g();
                } else {
                    jG = j10;
                }
                if ((i12 & 128) != 0) {
                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                    i13 &= -29360129;
                } else {
                    jG2 = j11;
                }
                if ((i12 & 256) != 0) {
                    v6VarA = jt.f29833a.a(c0VarR, 6);
                    i13 &= -234881025;
                } else {
                    v6VarA = v6Var;
                }
                j14 = jG2;
            } else {
                if (i26 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i27 != 0) {
                    function2B = u6.f33517a.b();
                } else {
                    function2B = function6;
                }
                if (i14 != 0) {
                    function2C = u6.f33517a.c();
                } else {
                    function2C = function7;
                }
                if (i16 != 0) {
                    function2D = u6.f33517a.d();
                } else {
                    function2D = function8;
                }
                if (i18 != 0) {
                    function2A = u6.f33517a.a();
                } else {
                    function2A = function9;
                }
                if (i20 != 0) {
                    iB = ig.f28587b.b();
                } else {
                    iB = i10;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                    jG = pj.f31758a.a(c0VarR, 6).g();
                } else {
                    jG = j10;
                }
                if ((i12 & 128) != 0) {
                    jG2 = o6.g(jG, c0VarR, (i13 >> 18) & 14);
                    i13 &= -29360129;
                } else {
                    jG2 = j11;
                }
                if ((i12 & 256) != 0) {
                    v6VarA = jt.f29833a.a(c0VarR, 6);
                    i13 &= -234881025;
                } else {
                    v6VarA = v6Var;
                }
                j14 = jG2;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1211482744, i13, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
            }
            int i211111110 = (234881024 & i13) ^ r19;
            if (i211111110 <= 67108864) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                c0VarR.Y(objI0);
            } else {
                objI0 = new androidx.compose.material3.internal.b3(v6VarA);
                c0VarR.Y(objI0);
            }
            b3Var = (androidx.compose.material3.internal.b3) objI0;
            long j11116 = jG;
            zD = c0VarR.D(b3Var) | ((i211111110 <= 67108864 && c0VarR.D(v6VarA)) || (i13 & 100663296) == 67108864);
            objI1 = c0VarR.i0();
            if (zD) {
                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: androidx.compose.material3.kt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return pt.k(b3Var, v6VarA, (androidx.compose.foundation.layout.v6) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            int i211111111 = i13 >> 12;
            c0Var2 = c0VarR;
            u10.c(androidx.compose.foundation.layout.t7.f(a0Var3, (Function1) objI1), null, j11116, j14, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(848889571, true, new a(iB, function2B, nVar, function2D, function2A, b3Var, function2C), c0VarR, 54), c0Var2, (i211111111 & 896) | 12582912 | (i211111111 & 7168), 114);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            function10 = function2B;
            function11 = function2C;
            function12 = function2D;
            function13 = function2A;
            i23 = iB;
            v6Var2 = v6VarA;
            j12 = j11116;
            j13 = j14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            v6Var2 = v6Var;
            function10 = function6;
            function11 = function7;
            function12 = function8;
            function13 = function9;
            i23 = i10;
            j12 = j10;
            j13 = j11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pt.l(a0Var2, function10, function11, function12, function13, i23, j12, j13, v6Var2, nVar, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void g(final int i10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final pj.n<? super androidx.compose.foundation.layout.g5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final androidx.compose.foundation.layout.v6 v6Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-280287501);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(nVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.k0(function3) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c0VarR.k0(function4) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c0VarR.D(v6Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= c0VarR.k0(function5) ? 1048576 : 524288;
        }
        if (c0VarR.h((i12 & 599187) != 599186, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-280287501, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new d();
                c0VarR.Y(objI0);
            }
            final d dVar = (d) objI0;
            boolean z10 = (i12 & com.planner5d.library.engine.input.f.b.B) == 32;
            Object objI1 = c0VarR.i0();
            if (z10 || objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.internal.w.c(605195056, true, new g(function2));
                c0VarR.Y(objI1);
            }
            final Function2 function6 = (Function2) objI1;
            boolean z11 = (i12 & 7168) == 2048;
            Object objI2 = c0VarR.i0();
            if (z11 || objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.internal.w.c(418899191, true, new f(function3));
                c0VarR.Y(objI2);
            }
            final Function2 function7 = (Function2) objI2;
            boolean z12 = (57344 & i12) == 16384;
            Object objI3 = c0VarR.i0();
            if (z12 || objI3 == aVar.a()) {
                objI3 = androidx.compose.runtime.internal.w.c(338600263, true, new e(function4));
                c0VarR.Y(objI3);
            }
            final Function2 function8 = (Function2) objI3;
            boolean z13 = (i12 & 896) == 256;
            Object objI4 = c0VarR.i0();
            if (z13 || objI4 == aVar.a()) {
                objI4 = androidx.compose.runtime.internal.w.c(-1776388365, true, new b(nVar, dVar));
                c0VarR.Y(objI4);
            }
            final Function2 function9 = (Function2) objI4;
            boolean z14 = (3670016 & i12) == 1048576;
            Object objI5 = c0VarR.i0();
            if (z14 || objI5 == aVar.a()) {
                objI5 = androidx.compose.runtime.internal.w.c(-1731662488, true, new c(function5));
                c0VarR.Y(objI5);
            }
            final Function2 function10 = (Function2) objI5;
            boolean zD = ((458752 & i12) == 131072) | c0VarR.D(function6) | c0VarR.D(function7) | c0VarR.D(function8) | ((i12 & 14) == 4) | c0VarR.D(function10) | c0VarR.D(function9);
            Object objI6 = c0VarR.i0();
            if (zD || objI6 == aVar.a()) {
                i13 = 1;
                i14 = 0;
                Function2 function11 = new Function2() { // from class: androidx.compose.material3.mt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return pt.h(v6Var, function6, function7, function8, i10, function10, dVar, function9, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(function11);
                objI6 = function11;
            } else {
                i14 = 0;
                i13 = 1;
            }
            androidx.compose.ui.layout.z2.a(null, (Function2) objI6, c0VarR, i14, i13);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.nt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return pt.j(i10, function2, nVar, function3, function4, v6Var, function5, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 h(final androidx.compose.foundation.layout.v6 v6Var, Function2 function2, Function2 function3, Function2 function4, int i10, Function2 function5, d dVar, Function2 function6, final androidx.compose.ui.layout.b3 b3Var, androidx.compose.ui.unit.b bVar) {
        int iG6;
        int iG7;
        int i11;
        hg hgVar;
        Integer numValueOf;
        int iIntValue;
        int iA;
        int iC;
        final int iP = androidx.compose.ui.unit.b.p(bVar.x());
        final int iO = androidx.compose.ui.unit.b.o(bVar.x());
        long jD = androidx.compose.ui.unit.b.d(bVar.x(), 0, 0, 0, 0, 10, null);
        int iD = v6Var.d(b3Var, b3Var.getLayoutDirection());
        int iB = v6Var.b(b3Var, b3Var.getLayoutDirection());
        int iC2 = v6Var.c(b3Var);
        final androidx.compose.ui.layout.i2 i2VarP0 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(qt.TopBar, function2))).P0(jD);
        int i12 = (-iD) - iB;
        int i13 = -iC2;
        final androidx.compose.ui.layout.i2 i2VarP1 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(qt.Snackbar, function3))).P0(androidx.compose.ui.unit.c.q(jD, i12, i13));
        final androidx.compose.ui.layout.i2 i2VarP2 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(qt.Fab, function4))).P0(androidx.compose.ui.unit.c.q(jD, i12, i13));
        if (i2VarP2.h1() == 0 && i2VarP2.c1() == 0) {
            hgVar = null;
        } else {
            int iH1 = i2VarP2.h1();
            int iC1 = i2VarP2.c1();
            ig.a aVar = ig.f28587b;
            if (ig.h(i10, aVar.d())) {
                if (b3Var.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                    iG6 = b3Var.g6(f31868a);
                    i11 = iG6 + iD;
                } else {
                    iG7 = b3Var.g6(f31868a);
                    i11 = ((iP - iG7) - iH1) - iB;
                }
            } else if (!ig.h(i10, aVar.b()) && !ig.h(i10, aVar.c())) {
                i11 = (((iP - iH1) + iD) - iB) / 2;
            } else if (b3Var.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                iG7 = b3Var.g6(f31868a);
                i11 = ((iP - iG7) - iH1) - iB;
            } else {
                iG6 = b3Var.g6(f31868a);
                i11 = iG6 + iD;
            }
            hgVar = new hg(i11, iH1, iC1);
        }
        final androidx.compose.ui.layout.i2 i2VarP3 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(qt.BottomBar, function5))).P0(jD);
        int i14 = 0;
        boolean z10 = i2VarP3.h1() == 0 && i2VarP3.c1() == 0;
        if (hgVar != null) {
            if (z10 || ig.h(i10, ig.f28587b.c())) {
                iA = hgVar.a() + b3Var.g6(f31868a);
                iC = v6Var.c(b3Var);
            } else {
                iA = i2VarP3.c1() + hgVar.a();
                iC = b3Var.g6(f31868a);
            }
            numValueOf = Integer.valueOf(iA + iC);
        } else {
            numValueOf = null;
        }
        int iC3 = i2VarP1.c1();
        if (iC3 != 0) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                Integer numValueOf2 = Integer.valueOf(i2VarP3.c1());
                if (z10) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : v6Var.c(b3Var);
            }
            i14 = iIntValue + iC3;
        }
        androidx.compose.foundation.layout.g5 g5VarI = androidx.compose.foundation.layout.b7.i(v6Var, b3Var);
        final Integer num = numValueOf;
        final hg hgVar2 = hgVar;
        dVar.f(androidx.compose.foundation.layout.d5.i(androidx.compose.foundation.layout.d5.o(g5VarI, b3Var.getLayoutDirection()), (i2VarP0.h1() == 0 && i2VarP0.c1() == 0) ? g5VarI.d() : b3Var.D3(i2VarP0.c1()), androidx.compose.foundation.layout.d5.n(g5VarI, b3Var.getLayoutDirection()), z10 ? g5VarI.a() : b3Var.D3(i2VarP3.c1())));
        final androidx.compose.ui.layout.i2 i2VarP4 = ((androidx.compose.ui.layout.z0) CollectionsKt.first((List) b3Var.S4(qt.MainContent, function6))).P0(jD);
        final int i15 = i14;
        return androidx.compose.ui.layout.c1.h6(b3Var, iP, iO, null, new Function1() { // from class: androidx.compose.material3.ot
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pt.i(i2VarP4, i2VarP0, i2VarP1, iP, v6Var, b3Var, iO, i15, i2VarP3, hgVar2, i2VarP2, num, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, int i10, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.layout.b3 b3Var, int i11, int i12, androidx.compose.ui.layout.i2 i2Var4, hg hgVar, androidx.compose.ui.layout.i2 i2Var5, Integer num, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, 0, 0, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var3, (((i10 - i2Var3.h1()) + v6Var.d(b3Var, b3Var.getLayoutDirection())) - v6Var.b(b3Var, b3Var.getLayoutDirection())) / 2, i11 - i12, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var4, 0, i11 - i2Var4.c1(), 0.0f, 4, null);
        if (hgVar != null) {
            int iB = hgVar.b();
            Intrinsics.checkNotNull(num);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var5, iB, i11 - num.intValue(), 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(int i10, Function2 function2, pj.n nVar, Function2 function3, Function2 function4, androidx.compose.foundation.layout.v6 v6Var, Function2 function5, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(i10, function2, nVar, function3, function4, v6Var, function5, c0Var, androidx.compose.runtime.t4.a(i11 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.material3.internal.b3 b3Var, androidx.compose.foundation.layout.v6 v6Var, androidx.compose.foundation.layout.v6 v6Var2) {
        b3Var.f(androidx.compose.foundation.layout.b7.j(v6Var, v6Var2));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, Function2 function4, Function2 function5, int i10, long j10, long j11, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        f(a0Var, function2, function3, function4, function5, i10, j10, j11, v6Var, nVar, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }
}
