package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f38009a = new s();

    private s() {
    }

    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
