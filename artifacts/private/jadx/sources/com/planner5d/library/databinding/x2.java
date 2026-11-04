package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f159894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RadioGroup f159895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RadioButton f159896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RadioButton f159897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RadioButton f159899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RadioButton f159900g;

    private x2(@NonNull LinearLayout linearLayout, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull TextView textView, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4) {
        this.f159894a = linearLayout;
        this.f159895b = radioGroup;
        this.f159896c = radioButton;
        this.f159897d = radioButton2;
        this.f159898e = textView;
        this.f159899f = radioButton3;
        this.f159900g = radioButton4;
    }

    @NonNull
    public static x2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.fv;
        RadioGroup radioGroup = (RadioGroup) b4.c.a(view, i10);
        if (radioGroup != null) {
            i10 = com.planner5d.library.f.j.gv;
            RadioButton radioButton = (RadioButton) b4.c.a(view, i10);
            if (radioButton != null) {
                i10 = com.planner5d.library.f.j.hv;
                RadioButton radioButton2 = (RadioButton) b4.c.a(view, i10);
                if (radioButton2 != null) {
                    i10 = com.planner5d.library.f.j.iv;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.jv;
                        RadioButton radioButton3 = (RadioButton) b4.c.a(view, i10);
                        if (radioButton3 != null) {
                            i10 = com.planner5d.library.f.j.kv;
                            RadioButton radioButton4 = (RadioButton) b4.c.a(view, i10);
                            if (radioButton4 != null) {
                                return new x2((LinearLayout) view, radioGroup, radioButton, radioButton2, textView, radioButton3, radioButton4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static x2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.F3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f159894a;
    }
}
