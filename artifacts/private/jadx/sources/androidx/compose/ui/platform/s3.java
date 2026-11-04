package androidx.compose.ui.platform;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(23)
final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s3 f40882a = new s3();

    private s3() {
    }

    public final void a(@NotNull RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
