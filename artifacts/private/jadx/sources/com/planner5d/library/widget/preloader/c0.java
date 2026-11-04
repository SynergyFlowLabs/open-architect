package com.planner5d.library.widget.preloader;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.canhub.cropper.core.CropImageOptions;

/* JADX INFO: loaded from: classes8.dex */
public class c0 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f258524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f258525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f258526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f258527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f258528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ObjectAnimator f258529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f258530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f258531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f258532i;

    private static class a extends Property<c0, Integer> {
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c0 c0Var) {
            return Integer.valueOf(c0Var.f258532i);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Integer num) {
            c0Var.f258532i = num.intValue();
            c0Var.invalidateSelf();
        }

        private a() {
            super(Integer.class, androidx.constraintlayout.motion.widget.f.f45124i);
        }
    }

    public c0(@androidx.annotation.l int i10) {
        this(i10, 0);
    }

    private Path c() {
        Path path = new Path();
        PointF pointF = new PointF(44.75713f, 18.4738f);
        path.moveTo(pointF.x, pointF.y);
        d(path, 0.703583d, 2.104d, 1.066615d, 4.3069d, 1.075375d, 6.5254d, pointF);
        e(path, 45.833196d, 36.5056d, 36.506027d, 45.8338d, 25.0d, 45.834d, pointF);
        e(path, 13.493971d, 45.8338d, 4.1668017d, 36.5056d, 4.1674927d, 25.0d, pointF);
        e(path, 4.1677287d, 13.4934d, 13.494626d, 4.1662d, 25.0d, 4.166d, pointF);
        d(path, 3.009117d, 0.01d, 5.980779d, 0.6678d, 8.710542d, 1.9341d, pointF);
        path.lineTo(35.441936f, 2.3216f);
        e(path, 32.176831d, 0.8006d, 28.61084d, 0.0092d, 25.0d, 0.0d, pointF);
        e(path, 11.193419d, 0.0d, 0.001d, 11.1922d, 0.0d, 25.0d, pointF);
        e(path, 0.0d, 38.8069d, 11.192754d, 50.0d, 25.0d, 50.0d, pointF);
        d(path, 13.807245d, 0.0d, 25.0d, -11.1931d, 25.0d, -25.0d, pointF);
        d(path, -0.01047d, -2.6623d, -0.446117d, -5.3058d, -1.301754d, -7.8422d, pointF);
        path.close();
        return path;
    }

    private void d(Path path, double d10, double d11, double d12, double d13, double d14, double d15, PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        path.cubicTo((float) (((double) f10) + d10), (float) (((double) f11) + d11), (float) (((double) f10) + d12), (float) (((double) f11) + d13), (float) (((double) f10) + d14), (float) (((double) f11) + d15));
        pointF.offset((float) d14, (float) d15);
    }

    private void e(Path path, double d10, double d11, double d12, double d13, double d14, double d15, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        d(path, d10, d11, d12, d13, d14, d15, pointF);
    }

    private void f(Rect rect, Path path, Path path2) {
        float fMin = Math.min(rect.width(), rect.height()) / 50.0f;
        this.f258530g.setScale(fMin, fMin);
        float f10 = fMin * 25.0f;
        this.f258530g.postTranslate(rect.centerX() - f10, rect.centerY() - f10);
        path.transform(this.f258530g, path2);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.getClipBounds(this.f258527d);
        Rect rect = this.f258527d;
        int i10 = this.f258531h;
        rect.inset(i10, i10);
        if (!this.f258528e.equals(this.f258527d)) {
            f(this.f258527d, this.f258525b, this.f258526c);
        }
        canvas.save();
        canvas.rotate(this.f258532i, this.f258527d.centerX(), this.f258527d.centerY());
        canvas.drawPath(this.f258526c, this.f258524a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int i10 = this.f258531h;
        if (i10 == 0) {
            return false;
        }
        rect.left += i10;
        rect.right -= i10;
        rect.top += i10;
        rect.bottom -= i10;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            this.f258529f.start();
            return visible;
        }
        this.f258529f.end();
        return visible;
    }

    public c0(Context context, @androidx.annotation.l int i10, int i11) {
        this(i10, context.getResources().getDimensionPixelSize(i11));
    }

    private c0(@androidx.annotation.l int i10, int i11) {
        Paint paint = new Paint(1);
        this.f258524a = paint;
        this.f258526c = new Path();
        this.f258527d = new Rect();
        this.f258528e = new Rect();
        this.f258530g = new Matrix();
        this.f258532i = 0;
        this.f258531h = i11;
        this.f258525b = c();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, new a(), 0, CropImageOptions.S3);
        this.f258529f = objectAnimatorOfInt;
        objectAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfInt.setDuration(750L);
        int i12 = 3 & (-1);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.preloader.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedFraction();
            }
        });
        objectAnimatorOfInt.start();
    }
}
