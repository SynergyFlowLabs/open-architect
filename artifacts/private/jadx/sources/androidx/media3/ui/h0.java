package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class h0 {
    private static final long D = 2000;
    private static final long E = 250;
    private static final long F = 250;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;
    private static final int K = 4;
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f69836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final ViewGroup f69844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f69847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f69848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f69849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f69850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f69851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f69852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f69853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f69854s = new Runnable() { // from class: androidx.media3.ui.z
        @Override // java.lang.Runnable
        public final void run() {
            this.f70534a.Z();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f69855t = new Runnable() { // from class: androidx.media3.ui.c0
        @Override // java.lang.Runnable
        public final void run() {
            this.f69782a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f69856u = new Runnable() { // from class: androidx.media3.ui.d0
        @Override // java.lang.Runnable
        public final void run() {
            this.f69784a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f69857v = new Runnable() { // from class: androidx.media3.ui.e0
        @Override // java.lang.Runnable
        public final void run() {
            this.f69786a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f69858w = new Runnable() { // from class: androidx.media3.ui.f0
        @Override // java.lang.Runnable
        public final void run() {
            this.f69829a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f69859x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.g0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f69833a.O(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f69861z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<View> f69860y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (h0.this.f69837b != null) {
                h0.this.f69837b.setVisibility(4);
            }
            if (h0.this.f69838c != null) {
                h0.this.f69838c.setVisibility(4);
            }
            if (h0.this.f69840e != null) {
                h0.this.f69840e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(h0.this.f69845j instanceof androidx.media3.ui.f) || h0.this.A) {
                return;
            }
            ((androidx.media3.ui.f) h0.this.f69845j).i(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (h0.this.f69837b != null) {
                h0.this.f69837b.setVisibility(0);
            }
            if (h0.this.f69838c != null) {
                h0.this.f69838c.setVisibility(0);
            }
            if (h0.this.f69840e != null) {
                h0.this.f69840e.setVisibility(h0.this.A ? 0 : 4);
            }
            if ((h0.this.f69845j instanceof androidx.media3.ui.f) && !h0.this.A) {
                ((androidx.media3.ui.f) h0.this.f69845j).t(250L);
            }
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f69864a;

        c(o oVar) {
            this.f69864a = oVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h0.this.W(1);
            if (h0.this.B) {
                this.f69864a.post(h0.this.f69854s);
                h0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h0.this.W(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f69866a;

        d(o oVar) {
            this.f69866a = oVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h0.this.W(2);
            if (h0.this.B) {
                this.f69866a.post(h0.this.f69854s);
                h0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h0.this.W(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f69868a;

        e(o oVar) {
            this.f69868a = oVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h0.this.W(2);
            if (h0.this.B) {
                this.f69868a.post(h0.this.f69854s);
                h0.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h0.this.W(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h0.this.W(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h0.this.W(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h0.this.W(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h0.this.W(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (h0.this.f69841f != null) {
                h0.this.f69841f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (h0.this.f69843h != null) {
                h0.this.f69843h.setVisibility(0);
                h0.this.f69843h.setTranslationX(h0.this.f69843h.getWidth());
                h0.this.f69843h.scrollTo(h0.this.f69843h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (h0.this.f69843h != null) {
                h0.this.f69843h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (h0.this.f69841f != null) {
                h0.this.f69841f.setVisibility(0);
            }
        }
    }

    public h0(o oVar) {
        this.f69836a = oVar;
        this.f69837b = oVar.findViewById(v0.g.f70277e0);
        this.f69838c = (ViewGroup) oVar.findViewById(v0.g.Z);
        this.f69840e = (ViewGroup) oVar.findViewById(v0.g.f70310p0);
        ViewGroup viewGroup = (ViewGroup) oVar.findViewById(v0.g.X);
        this.f69839d = viewGroup;
        this.f69844i = (ViewGroup) oVar.findViewById(v0.g.O0);
        View viewFindViewById = oVar.findViewById(v0.g.B0);
        this.f69845j = viewFindViewById;
        this.f69841f = (ViewGroup) oVar.findViewById(v0.g.W);
        this.f69842g = (ViewGroup) oVar.findViewById(v0.g.f70286h0);
        this.f69843h = (ViewGroup) oVar.findViewById(v0.g.f70289i0);
        View viewFindViewById2 = oVar.findViewById(v0.g.f70322t0);
        this.f69846k = viewFindViewById2;
        View viewFindViewById3 = oVar.findViewById(v0.g.f70319s0);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70107a.Q(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70107a.Q(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.d(this.f70520a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.f(this.f70532a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = oVar.getResources();
        float dimension = resources.getDimension(v0.d.F) - resources.getDimension(v0.d.K);
        float dimension2 = resources.getDimension(v0.d.F);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f69847l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(oVar));
        animatorSet.play(valueAnimatorOfFloat).with(K(0.0f, dimension, viewFindViewById)).with(K(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f69848m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(oVar));
        animatorSet2.play(K(dimension, dimension2, viewFindViewById)).with(K(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f69849n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(oVar));
        animatorSet3.play(valueAnimatorOfFloat).with(K(0.0f, dimension2, viewFindViewById)).with(K(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f69850o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(K(dimension, 0.0f, viewFindViewById)).with(K(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f69851p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(K(dimension2, 0.0f, viewFindViewById)).with(K(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f69852q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.a(this.f69766a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f69853r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.l(this.f69780a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(@androidx.annotation.p0 View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            width += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f69849n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        W(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f69847l.start();
        R(this.f69856u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f69848m.start();
    }

    private static ObjectAnimator K(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zB0 = b0();
        if (this.A != zB0) {
            this.A = zB0;
            view.post(new Runnable() { // from class: androidx.media3.ui.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70106a.a0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f70533a.P();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        int i10;
        if (this.f69841f == null || this.f69842g == null) {
            return;
        }
        int width = (this.f69836a.getWidth() - this.f69836a.getPaddingLeft()) - this.f69836a.getPaddingRight();
        while (true) {
            if (this.f69842g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f69842g.getChildCount() - 2;
            View childAt = this.f69842g.getChildAt(childCount);
            this.f69842g.removeViewAt(childCount);
            this.f69841f.addView(childAt, 0);
        }
        View view = this.f69846k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f69844i);
        int childCount2 = this.f69841f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f69841f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f69843h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f69853r.isStarted()) {
                return;
            }
            this.f69852q.cancel();
            this.f69853r.start();
            return;
        }
        View view2 = this.f69846k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f69846k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f69841f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f69841f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f69842g.addView((View) arrayList.get(i10), this.f69842g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(View view) {
        T();
        if (view.getId() == v0.g.f70322t0) {
            this.f69852q.start();
        } else {
            if (view.getId() == v0.g.f70319s0) {
                this.f69853r.start();
            }
        }
    }

    private void R(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f69836a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i10) {
        int i11 = this.f69861z;
        this.f69861z = i10;
        if (i10 == 2) {
            this.f69836a.setVisibility(8);
        } else if (i11 == 2) {
            this.f69836a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f69836a.g0();
        }
    }

    private boolean X(View view) {
        int id2 = view.getId();
        return id2 == v0.g.X || id2 == v0.g.A0 || id2 == v0.g.f70316r0 || id2 == v0.g.E0 || id2 == v0.g.F0 || id2 == v0.g.f70292j0 || id2 == v0.g.f70295k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (!this.C) {
            W(0);
            T();
            return;
        }
        int i10 = this.f69861z;
        if (i10 == 1) {
            this.f69850o.start();
        } else if (i10 == 2) {
            this.f69851p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        T();
    }

    public static /* synthetic */ void a(h0 h0Var, ValueAnimator valueAnimator) {
        h0Var.getClass();
        h0Var.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        ViewGroup viewGroup = this.f69840e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f69845j != null) {
            int dimensionPixelSize = this.f69836a.getResources().getDimensionPixelSize(v0.d.O);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69845j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f69845j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f69845j;
            if (view instanceof androidx.media3.ui.f) {
                androidx.media3.ui.f fVar = (androidx.media3.ui.f) view;
                if (this.A) {
                    fVar.j(true);
                } else {
                    int i10 = this.f69861z;
                    if (i10 == 1) {
                        fVar.j(false);
                    } else if (i10 != 3) {
                        fVar.s();
                    }
                }
            }
        }
        for (View view2 : this.f69860y) {
            view2.setVisibility((this.A && X(view2)) ? 4 : 0);
        }
    }

    private boolean b0() {
        int width = (this.f69836a.getWidth() - this.f69836a.getPaddingLeft()) - this.f69836a.getPaddingRight();
        int height = (this.f69836a.getHeight() - this.f69836a.getPaddingBottom()) - this.f69836a.getPaddingTop();
        int iB = B(this.f69838c);
        ViewGroup viewGroup = this.f69838c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f69838c.getPaddingRight() : 0);
        int iZ = z(this.f69838c);
        ViewGroup viewGroup2 = this.f69838c;
        return width <= Math.max(paddingLeft, B(this.f69844i) + B(this.f69846k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f69838c.getPaddingBottom() : 0)) + (z(this.f69839d) * 2);
    }

    public static /* synthetic */ void d(h0 h0Var, ValueAnimator valueAnimator) {
        h0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = h0Var.f69837b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = h0Var.f69838c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = h0Var.f69840e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void f(h0 h0Var, ValueAnimator valueAnimator) {
        h0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = h0Var.f69837b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = h0Var.f69838c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = h0Var.f69840e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void l(h0 h0Var, ValueAnimator valueAnimator) {
        h0Var.getClass();
        h0Var.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f69843h;
        if (viewGroup != null) {
            this.f69843h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup2 = this.f69844i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f69841f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(@androidx.annotation.p0 View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height;
    }

    public boolean A(@androidx.annotation.p0 View view) {
        return view != null && this.f69860y.contains(view);
    }

    public void C() {
        int i10 = this.f69861z;
        if (i10 != 3 && i10 != 2) {
            S();
            if (!this.C) {
                E();
            } else {
                if (this.f69861z == 1) {
                    H();
                    return;
                }
                D();
            }
        }
    }

    public void F() {
        int i10 = this.f69861z;
        if (i10 != 3 && i10 != 2) {
            S();
            E();
        }
    }

    public boolean I() {
        return this.C;
    }

    public boolean J() {
        return this.f69861z == 0 && this.f69836a.f0();
    }

    public void L() {
        this.f69836a.addOnLayoutChangeListener(this.f69859x);
    }

    public void M() {
        this.f69836a.removeOnLayoutChangeListener(this.f69859x);
    }

    public void N(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f69837b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void S() {
        this.f69836a.removeCallbacks(this.f69858w);
        this.f69836a.removeCallbacks(this.f69855t);
        this.f69836a.removeCallbacks(this.f69857v);
        this.f69836a.removeCallbacks(this.f69856u);
    }

    public void T() {
        if (this.f69861z == 3) {
            return;
        }
        S();
        int showTimeoutMs = this.f69836a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                R(this.f69858w, showTimeoutMs);
            } else if (this.f69861z == 1) {
                R(this.f69856u, 2000L);
            } else {
                R(this.f69857v, showTimeoutMs);
            }
        }
    }

    public void U(boolean z10) {
        this.C = z10;
    }

    public void V(@androidx.annotation.p0 View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f69860y.remove(view);
            return;
        }
        if (this.A && X(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f69860y.add(view);
    }

    public void Y() {
        if (!this.f69836a.f0()) {
            this.f69836a.setVisibility(0);
            this.f69836a.p0();
            this.f69836a.l0();
        }
        Z();
    }
}
