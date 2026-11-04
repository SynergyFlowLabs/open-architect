package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EnhancedRecyclerView f159792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f159793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159795e;

    private v0(@NonNull ConstraintLayout constraintLayout, @NonNull EnhancedRecyclerView enhancedRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull TextView textView, @NonNull PreloaderBoxV2View preloaderBoxV2View) {
        this.f159791a = constraintLayout;
        this.f159792b = enhancedRecyclerView;
        this.f159793c = swipeRefreshLayout;
        this.f159794d = textView;
        this.f159795e = preloaderBoxV2View;
    }

    @NonNull
    public static v0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) b4.c.a(view, i10);
        if (enhancedRecyclerView != null) {
            i10 = com.planner5d.library.f.j.f168477wg;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
            if (swipeRefreshLayout != null) {
                i10 = com.planner5d.library.f.j.Yk;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168144il;
                    PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                    if (preloaderBoxV2View != null) {
                        return new v0((ConstraintLayout) view, enhancedRecyclerView, swipeRefreshLayout, textView, preloaderBoxV2View);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static v0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static v0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.N1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159791a;
    }
}
