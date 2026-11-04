package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HandwritingHandlerElement extends e1<f> {
    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj instanceof HandwritingHandlerElement;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("handwritingHandler");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f();
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f fVar) {
    }
}
