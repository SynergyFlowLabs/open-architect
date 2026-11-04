package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f159558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f159559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f159562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f159566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f159567k;

    private q4(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull View view2) {
        this.f159557a = constraintLayout;
        this.f159558b = guideline;
        this.f159559c = guideline2;
        this.f159560d = imageView;
        this.f159561e = imageView2;
        this.f159562f = imageView3;
        this.f159563g = textView;
        this.f159564h = textView2;
        this.f159565i = textView3;
        this.f159566j = view;
        this.f159567k = view2;
    }

    @NonNull
    public static q4 a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = com.planner5d.library.f.j.f168089gd;
        Guideline guideline = (Guideline) b4.c.a(view, i10);
        if (guideline != null) {
            i10 = com.planner5d.library.f.j.f168113hd;
            Guideline guideline2 = (Guideline) b4.c.a(view, i10);
            if (guideline2 != null) {
                i10 = com.planner5d.library.f.j.Ad;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.Bd;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = com.planner5d.library.f.j.Cd;
                        ImageView imageView3 = (ImageView) b4.c.a(view, i10);
                        if (imageView3 != null) {
                            i10 = com.planner5d.library.f.j.Hl;
                            TextView textView = (TextView) b4.c.a(view, i10);
                            if (textView != null) {
                                i10 = com.planner5d.library.f.j.Xl;
                                TextView textView2 = (TextView) b4.c.a(view, i10);
                                if (textView2 != null) {
                                    i10 = com.planner5d.library.f.j.tv;
                                    TextView textView3 = (TextView) b4.c.a(view, i10);
                                    if (textView3 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Ex))) != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Fx))) != null) {
                                        return new q4((ConstraintLayout) view, guideline, guideline2, imageView, imageView2, imageView3, textView, textView2, textView3, viewA, viewA2);
                                    }
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
    public static q4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168832s7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159557a;
    }
}
