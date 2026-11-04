package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f158781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f158782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f158783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f158787g;

    private c0(@NonNull NestedScrollView nestedScrollView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull ProgressBar progressBar) {
        this.f158781a = nestedScrollView;
        this.f158782b = textInputEditTextCompat;
        this.f158783c = textInputLayout;
        this.f158784d = textView;
        this.f158785e = constraintLayout;
        this.f158786f = textView2;
        this.f158787g = progressBar;
    }

    @NonNull
    public static c0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.D2;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
        if (textInputEditTextCompat != null) {
            i10 = com.planner5d.library.f.j.E2;
            TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
            if (textInputLayout != null) {
                i10 = com.planner5d.library.f.j.F2;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.G2;
                    ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = com.planner5d.library.f.j.H2;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            i10 = com.planner5d.library.f.j.I2;
                            ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                            if (progressBar != null) {
                                return new c0((NestedScrollView) view, textInputEditTextCompat, textInputLayout, textView, constraintLayout, textView2, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        int i10 = 1 << 0;
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168771n1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f158781a;
    }
}
