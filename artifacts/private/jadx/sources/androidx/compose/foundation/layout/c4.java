package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntrinsic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,310:1\n110#2:311\n110#2:312\n110#2:313\n110#2:314\n*S KotlinDebug\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n57#1:311\n86#1:312\n111#1:313\n136#1:314\n*E\n"})
public final class c4 {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,110:1\n87#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4 f15946a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e4 e4Var) {
            super(1);
            this.f15946a = e4Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("height");
            t2Var.b().c("intrinsicSize", this.f15946a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,110:1\n137#2,3:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4 f15947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e4 e4Var) {
            super(1);
            this.f15947a = e4Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredHeight");
            t2Var.b().c("intrinsicSize", this.f15947a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,110:1\n112#2,3:111\n*E\n"})
    public static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4 f15948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e4 e4Var) {
            super(1);
            this.f15948a = e4Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("requiredWidth");
            t2Var.b().c("intrinsicSize", this.f15948a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,110:1\n58#2,3:111\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4 f15949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e4 e4Var) {
            super(1);
            this.f15949a = e4Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("width");
            t2Var.b().c("intrinsicSize", this.f15949a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull e4 e4Var) {
        return a0Var.B2(new IntrinsicHeightElement(e4Var, true, androidx.compose.ui.platform.r2.e() ? new a(e4Var) : androidx.compose.ui.platform.r2.b()));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull e4 e4Var) {
        return a0Var.B2(new IntrinsicHeightElement(e4Var, false, androidx.compose.ui.platform.r2.e() ? new b(e4Var) : androidx.compose.ui.platform.r2.b()));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull e4 e4Var) {
        return a0Var.B2(new IntrinsicWidthElement(e4Var, false, androidx.compose.ui.platform.r2.e() ? new c(e4Var) : androidx.compose.ui.platform.r2.b()));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull e4 e4Var) {
        return a0Var.B2(new IntrinsicWidthElement(e4Var, true, androidx.compose.ui.platform.r2.e() ? new d(e4Var) : androidx.compose.ui.platform.r2.b()));
    }
}
