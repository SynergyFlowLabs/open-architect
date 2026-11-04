package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f159661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159662d;

    private s7(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SwitchCompat switchCompat, @NonNull TextView textView) {
        this.f159659a = constraintLayout;
        this.f159660b = constraintLayout2;
        this.f159661c = switchCompat;
        this.f159662d = textView;
    }

    @NonNull
    public static s7 a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = com.planner5d.library.f.j.dx;
        SwitchCompat switchCompat = (SwitchCompat) b4.c.a(view, i10);
        if (switchCompat != null) {
            i10 = com.planner5d.library.f.j.ex;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new s7(constraintLayout, constraintLayout, switchCompat, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.W8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159659a;
    }
}
