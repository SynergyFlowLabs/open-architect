package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f158950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f158951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final EnhancedRecyclerView f158952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f158953f;

    private f1(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull EnhancedRecyclerView enhancedRecyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.f158948a = frameLayout;
        this.f158949b = linearLayout;
        this.f158950c = button;
        this.f158951d = button2;
        this.f158952e = enhancedRecyclerView;
        this.f158953f = swipeRefreshLayout;
    }

    @NonNull
    public static f1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.V5;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.W5;
            Button button = (Button) b4.c.a(view, i10);
            if (button != null) {
                i10 = com.planner5d.library.f.j.X5;
                Button button2 = (Button) b4.c.a(view, i10);
                if (button2 != null) {
                    i10 = com.planner5d.library.f.j.f168332qg;
                    EnhancedRecyclerView enhancedRecyclerView = (EnhancedRecyclerView) b4.c.a(view, i10);
                    if (enhancedRecyclerView != null) {
                        i10 = com.planner5d.library.f.j.f168429ug;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b4.c.a(view, i10);
                        if (swipeRefreshLayout != null) {
                            return new f1((FrameLayout) view, linearLayout, button, button2, enhancedRecyclerView, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.W1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158948a;
    }
}
