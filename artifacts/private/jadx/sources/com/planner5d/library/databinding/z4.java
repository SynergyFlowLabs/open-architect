package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class z4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f160019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f160020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f160021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f160022d;

    private z4(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f160019a = constraintLayout;
        this.f160020b = imageView;
        this.f160021c = textView;
        this.f160022d = textView2;
    }

    @NonNull
    public static z4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168246n2;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.P9;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.rs;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    return new z4((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static z4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static z4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.G7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f160019a;
    }
}
