package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class BlockGraphicsLayerElement extends androidx.compose.ui.node.e1<g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<r1, Unit> f37502c;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@NotNull Function1<? super r1, Unit> function1) {
        this.f37502c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.f37502c == ((BlockGraphicsLayerElement) obj).f37502c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37502c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("graphicsLayer");
        t2Var.b().c("block", this.f37502c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        return new g0(this.f37502c);
    }

    @NotNull
    public final Function1<r1, Unit> m() {
        return this.f37502c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g0 g0Var) {
        g0Var.x9(this.f37502c);
        g0Var.w9();
    }
}
