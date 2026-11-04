package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.widget.r;
import com.planner5d.library.engine.input.f;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.e
public class c extends ViewGroup {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f76118o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f76119s = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f76120t = 0.6f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f76121v = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ViewPager f76122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f76123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f76124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TextView f76125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f76126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f76127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f76128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f76130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f76131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f76132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference<androidx.viewpager.widget.a> f76133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f76134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f76135n;

    private class a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f76136a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            c.this.b(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c cVar = c.this;
            cVar.c(cVar.f76122a.getCurrentItem(), c.this.f76122a.getAdapter());
            c cVar2 = c.this;
            float f10 = cVar2.f76127f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            cVar2.d(cVar2.f76122a.getCurrentItem(), f10, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f76136a = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            c.this.d(i10, f10, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            if (this.f76136a == 0) {
                c cVar = c.this;
                cVar.c(cVar.f76122a.getCurrentItem(), c.this.f76122a.getAdapter());
                c cVar2 = c.this;
                float f10 = cVar2.f76127f;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                cVar2.d(cVar2.f76122a.getCurrentItem(), f10, true);
            }
        }
    }

    private static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Locale f76138a;

        b(Context context) {
            this.f76138a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f76138a);
            }
            return null;
        }
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i10, float f10) {
        this.f76123b.setTextSize(i10, f10);
        this.f76124c.setTextSize(i10, f10);
        this.f76125d.setTextSize(i10, f10);
    }

    void b(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.f76132k);
            this.f76133l = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(this.f76132k);
            this.f76133l = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f76122a;
        if (viewPager != null) {
            this.f76126e = -1;
            this.f76127f = -1.0f;
            c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    void c(int i10, androidx.viewpager.widget.a aVar) {
        int count = aVar != null ? aVar.getCount() : 0;
        this.f76130i = true;
        CharSequence pageTitle = null;
        this.f76123b.setText((i10 < 1 || aVar == null) ? null : aVar.getPageTitle(i10 - 1));
        this.f76124c.setText((aVar == null || i10 >= count) ? null : aVar.getPageTitle(i10));
        int i11 = i10 + 1;
        if (i11 < count && aVar != null) {
            pageTitle = aVar.getPageTitle(i11);
        }
        this.f76125d.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f76123b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f76124c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f76125d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f76126e = i10;
        if (!this.f76131j) {
            d(i10, this.f76127f, false);
        }
        this.f76130i = false;
    }

    void d(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f76126e) {
            c(i10, this.f76122a.getAdapter());
        } else if (!z10 && f10 == this.f76127f) {
            return;
        }
        this.f76131j = true;
        int measuredWidth = this.f76123b.getMeasuredWidth();
        int measuredWidth2 = this.f76124c.getMeasuredWidth();
        int measuredWidth3 = this.f76125d.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = 0.5f + f10;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = this.f76123b.getBaseline();
        int baseline2 = this.f76124c.getBaseline();
        int baseline3 = this.f76125d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f76123b.getMeasuredHeight() + i20, this.f76124c.getMeasuredHeight() + i21), this.f76125d.getMeasuredHeight() + i22);
        int i23 = this.f76129h & f.b.B;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
            } else {
                i11 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.f76124c;
            textView.layout(i18, i13, i19, textView.getMeasuredHeight() + i13);
            int iMin = Math.min(paddingLeft, (i18 - this.f76128g) - measuredWidth);
            TextView textView2 = this.f76123b;
            textView2.layout(iMin, i12, iMin + measuredWidth, textView2.getMeasuredHeight() + i12);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f76128g);
            TextView textView3 = this.f76125d;
            textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f76127f = f10;
            this.f76131j = false;
        }
        i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        TextView textView4 = this.f76124c;
        textView4.layout(i18, i13, i19, textView4.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.f76128g) - measuredWidth);
        TextView textView5 = this.f76123b;
        textView5.layout(iMin2, i12, iMin2 + measuredWidth, textView5.getMeasuredHeight() + i12);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f76128g);
        TextView textView6 = this.f76125d;
        textView6.layout(iMax4, i14, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i14);
        this.f76127f = f10;
        this.f76131j = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f76128g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        viewPager.V(this.f76132k);
        viewPager.b(this.f76132k);
        this.f76122a = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.f76133l;
        b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f76122a;
        if (viewPager != null) {
            b(viewPager.getAdapter(), null);
            this.f76122a.V(null);
            this.f76122a.N(this.f76132k);
            this.f76122a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f76122a != null) {
            float f10 = this.f76127f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            d(this.f76126e, f10, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f76123b.measure(childMeasureSpec2, childMeasureSpec);
        this.f76124c.measure(childMeasureSpec2, childMeasureSpec);
        this.f76125d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(getMinHeight(), this.f76124c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, this.f76124c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f76130i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f76129h = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@x(from = 0.0d, to = 1.0d) float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f76134m = i10;
        int i11 = (i10 << 24) | (this.f76135n & 16777215);
        this.f76123b.setTextColor(i11);
        this.f76125d.setTextColor(i11);
    }

    public void setTextColor(@l int i10) {
        this.f76135n = i10;
        this.f76124c.setTextColor(i10);
        int i11 = (this.f76134m << 24) | (this.f76135n & 16777215);
        this.f76123b.setTextColor(i11);
        this.f76125d.setTextColor(i11);
    }

    public void setTextSpacing(int i10) {
        this.f76128g = i10;
        requestLayout();
    }

    public c(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76126e = -1;
        this.f76127f = -1.0f;
        this.f76132k = new a();
        TextView textView = new TextView(context);
        this.f76123b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f76124c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f76125d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f76118o);
        boolean z10 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            r.D(this.f76123b, resourceId);
            r.D(this.f76124c, resourceId);
            r.D(this.f76125d, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f76123b.setTextColor(color);
            this.f76124c.setTextColor(color);
            this.f76125d.setTextColor(color);
        }
        this.f76129h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f76135n = this.f76124c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f76123b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f76124c.setEllipsize(truncateAt);
        this.f76125d.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f76119s);
            z10 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(this.f76123b);
            setSingleLineAllCaps(this.f76124c);
            setSingleLineAllCaps(this.f76125d);
        } else {
            this.f76123b.setSingleLine();
            this.f76124c.setSingleLine();
            this.f76125d.setSingleLine();
        }
        this.f76128g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
