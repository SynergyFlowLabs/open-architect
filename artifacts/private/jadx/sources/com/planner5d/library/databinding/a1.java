package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.widget.ImageSlider;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f158677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f158678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f158679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageSlider f158682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f158683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f158684i;

    private a1(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonTextView buttonTextView, @NonNull ImageView imageView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageSlider imageSlider, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f158676a = constraintLayout;
        this.f158677b = buttonTextView;
        this.f158678c = imageView;
        this.f158679d = circularProgressIndicator;
        this.f158680e = textView;
        this.f158681f = textView2;
        this.f158682g = imageSlider;
        this.f158683h = textView3;
        this.f158684i = textView4;
    }

    @NonNull
    public static a1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168389t0;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = com.planner5d.library.f.j.W0;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168125i1;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b4.c.a(view, i10);
                if (circularProgressIndicator != null) {
                    i10 = com.planner5d.library.f.j.f168414u1;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.Y9;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            i10 = com.planner5d.library.f.j.ws;
                            ImageSlider imageSlider = (ImageSlider) b4.c.a(view, i10);
                            if (imageSlider != null) {
                                i10 = com.planner5d.library.f.j.Et;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    i10 = com.planner5d.library.f.j.tv;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        return new a1((ConstraintLayout) view, buttonTextView, imageView, circularProgressIndicator, textView, textView2, imageSlider, textView3, textView4);
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
    public static a1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.R1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158676a;
    }
}
