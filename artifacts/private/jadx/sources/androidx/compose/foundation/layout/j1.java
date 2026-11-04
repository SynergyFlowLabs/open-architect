package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowRowScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,584:1\n93#2,4:585\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowRowScopeImpl\n*L\n343#1:585,4\n*E\n"})
public final class j1 implements x5, i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16135f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y5 f16136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16140e;

    public /* synthetic */ j1(int i10, int i11, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, f10, f11);
    }

    @Override // androidx.compose.foundation.layout.i1
    public int b() {
        return this.f16137b;
    }

    @Override // androidx.compose.foundation.layout.i1
    @NotNull
    public androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            x.a.f("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return a0Var.B2(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16136a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.i1
    public int f() {
        return this.f16138c;
    }

    @Override // androidx.compose.foundation.layout.i1
    public float g() {
        return this.f16140e;
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16136a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar) {
        return this.f16136a.k(a0Var, sVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar) {
        return this.f16136a.n(a0Var, cVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f16136a.o(a0Var);
    }

    @Override // androidx.compose.foundation.layout.i1
    public float p() {
        return this.f16139d;
    }

    private j1(int i10, int i11, float f10, float f11) {
        this.f16136a = y5.f16577a;
        this.f16137b = i10;
        this.f16138c = i11;
        this.f16139d = f10;
        this.f16140e = f11;
    }
}
