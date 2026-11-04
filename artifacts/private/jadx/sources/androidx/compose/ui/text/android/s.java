package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(30)
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f41415a = new s();

    private s() {
    }

    public final boolean a(@NotNull Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    public final boolean b(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
