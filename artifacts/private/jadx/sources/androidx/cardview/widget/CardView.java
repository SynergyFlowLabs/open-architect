package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.t0;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f12066h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e f12067i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f12072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f12073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f12074g;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f12075a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f12073f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f12072e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public void c(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f12070c) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f12071d) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // androidx.cardview.widget.d
        public void d(Drawable drawable) {
            this.f12075a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public Drawable e() {
            return this.f12075a;
        }

        @Override // androidx.cardview.widget.d
        public boolean f() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f12067i = bVar;
        bVar.n();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f12067i.j(this.f12074g);
    }

    public float getCardElevation() {
        return f12067i.d(this.f12074g);
    }

    @t0
    public int getContentPaddingBottom() {
        return this.f12072e.bottom;
    }

    @t0
    public int getContentPaddingLeft() {
        return this.f12072e.left;
    }

    @t0
    public int getContentPaddingRight() {
        return this.f12072e.right;
    }

    @t0
    public int getContentPaddingTop() {
        return this.f12072e.top;
    }

    public float getMaxCardElevation() {
        return f12067i.b(this.f12074g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f12069b;
    }

    public float getRadius() {
        return f12067i.a(this.f12074g);
    }

    public boolean getUseCompatPadding() {
        return this.f12068a;
    }

    public void h(@t0 int i10, @t0 int i11, @t0 int i12, @t0 int i13) {
        this.f12072e.set(i10, i11, i12, i13);
        f12067i.e(this.f12074g);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        e eVar = f12067i;
        if (eVar instanceof b) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.f(this.f12074g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.c(this.f12074g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@l int i10) {
        f12067i.o(this.f12074g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f12067i.i(this.f12074g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f12067i.g(this.f12074g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f12071d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f12070c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f12069b) {
            this.f12069b = z10;
            f12067i.k(this.f12074g);
        }
    }

    public void setRadius(float f10) {
        f12067i.h(this.f12074g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f12068a != z10) {
            this.f12068a = z10;
            f12067i.m(this.f12074g);
        }
    }

    public CardView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, s.a.C2500a.f366802g);
    }

    public void setCardBackgroundColor(@p0 ColorStateList colorStateList) {
        f12067i.o(this.f12074g, colorStateList);
    }

    public CardView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f12072e = rect;
        this.f12073f = new Rect();
        a aVar = new a();
        this.f12074g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.a.e.f366819a, i10, s.a.d.f366816b);
        if (typedArrayObtainStyledAttributes.hasValue(s.a.e.f366822d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(s.a.e.f366822d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f12066h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(s.a.b.f366809b) : getResources().getColor(s.a.b.f366808a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(s.a.e.f366823e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(s.a.e.f366824f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(s.a.e.f366825g, 0.0f);
        this.f12068a = typedArrayObtainStyledAttributes.getBoolean(s.a.e.f366827i, false);
        this.f12069b = typedArrayObtainStyledAttributes.getBoolean(s.a.e.f366826h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366828j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366830l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366832n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366831m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366829k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f12070c = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366820b, 0);
        this.f12071d = typedArrayObtainStyledAttributes.getDimensionPixelSize(s.a.e.f366821c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f12067i.l(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
