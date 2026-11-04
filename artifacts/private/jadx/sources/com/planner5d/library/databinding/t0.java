package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EnhancedRecyclerView f159666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f159667c;

    private t0(@NonNull FrameLayout frameLayout, @NonNull EnhancedRecyclerView enhancedRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f159665a = frameLayout;
        this.f159666b = enhancedRecyclerView;
        this.f159667c = swipeRefreshLayout;
    }

    @NonNull
    public static t0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) b4.c.a(view, i10);
        if (enhancedRecyclerView != null) {
            i10 = com.planner5d.library.f.j.f168429ug;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
            if (swipeRefreshLayout != null) {
                return new t0((FrameLayout) view, enhancedRecyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static t0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static t0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.J1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159665a;
    }
}
