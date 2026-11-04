package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159664b;

    private t(@NonNull FrameLayout frameLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat) {
        this.f159663a = frameLayout;
        this.f159664b = textInputEditTextCompat;
    }

    @NonNull
    public static t a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168451ve;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
        if (textInputEditTextCompat != null) {
            return new t((FrameLayout) view, textInputEditTextCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static t c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static t d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168628a1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159663a;
    }
}
