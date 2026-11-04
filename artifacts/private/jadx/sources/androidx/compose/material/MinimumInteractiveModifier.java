package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class MinimumInteractiveModifier extends androidx.compose.ui.node.e1<ka> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final MinimumInteractiveModifier f21933c = new MinimumInteractiveModifier();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21934d = 0;

    private MinimumInteractiveModifier() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return androidx.compose.material.internal.v.a(this);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("minimumInteractiveComponentSize");
        t2Var.b().c("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ka a() {
        return new ka();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull ka kaVar) {
    }
}
