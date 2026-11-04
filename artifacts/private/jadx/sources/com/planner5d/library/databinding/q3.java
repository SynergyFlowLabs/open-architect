package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.TabLayout;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TabLayout f159555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159556i;

    private q3(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull PreloaderCoverView preloaderCoverView, @NonNull TabLayout tabLayout, @NonNull TextView textView) {
        this.f159548a = frameLayout;
        this.f159549b = imageView;
        this.f159550c = imageView2;
        this.f159551d = linearLayout;
        this.f159552e = frameLayout2;
        this.f159553f = frameLayout3;
        this.f159554g = preloaderCoverView;
        this.f159555h = tabLayout;
        this.f159556i = textView;
    }

    @NonNull
    public static q3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Ab;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Db;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = com.planner5d.library.f.j.Fb;
                LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                if (linearLayout != null) {
                    i10 = com.planner5d.library.f.j.Gb;
                    FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout != null) {
                        i10 = com.planner5d.library.f.j.Ib;
                        FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout2 != null) {
                            i10 = com.planner5d.library.f.j.Jb;
                            PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                            if (preloaderCoverView != null) {
                                i10 = com.planner5d.library.f.j.Kb;
                                TabLayout tabLayout = (TabLayout) b4.c.a(view, i10);
                                if (tabLayout != null) {
                                    i10 = com.planner5d.library.f.j.Lb;
                                    TextView textView = (TextView) b4.c.a(view, i10);
                                    if (textView != null) {
                                        return new q3((FrameLayout) view, imageView, imageView2, linearLayout, frameLayout, frameLayout2, preloaderCoverView, tabLayout, textView);
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
    public static q3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.S6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159548a;
    }
}
