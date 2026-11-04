package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@u1
public final class v0 implements e2, u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16482c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h2 f16483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y2 f16484b;

    public v0(@NotNull y2 y2Var) {
        this.f16483a = new h2(y2Var);
        this.f16484b = y2Var;
    }

    @Override // androidx.compose.foundation.layout.e2
    public int a() {
        return this.f16483a.a();
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16483a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.i2
    @u1
    @NotNull
    public androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return this.f16483a.g(a0Var, f10);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16483a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.e2
    public int i() {
        return this.f16483a.i();
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.h3 h3Var) {
        return this.f16483a.n(a0Var, h3Var);
    }

    @Override // androidx.compose.foundation.layout.m0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.b bVar) {
        return this.f16483a.p(a0Var, bVar);
    }
}
