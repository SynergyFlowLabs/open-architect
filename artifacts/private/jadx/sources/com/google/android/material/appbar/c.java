package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.o;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.internal.c0;
import com.google.android.material.motion.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f111149o3 = r6.a.n.Oe;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f111150p3 = 600;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f111151q3 = 0;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f111152r3 = 1;
    private final TimeInterpolator H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f111153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private ViewGroup f111155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private View f111156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f111157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111159g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private AppBarLayout.g f111160g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111161h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    int f111162h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111163i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f111164i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f111165j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    g3 f111166j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    final com.google.android.material.internal.b f111167k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f111168k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final w6.a f111169l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f111170l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f111171m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f111172m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f111173n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f111174n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Drawable f111175o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f111176p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final TimeInterpolator f111177p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f111178p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    Drawable f111179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f111180t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f111181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ValueAnimator f111182w;

    class a implements b1 {
        a() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, @NonNull g3 g3Var) {
            return c.this.s(g3Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            c.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.g {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.g, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            c cVar = c.this;
            cVar.f111162h3 = i10;
            g3 g3Var = cVar.f111166j3;
            int iR = g3Var != null ? g3Var.r() : 0;
            int childCount = c.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = c.this.getChildAt(i11);
                C0977c c0977c = (C0977c) childAt.getLayoutParams();
                g gVarK = c.k(childAt);
                int i12 = c0977c.f111189a;
                if (i12 == 1) {
                    gVarK.k(n1.a.e(-i10, 0, c.this.i(childAt)));
                } else if (i12 == 2) {
                    gVarK.k(Math.round((-i10) * c0977c.f111190b));
                }
            }
            c.this.A();
            c cVar2 = c.this;
            if (cVar2.f111179s != null && iR > 0) {
                u1.s1(cVar2);
            }
            int height = c.this.getHeight();
            int iH0 = (height - u1.h0(c.this)) - iR;
            float f10 = iH0;
            c.this.f111167k.C0(Math.min(1.0f, (height - c.this.getScrimVisibleHeightTrigger()) / f10));
            c cVar3 = c.this;
            cVar3.f111167k.p0(cVar3.f111162h3 + iH0);
            c.this.f111167k.A0(Math.abs(i10) / f10);
        }
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public interface e extends c0 {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private void B(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f111171m || (view = this.f111157e) == null) {
            return;
        }
        boolean z11 = u1.R0(view) && this.f111157e.getVisibility() == 0;
        this.f111173n = z11;
        if (z11 || z10) {
            boolean z12 = u1.c0(this) == 1;
            v(z12);
            this.f111167k.q0(z12 ? this.f111161h : this.f111158f, this.f111165j.top + this.f111159g, (i12 - i10) - (z12 ? this.f111158f : this.f111161h), (i13 - i11) - this.f111163i);
            this.f111167k.d0(z10);
        }
    }

    private void C() {
        if (this.f111155c != null && this.f111171m && TextUtils.isEmpty(this.f111167k.P())) {
            setTitle(j(this.f111155c));
        }
    }

    private void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f111182w;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f111182w = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f111180t ? this.f111177p1 : this.H1);
            this.f111182w.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f111182w.cancel();
        }
        this.f111182w.setDuration(this.f111176p0);
        this.f111182w.setIntValues(this.f111180t, i10);
        this.f111182w.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        if (i10 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i10 != 1) {
            return i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void c(AppBarLayout appBarLayout) {
        if (o()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.f111153a) {
            ViewGroup viewGroup = null;
            this.f111155c = null;
            this.f111156d = null;
            int i10 = this.f111154b;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f111155c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f111156d = e(viewGroup2);
                }
            }
            if (this.f111155c == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (q(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f111155c = viewGroup;
            }
            z();
            this.f111153a = false;
        }
    }

    @NonNull
    private View e(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @l
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListL = u.l(getContext(), r6.a.c.f359260g4);
        if (colorStateListL != null) {
            return colorStateListL.getDefaultColor();
        }
        return this.f111169l.g(getResources().getDimension(r6.a.f.Q0));
    }

    private static int h(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    static g k(@NonNull View view) {
        g gVar = (g) view.getTag(r6.a.h.f360822z6);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(r6.a.h.f360822z6, gVar2);
        return gVar2;
    }

    private boolean o() {
        return this.f111164i3 == 1;
    }

    private static boolean q(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    private boolean r(View view) {
        View view2 = this.f111156d;
        if (view2 == null || view2 == this) {
            return view == this.f111155c;
        }
        return view == view2;
    }

    private void v(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f111156d;
        if (view == null) {
            view = this.f111155c;
        }
        int i10 = i(view);
        com.google.android.material.internal.d.a(this, this.f111157e, this.f111165j);
        ViewGroup viewGroup = this.f111155c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.b bVar = this.f111167k;
        Rect rect = this.f111165j;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.top + i10 + titleMarginTop;
        int i13 = rect.right;
        if (!z10) {
            titleMarginStart = titleMarginEnd;
        }
        bVar.g0(i11, i12, i13 - titleMarginStart, (rect.bottom + i10) - titleMarginBottom);
    }

    private void w() {
        setContentDescription(getTitle());
    }

    private void x(@NonNull Drawable drawable, int i10, int i11) {
        y(drawable, this.f111155c, i10, i11);
    }

    private void y(@NonNull Drawable drawable, @p0 View view, int i10, int i11) {
        if (o() && view != null && this.f111171m) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void z() {
        View view;
        if (!this.f111171m && (view = this.f111157e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f111157e);
            }
        }
        if (!this.f111171m || this.f111155c == null) {
            return;
        }
        if (this.f111157e == null) {
            this.f111157e = new View(getContext());
        }
        if (this.f111157e.getParent() == null) {
            this.f111155c.addView(this.f111157e, -1, -1);
        }
    }

    final void A() {
        if (this.f111175o == null && this.f111179s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f111162h3 < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0977c;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f111155c == null && (drawable = this.f111175o) != null && this.f111180t > 0) {
            drawable.mutate().setAlpha(this.f111180t);
            this.f111175o.draw(canvas);
        }
        if (this.f111171m && this.f111173n) {
            if (this.f111155c == null || this.f111175o == null || this.f111180t <= 0 || !o() || this.f111167k.G() >= this.f111167k.H()) {
                this.f111167k.l(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f111175o.getBounds(), Region.Op.DIFFERENCE);
                this.f111167k.l(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f111179s == null || this.f111180t <= 0) {
            return;
        }
        g3 g3Var = this.f111166j3;
        int iR = g3Var != null ? g3Var.r() : 0;
        if (iR > 0) {
            this.f111179s.setBounds(0, -this.f111162h3, getWidth(), iR - this.f111162h3);
            this.f111179s.mutate().setAlpha(this.f111180t);
            this.f111179s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f111175o == null || this.f111180t <= 0 || !r(view)) {
            z10 = false;
        } else {
            y(this.f111175o, view, getWidth(), getHeight());
            this.f111175o.mutate().setAlpha(this.f111180t);
            this.f111175o.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f111179s;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f111175o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f111167k;
        if (bVar != null) {
            state |= bVar.K0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0977c generateDefaultLayoutParams() {
        return new C0977c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0977c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f111167k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f111167k.u();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f111167k.v();
    }

    @p0
    public Drawable getContentScrim() {
        return this.f111175o;
    }

    public int getExpandedTitleGravity() {
        return this.f111167k.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f111163i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f111161h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f111158f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f111159g;
    }

    public float getExpandedTitleTextSize() {
        return this.f111167k.E();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f111167k.F();
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f111167k.I();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f111167k.J();
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f111167k.K();
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f111167k.L();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f111167k.M();
    }

    int getScrimAlpha() {
        return this.f111180t;
    }

    public long getScrimAnimationDuration() {
        return this.f111176p0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f111178p2;
        if (i10 >= 0) {
            return i10 + this.f111168k3 + this.f111172m3;
        }
        g3 g3Var = this.f111166j3;
        int iR = g3Var != null ? g3Var.r() : 0;
        int iH0 = u1.h0(this);
        return iH0 > 0 ? Math.min((iH0 * 2) + iR, getHeight()) : getHeight() / 3;
    }

    @p0
    public Drawable getStatusBarScrim() {
        return this.f111179s;
    }

    @p0
    public CharSequence getTitle() {
        if (this.f111171m) {
            return this.f111167k.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f111164i3;
    }

    @p0
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f111167k.O();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f111167k.S();
    }

    final int i(@NonNull View view) {
        return ((getHeight() - k(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((C0977c) view.getLayoutParams())).bottomMargin;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean l() {
        return this.f111174n3;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean m() {
        return this.f111170l3;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean n() {
        return this.f111167k.W();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            u1.V1(this, u1.W(appBarLayout));
            if (this.f111160g3 == null) {
                this.f111160g3 = new d();
            }
            appBarLayout.e(this.f111160g3);
            u1.A1(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f111167k.a0(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f111160g3;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).z(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g3 g3Var = this.f111166j3;
        if (g3Var != null) {
            int iR = g3Var.r();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!u1.W(childAt) && childAt.getTop() < iR) {
                    u1.i1(childAt, iR);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            k(getChildAt(i15)).h();
        }
        B(i10, i11, i12, i13, false);
        C();
        A();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            k(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        c cVar;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        g3 g3Var = this.f111166j3;
        int iR = g3Var != null ? g3Var.r() : 0;
        if ((mode == 0 || this.f111170l3) && iR > 0) {
            this.f111168k3 = iR;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iR, 1073741824));
        }
        if (!this.f111174n3 || this.f111167k.M() <= 1) {
            cVar = this;
        } else {
            C();
            cVar = this;
            cVar.B(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iZ = cVar.f111167k.z();
            if (iZ > 1) {
                cVar.f111172m3 = Math.round(cVar.f111167k.B()) * (iZ - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cVar.getMeasuredHeight() + cVar.f111172m3, 1073741824));
            }
        }
        ViewGroup viewGroup = cVar.f111155c;
        if (viewGroup != null) {
            View view = cVar.f111156d;
            if (view == null || view == cVar) {
                cVar.setMinimumHeight(h(viewGroup));
            } else {
                cVar.setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f111175o;
        if (drawable != null) {
            x(drawable, i10, i11);
        }
    }

    public boolean p() {
        return this.f111171m;
    }

    g3 s(@NonNull g3 g3Var) {
        g3 g3Var2 = u1.W(this) ? g3Var : null;
        if (!o.a(this.f111166j3, g3Var2)) {
            this.f111166j3 = g3Var2;
            requestLayout();
        }
        return g3Var.c();
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f111167k.l0(i10);
    }

    public void setCollapsedTitleTextAppearance(@g1 int i10) {
        this.f111167k.i0(i10);
    }

    public void setCollapsedTitleTextColor(@l int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f111167k.m0(f10);
    }

    public void setCollapsedTitleTypeface(@p0 Typeface typeface) {
        this.f111167k.n0(typeface);
    }

    public void setContentScrim(@p0 Drawable drawable) {
        Drawable drawable2 = this.f111175o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f111175o = drawableMutate;
            if (drawableMutate != null) {
                x(drawableMutate, getWidth(), getHeight());
                this.f111175o.setCallback(this);
                this.f111175o.setAlpha(this.f111180t);
            }
            u1.s1(this);
        }
    }

    public void setContentScrimColor(@l int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@v int i10) {
        setContentScrim(androidx.core.content.d.l(getContext(), i10));
    }

    public void setExpandedTitleColor(@l int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f111167k.w0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f111163i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f111161h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f111158f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f111159g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@g1 int i10) {
        this.f111167k.t0(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f111167k.v0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f111167k.x0(f10);
    }

    public void setExpandedTitleTypeface(@p0 Typeface typeface) {
        this.f111167k.y0(typeface);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f111174n3 = z10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.f111170l3 = z10;
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i10) {
        this.f111167k.D0(i10);
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f10) {
        this.f111167k.F0(f10);
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@x(from = 0.0d) float f10) {
        this.f111167k.G0(f10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.f111167k.H0(i10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f111167k.J0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f111180t) {
            if (this.f111175o != null && (viewGroup = this.f111155c) != null) {
                u1.s1(viewGroup);
            }
            this.f111180t = i10;
            u1.s1(this);
        }
    }

    public void setScrimAnimationDuration(@g0(from = 0) long j10) {
        this.f111176p0 = j10;
    }

    public void setScrimVisibleHeightTrigger(@g0(from = 0) int i10) {
        if (this.f111178p2 != i10) {
            this.f111178p2 = i10;
            A();
        }
    }

    public void setScrimsShown(boolean z10) {
        u(z10, u1.Y0(this) && !isInEditMode());
    }

    @w0(23)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@p0 e eVar) {
        this.f111167k.L0(eVar);
    }

    public void setStatusBarScrim(@p0 Drawable drawable) {
        Drawable drawable2 = this.f111179s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f111179s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f111179s.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.f111179s, u1.c0(this));
                this.f111179s.setVisible(getVisibility() == 0, false);
                this.f111179s.setCallback(this);
                this.f111179s.setAlpha(this.f111180t);
            }
            u1.s1(this);
        }
    }

    public void setStatusBarScrimColor(@l int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@v int i10) {
        setStatusBarScrim(androidx.core.content.d.l(getContext(), i10));
    }

    public void setTitle(@p0 CharSequence charSequence) {
        this.f111167k.M0(charSequence);
        w();
    }

    public void setTitleCollapseMode(int i10) {
        this.f111164i3 = i10;
        boolean zO = o();
        this.f111167k.B0(zO);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zO && this.f111175o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f111167k.O0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f111171m) {
            this.f111171m = z10;
            w();
            z();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@p0 TimeInterpolator timeInterpolator) {
        this.f111167k.I0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f111179s;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f111179s.setVisible(z10, false);
        }
        Drawable drawable2 = this.f111175o;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f111175o.setVisible(z10, false);
        }
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f111158f = i10;
        this.f111159g = i11;
        this.f111161h = i12;
        this.f111163i = i13;
        requestLayout();
    }

    public void u(boolean z10, boolean z11) {
        if (this.f111181v != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f111181v = z10;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f111175o || drawable == this.f111179s;
    }

    public c(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359327j3);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f111167k.k0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111149o3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111153a = true;
        this.f111165j = new Rect();
        this.f111178p2 = -1;
        this.f111168k3 = 0;
        this.f111172m3 = 0;
        Context context2 = getContext();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f111167k = bVar;
        bVar.N0(com.google.android.material.animation.b.f111047e);
        bVar.J0(false);
        this.f111169l = new w6.a(context2);
        TypedArray typedArrayK = com.google.android.material.internal.g0.k(context2, attributeSet, r6.a.o.C7, i10, i11, new int[0]);
        bVar.w0(typedArrayK.getInt(r6.a.o.H7, 8388691));
        bVar.l0(typedArrayK.getInt(r6.a.o.D7, 8388627));
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(r6.a.o.I7, 0);
        this.f111163i = dimensionPixelSize;
        this.f111161h = dimensionPixelSize;
        this.f111159g = dimensionPixelSize;
        this.f111158f = dimensionPixelSize;
        if (typedArrayK.hasValue(r6.a.o.L7)) {
            this.f111158f = typedArrayK.getDimensionPixelSize(r6.a.o.L7, 0);
        }
        if (typedArrayK.hasValue(r6.a.o.K7)) {
            this.f111161h = typedArrayK.getDimensionPixelSize(r6.a.o.K7, 0);
        }
        if (typedArrayK.hasValue(r6.a.o.M7)) {
            this.f111159g = typedArrayK.getDimensionPixelSize(r6.a.o.M7, 0);
        }
        if (typedArrayK.hasValue(r6.a.o.J7)) {
            this.f111163i = typedArrayK.getDimensionPixelSize(r6.a.o.J7, 0);
        }
        this.f111171m = typedArrayK.getBoolean(r6.a.o.X7, true);
        setTitle(typedArrayK.getText(r6.a.o.V7));
        bVar.t0(r6.a.n.O7);
        bVar.i0(i.a.l.f286383m3);
        if (typedArrayK.hasValue(r6.a.o.N7)) {
            bVar.t0(typedArrayK.getResourceId(r6.a.o.N7, 0));
        }
        if (typedArrayK.hasValue(r6.a.o.E7)) {
            bVar.i0(typedArrayK.getResourceId(r6.a.o.E7, 0));
        }
        if (typedArrayK.hasValue(r6.a.o.Z7)) {
            setTitleEllipsize(b(typedArrayK.getInt(r6.a.o.Z7, -1)));
        }
        if (typedArrayK.hasValue(r6.a.o.O7)) {
            bVar.v0(com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.O7));
        }
        if (typedArrayK.hasValue(r6.a.o.F7)) {
            bVar.k0(com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.F7));
        }
        this.f111178p2 = typedArrayK.getDimensionPixelSize(r6.a.o.T7, -1);
        if (typedArrayK.hasValue(r6.a.o.R7)) {
            bVar.H0(typedArrayK.getInt(r6.a.o.R7, 1));
        }
        if (typedArrayK.hasValue(r6.a.o.Y7)) {
            bVar.I0(AnimationUtils.loadInterpolator(context2, typedArrayK.getResourceId(r6.a.o.Y7, 0)));
        }
        this.f111176p0 = typedArrayK.getInt(r6.a.o.S7, 600);
        this.f111177p1 = j.g(context2, r6.a.c.f359155be, com.google.android.material.animation.b.f111045c);
        this.H1 = j.g(context2, r6.a.c.f359155be, com.google.android.material.animation.b.f111046d);
        setContentScrim(typedArrayK.getDrawable(r6.a.o.G7));
        setStatusBarScrim(typedArrayK.getDrawable(r6.a.o.U7));
        setTitleCollapseMode(typedArrayK.getInt(r6.a.o.W7, 0));
        this.f111154b = typedArrayK.getResourceId(r6.a.o.f361606a8, -1);
        this.f111170l3 = typedArrayK.getBoolean(r6.a.o.Q7, false);
        this.f111174n3 = typedArrayK.getBoolean(r6.a.o.P7, false);
        typedArrayK.recycle();
        setWillNotDraw(false);
        u1.j2(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0977c(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.c$c, reason: collision with other inner class name */
    public static class C0977c extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f111185c = 0.5f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f111186d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f111187e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f111188f = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f111189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f111190b;

        public C0977c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f111189a = 0;
            this.f111190b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f361631b8);
            this.f111189a = typedArrayObtainStyledAttributes.getInt(r6.a.o.f361656c8, 0);
            d(typedArrayObtainStyledAttributes.getFloat(r6.a.o.f361681d8, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f111189a;
        }

        public float b() {
            return this.f111190b;
        }

        public void c(int i10) {
            this.f111189a = i10;
        }

        public void d(float f10) {
            this.f111190b = f10;
        }

        public C0977c(int i10, int i11) {
            super(i10, i11);
            this.f111189a = 0;
            this.f111190b = 0.5f;
        }

        public C0977c(int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.f111189a = 0;
            this.f111190b = 0.5f;
        }

        public C0977c(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f111189a = 0;
            this.f111190b = 0.5f;
        }

        public C0977c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f111189a = 0;
            this.f111190b = 0.5f;
        }

        @w0(19)
        public C0977c(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f111189a = 0;
            this.f111190b = 0.5f;
        }

        @w0(19)
        public C0977c(@NonNull C0977c c0977c) {
            super((FrameLayout.LayoutParams) c0977c);
            this.f111189a = 0;
            this.f111190b = 0.5f;
            this.f111189a = c0977c.f111189a;
            this.f111190b = c0977c.f111190b;
        }
    }
}
