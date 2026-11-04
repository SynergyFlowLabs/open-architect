package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u6 extends androidx.databinding.e0 {

    @androidx.databinding.c
    protected String A3;

    @androidx.databinding.c
    protected String B3;

    @androidx.databinding.c
    protected View.OnClickListener C3;

    @androidx.databinding.c
    protected View.OnLongClickListener D3;

    @androidx.databinding.c
    protected View.OnClickListener E3;

    @androidx.databinding.c
    protected Boolean F3;

    @androidx.databinding.c
    protected Boolean G3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159764l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final View f159765m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ImageButton f159766n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final s6 f159767o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final ImageView f159768p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159769q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    public final t6 f159770r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159771s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    public final AppCompatToggleButton f159772t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NonNull
    public final TextView f159773u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NonNull
    public final TextView f159774v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159775w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159776x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159777y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159778z3;

    protected u6(Object obj, View view, int i10, ButtonTextView buttonTextView, View view2, ImageButton imageButton, s6 s6Var, ImageView imageView, RoundedCornersLayout roundedCornersLayout, t6 t6Var, ConstraintLayout constraintLayout, AppCompatToggleButton appCompatToggleButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159764l3 = buttonTextView;
        this.f159765m3 = view2;
        this.f159766n3 = imageButton;
        this.f159767o3 = s6Var;
        this.f159768p3 = imageView;
        this.f159769q3 = roundedCornersLayout;
        this.f159770r3 = t6Var;
        this.f159771s3 = constraintLayout;
        this.f159772t3 = appCompatToggleButton;
        this.f159773u3 = textView;
        this.f159774v3 = textView2;
    }

    public static u6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static u6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (u6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168800p8);
    }

    @NonNull
    public static u6 t1(@NonNull LayoutInflater layoutInflater) {
        return x1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static u6 v1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return w1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static u6 w1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (u6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168800p8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static u6 x1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (u6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168800p8, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.p0 Boolean bool);

    public abstract void B1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void C1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void D1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void E1(@androidx.annotation.p0 Boolean bool);

    public abstract void F1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void G1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener);

    public abstract void H1(@androidx.annotation.p0 String str);

    public abstract void I1(@androidx.annotation.p0 String str);

    @androidx.annotation.p0
    public Boolean i1() {
        return this.G3;
    }

    @androidx.annotation.p0
    public Boolean j1() {
        return this.F3;
    }

    @androidx.annotation.p0
    public Boolean k1() {
        return this.f159776x3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> l1() {
        return this.f159778z3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> m1() {
        return this.f159777y3;
    }

    @androidx.annotation.p0
    public View.OnClickListener n1() {
        return this.E3;
    }

    @androidx.annotation.p0
    public Boolean o1() {
        return this.f159775w3;
    }

    @androidx.annotation.p0
    public View.OnClickListener p1() {
        return this.C3;
    }

    @androidx.annotation.p0
    public View.OnLongClickListener q1() {
        return this.D3;
    }

    @androidx.annotation.p0
    public String r1() {
        return this.B3;
    }

    @androidx.annotation.p0
    public String s1() {
        return this.A3;
    }

    public abstract void y1(@androidx.annotation.p0 Boolean bool);

    public abstract void z1(@androidx.annotation.p0 Boolean bool);
}
