package androidx.compose.ui.layout;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u5;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,416:1\n80#1,6:458\n87#1,3:473\n90#1,2:482\n94#1:487\n391#2,9:417\n400#2,3:432\n316#2,9:435\n325#2,2:450\n391#2,9:464\n400#2,3:484\n391#2,9:488\n400#2,3:503\n4360#3,6:426\n4360#3,6:444\n4360#3,6:476\n4360#3,6:497\n1282#4,6:452\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n167#1:458,6\n167#1:473,3\n167#1:482,2\n167#1:487\n84#1:417,9\n84#1:432,3\n126#1:435,9\n126#1:450,2\n167#1:464,9\n167#1:484,3\n244#1:488,9\n244#1:503,3\n89#1:426,6\n132#1:444,6\n167#1:476,6\n251#1:497,6\n170#1:452,6\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39426a = 32767;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39427a = new a();

        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var) {
            l0Var.Z1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f39428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f39429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1 f39430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39432e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.a0 a0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, a1 a1Var, int i10, int i11) {
            super(2);
            this.f39428a = a0Var;
            this.f39429b = function2;
            this.f39430c = a1Var;
            this.f39431d = i10;
            this.f39432e = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            n0.d(this.f39428a, this.f39429b, this.f39430c, c0Var, t4.a(this.f39431d | 1), this.f39432e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,416:1\n35#2,3:417\n39#2:438\n391#3,9:420\n400#3,3:435\n4360#4,6:429\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n*L\n178#1:417,3\n178#1:438\n180#1:420,9\n180#1:435,3\n182#1:429,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Function2<androidx.compose.runtime.c0, Integer, Unit>> f39433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list) {
            super(2);
            this.f39433a = list;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1271844412, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:177)");
            }
            List<Function2<androidx.compose.runtime.c0, Integer, Unit>> list = this.f39433a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = list.get(i11);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0I = aVar.i();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0I);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                function2.invoke(c0Var, 0);
                c0Var.o();
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

    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,416:1\n4459#2,2:417\n4461#2,2:425\n4360#3,6:419\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n200#1:417,2\n200#1:425,2\n202#1:419,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.l0 implements pj.n<u5<androidx.compose.ui.node.g>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f39434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.a0 a0Var) {
            super(3);
            this.f39434a = a0Var;
            int i10 = 3 | 3;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, androidx.compose.runtime.c0 c0Var2, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-511438721, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:197)");
            }
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, this.f39434a);
            c0Var.h0(509942095);
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            y7.n(c0VarD, a0VarN, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0Var.w0();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(u5<androidx.compose.ui.node.g> u5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(u5Var.h(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,416:1\n4459#2,2:417\n4461#2,2:425\n4360#3,6:419\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n*L\n222#1:417,2\n222#1:425,2\n224#1:419,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements pj.n<u5<androidx.compose.ui.node.g>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f39435a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.a0 a0Var) {
            super(3);
            this.f39435a = a0Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, androidx.compose.runtime.c0 c0Var2, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2123382363, i10, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:219)");
            }
            int iHashCode = Integer.hashCode(androidx.compose.runtime.v.j(c0Var2, 0));
            androidx.compose.ui.a0 a0VarO = androidx.compose.ui.m.o(c0Var2, this.f39435a);
            c0Var.h0(509942095);
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            y7.n(c0VarD, a0VarO, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0Var.w0();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(u5<androidx.compose.ui.node.g> u5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(u5Var.h(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void a(@Nullable androidx.compose.ui.a0 a0Var, @NotNull a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
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
        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1Var, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        y7.n(c0VarD, a0VarN, aVar.f());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        c0Var.o();
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void b(@NotNull List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list, @Nullable androidx.compose.ui.a0 a0Var, @NotNull h1 h1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = e(list);
        boolean z10 = (((i10 & 896) ^ a5.S0) > 256 && c0Var.D(h1Var)) || (i10 & a5.S0) == 256;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = j1.a(h1Var);
            c0Var.Y(objI0);
        }
        a1 a1Var = (a1) objI0;
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
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
        androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1Var, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        function2E.invoke(c0Var, 0);
        c0Var.o();
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void c(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, @NotNull a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        int i12 = ((i10 << 6) & 896) | 6;
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
        y7.n(c0VarD, a1Var, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        function2.invoke(c0Var, Integer.valueOf((i12 >> 6) & 14));
        c0Var.o();
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    @kotlin.l(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void d(@Nullable androidx.compose.ui.a0 a0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1663319424);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(a1Var) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1663319424, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:238)");
            }
            int iHashCode = Integer.hashCode(androidx.compose.runtime.v.j(c0VarR, 0));
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            Function0<androidx.compose.ui.node.l0> function0A = androidx.compose.ui.node.l0.f39845y3.a();
            int i14 = ((i12 << 3) & 896) | 6;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            y7.n(c0VarD, a1Var, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            y7.i(c0VarD, a.f39427a);
            y7.n(c0VarD, a0VarN, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            function2.invoke(c0VarR, Integer.valueOf((i14 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(a0Var2, function2, a1Var, i10, i11));
        }
    }

    @kotlin.a1
    @NotNull
    public static final Function2<androidx.compose.runtime.c0, Integer, Unit> e(@NotNull List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list) {
        return androidx.compose.runtime.internal.w.c(1271844412, true, new c(list));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    @NotNull
    @kotlin.a1
    @oj.i(name = "materializerOf")
    public static final pj.n<u5<androidx.compose.ui.node.g>, androidx.compose.runtime.c0, Integer, Unit> f(@NotNull androidx.compose.ui.a0 a0Var) {
        return androidx.compose.runtime.internal.w.c(-2123382363, true, new e(a0Var));
    }

    @kotlin.a1
    @oj.i(name = "modifierMaterializerOf")
    @NotNull
    public static final pj.n<u5<androidx.compose.ui.node.g>, androidx.compose.runtime.c0, Integer, Unit> g(@NotNull androidx.compose.ui.a0 a0Var) {
        return androidx.compose.runtime.internal.w.c(-511438721, true, new d(a0Var));
    }
}
