package androidx.compose.ui;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class KeepScreenOnElement extends e1<v> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final KeepScreenOnElement f36925c = new KeepScreenOnElement();

    private KeepScreenOnElement() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return this == obj || (obj instanceof KeepScreenOnElement);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return -84078893;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("keepScreenOn");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v a() {
        return new v();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v vVar) {
    }

    @NotNull
    public String toString() {
        return "KeepScreenOnElement";
    }
}
