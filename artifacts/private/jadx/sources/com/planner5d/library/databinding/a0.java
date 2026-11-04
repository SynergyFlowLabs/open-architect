package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f158669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f158673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f158675g;

    private a0(@NonNull NestedScrollView nestedScrollView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f158669a = nestedScrollView;
        this.f158670b = constraintLayout;
        this.f158671c = textView;
        this.f158672d = textView2;
        this.f158673e = imageView;
        this.f158674f = textView3;
        this.f158675g = textView4;
    }

    @NonNull
    public static a0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168439v2;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.f168463w2;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.f168487x2;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.f168511y2;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.f.j.f168535z2;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.A2;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                return new a0((NestedScrollView) view, constraintLayout, textView, textView2, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168749l1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f158669a;
    }
}
