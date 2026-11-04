package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final s1 f159736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final t1 f159738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final v1 f159740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final w1 f159741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final x1 f159742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final y1 f159743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f159744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f159745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final z1 f159746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final a2 f159747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f159749o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ViewFlipper f159750s;

    private u1(@NonNull ConstraintLayout constraintLayout, @NonNull s1 s1Var, @NonNull ImageView imageView, @NonNull t1 t1Var, @NonNull ImageView imageView2, @NonNull v1 v1Var, @NonNull w1 w1Var, @NonNull x1 x1Var, @NonNull y1 y1Var, @NonNull View view, @NonNull View view2, @NonNull z1 z1Var, @NonNull a2 a2Var, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView, @NonNull ViewFlipper viewFlipper) {
        this.f159735a = constraintLayout;
        this.f159736b = s1Var;
        this.f159737c = imageView;
        this.f159738d = t1Var;
        this.f159739e = imageView2;
        this.f159740f = v1Var;
        this.f159741g = w1Var;
        this.f159742h = x1Var;
        this.f159743i = y1Var;
        this.f159744j = view;
        this.f159745k = view2;
        this.f159746l = z1Var;
        this.f159747m = a2Var;
        this.f159748n = preloaderBoxV2View;
        this.f159749o = textView;
        this.f159750s = viewFlipper;
    }

    @NonNull
    public static u1 a(@NonNull View view) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        int i10 = com.planner5d.library.f.j.gn;
        View viewA5 = b4.c.a(view, i10);
        if (viewA5 != null) {
            s1 s1VarA = s1.a(viewA5);
            i10 = com.planner5d.library.f.j.ln;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.mn))) != null) {
                t1 t1VarA = t1.a(viewA);
                i10 = com.planner5d.library.f.j.pn;
                ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                if (imageView2 != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.qn))) != null) {
                    v1 v1VarA = v1.a(viewA2);
                    i10 = com.planner5d.library.f.j.sn;
                    View viewA6 = b4.c.a(view, i10);
                    if (viewA6 != null) {
                        w1 w1VarA = w1.a(viewA6);
                        i10 = com.planner5d.library.f.j.un;
                        View viewA7 = b4.c.a(view, i10);
                        if (viewA7 != null) {
                            x1 x1VarA = x1.a(viewA7);
                            i10 = com.planner5d.library.f.j.wn;
                            View viewA8 = b4.c.a(view, i10);
                            if (viewA8 != null) {
                                y1 y1VarA = y1.a(viewA8);
                                i10 = com.planner5d.library.f.j.En;
                                View viewA9 = b4.c.a(view, i10);
                                if (viewA9 != null && (viewA3 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Fn))) != null && (viewA4 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Gn))) != null) {
                                    z1 z1VarA = z1.a(viewA4);
                                    i10 = com.planner5d.library.f.j.Mn;
                                    View viewA10 = b4.c.a(view, i10);
                                    if (viewA10 != null) {
                                        a2 a2VarA = a2.a(viewA10);
                                        i10 = com.planner5d.library.f.j.Vn;
                                        PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                                        if (preloaderBoxV2View != null) {
                                            i10 = com.planner5d.library.f.j.fo;
                                            TextView textView = (TextView) b4.c.a(view, i10);
                                            if (textView != null) {
                                                i10 = com.planner5d.library.f.j.ko;
                                                ViewFlipper viewFlipper = (ViewFlipper) b4.c.a(view, i10);
                                                if (viewFlipper != null) {
                                                    return new u1((ConstraintLayout) view, s1VarA, imageView, t1VarA, imageView2, v1VarA, w1VarA, x1VarA, y1VarA, viewA9, viewA3, z1VarA, a2VarA, preloaderBoxV2View, textView, viewFlipper);
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
    public static u1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static u1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168750l2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159735a;
    }
}
