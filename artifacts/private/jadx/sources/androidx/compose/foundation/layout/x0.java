package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,584:1\n93#2,4:585\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl\n*L\n358#1:585,4\n*E\n"})
public final class x0 implements m0, w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16529f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n0 f16530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16534e;

    public /* synthetic */ x0(int i10, int i11, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, f10, f11);
    }

    @Override // androidx.compose.foundation.layout.w0
    public int b() {
        return this.f16531b;
    }

    @Override // androidx.compose.foundation.layout.w0
    public float c() {
        return this.f16533d;
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16530a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.w0
    public int f() {
        return this.f16532c;
    }

    @Override // androidx.compose.foundation.layout.w0
    @NotNull
    public androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
            int i10 = 2 << 1;
        }
        if (!z10) {
            x.a.f("invalid fraction " + f10 + "; must be >= 0 and <= 1.0");
        }
        return a0Var.B2(new FillCrossAxisSizeElement(f10));
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16530a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.w0
    public float m() {
        return this.f16534e;
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.h3 h3Var) {
        return this.f16530a.n(a0Var, h3Var);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar) {
        return this.f16530a.p(a0Var, bVar);
    }

    private x0(int i10, int i11, float f10, float f11) {
        this.f16530a = n0.f16227a;
        this.f16531b = i10;
        this.f16532c = i11;
        this.f16533d = f10;
        this.f16534e = f11;
    }
}
