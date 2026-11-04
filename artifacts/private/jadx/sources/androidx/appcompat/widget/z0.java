package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class z0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f11671l = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Interpolator f11672m = new DecelerateInterpolator();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f11673n = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f11674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f11675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LinearLayoutCompat f11676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f11677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f11679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f11680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ViewPropertyAnimator f11683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final e f11684k;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11685a;

        a(View view) {
            this.f11685a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.smoothScrollTo(this.f11685a.getLeft() - ((z0.this.getWidth() - this.f11685a.getWidth()) / 2), 0);
            z0.this.f11674a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return z0.this.f11676c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) z0.this.f11676c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return z0.this.g((androidx.appcompat.app.a.f) getItem(i10), true);
            }
            ((d) view).a((androidx.appcompat.app.a.f) getItem(i10));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = z0.this.f11676c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = z0.this.f11676c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f11689g = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f11690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.app.a.f f11691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f11692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f11693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f11694e;

        public d(Context context, androidx.appcompat.app.a.f fVar, boolean z10) {
            super(context, null, i.a.b.f285921h);
            int[] iArr = {R.attr.background};
            this.f11690a = iArr;
            this.f11691b = fVar;
            j1 j1VarG = j1.G(context, null, iArr, i.a.b.f285921h, 0);
            if (j1VarG.C(0)) {
                setBackgroundDrawable(j1VarG.h(0));
            }
            j1VarG.I();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(androidx.appcompat.app.a.f fVar) {
            this.f11691b = fVar;
            c();
        }

        public androidx.appcompat.app.a.f b() {
            return this.f11691b;
        }

        public void c() {
            androidx.appcompat.app.a.f fVar = this.f11691b;
            View viewB = fVar.b();
            CharSequence charSequenceA = null;
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f11694e = viewB;
                TextView textView = this.f11692c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f11693d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f11693d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f11694e;
            if (view != null) {
                removeView(view);
                this.f11694e = null;
            }
            Drawable drawableC = fVar.c();
            CharSequence charSequenceF = fVar.f();
            if (drawableC != null) {
                if (this.f11693d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f11693d = appCompatImageView;
                }
                this.f11693d.setImageDrawable(drawableC);
                this.f11693d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f11693d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f11693d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceF);
            if (zIsEmpty) {
                TextView textView2 = this.f11692c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f11692c.setText((CharSequence) null);
                }
            } else {
                if (this.f11692c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, i.a.b.f285927i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f11692c = appCompatTextView;
                }
                this.f11692c.setText(charSequenceF);
                this.f11692c.setVisibility(0);
            }
            ImageView imageView3 = this.f11693d;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            if (zIsEmpty) {
                charSequenceA = fVar.a();
            }
            p1.a(this, charSequenceA);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f11689g);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f11689g);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (z0.this.f11679f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = z0.this.f11679f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11696a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11697b;

        protected e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i10) {
            this.f11697b = i10;
            z0.this.f11683j = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11696a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11696a) {
                return;
            }
            z0 z0Var = z0.this;
            z0Var.f11683j = null;
            z0Var.setVisibility(this.f11697b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z0.this.setVisibility(0);
            this.f11696a = false;
        }
    }

    public z0(@NonNull Context context) {
        super(context);
        this.f11684k = new e();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        setContentHeight(aVarB.f());
        this.f11680g = aVarB.e();
        LinearLayoutCompat linearLayoutCompatF = f();
        this.f11676c = linearLayoutCompatF;
        int i10 = 7 & (-1);
        addView(linearLayoutCompatF, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, i.a.b.f285951m);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, i.a.b.f285915g);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        return linearLayoutCompat;
    }

    private boolean h() {
        Spinner spinner = this.f11677d;
        return spinner != null && spinner.getParent() == this;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.f11677d == null) {
            this.f11677d = e();
        }
        removeView(this.f11676c);
        addView(this.f11677d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f11677d.getAdapter() == null) {
            this.f11677d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f11674a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f11674a = null;
        }
        this.f11677d.setSelection(this.f11682i);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f11677d);
        addView(this.f11676c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f11677d.getSelectedItemPosition());
        return false;
    }

    public void a(androidx.appcompat.app.a.f fVar, int i10, boolean z10) {
        d dVarG = g(fVar, false);
        this.f11676c.addView(dVarG, i10, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.f11677d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarG.setSelected(true);
        }
        if (this.f11678e) {
            requestLayout();
        }
    }

    public void b(androidx.appcompat.app.a.f fVar, boolean z10) {
        d dVarG = g(fVar, false);
        this.f11676c.addView(dVarG, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.f11677d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarG.setSelected(true);
        }
        if (this.f11678e) {
            requestLayout();
        }
    }

    public void c(int i10) {
        View childAt = this.f11676c.getChildAt(i10);
        Runnable runnable = this.f11674a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f11674a = aVar;
        post(aVar);
    }

    public void d(int i10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f11683j;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i10 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f11672m);
            viewPropertyAnimatorAlpha.setListener(this.f11684k.a(viewPropertyAnimatorAlpha, i10));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f11672m);
        viewPropertyAnimatorAlpha2.setListener(this.f11684k.a(viewPropertyAnimatorAlpha2, i10));
        viewPropertyAnimatorAlpha2.start();
    }

    d g(androidx.appcompat.app.a.f fVar, boolean z10) {
        d dVar = new d(getContext(), fVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f11681h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f11675b == null) {
            this.f11675b = new c();
        }
        dVar.setOnClickListener(this.f11675b);
        return dVar;
    }

    public void k() {
        this.f11676c.removeAllViews();
        Spinner spinner = this.f11677d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f11678e) {
            requestLayout();
        }
    }

    public void l(int i10) {
        this.f11676c.removeViewAt(i10);
        Spinner spinner = this.f11677d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f11678e) {
            requestLayout();
        }
    }

    public void m(int i10) {
        ((d) this.f11676c.getChildAt(i10)).c();
        Spinner spinner = this.f11677d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f11678e) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f11674a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f11680g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f11674a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f11676c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f11679f = -1;
        } else {
            if (childCount > 2) {
                this.f11679f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f11679f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f11679f = Math.min(this.f11679f, this.f11680g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f11681h, 1073741824);
        if (z10 || !this.f11678e) {
            j();
        } else {
            this.f11676c.measure(0, iMakeMeasureSpec);
            if (this.f11676c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                i();
            } else {
                j();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f11682i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f11678e = z10;
    }

    public void setContentHeight(int i10) {
        this.f11681h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f11682i = i10;
        int childCount = this.f11676c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f11676c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                c(i10);
            }
            i11++;
        }
        Spinner spinner = this.f11677d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
