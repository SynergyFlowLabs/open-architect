package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class h5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159088e;

    private h5(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159084a = constraintLayout;
        this.f159085b = materialButton;
        this.f159086c = imageView;
        this.f159087d = textView;
        this.f159088e = textView2;
    }

    @NonNull
    public static h5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.M4;
        MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
        if (materialButton != null) {
            i10 = com.planner5d.library.f.j.Ad;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168066fe;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.tv;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new h5((ConstraintLayout) view, materialButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.P7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159084a;
    }
}
