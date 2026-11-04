package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class FocusGroupPropertiesElement extends e1<g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusGroupPropertiesElement f42732c = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return -1929324230;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("FocusGroupProperties");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g gVar) {
    }
}
