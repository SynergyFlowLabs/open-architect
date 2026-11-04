package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.scrollview.FlingableNestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final j1 f159212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FlingableNestedScrollView f159216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final p1 f159217g;

    private k1(@NonNull FrameLayout frameLayout, @NonNull j1 j1Var, @NonNull TextView textView, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull RecyclerView recyclerView, @NonNull FlingableNestedScrollView flingableNestedScrollView, @NonNull p1 p1Var) {
        this.f159211a = frameLayout;
        this.f159212b = j1Var;
        this.f159213c = textView;
        this.f159214d = preloaderBoxV2View;
        this.f159215e = recyclerView;
        this.f159216f = flingableNestedScrollView;
        this.f159217g = p1Var;
    }

    @NonNull
    public static k1 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f168026dm;
        View viewA2 = b4.c.a(view, i10);
        if (viewA2 != null) {
            j1 j1VarA = j1.a(viewA2);
            i10 = com.planner5d.library.f.j.f168145im;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Mm;
                PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                if (preloaderBoxV2View != null) {
                    i10 = com.planner5d.library.f.j.Nm;
                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                    if (recyclerView != null) {
                        i10 = com.planner5d.library.f.j.Om;
                        FlingableNestedScrollView flingableNestedScrollView = (FlingableNestedScrollView) b4.c.a(view, i10);
                        if (flingableNestedScrollView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Qm))) != null) {
                            return new k1((FrameLayout) view, j1VarA, textView, preloaderBoxV2View, recyclerView, flingableNestedScrollView, p1.a(viewA));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168651c2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159211a;
    }
}
