package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.widget.TabLayout;
import com.planner5d.library.widget.ViewPagerCompat;
import com.planner5d.library.widget.editor.catalog.UnlockCountdownBannerView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class l3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f159285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f159286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f159288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f159289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ViewPagerCompat f159290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TabLayout f159291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f159292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f159293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f159294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ImageView f159295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final UnlockCountdownBannerView f159296n;

    private l3(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull View view2, @NonNull FrameLayout frameLayout, @NonNull View view3, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull ViewPagerCompat viewPagerCompat, @NonNull TabLayout tabLayout, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull UnlockCountdownBannerView unlockCountdownBannerView) {
        this.f159283a = view;
        this.f159284b = constraintLayout;
        this.f159285c = coordinatorLayout;
        this.f159286d = view2;
        this.f159287e = frameLayout;
        this.f159288f = view3;
        this.f159289g = linearProgressIndicator;
        this.f159290h = viewPagerCompat;
        this.f159291i = tabLayout;
        this.f159292j = preloaderSimpleV2View;
        this.f159293k = textView;
        this.f159294l = imageView;
        this.f159295m = imageView2;
        this.f159296n = unlockCountdownBannerView;
    }

    @NonNull
    public static l3 a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = com.planner5d.library.f.j.f168010d6;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.f168034e6;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b4.c.a(view, i10);
            if (coordinatorLayout != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168058f6))) != null) {
                i10 = com.planner5d.library.f.j.f168082g6;
                FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168087gb))) != null) {
                    i10 = com.planner5d.library.f.j.f168111hb;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(view, i10);
                    if (linearProgressIndicator != null) {
                        i10 = com.planner5d.library.f.j.f168135ib;
                        ViewPagerCompat viewPagerCompat = (ViewPagerCompat) b4.c.a(view, i10);
                        if (viewPagerCompat != null) {
                            i10 = com.planner5d.library.f.j.f168159jb;
                            TabLayout tabLayout = (TabLayout) b4.c.a(view, i10);
                            if (tabLayout != null) {
                                i10 = com.planner5d.library.f.j.f168183kb;
                                PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                                if (preloaderSimpleV2View != null) {
                                    i10 = com.planner5d.library.f.j.f168207lb;
                                    TextView textView = (TextView) b4.c.a(view, i10);
                                    if (textView != null) {
                                        i10 = com.planner5d.library.f.j.f168231mb;
                                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                                        if (imageView != null) {
                                            i10 = com.planner5d.library.f.j.f168255nb;
                                            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                                            if (imageView2 != null) {
                                                i10 = com.planner5d.library.f.j.ux;
                                                UnlockCountdownBannerView unlockCountdownBannerView = (UnlockCountdownBannerView) b4.c.a(view, i10);
                                                if (unlockCountdownBannerView != null) {
                                                    return new l3(view, constraintLayout, coordinatorLayout, viewA, frameLayout, viewA2, linearProgressIndicator, viewPagerCompat, tabLayout, preloaderSimpleV2View, textView, imageView, imageView2, unlockCountdownBannerView);
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
    public static l3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.J6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159283a;
    }
}
