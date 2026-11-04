package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f158776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f158778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158780f;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f158775a = constraintLayout;
        this.f158776b = view;
        this.f158777c = textView;
        this.f158778d = imageView;
        this.f158779e = textView2;
        this.f158780f = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168393t4;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = com.planner5d.library.f.j.A4;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.R4;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.f168160jc;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.f168184kc;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            return new c((ConstraintLayout) view, viewA, textView, imageView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168803q0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158775a;
    }
}
