package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,332:1\n110#2:333\n110#2:334\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n273#1:333\n286#1:334\n*E\n"})
public final class d0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f15956a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15957b = 0;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n1#1,110:1\n274#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar) {
            super(1);
            this.f15958a = eVar;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("align");
            t2Var.e(this.f15958a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n1#1,110:1\n286#2:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {
        public b() {
            super(1);
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("matchParentSize");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    private d0() {
    }

    @Override // androidx.compose.foundation.layout.c0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e eVar) {
        return a0Var.B2(new BoxChildDataElement(eVar, false, androidx.compose.ui.platform.r2.e() ? new a(eVar) : androidx.compose.ui.platform.r2.b()));
    }

    @Override // androidx.compose.foundation.layout.c0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(new BoxChildDataElement(androidx.compose.ui.e.f37317a.i(), true, androidx.compose.ui.platform.r2.e() ? new b() : androidx.compose.ui.platform.r2.b()));
    }
}
