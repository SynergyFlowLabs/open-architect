package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.planner5d.library.widget.ImageSlider;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageSlider f159389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f159392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159393h;

    private n2(@NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageSlider imageSlider, @NonNull LinearLayout linearLayout2, @NonNull PreloaderCoverView preloaderCoverView, @NonNull HorizontalScrollView horizontalScrollView, @NonNull NestedScrollView nestedScrollView2) {
        this.f159386a = nestedScrollView;
        this.f159387b = linearLayout;
        this.f159388c = textView;
        this.f159389d = imageSlider;
        this.f159390e = linearLayout2;
        this.f159391f = preloaderCoverView;
        this.f159392g = horizontalScrollView;
        this.f159393h = nestedScrollView2;
    }

    @NonNull
    public static n2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.ip;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.jp;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.kp;
                ImageSlider imageSlider = (ImageSlider) b4.c.a(view, i10);
                if (imageSlider != null) {
                    i10 = com.planner5d.library.f.j.lp;
                    LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = com.planner5d.library.f.j.mp;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.f.j.np;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b4.c.a(view, i10);
                            if (horizontalScrollView != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                return new n2(nestedScrollView, linearLayout, textView, imageSlider, linearLayout2, preloaderCoverView, horizontalScrollView, nestedScrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.G2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159386a;
    }
}
