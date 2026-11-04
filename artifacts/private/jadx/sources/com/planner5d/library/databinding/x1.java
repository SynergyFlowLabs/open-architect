package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159893c;

    private x1(@NonNull NestedScrollView nestedScrollView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.f159891a = nestedScrollView;
        this.f159892b = textInputLayout;
        this.f159893c = textInputLayout2;
    }

    @NonNull
    public static x1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Wn;
        TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
        if (textInputLayout != null) {
            i10 = com.planner5d.library.f.j.eo;
            TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
            if (textInputLayout2 != null) {
                return new x1((NestedScrollView) view, textInputLayout, textInputLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static x1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168805q2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159891a;
    }
}
