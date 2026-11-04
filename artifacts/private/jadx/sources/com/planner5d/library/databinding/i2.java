package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f159121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f159123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Flow f159124o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f159126t;

    private i2(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull RecyclerView recyclerView, @NonNull TextView textView6, @NonNull PreloaderCoverView preloaderCoverView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView7, @NonNull NestedScrollView nestedScrollView2, @NonNull TextView textView8, @NonNull Flow flow, @NonNull PreloaderCoverView preloaderCoverView2, @NonNull TextView textView9) {
        this.f159110a = nestedScrollView;
        this.f159111b = textView;
        this.f159112c = imageView;
        this.f159113d = textView2;
        this.f159114e = textView3;
        this.f159115f = textView4;
        this.f159116g = textView5;
        this.f159117h = recyclerView;
        this.f159118i = textView6;
        this.f159119j = preloaderCoverView;
        this.f159120k = constraintLayout;
        this.f159121l = textView7;
        this.f159122m = nestedScrollView2;
        this.f159123n = textView8;
        this.f159124o = flow;
        this.f159125s = preloaderCoverView2;
        this.f159126t = textView9;
    }

    @NonNull
    public static i2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168399ta;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Bg;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Xg;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Jo;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.f.j.Ko;
                        TextView textView4 = (TextView) b4.c.a(view, i10);
                        if (textView4 != null) {
                            i10 = com.planner5d.library.f.j.No;
                            TextView textView5 = (TextView) b4.c.a(view, i10);
                            if (textView5 != null) {
                                i10 = com.planner5d.library.f.j.Oo;
                                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                if (recyclerView != null) {
                                    i10 = com.planner5d.library.f.j.Po;
                                    TextView textView6 = (TextView) b4.c.a(view, i10);
                                    if (textView6 != null) {
                                        i10 = com.planner5d.library.f.j.Ro;
                                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                                        if (preloaderCoverView != null) {
                                            i10 = com.planner5d.library.f.j.Xo;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                                            if (constraintLayout != null) {
                                                i10 = com.planner5d.library.f.j.Zo;
                                                TextView textView7 = (TextView) b4.c.a(view, i10);
                                                if (textView7 != null) {
                                                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                    i10 = com.planner5d.library.f.j.bp;
                                                    TextView textView8 = (TextView) b4.c.a(view, i10);
                                                    if (textView8 != null) {
                                                        i10 = com.planner5d.library.f.j.qp;
                                                        Flow flow = (Flow) b4.c.a(view, i10);
                                                        if (flow != null) {
                                                            i10 = com.planner5d.library.f.j.Cp;
                                                            PreloaderCoverView preloaderCoverView2 = (PreloaderCoverView) b4.c.a(view, i10);
                                                            if (preloaderCoverView2 != null) {
                                                                i10 = com.planner5d.library.f.j.tv;
                                                                TextView textView9 = (TextView) b4.c.a(view, i10);
                                                                if (textView9 != null) {
                                                                    return new i2(nestedScrollView, textView, imageView, textView2, textView3, textView4, textView5, recyclerView, textView6, preloaderCoverView, constraintLayout, textView7, nestedScrollView, textView8, flow, preloaderCoverView2, textView9);
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
    public static i2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.B2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159110a;
    }
}
