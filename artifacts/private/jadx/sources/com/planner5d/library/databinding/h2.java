package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f159067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f159069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Flow f159070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Space f159072o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f159073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final Space f159074t;

    private h2(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull RecyclerView recyclerView, @NonNull TextView textView4, @NonNull PreloaderCoverView preloaderCoverView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView5, @NonNull NestedScrollView nestedScrollView2, @NonNull TextView textView6, @NonNull Flow flow, @NonNull PreloaderCoverView preloaderCoverView2, @NonNull Space space, @NonNull TextView textView7, @NonNull Space space2) {
        this.f159058a = nestedScrollView;
        this.f159059b = textView;
        this.f159060c = imageView;
        this.f159061d = textView2;
        this.f159062e = textView3;
        this.f159063f = recyclerView;
        this.f159064g = textView4;
        this.f159065h = preloaderCoverView;
        this.f159066i = constraintLayout;
        this.f159067j = textView5;
        this.f159068k = nestedScrollView2;
        this.f159069l = textView6;
        this.f159070m = flow;
        this.f159071n = preloaderCoverView2;
        this.f159072o = space;
        this.f159073s = textView7;
        this.f159074t = space2;
    }

    @NonNull
    public static h2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168399ta;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Bg;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Xg;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.No;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.f.j.Oo;
                        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                        if (recyclerView != null) {
                            i10 = com.planner5d.library.f.j.Po;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.f.j.Ro;
                                PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                                if (preloaderCoverView != null) {
                                    i10 = com.planner5d.library.f.j.Xo;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = com.planner5d.library.f.j.Zo;
                                        TextView textView5 = (TextView) b4.c.a(view, i10);
                                        if (textView5 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i10 = com.planner5d.library.f.j.bp;
                                            TextView textView6 = (TextView) b4.c.a(view, i10);
                                            if (textView6 != null) {
                                                i10 = com.planner5d.library.f.j.qp;
                                                Flow flow = (Flow) b4.c.a(view, i10);
                                                if (flow != null) {
                                                    i10 = com.planner5d.library.f.j.Cp;
                                                    PreloaderCoverView preloaderCoverView2 = (PreloaderCoverView) b4.c.a(view, i10);
                                                    if (preloaderCoverView2 != null) {
                                                        i10 = com.planner5d.library.f.j.Us;
                                                        Space space = (Space) b4.c.a(view, i10);
                                                        if (space != null) {
                                                            i10 = com.planner5d.library.f.j.tv;
                                                            TextView textView7 = (TextView) b4.c.a(view, i10);
                                                            if (textView7 != null) {
                                                                i10 = com.planner5d.library.f.j.Pw;
                                                                Space space2 = (Space) b4.c.a(view, i10);
                                                                if (space2 != null) {
                                                                    return new h2(nestedScrollView, textView, imageView, textView2, textView3, recyclerView, textView4, preloaderCoverView, constraintLayout, textView5, nestedScrollView, textView6, flow, preloaderCoverView2, space, textView7, space2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.A2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159058a;
    }
}
