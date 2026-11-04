package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,623:1\n110#2:624\n110#2:625\n110#2:626\n110#2:627\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n75#1:624\n96#1:625\n120#1:626\n137#1:627\n*E\n"})
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.modifier.p<v6> f16446a = androidx.compose.ui.modifier.g.a(new Function0() { // from class: androidx.compose.foundation.layout.s7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t7.b();
        }
    });

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,110:1\n97#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f16447a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v6 v6Var) {
            super(1);
            this.f16447a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("consumeWindowInsets");
            t2Var.b().c("insets", this.f16447a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,110:1\n121#2,3:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g5 f16448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g5 g5Var) {
            super(1);
            this.f16448a = g5Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("consumeWindowInsets");
            t2Var.b().c("paddingValues", this.f16448a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,623:1\n1282#2,6:624\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n*L\n101#1:624,6\n*E\n"})
    static final class c implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f16449a;

        c(v6 v6Var) {
            this.f16449a = v6Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(788931215);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(788931215, i10, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:100)");
            }
            boolean zD = c0Var.D(this.f16449a);
            v6 v6Var = this.f16449a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new q6(v6Var);
                c0Var.Y(objI0);
            }
            q6 q6Var = (q6) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q6Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,623:1\n1282#2,6:624\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n*L\n125#1:624,6\n*E\n"})
    static final class d implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g5 f16450a;

        d(g5 g5Var) {
            this.f16450a = g5Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(114694318);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(114694318, i10, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:124)");
            }
            boolean zD = c0Var.D(this.f16450a);
            g5 g5Var = this.f16450a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new h5(g5Var);
                c0Var.Y(objI0);
            }
            h5 h5Var = (h5) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return h5Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,110:1\n138#2,3:111\n*E\n"})
    public static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f16451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1) {
            super(1);
            this.f16451a = function1;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("onConsumedWindowInsetsChanged");
            t2Var.b().c("block", this.f16451a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,623:1\n1282#2,6:624\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n*L\n142#1:624,6\n*E\n"})
    static final class f implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<v6, Unit> f16452a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super v6, Unit> function1) {
            this.f16452a = function1;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1608161351);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:141)");
            }
            boolean zD = c0Var.D(this.f16452a);
            Function1<v6, Unit> function1 = this.f16452a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new p0(function1);
                c0Var.Y(objI0);
            }
            p0 p0Var = (p0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return p0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,110:1\n76#2,3:111\n*E\n"})
    public static final class g extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f16453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v6 v6Var) {
            super(1);
            this.f16453a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("windowInsetsPadding");
            t2Var.b().c("insets", this.f16453a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,623:1\n1282#2,6:624\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n*L\n80#1:624,6\n*E\n"})
    static final class h implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f16454a;

        h(v6 v6Var) {
            this.f16454a = v6Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1415685722);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1415685722, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:79)");
            }
            boolean zD = c0Var.D(this.f16454a);
            v6 v6Var = this.f16454a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new y3(v6Var);
                c0Var.Y(objI0);
            }
            y3 y3Var = (y3) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y3Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v6 b() {
        return b7.b(0, 0, 0, 0);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g5 g5Var) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new b(g5Var) : androidx.compose.ui.platform.r2.b(), new d(g5Var));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a(v6Var) : androidx.compose.ui.platform.r2.b(), new c(v6Var));
    }

    @NotNull
    public static final androidx.compose.ui.modifier.p<v6> e() {
        return f16446a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super v6, Unit> function1) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new e(function1) : androidx.compose.ui.platform.r2.b(), new f(function1));
    }

    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(RecalculateWindowInsetsModifierElement.f15816c);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new g(v6Var) : androidx.compose.ui.platform.r2.b(), new h(v6Var));
    }
}
