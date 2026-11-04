package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public final class b4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CardView f158751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f158752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158753c;

    private b4(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.f158751a = cardView;
        this.f158752b = cardView2;
        this.f158753c = textView;
    }

    @NonNull
    public static b4 a(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i10 = com.planner5d.library.f.j.tv;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            return new b4(cardView, cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168634a7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f158751a;
    }
}
