package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f158798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f158799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f158800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158801e;

    private c2(@NonNull FrameLayout frameLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.f158797a = frameLayout;
        this.f158798b = textInputEditTextCompat;
        this.f158799c = textInputLayout;
        this.f158800d = frameLayout2;
        this.f158801e = textView;
    }

    @NonNull
    public static c2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.qo;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
        if (textInputEditTextCompat != null) {
            i10 = com.planner5d.library.f.j.ro;
            TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
            if (textInputLayout != null) {
                i10 = com.planner5d.library.f.j.so;
                FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout != null) {
                    i10 = com.planner5d.library.f.j.to;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new c2((FrameLayout) view, textInputEditTextCompat, textInputLayout, frameLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168860v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158797a;
    }
}
