package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import com.google.android.material.shape.t;
import e.b;

/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements t {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f112696p0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f112697w = r6.a.n.Yj;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f112698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f112699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f112700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f112701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f112702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f112703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private ColorStateList f112704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private k f112705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f112706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @r
    private float f112707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f112708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @r
    private int f112709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @r
    private int f112710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @r
    private int f112711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @r
    private int f112712o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @r
    private int f112713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @r
    private int f112714t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f112715v;

    @b(21)
    class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f112716a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f112706i == null) {
                return;
            }
            if (ShapeableImageView.this.f112705h == null) {
                ShapeableImageView.this.f112705h = new k(ShapeableImageView.this.f112706i);
            }
            ShapeableImageView.this.f112699b.round(this.f112716a);
            ShapeableImageView.this.f112705h.setBounds(this.f112716a);
            ShapeableImageView.this.f112705h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void h(Canvas canvas) {
        if (this.f112704g != null) {
            this.f112701d.setStrokeWidth(this.f112707j);
            int colorForState = this.f112704g.getColorForState(getDrawableState(), this.f112704g.getDefaultColor());
            if (this.f112707j > 0.0f && colorForState != 0) {
                this.f112701d.setColor(colorForState);
                canvas.drawPath(this.f112703f, this.f112701d);
            }
        }
    }

    private boolean i() {
        if (this.f112713s == Integer.MIN_VALUE && this.f112714t == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean j() {
        return getLayoutDirection() == 1;
    }

    private void m(int i10, int i11) {
        this.f112699b.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f112698a.d(this.f112706i, 1.0f, this.f112699b, this.f112703f);
        this.f112708k.rewind();
        this.f112708k.addPath(this.f112703f);
        this.f112700c.set(0.0f, 0.0f, i10, i11);
        this.f112708k.addRect(this.f112700c, Path.Direction.CCW);
    }

    @r
    public int getContentPaddingBottom() {
        return this.f112712o;
    }

    @r
    public final int getContentPaddingEnd() {
        int i10 = this.f112714t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return j() ? this.f112709l : this.f112711n;
    }

    @r
    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (i()) {
            if (j() && (i11 = this.f112714t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!j() && (i10 = this.f112713s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f112709l;
    }

    @r
    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (i()) {
            if (j() && (i11 = this.f112713s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!j() && (i10 = this.f112714t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f112711n;
    }

    @r
    public final int getContentPaddingStart() {
        int i10 = this.f112713s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return j() ? this.f112711n : this.f112709l;
    }

    @r
    public int getContentPaddingTop() {
        return this.f112710m;
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f112706i;
    }

    @p0
    public ColorStateList getStrokeColor() {
        return this.f112704g;
    }

    @r
    public float getStrokeWidth() {
        return this.f112707j;
    }

    public void k(@r int i10, @r int i11, @r int i12, @r int i13) {
        this.f112713s = Integer.MIN_VALUE;
        this.f112714t = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f112709l) + i10, (super.getPaddingTop() - this.f112710m) + i11, (super.getPaddingRight() - this.f112711n) + i12, (super.getPaddingBottom() - this.f112712o) + i13);
        this.f112709l = i10;
        this.f112710m = i11;
        this.f112711n = i12;
        this.f112712o = i13;
    }

    @w0(17)
    public void l(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f112710m) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f112712o) + i13);
        this.f112709l = j() ? i12 : i10;
        this.f112710m = i11;
        if (!j()) {
            i10 = i12;
        }
        this.f112711n = i10;
        this.f112712o = i13;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f112708k, this.f112702e);
        h(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f112715v && isLayoutDirectionResolved()) {
            this.f112715v = true;
            if (isPaddingRelative() || i()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f112706i = pVar;
        k kVar = this.f112705h;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        m(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@p0 ColorStateList colorStateList) {
        this.f112704g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@n int i10) {
        setStrokeColor(j.a.a(getContext(), i10));
    }

    public void setStrokeWidth(@r float f10) {
        if (this.f112707j != f10) {
            this.f112707j = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@androidx.annotation.q int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f112697w;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f112698a = q.k();
        this.f112703f = new Path();
        this.f112715v = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f112702e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f112699b = new RectF();
        this.f112700c = new RectF();
        this.f112708k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r6.a.o.wt, i10, i11);
        setLayerType(2, null);
        this.f112704g = c.a(context2, typedArrayObtainStyledAttributes, r6.a.o.Gt);
        this.f112707j = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Ht, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.xt, 0);
        this.f112709l = dimensionPixelSize;
        this.f112710m = dimensionPixelSize;
        this.f112711n = dimensionPixelSize;
        this.f112712o = dimensionPixelSize;
        this.f112709l = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.At, dimensionPixelSize);
        this.f112710m = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Dt, dimensionPixelSize);
        this.f112711n = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Bt, dimensionPixelSize);
        this.f112712o = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.yt, dimensionPixelSize);
        this.f112713s = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Ct, Integer.MIN_VALUE);
        this.f112714t = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.zt, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f112701d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f112706i = p.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }
}
