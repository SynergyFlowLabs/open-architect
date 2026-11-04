package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f38010a = new t();

    private t() {
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
