package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f159698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f159699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f159700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f159701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f159703g;

    private t3(@NonNull ConstraintLayout constraintLayout, @NonNull CheckedTextView checkedTextView, @NonNull CheckedTextView checkedTextView2, @NonNull HorizontalScrollView horizontalScrollView, @NonNull CheckedTextView checkedTextView3, @NonNull TextView textView, @NonNull CheckedTextView checkedTextView4) {
        this.f159697a = constraintLayout;
        this.f159698b = checkedTextView;
        this.f159699c = checkedTextView2;
        this.f159700d = horizontalScrollView;
        this.f159701e = checkedTextView3;
        this.f159702f = textView;
        this.f159703g = checkedTextView4;
    }

    @NonNull
    public static t3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Oc;
        CheckedTextView checkedTextView = (CheckedTextView) b4.c.a(view, i10);
        if (checkedTextView != null) {
            i10 = com.planner5d.library.f.j.f168499xe;
            CheckedTextView checkedTextView2 = (CheckedTextView) b4.c.a(view, i10);
            if (checkedTextView2 != null) {
                i10 = com.planner5d.library.f.j.er;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b4.c.a(view, i10);
                if (horizontalScrollView != null) {
                    i10 = com.planner5d.library.f.j.sv;
                    CheckedTextView checkedTextView3 = (CheckedTextView) b4.c.a(view, i10);
                    if (checkedTextView3 != null) {
                        i10 = com.planner5d.library.f.j.tv;
                        TextView textView = (TextView) b4.c.a(view, i10);
                        if (textView != null) {
                            i10 = com.planner5d.library.f.j.Ix;
                            CheckedTextView checkedTextView4 = (CheckedTextView) b4.c.a(view, i10);
                            if (checkedTextView4 != null) {
                                return new t3((ConstraintLayout) view, checkedTextView, checkedTextView2, horizontalScrollView, checkedTextView3, textView, checkedTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static t3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static t3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.V6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159697a;
    }
}
