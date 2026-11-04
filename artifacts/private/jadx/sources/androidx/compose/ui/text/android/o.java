package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f41413a = new o();

    private o() {
    }

    public final void a(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(@NotNull Canvas canvas, int i10, @NotNull BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    public final void c(@NotNull Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    public final void d(@NotNull Canvas canvas, long j10, @NotNull BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }

    public final void e(@NotNull Canvas canvas, @NotNull RectF rectF, float f10, float f11, @NotNull RectF rectF2, float f12, float f13, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public final void f(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(@NotNull Canvas canvas, @NotNull MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void i(@NotNull Canvas canvas) {
        canvas.enableZ();
    }
}
