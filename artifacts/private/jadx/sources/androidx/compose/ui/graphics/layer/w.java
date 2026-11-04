package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(23)
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f38016a = new w();

    private w() {
    }

    @NotNull
    public final Canvas a(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
