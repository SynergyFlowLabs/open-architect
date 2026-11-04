package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.u1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f113449j = 250;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f113450k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f113451l = 750;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f113452m = 250;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f113453n = 250;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f113454o = 300;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f113455p = 75;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f113456q = 250;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f113457r = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Animator f113461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Animator f113462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f113463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f113464g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<SearchBar.b> f113458a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f113459b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<AnimatorListenerAdapter> f113460c = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f113465h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator f113466i = null;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.k(new f() { // from class: com.google.android.material.search.i
                @Override // com.google.android.material.search.j.f
                public final void a(SearchBar.b bVar) {
                    bVar.a();
                }
            });
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f113468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animator f113469b;

        b(View view, Animator animator) {
            this.f113468a = view;
            this.f113469b = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f113468a.setVisibility(8);
            this.f113469b.start();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SearchBar f113471a;

        c(SearchBar searchBar) {
            this.f113471a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f113463f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f113471a.setVisibility(4);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f113466i = null;
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SearchBar f113474a;

        e(SearchBar searchBar) {
            this.f113474a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f113474a.setVisibility(0);
            j.this.f113464g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f113474a.g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f {
        void a(SearchBar.b bVar);
    }

    j() {
    }

    public static /* synthetic */ void b(j jVar, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        jVar.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(jVar.t(searchBar, view), jVar.o(searchBar, view, appBarLayout));
        animatorSet.addListener(new k(jVar));
        Iterator<AnimatorListenerAdapter> it = jVar.f113459b.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        jVar.f113466i = animatorSet;
    }

    public static /* synthetic */ void c(com.google.android.material.shape.k kVar, View view, ValueAnimator valueAnimator) {
        kVar.q0(1.0f - valueAnimator.getAnimatedFraction());
        u1.O1(view, kVar);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(f fVar) {
        Iterator<SearchBar.b> it = this.f113458a.iterator();
        while (it.hasNext()) {
            fVar.a(it.next());
        }
    }

    private Animator l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(250L).e(new e(searchBar)).h();
    }

    private Animator m(@p0 View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(view));
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f111043a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f113465h ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.f113465h ? 500L : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.t.f(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(f113451l);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    private List<View> n(View view) {
        boolean zS = com.google.android.material.internal.p0.s(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zS && (childAt instanceof ActionMenuView)) || (zS && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private Animator o(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(300L).e(new c(searchBar)).j();
    }

    private com.google.android.material.internal.g p(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout) {
        return new com.google.android.material.internal.g(searchBar, view).m(q(searchBar, view)).n(appBarLayout != null ? appBarLayout.getTop() : 0).c(n(view));
    }

    private ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final com.google.android.material.shape.k kVarM = com.google.android.material.shape.k.m(view.getContext());
        kVarM.l0(searchBar.getCornerSize());
        kVarM.o0(u1.T(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j.c(kVarM, view, valueAnimator);
            }
        };
    }

    private List<View> r(SearchBar searchBar) {
        List<View> listK = com.google.android.material.internal.p0.k(searchBar);
        if (searchBar.getCenterView() != null) {
            listK.remove(searchBar.getCenterView());
        }
        return listK;
    }

    private Animator s(SearchBar searchBar) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.e(listR));
        valueAnimatorOfFloat.setDuration(f113457r);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f111043a);
        return valueAnimatorOfFloat;
    }

    private Animator t(SearchBar searchBar, final View view) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.e(listR));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f111043a);
        return valueAnimatorOfFloat;
    }

    private Animator u(@p0 View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(view));
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f111043a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    private Animator v(TextView textView, @p0 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    private Animator w(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(textView));
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.b.f111043a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    boolean A(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f113460c.remove(animatorListenerAdapter);
    }

    boolean B(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f113459b.remove(animatorListenerAdapter);
    }

    boolean C(SearchBar.b bVar) {
        return this.f113458a.remove(bVar);
    }

    void D(boolean z10) {
        this.f113465h = z10;
    }

    void E(SearchBar searchBar, View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        Animator animator;
        if (y() && (animator = this.f113466i) != null) {
            animator.cancel();
        }
        this.f113464g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new d());
        Iterator<AnimatorListenerAdapter> it = this.f113460c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f113466i = animatorSet;
    }

    void F(final SearchBar searchBar, final View view, @p0 final AppBarLayout appBarLayout, final boolean z10) {
        Animator animator;
        if (x() && (animator = this.f113466i) != null) {
            animator.cancel();
        }
        this.f113463f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.g
            @Override // java.lang.Runnable
            public final void run() {
                j.b(this.f113441a, searchBar, view, appBarLayout, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void G(SearchBar searchBar) {
        k(new f() { // from class: com.google.android.material.search.e
            @Override // com.google.android.material.search.j.f
            public final void a(SearchBar.b bVar) {
                bVar.b();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View viewF = h0.f(searchBar);
        final Animator animatorV = v(textView, viewF);
        animatorV.addListener(new a());
        this.f113461d = animatorV;
        textView.setAlpha(0.0f);
        if (viewF != null) {
            viewF.setAlpha(0.0f);
        }
        if (centerView instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a) centerView).b(new com.google.android.material.animation.a.InterfaceC0976a() { // from class: com.google.android.material.search.f
                @Override // com.google.android.material.animation.a.InterfaceC0976a
                public final void a() {
                    animatorV.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            animatorV.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator animatorM = m(centerView);
        this.f113462e = animatorM;
        animatorM.addListener(new b(centerView, animatorV));
        animatorM.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void H(SearchBar searchBar) {
        Animator animator = this.f113461d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f113462e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a) centerView).a();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    void h(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f113460c.add(animatorListenerAdapter);
    }

    void i(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f113459b.add(animatorListenerAdapter);
    }

    void j(SearchBar.b bVar) {
        this.f113458a.add(bVar);
    }

    boolean x() {
        return this.f113464g;
    }

    boolean y() {
        return this.f113463f;
    }

    boolean z() {
        return this.f113465h;
    }
}
