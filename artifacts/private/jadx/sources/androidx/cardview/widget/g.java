package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
class g extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double f12091q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f12092r = 1.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static a f12093s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12094a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f12096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f12097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f12098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f12100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f12101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f12102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f12103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f12104k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f12107n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12105l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f12108o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f12109p = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f12095b = new Paint(5);

    interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f12106m = resources.getColor(s.a.b.f366811d);
        this.f12107n = resources.getColor(s.a.b.f366810c);
        this.f12094a = resources.getDimensionPixelSize(s.a.c.f366812a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f12096c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12099f = (int) (f10 + 0.5f);
        this.f12098e = new RectF();
        Paint paint2 = new Paint(this.f12096c);
        this.f12097d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    private void a(Rect rect) {
        float f10 = this.f12101h;
        float f11 = f12092r * f10;
        this.f12098e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    private void b() {
        float f10 = this.f12099f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f12102i;
        rectF2.inset(-f11, -f11);
        Path path = this.f12100g;
        if (path == null) {
            this.f12100g = new Path();
        } else {
            path.reset();
        }
        this.f12100g.setFillType(Path.FillType.EVEN_ODD);
        this.f12100g.moveTo(-this.f12099f, 0.0f);
        this.f12100g.rLineTo(-this.f12102i, 0.0f);
        this.f12100g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f12100g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f12100g.close();
        float f12 = this.f12099f;
        float f13 = f12 / (this.f12102i + f12);
        Paint paint = this.f12096c;
        float f14 = this.f12099f + this.f12102i;
        int i10 = this.f12106m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f12107n}, new float[]{0.0f, f13, 1.0f}, tileMode));
        Paint paint2 = this.f12097d;
        float f15 = this.f12099f;
        float f16 = this.f12102i;
        float f17 = (-f15) + f16;
        float f18 = (-f15) - f16;
        int i11 = this.f12106m;
        paint2.setShader(new LinearGradient(0.0f, f17, 0.0f, f18, new int[]{i11, i11, this.f12107n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f12097d.setAntiAlias(false);
    }

    static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f12091q) * ((double) f11))) : f10;
    }

    static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * f12092r)) + ((1.0d - f12091q) * ((double) f11))) : f10 * f12092r;
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.f12099f;
        float f11 = (-f10) - this.f12102i;
        float f12 = f10 + this.f12094a + (this.f12103j / 2.0f);
        float f13 = 2.0f * f12;
        boolean z10 = this.f12098e.width() - f13 > 0.0f;
        boolean z11 = this.f12098e.height() - f13 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f12098e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f12100g, this.f12096c);
        if (z10) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f11, this.f12098e.width() - f13, -this.f12099f, this.f12097d);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        RectF rectF2 = this.f12098e;
        canvas2.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f12100g, this.f12096c);
        if (z10) {
            canvas2.drawRect(0.0f, f11, this.f12098e.width() - f13, (-this.f12099f) + this.f12102i, this.f12097d);
        }
        canvas2.restoreToCount(iSave2);
        int iSave3 = canvas2.save();
        RectF rectF3 = this.f12098e;
        canvas2.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f12100g, this.f12096c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f12098e.height() - f13, -this.f12099f, this.f12097d);
        }
        canvas2.restoreToCount(iSave3);
        int iSave4 = canvas2.save();
        RectF rectF4 = this.f12098e;
        canvas2.translate(rectF4.right - f12, rectF4.top + f12);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f12100g, this.f12096c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f12098e.height() - f13, -this.f12099f, this.f12097d);
        }
        canvas2.restoreToCount(iSave4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12104k = colorStateList;
        this.f12095b.setColor(colorStateList.getColorForState(getState(), this.f12104k.getDefaultColor()));
    }

    private void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
        float fT = t(f10);
        float fT2 = t(f11);
        if (fT > fT2) {
            if (!this.f12109p) {
                this.f12109p = true;
            }
            fT = fT2;
        }
        if (this.f12103j == fT && this.f12101h == fT2) {
            return;
        }
        this.f12103j = fT;
        this.f12101h = fT2;
        this.f12102i = (int) ((fT * f12092r) + this.f12094a + 0.5f);
        this.f12105l = true;
        invalidateSelf();
    }

    private int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f12105l) {
            a(getBounds());
            this.f12105l = false;
        }
        canvas.translate(0.0f, this.f12103j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f12103j) / 2.0f);
        f12093s.a(canvas, this.f12098e, this.f12099f, this.f12095b);
    }

    ColorStateList f() {
        return this.f12104k;
    }

    float g() {
        return this.f12099f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f12101h, this.f12099f, this.f12108o));
        int iCeil2 = (int) Math.ceil(c(this.f12101h, this.f12099f, this.f12108o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        int i10 = 5 << 1;
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.f12101h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f12104k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f10 = this.f12101h;
        return (Math.max(f10, this.f12099f + this.f12094a + ((f10 * f12092r) / 2.0f)) * 2.0f) + (((this.f12101h * f12092r) + this.f12094a) * 2.0f);
    }

    float k() {
        float f10 = this.f12101h;
        return (Math.max(f10, this.f12099f + this.f12094a + (f10 / 2.0f)) * 2.0f) + ((this.f12101h + this.f12094a) * 2.0f);
    }

    float l() {
        return this.f12103j;
    }

    void m(boolean z10) {
        this.f12108o = z10;
        invalidateSelf();
    }

    void o(@p0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12105l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f12104k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f12095b.getColor() == colorForState) {
            return false;
        }
        this.f12095b.setColor(colorForState);
        this.f12105l = true;
        invalidateSelf();
        return true;
    }

    void p(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
        }
        float f11 = (int) (f10 + 0.5f);
        if (this.f12099f == f11) {
            return;
        }
        this.f12099f = f11;
        this.f12105l = true;
        invalidateSelf();
    }

    void q(float f10) {
        s(this.f12103j, f10);
    }

    void r(float f10) {
        s(f10, this.f12101h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f12095b.setAlpha(i10);
        this.f12096c.setAlpha(i10);
        this.f12097d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12095b.setColorFilter(colorFilter);
    }
}
