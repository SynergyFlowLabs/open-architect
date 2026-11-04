package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,405:1\n93#2,4:406\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n382#1:406,4\n*E\n"})
public final class y5 implements x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y5 f16577a = new y5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16578b = 0;

    private y5() {
    }

    @Override // androidx.compose.foundation.layout.x5
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return a0Var.B2(new WithAlignmentLineBlockElement(function1));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            x.a.f("invalid weight; must be greater than zero");
        }
        return a0Var.B2(new LayoutWeightElement(kotlin.ranges.r.A(f10, Float.MAX_VALUE), z10));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar) {
        return a0Var.B2(new WithAlignmentLineElement(sVar));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar) {
        return a0Var.B2(new VerticalAlignElement(cVar));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var) {
        return k(a0Var, androidx.compose.ui.layout.b.a());
    }
}
