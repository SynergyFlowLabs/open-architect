package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.planner5d.library.widget.carousel.ViewPagerCarouselView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f159004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f159009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ViewPagerCarouselView f159012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f159013k;

    private g2(@NonNull NestedScrollView nestedScrollView, @NonNull Guideline guideline, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull PreloaderCoverView preloaderCoverView, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull ViewPagerCarouselView viewPagerCarouselView, @NonNull NestedScrollView nestedScrollView2) {
        this.f159003a = nestedScrollView;
        this.f159004b = guideline;
        this.f159005c = textView;
        this.f159006d = linearLayout;
        this.f159007e = textView2;
        this.f159008f = preloaderCoverView;
        this.f159009g = horizontalScrollView;
        this.f159010h = textView3;
        this.f159011i = linearLayout2;
        this.f159012j = viewPagerCarouselView;
        this.f159013k = nestedScrollView2;
    }

    @NonNull
    public static g2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168065fd;
        Guideline guideline = (Guideline) b4.c.a(view, i10);
        if (guideline != null) {
            i10 = com.planner5d.library.f.j.No;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Oo;
                LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                if (linearLayout != null) {
                    i10 = com.planner5d.library.f.j.Po;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.Ro;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.f.j.Xo;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b4.c.a(view, i10);
                            if (horizontalScrollView != null) {
                                i10 = com.planner5d.library.f.j.bp;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    i10 = com.planner5d.library.f.j.Dp;
                                    LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                                    if (linearLayout2 != null) {
                                        i10 = com.planner5d.library.f.j.Ep;
                                        ViewPagerCarouselView viewPagerCarouselView = (ViewPagerCarouselView) b4.c.a(view, i10);
                                        if (viewPagerCarouselView != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            return new g2(nestedScrollView, guideline, textView, linearLayout, textView2, preloaderCoverView, horizontalScrollView, textView3, linearLayout2, viewPagerCarouselView, nestedScrollView);
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
    public static g2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168901z2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159003a;
    }
}
