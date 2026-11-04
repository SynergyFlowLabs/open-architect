package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EnhancedRecyclerView f159836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f159837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159840f;

    private w0(@NonNull ConstraintLayout constraintLayout, @NonNull EnhancedRecyclerView enhancedRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull PreloaderBoxV2View preloaderBoxV2View) {
        this.f159835a = constraintLayout;
        this.f159836b = enhancedRecyclerView;
        this.f159837c = swipeRefreshLayout;
        this.f159838d = imageView;
        this.f159839e = textView;
        this.f159840f = preloaderBoxV2View;
    }

    @NonNull
    public static w0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) b4.c.a(view, i10);
        if (enhancedRecyclerView != null) {
            i10 = com.planner5d.library.f.j.f168477wg;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
            if (swipeRefreshLayout != null) {
                i10 = com.planner5d.library.f.j.Wk;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.Yk;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.f168144il;
                        PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                        if (preloaderBoxV2View != null) {
                            return new w0((ConstraintLayout) view, enhancedRecyclerView, swipeRefreshLayout, imageView, textView, preloaderBoxV2View);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.O1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159835a;
    }
}
