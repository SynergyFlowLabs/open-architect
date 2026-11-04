package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbar;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbarItem;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewPager f159545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PreviewToolbar f159547i;

    private q2(@NonNull ConstraintLayout constraintLayout, @NonNull PreviewToolbarItem previewToolbarItem, @NonNull PreviewToolbarItem previewToolbarItem2, @NonNull PreviewToolbarItem previewToolbarItem3, @NonNull PreviewToolbarItem previewToolbarItem4, @NonNull PreviewToolbarItem previewToolbarItem5, @NonNull ViewPager viewPager, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull PreviewToolbar previewToolbar) {
        this.f159539a = constraintLayout;
        this.f159540b = previewToolbarItem;
        this.f159541c = previewToolbarItem2;
        this.f159542d = previewToolbarItem3;
        this.f159543e = previewToolbarItem4;
        this.f159544f = previewToolbarItem5;
        this.f159545g = viewPager;
        this.f159546h = preloaderBoxV2View;
        this.f159547i = previewToolbar;
    }

    @NonNull
    public static q2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Hf;
        PreviewToolbarItem previewToolbarItem = (PreviewToolbarItem) b4.c.a(view, i10);
        if (previewToolbarItem != null) {
            i10 = com.planner5d.library.f.j.If;
            PreviewToolbarItem previewToolbarItem2 = (PreviewToolbarItem) b4.c.a(view, i10);
            if (previewToolbarItem2 != null) {
                i10 = com.planner5d.library.f.j.Jf;
                PreviewToolbarItem previewToolbarItem3 = (PreviewToolbarItem) b4.c.a(view, i10);
                if (previewToolbarItem3 != null) {
                    i10 = com.planner5d.library.f.j.Kf;
                    PreviewToolbarItem previewToolbarItem4 = (PreviewToolbarItem) b4.c.a(view, i10);
                    if (previewToolbarItem4 != null) {
                        i10 = com.planner5d.library.f.j.Nf;
                        PreviewToolbarItem previewToolbarItem5 = (PreviewToolbarItem) b4.c.a(view, i10);
                        if (previewToolbarItem5 != null) {
                            i10 = com.planner5d.library.f.j.f168288ok;
                            ViewPager viewPager = (ViewPager) b4.c.a(view, i10);
                            if (viewPager != null) {
                                i10 = com.planner5d.library.f.j.f168144il;
                                PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                                if (preloaderBoxV2View != null) {
                                    i10 = com.planner5d.library.f.j.Rl;
                                    PreviewToolbar previewToolbar = (PreviewToolbar) b4.c.a(view, i10);
                                    if (previewToolbar != null) {
                                        return new q2((ConstraintLayout) view, previewToolbarItem, previewToolbarItem2, previewToolbarItem3, previewToolbarItem4, previewToolbarItem5, viewPager, preloaderBoxV2View, previewToolbar);
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
    public static q2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.J2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159539a;
    }
}
