package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.VectorRatingBar;

/* JADX INFO: loaded from: classes4.dex */
public final class o4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final VectorRatingBar f159452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159454e;

    private o4(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull VectorRatingBar vectorRatingBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159450a = constraintLayout;
        this.f159451b = imageView;
        this.f159452c = vectorRatingBar;
        this.f159453d = textView;
        this.f159454e = textView2;
    }

    @NonNull
    public static o4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.L3;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Mp;
            VectorRatingBar vectorRatingBar = (VectorRatingBar) b4.c.a(view, i10);
            if (vectorRatingBar != null) {
                i10 = com.planner5d.library.f.j.Et;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.tv;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new o4((ConstraintLayout) view, imageView, vectorRatingBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168810q7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159450a;
    }
}
