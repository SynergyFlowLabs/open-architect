package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class FocusTargetPropertiesElement extends e1<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusTargetPropertiesElement f42733c = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return -659549572;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("FocusTargetProperties");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h hVar) {
    }
}
