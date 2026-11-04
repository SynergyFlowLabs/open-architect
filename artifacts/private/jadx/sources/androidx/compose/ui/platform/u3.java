package androidx.compose.ui.platform;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(28)
final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u3 f40904a = new u3();

    private u3() {
    }

    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(@NotNull RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(@NotNull RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
