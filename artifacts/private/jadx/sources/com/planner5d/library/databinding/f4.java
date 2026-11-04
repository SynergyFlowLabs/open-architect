package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f158964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CardView f158965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f158966d;

    private f4(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CardView cardView, @NonNull ImageView imageView) {
        this.f158963a = constraintLayout;
        this.f158964b = textView;
        this.f158965c = cardView;
        this.f158966d = imageView;
    }

    @NonNull
    public static f4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.V4;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Rd;
            CardView cardView = (CardView) b4.c.a(view, i10);
            if (cardView != null) {
                i10 = com.planner5d.library.f.j.Zm;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    return new f4((ConstraintLayout) view, textView, cardView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f4 c(@NonNull LayoutInflater layoutInflater) {
        int i10 = 6 ^ 0;
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168667d7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158963a;
    }
}
