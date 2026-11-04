package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class c2 extends i2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.x1 f39288c;

    public c2(@NotNull androidx.compose.ui.node.x1 x1Var) {
        this.f39288c = x1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    @NotNull
    public androidx.compose.ui.unit.w J() {
        return this.f39288c.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2.a
    public int K() {
        return this.f39288c.getRoot().getWidth();
    }

    @NotNull
    public final androidx.compose.ui.node.x1 L0() {
        return this.f39288c;
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39288c.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.i2.a, androidx.compose.ui.unit.n
    public float m0() {
        return this.f39288c.getDensity().m0();
    }

    @Override // androidx.compose.ui.layout.i2.a
    @NotNull
    public g0 n() {
        return this.f39288c.getRoot().F0();
    }
}
