package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y5 extends androidx.databinding.e0 {

    @androidx.databinding.c
    protected View.OnLongClickListener A3;

    @androidx.databinding.c
    protected View.OnClickListener B3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageButton f159970l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159971m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ImageView f159972n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final ImageView f159973o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159974p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f159975q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159976r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    public final AppCompatToggleButton f159977s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    public final TextView f159978t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NonNull
    public final TextView f159979u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159980v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159981w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f159982x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f159983y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159984z3;

    protected y5(Object obj, View view, int i10, ImageButton imageButton, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, RoundedCornersLayout roundedCornersLayout, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout, AppCompatToggleButton appCompatToggleButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159970l3 = imageButton;
        this.f159971m3 = frameLayout;
        this.f159972n3 = imageView;
        this.f159973o3 = imageView2;
        this.f159974p3 = roundedCornersLayout;
        this.f159975q3 = circularProgressIndicator;
        this.f159976r3 = constraintLayout;
        this.f159977s3 = appCompatToggleButton;
        this.f159978t3 = textView;
        this.f159979u3 = textView2;
    }

    public static y5 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y5 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (y5) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168657c8);
    }

    @NonNull
    public static y5 p1(@NonNull LayoutInflater layoutInflater) {
        return s1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static y5 q1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return r1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static y5 r1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (y5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168657c8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static y5 s1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168657c8, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.p0 String str);

    @androidx.annotation.p0
    public View.OnClickListener i1() {
        return this.f159984z3;
    }

    @androidx.annotation.p0
    public View.OnLongClickListener j1() {
        return this.A3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> k1() {
        return this.f159981w3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> l1() {
        return this.f159980v3;
    }

    @androidx.annotation.p0
    public View.OnClickListener m1() {
        return this.B3;
    }

    @androidx.annotation.p0
    public String n1() {
        return this.f159983y3;
    }

    @androidx.annotation.p0
    public String o1() {
        return this.f159982x3;
    }

    public abstract void t1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void v1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener);

    public abstract void w1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void x1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void y1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void z1(@androidx.annotation.p0 String str);
}
