package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f159154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159156h;

    private j(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView3) {
        this.f159149a = constraintLayout;
        this.f159150b = textView;
        this.f159151c = imageView;
        this.f159152d = constraintLayout2;
        this.f159153e = textView2;
        this.f159154f = imageView2;
        this.f159155g = progressBar;
        this.f159156h = textView3;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168440v3;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f168464w3;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168488x3;
                ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                if (constraintLayout != null) {
                    i10 = com.planner5d.library.f.j.f168512y3;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.f168536z3;
                        ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                        if (imageView2 != null) {
                            i10 = com.planner5d.library.f.j.A3;
                            ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                            if (progressBar != null) {
                                i10 = com.planner5d.library.f.j.B3;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    return new j((ConstraintLayout) view, textView, imageView, constraintLayout, textView2, imageView2, progressBar, textView3);
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
    public static j c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.N0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159149a;
    }
}
