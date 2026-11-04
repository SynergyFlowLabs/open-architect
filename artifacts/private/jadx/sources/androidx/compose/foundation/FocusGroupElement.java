package androidx.compose.foundation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusGroupElement extends androidx.compose.ui.node.e1<d2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusGroupElement f13868c = new FocusGroupElement();

    private FocusGroupElement() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return -1063782265;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("focusGroup");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d2 a() {
        return new d2();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d2 d2Var) {
    }
}
