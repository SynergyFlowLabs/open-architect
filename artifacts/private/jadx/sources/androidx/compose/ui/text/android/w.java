package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(31)
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f41441a = new w();

    private w() {
    }

    public final void a(@NotNull Canvas canvas, @NotNull int[] iArr, int i10, @NotNull float[] fArr, int i11, int i12, @NotNull Font font, @NotNull Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull Rect rect, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull RectF rectF, @Nullable Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
