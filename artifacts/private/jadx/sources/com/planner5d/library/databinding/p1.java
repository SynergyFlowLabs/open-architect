package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f159482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159485g;

    private p1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProfileIconView profileIconView, @NonNull TextView textView3, @NonNull ButtonTextView buttonTextView, @NonNull ConstraintLayout constraintLayout2) {
        this.f159479a = constraintLayout;
        this.f159480b = textView;
        this.f159481c = textView2;
        this.f159482d = profileIconView;
        this.f159483e = textView3;
        this.f159484f = buttonTextView;
        this.f159485g = constraintLayout2;
    }

    @NonNull
    public static p1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Yl;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Cm;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.Dm;
                ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
                if (profileIconView != null) {
                    i10 = com.planner5d.library.f.j.Lm;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.f.j.Pm;
                        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                        if (buttonTextView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new p1(constraintLayout, textView, textView2, profileIconView, textView3, buttonTextView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168717i2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159479a;
    }
}
