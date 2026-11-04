package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.textview.TextViewWithLine;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f158935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f158936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f158941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f158942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f158943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextViewWithLine f158944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f158945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f158946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ProgressBar f158947m;

    private f0(@NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView4, @NonNull TextViewWithLine textViewWithLine, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull TextInputLayout textInputLayout2, @NonNull ProgressBar progressBar) {
        this.f158935a = nestedScrollView;
        this.f158936b = recyclerView;
        this.f158937c = constraintLayout;
        this.f158938d = textView;
        this.f158939e = textView2;
        this.f158940f = textView3;
        this.f158941g = textInputEditTextCompat;
        this.f158942h = textInputLayout;
        this.f158943i = textView4;
        this.f158944j = textViewWithLine;
        this.f158945k = textInputEditTextCompat2;
        this.f158946l = textInputLayout2;
        this.f158947m = progressBar;
    }

    @NonNull
    public static f0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167982c3;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.f168007d3;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = com.planner5d.library.f.j.f168031e3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168055f3;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.f168079g3;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.f168103h3;
                            TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                            if (textInputEditTextCompat != null) {
                                i10 = com.planner5d.library.f.j.f168127i3;
                                TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                                if (textInputLayout != null) {
                                    i10 = com.planner5d.library.f.j.f168151j3;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = com.planner5d.library.f.j.f168175k3;
                                        TextViewWithLine textViewWithLine = (TextViewWithLine) b4.c.a(view, i10);
                                        if (textViewWithLine != null) {
                                            i10 = com.planner5d.library.f.j.f168199l3;
                                            TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                                            if (textInputEditTextCompat2 != null) {
                                                i10 = com.planner5d.library.f.j.f168223m3;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                                                if (textInputLayout2 != null) {
                                                    i10 = com.planner5d.library.f.j.f168247n3;
                                                    ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                                                    if (progressBar != null) {
                                                        return new f0((NestedScrollView) view, recyclerView, constraintLayout, textView, textView2, textView3, textInputEditTextCompat, textInputLayout, textView4, textViewWithLine, textInputEditTextCompat2, textInputLayout2, progressBar);
                                                    }
                                                }
                                            }
                                        }
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
    public static f0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168804q1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f158935a;
    }
}
