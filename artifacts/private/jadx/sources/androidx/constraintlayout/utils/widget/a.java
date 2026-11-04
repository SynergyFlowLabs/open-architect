package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import androidx.appcompat.widget.t;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class a extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.utils.widget.b.c f45547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f45548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f45551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f45552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RectF f45553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Drawable[] f45554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    LayerDrawable f45555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f45557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f45558o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f45559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f45560t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f45561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f45562w;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.a$a, reason: collision with other inner class name */
    class C0367a extends ViewOutlineProvider {
        C0367a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = a.this.getWidth();
            int height = a.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * a.this.f45549f) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, a.this.getWidth(), a.this.getHeight(), a.this.f45550g);
        }
    }

    public a(Context context) {
        super(context);
        this.f45547d = new androidx.constraintlayout.utils.widget.b.c();
        this.f45548e = 0.0f;
        this.f45549f = 0.0f;
        this.f45550g = Float.NaN;
        this.f45554k = new Drawable[2];
        this.f45556m = true;
        this.f45557n = null;
        this.f45558o = null;
        this.f45559s = Float.NaN;
        this.f45560t = Float.NaN;
        this.f45561v = Float.NaN;
        this.f45562w = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f45557n = typedArrayObtainStyledAttributes.getDrawable(j.c.Z8);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46408d9) {
                    this.f45548e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == j.c.f46560m9) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46543l9) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46391c9) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46509j9) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.f46526k9) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46493i9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f45556m));
                } else if (index == j.c.f46425e9) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f45559s));
                } else if (index == j.c.f46442f9) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f45560t));
                } else if (index == j.c.f46459g9) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f45562w));
                } else if (index == j.c.f46476h9) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f45561v));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f45558o = drawable;
            if (this.f45557n == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f45558o = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f45554k;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f45558o = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f45554k;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f45558o = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f45554k[1] = this.f45557n.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f45554k);
            this.f45555l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f45548e * 255.0f));
            if (!this.f45556m) {
                this.f45555l.getDrawable(0).setAlpha((int) ((1.0f - this.f45548e) * 255.0f));
            }
            super.setImageDrawable(this.f45555l);
        }
    }

    private void d() {
        if (Float.isNaN(this.f45559s) && Float.isNaN(this.f45560t) && Float.isNaN(this.f45561v) && Float.isNaN(this.f45562w)) {
            return;
        }
        float f10 = Float.isNaN(this.f45559s) ? 0.0f : this.f45559s;
        float f11 = Float.isNaN(this.f45560t) ? 0.0f : this.f45560t;
        float f12 = Float.isNaN(this.f45561v) ? 1.0f : this.f45561v;
        float f13 = Float.isNaN(this.f45562w) ? 0.0f : this.f45562w;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate((((f10 * (width - f15)) + width) - f15) * 0.5f, (((f11 * (height - f16)) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void e() {
        if (Float.isNaN(this.f45559s) && Float.isNaN(this.f45560t) && Float.isNaN(this.f45561v) && Float.isNaN(this.f45562w)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    private void setOverlay(boolean z10) {
        this.f45556m = z10;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f45547d.f45588f;
    }

    public float getCrossfade() {
        return this.f45548e;
    }

    public float getImagePanX() {
        return this.f45559s;
    }

    public float getImagePanY() {
        return this.f45560t;
    }

    public float getImageRotate() {
        return this.f45562w;
    }

    public float getImageZoom() {
        return this.f45561v;
    }

    public float getRound() {
        return this.f45550g;
    }

    public float getRoundPercent() {
        return this.f45549f;
    }

    public float getSaturation() {
        return this.f45547d.f45587e;
    }

    public float getWarmth() {
        return this.f45547d.f45589g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        d();
    }

    public void setAltImageResource(int i10) {
        Drawable drawableMutate = j.a.b(getContext(), i10).mutate();
        this.f45557n = drawableMutate;
        Drawable[] drawableArr = this.f45554k;
        drawableArr[0] = this.f45558o;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45554k);
        this.f45555l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45548e);
    }

    public void setBrightness(float f10) {
        androidx.constraintlayout.utils.widget.b.c cVar = this.f45547d;
        cVar.f45586d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        androidx.constraintlayout.utils.widget.b.c cVar = this.f45547d;
        cVar.f45588f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f45548e = f10;
        if (this.f45554k != null) {
            if (!this.f45556m) {
                this.f45555l.getDrawable(0).setAlpha((int) ((1.0f - this.f45548e) * 255.0f));
            }
            this.f45555l.getDrawable(1).setAlpha((int) (this.f45548e * 255.0f));
            super.setImageDrawable(this.f45555l);
        }
    }

    @Override // androidx.appcompat.widget.t, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f45557n == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f45558o = drawableMutate;
        Drawable[] drawableArr = this.f45554k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f45557n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45554k);
        this.f45555l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45548e);
    }

    public void setImagePanX(float f10) {
        this.f45559s = f10;
        e();
    }

    public void setImagePanY(float f10) {
        this.f45560t = f10;
        e();
    }

    @Override // androidx.appcompat.widget.t, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f45557n == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = j.a.b(getContext(), i10).mutate();
        this.f45558o = drawableMutate;
        Drawable[] drawableArr = this.f45554k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f45557n;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45554k);
        this.f45555l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45548e);
    }

    public void setImageRotate(float f10) {
        this.f45562w = f10;
        e();
    }

    public void setImageZoom(float f10) {
        this.f45561v = f10;
        e();
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f45550g = f10;
            float f11 = this.f45549f;
            this.f45549f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f45550g != f10;
        this.f45550g = f10;
        if (f10 != 0.0f) {
            if (this.f45551h == null) {
                this.f45551h = new Path();
            }
            if (this.f45553j == null) {
                this.f45553j = new RectF();
            }
            if (this.f45552i == null) {
                b bVar = new b();
                this.f45552i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f45553j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f45551h.reset();
            Path path = this.f45551h;
            RectF rectF = this.f45553j;
            float f12 = this.f45550g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f45549f != f10;
        this.f45549f = f10;
        if (f10 != 0.0f) {
            if (this.f45551h == null) {
                this.f45551h = new Path();
            }
            if (this.f45553j == null) {
                this.f45553j = new RectF();
            }
            if (this.f45552i == null) {
                C0367a c0367a = new C0367a();
                this.f45552i = c0367a;
                setOutlineProvider(c0367a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f45549f) / 2.0f;
            this.f45553j.set(0.0f, 0.0f, width, height);
            this.f45551h.reset();
            this.f45551h.addRoundRect(this.f45553j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        androidx.constraintlayout.utils.widget.b.c cVar = this.f45547d;
        cVar.f45587e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        androidx.constraintlayout.utils.widget.b.c cVar = this.f45547d;
        cVar.f45589g = f10;
        cVar.c(this);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45547d = new androidx.constraintlayout.utils.widget.b.c();
        this.f45548e = 0.0f;
        this.f45549f = 0.0f;
        this.f45550g = Float.NaN;
        this.f45554k = new Drawable[2];
        this.f45556m = true;
        this.f45557n = null;
        this.f45558o = null;
        this.f45559s = Float.NaN;
        this.f45560t = Float.NaN;
        this.f45561v = Float.NaN;
        this.f45562w = Float.NaN;
        c(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45547d = new androidx.constraintlayout.utils.widget.b.c();
        this.f45548e = 0.0f;
        this.f45549f = 0.0f;
        this.f45550g = Float.NaN;
        this.f45554k = new Drawable[2];
        int i11 = 4 | 1;
        this.f45556m = true;
        this.f45557n = null;
        this.f45558o = null;
        this.f45559s = Float.NaN;
        this.f45560t = Float.NaN;
        this.f45561v = Float.NaN;
        this.f45562w = Float.NaN;
        c(context, attributeSet);
    }
}
