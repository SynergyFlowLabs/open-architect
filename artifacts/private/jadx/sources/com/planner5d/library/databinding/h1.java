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
public final class h1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f159052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159057g;

    private h1(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159051a = constraintLayout;
        this.f159052b = view;
        this.f159053c = materialButton;
        this.f159054d = materialButton2;
        this.f159055e = imageView;
        this.f159056f = textView;
        this.f159057g = textView2;
    }

    @NonNull
    public static h1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.U4;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = com.planner5d.library.f.j.Z4;
            MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
            if (materialButton != null) {
                i10 = com.planner5d.library.f.j.f167959b5;
                MaterialButton materialButton2 = (MaterialButton) b4.c.a(view, i10);
                if (materialButton2 != null) {
                    i10 = com.planner5d.library.f.j.Ad;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.f.j.Hh;
                        TextView textView = (TextView) b4.c.a(view, i10);
                        if (textView != null) {
                            i10 = com.planner5d.library.f.j.Jh;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                return new h1((ConstraintLayout) view, viewA, materialButton, materialButton2, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.Y1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159051a;
    }
}
