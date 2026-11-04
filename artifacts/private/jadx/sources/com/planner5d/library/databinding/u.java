package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159729g;

    private u(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f159723a = constraintLayout;
        this.f159724b = imageView;
        this.f159725c = textView;
        this.f159726d = textView2;
        this.f159727e = imageView2;
        this.f159728f = textView3;
        this.f159729g = textView4;
    }

    @NonNull
    public static u a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168177k5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.C5;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.vx;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.wx;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = com.planner5d.library.f.j.xx;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.yx;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                return new u((ConstraintLayout) view, imageView, textView, textView2, imageView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static u c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static u d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168639b1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159723a;
    }
}
