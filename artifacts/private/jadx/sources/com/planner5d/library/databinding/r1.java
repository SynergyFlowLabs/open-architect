package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159585b;

    private r1(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.f159584a = constraintLayout;
        this.f159585b = frameLayout;
    }

    @NonNull
    public static r1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168063fb;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            return new r1((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168739k2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159584a;
    }
}
