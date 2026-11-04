package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f159919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f159920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159921i;

    private y(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull ImageView imageView, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull View view, @NonNull TextInputEditTextCompat textInputEditTextCompat2) {
        this.f159913a = constraintLayout;
        this.f159914b = textInputEditTextCompat;
        this.f159915c = imageView;
        this.f159916d = roundedCornersLayout;
        this.f159917e = textInputLayout;
        this.f159918f = textInputLayout2;
        this.f159919g = preloaderSimpleV2View;
        this.f159920h = view;
        this.f159921i = textInputEditTextCompat2;
    }

    @NonNull
    public static y a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f167990cb;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
        if (textInputEditTextCompat != null) {
            i10 = com.planner5d.library.f.j.f168449vc;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168473wc;
                RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
                if (roundedCornersLayout != null) {
                    i10 = com.planner5d.library.f.j.Nc;
                    TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                    if (textInputLayout != null) {
                        i10 = com.planner5d.library.f.j.Li;
                        TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = com.planner5d.library.f.j.Gl;
                            PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                            if (preloaderSimpleV2View != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.zr))) != null) {
                                i10 = com.planner5d.library.f.j.Br;
                                TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                                if (textInputEditTextCompat2 != null) {
                                    return new y((ConstraintLayout) view, textInputEditTextCompat, imageView, roundedCornersLayout, textInputLayout, textInputLayout2, preloaderSimpleV2View, viewA, textInputEditTextCompat2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static y c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168716i1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159913a;
    }
}
