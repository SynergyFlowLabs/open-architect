package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f159507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159512g;

    private p5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159506a = constraintLayout;
        this.f159507b = imageButton;
        this.f159508c = roundedCornersLayout;
        this.f159509d = imageView;
        this.f159510e = constraintLayout2;
        this.f159511f = textView;
        this.f159512g = textView2;
    }

    @NonNull
    public static p5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.W4;
        ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
        if (imageButton != null) {
            i10 = com.planner5d.library.f.j.Rd;
            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
            if (roundedCornersLayout != null) {
                i10 = com.planner5d.library.f.j.Zm;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i10 = com.planner5d.library.f.j.Jt;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.tv;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new p5(constraintLayout, imageButton, roundedCornersLayout, imageView, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.V7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159506a;
    }
}
