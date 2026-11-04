package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class c2 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.b1 f39707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f39708b;

    public c2(@NotNull androidx.compose.ui.layout.b1 b1Var, @NotNull u0 u0Var) {
        this.f39707a = b1Var;
        this.f39708b = u0Var;
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return this.f39708b.n().I();
    }

    @NotNull
    public final u0 a() {
        return this.f39708b;
    }

    @NotNull
    public final androidx.compose.ui.layout.b1 b() {
        return this.f39707a;
    }

    public final void c(@NotNull androidx.compose.ui.layout.b1 b1Var) {
        this.f39707a = b1Var;
    }
}
