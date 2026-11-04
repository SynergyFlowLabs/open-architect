package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.VectorRatingBar;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final VectorRatingBar f159227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f159229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f159230m;

    private k2(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RecyclerView recyclerView, @NonNull TextView textView5, @NonNull PreloaderCoverView preloaderCoverView, @NonNull ConstraintLayout constraintLayout, @NonNull VectorRatingBar vectorRatingBar, @NonNull NestedScrollView nestedScrollView2, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f159218a = nestedScrollView;
        this.f159219b = textView;
        this.f159220c = textView2;
        this.f159221d = textView3;
        this.f159222e = textView4;
        this.f159223f = recyclerView;
        this.f159224g = textView5;
        this.f159225h = preloaderCoverView;
        this.f159226i = constraintLayout;
        this.f159227j = vectorRatingBar;
        this.f159228k = nestedScrollView2;
        this.f159229l = textView6;
        this.f159230m = textView7;
    }

    @NonNull
    public static k2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Ko;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Lo;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.Mo;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = com.planner5d.library.f.j.No;
                    TextView textView4 = (TextView) b4.c.a(view, i10);
                    if (textView4 != null) {
                        i10 = com.planner5d.library.f.j.Oo;
                        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                        if (recyclerView != null) {
                            i10 = com.planner5d.library.f.j.Po;
                            TextView textView5 = (TextView) b4.c.a(view, i10);
                            if (textView5 != null) {
                                i10 = com.planner5d.library.f.j.Ro;
                                PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                                if (preloaderCoverView != null) {
                                    i10 = com.planner5d.library.f.j.Xo;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = com.planner5d.library.f.j.Yo;
                                        VectorRatingBar vectorRatingBar = (VectorRatingBar) b4.c.a(view, i10);
                                        if (vectorRatingBar != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i10 = com.planner5d.library.f.j.bp;
                                            TextView textView6 = (TextView) b4.c.a(view, i10);
                                            if (textView6 != null) {
                                                i10 = com.planner5d.library.f.j.cp;
                                                TextView textView7 = (TextView) b4.c.a(view, i10);
                                                if (textView7 != null) {
                                                    return new k2(nestedScrollView, textView, textView2, textView3, textView4, recyclerView, textView5, preloaderCoverView, constraintLayout, vectorRatingBar, nestedScrollView, textView6, textView7);
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
    public static k2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.D2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159218a;
    }
}
