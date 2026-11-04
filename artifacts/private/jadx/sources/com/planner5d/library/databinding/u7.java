package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class u7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final MaterialCardView f159779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f159784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final AppCompatRadioButton f159786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159787i;

    private u7(@NonNull MaterialCardView materialCardView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull MaterialCardView materialCardView2, @NonNull TextView textView2, @NonNull AppCompatRadioButton appCompatRadioButton, @NonNull TextView textView3) {
        this.f159779a = materialCardView;
        this.f159780b = constraintLayout;
        this.f159781c = imageView;
        this.f159782d = textView;
        this.f159783e = imageView2;
        this.f159784f = materialCardView2;
        this.f159785g = textView2;
        this.f159786h = appCompatRadioButton;
        this.f159787i = textView3;
    }

    @NonNull
    public static u7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.N5;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.Yl;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Yp;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.Zp;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        MaterialCardView materialCardView = (MaterialCardView) view;
                        i10 = com.planner5d.library.f.j.bq;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            i10 = com.planner5d.library.f.j.cq;
                            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) b4.c.a(view, i10);
                            if (appCompatRadioButton != null) {
                                i10 = com.planner5d.library.f.j.dq;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    return new u7(materialCardView, constraintLayout, imageView, textView, imageView2, materialCardView, textView2, appCompatRadioButton, textView3);
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
    public static u7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static u7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.Y8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f159779a;
    }
}
