package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(23)
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f38008a = new r();

    private r() {
    }

    public final void a(@NotNull RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
