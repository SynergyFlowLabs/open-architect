package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.w0;
import coil.decode.g;
import coil.size.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nScaleDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleDrawable.kt\ncoil/drawable/ScaleDrawable\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,120:1\n30#2,7:121\n*S KotlinDebug\n*F\n+ 1 ScaleDrawable.kt\ncoil/drawable/ScaleDrawable\n*L\n38#1:121,7\n*E\n"})
public final class c extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f87337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f87338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f87339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f87340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f87341e;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public c(@NotNull Drawable drawable) {
        this(drawable, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Drawable a() {
        return this.f87337a;
    }

    @NotNull
    public final h d() {
        return this.f87338b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f87339c, this.f87340d);
            float f10 = this.f87341e;
            canvas.scale(f10, f10);
            this.f87337a.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f87337a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.f87337a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f87337a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f87337a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @l(message = "Deprecated in Java")
    public int getOpacity() {
        return this.f87337a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.f87337a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        int intrinsicWidth = this.f87337a.getIntrinsicWidth();
        int intrinsicHeight = this.f87337a.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f87337a.setBounds(rect);
            this.f87339c = 0.0f;
            this.f87340d = 0.0f;
            this.f87341e = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dC = g.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f87338b);
        double d10 = 2;
        int iK0 = kotlin.math.b.K0((((double) iWidth) - (((double) intrinsicWidth) * dC)) / d10);
        int iK1 = kotlin.math.b.K0((((double) iHeight) - (((double) intrinsicHeight) * dC)) / d10);
        this.f87337a.setBounds(iK0, iK1, intrinsicWidth + iK0, intrinsicHeight + iK1);
        this.f87339c = rect.left;
        this.f87340d = rect.top;
        this.f87341e = (float) dC;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f87337a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NotNull int[] iArr) {
        return this.f87337a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f87337a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f87337a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f87337a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    @w0(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        this.f87337a.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f87337a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f87337a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f87337a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f87337a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public /* synthetic */ c(Drawable drawable, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i10 & 2) != 0 ? h.FIT : hVar);
    }

    @j
    public c(@NotNull Drawable drawable, @NotNull h hVar) {
        this.f87337a = drawable;
        this.f87338b = hVar;
        this.f87341e = 1.0f;
        drawable.setCallback(this);
    }
}
