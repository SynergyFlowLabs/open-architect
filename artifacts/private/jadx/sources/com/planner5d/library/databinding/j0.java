package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckBox f159158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159165i;

    private j0(@NonNull NestedScrollView nestedScrollView, @NonNull CheckBox checkBox, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull TextInputLayout textInputLayout2, @NonNull ProgressBar progressBar) {
        this.f159157a = nestedScrollView;
        this.f159158b = checkBox;
        this.f159159c = constraintLayout;
        this.f159160d = textView;
        this.f159161e = textInputEditTextCompat;
        this.f159162f = textInputLayout;
        this.f159163g = textInputEditTextCompat2;
        this.f159164h = textInputLayout2;
        this.f159165i = progressBar;
    }

    @NonNull
    public static j0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.O1;
        CheckBox checkBox = (CheckBox) b4.c.a(view, i10);
        if (checkBox != null) {
            i10 = com.planner5d.library.f.j.f168271o3;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = com.planner5d.library.f.j.f168295p3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168319q3;
                    TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                    if (textInputEditTextCompat != null) {
                        i10 = com.planner5d.library.f.j.f168343r3;
                        TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                        if (textInputLayout != null) {
                            i10 = com.planner5d.library.f.j.f168368s3;
                            TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                            if (textInputEditTextCompat2 != null) {
                                i10 = com.planner5d.library.f.j.f168392t3;
                                TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                                if (textInputLayout2 != null) {
                                    i10 = com.planner5d.library.f.j.f168416u3;
                                    ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                                    if (progressBar != null) {
                                        return new j0((NestedScrollView) view, checkBox, constraintLayout, textView, textInputEditTextCompat, textInputLayout, textInputEditTextCompat2, textInputLayout2, progressBar);
                                    }
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
    public static j0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168848u1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159157a;
    }
}
