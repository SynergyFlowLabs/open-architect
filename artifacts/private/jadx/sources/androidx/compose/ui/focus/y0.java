package androidx.compose.ui.focus;

import androidx.compose.ui.node.i2;
import androidx.compose.ui.node.j2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y0 f37476a = new y0();

    private y0() {
    }

    public final void a(@NotNull FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.j jVarW = focusTargetNode.w();
        i2 i2Var = jVarW instanceof i2 ? (i2) jVarW : null;
        if (i2Var != null) {
            j2.b(i2Var);
        }
    }
}
