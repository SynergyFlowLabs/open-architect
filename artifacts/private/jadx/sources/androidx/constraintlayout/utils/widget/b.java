package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class b extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f45565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f45567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f45568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f45569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f45572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ViewOutlineProvider f45573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RectF f45574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Drawable[] f45575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    LayerDrawable f45576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f45577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f45578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f45579o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f45580s;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = b.this.getWidth();
            int height = b.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * b.this.f45570f) / 2.0f);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.b$b, reason: collision with other inner class name */
    class C0368b extends ViewOutlineProvider {
        C0368b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), b.this.f45571g);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f45583a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ColorMatrix f45584b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorMatrix f45585c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f45586d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f45587e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f45588f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f45589g = 1.0f;

        c() {
        }

        private void a(float f10) {
            float[] fArr = this.f45583a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f45583a;
            fArr[0] = f12 + f10;
            boolean z10 = !true;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float f10) {
            float fLog;
            float fPow;
            float fLog2;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            if (f11 > 66.0f) {
                double d10 = f11 - 60.0f;
                fPow = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d10, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 < 66.0f) {
                fLog2 = f11 > 19.0f ? (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f45583a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void c(ImageView imageView) {
            boolean z10;
            this.f45584b.reset();
            float f10 = this.f45587e;
            boolean z11 = true;
            int i10 = 3 >> 1;
            if (f10 != 1.0f) {
                b(f10);
                this.f45584b.set(this.f45583a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f45588f;
            if (f11 != 1.0f) {
                this.f45585c.setScale(f11, f11, f11, 1.0f);
                this.f45584b.postConcat(this.f45585c);
                z10 = true;
            }
            float f12 = this.f45589g;
            if (f12 != 1.0f) {
                d(f12);
                this.f45585c.set(this.f45583a);
                this.f45584b.postConcat(this.f45585c);
                z10 = true;
            }
            float f13 = this.f45586d;
            if (f13 != 1.0f) {
                a(f13);
                this.f45585c.set(this.f45583a);
                this.f45584b.postConcat(this.f45585c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f45584b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public b(Context context) {
        super(context);
        this.f45565a = new c();
        int i10 = 4 & 1;
        this.f45566b = true;
        this.f45567c = null;
        this.f45568d = null;
        this.f45569e = 0.0f;
        this.f45570f = 0.0f;
        this.f45571g = Float.NaN;
        this.f45575k = new Drawable[2];
        this.f45577m = Float.NaN;
        this.f45578n = Float.NaN;
        this.f45579o = Float.NaN;
        this.f45580s = Float.NaN;
        f(context, null);
    }

    private void f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f45567c = typedArrayObtainStyledAttributes.getDrawable(j.c.Z8);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46408d9) {
                    this.f45569e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == j.c.f46560m9) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46543l9) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46391c9) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46374b9) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46509j9) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.f46526k9) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == j.c.f46493i9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f45566b));
                } else if (index == j.c.f46425e9) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f45577m));
                } else if (index == j.c.f46442f9) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f45578n));
                } else if (index == j.c.f46459g9) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f45580s));
                } else if (index == j.c.f46476h9) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f45579o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f45568d = drawable;
            if (this.f45567c != null && drawable != null) {
                Drawable[] drawableArr = this.f45575k;
                Drawable drawableMutate = getDrawable().mutate();
                this.f45568d = drawableMutate;
                drawableArr[0] = drawableMutate;
                this.f45575k[1] = this.f45567c.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f45575k);
                this.f45576l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f45569e * 255.0f));
                if (!this.f45566b) {
                    this.f45576l.getDrawable(0).setAlpha((int) ((1.0f - this.f45569e) * 255.0f));
                }
                super.setImageDrawable(this.f45576l);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f45568d = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f45575k;
                Drawable drawableMutate2 = drawable2.mutate();
                this.f45568d = drawableMutate2;
                drawableArr2[0] = drawableMutate2;
            }
        }
    }

    private void g() {
        if (Float.isNaN(this.f45577m) && Float.isNaN(this.f45578n) && Float.isNaN(this.f45579o) && Float.isNaN(this.f45580s)) {
            return;
        }
        float f10 = Float.isNaN(this.f45577m) ? 0.0f : this.f45577m;
        float f11 = Float.isNaN(this.f45578n) ? 0.0f : this.f45578n;
        float f12 = Float.isNaN(this.f45579o) ? 1.0f : this.f45579o;
        float f13 = Float.isNaN(this.f45580s) ? 0.0f : this.f45580s;
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

    private void h() {
        if (Float.isNaN(this.f45577m) && Float.isNaN(this.f45578n) && Float.isNaN(this.f45579o) && Float.isNaN(this.f45580s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            g();
        }
    }

    private void setOverlay(boolean z10) {
        this.f45566b = z10;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f45565a.f45586d;
    }

    public float getContrast() {
        return this.f45565a.f45588f;
    }

    public float getCrossfade() {
        return this.f45569e;
    }

    public float getImagePanX() {
        return this.f45577m;
    }

    public float getImagePanY() {
        return this.f45578n;
    }

    public float getImageRotate() {
        return this.f45580s;
    }

    public float getImageZoom() {
        return this.f45579o;
    }

    public float getRound() {
        return this.f45571g;
    }

    public float getRoundPercent() {
        return this.f45570f;
    }

    public float getSaturation() {
        return this.f45565a.f45587e;
    }

    public float getWarmth() {
        return this.f45565a.f45589g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        g();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f45567c = drawableMutate;
        Drawable[] drawableArr = this.f45575k;
        drawableArr[0] = this.f45568d;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45575k);
        this.f45576l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45569e);
    }

    public void setAltImageResource(int i10) {
        Drawable drawableB = j.a.b(getContext(), i10);
        this.f45567c = drawableB;
        setAltImageDrawable(drawableB);
    }

    public void setBrightness(float f10) {
        c cVar = this.f45565a;
        cVar.f45586d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f45565a;
        cVar.f45588f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.f45569e = f10;
        if (this.f45575k != null) {
            if (!this.f45566b) {
                this.f45576l.getDrawable(0).setAlpha((int) ((1.0f - this.f45569e) * 255.0f));
            }
            this.f45576l.getDrawable(1).setAlpha((int) (this.f45569e * 255.0f));
            super.setImageDrawable(this.f45576l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f45567c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f45568d = drawableMutate;
        Drawable[] drawableArr = this.f45575k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f45567c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45575k);
        this.f45576l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45569e);
    }

    public void setImagePanX(float f10) {
        this.f45577m = f10;
        h();
    }

    public void setImagePanY(float f10) {
        this.f45578n = f10;
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f45567c == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = j.a.b(getContext(), i10).mutate();
        this.f45568d = drawableMutate;
        Drawable[] drawableArr = this.f45575k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f45567c;
        LayerDrawable layerDrawable = new LayerDrawable(this.f45575k);
        this.f45576l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f45569e);
    }

    public void setImageRotate(float f10) {
        this.f45580s = f10;
        h();
    }

    public void setImageZoom(float f10) {
        this.f45579o = f10;
        h();
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f45571g = f10;
            float f11 = this.f45570f;
            this.f45570f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f45571g != f10;
        this.f45571g = f10;
        if (f10 != 0.0f) {
            if (this.f45572h == null) {
                this.f45572h = new Path();
            }
            if (this.f45574j == null) {
                this.f45574j = new RectF();
            }
            if (this.f45573i == null) {
                C0368b c0368b = new C0368b();
                this.f45573i = c0368b;
                setOutlineProvider(c0368b);
            }
            setClipToOutline(true);
            this.f45574j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f45572h.reset();
            Path path = this.f45572h;
            RectF rectF = this.f45574j;
            float f12 = this.f45571g;
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
        boolean z10 = this.f45570f != f10;
        this.f45570f = f10;
        if (f10 != 0.0f) {
            if (this.f45572h == null) {
                this.f45572h = new Path();
            }
            if (this.f45574j == null) {
                this.f45574j = new RectF();
            }
            if (this.f45573i == null) {
                a aVar = new a();
                this.f45573i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f45570f) / 2.0f;
            this.f45574j.set(0.0f, 0.0f, width, height);
            this.f45572h.reset();
            this.f45572h.addRoundRect(this.f45574j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f45565a;
        cVar.f45587e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f45565a;
        cVar.f45589g = f10;
        cVar.c(this);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45565a = new c();
        this.f45566b = true;
        this.f45567c = null;
        this.f45568d = null;
        this.f45569e = 0.0f;
        this.f45570f = 0.0f;
        this.f45571g = Float.NaN;
        this.f45575k = new Drawable[2];
        this.f45577m = Float.NaN;
        this.f45578n = Float.NaN;
        this.f45579o = Float.NaN;
        this.f45580s = Float.NaN;
        f(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45565a = new c();
        this.f45566b = true;
        this.f45567c = null;
        this.f45568d = null;
        int i11 = 3 >> 0;
        this.f45569e = 0.0f;
        this.f45570f = 0.0f;
        this.f45571g = Float.NaN;
        this.f45575k = new Drawable[2];
        this.f45577m = Float.NaN;
        this.f45578n = Float.NaN;
        this.f45579o = Float.NaN;
        this.f45580s = Float.NaN;
        f(context, attributeSet);
    }
}
