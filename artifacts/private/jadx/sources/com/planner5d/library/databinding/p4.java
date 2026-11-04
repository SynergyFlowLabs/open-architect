package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: loaded from: classes4.dex */
public final class p4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f159501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f159502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159505f;

    private p4(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f159500a = constraintLayout;
        this.f159501b = guideline;
        this.f159502c = guideline2;
        this.f159503d = textView;
        this.f159504e = textView2;
        this.f159505f = textView3;
    }

    @NonNull
    public static p4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168089gd;
        Guideline guideline = (Guideline) b4.c.a(view, i10);
        if (guideline != null) {
            i10 = com.planner5d.library.f.j.f168113hd;
            Guideline guideline2 = (Guideline) b4.c.a(view, i10);
            if (guideline2 != null) {
                i10 = com.planner5d.library.f.j.Hl;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.Xl;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.tv;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            return new p4((ConstraintLayout) view, guideline, guideline2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168821r7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159500a;
    }
}
