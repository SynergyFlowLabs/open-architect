package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,382:1\n93#2,4:383\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n360#1:383,4\n*E\n"})
public final class n0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f16227a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16228b = 0;

    private n0() {
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return a0Var.B2(new WithAlignmentLineBlockElement(function1));
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            x.a.f("invalid weight; must be greater than zero");
        }
        return a0Var.B2(new LayoutWeightElement(kotlin.ranges.r.A(f10, Float.MAX_VALUE), z10));
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.h3 h3Var) {
        return a0Var.B2(new WithAlignmentLineElement(h3Var));
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar) {
        return a0Var.B2(new HorizontalAlignElement(bVar));
    }
}
