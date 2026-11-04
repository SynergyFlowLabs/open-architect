package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f159109d;

    private i1(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f159106a = frameLayout;
        this.f159107b = recyclerView;
        this.f159108c = preloaderBoxV2View;
        this.f159109d = swipeRefreshLayout;
    }

    @NonNull
    public static i1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Kj;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.Sj;
            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
            if (preloaderBoxV2View != null) {
                i10 = com.planner5d.library.f.j.f167999ck;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
                if (swipeRefreshLayout != null) {
                    return new i1((FrameLayout) view, recyclerView, preloaderBoxV2View, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168629a2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159106a;
    }
}
