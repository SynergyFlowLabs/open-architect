package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@u1
public final class h1 implements o3, g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16068c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ r3 f16069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y2 f16070b;

    public h1(@NotNull y2 y2Var) {
        this.f16069a = new r3(y2Var);
        this.f16070b = y2Var;
    }

    @Override // androidx.compose.foundation.layout.o3
    public int a() {
        return this.f16069a.a();
    }

    @Override // androidx.compose.foundation.layout.s3
    @u1
    @NotNull
    public androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return this.f16069a.c(a0Var, f10);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        return this.f16069a.e(a0Var, function1);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return this.f16069a.h(a0Var, f10, z10);
    }

    @Override // androidx.compose.foundation.layout.o3
    public int i() {
        return this.f16069a.i();
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.s sVar) {
        return this.f16069a.k(a0Var, sVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e.c cVar) {
        return this.f16069a.n(a0Var, cVar);
    }

    @Override // androidx.compose.foundation.layout.x5
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 o(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f16069a.o(a0Var);
    }
}
