package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.TextViewWithLine;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f159999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextViewWithLine f160000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f160001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f160002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f160003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f160004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f160005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f160006n;

    private z(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull TextViewWithLine textViewWithLine, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f159993a = constraintLayout;
        this.f159994b = textView;
        this.f159995c = textView2;
        this.f159996d = textView3;
        this.f159997e = imageView;
        this.f159998f = textView4;
        this.f159999g = imageView2;
        this.f160000h = textViewWithLine;
        this.f160001i = textView5;
        this.f160002j = textView6;
        this.f160003k = textView7;
        this.f160004l = textView8;
        this.f160005m = textView9;
        this.f160006n = textView10;
    }

    @NonNull
    public static z a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168391t2;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f168415u2;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.B2;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = com.planner5d.library.f.j.C2;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.f.j.J2;
                        TextView textView4 = (TextView) b4.c.a(view, i10);
                        if (textView4 != null) {
                            i10 = com.planner5d.library.f.j.K2;
                            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                            if (imageView2 != null) {
                                i10 = com.planner5d.library.f.j.L2;
                                TextViewWithLine textViewWithLine = (TextViewWithLine) b4.c.a(view, i10);
                                if (textViewWithLine != null) {
                                    i10 = com.planner5d.library.f.j.T2;
                                    TextView textView5 = (TextView) b4.c.a(view, i10);
                                    if (textView5 != null) {
                                        i10 = com.planner5d.library.f.j.U2;
                                        TextView textView6 = (TextView) b4.c.a(view, i10);
                                        if (textView6 != null) {
                                            i10 = com.planner5d.library.f.j.V2;
                                            TextView textView7 = (TextView) b4.c.a(view, i10);
                                            if (textView7 != null) {
                                                i10 = com.planner5d.library.f.j.W2;
                                                TextView textView8 = (TextView) b4.c.a(view, i10);
                                                if (textView8 != null) {
                                                    i10 = com.planner5d.library.f.j.f167957b3;
                                                    TextView textView9 = (TextView) b4.c.a(view, i10);
                                                    if (textView9 != null) {
                                                        i10 = com.planner5d.library.f.j.C3;
                                                        TextView textView10 = (TextView) b4.c.a(view, i10);
                                                        if (textView10 != null) {
                                                            return new z((ConstraintLayout) view, textView, textView2, textView3, imageView, textView4, imageView2, textViewWithLine, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static z c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static z d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168738k1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159993a;
    }
}
