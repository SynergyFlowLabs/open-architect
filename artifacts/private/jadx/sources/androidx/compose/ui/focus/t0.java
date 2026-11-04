package androidx.compose.ui.focus;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static final void a(@NotNull FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.k.v(focusTargetNode).getFocusOwner().u(focusTargetNode);
    }
}
