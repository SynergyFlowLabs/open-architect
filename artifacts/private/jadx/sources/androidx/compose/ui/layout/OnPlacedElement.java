package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class OnPlacedElement extends androidx.compose.ui.node.e1<w1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<g0, Unit> f39229c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@NotNull Function1<? super g0, Unit> function1) {
        this.f39229c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && this.f39229c == ((OnPlacedElement) obj).f39229c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f39229c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onPlaced");
        t2Var.b().c("onPlaced", this.f39229c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public w1 a() {
        return new w1(this.f39229c);
    }

    @NotNull
    public final Function1<g0, Unit> m() {
        return this.f39229c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull w1 w1Var) {
        w1Var.w9(this.f39229c);
    }
}
