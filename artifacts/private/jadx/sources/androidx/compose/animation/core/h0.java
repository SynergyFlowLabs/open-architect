package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class h0<T> implements g0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f12992a;

    public h0(@NotNull a1 a1Var) {
        this.f12992a = a1Var;
    }

    @Override // androidx.compose.animation.core.g0
    @NotNull
    public <V extends w> w4<V> a(@NotNull z3<T, V> z3Var) {
        return new a5(this.f12992a);
    }
}
