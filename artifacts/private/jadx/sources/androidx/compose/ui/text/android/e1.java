package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class e1 extends Canvas {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41368b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f41369a;

    public final void a(@NotNull Canvas canvas) {
        this.f41369a = canvas;
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutPath(@NotNull Path path) {
        n nVar = n.f41411a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nVar.a(canvas, path);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(@NotNull RectF rectF) {
        n nVar = n.f41411a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nVar.e(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean clipRect(@NotNull RectF rectF, @NotNull Region.Op op) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@Nullable Matrix matrix) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void disableZ() {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.a(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
            int i14 = 6 << 0;
        }
        canvas.drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@NotNull RectF rectF, float f10, float f11, boolean z10, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, float f10, float f11, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap, int i10, int i11, @NotNull float[] fArr, int i12, @Nullable int[] iArr, int i13, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawDoubleRoundRect(@NotNull RectF rectF, float f10, float f11, @NotNull RectF rectF2, float f12, float f13, @NotNull Paint paint) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.e(canvas, rectF, f10, f11, rectF2, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawGlyphs(@NotNull int[] iArr, int i10, @NotNull float[] fArr, int i11, int i12, @NotNull Font font, @NotNull Paint paint) {
        w wVar = w.f41441a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wVar.a(canvas, iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] fArr, int i10, int i11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
            int i12 = 3 & 0;
        }
        canvas.drawLines(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@NotNull RectF rectF, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawPatch(@NotNull NinePatch ninePatch, @NotNull Rect rect, @Nullable Paint paint) {
        w wVar = w.f41441a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wVar.b(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@Nullable float[] fArr, int i10, int i11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public void drawPosText(@NotNull char[] cArr, int i10, int i11, @NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull RectF rectF, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawRenderNode(@NotNull RenderNode renderNode) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.g(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rectF, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull char[] cArr, int i10, int i11, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] cArr, int i10, int i11, @NotNull Path path, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(23)
    public void drawTextRun(@NotNull char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        m mVar = m.f41410a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        mVar.b(canvas, cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode vertexMode, int i10, @NotNull float[] fArr, int i11, @Nullable float[] fArr2, int i12, @Nullable int[] iArr, int i13, @Nullable short[] sArr, int i14, int i15, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void enableZ() {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.i(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect rect) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @Nullable
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public void getMatrix(@NotNull Matrix matrix) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean quickReject(@NotNull RectF rectF, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public int saveLayer(@Nullable RectF rectF, @Nullable Paint paint, int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i10);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public int saveLayerAlpha(@Nullable RectF rectF, int i10, int i11) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@Nullable Bitmap bitmap) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@Nullable DrawFilter drawFilter) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@Nullable Matrix matrix) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(@NotNull Rect rect) {
        n nVar = n.f41411a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
            boolean z10 = true;
        }
        return nVar.d(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull RectF rectF, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(long j10) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.c(canvas, j10);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawPatch(@NotNull NinePatch ninePatch, @NotNull RectF rectF, @Nullable Paint paint) {
        w wVar = w.f41441a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wVar.c(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull RectF rectF) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public void drawPosText(@NotNull String str, @NotNull float[] fArr, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull Rect rect, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String str, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String str, @NotNull Path path, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(@NotNull RectF rectF) {
        s sVar = s.f41415a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sVar.c(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@Nullable RectF rectF, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF rectF, int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
            int i11 = 6 ^ 0;
        }
        return canvas.saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        n nVar = n.f41411a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nVar.b(canvas, f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rectF) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull Rect rect2, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, @NotNull PorterDuff.Mode mode) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull Rect rect) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String str, int i10, int i11, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public int saveLayer(float f10, float f11, float f12, float f13, @Nullable Paint paint, int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        n nVar = n.f41411a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nVar.c(canvas, i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(int i10, @NotNull BlendMode blendMode) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.b(canvas, i10, blendMode);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawDoubleRoundRect(@NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull CharSequence charSequence, int i10, int i11, float f10, float f11, @NotNull Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(23)
    public void drawTextRun(@NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        m mVar = m.f41410a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        mVar.a(canvas, charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(@NotNull Path path) {
        s sVar = s.f41415a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sVar.b(canvas, path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean clipRect(float f10, float f11, float f12, float f13, @NotNull Region.Op op) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(long j10, @NotNull BlendMode blendMode) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.d(canvas, j10, blendMode);
    }

    @Override // android.graphics.Canvas
    @kotlin.l(message = "Deprecated in Java")
    public boolean quickReject(float f10, float f11, float f12, float f13, @NotNull Canvas.EdgeType edgeType) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, @Nullable Paint paint) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        s sVar = s.f41415a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sVar.a(canvas, f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawTextRun(@NotNull MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @NotNull Paint paint) {
        o oVar = o.f41413a;
        Canvas canvas = this.f41369a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        oVar.h(canvas, measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
