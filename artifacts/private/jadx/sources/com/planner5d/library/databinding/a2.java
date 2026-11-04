package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f158685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f158686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f158689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f158691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f158692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final b2 f158693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f158694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f158695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f158696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f158697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f158698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f158699o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f158700s;

    private a2(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull b2 b2Var, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView11) {
        this.f158685a = nestedScrollView;
        this.f158686b = textView;
        this.f158687c = textView2;
        this.f158688d = textView3;
        this.f158689e = shapeableImageView;
        this.f158690f = textView4;
        this.f158691g = textView5;
        this.f158692h = textView6;
        this.f158693i = b2Var;
        this.f158694j = textView7;
        this.f158695k = textView8;
        this.f158696l = textView9;
        this.f158697m = textView10;
        this.f158698n = textInputEditTextCompat;
        this.f158699o = textInputLayout;
        this.f158700s = textView11;
    }

    @NonNull
    public static a2 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.hn;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.kn;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.nn;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = com.planner5d.library.f.j.on;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
                    if (shapeableImageView != null) {
                        i10 = com.planner5d.library.f.j.rn;
                        TextView textView4 = (TextView) b4.c.a(view, i10);
                        if (textView4 != null) {
                            i10 = com.planner5d.library.f.j.tn;
                            TextView textView5 = (TextView) b4.c.a(view, i10);
                            if (textView5 != null) {
                                i10 = com.planner5d.library.f.j.vn;
                                TextView textView6 = (TextView) b4.c.a(view, i10);
                                if (textView6 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.In))) != null) {
                                    b2 b2VarA = b2.a(viewA);
                                    i10 = com.planner5d.library.f.j.Nn;
                                    TextView textView7 = (TextView) b4.c.a(view, i10);
                                    if (textView7 != null) {
                                        i10 = com.planner5d.library.f.j.On;
                                        TextView textView8 = (TextView) b4.c.a(view, i10);
                                        if (textView8 != null) {
                                            i10 = com.planner5d.library.f.j.Pn;
                                            TextView textView9 = (TextView) b4.c.a(view, i10);
                                            if (textView9 != null) {
                                                i10 = com.planner5d.library.f.j.Qn;
                                                TextView textView10 = (TextView) b4.c.a(view, i10);
                                                if (textView10 != null) {
                                                    i10 = com.planner5d.library.f.j.go;
                                                    TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                                                    if (textInputEditTextCompat != null) {
                                                        i10 = com.planner5d.library.f.j.ho;
                                                        TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                                                        if (textInputLayout != null) {
                                                            i10 = com.planner5d.library.f.j.f168146io;
                                                            TextView textView11 = (TextView) b4.c.a(view, i10);
                                                            if (textView11 != null) {
                                                                return new a2((NestedScrollView) view, textView, textView2, textView3, shapeableImageView, textView4, textView5, textView6, b2VarA, textView7, textView8, textView9, textView10, textInputEditTextCompat, textInputLayout, textView11);
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
    public static a2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168838t2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f158685a;
    }
}
