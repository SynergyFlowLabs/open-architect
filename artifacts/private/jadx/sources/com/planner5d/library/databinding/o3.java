package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f159438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final d1 f159441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f159443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f159444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f159445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final b1 f159447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f159448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ViewFlipper f159449m;

    private o3(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull d1 d1Var, @NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull View view2, @NonNull View view3, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull b1 b1Var, @NonNull TextView textView, @NonNull ViewFlipper viewFlipper) {
        this.f159437a = frameLayout;
        this.f159438b = view;
        this.f159439c = imageView;
        this.f159440d = imageView2;
        this.f159441e = d1Var;
        this.f159442f = constraintLayout;
        this.f159443g = coordinatorLayout;
        this.f159444h = view2;
        this.f159445i = view3;
        this.f159446j = preloaderBoxV2View;
        this.f159447k = b1Var;
        this.f159448l = textView;
        this.f159449m = viewFlipper;
    }

    @NonNull
    public static o3 a(@NonNull View view) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        int i10 = com.planner5d.library.f.j.f168404tf;
        View viewA5 = b4.c.a(view, i10);
        if (viewA5 != null) {
            i10 = com.planner5d.library.f.j.f168428uf;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168452vf;
                ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                if (imageView2 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168476wf))) != null) {
                    d1 d1VarA = d1.a(viewA);
                    i10 = com.planner5d.library.f.j.f168500xf;
                    ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = com.planner5d.library.f.j.f168524yf;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b4.c.a(view, i10);
                        if (coordinatorLayout != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168548zf))) != null && (viewA3 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Af))) != null) {
                            i10 = com.planner5d.library.f.j.Cf;
                            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                            if (preloaderBoxV2View != null && (viewA4 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Ef))) != null) {
                                b1 b1VarA = b1.a(viewA4);
                                i10 = com.planner5d.library.f.j.Ff;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    i10 = com.planner5d.library.f.j.Gf;
                                    ViewFlipper viewFlipper = (ViewFlipper) b4.c.a(view, i10);
                                    if (viewFlipper != null) {
                                        return new o3((FrameLayout) view, viewA5, imageView, imageView2, d1VarA, constraintLayout, coordinatorLayout, viewA2, viewA3, preloaderBoxV2View, b1VarA, textView, viewFlipper);
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
    public static o3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.Q6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159437a;
    }
}
