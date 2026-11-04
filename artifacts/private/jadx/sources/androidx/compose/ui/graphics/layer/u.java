package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.e3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(31)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f38011a = new u();

    private u() {
    }

    public final void a(@NotNull RenderNode renderNode, @Nullable e3 e3Var) {
        renderNode.setRenderEffect(e3Var != null ? e3Var.a() : null);
    }
}
