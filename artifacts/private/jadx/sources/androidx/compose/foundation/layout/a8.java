package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,229:1\n110#2:230\n110#2:231\n110#2:232\n110#2:233\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n52#1:230\n84#1:231\n113#1:232\n136#1:233\n*E\n"})
public final class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final pj.n<v6, androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, Integer> f15908a = new pj.n() { // from class: androidx.compose.foundation.layout.w7
        @Override // pj.n
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Integer.valueOf(a8.g((v6) obj, (androidx.compose.ui.unit.w) obj2, (androidx.compose.ui.unit.d) obj3));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final pj.n<v6, androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, Integer> f15909b = new pj.n() { // from class: androidx.compose.foundation.layout.x7
        @Override // pj.n
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Integer.valueOf(a8.f((v6) obj, (androidx.compose.ui.unit.w) obj2, (androidx.compose.ui.unit.d) obj3));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function2<v6, androidx.compose.ui.unit.d, Integer> f15910c = new Function2() { // from class: androidx.compose.foundation.layout.y7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(a8.h((v6) obj, (androidx.compose.ui.unit.d) obj2));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Function2<v6, androidx.compose.ui.unit.d, Integer> f15911d = new Function2() { // from class: androidx.compose.foundation.layout.z7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(a8.e((v6) obj, (androidx.compose.ui.unit.d) obj2));
        }
    };

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,110:1\n137#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f15912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v6 v6Var) {
            super(1);
            this.f15912a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("insetsBottomHeight");
            t2Var.b().c("insets", this.f15912a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,110:1\n85#2,3:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f15913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v6 v6Var) {
            super(1);
            this.f15913a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("insetsEndWidth");
            t2Var.b().c("insets", this.f15913a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,110:1\n53#2,3:111\n*E\n"})
    public static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f15914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v6 v6Var) {
            super(1);
            this.f15914a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("insetsStartWidth");
            t2Var.b().c("insets", this.f15914a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,110:1\n114#2,3:111\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v6 f15915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v6 v6Var) {
            super(1);
            this.f15915a = v6Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("insetsTopHeight");
            t2Var.b().c("insets", this.f15915a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(v6 v6Var, androidx.compose.ui.unit.d dVar) {
        return v6Var.c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(v6 v6Var, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
        return wVar == androidx.compose.ui.unit.w.Rtl ? v6Var.d(dVar, wVar) : v6Var.b(dVar, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(v6 v6Var, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? v6Var.d(dVar, wVar) : v6Var.b(dVar, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(v6 v6Var, androidx.compose.ui.unit.d dVar) {
        return v6Var.a(dVar);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return a0Var.B2(new n1(v6Var, androidx.compose.ui.platform.r2.e() ? new a(v6Var) : androidx.compose.ui.platform.r2.b(), f15911d));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return a0Var.B2(new q1(v6Var, androidx.compose.ui.platform.r2.e() ? new b(v6Var) : androidx.compose.ui.platform.r2.b(), f15909b));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return a0Var.B2(new q1(v6Var, androidx.compose.ui.platform.r2.e() ? new c(v6Var) : androidx.compose.ui.platform.r2.b(), f15908a));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 l(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v6 v6Var) {
        return a0Var.B2(new n1(v6Var, androidx.compose.ui.platform.r2.e() ? new d(v6Var) : androidx.compose.ui.platform.r2.b(), f15910c));
    }
}
