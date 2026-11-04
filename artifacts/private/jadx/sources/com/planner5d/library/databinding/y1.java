package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.slider.Slider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Slider f159940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159944i;

    private y1(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextView textView2, @NonNull Slider slider, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SwitchMaterial switchMaterial, @NonNull SwitchMaterial switchMaterial2) {
        this.f159936a = nestedScrollView;
        this.f159937b = textView;
        this.f159938c = textInputEditTextCompat;
        this.f159939d = textView2;
        this.f159940e = slider;
        this.f159941f = textView3;
        this.f159942g = textView4;
        this.f159943h = switchMaterial;
        this.f159944i = switchMaterial2;
    }

    @NonNull
    public static y1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.yn;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.zn;
            TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
            if (textInputEditTextCompat != null) {
                i10 = com.planner5d.library.f.j.An;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Bn;
                    Slider slider = (Slider) b4.c.a(view, i10);
                    if (slider != null) {
                        i10 = com.planner5d.library.f.j.Cn;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.Dn;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.f.j.Xn;
                                SwitchMaterial switchMaterial = (SwitchMaterial) b4.c.a(view, i10);
                                if (switchMaterial != null) {
                                    i10 = com.planner5d.library.f.j.Zn;
                                    SwitchMaterial switchMaterial2 = (SwitchMaterial) b4.c.a(view, i10);
                                    if (switchMaterial2 != null) {
                                        return new y1((NestedScrollView) view, textView, textInputEditTextCompat, textView2, slider, textView3, textView4, switchMaterial, switchMaterial2);
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
    public static y1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168816r2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159936a;
    }
}
