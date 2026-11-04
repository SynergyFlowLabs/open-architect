package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public final class c4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f158804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f158805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158806c;

    private c4(@NonNull RelativeLayout relativeLayout, @NonNull CardView cardView, @NonNull TextView textView) {
        this.f158804a = relativeLayout;
        this.f158805b = cardView;
        this.f158806c = textView;
    }

    @NonNull
    public static c4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Rd;
        CardView cardView = (CardView) b4.c.a(view, i10);
        if (cardView != null) {
            i10 = com.planner5d.library.f.j.tv;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new c4((RelativeLayout) view, cardView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168645b7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f158804a;
    }
}
