package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class LayoutElement extends androidx.compose.ui.node.e1<p0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pj.n<c1, z0, androidx.compose.ui.unit.b, b1> f39219c;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@NotNull pj.n<? super c1, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar) {
        this.f39219c = nVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.f39219c == ((LayoutElement) obj).f39219c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39219c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("layout");
        t2Var.b().c("measure", this.f39219c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p0 a() {
        return new p0(this.f39219c);
    }

    @NotNull
    public final pj.n<c1, z0, androidx.compose.ui.unit.b, b1> m() {
        return this.f39219c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull p0 p0Var) {
        p0Var.w9(this.f39219c);
    }
}
