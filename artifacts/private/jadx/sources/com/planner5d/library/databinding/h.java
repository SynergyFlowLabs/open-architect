package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxView;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f159028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f159029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f159030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f159032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159033l;

    private h(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull PreloaderBoxView preloaderBoxView, @NonNull ProgressBar progressBar, @NonNull TextView textView4, @NonNull LinearLayout linearLayout) {
        this.f159022a = frameLayout;
        this.f159023b = textView;
        this.f159024c = textView2;
        this.f159025d = textView3;
        this.f159026e = frameLayout2;
        this.f159027f = constraintLayout;
        this.f159028g = imageView;
        this.f159029h = view;
        this.f159030i = preloaderBoxView;
        this.f159031j = progressBar;
        this.f159032k = textView4;
        this.f159033l = linearLayout;
    }

    @NonNull
    public static h a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f168177k5;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f168370s5;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.C5;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = com.planner5d.library.f.j.H7;
                    FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout != null) {
                        i10 = com.planner5d.library.f.j.M7;
                        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                        if (constraintLayout != null) {
                            i10 = com.planner5d.library.f.j.f168254na;
                            ImageView imageView = (ImageView) b4.c.a(view, i10);
                            if (imageView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168278oa))) != null) {
                                i10 = com.planner5d.library.f.j.f168144il;
                                PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                                if (preloaderBoxView != null) {
                                    i10 = com.planner5d.library.f.j.Fr;
                                    ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                                    if (progressBar != null) {
                                        i10 = com.planner5d.library.f.j.tv;
                                        TextView textView4 = (TextView) b4.c.a(view, i10);
                                        if (textView4 != null) {
                                            i10 = com.planner5d.library.f.j.Bv;
                                            LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                                            if (linearLayout != null) {
                                                return new h((FrameLayout) view, textView, textView2, textView3, frameLayout, constraintLayout, imageView, viewA, preloaderBoxView, progressBar, textView4, linearLayout);
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
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.I0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159022a;
    }
}
