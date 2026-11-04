package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
@w0(21)
class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12080a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f12082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f12083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12084e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f12087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f12088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f12089j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12085f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12086g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f12090k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f12081b = new Paint(5);

    f(ColorStateList colorStateList, float f10) {
        this.f12080a = f10;
        e(colorStateList);
        this.f12082c = new RectF();
        this.f12083d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12087h = colorStateList;
        this.f12081b.setColor(colorStateList.getColorForState(getState(), this.f12087h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f12082c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f12083d.set(rect);
        if (this.f12085f) {
            this.f12083d.inset((int) Math.ceil(g.c(this.f12084e, this.f12080a, this.f12086g)), (int) Math.ceil(g.d(this.f12084e, this.f12080a, this.f12086g)));
            this.f12082c.set(this.f12083d);
        }
    }

    public ColorStateList b() {
        return this.f12087h;
    }

    float c() {
        return this.f12084e;
    }

    public float d() {
        return this.f12080a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f12081b;
        if (this.f12088i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f12088i);
            z10 = true;
        }
        RectF rectF = this.f12082c;
        float f10 = this.f12080a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(@p0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f12084e && this.f12085f == z10 && this.f12086g == z11) {
            return;
        }
        this.f12084e = f10;
        this.f12085f = z10;
        this.f12086g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f12083d, this.f12080a);
    }

    void h(float f10) {
        if (f10 == this.f12080a) {
            return;
        }
        this.f12080a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12089j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f12087h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12087h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f12081b.getColor();
        if (z10) {
            this.f12081b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f12089j;
        if (colorStateList2 == null || (mode = this.f12090k) == null) {
            return z10;
        }
        this.f12088i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f12081b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12081b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12089j = colorStateList;
        this.f12088i = a(colorStateList, this.f12090k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f12090k = mode;
        this.f12088i = a(this.f12089j, mode);
        invalidateSelf();
    }
}
