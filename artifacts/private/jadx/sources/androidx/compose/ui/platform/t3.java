package androidx.compose.ui.platform;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(24)
final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t3 f40897a = new t3();

    private t3() {
    }

    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
