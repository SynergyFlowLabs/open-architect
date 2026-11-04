package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.settings.ViewDataRemoval;
import com.planner5d.library.activity.fragment.settings.ViewManagedFiles;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewManagedFiles f159000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewDataRemoval f159001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159002d;

    private g1(@NonNull FrameLayout frameLayout, @NonNull ViewManagedFiles viewManagedFiles, @NonNull ViewDataRemoval viewDataRemoval, @NonNull PreloaderCoverView preloaderCoverView) {
        this.f158999a = frameLayout;
        this.f159000b = viewManagedFiles;
        this.f159001c = viewDataRemoval;
        this.f159002d = preloaderCoverView;
    }

    @NonNull
    public static g1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Ng;
        ViewManagedFiles viewManagedFiles = (ViewManagedFiles) b4.c.a(view, i10);
        if (viewManagedFiles != null) {
            i10 = com.planner5d.library.f.j.Og;
            ViewDataRemoval viewDataRemoval = (ViewDataRemoval) b4.c.a(view, i10);
            if (viewDataRemoval != null) {
                i10 = com.planner5d.library.f.j.Pg;
                PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                if (preloaderCoverView != null) {
                    return new g1((FrameLayout) view, viewManagedFiles, viewDataRemoval, preloaderCoverView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.X1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158999a;
    }
}
