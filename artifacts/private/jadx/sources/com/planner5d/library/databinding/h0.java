package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Barrier f159036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Barrier f159037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final EditText f159039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final EditText f159040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final EditText f159041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final EditText f159042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final EditText f159043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final EditText f159044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final View f159045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f159046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f159047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f159048o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f159049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f159050t;

    private h0(@NonNull NestedScrollView nestedScrollView, @NonNull ProgressBar progressBar, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull TextView textView, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull EditText editText4, @NonNull EditText editText5, @NonNull EditText editText6, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f159034a = nestedScrollView;
        this.f159035b = progressBar;
        this.f159036c = barrier;
        this.f159037d = barrier2;
        this.f159038e = textView;
        this.f159039f = editText;
        this.f159040g = editText2;
        this.f159041h = editText3;
        this.f159042i = editText4;
        this.f159043j = editText5;
        this.f159044k = editText6;
        this.f159045l = view;
        this.f159046m = textView2;
        this.f159047n = textView3;
        this.f159048o = textView4;
        this.f159049s = textView5;
        this.f159050t = textView6;
    }

    @NonNull
    public static h0 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.f168247n3;
        ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
        if (progressBar != null) {
            i10 = com.planner5d.library.f.j.f168032e4;
            Barrier barrier = (Barrier) b4.c.a(view, i10);
            if (barrier != null) {
                i10 = com.planner5d.library.f.j.f168056f4;
                Barrier barrier2 = (Barrier) b4.c.a(view, i10);
                if (barrier2 != null) {
                    i10 = com.planner5d.library.f.j.f168514y5;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.T6;
                        EditText editText = (EditText) b4.c.a(view, i10);
                        if (editText != null) {
                            i10 = com.planner5d.library.f.j.U6;
                            EditText editText2 = (EditText) b4.c.a(view, i10);
                            if (editText2 != null) {
                                i10 = com.planner5d.library.f.j.V6;
                                EditText editText3 = (EditText) b4.c.a(view, i10);
                                if (editText3 != null) {
                                    i10 = com.planner5d.library.f.j.W6;
                                    EditText editText4 = (EditText) b4.c.a(view, i10);
                                    if (editText4 != null) {
                                        i10 = com.planner5d.library.f.j.X6;
                                        EditText editText5 = (EditText) b4.c.a(view, i10);
                                        if (editText5 != null) {
                                            i10 = com.planner5d.library.f.j.Y6;
                                            EditText editText6 = (EditText) b4.c.a(view, i10);
                                            if (editText6 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.V9))) != null) {
                                                i10 = com.planner5d.library.f.j.Y9;
                                                TextView textView2 = (TextView) b4.c.a(view, i10);
                                                if (textView2 != null) {
                                                    i10 = com.planner5d.library.f.j.f167941ac;
                                                    TextView textView3 = (TextView) b4.c.a(view, i10);
                                                    if (textView3 != null) {
                                                        i10 = com.planner5d.library.f.j.Yf;
                                                        TextView textView4 = (TextView) b4.c.a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = com.planner5d.library.f.j.Kt;
                                                            TextView textView5 = (TextView) b4.c.a(view, i10);
                                                            if (textView5 != null) {
                                                                i10 = com.planner5d.library.f.j.tv;
                                                                TextView textView6 = (TextView) b4.c.a(view, i10);
                                                                if (textView6 != null) {
                                                                    return new h0((NestedScrollView) view, progressBar, barrier, barrier2, textView, editText, editText2, editText3, editText4, editText5, editText6, viewA, textView2, textView3, textView4, textView5, textView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168826s1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159034a;
    }
}
