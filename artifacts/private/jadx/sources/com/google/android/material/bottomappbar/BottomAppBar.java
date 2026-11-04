package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f111337k3 = 300;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final float f111340n3 = 0.2f;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f111341o3 = 0;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f111342p3 = 1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f111343q3 = 0;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f111344r3 = 1;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f111345s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f111346t3 = 1;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f111347u3 = 0;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f111348v3 = 1;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f111349w3 = -1;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f111350x3 = 0;
    private int H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Integer f111351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.shape.k f111352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Animator f111353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Animator f111354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111357g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f111358g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f111359h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NonNull
    AnimatorListenerAdapter f111360h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @t0
    private int f111361i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NonNull
    com.google.android.material.animation.l<FloatingActionButton> f111362i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f111363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f111364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f111366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f111367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f111368o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f111369p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Behavior f111370p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f111371p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f111372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<j> f111373t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @m0
    private int f111374v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f111375w;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f111336j3 = r6.a.n.f361594zi;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f111338l3 = r6.a.c.Fd;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f111339m3 = r6.a.c.Vd;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f111380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f111381d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f111380c);
            parcel.writeInt(this.f111381d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f111380c = parcel.readInt();
            this.f111381d = parcel.readInt() != 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f111375w) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.z0(bottomAppBar.f111355e, BottomAppBar.this.f111369p0);
        }
    }

    class b implements com.google.android.material.animation.l<FloatingActionButton> {
        b() {
        }

        @Override // com.google.android.material.animation.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f111352b.q0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f111357g == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@NonNull FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f111357g != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.f111352b.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().j(fMax);
                BottomAppBar.this.f111352b.invalidateSelf();
            }
            BottomAppBar.this.f111352b.q0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    class c implements com.google.android.material.internal.p0.d {
        c() {
        }

        @Override // com.google.android.material.internal.p0.d
        @NonNull
        public g3 a(View view, @NonNull g3 g3Var, @NonNull com.google.android.material.internal.p0.e eVar) {
            boolean z10;
            if (BottomAppBar.this.f111366m) {
                BottomAppBar.this.H1 = g3Var.o();
            }
            boolean z11 = false;
            if (BottomAppBar.this.f111367n) {
                z10 = BottomAppBar.this.f111358g3 != g3Var.p();
                BottomAppBar.this.f111358g3 = g3Var.p();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.f111368o) {
                boolean z12 = BottomAppBar.this.f111371p2 != g3Var.q();
                BottomAppBar.this.f111371p2 = g3Var.q();
                z11 = z12;
            }
            if (!z10 && !z11) {
                return g3Var;
            }
            BottomAppBar.this.l0();
            BottomAppBar.this.K0();
            BottomAppBar.this.J0();
            return g3Var;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.q0();
            BottomAppBar.this.f111353c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.r0();
        }
    }

    class e extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f111386a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.q0();
            }
        }

        e(int i10) {
            this.f111386a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.v0(this.f111386a));
            floatingActionButton.A(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.q0();
            BottomAppBar.this.f111375w = false;
            BottomAppBar.this.f111354d = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.r0();
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f111390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f111391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f111392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f111393d;

        g(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f111391b = actionMenuView;
            this.f111392c = i10;
            this.f111393d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f111390a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f111390a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f111374v != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.I0(bottomAppBar.f111374v);
            BottomAppBar.this.O0(this.f111391b, this.f111392c, this.f111393d, z10);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f111395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f111396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f111397c;

        h(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f111395a = actionMenuView;
            this.f111396b = i10;
            this.f111397c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f111395a;
            actionMenuView.setTranslationX(BottomAppBar.this.u0(actionMenuView, this.f111396b, this.f111397c));
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f111360h3.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonS0 = BottomAppBar.this.s0();
            if (floatingActionButtonS0 != null) {
                floatingActionButtonS0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface l {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface n {
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    private void A0(int i10) {
        if (this.f111355e == i10 || !u1.Y0(this)) {
            return;
        }
        Animator animator = this.f111353c;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f111356f == 1) {
            o0(i10, arrayList);
        } else {
            n0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(com.google.android.material.motion.j.g(getContext(), f111339m3, com.google.android.material.animation.b.f111043a));
        this.f111353c = animatorSet;
        animatorSet.addListener(new d());
        this.f111353c.start();
    }

    @p0
    private Drawable B0(@p0 Drawable drawable) {
        if (drawable == null || this.f111351a == null) {
            return drawable;
        }
        Drawable drawableR = androidx.core.graphics.drawable.c.r(drawable.mutate());
        androidx.core.graphics.drawable.c.n(drawableR, this.f111351a.intValue());
        return drawableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f111354d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (w0()) {
            N0(actionMenuView, this.f111355e, this.f111369p0);
        } else {
            N0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        this.f111352b.q0((this.f111369p0 && w0() && this.f111357g == 1) ? 1.0f : 0.0f);
        View viewT0 = t0();
        if (viewT0 != null) {
            viewT0.setTranslationY(getFabTranslationY());
            viewT0.setTranslationX(getFabTranslationX());
        }
    }

    private void N0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        O0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        h hVar = new h(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
        gVar.f46851d = 17;
        int i10 = bottomAppBar.f111357g;
        if (i10 == 1) {
            gVar.f46851d = 17 | 48;
        }
        if (i10 == 0) {
            gVar.f46851d |= 80;
        }
    }

    @p0
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.H1;
    }

    private int getFabAlignmentAnimationDuration() {
        return com.google.android.material.motion.j.f(getContext(), f111338l3, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return v0(this.f111355e);
    }

    private float getFabTranslationY() {
        if (this.f111357g == 1) {
            return -getTopEdgeTreatment().d();
        }
        View viewT0 = t0();
        return viewT0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewT0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f111358g3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f111371p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f111352b.getShapeAppearanceModel().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.f111360h3);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.f111362i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        Animator animator = this.f111354d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f111353c;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void o0(int i10, @NonNull List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(s0(), "translationX", v0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void p0(int i10, boolean z10, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - u0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new g(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        ArrayList<j> arrayList;
        int i10 = this.f111372s - 1;
        this.f111372s = i10;
        if (i10 != 0 || (arrayList = this.f111373t) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        ArrayList<j> arrayList;
        int i10 = this.f111372s;
        this.f111372s = i10 + 1;
        if (i10 != 0 || (arrayList = this.f111373t) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public FloatingActionButton s0() {
        View viewT0 = t0();
        if (viewT0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewT0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public View t0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).x(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float v0(int i10) {
        boolean zS = com.google.android.material.internal.p0.s(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewT0 = t0();
        return ((getMeasuredWidth() / 2) - ((zS ? this.f111358g3 : this.f111371p2) + ((this.f111361i == -1 || viewT0 == null) ? this.f111359h : (viewT0.getMeasuredWidth() / 2) + this.f111361i))) * (zS ? -1 : 1);
    }

    private boolean w0() {
        FloatingActionButton floatingActionButtonS0 = s0();
        return floatingActionButtonS0 != null && floatingActionButtonS0.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(int i10, boolean z10) {
        if (!u1.Y0(this)) {
            this.f111375w = false;
            I0(this.f111374v);
            return;
        }
        Animator animator = this.f111354d;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!w0()) {
            i10 = 0;
            z10 = false;
        }
        p0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f111354d = animatorSet;
        animatorSet.addListener(new f());
        this.f111354d.start();
    }

    public void C0() {
        D0(true);
    }

    public void D0(boolean z10) {
        getBehavior().W(this, z10);
    }

    public void E0() {
        F0(true);
    }

    public void F0(boolean z10) {
        getBehavior().Y(this, z10);
    }

    void G0(@NonNull j jVar) {
        ArrayList<j> arrayList = this.f111373t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void H0(@NonNull HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().T(bVar);
    }

    public void I0(@m0 int i10) {
        if (i10 != 0) {
            this.f111374v = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    public void L0(int i10, @m0 int i11) {
        this.f111374v = i11;
        this.f111375w = true;
        z0(i10, this.f111369p0);
        A0(i10);
        this.f111355e = i10;
    }

    boolean M0(@t0 int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().o(f10);
        this.f111352b.invalidateSelf();
        int i11 = 4 | 1;
        return true;
    }

    @p0
    public ColorStateList getBackgroundTint() {
        return this.f111352b.S();
    }

    @r
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.f111355e;
    }

    @t0
    public int getFabAlignmentModeEndMargin() {
        return this.f111361i;
    }

    public int getFabAnchorMode() {
        return this.f111357g;
    }

    public int getFabAnimationMode() {
        return this.f111356f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @r
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.f111365l;
    }

    public int getMenuAlignmentMode() {
        return this.f111363j;
    }

    void i0(@NonNull j jVar) {
        if (this.f111373t == null) {
            this.f111373t = new ArrayList<>();
        }
        this.f111373t.add(jVar);
    }

    public void k0(@NonNull HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().O(bVar);
    }

    public void m0() {
        getBehavior().Q();
    }

    protected void n0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonS0 = s0();
        if (floatingActionButtonS0 != null && !floatingActionButtonS0.r()) {
            r0();
            floatingActionButtonS0.p(new e(i10));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.f111352b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l0();
            K0();
            final View viewT0 = t0();
            if (viewT0 != null && u1.Y0(viewT0)) {
                viewT0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewT0.requestLayout();
                    }
                });
            }
        }
        J0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f111355e = savedState.f111380c;
        this.f111369p0 = savedState.f111381d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f111380c = this.f111355e;
        savedState.f111381d = this.f111369p0;
        return savedState;
    }

    public void setBackgroundTint(@p0 ColorStateList colorStateList) {
        androidx.core.graphics.drawable.c.o(this.f111352b, colorStateList);
    }

    public void setCradleVerticalOffset(@r float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().j(f10);
            this.f111352b.invalidateSelf();
            K0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f111352b.o0(f10);
        getBehavior().U(this, this.f111352b.L() - this.f111352b.K());
    }

    public void setFabAlignmentMode(int i10) {
        L0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(@t0 int i10) {
        if (this.f111361i != i10) {
            this.f111361i = i10;
            K0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f111357g = i10;
        K0();
        View viewT0 = t0();
        if (viewT0 != null) {
            P0(this, viewT0);
            viewT0.requestLayout();
            this.f111352b.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f111356f = i10;
    }

    void setFabCornerSize(@r float f10) {
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().k(f10);
            this.f111352b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@r float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().l(f10);
            this.f111352b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@r float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.f111352b.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f111365l = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f111363j != i10) {
            this.f111363j = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                N0(actionMenuView, this.f111355e, w0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(B0(drawable));
    }

    public void setNavigationIconTint(@androidx.annotation.l int i10) {
        this.f111351a = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    protected int u0(@NonNull ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11 = 0;
        int i12 = 3 | 1;
        if (this.f111363j != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zS = com.google.android.material.internal.p0.s(this);
        int measuredWidth = zS ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f10275a & d0.f48645d) == 8388611) {
                measuredWidth = zS ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zS ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i14 = zS ? this.f111371p2 : -this.f111358g3;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(r6.a.f.U2);
            if (!zS) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i11 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i14) + i11);
    }

    public boolean x0() {
        return getBehavior().R();
    }

    public boolean y0() {
        return getBehavior().S();
    }

    public BottomAppBar(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359303i1);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.f111370p1 == null) {
            this.f111370p1 = new Behavior();
        }
        return this.f111370p1;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final View.OnLayoutChangeListener X;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NonNull
        private final Rect f111376t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private WeakReference<BottomAppBar> f111377v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f111378w;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f111377v.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.l(Behavior.this.f111376t);
                        int iHeight = Behavior.this.f111376t.height();
                        bottomAppBar.M0(iHeight);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f111376t)));
                        height = iHeight;
                    }
                    CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                    if (Behavior.this.f111378w == 0) {
                        if (bottomAppBar.f111357g == 1) {
                            ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(r6.a.f.f360492ya) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                        if (com.google.android.material.internal.p0.s(view)) {
                            ((ViewGroup.MarginLayoutParams) gVar).leftMargin += bottomAppBar.f111359h;
                        } else {
                            ((ViewGroup.MarginLayoutParams) gVar).rightMargin += bottomAppBar.f111359h;
                        }
                    }
                    bottomAppBar.K0();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.X = new a();
            this.f111376t = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i10) {
            this.f111377v = new WeakReference<>(bottomAppBar);
            View viewT0 = bottomAppBar.t0();
            if (viewT0 != null && !u1.Y0(viewT0)) {
                BottomAppBar.P0(bottomAppBar, viewT0);
                this.f111378w = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) viewT0.getLayoutParams())).bottomMargin;
                if (viewT0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewT0;
                    if (bottomAppBar.f111357g == 0 && bottomAppBar.f111364k) {
                        u1.U1(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(r6.a.b.F);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(r6.a.b.E);
                    }
                    bottomAppBar.j0(floatingActionButton);
                }
                viewT0.addOnLayoutChangeListener(this.X);
                bottomAppBar.K0();
            }
            coordinatorLayout.N(bottomAppBar, i10);
            return super.t(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.I(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.X = new a();
            this.f111376t = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111336j3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        this.f111352b = kVar;
        this.f111372s = 0;
        this.f111374v = 0;
        this.f111375w = false;
        this.f111369p0 = true;
        this.f111360h3 = new a();
        this.f111362i3 = new b();
        Context context2 = getContext();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.L4, i10, i11, new int[0]);
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.N4);
        if (typedArrayK.hasValue(r6.a.o.Y4)) {
            setNavigationIconTint(typedArrayK.getColor(r6.a.o.Y4, -1));
        }
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(r6.a.o.O4, 0);
        float dimensionPixelOffset = typedArrayK.getDimensionPixelOffset(r6.a.o.T4, 0);
        float dimensionPixelOffset2 = typedArrayK.getDimensionPixelOffset(r6.a.o.U4, 0);
        float dimensionPixelOffset3 = typedArrayK.getDimensionPixelOffset(r6.a.o.V4, 0);
        this.f111355e = typedArrayK.getInt(r6.a.o.P4, 0);
        this.f111356f = typedArrayK.getInt(r6.a.o.S4, 0);
        this.f111357g = typedArrayK.getInt(r6.a.o.R4, 1);
        this.f111364k = typedArrayK.getBoolean(r6.a.o.f361653c5, true);
        this.f111363j = typedArrayK.getInt(r6.a.o.X4, 0);
        this.f111365l = typedArrayK.getBoolean(r6.a.o.W4, false);
        this.f111366m = typedArrayK.getBoolean(r6.a.o.Z4, false);
        this.f111367n = typedArrayK.getBoolean(r6.a.o.f361603a5, false);
        this.f111368o = typedArrayK.getBoolean(r6.a.o.f361628b5, false);
        this.f111361i = typedArrayK.getDimensionPixelOffset(r6.a.o.Q4, -1);
        boolean z10 = typedArrayK.getBoolean(r6.a.o.M4, true);
        typedArrayK.recycle();
        this.f111359h = getResources().getDimensionPixelOffset(r6.a.f.f360477xa);
        kVar.setShapeAppearanceModel(p.a().G(new com.google.android.material.bottomappbar.b(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        if (z10) {
            kVar.y0(2);
        } else {
            kVar.y0(1);
            setOutlineAmbientShadowColor(0);
            setOutlineSpotShadowColor(0);
        }
        kVar.s0(Paint.Style.FILL);
        kVar.a0(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.c.o(kVar, colorStateListA);
        u1.O1(this, kVar);
        com.google.android.material.internal.p0.g(this, attributeSet, i10, i11, new c());
    }
}
