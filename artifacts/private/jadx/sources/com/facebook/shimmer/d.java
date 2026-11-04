package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f102140a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f102141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f102142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f102143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ValueAnimator f102144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c f102145f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.invalidateSelf();
        }
    }

    public d() {
        Paint paint = new Paint();
        this.f102141b = paint;
        this.f102142c = new Rect();
        this.f102143d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private void g() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth != 0 && iHeight != 0 && (cVar = this.f102145f) != null) {
            int iE = cVar.e(iWidth);
            int iA = this.f102145f.a(iHeight);
            c cVar2 = this.f102145f;
            boolean z10 = true;
            if (cVar2.f102124g != 1) {
                int i10 = cVar2.f102121d;
                if (i10 != 1 && i10 != 3) {
                    z10 = false;
                }
                if (z10) {
                    iE = 0;
                }
                if (!z10) {
                    iA = 0;
                }
                float f10 = iA;
                c cVar3 = this.f102145f;
                radialGradient = new LinearGradient(0.0f, 0.0f, iE, f10, cVar3.f102119b, cVar3.f102118a, Shader.TileMode.CLAMP);
            } else {
                float f11 = iA / 2.0f;
                float fMax = (float) (((double) Math.max(iE, iA)) / Math.sqrt(2.0d));
                c cVar4 = this.f102145f;
                radialGradient = new RadialGradient(iE / 2.0f, f11, fMax, cVar4.f102119b, cVar4.f102118a, Shader.TileMode.CLAMP);
            }
            this.f102141b.setShader(radialGradient);
        }
    }

    private void h() {
        boolean zIsStarted;
        if (this.f102145f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f102144e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f102144e.cancel();
            this.f102144e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        c cVar = this.f102145f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (cVar.f102138u / cVar.f102137t) + 1.0f);
        this.f102144e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f102145f.f102136s);
        this.f102144e.setRepeatCount(this.f102145f.f102135r);
        ValueAnimator valueAnimator2 = this.f102144e;
        c cVar2 = this.f102145f;
        valueAnimator2.setDuration(cVar2.f102137t + cVar2.f102138u);
        this.f102144e.addUpdateListener(this.f102140a);
        if (zIsStarted) {
            this.f102144e.start();
        }
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.f102144e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    void b() {
        c cVar;
        ValueAnimator valueAnimator = this.f102144e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cVar = this.f102145f) == null || !cVar.f102133p || getCallback() == null) {
            return;
        }
        this.f102144e.start();
    }

    public void d(@p0 c cVar) {
        this.f102145f = cVar;
        if (cVar != null) {
            this.f102141b.setXfermode(new PorterDuffXfermode(this.f102145f.f102134q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fC;
        float fC2;
        if (this.f102145f != null && this.f102141b.getShader() != null) {
            float fTan = (float) Math.tan(Math.toRadians(this.f102145f.f102131n));
            float fHeight = this.f102142c.height() + (this.f102142c.width() * fTan);
            float fWidth = this.f102142c.width() + (fTan * this.f102142c.height());
            ValueAnimator valueAnimator = this.f102144e;
            float f10 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i10 = this.f102145f.f102121d;
            if (i10 != 1) {
                if (i10 == 2) {
                    fC2 = c(fWidth, -fWidth, animatedFraction);
                } else if (i10 != 3) {
                    fC2 = c(-fWidth, fWidth, animatedFraction);
                } else {
                    fC = c(fHeight, -fHeight, animatedFraction);
                }
                f10 = fC2;
                fC = 0.0f;
            } else {
                fC = c(-fHeight, fHeight, animatedFraction);
            }
            this.f102143d.reset();
            this.f102143d.setRotate(this.f102145f.f102131n, this.f102142c.width() / 2.0f, this.f102142c.height() / 2.0f);
            this.f102143d.postTranslate(f10, fC);
            this.f102141b.getShader().setLocalMatrix(this.f102143d);
            canvas.drawRect(this.f102142c, this.f102141b);
        }
    }

    public void e() {
        if (this.f102144e != null && !a() && getCallback() != null) {
            this.f102144e.start();
        }
    }

    public void f() {
        if (this.f102144e == null || !a()) {
            return;
        }
        this.f102144e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        c cVar = this.f102145f;
        return (cVar == null || !(cVar.f102132o || cVar.f102134q)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f102142c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
    }
}
