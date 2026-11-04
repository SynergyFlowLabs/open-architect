package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.VerticalScrollRangeWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f159625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final VerticalScrollRangeWebView f159626h;

    private s0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull View view, @NonNull VerticalScrollRangeWebView verticalScrollRangeWebView) {
        this.f159619a = constraintLayout;
        this.f159620b = imageView;
        this.f159621c = imageView2;
        this.f159622d = textView;
        this.f159623e = textView2;
        this.f159624f = progressBar;
        this.f159625g = view;
        this.f159626h = verticalScrollRangeWebView;
    }

    @NonNull
    public static s0 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f168129i5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.E5;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = com.planner5d.library.f.j.f167991cc;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168088gc;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.Wm;
                        ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                        if (progressBar != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Ym))) != null) {
                            i10 = com.planner5d.library.f.j.Xx;
                            VerticalScrollRangeWebView verticalScrollRangeWebView = (VerticalScrollRangeWebView) b4.c.a(view, i10);
                            if (verticalScrollRangeWebView != null) {
                                return new s0((ConstraintLayout) view, imageView, imageView2, textView, textView2, progressBar, viewA, verticalScrollRangeWebView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.L1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159619a;
    }
}
