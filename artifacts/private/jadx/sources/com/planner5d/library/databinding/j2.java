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
public final class j2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f159185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f159186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Flow f159187m;

    private j2(@NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull TextView textView3, @NonNull PreloaderCoverView preloaderCoverView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView4, @NonNull NestedScrollView nestedScrollView2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull Flow flow) {
        this.f159175a = nestedScrollView;
        this.f159176b = imageView;
        this.f159177c = textView;
        this.f159178d = textView2;
        this.f159179e = recyclerView;
        this.f159180f = textView3;
        this.f159181g = preloaderCoverView;
        this.f159182h = constraintLayout;
        this.f159183i = textView4;
        this.f159184j = nestedScrollView2;
        this.f159185k = textView5;
        this.f159186l = textView6;
        this.f159187m = flow;
    }

    @NonNull
    public static j2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Bg;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Lo;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.No;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Oo;
                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                    if (recyclerView != null) {
                        i10 = com.planner5d.library.f.j.Po;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.Ro;
                            PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                            if (preloaderCoverView != null) {
                                i10 = com.planner5d.library.f.j.Xo;
                                ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                                if (constraintLayout != null) {
                                    i10 = com.planner5d.library.f.j.Zo;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i10 = com.planner5d.library.f.j.bp;
                                        TextView textView5 = (TextView) b4.c.a(view, i10);
                                        if (textView5 != null) {
                                            i10 = com.planner5d.library.f.j.cp;
                                            TextView textView6 = (TextView) b4.c.a(view, i10);
                                            if (textView6 != null) {
                                                i10 = com.planner5d.library.f.j.qp;
                                                Flow flow = (Flow) b4.c.a(view, i10);
                                                if (flow != null) {
                                                    return new j2(nestedScrollView, imageView, textView, textView2, recyclerView, textView3, preloaderCoverView, constraintLayout, textView4, nestedScrollView, textView5, textView6, flow);
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
    public static j2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.C2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159175a;
    }
}
