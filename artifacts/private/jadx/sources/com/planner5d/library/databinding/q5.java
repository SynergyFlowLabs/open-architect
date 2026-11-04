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
public final class q5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButton f159569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f159570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159572e;

    private q5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159568a = constraintLayout;
        this.f159569b = imageButton;
        this.f159570c = shapeableImageView;
        this.f159571d = textView;
        this.f159572e = textView2;
    }

    @NonNull
    public static q5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.W4;
        ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
        if (imageButton != null) {
            i10 = com.planner5d.library.f.j.Zm;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
            if (shapeableImageView != null) {
                i10 = com.planner5d.library.f.j.Jt;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.tv;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new q5((ConstraintLayout) view, imageButton, shapeableImageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.W7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159568a;
    }
}
