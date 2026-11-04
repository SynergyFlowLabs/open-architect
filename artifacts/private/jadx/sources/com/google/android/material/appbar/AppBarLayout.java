package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.o;
import androidx.core.view.accessibility.j;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.core.view.v0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final int f111067i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static final int f111068j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    static final int f111069k3 = 2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static final int f111070l3 = 4;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final int f111071m3 = 8;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f111072n3 = r6.a.n.Le;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f111073o3 = -1;

    @p0
    private Drawable H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f111078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private g3 f111080g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final float f111081g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<b> f111082h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private Behavior f111083h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f111084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f111085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f111086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d0
    private int f111088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private WeakReference<View> f111089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f111090o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final TimeInterpolator f111091p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int[] f111092p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private Integer f111093p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private ValueAnimator f111094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private ValueAnimator.AnimatorUpdateListener f111095t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<f> f111096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f111097w;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.d<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f111098v = 600;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f111099l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f111100m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ValueAnimator f111101n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private SavedState f111102o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @p0
        private WeakReference<View> f111103s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private c f111104t;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f111110a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f111111b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f111110a = coordinatorLayout;
                this.f111111b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.e0(this.f111110a, this.f111111b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f111113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f111114b;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f111113a = appBarLayout;
                this.f111114b = coordinatorLayout;
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull j jVar) {
                View viewU0;
                super.onInitializeAccessibilityNodeInfo(view, jVar);
                jVar.j1(ScrollView.class.getName());
                if (this.f111113a.getTotalScrollRange() == 0 || (viewU0 = BaseBehavior.this.u0(this.f111114b)) == null || !BaseBehavior.this.q0(this.f111113a)) {
                    return;
                }
                int i10 = 3 >> 1;
                if (BaseBehavior.this.b0() != (-this.f111113a.getTotalScrollRange())) {
                    jVar.b(j.a.f48555r);
                    jVar.X1(true);
                }
                if (BaseBehavior.this.b0() != 0) {
                    if (!viewU0.canScrollVertically(-1)) {
                        jVar.b(j.a.f48556s);
                        jVar.X1(true);
                    } else if ((-this.f111113a.getDownNestedPreScrollRange()) != 0) {
                        jVar.b(j.a.f48556s);
                        jVar.X1(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // androidx.core.view.a
            public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f111113a.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                if (BaseBehavior.this.b0() != 0) {
                    View viewU0 = BaseBehavior.this.u0(this.f111114b);
                    if (!viewU0.canScrollVertically(-1)) {
                        this.f111113a.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f111113a.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.y(this.f111114b, this.f111113a, viewU0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public static abstract class c<T extends AppBarLayout> {
            public abstract boolean a(@NonNull T t10);
        }

        public BaseBehavior() {
        }

        private boolean M0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            List<View> listX = coordinatorLayout.x(t10);
            int size = listX.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) listX.get(i10).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).Z() != 0;
                }
            }
            return false;
        }

        private void N0(CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int iB0 = b0() - topInset;
            int iT0 = t0(t10, iB0);
            if (iT0 >= 0) {
                View childAt = t10.getChildAt(iT0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iH0 = -childAt.getBottom();
                    if (iT0 == 0 && u1.W(t10) && u1.W(childAt)) {
                        topInset2 -= t10.getTopInset();
                    }
                    if (p0(iC, 2)) {
                        iH0 += u1.h0(childAt);
                    } else if (p0(iC, 5)) {
                        int iH1 = u1.h0(childAt) + iH0;
                        if (iB0 < iH1) {
                            topInset2 = iH1;
                        } else {
                            iH0 = iH1;
                        }
                    }
                    if (p0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iH0 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    k0(coordinatorLayout, t10, n1.a.e(m0(iB0, iH0, topInset2) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void O0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, int i11, boolean z10) {
            View viewS0 = s0(t10, i10);
            boolean zJ = false;
            if (viewS0 != null) {
                int iC = ((e) viewS0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iH0 = u1.h0(viewS0);
                    int i12 = 5 | 1;
                    if (i11 <= 0 || (iC & 12) == 0) {
                        if ((iC & 2) != 0 && (-i10) >= (viewS0.getBottom() - iH0) - t10.getTopInset()) {
                            zJ = true;
                        }
                    } else if ((-i10) >= (viewS0.getBottom() - iH0) - t10.getTopInset()) {
                        zJ = true;
                    }
                }
            }
            if (t10.s()) {
                zJ = t10.J(r0(coordinatorLayout));
            }
            boolean zG = t10.G(zJ);
            if (z10 || (zG && M0(coordinatorLayout, t10))) {
                if (t10.getBackground() != null) {
                    t10.getBackground().jumpToCurrentState();
                }
                if (t10.getForeground() != null) {
                    t10.getForeground().jumpToCurrentState();
                }
                if (t10.getStateListAnimator() != null) {
                    t10.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void j0(CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            if (u1.J0(coordinatorLayout)) {
                return;
            }
            u1.G1(coordinatorLayout, new b(t10, coordinatorLayout));
        }

        private void k0(CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, float f10) {
            int iAbs = Math.abs(b0() - i10);
            float fAbs = Math.abs(f10);
            l0(coordinatorLayout, t10, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t10.getHeight()) + 1.0f) * 150.0f));
        }

        private void l0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int iB0 = b0();
            if (iB0 == i10) {
                ValueAnimator valueAnimator = this.f111101n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f111101n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f111101n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f111101n = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.b.f111047e);
                this.f111101n.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f111101n.setDuration(Math.min(i11, 600));
            this.f111101n.setIntValues(iB0, i10);
            this.f111101n.start();
        }

        private int m0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean o0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, @NonNull View view) {
            return t10.o() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean p0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f111132a != 0) {
                    return true;
                }
            }
            return false;
        }

        @p0
        private View r0(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof v0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @p0
        private static View s0(@NonNull AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int t0(@NonNull T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (p0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public View u0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int x0(@NonNull T t10, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= u1.h0(childAt);
                        }
                    }
                    if (u1.W(childAt)) {
                        topInset -= t10.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10) {
            boolean zT = super.t(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f111102o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            k0(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            e0(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            k0(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            e0(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f111105c) {
                e0(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f111106d) {
                e0(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f111107e);
                e0(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f111102o.f111109g ? u1.h0(childAt) + t10.getTopInset() : Math.round(childAt.getHeight() * this.f111102o.f111108f)));
            }
            t10.A();
            this.f111102o = null;
            U(n1.a.e(O(), -t10.getTotalScrollRange(), 0));
            O0(coordinatorLayout, t10, O(), 0, true);
            t10.v(O());
            j0(coordinatorLayout, t10);
            return zT;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t10.getLayoutParams())).height != -2) {
                return super.u(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.O(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public void y(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10, int i11, int[] iArr, int i12) {
            T t11;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                t11 = t10;
            } else {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    downNestedPreScrollRange = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    t11 = t10;
                    iArr[1] = d0(coordinatorLayout, t11, i11, i14, i15);
                } else {
                    t11 = t10;
                }
            }
            if (t11.s()) {
                t11.G(t11.J(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            T t11;
            int i15;
            if (i13 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
                iArr[1] = baseBehavior.d0(coordinatorLayout2, t11, i15, -t10.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
            }
            if (i15 == 0) {
                baseBehavior.j0(coordinatorLayout2, t11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                I0((SavedState) parcelable, true);
                super.F(coordinatorLayout, t10, this.f111102o.a());
            } else {
                super.F(coordinatorLayout, t10, parcelable);
                this.f111102o = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            Parcelable parcelableG = super.G(coordinatorLayout, t10);
            SavedState savedStateJ0 = J0(parcelableG, t10);
            return savedStateJ0 == null ? parcelableG : savedStateJ0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
        public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, @NonNull View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.s() || o0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f111101n) != null) {
                valueAnimator.cancel();
            }
            this.f111103s = null;
            this.f111100m = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
        public void K(CoordinatorLayout coordinatorLayout, @NonNull T t10, View view, int i10) {
            if (this.f111100m == 0 || i10 == 1) {
                N0(coordinatorLayout, t10);
                if (t10.s()) {
                    t10.G(t10.J(view));
                }
            }
            this.f111103s = new WeakReference<>(view);
        }

        void I0(@p0 SavedState savedState, boolean z10) {
            if (this.f111102o != null && !z10) {
                return;
            }
            this.f111102o = savedState;
        }

        @p0
        SavedState J0(@p0 Parcelable parcelable, @NonNull T t10) {
            int iO = O();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + iO;
                if (childAt.getTop() + iO <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f49191b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iO == 0;
                    savedState.f111106d = z10;
                    savedState.f111105c = !z10 && (-iO) >= t10.getTotalScrollRange();
                    savedState.f111107e = i10;
                    savedState.f111109g = bottom == u1.h0(childAt) + t10.getTopInset();
                    savedState.f111108f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void K0(@p0 c cVar) {
            this.f111104t = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public int f0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10, int i10, int i11, int i12) {
            int iB0 = b0();
            int i13 = 0;
            if (i11 == 0 || iB0 < i11 || iB0 > i12) {
                this.f111099l = 0;
            } else {
                int iE = n1.a.e(i10, i11, i12);
                if (iB0 != iE) {
                    int iX0 = t10.m() ? x0(t10, iE) : iE;
                    boolean zU = U(iX0);
                    int i14 = iB0 - iE;
                    this.f111099l = iE - iX0;
                    if (zU) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(t10, t10.getChildAt(i13), O());
                            }
                            i13++;
                        }
                    }
                    if (!zU && t10.m()) {
                        coordinatorLayout.j(t10);
                    }
                    t10.v(O());
                    O0(coordinatorLayout, t10, iE, iE < iB0 ? -1 : 1, false);
                    i13 = i14;
                }
            }
            j0(coordinatorLayout, t10);
            return i13;
        }

        @Override // com.google.android.material.appbar.d
        int b0() {
            return O() + this.f111099l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public boolean W(T t10) {
            c cVar = this.f111104t;
            if (cVar != null) {
                return cVar.a(t10);
            }
            WeakReference<View> weakReference = this.f111103s;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public int Z(@NonNull T t10) {
            return (-t10.getDownNestedScrollRange()) + t10.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public int a0(@NonNull T t10) {
            return t10.getTotalScrollRange();
        }

        @l1
        boolean y0() {
            ValueAnimator valueAnimator = this.f111101n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
        public void c0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t10) {
            N0(coordinatorLayout, t10);
            if (t10.s()) {
                t10.G(t10.J(r0(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f111105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f111106d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f111107e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f111108f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f111109g;

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

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f111105c = parcel.readByte() != 0;
                this.f111106d = parcel.readByte() != 0;
                this.f111107e = parcel.readInt();
                this.f111108f = parcel.readFloat();
                this.f111109g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f111105c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f111106d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f111107e);
                parcel.writeFloat(this.f111108f);
                parcel.writeByte(this.f111109g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.c<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: A0 */
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10) {
            return super.t(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: B0 */
        public /* bridge */ /* synthetic */ boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.u(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: C0 */
        public /* bridge */ /* synthetic */ void y(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.y(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: D0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.B(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: E0 */
        public /* bridge */ /* synthetic */ void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.F(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: F0 */
        public /* bridge */ /* synthetic */ Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.G(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: G0 */
        public /* bridge */ /* synthetic */ boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i10, int i11) {
            return super.I(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: H0 */
        public /* bridge */ /* synthetic */ void K(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i10) {
            super.K(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void K0(@p0 BaseBehavior.c cVar) {
            super.K0(cVar);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.L(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int N() {
            return super.N();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int O() {
            return super.O();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean P() {
            return super.P();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean Q() {
            return super.Q();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ void S(boolean z10) {
            super.S(z10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean T(int i10) {
            return super.T(i10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean U(int i10) {
            return super.U(i10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ void V(boolean z10) {
            super.V(z10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.s(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.e {
        public ScrollingViewBehavior() {
        }

        private static int g0(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).b0();
            }
            return 0;
        }

        private void h0(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                u1.i1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f111099l) + b0()) - X(view2));
            }
        }

        private void i0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.s()) {
                    appBarLayout.G(appBarLayout.J(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z10) {
            AppBarLayout appBarLayoutW = W(coordinatorLayout.w(view));
            if (appBarLayoutW != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f111203d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutW.B(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int N() {
            return super.N();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int O() {
            return super.O();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean P() {
            return super.P();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean Q() {
            return super.Q();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ void S(boolean z10) {
            super.S(z10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean T(int i10) {
            return super.T(i10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean U(int i10) {
            return super.U(i10);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ void V(boolean z10) {
            super.V(z10);
        }

        @Override // com.google.android.material.appbar.e
        float Y(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iG0 = g0(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iG0 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iG0 / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.e
        int a0(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.a0(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        @p0
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public AppBarLayout W(@NonNull List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            h0(view, view2);
            i0(view, view2);
            int i10 = 2 & 0;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                u1.G1(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
            return super.t(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
            return super.u(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.qs);
            d0(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.rs, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements b1 {
        a() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            return AppBarLayout.this.w(g3Var);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static abstract class c {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f111117c = 0.3f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f111118a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f111119b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            int i10 = 5 & 0;
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f10) {
            b(this.f111118a, appBarLayout, view);
            float fAbs = this.f111118a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                u1.S1(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fD = 1.0f - n1.a.d(Math.abs(fAbs / this.f111118a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f111118a.height() * f111117c) * (1.0f - (fD * fD)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f111119b);
            this.f111119b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f111119b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            u1.S1(view, this.f111119b);
        }
    }

    public interface f {
        void a(@r float f10, @l int i10);
    }

    public interface g extends b<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.b
        void a(AppBarLayout appBarLayout, int i10);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void C(boolean z10, boolean z11, boolean z12) {
        this.f111079f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean E(boolean z10) {
        if (this.f111085j == z10) {
            return false;
        }
        this.f111085j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean I() {
        return this.H1 != null && getTopInset() > 0;
    }

    private boolean K() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !u1.W(childAt)) {
                return true;
            }
        }
        return false;
    }

    private void L(float f10, float f11) {
        ValueAnimator valueAnimator = this.f111094s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f111094s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f111097w);
        this.f111094s.setInterpolator(this.f111091p0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f111095t;
        if (animatorUpdateListener != null) {
            this.f111094s.addUpdateListener(animatorUpdateListener);
        }
        this.f111094s.start();
    }

    private void M() {
        setWillNotDraw(!I());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, k kVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kVar.o0(fFloatValue);
        Drawable drawable = appBarLayout.H1;
        if (drawable instanceof k) {
            ((k) drawable).o0(fFloatValue);
        }
        Iterator<f> it = appBarLayout.f111096v.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, kVar.E());
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, k kVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iT = u.t(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        kVar.p0(ColorStateList.valueOf(iT));
        if (appBarLayout.H1 != null && (num2 = appBarLayout.f111093p2) != null && num2.equals(num)) {
            androidx.core.graphics.drawable.c.n(appBarLayout.H1, iT);
        }
        if (!appBarLayout.f111096v.isEmpty()) {
            for (f fVar : appBarLayout.f111096v) {
                if (kVar.z() != null) {
                    fVar.a(0.0f, iT);
                }
            }
        }
    }

    private void g() {
        WeakReference<View> weakReference = this.f111089n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f111089n = null;
    }

    @p0
    private Integer h() {
        Drawable drawable = this.H1;
        if (drawable instanceof k) {
            return Integer.valueOf(((k) drawable).E());
        }
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(drawable);
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    @p0
    private View i(@p0 View view) {
        int i10;
        if (this.f111089n == null && (i10 = this.f111088m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f111088m);
            }
            if (viewFindViewById != null) {
                this.f111089n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f111089n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean n() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void p(final k kVar, @NonNull final ColorStateList colorStateList, @NonNull final ColorStateList colorStateList2) {
        final Integer numF = u.f(getContext(), r6.a.c.f359214e4);
        this.f111095t = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f111142a, colorStateList, colorStateList2, kVar, numF, valueAnimator);
            }
        };
        u1.O1(this, kVar);
    }

    private void q(Context context, final k kVar) {
        kVar.a0(context);
        this.f111095t = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f111147a, kVar, valueAnimator);
            }
        };
        u1.O1(this, kVar);
    }

    private void r() {
        Behavior behavior = this.f111083h3;
        BaseBehavior.SavedState savedStateJ0 = (behavior == null || this.f111075b == -1 || this.f111079f != 0) ? null : behavior.J0(AbsSavedState.f49191b, this);
        this.f111075b = -1;
        this.f111076c = -1;
        this.f111077d = -1;
        if (savedStateJ0 != null) {
            this.f111083h3.I0(savedStateJ0, false);
        }
    }

    private boolean t() {
        return getBackground() instanceof k;
    }

    void A() {
        this.f111079f = 0;
    }

    public void B(boolean z10, boolean z11) {
        C(z10, z11, true);
    }

    public boolean D(boolean z10) {
        this.f111084i = true;
        return E(z10);
    }

    public boolean F(boolean z10) {
        return H(z10, true);
    }

    boolean G(boolean z10) {
        return H(z10, !this.f111084i);
    }

    boolean H(boolean z10, boolean z11) {
        if (!z11 || this.f111086k == z10) {
            return false;
        }
        this.f111086k = z10;
        refreshDrawableState();
        if (!t()) {
            return true;
        }
        boolean z12 = false;
        if (this.f111090o) {
            L(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f111087l) {
            return true;
        }
        L(z10 ? 0.0f : this.f111081g3, z10 ? this.f111081g3 : 0.0f);
        return true;
    }

    boolean J(@p0 View view) {
        View viewI = i(view);
        if (viewI != null) {
            view = viewI;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public void c(@NonNull f fVar) {
        this.f111096v.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(@p0 b bVar) {
        if (this.f111082h == null) {
            this.f111082h = new ArrayList();
        }
        if (bVar == null || this.f111082h.contains(bVar)) {
            return;
        }
        this.f111082h.add(bVar);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (I()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f111074a);
            this.H1.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H1;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(g gVar) {
        d(gVar);
    }

    public void f() {
        this.f111096v.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f111083h3 = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iH0;
        int i10 = this.f111076c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 3 << 0;
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f111132a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        iH0 = u1.h0(childAt);
                    } else {
                        if ((i13 & 2) != 0) {
                            iH0 = measuredHeight - u1.h0(childAt);
                        } else {
                            iMin = i14 + measuredHeight;
                        }
                        if (childCount == 0 && u1.W(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i12 += iMin;
                    }
                    iMin = i14 + iH0;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i12 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i12);
        this.f111076c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f111077d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iH0 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i12 = eVar.f111132a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iH0 += measuredHeight;
                if ((i12 & 2) != 0) {
                    iH0 -= u1.h0(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iH0);
        this.f111077d = iMax;
        return iMax;
    }

    @d0
    public int getLiftOnScrollTargetViewId() {
        return this.f111088m;
    }

    @p0
    public k getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof k) {
            return (k) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iH0 = u1.h0(this);
        if (iH0 == 0) {
            int childCount = getChildCount();
            iH0 = childCount >= 1 ? u1.h0(getChildAt(childCount - 1)) : 0;
            if (iH0 == 0) {
                return getHeight() / 3;
            }
        }
        return (iH0 * 2) + topInset;
    }

    int getPendingAction() {
        return this.f111079f;
    }

    @p0
    public Drawable getStatusBarForeground() {
        return this.H1;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @l1
    final int getTopInset() {
        g3 g3Var = this.f111080g;
        if (g3Var != null) {
            return g3Var.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f111075b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iH0 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f111132a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iH0 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && u1.W(childAt)) {
                    iH0 -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iH0 -= u1.h0(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iH0);
        this.f111075b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean m() {
        return this.f111078e;
    }

    boolean o() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f111092p1 == null) {
            this.f111092p1 = new int[4];
        }
        int[] iArr = this.f111092p1;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f111085j;
        int i11 = r6.a.c.f359273gh;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f111086k) ? r6.a.c.f359296hh : -r6.a.c.f359296hh;
        int i12 = r6.a.c.f359181ch;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f111086k) ? r6.a.c.f359158bh : -r6.a.c.f359158bh;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (u1.W(this) && K()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                u1.i1(getChildAt(childCount), topInset);
            }
        }
        r();
        this.f111078e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f111078e = true;
                break;
            }
        }
        Drawable drawable = this.H1;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f111084i) {
            return;
        }
        if (!this.f111087l && !n()) {
            z11 = false;
        }
        E(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && u1.W(this) && K()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = n1.a.e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        r();
    }

    public boolean s() {
        return this.f111087l;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        B(z10, u1.Y0(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f111087l = z10;
    }

    public void setLiftOnScrollTargetView(@p0 View view) {
        this.f111088m = -1;
        if (view == null) {
            g();
        } else {
            this.f111089n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@d0 int i10) {
        this.f111088m = i10;
        g();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f111084i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(@p0 Drawable drawable) {
        Drawable drawable2 = this.H1;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.H1 = drawable != null ? drawable.mutate() : null;
            this.f111093p2 = h();
            Drawable drawable3 = this.H1;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H1.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.H1, u1.c0(this));
                this.H1.setVisible(getVisibility() == 0, false);
                this.H1.setCallback(this);
            }
            M();
            u1.s1(this);
        }
    }

    public void setStatusBarForegroundColor(@l int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@v int i10) {
        setStatusBarForeground(j.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.H1;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public boolean u() {
        return this.f111086k;
    }

    void v(int i10) {
        this.f111074a = i10;
        if (!willNotDraw()) {
            u1.s1(this);
        }
        List<b> list = this.f111082h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f111082h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H1;
    }

    g3 w(g3 g3Var) {
        g3 g3Var2 = u1.W(this) ? g3Var : null;
        if (!o.a(this.f111080g, g3Var2)) {
            this.f111080g = g3Var2;
            M();
            requestLayout();
        }
        return g3Var;
    }

    public boolean x(@NonNull f fVar) {
        return this.f111096v.remove(fVar);
    }

    public void y(@p0 b bVar) {
        List<b> list = this.f111082h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void z(g gVar) {
        y(gVar);
    }

    public AppBarLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111072n3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111075b = -1;
        this.f111076c = -1;
        this.f111077d = -1;
        this.f111079f = 0;
        this.f111096v = new ArrayList();
        Context context2 = getContext();
        boolean z10 = true;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.f362009r0, i10, i11, new int[0]);
        u1.O1(this, typedArrayK.getDrawable(r6.a.o.f362034s0));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.f362178y0);
        if (colorStateListA == null) {
            z10 = false;
        }
        this.f111090o = z10;
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(getBackground());
        if (colorStateListG != null) {
            k kVar = new k();
            kVar.p0(colorStateListG);
            if (colorStateListA != null) {
                p(kVar, colorStateListG, colorStateListA);
            } else {
                q(context2, kVar);
            }
        }
        this.f111097w = com.google.android.material.motion.j.f(context2, r6.a.c.Jd, getResources().getInteger(r6.a.i.f360827c));
        this.f111091p0 = com.google.android.material.motion.j.g(context2, r6.a.c.f359155be, com.google.android.material.animation.b.f111043a);
        if (typedArrayK.hasValue(r6.a.o.f362130w0)) {
            C(typedArrayK.getBoolean(r6.a.o.f362130w0, false), false, false);
        }
        if (typedArrayK.hasValue(r6.a.o.f362106v0)) {
            h.b(this, typedArrayK.getDimensionPixelSize(r6.a.o.f362106v0, 0));
        }
        if (typedArrayK.hasValue(r6.a.o.f362082u0)) {
            setKeyboardNavigationCluster(typedArrayK.getBoolean(r6.a.o.f362082u0, false));
        }
        if (typedArrayK.hasValue(r6.a.o.f362058t0)) {
            setTouchscreenBlocksFocus(typedArrayK.getBoolean(r6.a.o.f362058t0, false));
        }
        this.f111081g3 = getResources().getDimension(r6.a.f.Q0);
        this.f111087l = typedArrayK.getBoolean(r6.a.o.f362154x0, false);
        this.f111088m = typedArrayK.getResourceId(r6.a.o.f362202z0, -1);
        setStatusBarForeground(typedArrayK.getDrawable(r6.a.o.A0));
        typedArrayK.recycle();
        u1.j2(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f111120d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f111121e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f111122f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f111123g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f111124h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f111125i = 16;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f111126j = 32;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f111127k = 5;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f111128l = 17;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f111129m = 10;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f111130n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f111131o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f111132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f111133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f111134c;

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public @interface a {
        }

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public @interface b {
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f111132a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.G0);
            this.f111132a = typedArrayObtainStyledAttributes.getInt(r6.a.o.I0, 0);
            f(typedArrayObtainStyledAttributes.getInt(r6.a.o.H0, 0));
            if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.J0)) {
                this.f111134c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.J0, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @p0
        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        @p0
        public c b() {
            return this.f111133b;
        }

        public int c() {
            return this.f111132a;
        }

        public Interpolator d() {
            return this.f111134c;
        }

        boolean e() {
            int i10 = this.f111132a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f111133b = a(i10);
        }

        public void g(@p0 c cVar) {
            this.f111133b = cVar;
        }

        public void h(int i10) {
            this.f111132a = i10;
        }

        public void i(Interpolator interpolator) {
            this.f111134c = interpolator;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f111132a = 1;
        }

        public e(int i10, int i11, float f10) {
            super(i10, i11, f10);
            this.f111132a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f111132a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f111132a = 1;
        }

        @w0(19)
        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f111132a = 1;
        }

        @w0(19)
        public e(@NonNull e eVar) {
            super((LinearLayout.LayoutParams) eVar);
            this.f111132a = 1;
            this.f111132a = eVar.f111132a;
            this.f111133b = eVar.f111133b;
            this.f111134c = eVar.f111134c;
        }
    }
}
