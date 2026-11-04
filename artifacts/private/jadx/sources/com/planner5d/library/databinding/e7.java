package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f158915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f158918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f158919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f158920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f158921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f158922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f158923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f158924m;

    private e7(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f158912a = constraintLayout;
        this.f158913b = constraintLayout2;
        this.f158914c = textView;
        this.f158915d = guideline;
        this.f158916e = textView2;
        this.f158917f = textView3;
        this.f158918g = textView4;
        this.f158919h = textView5;
        this.f158920i = textView6;
        this.f158921j = textView7;
        this.f158922k = textView8;
        this.f158923l = textView9;
        this.f158924m = textView10;
    }

    @NonNull
    public static e7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.L5;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.Tj;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Uj;
                Guideline guideline = (Guideline) b4.c.a(view, i10);
                if (guideline != null) {
                    i10 = com.planner5d.library.f.j.Vj;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.Wj;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.Xj;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.f.j.Yj;
                                TextView textView5 = (TextView) b4.c.a(view, i10);
                                if (textView5 != null) {
                                    i10 = com.planner5d.library.f.j.Zj;
                                    TextView textView6 = (TextView) b4.c.a(view, i10);
                                    if (textView6 != null) {
                                        i10 = com.planner5d.library.f.j.f167949ak;
                                        TextView textView7 = (TextView) b4.c.a(view, i10);
                                        if (textView7 != null) {
                                            i10 = com.planner5d.library.f.j.f167974bk;
                                            TextView textView8 = (TextView) b4.c.a(view, i10);
                                            if (textView8 != null) {
                                                i10 = com.planner5d.library.f.j.f168024dk;
                                                TextView textView9 = (TextView) b4.c.a(view, i10);
                                                if (textView9 != null) {
                                                    i10 = com.planner5d.library.f.j.f168048ek;
                                                    TextView textView10 = (TextView) b4.c.a(view, i10);
                                                    if (textView10 != null) {
                                                        return new e7((ConstraintLayout) view, constraintLayout, textView, guideline, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static e7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168907z8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158912a;
    }
}
