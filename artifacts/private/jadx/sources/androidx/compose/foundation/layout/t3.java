package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowRowScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,1585:1\n93#2,4:1586\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowRowScopeInstance\n*L\n360#1:1586,4\n*E\n"})
public final class t3 implements x5, s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final t3 f16433b = new t3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16434c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y5 f16435a = y5.f16577a;

    private t3() {
    }

    @Override // androidx.compose.foundation.layout.s3
    @NotNull
    public androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        if (!(f10 >= 0.0f && f10 <= 1.0f)) {
            x.a.f("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return a0Var.B2(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16435a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16435a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar) {
        return this.f16435a.k(a0Var, sVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar) {
        return this.f16435a.n(a0Var, cVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f16435a.o(a0Var);
    }
}
