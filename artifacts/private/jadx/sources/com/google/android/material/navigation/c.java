package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.p1;
import androidx.core.view.f1;
import androidx.core.view.u1;
import androidx.core.widget.r;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class c extends FrameLayout implements o.a {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f113053p3 = -1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int[] f113054q3 = {R.attr.state_checked};

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final d f113055r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final d f113056s3;

    @p0
    private Drawable H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f113057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f113058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    Drawable f113059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f113061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f113062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f113063g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private ValueAnimator f113064g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f113065h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private d f113066h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f113067i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f113068i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f113069j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f113070j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f113071k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f113072k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final FrameLayout f113073l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f113074l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final View f113075m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f113076m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f113077n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f113078n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ViewGroup f113079o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @p0
    private com.google.android.material.badge.a f113080o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private j f113081p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private ColorStateList f113082p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private Drawable f113083p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f113084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f113085t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f113086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @g1
    private int f113087w;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (c.this.f113077n.getVisibility() == 0) {
                c cVar = c.this;
                cVar.y(cVar.f113077n);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f113089a;

        b(int i10) {
            this.f113089a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.z(this.f113089a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.c$c, reason: collision with other inner class name */
    class C0990c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f113091a;

        C0990c(float f10) {
            this.f113091a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f113091a);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float f113093a = 0.4f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f113094b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f113095c = 0.2f;

        private d() {
        }

        protected float a(@x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11) {
            return com.google.android.material.animation.b.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(@x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11) {
            return com.google.android.material.animation.b.a(0.4f, 1.0f, f10);
        }

        protected float c(@x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11) {
            return 1.0f;
        }

        public void d(@x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11, @NonNull View view) {
            view.setScaleX(b(f10, f11));
            view.setScaleY(c(f10, f11));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.c.d
        protected float c(float f10, float f11) {
            return b(f10, f11);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f113055r3 = new d(aVar);
        f113056s3 = new e(aVar);
    }

    public c(@NonNull Context context) {
        super(context);
        this.f113057a = false;
        this.f113086v = -1;
        this.f113087w = 0;
        this.f113066h3 = f113055r3;
        this.f113068i3 = 0.0f;
        this.f113070j3 = false;
        this.f113072k3 = 0;
        this.f113074l3 = 0;
        this.f113076m3 = false;
        this.f113078n3 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f113073l = (FrameLayout) findViewById(r6.a.h.F3);
        this.f113075m = findViewById(r6.a.h.E3);
        ImageView imageView = (ImageView) findViewById(r6.a.h.G3);
        this.f113077n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(r6.a.h.H3);
        this.f113079o = viewGroup;
        TextView textView = (TextView) findViewById(r6.a.h.J3);
        this.f113084s = textView;
        TextView textView2 = (TextView) findViewById(r6.a.h.I3);
        this.f113085t = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f113060d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f113061e = viewGroup.getPaddingBottom();
        this.f113062f = getResources().getDimensionPixelSize(r6.a.f.F7);
        u1.Y1(textView, 2);
        u1.Y1(textView2, 2);
        setFocusable(true);
        i(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private void A() {
        if (n()) {
            this.f113066h3 = f113056s3;
        } else {
            this.f113066h3 = f113055r3;
        }
    }

    private static void B(@NonNull View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f113073l;
        return frameLayout != null ? frameLayout : this.f113077n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof c) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.f113080o3;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f113080o3.u();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f113077n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private void i(float f10, float f11) {
        this.f113063g = f10 - f11;
        this.f113065h = (f11 * 1.0f) / f10;
        this.f113067i = (f10 * 1.0f) / f11;
    }

    private static Drawable k(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList), null, null);
    }

    @p0
    private FrameLayout l(View view) {
        ImageView imageView = this.f113077n;
        if (view == imageView && com.google.android.material.badge.b.f111284a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean m() {
        return this.f113080o3 != null;
    }

    private boolean n() {
        return this.f113076m3 && this.f113069j == 2;
    }

    private void o(@x(from = 0.0d, to = 1.0d) float f10) {
        if (!this.f113070j3 || !this.f113057a || !u1.R0(this)) {
            s(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f113064g3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f113064g3 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f113068i3, f10);
        this.f113064g3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C0990c(f10));
        this.f113064g3.setInterpolator(com.google.android.material.motion.j.g(getContext(), r6.a.c.Vd, com.google.android.material.animation.b.f111044b));
        this.f113064g3.setDuration(com.google.android.material.motion.j.f(getContext(), r6.a.c.Fd, getResources().getInteger(r6.a.i.M)));
        this.f113064g3.start();
    }

    private void p() {
        j jVar = this.f113081p0;
        if (jVar != null) {
            setChecked(jVar.isChecked());
        }
    }

    private void q() {
        Drawable drawableK = this.f113059c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f113058b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f113070j3 && getActiveIndicatorDrawable() != null && this.f113073l != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.e(this.f113058b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableK == null) {
                drawableK = k(this.f113058b);
            }
        }
        FrameLayout frameLayout = this.f113073l;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f113073l.setForeground(rippleDrawable);
        }
        u1.O1(this, drawableK);
        setDefaultFocusHighlightEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(@x(from = 0.0d, to = 1.0d) float f10, float f11) {
        View view = this.f113075m;
        if (view != null) {
            this.f113066h3.d(f10, f11, view);
        }
        this.f113068i3 = f10;
    }

    private static void t(TextView textView, @g1 int i10) {
        r.D(textView, i10);
        int i11 = com.google.android.material.resources.c.i(textView.getContext(), i10, 0);
        if (i11 != 0) {
            textView.setTextSize(0, i11);
        }
    }

    private static void u(@NonNull View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private static void v(@NonNull View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void w(@p0 View view) {
        if (m() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.b.d(this.f113080o3, view, l(view));
        }
    }

    private void x(@p0 View view) {
        if (m()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.b.j(this.f113080o3, view);
            }
            this.f113080o3 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(View view) {
        if (m()) {
            com.google.android.material.badge.b.m(this.f113080o3, view, l(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.f113075m == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f113072k3, i10 - (this.f113078n3 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113075m.getLayoutParams();
        layoutParams.height = n() ? iMin : this.f113074l3;
        layoutParams.width = iMin;
        this.f113075m.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f113073l;
        if (frameLayout != null && this.f113070j3) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void e(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(@NonNull j jVar, int i10) {
        this.f113081p0 = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        p1.a(this, !TextUtils.isEmpty(jVar.getTooltipText()) ? jVar.getTooltipText() : jVar.getTitle());
        setVisibility(jVar.isVisible() ? 0 : 8);
        this.f113057a = true;
    }

    @p0
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f113075m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @p0
    public com.google.android.material.badge.a getBadge() {
        return this.f113080o3;
    }

    @v
    protected int getItemBackgroundResId() {
        return r6.a.g.Z1;
    }

    @Override // androidx.appcompat.view.menu.o.a
    @p0
    public j getItemData() {
        return this.f113081p0;
    }

    @q
    protected int getItemDefaultMarginResId() {
        return r6.a.f.Gc;
    }

    @j0
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f113086v;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113079o.getLayoutParams();
        return getSuggestedIconHeight() + (this.f113079o.getVisibility() == 0 ? this.f113062f : 0) + layoutParams.topMargin + this.f113079o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113079o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f113079o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean h() {
        return true;
    }

    void j() {
        r();
        this.f113081p0 = null;
        boolean z10 = false | false;
        this.f113068i3 = 0.0f;
        this.f113057a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        j jVar = this.f113081p0;
        if (jVar != null && jVar.isCheckable() && this.f113081p0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f113054q3);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.f113080o3;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f113081p0.getTitle();
            if (!TextUtils.isEmpty(this.f113081p0.getContentDescription())) {
                title = this.f113081p0.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f113080o3.r()));
        }
        androidx.core.view.accessibility.j jVarR2 = androidx.core.view.accessibility.j.r2(accessibilityNodeInfo);
        jVarR2.m1(androidx.core.view.accessibility.j.g.j(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            jVarR2.k1(false);
            jVarR2.V0(androidx.core.view.accessibility.j.a.f48547j);
        }
        jVarR2.V1(getResources().getString(r6.a.m.f360940a0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    void r() {
        x(this.f113077n);
    }

    public void setActiveIndicatorDrawable(@p0 Drawable drawable) {
        View view = this.f113075m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        q();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f113070j3 = z10;
        q();
        View view = this.f113075m;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f113074l3 = i10;
        z(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f113062f != i10) {
            this.f113062f = i10;
            p();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.f113078n3 = i10;
        z(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f113076m3 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f113072k3 = i10;
        z(getWidth());
    }

    void setBadge(@NonNull com.google.android.material.badge.a aVar) {
        ImageView imageView;
        if (this.f113080o3 == aVar) {
            return;
        }
        if (m() && (imageView = this.f113077n) != null) {
            x(imageView);
        }
        this.f113080o3 = aVar;
        ImageView imageView2 = this.f113077n;
        if (imageView2 != null) {
            w(imageView2);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z10) {
        TextView textView = this.f113085t;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f113085t;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f113084s;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f113084s;
        textView4.setPivotY(textView4.getBaseline());
        o(z10 ? 1.0f : 0.0f);
        int i10 = this.f113069j;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    v(getIconOrContainer(), this.f113060d, 49);
                    B(this.f113079o, this.f113061e);
                    this.f113085t.setVisibility(0);
                } else {
                    v(getIconOrContainer(), this.f113060d, 17);
                    B(this.f113079o, 0);
                    this.f113085t.setVisibility(4);
                }
                this.f113084s.setVisibility(4);
            } else if (i10 == 1) {
                B(this.f113079o, this.f113061e);
                if (z10) {
                    v(getIconOrContainer(), (int) (this.f113060d + this.f113063g), 49);
                    u(this.f113085t, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f113084s;
                    float f10 = this.f113065h;
                    u(textView5, f10, f10, 4);
                } else {
                    v(getIconOrContainer(), this.f113060d, 49);
                    TextView textView6 = this.f113085t;
                    float f11 = this.f113067i;
                    u(textView6, f11, f11, 4);
                    u(this.f113084s, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                v(getIconOrContainer(), this.f113060d, 17);
                this.f113085t.setVisibility(8);
                this.f113084s.setVisibility(8);
            }
        } else if (this.f113071k) {
            if (z10) {
                v(getIconOrContainer(), this.f113060d, 49);
                B(this.f113079o, this.f113061e);
                this.f113085t.setVisibility(0);
            } else {
                v(getIconOrContainer(), this.f113060d, 17);
                B(this.f113079o, 0);
                this.f113085t.setVisibility(4);
            }
            this.f113084s.setVisibility(4);
        } else {
            B(this.f113079o, this.f113061e);
            if (z10) {
                v(getIconOrContainer(), (int) (this.f113060d + this.f113063g), 49);
                u(this.f113085t, 1.0f, 1.0f, 0);
                TextView textView7 = this.f113084s;
                float f12 = this.f113065h;
                u(textView7, f12, f12, 4);
            } else {
                v(getIconOrContainer(), this.f113060d, 49);
                TextView textView8 = this.f113085t;
                float f13 = this.f113067i;
                u(textView8, f13, f13, 4);
                u(this.f113084s, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.o.a
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f113084s.setEnabled(z10);
        this.f113085t.setEnabled(z10);
        this.f113077n.setEnabled(z10);
        if (z10) {
            u1.p2(this, f1.c(getContext(), 1002));
        } else {
            u1.p2(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@p0 Drawable drawable) {
        if (drawable == this.H1) {
            return;
        }
        this.H1 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
            this.f113083p2 = drawable;
            ColorStateList colorStateList = this.f113082p1;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.c.o(drawable, colorStateList);
            }
        }
        this.f113077n.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113077n.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f113077n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@p0 ColorStateList colorStateList) {
        Drawable drawable;
        this.f113082p1 = colorStateList;
        if (this.f113081p0 == null || (drawable = this.f113083p2) == null) {
            return;
        }
        androidx.core.graphics.drawable.c.o(drawable, colorStateList);
        this.f113083p2.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : androidx.core.content.d.l(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f113061e != i10) {
            this.f113061e = i10;
            p();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f113060d != i10) {
            this.f113060d = i10;
            p();
        }
    }

    public void setItemPosition(int i10) {
        this.f113086v = i10;
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f113058b = colorStateList;
        q();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f113069j != i10) {
            this.f113069j = i10;
            A();
            z(getWidth());
            p();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f113071k != z10) {
            this.f113071k = z10;
            p();
        }
    }

    public void setTextAppearanceActive(@g1 int i10) {
        this.f113087w = i10;
        t(this.f113085t, i10);
        i(this.f113084s.getTextSize(), this.f113085t.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.f113087w);
        TextView textView = this.f113085t;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(@g1 int i10) {
        t(this.f113084s, i10);
        i(this.f113084s.getTextSize(), this.f113085t.getTextSize());
    }

    public void setTextColor(@p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f113084s.setTextColor(colorStateList);
            this.f113085t.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(@p0 CharSequence charSequence) {
        this.f113084s.setText(charSequence);
        this.f113085t.setText(charSequence);
        j jVar = this.f113081p0;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.f113081p0;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f113081p0.getTooltipText();
        }
        p1.a(this, charSequence);
    }

    public void setItemBackground(@p0 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f113059c = drawable;
        q();
    }
}
