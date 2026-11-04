package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f159608d;

    private r7(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull SwitchCompat switchCompat) {
        this.f159605a = constraintLayout;
        this.f159606b = textView;
        this.f159607c = constraintLayout2;
        this.f159608d = switchCompat;
    }

    @NonNull
    public static r7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Vo;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = com.planner5d.library.f.j.dx;
            SwitchCompat switchCompat = (SwitchCompat) b4.c.a(view, i11);
            if (switchCompat != null) {
                return new r7(constraintLayout, textView, constraintLayout, switchCompat);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.V8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159605a;
    }
}
