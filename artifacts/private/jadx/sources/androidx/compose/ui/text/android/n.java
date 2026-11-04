package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f41411a = new n();

    private n() {
    }

    public final boolean a(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(@NotNull Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    public final boolean c(@NotNull Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    public final boolean d(@NotNull Canvas canvas, @NotNull Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
