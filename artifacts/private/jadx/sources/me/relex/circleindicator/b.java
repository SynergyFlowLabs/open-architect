package me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.v;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class b extends LinearLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f332621s = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager f332622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f332623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f332624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f332625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f332626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f332627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f332628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f332629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator f332630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animator f332631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animator f332632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f332633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f332634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewPager.j f332635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DataSetObserver f332636o;

    class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            if (b.this.f332622a.getAdapter() != null && b.this.f332622a.getAdapter().getCount() > 0) {
                if (b.this.f332631j.isRunning()) {
                    b.this.f332631j.cancel();
                }
                if (b.this.f332630i.isRunning()) {
                    b.this.f332630i.cancel();
                }
                if (b.this.f332634m >= 0) {
                    b bVar = b.this;
                    View childAt = bVar.getChildAt(bVar.f332634m);
                    childAt.setBackgroundResource(b.this.f332629h);
                    b.this.f332631j.setTarget(childAt);
                    b.this.f332631j.start();
                }
                View childAt2 = b.this.getChildAt(i10);
                childAt2.setBackgroundResource(b.this.f332628g);
                b.this.f332630i.setTarget(childAt2);
                b.this.f332630i.start();
                b.this.f332634m = i10;
            }
        }
    }

    /* JADX INFO: renamed from: me.relex.circleindicator.b$b, reason: collision with other inner class name */
    class C2334b extends DataSetObserver {
        C2334b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            int count = b.this.f332622a.getAdapter().getCount();
            if (count == b.this.getChildCount()) {
                return;
            }
            if (b.this.f332634m < count) {
                b bVar = b.this;
                bVar.f332634m = bVar.f332622a.getCurrentItem();
            } else {
                b.this.f332634m = -1;
            }
            b.this.o();
        }
    }

    private class c implements Interpolator {
        private c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return Math.abs(1.0f - f10);
        }

        /* synthetic */ c(b bVar, a aVar) {
            this();
        }
    }

    public b(Context context) {
        super(context);
        this.f332623b = -1;
        this.f332624c = -1;
        this.f332625d = -1;
        this.f332626e = me.relex.circleindicator.c.a.f332640a;
        this.f332627f = 0;
        int i10 = me.relex.circleindicator.c.C2335c.f332648a;
        this.f332628g = i10;
        this.f332629h = i10;
        this.f332634m = -1;
        this.f332635n = new a();
        this.f332636o = new C2334b();
        r(context, null);
    }

    private void i(@v int i10, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i10);
        addView(view, this.f332624c, this.f332625d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int i11 = this.f332623b;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        view.setLayoutParams(layoutParams);
        animator.setTarget(view);
        animator.start();
    }

    private void j(Context context) {
        int iP = this.f332624c;
        if (iP < 0) {
            iP = p(5.0f);
        }
        this.f332624c = iP;
        int iP2 = this.f332625d;
        if (iP2 < 0) {
            iP2 = p(5.0f);
        }
        this.f332625d = iP2;
        int iP3 = this.f332623b;
        if (iP3 < 0) {
            iP3 = p(5.0f);
        }
        this.f332623b = iP3;
        int i10 = this.f332626e;
        if (i10 == 0) {
            i10 = me.relex.circleindicator.c.a.f332640a;
        }
        this.f332626e = i10;
        this.f332630i = n(context);
        Animator animatorN = n(context);
        this.f332632k = animatorN;
        animatorN.setDuration(0L);
        this.f332631j = m(context);
        Animator animatorM = m(context);
        this.f332633l = animatorM;
        animatorM.setDuration(0L);
        int i11 = this.f332628g;
        if (i11 == 0) {
            i11 = me.relex.circleindicator.c.C2335c.f332648a;
        }
        this.f332628g = i11;
        int i12 = this.f332629h;
        if (i12 != 0) {
            i11 = i12;
        }
        this.f332629h = i11;
    }

    private Animator m(Context context) {
        int i10 = this.f332627f;
        if (i10 != 0) {
            return AnimatorInflater.loadAnimator(context, i10);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, this.f332626e);
        animatorLoadAnimator.setInterpolator(new c(this, null));
        return animatorLoadAnimator;
    }

    private Animator n(Context context) {
        return AnimatorInflater.loadAnimator(context, this.f332626e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        removeAllViews();
        int count = this.f332622a.getAdapter().getCount();
        if (count <= 0) {
            return;
        }
        int currentItem = this.f332622a.getCurrentItem();
        for (int i10 = 0; i10 < count; i10++) {
            if (currentItem == i10) {
                i(this.f332628g, this.f332632k);
            } else {
                i(this.f332629h, this.f332633l);
            }
        }
    }

    private void q(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.relex.circleindicator.c.d.f332649a);
        this.f332624c = typedArrayObtainStyledAttributes.getDimensionPixelSize(me.relex.circleindicator.c.d.f332656h, -1);
        this.f332625d = typedArrayObtainStyledAttributes.getDimensionPixelSize(me.relex.circleindicator.c.d.f332654f, -1);
        this.f332623b = typedArrayObtainStyledAttributes.getDimensionPixelSize(me.relex.circleindicator.c.d.f332655g, -1);
        this.f332626e = typedArrayObtainStyledAttributes.getResourceId(me.relex.circleindicator.c.d.f332650b, me.relex.circleindicator.c.a.f332640a);
        this.f332627f = typedArrayObtainStyledAttributes.getResourceId(me.relex.circleindicator.c.d.f332651c, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(me.relex.circleindicator.c.d.f332652d, me.relex.circleindicator.c.C2335c.f332648a);
        this.f332628g = resourceId;
        this.f332629h = typedArrayObtainStyledAttributes.getResourceId(me.relex.circleindicator.c.d.f332653e, resourceId);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void r(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        setGravity(17);
        q(context, attributeSet);
        j(context);
    }

    public void k(int i10, int i11, int i12) {
        int i13 = me.relex.circleindicator.c.a.f332640a;
        int i14 = me.relex.circleindicator.c.C2335c.f332648a;
        l(i10, i11, i12, i13, 0, i14, i14);
    }

    public void l(int i10, int i11, int i12, @androidx.annotation.b int i13, @androidx.annotation.b int i14, @v int i15, @v int i16) {
        this.f332624c = i10;
        this.f332625d = i11;
        this.f332623b = i12;
        this.f332626e = i13;
        this.f332627f = i14;
        this.f332628g = i15;
        this.f332629h = i16;
        j(getContext());
    }

    public int p(float f10) {
        return (int) ((f10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.j jVar) {
        ViewPager viewPager = this.f332622a;
        if (viewPager == null) {
            throw new NullPointerException("can not find Viewpager , setViewPager first");
        }
        viewPager.O(jVar);
        this.f332622a.c(jVar);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f332622a = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        o();
        this.f332622a.O(this.f332635n);
        this.f332622a.c(this.f332635n);
        this.f332622a.getAdapter().registerDataSetObserver(this.f332636o);
        this.f332635n.onPageSelected(this.f332622a.getCurrentItem());
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f332623b = -1;
        this.f332624c = -1;
        this.f332625d = -1;
        this.f332626e = me.relex.circleindicator.c.a.f332640a;
        this.f332627f = 0;
        int i10 = me.relex.circleindicator.c.C2335c.f332648a;
        this.f332628g = i10;
        this.f332629h = i10;
        this.f332634m = -1;
        this.f332635n = new a();
        this.f332636o = new C2334b();
        r(context, attributeSet);
    }
}
