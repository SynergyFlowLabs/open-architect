package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.j0;
import androidx.core.view.u1;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.h0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class f0 {
    private static final long A = 250;
    private static final float B = 0.95f;
    private static final long C = 350;
    private static final long D = 150;
    private static final long E = 300;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f113411p = 300;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f113412q = 50;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f113413r = 250;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f113414s = 150;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f113415t = 75;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f113416u = 300;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f113417v = 250;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f113418w = 42;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f113419x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f113420y = 83;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f113421z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SearchView f113422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f113423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClippableRoundedCornerLayout f113424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f113425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f113426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Toolbar f113427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Toolbar f113428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextView f113429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f113430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageButton f113431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f113432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TouchObserverFrameLayout f113433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.material.motion.h f113434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private AnimatorSet f113435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SearchBar f113436o;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.this.f113424c.setVisibility(8);
            if (!f0.this.f113422a.x()) {
                f0.this.f113422a.t();
            }
            f0.this.f113422a.setTransitionState(SearchView.c.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f0.this.f113422a.setTransitionState(SearchView.c.HIDING);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.this.f113424c.setVisibility(8);
            if (!f0.this.f113422a.x()) {
                f0.this.f113422a.t();
            }
            f0.this.f113422a.setTransitionState(SearchView.c.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f0.this.f113422a.setTransitionState(SearchView.c.HIDING);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f113439a;

        c(boolean z10) {
            this.f113439a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.this.P(this.f113439a ? 1.0f : 0.0f);
            f0.this.f113424c.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f0.this.P(this.f113439a ? 0.0f : 1.0f);
        }
    }

    f0(SearchView searchView) {
        this.f113422a = searchView;
        this.f113423b = searchView.f113366a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f113367b;
        this.f113424c = clippableRoundedCornerLayout;
        this.f113425d = searchView.f113370e;
        this.f113426e = searchView.f113371f;
        this.f113427f = searchView.f113372g;
        this.f113428g = searchView.f113374h;
        this.f113429h = searchView.f113376i;
        this.f113430i = searchView.f113378j;
        this.f113431j = searchView.f113380k;
        this.f113432k = searchView.f113382l;
        this.f113433l = searchView.f113384m;
        this.f113434m = new com.google.android.material.motion.h(clippableRoundedCornerLayout);
    }

    private Animator A(boolean z10) {
        return K(z10, true, this.f113430i);
    }

    private AnimatorSet B(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f113435n == null) {
            int i10 = 3 & 0;
            animatorSet.playTogether(s(z10), t(z10));
        }
        animatorSet.playTogether(H(z10), G(z10), u(z10), w(z10), F(z10), z(z10), q(z10), A(z10), I(z10));
        animatorSet.addListener(new c(z10));
        return animatorSet;
    }

    private int C(View view) {
        int iB = j0.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return com.google.android.material.internal.p0.s(this.f113436o) ? this.f113436o.getLeft() - iB : (this.f113436o.getRight() - this.f113422a.getWidth()) + iB;
    }

    private int D(View view) {
        int iC = j0.c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int iN0 = u1.n0(this.f113436o);
        return com.google.android.material.internal.p0.s(this.f113436o) ? ((this.f113436o.getWidth() - this.f113436o.getRight()) + iC) - iN0 : (this.f113436o.getLeft() - iC) + iN0;
    }

    private int E() {
        return ((this.f113436o.getTop() + this.f113436o.getBottom()) / 2) - ((this.f113426e.getTop() + this.f113426e.getBottom()) / 2);
    }

    private Animator F(boolean z10) {
        return K(z10, false, this.f113425d);
    }

    private Animator G(boolean z10) {
        Rect rectM = this.f113434m.m();
        Rect rectL = this.f113434m.l();
        if (rectM == null) {
            rectM = com.google.android.material.internal.p0.d(this.f113422a);
        }
        if (rectL == null) {
            rectL = com.google.android.material.internal.p0.c(this.f113424c, this.f113436o);
        }
        final Rect rect = new Rect(rectL);
        final float cornerSize = this.f113436o.getCornerSize();
        final float fMax = Math.max(this.f113424c.getCornerRadius(), this.f113434m.k());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.x(rect), rectL, rectM);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f0.b(this.f113489a, cornerSize, fMax, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        return valueAnimatorOfObject;
    }

    private Animator H(boolean z10) {
        TimeInterpolator timeInterpolator = z10 ? com.google.android.material.animation.b.f111043a : com.google.android.material.animation.b.f111044b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(this.f113423b));
        return valueAnimatorOfFloat;
    }

    private Animator I(boolean z10) {
        return K(z10, true, this.f113429h);
    }

    private AnimatorSet J(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(L());
        k(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        animatorSet.setDuration(z10 ? C : 300L);
        return animatorSet;
    }

    private Animator K(boolean z10, boolean z11, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z11 ? D(view) : C(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.n(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.t.p(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        return animatorSet;
    }

    private Animator L() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f113424c.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.p(this.f113424c));
        return valueAnimatorOfFloat;
    }

    private void O(float f10) {
        ActionMenuView actionMenuViewB;
        if (!this.f113422a.B() || (actionMenuViewB = h0.b(this.f113427f)) == null) {
            return;
        }
        actionMenuViewB.setAlpha(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(float f10) {
        this.f113431j.setAlpha(f10);
        this.f113432k.setAlpha(f10);
        this.f113433l.setAlpha(f10);
        O(f10);
    }

    private void Q(Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.d) {
            ((androidx.appcompat.graphics.drawable.d) drawable).setProgress(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) drawable).a(1.0f);
        }
    }

    private void R(Toolbar toolbar) {
        ActionMenuView actionMenuViewB = h0.b(toolbar);
        if (actionMenuViewB != null) {
            for (int i10 = 0; i10 < actionMenuViewB.getChildCount(); i10++) {
                View childAt = actionMenuViewB.getChildAt(i10);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void T() {
        Menu menu = this.f113428g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f113436o.getMenuResId() == -1 || !this.f113422a.B()) {
            this.f113428g.setVisibility(8);
            return;
        }
        this.f113428g.inflateMenu(this.f113436o.getMenuResId());
        R(this.f113428g);
        this.f113428g.setVisibility(0);
    }

    private AnimatorSet W() {
        if (this.f113422a.x()) {
            this.f113422a.t();
        }
        AnimatorSet animatorSetB = B(false);
        animatorSetB.addListener(new a());
        animatorSetB.start();
        return animatorSetB;
    }

    private AnimatorSet X() {
        if (this.f113422a.x()) {
            this.f113422a.t();
        }
        AnimatorSet animatorSetJ = J(false);
        animatorSetJ.addListener(new b());
        animatorSetJ.start();
        return animatorSetJ;
    }

    private void Y() {
        if (this.f113422a.x()) {
            this.f113422a.K();
        }
        this.f113422a.setTransitionState(SearchView.c.SHOWING);
        T();
        this.f113430i.setText(this.f113436o.getText());
        EditText editText = this.f113430i;
        editText.setSelection(editText.getText().length());
        this.f113424c.setVisibility(4);
        this.f113424c.post(new Runnable() { // from class: com.google.android.material.search.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.d(this.f113402a);
            }
        });
    }

    private void Z() {
        if (this.f113422a.x()) {
            final SearchView searchView = this.f113422a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.c0
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.K();
                }
            }, 150L);
        }
        this.f113424c.setVisibility(4);
        this.f113424c.post(new Runnable() { // from class: com.google.android.material.search.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.a(this.f113408a);
            }
        });
    }

    public static /* synthetic */ void a(f0 f0Var) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = f0Var.f113424c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet animatorSetJ = f0Var.J(true);
        animatorSetJ.addListener(new g0(f0Var));
        animatorSetJ.start();
    }

    public static /* synthetic */ void b(f0 f0Var, float f10, float f11, Rect rect, ValueAnimator valueAnimator) {
        f0Var.getClass();
        f0Var.f113424c.c(rect, com.google.android.material.animation.b.a(f10, f11, valueAnimator.getAnimatedFraction()));
    }

    public static /* synthetic */ void d(f0 f0Var) {
        AnimatorSet animatorSetB = f0Var.B(true);
        animatorSetB.addListener(new e0(f0Var));
        animatorSetB.start();
    }

    private void j(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewB = h0.b(this.f113427f);
        if (actionMenuViewB == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(C(actionMenuViewB), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.n(actionMenuViewB));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.t.p(actionMenuViewB));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void k(AnimatorSet animatorSet) {
        ImageButton imageButtonE = h0.e(this.f113427f);
        if (imageButtonE == null) {
            return;
        }
        Drawable drawableQ = androidx.core.graphics.drawable.c.q(imageButtonE.getDrawable());
        if (!this.f113422a.y()) {
            Q(drawableQ);
        } else {
            m(animatorSet, drawableQ);
            n(animatorSet, drawableQ);
        }
    }

    private void l(AnimatorSet animatorSet) {
        ImageButton imageButtonE = h0.e(this.f113427f);
        if (imageButtonE == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(D(imageButtonE), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.n(imageButtonE));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.t.p(imageButtonE));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof androidx.appcompat.graphics.drawable.d) {
            final androidx.appcompat.graphics.drawable.d dVar = (androidx.appcompat.graphics.drawable.d) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    dVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.i) {
            final com.google.android.material.internal.i iVar = (com.google.android.material.internal.i) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.b0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            int i10 = 2 >> 0;
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private Animator q(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        if (this.f113422a.B()) {
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.j(h0.b(this.f113428g), h0.b(this.f113427f)));
        }
        return valueAnimatorOfFloat;
    }

    private AnimatorSet s(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        k(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        return animatorSet;
    }

    private AnimatorSet t(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        j(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        return animatorSet;
    }

    private Animator u(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? f113412q : f113418w);
        valueAnimatorOfFloat.setStartDelay(z10 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111043a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(this.f113431j));
        return valueAnimatorOfFloat;
    }

    private Animator v(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 150L : f113420y);
        valueAnimatorOfFloat.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111043a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(this.f113432k, this.f113433l));
        return valueAnimatorOfFloat;
    }

    private Animator w(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(v(z10), y(z10), x(z10));
        return animatorSet;
    }

    private Animator x(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(B, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.h(this.f113433l));
        return valueAnimatorOfFloat;
    }

    private Animator y(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f113433l.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.y.a(z10, com.google.android.material.animation.b.f111044b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.p(this.f113432k));
        return valueAnimatorOfFloat;
    }

    private Animator z(boolean z10) {
        return K(z10, false, this.f113428g);
    }

    @z7.a
    AnimatorSet M() {
        return this.f113436o != null ? W() : X();
    }

    @p0
    public androidx.activity.d N() {
        return this.f113434m.c();
    }

    void S(SearchBar searchBar) {
        this.f113436o = searchBar;
    }

    void U() {
        if (this.f113436o != null) {
            Y();
        } else {
            Z();
        }
    }

    void V(@NonNull androidx.activity.d dVar) {
        this.f113434m.s(dVar, this.f113436o);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @w0(34)
    public void a0(@NonNull androidx.activity.d dVar) {
        if (dVar.a() <= 0.0f) {
            return;
        }
        com.google.android.material.motion.h hVar = this.f113434m;
        SearchBar searchBar = this.f113436o;
        hVar.u(dVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f113435n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (dVar.a() * this.f113435n.getDuration()));
            return;
        }
        if (this.f113422a.x()) {
            this.f113422a.t();
        }
        if (this.f113422a.y()) {
            AnimatorSet animatorSetS = s(false);
            this.f113435n = animatorSetS;
            animatorSetS.start();
            this.f113435n.pause();
        }
    }

    @w0(34)
    public void o() {
        this.f113434m.g(this.f113436o);
        AnimatorSet animatorSet = this.f113435n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f113435n = null;
    }

    @w0(34)
    public void p() {
        this.f113434m.j(M().getTotalDuration(), this.f113436o);
        if (this.f113435n != null) {
            t(false).start();
            this.f113435n.resume();
        }
        this.f113435n = null;
    }

    com.google.android.material.motion.h r() {
        return this.f113434m;
    }
}
