package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f159730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RadioGroup f159731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f159734e;

    private u0(@NonNull LinearLayout linearLayout, @NonNull RadioGroup radioGroup, @NonNull FrameLayout frameLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull AppCompatImageView appCompatImageView) {
        this.f159730a = linearLayout;
        this.f159731b = radioGroup;
        this.f159732c = frameLayout;
        this.f159733d = textInputEditTextCompat;
        this.f159734e = appCompatImageView;
    }

    @NonNull
    public static u0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168059f7;
        RadioGroup radioGroup = (RadioGroup) b4.c.a(view, i10);
        if (radioGroup != null) {
            i10 = com.planner5d.library.f.j.W9;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.f.j.f167990cb;
                TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                if (textInputEditTextCompat != null) {
                    i10 = com.planner5d.library.f.j.Mc;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) b4.c.a(view, i10);
                    if (appCompatImageView != null) {
                        return new u0((LinearLayout) view, radioGroup, frameLayout, textInputEditTextCompat, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static u0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static u0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.M1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f159730a;
    }
}
