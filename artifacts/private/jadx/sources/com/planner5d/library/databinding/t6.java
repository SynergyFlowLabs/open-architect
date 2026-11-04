package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159713c;

    private t6(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2) {
        this.f159711a = constraintLayout;
        this.f159712b = imageView;
        this.f159713c = constraintLayout2;
    }

    @NonNull
    public static t6 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Zm;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new t6(constraintLayout, imageView, constraintLayout);
    }

    @NonNull
    public static t6 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static t6 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168789o8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159711a;
    }
}
