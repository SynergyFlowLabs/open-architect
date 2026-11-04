package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159325e;

    private m1(@NonNull FrameLayout frameLayout, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView) {
        this.f159321a = frameLayout;
        this.f159322b = preloaderBoxV2View;
        this.f159323c = textInputEditTextCompat;
        this.f159324d = textInputLayout;
        this.f159325e = textView;
    }

    @NonNull
    public static m1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168362rm;
        PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
        if (preloaderBoxV2View != null) {
            i10 = com.planner5d.library.f.j.Em;
            TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
            if (textInputEditTextCompat != null) {
                i10 = com.planner5d.library.f.j.Fm;
                TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                if (textInputLayout != null) {
                    i10 = com.planner5d.library.f.j.Gm;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new m1((FrameLayout) view, preloaderBoxV2View, textInputEditTextCompat, textInputLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168684f2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159321a;
    }
}
