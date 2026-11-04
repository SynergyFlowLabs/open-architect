package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.AnimatedVectorImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f159017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AnimatedVectorImageView f159018c;

    private g4(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull AnimatedVectorImageView animatedVectorImageView) {
        this.f159016a = constraintLayout;
        this.f159017b = cardView;
        this.f159018c = animatedVectorImageView;
    }

    @NonNull
    public static g4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Rd;
        CardView cardView = (CardView) b4.c.a(view, i10);
        if (cardView != null) {
            i10 = com.planner5d.library.f.j.Zm;
            AnimatedVectorImageView animatedVectorImageView = (AnimatedVectorImageView) b4.c.a(view, i10);
            if (animatedVectorImageView != null) {
                return new g4((ConstraintLayout) view, cardView, animatedVectorImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168678e7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159016a;
    }
}
