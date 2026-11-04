package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f158742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158745e;

    private b2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f158741a = constraintLayout;
        this.f158742b = imageView;
        this.f158743c = textView;
        this.f158744d = textView2;
        this.f158745e = textView3;
    }

    @NonNull
    public static b2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Hn;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Jn;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Kn;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Sn;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        return new b2((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168849u2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158741a;
    }
}
