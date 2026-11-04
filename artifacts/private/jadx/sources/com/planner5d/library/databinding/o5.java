package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f159456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f159457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159459e;

    private o5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159455a = constraintLayout;
        this.f159456b = imageButton;
        this.f159457c = shapeableImageView;
        this.f159458d = textView;
        this.f159459e = textView2;
    }

    @NonNull
    public static o5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.W4;
        ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
        if (imageButton != null) {
            i10 = com.planner5d.library.f.j.Jd;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
            if (shapeableImageView != null) {
                i10 = com.planner5d.library.f.j.Jt;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.tv;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new o5((ConstraintLayout) view, imageButton, shapeableImageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.U7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159455a;
    }
}
