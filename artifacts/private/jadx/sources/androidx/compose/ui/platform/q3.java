package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(31)
final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q3 f40791a = new q3();

    private q3() {
    }

    public final void a(@NotNull RenderNode renderNode, @Nullable androidx.compose.ui.graphics.e3 e3Var) {
        renderNode.setRenderEffect(e3Var != null ? e3Var.a() : null);
    }
}
