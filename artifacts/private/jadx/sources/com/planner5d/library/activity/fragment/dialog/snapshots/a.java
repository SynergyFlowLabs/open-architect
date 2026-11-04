package com.planner5d.library.activity.fragment.dialog.snapshots;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a extends Drawable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f132940g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f132941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f132943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f132944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Paint f132945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final RectF f132946f;

    public a() {
        this(0, 0, 0.0f, 0.0f, 15, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.f132946f;
        float f10 = this.f132944d;
        canvas.drawRoundRect(rectF, f10, f10, this.f132945e);
    }

    @Override // android.graphics.drawable.Drawable
    @kotlin.l(message = "Deprecated in Java")
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        RectF rectF = this.f132946f;
        float f10 = bounds.left;
        float f11 = this.f132943c;
        float f12 = 2;
        rectF.set(f10 + (f11 / f12), bounds.top + (f11 / f12), bounds.right - (f11 / f12), bounds.bottom - (f11 / f12));
        RectF rectF2 = this.f132946f;
        this.f132945e.setShader(new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.f132941a, this.f132942b, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f132945e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f132945e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        i10 = (i12 & 1) != 0 ? -16726950 : i10;
        i11 = (i12 & 2) != 0 ? -16748844 : i11;
        f10 = (i12 & 4) != 0 ? 2.0f : f10;
        this(i10, i11, f10, (i12 & 8) != 0 ? 12.0f - (f10 / 2) : f11);
    }

    public a(int i10, int i11, float f10, float f11) {
        this.f132941a = i10;
        this.f132942b = i11;
        this.f132943c = f10;
        this.f132944d = f11;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10);
        paint.setAntiAlias(true);
        this.f132945e = paint;
        this.f132946f = new RectF();
    }
}
