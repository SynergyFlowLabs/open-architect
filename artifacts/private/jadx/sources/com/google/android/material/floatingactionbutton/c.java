package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.collection.b3;
import androidx.core.graphics.h;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
class c extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f112621q = 1.3333f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f112623b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @r
    float f112629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    private int f112630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    private int f112631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l
    private int f112632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l
    private int f112633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    private int f112634m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p f112636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private ColorStateList f112637p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f112622a = q.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f112624c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f112625d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f112626e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f112627f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f112628g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f112635n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(p pVar) {
        this.f112636o = pVar;
        Paint paint = new Paint(1);
        this.f112623b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    private Shader a() {
        Rect rect = this.f112625d;
        copyBounds(rect);
        float fHeight = this.f112629h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{h.v(this.f112630i, this.f112634m), h.v(this.f112631j, this.f112634m), h.v(h.D(this.f112631j, 0), this.f112634m), h.v(h.D(this.f112633l, 0), this.f112634m), h.v(this.f112633l, this.f112634m), h.v(this.f112632k, this.f112634m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    protected RectF b() {
        this.f112627f.set(getBounds());
        return this.f112627f;
    }

    public p c() {
        return this.f112636o;
    }

    void d(@p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f112634m = colorStateList.getColorForState(getState(), this.f112634m);
        }
        this.f112637p = colorStateList;
        this.f112635n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f112635n) {
            this.f112623b.setShader(a());
            this.f112635n = false;
        }
        float strokeWidth = this.f112623b.getStrokeWidth() / 2.0f;
        copyBounds(this.f112625d);
        this.f112626e.set(this.f112625d);
        float fMin = Math.min(this.f112636o.r().a(b()), this.f112626e.width() / 2.0f);
        if (this.f112636o.u(b())) {
            this.f112626e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f112626e, fMin, fMin, this.f112623b);
        }
    }

    public void e(@r float f10) {
        if (this.f112629h != f10) {
            this.f112629h = f10;
            this.f112623b.setStrokeWidth(f10 * f112621q);
            this.f112635n = true;
            invalidateSelf();
        }
    }

    void f(@l int i10, @l int i11, @l int i12, @l int i13) {
        this.f112630i = i10;
        this.f112631j = i11;
        this.f112632k = i12;
        this.f112633l = i13;
    }

    public void g(p pVar) {
        this.f112636o = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f112628g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f112629h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @e.b(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f112636o.u(b())) {
            outline.setRoundRect(getBounds(), this.f112636o.r().a(b()));
        } else {
            copyBounds(this.f112625d);
            this.f112626e.set(this.f112625d);
            this.f112622a.d(this.f112636o, 1.0f, this.f112626e, this.f112624c);
            com.google.android.material.drawable.a.l(outline, this.f112624c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f112636o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f112629h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f112637p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f112635n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f112637p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f112634m)) != this.f112634m) {
            this.f112635n = true;
            this.f112634m = colorForState;
        }
        if (this.f112635n) {
            invalidateSelf();
        }
        return this.f112635n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
        this.f112623b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f112623b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
