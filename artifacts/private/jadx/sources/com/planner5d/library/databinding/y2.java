package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.BottomNavigationView;
import com.planner5d.library.widget.ScalableTabLayout;
import com.planner5d.library.widget.Toolbar;
import com.planner5d.library.widget.TooltipListenerView;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BottomNavigationView f159946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f159949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f159951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f159952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f159954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f159955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f159956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f159958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Toolbar f159959o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ScalableTabLayout f159960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TooltipListenerView f159961t;

    private y2(@NonNull ConstraintLayout constraintLayout, @NonNull BottomNavigationView bottomNavigationView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull FrameLayout frameLayout3, @NonNull FragmentContainerView fragmentContainerView, @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull FrameLayout frameLayout4, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull Toolbar toolbar, @NonNull ScalableTabLayout scalableTabLayout, @NonNull TooltipListenerView tooltipListenerView) {
        this.f159945a = constraintLayout;
        this.f159946b = bottomNavigationView;
        this.f159947c = frameLayout;
        this.f159948d = frameLayout2;
        this.f159949e = view;
        this.f159950f = frameLayout3;
        this.f159951g = fragmentContainerView;
        this.f159952h = appBarLayout;
        this.f159953i = constraintLayout2;
        this.f159954j = view2;
        this.f159955k = coordinatorLayout;
        this.f159956l = linearProgressIndicator;
        this.f159957m = frameLayout4;
        this.f159958n = coordinatorLayout2;
        this.f159959o = toolbar;
        this.f159960s = scalableTabLayout;
        this.f159961t = tooltipListenerView;
    }

    @NonNull
    public static y2 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f168344r4;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) b4.c.a(view, i10);
        if (bottomNavigationView != null) {
            i10 = com.planner5d.library.f.j.f168467w6;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.f.j.H7;
                FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout2 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.I7))) != null) {
                    i10 = com.planner5d.library.f.j.J7;
                    FrameLayout frameLayout3 = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout3 != null) {
                        i10 = com.planner5d.library.f.j.Rc;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) b4.c.a(view, i10);
                        if (fragmentContainerView != null) {
                            i10 = com.planner5d.library.f.j.Hg;
                            AppBarLayout appBarLayout = (AppBarLayout) b4.c.a(view, i10);
                            if (appBarLayout != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = com.planner5d.library.f.j.Eg;
                                View viewA2 = b4.c.a(view, i10);
                                if (viewA2 != null) {
                                    i10 = com.planner5d.library.f.j.Fg;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b4.c.a(view, i10);
                                    if (coordinatorLayout != null) {
                                        i10 = com.planner5d.library.f.j.Gg;
                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(view, i10);
                                        if (linearProgressIndicator != null) {
                                            i10 = com.planner5d.library.f.j.Kg;
                                            FrameLayout frameLayout4 = (FrameLayout) b4.c.a(view, i10);
                                            if (frameLayout4 != null) {
                                                i10 = com.planner5d.library.f.j.Lg;
                                                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) b4.c.a(view, i10);
                                                if (coordinatorLayout2 != null) {
                                                    i10 = com.planner5d.library.f.j.uw;
                                                    Toolbar toolbar = (Toolbar) b4.c.a(view, i10);
                                                    if (toolbar != null) {
                                                        i10 = com.planner5d.library.f.j.yw;
                                                        ScalableTabLayout scalableTabLayout = (ScalableTabLayout) b4.c.a(view, i10);
                                                        if (scalableTabLayout != null) {
                                                            i10 = com.planner5d.library.f.j.Lw;
                                                            TooltipListenerView tooltipListenerView = (TooltipListenerView) b4.c.a(view, i10);
                                                            if (tooltipListenerView != null) {
                                                                return new y2(constraintLayout, bottomNavigationView, frameLayout, frameLayout2, viewA, frameLayout3, fragmentContainerView, appBarLayout, constraintLayout, viewA2, coordinatorLayout, linearProgressIndicator, frameLayout4, coordinatorLayout2, toolbar, scalableTabLayout, tooltipListenerView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static y2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.L3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159945a;
    }
}
