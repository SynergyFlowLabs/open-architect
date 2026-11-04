package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,1585:1\n93#2,4:1586\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n*L\n386#1:1586,4\n*E\n"})
public final class j2 implements m0, i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final j2 f16141b = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16142c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n0 f16143a = n0.f16227a;

    private j2() {
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16143a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.i2
    @NotNull
    public androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        if (!(f10 >= 0.0f && f10 <= 1.0f)) {
            x.a.f("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return a0Var.B2(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16143a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.h3 h3Var) {
        return this.f16143a.n(a0Var, h3Var);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar) {
        return this.f16143a.p(a0Var, bVar);
    }
}
