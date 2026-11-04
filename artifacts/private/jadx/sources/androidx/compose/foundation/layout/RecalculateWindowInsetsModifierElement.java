package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class RecalculateWindowInsetsModifierElement extends androidx.compose.ui.node.e1<p5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final RecalculateWindowInsetsModifierElement f15816c = new RecalculateWindowInsetsModifierElement();

    private RecalculateWindowInsetsModifierElement() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("recalculateWindowInsets");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p5 a() {
        return new p5();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull p5 p5Var) {
    }
}
