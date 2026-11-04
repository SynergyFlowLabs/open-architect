package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.p1;
import androidx.core.util.s;
import androidx.core.view.d0;
import androidx.core.view.u1;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.g0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    @r(unit = 0)
    private static final int H3 = 72;

    @r(unit = 0)
    static final int I3 = 8;

    @r(unit = 0)
    private static final int J3 = 48;

    @r(unit = 0)
    private static final int K3 = 56;

    @r(unit = 0)
    static final int L3 = 16;
    private static final int M3 = -1;
    private static final int N3 = 300;
    private static final int O3 = -1;
    private static final String Q3 = "TabLayout";
    public static final int R3 = 0;
    public static final int S3 = 1;
    public static final int T3 = 2;
    public static final int U3 = 0;
    public static final int V3 = 1;
    public static final int W3 = 0;
    public static final int X3 = 1;
    public static final int Y3 = 2;
    public static final int Z3 = 0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f113945a4 = 1;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final int f113946b4 = 2;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final int f113947c4 = 3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final int f113948d4 = 0;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final int f113949e4 = 1;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final int f113950f4 = 2;
    private DataSetObserver A3;
    private m B3;
    private b C3;
    private boolean D3;
    private int E3;
    private final s.a<n> F3;
    int H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f113951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<i> f113952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private i f113953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final h f113954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f113955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f113956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f113957g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final int f113958g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f113959h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final int f113960h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f113961i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f113962i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f113963j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    int f113964j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f113965k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    int f113966k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f113967l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    int f113968l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f113969m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    int f113970m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f113971n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    boolean f113972n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    Drawable f113973o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    boolean f113974o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    float f113975p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    final int f113976p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final int f113977p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    int f113978p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    int f113979q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    boolean f113980r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f113981s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private com.google.android.material.tabs.c f113982s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    PorterDuff.Mode f113983t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final TimeInterpolator f113984t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @p0
    private c f113985u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f113986v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final ArrayList<c> f113987v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f113988w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @p0
    private c f113989w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private ValueAnimator f113990x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @p0
    ViewPager f113991y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @p0
    private androidx.viewpager.widget.a f113992z3;
    private static final int G3 = r6.a.n.Te;
    private static final s.a<i> P3 = new s.c(16);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f113994a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(@NonNull ViewPager viewPager, @p0 androidx.viewpager.widget.a aVar, @p0 androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f113991y3 == viewPager) {
                tabLayout.T(aVar2, this.f113994a);
            }
        }

        void b(boolean z10) {
            this.f113994a = z10;
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface e {
    }

    public interface f extends c<i> {
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.J();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.J();
        }
    }

    class h extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator f113997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f113998b;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f114000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f114001b;

            a(View view, View view2) {
                this.f114000a = view;
                this.f114001b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                h.this.j(this.f114000a, this.f114001b, valueAnimator.getAnimatedFraction());
            }
        }

        h(Context context) {
            super(context);
            this.f113998b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f113951a == -1) {
                tabLayout.f113951a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f113951a);
        }

        private void f(int i10) {
            if (TabLayout.this.E3 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.f113982s3;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f113973o);
                TabLayout.this.f113951a = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f113973o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f113973o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f113982s3;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f113973o);
            }
            u1.s1(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f113951a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f113951a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f113997a.removeAllUpdateListeners();
                this.f113997a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f113997a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f113984t3);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f113997a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f113951a != i10) {
                this.f113997a.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f113973o.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f113973o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f113968l3;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f113973o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f113973o.getBounds();
                TabLayout.this.f113973o.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f113973o.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f113951a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f113997a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f113997a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f113973o.getBounds();
            TabLayout.this.f113973o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f113997a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.f113964j3 == 1 || tabLayout.f113970m3 == 2) {
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        if (childAt.getVisibility() == 0) {
                            iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
                    }
                    if (iMax > 0) {
                        if (iMax * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.p0.i(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                                if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                                    layoutParams.width = iMax;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f113964j3 = 0;
                            tabLayout2.c0(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f114003k = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private Object f114004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Drawable f114005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private CharSequence f114006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private CharSequence f114007d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private View f114009f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public TabLayout f114011h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public n f114012i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f114008e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @d
        private int f114010g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f114013j = -1;

        @NonNull
        @z7.a
        public i A(@d int i10) {
            this.f114010g = i10;
            TabLayout tabLayout = this.f114011h;
            if (tabLayout.f113964j3 == 1 || tabLayout.f113970m3 == 2) {
                tabLayout.c0(true);
            }
            E();
            if (com.google.android.material.badge.b.f111284a && this.f114012i.o() && this.f114012i.f114021e.isVisible()) {
                this.f114012i.invalidate();
            }
            return this;
        }

        @NonNull
        @z7.a
        public i B(@p0 Object obj) {
            this.f114004a = obj;
            return this;
        }

        @NonNull
        @z7.a
        public i C(@f1 int i10) {
            TabLayout tabLayout = this.f114011h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @z7.a
        public i D(@p0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f114007d) && !TextUtils.isEmpty(charSequence)) {
                this.f114012i.setContentDescription(charSequence);
            }
            this.f114006c = charSequence;
            E();
            return this;
        }

        void E() {
            n nVar = this.f114012i;
            if (nVar != null) {
                nVar.x();
            }
        }

        @p0
        public com.google.android.material.badge.a e() {
            return this.f114012i.getBadge();
        }

        @p0
        public CharSequence f() {
            n nVar = this.f114012i;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @p0
        public View g() {
            return this.f114009f;
        }

        @p0
        public Drawable h() {
            return this.f114005b;
        }

        public int i() {
            return this.f114013j;
        }

        @NonNull
        public com.google.android.material.badge.a j() {
            return this.f114012i.getOrCreateBadge();
        }

        public int k() {
            return this.f114008e;
        }

        @d
        public int l() {
            return this.f114010g;
        }

        @p0
        public Object m() {
            return this.f114004a;
        }

        @p0
        public CharSequence n() {
            return this.f114006c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f114011h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f114008e;
        }

        public void p() {
            this.f114012i.r();
        }

        void q() {
            this.f114011h = null;
            this.f114012i = null;
            this.f114004a = null;
            this.f114005b = null;
            this.f114013j = -1;
            this.f114006c = null;
            this.f114007d = null;
            this.f114008e = -1;
            this.f114009f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f114011h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.R(this);
        }

        @NonNull
        @z7.a
        public i s(@f1 int i10) {
            TabLayout tabLayout = this.f114011h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @z7.a
        public i t(@p0 CharSequence charSequence) {
            this.f114007d = charSequence;
            E();
            return this;
        }

        @NonNull
        @z7.a
        public i u(@j0 int i10) {
            return v(LayoutInflater.from(this.f114012i.getContext()).inflate(i10, (ViewGroup) this.f114012i, false));
        }

        @NonNull
        @z7.a
        public i v(@p0 View view) {
            this.f114009f = view;
            E();
            return this;
        }

        @NonNull
        @z7.a
        public i w(@v int i10) {
            TabLayout tabLayout = this.f114011h;
            if (tabLayout != null) {
                return x(j.a.b(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @z7.a
        public i x(@p0 Drawable drawable) {
            this.f114005b = drawable;
            TabLayout tabLayout = this.f114011h;
            if (tabLayout.f113964j3 == 1 || tabLayout.f113970m3 == 2) {
                tabLayout.c0(true);
            }
            E();
            if (com.google.android.material.badge.b.f111284a && this.f114012i.o() && this.f114012i.f114021e.isVisible()) {
                this.f114012i.invalidate();
            }
            return this;
        }

        @NonNull
        @z7.a
        public i y(int i10) {
            this.f114013j = i10;
            n nVar = this.f114012i;
            if (nVar != null) {
                nVar.setId(i10);
            }
            return this;
        }

        void z(int i10) {
            this.f114008e = i10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface l {
    }

    public static class m implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<TabLayout> f114014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f114015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f114016c;

        public m(TabLayout tabLayout) {
            this.f114014a = new WeakReference<>(tabLayout);
        }

        void a() {
            this.f114016c = 0;
            this.f114015b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f114015b = this.f114016c;
            this.f114016c = i10;
            TabLayout tabLayout = this.f114014a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.f114016c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f114014a.get();
            if (tabLayout != null) {
                int i12 = this.f114016c;
                boolean z10 = true;
                if (i12 == 2 && this.f114015b != 1) {
                    z10 = false;
                }
                if (i12 == 2 && this.f114015b == 0) {
                    z10 = false;
                }
                tabLayout.W(i10, f10, z10, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f114014a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f114016c;
                tabLayout.S(tabLayout.D(i10), i11 == 0 || (i11 == 2 && this.f114015b == 0));
            }
        }
    }

    public final class n extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f114017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextView f114018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f114019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private View f114020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private com.google.android.material.badge.a f114021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private View f114022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private TextView f114023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private ImageView f114024h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private Drawable f114025i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f114026j;

        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f114028a;

            a(View view) {
                this.f114028a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f114028a.getVisibility() == 0) {
                    n.this.w(this.f114028a);
                }
            }
        }

        public n(Context context) {
            super(context);
            this.f114026j = 2;
            y(context);
            u1.m2(this, TabLayout.this.f113955e, TabLayout.this.f113956f, TabLayout.this.f113957g, TabLayout.this.f113959h);
            setGravity(17);
            setOrientation(!TabLayout.this.f113972n3 ? 1 : 0);
            setClickable(true);
            u1.p2(this, androidx.core.view.f1.c(getContext(), 1002));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0070  */
        private void B(@p0 TextView textView, @p0 ImageView imageView, boolean z10) {
            boolean z11;
            i iVar = this.f114017a;
            Drawable drawableMutate = (iVar == null || iVar.h() == null) ? null : androidx.core.graphics.drawable.c.r(this.f114017a.h()).mutate();
            if (drawableMutate != null) {
                androidx.core.graphics.drawable.c.o(drawableMutate, TabLayout.this.f113969m);
                PorterDuff.Mode mode = TabLayout.this.f113983t;
                if (mode != null) {
                    androidx.core.graphics.drawable.c.p(drawableMutate, mode);
                }
            }
            i iVar2 = this.f114017a;
            CharSequence charSequenceN = iVar2 != null ? iVar2.n() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceN);
            if (textView != null) {
                if (zIsEmpty) {
                    z11 = false;
                } else {
                    z11 = true;
                    if (this.f114017a.f114010g != 1) {
                        z11 = false;
                    }
                }
                textView.setText(!zIsEmpty ? charSequenceN : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int i10 = (z11 && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.p0.i(getContext(), 8) : 0;
                if (TabLayout.this.f113972n3) {
                    if (i10 != androidx.core.view.j0.b(marginLayoutParams)) {
                        androidx.core.view.j0.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    androidx.core.view.j0.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.f114017a;
            CharSequence charSequence = iVar3 != null ? iVar3.f114007d : null;
            if (zIsEmpty) {
                charSequenceN = charSequence;
            }
            p1.a(this, charSequenceN);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public com.google.android.material.badge.a getBadge() {
            return this.f114021e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f114021e == null) {
                this.f114021e = com.google.android.material.badge.a.f(getContext());
            }
            v();
            com.google.android.material.badge.a aVar = this.f114021e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(@p0 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@NonNull Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void k(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        @NonNull
        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(@NonNull Canvas canvas) {
            Drawable drawable = this.f114025i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f114025i.draw(canvas);
            }
        }

        @p0
        private FrameLayout n(@NonNull View view) {
            int i10 = 7 << 0;
            if ((view == this.f114019c || view == this.f114018b) && com.google.android.material.badge.b.f111284a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            return this.f114021e != null;
        }

        private void p() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f111284a) {
                FrameLayout frameLayoutL = l();
                addView(frameLayoutL, 0);
                viewGroup = frameLayoutL;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(r6.a.k.H, viewGroup, false);
            this.f114019c = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void q() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.b.f111284a) {
                FrameLayout frameLayoutL = l();
                addView(frameLayoutL);
                viewGroup = frameLayoutL;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(r6.a.k.I, viewGroup, false);
            this.f114018b = textView;
            viewGroup.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (this.f114020d != null) {
                u();
            }
            this.f114021e = null;
        }

        private void t(@p0 View view) {
            if (o() && view != null) {
                k(false);
                com.google.android.material.badge.b.d(this.f114021e, view, n(view));
                this.f114020d = view;
            }
        }

        private void u() {
            if (o()) {
                k(true);
                View view = this.f114020d;
                if (view != null) {
                    com.google.android.material.badge.b.j(this.f114021e, view);
                    this.f114020d = null;
                }
            }
        }

        private void v() {
            i iVar;
            i iVar2;
            if (o()) {
                if (this.f114022f != null) {
                    u();
                    return;
                }
                if (this.f114019c != null && (iVar2 = this.f114017a) != null && iVar2.h() != null) {
                    View view = this.f114020d;
                    ImageView imageView = this.f114019c;
                    if (view == imageView) {
                        w(imageView);
                        return;
                    } else {
                        u();
                        t(this.f114019c);
                        return;
                    }
                }
                if (this.f114018b == null || (iVar = this.f114017a) == null || iVar.l() != 1) {
                    u();
                    return;
                }
                View view2 = this.f114020d;
                TextView textView = this.f114018b;
                if (view2 == textView) {
                    w(textView);
                } else {
                    u();
                    t(this.f114018b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(@NonNull View view) {
            if (o() && view == this.f114020d) {
                com.google.android.material.badge.b.m(this.f114021e, view, n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(Context context) {
            GradientDrawable gradientDrawable;
            int i10 = TabLayout.this.f113976p1;
            if (i10 != 0) {
                Drawable drawableB = j.a.b(context, i10);
                this.f114025i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f114025i.setState(getDrawableState());
                }
            } else {
                this.f114025i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f113971n != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = com.google.android.material.ripple.b.a(TabLayout.this.f113971n);
                boolean z10 = TabLayout.this.f113980r3;
                if (z10) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable3);
            }
            u1.O1(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        final void A() {
            ViewParent parent;
            i iVar = this.f114017a;
            View viewG = iVar != null ? iVar.g() : null;
            if (viewG != null) {
                ViewParent parent2 = viewG.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewG);
                    }
                    View view = this.f114022f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f114022f);
                    }
                    addView(viewG);
                }
                this.f114022f = viewG;
                TextView textView = this.f114018b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f114019c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f114019c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewG.findViewById(R.id.text1);
                this.f114023g = textView2;
                if (textView2 != null) {
                    this.f114026j = androidx.core.widget.r.k(textView2);
                }
                this.f114024h = (ImageView) viewG.findViewById(R.id.icon);
            } else {
                View view2 = this.f114022f;
                if (view2 != null) {
                    removeView(view2);
                    this.f114022f = null;
                }
                this.f114023g = null;
                this.f114024h = null;
            }
            if (this.f114022f == null) {
                if (this.f114019c == null) {
                    p();
                }
                if (this.f114018b == null) {
                    q();
                    this.f114026j = androidx.core.widget.r.k(this.f114018b);
                }
                androidx.core.widget.r.D(this.f114018b, TabLayout.this.f113961i);
                if (!isSelected() || TabLayout.this.f113965k == -1) {
                    androidx.core.widget.r.D(this.f114018b, TabLayout.this.f113963j);
                } else {
                    androidx.core.widget.r.D(this.f114018b, TabLayout.this.f113965k);
                }
                ColorStateList colorStateList = TabLayout.this.f113967l;
                if (colorStateList != null) {
                    this.f114018b.setTextColor(colorStateList);
                }
                B(this.f114018b, this.f114019c, true);
                v();
                i(this.f114019c);
                i(this.f114018b);
            } else {
                TextView textView3 = this.f114023g;
                if (textView3 != null || this.f114024h != null) {
                    B(textView3, this.f114024h, false);
                }
            }
            if (iVar == null || TextUtils.isEmpty(iVar.f114007d)) {
                return;
            }
            setContentDescription(iVar.f114007d);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f114025i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f114025i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f114018b, this.f114019c, this.f114022f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f114018b, this.f114019c, this.f114022f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        @p0
        public i getTab() {
            return this.f114017a;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            androidx.core.view.accessibility.j jVarR2 = androidx.core.view.accessibility.j.r2(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f114021e;
            if (aVar != null && aVar.isVisible()) {
                jVarR2.o1(this.f114021e.r());
            }
            jVarR2.m1(androidx.core.view.accessibility.j.g.j(0, 1, this.f114017a.k(), 1, false, isSelected()));
            if (isSelected()) {
                jVarR2.k1(false);
                jVarR2.V0(androidx.core.view.accessibility.j.a.f48547j);
            }
            jVarR2.V1(getResources().getString(r6.a.m.f360940a0));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.H1, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f114018b != null) {
                float f10 = TabLayout.this.f113986v;
                int i12 = this.f114026j;
                ImageView imageView = this.f114019c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f114018b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f113975p0;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f114018b.getTextSize();
                int lineCount = this.f114018b.getLineCount();
                int iK = androidx.core.widget.r.k(this.f114018b);
                if (f10 != textSize || (iK >= 0 && i12 != iK)) {
                    if (TabLayout.this.f113970m3 != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f114018b.getLayout()) != null && j(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f114018b.setTextSize(0, f10);
                        this.f114018b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f114017a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f114017a.r();
            return true;
        }

        void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f114018b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f114019c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f114022f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(@p0 i iVar) {
            if (iVar != this.f114017a) {
                this.f114017a = iVar;
                x();
            }
        }

        final void x() {
            A();
            i iVar = this.f114017a;
            setSelected(iVar != null && iVar.o());
        }

        final void z() {
            setOrientation(!TabLayout.this.f113972n3 ? 1 : 0);
            TextView textView = this.f114023g;
            if (textView == null && this.f114024h == null) {
                B(this.f114018b, this.f114019c, true);
            } else {
                B(textView, this.f114024h, false);
            }
        }
    }

    public static class o implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f114030a;

        public o(ViewPager viewPager) {
            this.f114030a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@NonNull i iVar) {
            this.f114030a.setCurrentItem(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(i iVar) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(@NonNull i iVar) {
        int size = this.f113987v3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f113987v3.get(size).a(iVar);
            }
        }
    }

    private void B(@NonNull i iVar) {
        for (int size = this.f113987v3.size() - 1; size >= 0; size--) {
            this.f113987v3.get(size).b(iVar);
        }
    }

    private void C() {
        if (this.f113990x3 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f113990x3 = valueAnimator;
            valueAnimator.setInterpolator(this.f113984t3);
            this.f113990x3.setDuration(this.f113966k3);
            this.f113990x3.addUpdateListener(new a());
        }
    }

    private boolean G() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void Q(int i10) {
        n nVar = (n) this.f113954d.getChildAt(i10);
        this.f113954d.removeViewAt(i10);
        if (nVar != null) {
            nVar.s();
            this.F3.a(nVar);
        }
        requestLayout();
    }

    private void Z(@p0 ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f113991y3;
        if (viewPager2 != null) {
            m mVar = this.B3;
            if (mVar != null) {
                viewPager2.O(mVar);
            }
            b bVar = this.C3;
            if (bVar != null) {
                this.f113991y3.N(bVar);
            }
        }
        c cVar = this.f113989w3;
        if (cVar != null) {
            M(cVar);
            this.f113989w3 = null;
        }
        if (viewPager != null) {
            this.f113991y3 = viewPager;
            if (this.B3 == null) {
                this.B3 = new m(this);
            }
            this.B3.a();
            viewPager.c(this.B3);
            o oVar = new o(viewPager);
            this.f113989w3 = oVar;
            g(oVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                T(adapter, z10);
            }
            if (this.C3 == null) {
                this.C3 = new b();
            }
            this.C3.b(z10);
            viewPager.b(this.C3);
            U(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f113991y3 = null;
            T(null, false);
        }
        this.D3 = z11;
    }

    private void a0() {
        int size = this.f113952b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f113952b.get(i10).E();
        }
    }

    private void b0(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f113970m3 == 1 && this.f113964j3 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @r(unit = 0)
    private int getDefaultHeight() {
        int size = this.f113952b.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f113952b.get(i10);
            if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                return !this.f113972n3 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f113977p2;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f113970m3;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.f113960h3;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f113954d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void m(@NonNull com.google.android.material.tabs.d dVar) {
        i iVarI = I();
        CharSequence charSequence = dVar.f114033a;
        if (charSequence != null) {
            iVarI.D(charSequence);
        }
        Drawable drawable = dVar.f114034b;
        if (drawable != null) {
            iVarI.x(drawable);
        }
        int i10 = dVar.f114035c;
        if (i10 != 0) {
            iVarI.u(i10);
        }
        if (!TextUtils.isEmpty(dVar.getContentDescription())) {
            iVarI.t(dVar.getContentDescription());
        }
        i(iVarI);
    }

    private void n(@NonNull i iVar) {
        n nVar = iVar.f114012i;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.f113954d.addView(nVar, iVar.k(), w());
    }

    private void o(View view) {
        if (!(view instanceof com.google.android.material.tabs.d)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m((com.google.android.material.tabs.d) view);
    }

    private void p(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !u1.Y0(this) || this.f113954d.d()) {
            U(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iS = s(i10, 0.0f);
        if (scrollX != iS) {
            C();
            this.f113990x3.setIntValues(scrollX, iS);
            this.f113990x3.start();
        }
        this.f113954d.c(i10, this.f113966k3);
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f113954d.setGravity(1);
                return;
            } else if (i10 != 2) {
                return;
            }
        }
        this.f113954d.setGravity(d0.f48643b);
    }

    private void r() {
        int i10 = this.f113970m3;
        int i11 = 0 ^ 2;
        u1.m2(this.f113954d, (i10 == 0 || i10 == 2) ? Math.max(0, this.f113962i3 - this.f113955e) : 0, 0, 0, 0);
        int i12 = this.f113970m3;
        if (i12 == 0) {
            q(this.f113964j3);
        } else if (i12 == 1 || i12 == 2) {
            this.f113954d.setGravity(1);
        }
        c0(true);
    }

    private int s(int i10, float f10) {
        int i11 = this.f113970m3;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        View childAt = this.f113954d.getChildAt(i10);
        if (childAt == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f113954d.getChildCount() ? this.f113954d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return u1.c0(this) == 0 ? left + i13 : left - i13;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f113954d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f113954d.getChildAt(i11);
                boolean z10 = true;
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof n) {
                        ((n) childAt).A();
                    }
                }
                i11++;
            }
        }
    }

    private void u(@NonNull i iVar, int i10) {
        iVar.z(i10);
        this.f113952b.add(i10, iVar);
        int size = this.f113952b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f113952b.get(i12).k() == this.f113951a) {
                i11 = i12;
            }
            this.f113952b.get(i12).z(i12);
        }
        this.f113951a = i11;
    }

    @NonNull
    private static ColorStateList v(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    @NonNull
    private LinearLayout.LayoutParams w() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        b0(layoutParams);
        return layoutParams;
    }

    @NonNull
    private n y(@NonNull i iVar) {
        s.a<n> aVar = this.F3;
        n nVarAcquire = aVar != null ? aVar.acquire() : null;
        if (nVarAcquire == null) {
            nVarAcquire = new n(getContext());
        }
        nVarAcquire.setTab(iVar);
        nVarAcquire.setFocusable(true);
        nVarAcquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f114007d)) {
            nVarAcquire.setContentDescription(iVar.f114006c);
            return nVarAcquire;
        }
        nVarAcquire.setContentDescription(iVar.f114007d);
        return nVarAcquire;
    }

    private void z(@NonNull i iVar) {
        for (int size = this.f113987v3.size() - 1; size >= 0; size--) {
            this.f113987v3.get(size).c(iVar);
        }
    }

    @p0
    public i D(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f113952b.get(i10);
    }

    public boolean E() {
        return this.f113980r3;
    }

    public boolean F() {
        return this.f113972n3;
    }

    public boolean H() {
        return this.f113974o3;
    }

    @NonNull
    public i I() {
        i iVarX = x();
        iVarX.f114011h = this;
        iVarX.f114012i = y(iVarX);
        if (iVarX.f114013j != -1) {
            iVarX.f114012i.setId(iVarX.f114013j);
        }
        return iVarX;
    }

    void J() {
        int currentItem;
        L();
        androidx.viewpager.widget.a aVar = this.f113992z3;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                l(I().D(this.f113992z3.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.f113991y3;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            R(D(currentItem));
        }
    }

    protected boolean K(i iVar) {
        return P3.a(iVar);
    }

    public void L() {
        int childCount = this.f113954d.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                Q(childCount);
            }
        }
        Iterator<i> it = this.f113952b.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            K(next);
        }
        this.f113953c = null;
    }

    @Deprecated
    public void M(@p0 c cVar) {
        this.f113987v3.remove(cVar);
    }

    public void N(@NonNull f fVar) {
        M(fVar);
    }

    public void O(@NonNull i iVar) {
        if (iVar.f114011h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        P(iVar.k());
    }

    public void P(int i10) {
        i iVar = this.f113953c;
        int iK = iVar != null ? iVar.k() : 0;
        Q(i10);
        i iVarRemove = this.f113952b.remove(i10);
        if (iVarRemove != null) {
            iVarRemove.q();
            K(iVarRemove);
        }
        int size = this.f113952b.size();
        int i11 = -1;
        for (int i12 = i10; i12 < size; i12++) {
            if (this.f113952b.get(i12).k() == this.f113951a) {
                i11 = i12;
            }
            this.f113952b.get(i12).z(i12);
        }
        this.f113951a = i11;
        if (iK == i10) {
            R(this.f113952b.isEmpty() ? null : this.f113952b.get(Math.max(0, i10 - 1)));
        }
    }

    public void R(@p0 i iVar) {
        S(iVar, true);
    }

    public void S(@p0 i iVar, boolean z10) {
        i iVar2 = this.f113953c;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                z(iVar);
                p(iVar.k());
                return;
            }
            return;
        }
        int iK = iVar != null ? iVar.k() : -1;
        if (z10) {
            if ((iVar2 == null || iVar2.k() == -1) && iK != -1) {
                U(iK, 0.0f, true);
            } else {
                p(iK);
            }
            if (iK != -1) {
                setSelectedTabView(iK);
            }
        }
        this.f113953c = iVar;
        if (iVar2 != null && iVar2.f114011h != null) {
            B(iVar2);
        }
        if (iVar != null) {
            A(iVar);
        }
    }

    void T(@p0 androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f113992z3;
        if (aVar2 != null && (dataSetObserver = this.A3) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f113992z3 = aVar;
        if (z10 && aVar != null) {
            if (this.A3 == null) {
                this.A3 = new g();
            }
            aVar.registerDataSetObserver(this.A3);
        }
        J();
    }

    public void U(int i10, float f10, boolean z10) {
        V(i10, f10, z10, true);
    }

    public void V(int i10, float f10, boolean z10, boolean z11) {
        W(i10, f10, z10, z11, true);
    }

    void W(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound >= 0 && iRound < this.f113954d.getChildCount()) {
            if (z11) {
                this.f113954d.h(i10, f10);
            }
            ValueAnimator valueAnimator = this.f113990x3;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f113990x3.cancel();
            }
            int iS = s(i10, f10);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iS >= scrollX) || (i10 > getSelectedTabPosition() && iS <= scrollX) || i10 == getSelectedTabPosition();
            if (u1.c0(this) == 1) {
                z13 = (i10 < getSelectedTabPosition() && iS <= scrollX) || (i10 > getSelectedTabPosition() && iS >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.E3 == 1 || z12) {
                if (i10 < 0) {
                    iS = 0;
                }
                scrollTo(iS, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public void X(int i10, int i11) {
        setTabTextColors(v(i10, i11));
    }

    public void Y(@p0 ViewPager viewPager, boolean z10) {
        Z(viewPager, z10, false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        o(view);
    }

    void c0(boolean z10) {
        for (int i10 = 0; i10 < this.f113954d.getChildCount(); i10++) {
            View childAt = this.f113954d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            b0((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void d0(int i10) {
        this.E3 = i10;
    }

    @Deprecated
    public void g(@p0 c cVar) {
        if (!this.f113987v3.contains(cVar)) {
            this.f113987v3.add(cVar);
        }
    }

    public int getSelectedTabPosition() {
        i iVar = this.f113953c;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f113952b.size();
    }

    public int getTabGravity() {
        return this.f113964j3;
    }

    @p0
    public ColorStateList getTabIconTint() {
        return this.f113969m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f113979q3;
    }

    public int getTabIndicatorGravity() {
        return this.f113968l3;
    }

    int getTabMaxWidth() {
        return this.H1;
    }

    public int getTabMode() {
        return this.f113970m3;
    }

    @p0
    public ColorStateList getTabRippleColor() {
        return this.f113971n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f113973o;
    }

    @p0
    public ColorStateList getTabTextColors() {
        return this.f113967l;
    }

    public void h(@NonNull f fVar) {
        g(fVar);
    }

    public void i(@NonNull i iVar) {
        l(iVar, this.f113952b.isEmpty());
    }

    public void j(@NonNull i iVar, int i10) {
        k(iVar, i10, this.f113952b.isEmpty());
    }

    public void k(@NonNull i iVar, int i10, boolean z10) {
        if (iVar.f114011h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        u(iVar, i10);
        n(iVar);
        if (z10) {
            iVar.r();
        }
    }

    public void l(@NonNull i iVar, boolean z10) {
        k(iVar, this.f113952b.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
        if (this.f113991y3 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                Z((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D3) {
            setupWithViewPager(null);
            this.D3 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i10 = 0; i10 < this.f113954d.getChildCount(); i10++) {
            View childAt = this.f113954d.getChildAt(i10);
            if (childAt instanceof n) {
                ((n) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.j.r2(accessibilityNodeInfo).l1(androidx.core.view.accessibility.j.f.h(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return G() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iRound = Math.round(com.google.android.material.internal.p0.i(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f113958g3;
            if (i12 <= 0) {
                i12 = (int) (size - com.google.android.material.internal.p0.i(getContext(), 56));
            }
            this.H1 = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.f113970m3;
            if (i13 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i13 != 1) {
                if (i13 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || G()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f113972n3 != z10) {
            this.f113972n3 = z10;
            for (int i10 = 0; i10 < this.f113954d.getChildCount(); i10++) {
                View childAt = this.f113954d.getChildAt(i10);
                if (childAt instanceof n) {
                    ((n) childAt).z();
                }
            }
            r();
        }
    }

    public void setInlineLabelResource(@androidx.annotation.h int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@p0 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        C();
        this.f113990x3.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@p0 Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
        this.f113973o = drawableMutate;
        com.google.android.material.drawable.a.n(drawableMutate, this.f113981s);
        int intrinsicHeight = this.f113978p3;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f113973o.getIntrinsicHeight();
        }
        this.f113954d.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@androidx.annotation.l int i10) {
        this.f113981s = i10;
        com.google.android.material.drawable.a.n(this.f113973o, i10);
        c0(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f113968l3 != i10) {
            this.f113968l3 = i10;
            u1.s1(this.f113954d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f113978p3 = i10;
        this.f113954d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f113964j3 != i10) {
            this.f113964j3 = i10;
            r();
        }
    }

    public void setTabIconTint(@p0 ColorStateList colorStateList) {
        if (this.f113969m != colorStateList) {
            this.f113969m = colorStateList;
            a0();
        }
    }

    public void setTabIconTintResource(@androidx.annotation.n int i10) {
        setTabIconTint(j.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f113979q3 = i10;
        if (i10 == 0) {
            this.f113982s3 = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f113982s3 = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f113982s3 = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f113974o3 = z10;
        this.f113954d.g();
        u1.s1(this.f113954d);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f113970m3) {
            this.f113970m3 = i10;
            r();
        }
    }

    public void setTabRippleColor(@p0 ColorStateList colorStateList) {
        if (this.f113971n != colorStateList) {
            this.f113971n = colorStateList;
            for (int i10 = 0; i10 < this.f113954d.getChildCount(); i10++) {
                View childAt = this.f113954d.getChildAt(i10);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@androidx.annotation.n int i10) {
        setTabRippleColor(j.a.a(getContext(), i10));
    }

    public void setTabTextColors(@p0 ColorStateList colorStateList) {
        if (this.f113967l != colorStateList) {
            this.f113967l = colorStateList;
            a0();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@p0 androidx.viewpager.widget.a aVar) {
        T(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f113980r3 != z10) {
            this.f113980r3 = z10;
            for (int i10 = 0; i10 < this.f113954d.getChildCount(); i10++) {
                View childAt = this.f113954d.getChildAt(i10);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@androidx.annotation.h int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@p0 ViewPager viewPager) {
        Y(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void t() {
        this.f113987v3.clear();
    }

    protected i x() {
        i iVarAcquire = P3.acquire();
        return iVarAcquire == null ? new i() : iVarAcquire;
    }

    public TabLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359274gi);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        o(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@p0 c cVar) {
        c cVar2 = this.f113985u3;
        if (cVar2 != null) {
            M(cVar2);
        }
        this.f113985u3 = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = G3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f113951a = -1;
        this.f113952b = new ArrayList<>();
        this.f113965k = -1;
        this.f113981s = 0;
        this.H1 = Integer.MAX_VALUE;
        this.f113978p3 = -1;
        this.f113987v3 = new ArrayList<>();
        this.F3 = new s.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context2);
        this.f113954d = hVar;
        int i12 = 2 & (-2);
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.Av, i10, i11, r6.a.o.Zv);
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(getBackground());
        if (colorStateListG != null) {
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            kVar.p0(colorStateListG);
            kVar.a0(context2);
            kVar.o0(u1.T(this));
            u1.O1(this, kVar);
        }
        setSelectedTabIndicator(com.google.android.material.resources.c.e(context2, typedArrayK, r6.a.o.Gv));
        setSelectedTabIndicatorColor(typedArrayK.getColor(r6.a.o.Jv, 0));
        hVar.i(typedArrayK.getDimensionPixelSize(r6.a.o.Mv, -1));
        setSelectedTabIndicatorGravity(typedArrayK.getInt(r6.a.o.Lv, 0));
        setTabIndicatorAnimationMode(typedArrayK.getInt(r6.a.o.Iv, 0));
        setTabIndicatorFullWidth(typedArrayK.getBoolean(r6.a.o.Kv, true));
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(r6.a.o.Rv, 0);
        this.f113959h = dimensionPixelSize;
        this.f113957g = dimensionPixelSize;
        this.f113956f = dimensionPixelSize;
        this.f113955e = dimensionPixelSize;
        this.f113955e = typedArrayK.getDimensionPixelSize(r6.a.o.Uv, dimensionPixelSize);
        this.f113956f = typedArrayK.getDimensionPixelSize(r6.a.o.Vv, this.f113956f);
        this.f113957g = typedArrayK.getDimensionPixelSize(r6.a.o.Tv, this.f113957g);
        this.f113959h = typedArrayK.getDimensionPixelSize(r6.a.o.Sv, this.f113959h);
        if (g0.h(context2)) {
            this.f113961i = r6.a.c.Zi;
        } else {
            this.f113961i = r6.a.c.f359592ui;
        }
        int resourceId = typedArrayK.getResourceId(r6.a.o.Zv, r6.a.n.Y7);
        this.f113963j = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, i.a.m.f286484a6);
        try {
            this.f113986v = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.f286493b6, 0);
            this.f113967l = com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, i.a.m.f286520e6);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayK.hasValue(r6.a.o.Xv)) {
                this.f113965k = typedArrayK.getResourceId(r6.a.o.Xv, resourceId);
            }
            int i13 = this.f113965k;
            if (i13 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i13, i.a.m.f286484a6);
                try {
                    this.f113988w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i.a.m.f286493b6, (int) this.f113986v);
                    ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes2, i.a.m.f286520e6);
                    if (colorStateListA != null) {
                        this.f113967l = v(this.f113967l.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            if (typedArrayK.hasValue(r6.a.o.aw)) {
                this.f113967l = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.aw);
            }
            if (typedArrayK.hasValue(r6.a.o.Yv)) {
                this.f113967l = v(this.f113967l.getDefaultColor(), typedArrayK.getColor(r6.a.o.Yv, 0));
            }
            this.f113969m = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.Ev);
            this.f113983t = com.google.android.material.internal.p0.t(typedArrayK.getInt(r6.a.o.Fv, -1), null);
            this.f113971n = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.Wv);
            this.f113966k3 = typedArrayK.getInt(r6.a.o.Hv, 300);
            this.f113984t3 = com.google.android.material.motion.j.g(context2, r6.a.c.Vd, com.google.android.material.animation.b.f111044b);
            this.f113977p2 = typedArrayK.getDimensionPixelSize(r6.a.o.Pv, -1);
            this.f113958g3 = typedArrayK.getDimensionPixelSize(r6.a.o.Ov, -1);
            this.f113976p1 = typedArrayK.getResourceId(r6.a.o.Bv, 0);
            this.f113962i3 = typedArrayK.getDimensionPixelSize(r6.a.o.Cv, 0);
            this.f113970m3 = typedArrayK.getInt(r6.a.o.Qv, 1);
            this.f113964j3 = typedArrayK.getInt(r6.a.o.Dv, 0);
            this.f113972n3 = typedArrayK.getBoolean(r6.a.o.Nv, false);
            this.f113980r3 = typedArrayK.getBoolean(r6.a.o.bw, false);
            typedArrayK.recycle();
            Resources resources = getResources();
            this.f113975p0 = resources.getDimensionPixelSize(r6.a.f.K1);
            this.f113960h3 = resources.getDimensionPixelSize(r6.a.f.I1);
            r();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    public void setSelectedTabIndicator(@v int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(j.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
