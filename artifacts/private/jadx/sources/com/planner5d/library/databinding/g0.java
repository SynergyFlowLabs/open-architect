package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f158989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f158990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f158991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final EditText f158993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ProgressBar f158994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f158996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f158997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f158998j;

    private g0(@NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f158989a = nestedScrollView;
        this.f158990b = recyclerView;
        this.f158991c = roundedCornersLayout;
        this.f158992d = textView;
        this.f158993e = editText;
        this.f158994f = progressBar;
        this.f158995g = constraintLayout;
        this.f158996h = textView2;
        this.f158997i = textView3;
        this.f158998j = textView4;
    }

    @NonNull
    public static g0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167982c3;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.f168007d3;
            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
            if (roundedCornersLayout != null) {
                i10 = com.planner5d.library.f.j.f168031e3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168103h3;
                    EditText editText = (EditText) b4.c.a(view, i10);
                    if (editText != null) {
                        i10 = com.planner5d.library.f.j.f168247n3;
                        ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                        if (progressBar != null) {
                            i10 = com.planner5d.library.f.j.f168153j5;
                            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                            if (constraintLayout != null) {
                                i10 = com.planner5d.library.f.j.f167941ac;
                                TextView textView2 = (TextView) b4.c.a(view, i10);
                                if (textView2 != null) {
                                    i10 = com.planner5d.library.f.j.Jj;
                                    TextView textView3 = (TextView) b4.c.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = com.planner5d.library.f.j.tv;
                                        TextView textView4 = (TextView) b4.c.a(view, i10);
                                        if (textView4 != null) {
                                            return new g0((NestedScrollView) view, recyclerView, roundedCornersLayout, textView, editText, progressBar, constraintLayout, textView2, textView3, textView4);
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
    public static g0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168815r1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f158989a;
    }
}
