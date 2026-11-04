package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f159468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f159469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159472e;

    private p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull PreloaderCoverView preloaderCoverView) {
        this.f159468a = coordinatorLayout;
        this.f159469b = coordinatorLayout2;
        this.f159470c = frameLayout;
        this.f159471d = frameLayout2;
        this.f159472e = preloaderCoverView;
    }

    @NonNull
    public static p a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Ih;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b4.c.a(view, i10);
        if (coordinatorLayout != null) {
            i10 = com.planner5d.library.f.j.Fo;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.f.j.Bp;
                FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = com.planner5d.library.f.j.Cp;
                    PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                    if (preloaderCoverView != null) {
                        return new p((CoordinatorLayout) view, coordinatorLayout, frameLayout, frameLayout2, preloaderCoverView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.V0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f159468a;
    }
}
