package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f159429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ScrollView f159430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f159436h;

    private o2(@NonNull ScrollView scrollView, @NonNull ScrollView scrollView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull PreloaderCoverView preloaderCoverView, @NonNull HorizontalScrollView horizontalScrollView) {
        this.f159429a = scrollView;
        this.f159430b = scrollView2;
        this.f159431c = linearLayout;
        this.f159432d = textView;
        this.f159433e = imageView;
        this.f159434f = linearLayout2;
        this.f159435g = preloaderCoverView;
        this.f159436h = horizontalScrollView;
    }

    @NonNull
    public static o2 a(@NonNull View view) {
        ScrollView scrollView = (ScrollView) view;
        int i10 = com.planner5d.library.f.j.rp;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.sp;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.tp;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.up;
                    LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = com.planner5d.library.f.j.vp;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.f.j.wp;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b4.c.a(view, i10);
                            if (horizontalScrollView != null) {
                                return new o2(scrollView, scrollView, linearLayout, textView, imageView, linearLayout2, preloaderCoverView, horizontalScrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.H2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f159429a;
    }
}
