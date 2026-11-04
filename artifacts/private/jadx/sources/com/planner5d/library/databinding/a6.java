package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a6 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageButton f158709l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f158710m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f158711n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final AppCompatToggleButton f158712o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f158713p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final TextView f158714q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f158715r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f158716s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f158717t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f158718u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f158719v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnLongClickListener f158720w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f158721x3;

    protected a6(Object obj, View view, int i10, ImageButton imageButton, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, AppCompatToggleButton appCompatToggleButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f158709l3 = imageButton;
        this.f158710m3 = shapeableImageView;
        this.f158711n3 = constraintLayout;
        this.f158712o3 = appCompatToggleButton;
        this.f158713p3 = textView;
        this.f158714q3 = textView2;
    }

    public static a6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (a6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168668d8);
    }

    @NonNull
    public static a6 p1(@NonNull LayoutInflater layoutInflater) {
        return s1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static a6 q1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return r1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static a6 r1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (a6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168668d8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static a6 s1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (a6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168668d8, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.p0 String str);

    @androidx.annotation.p0
    public View.OnClickListener i1() {
        return this.f158719v3;
    }

    @androidx.annotation.p0
    public View.OnLongClickListener j1() {
        return this.f158720w3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> k1() {
        return this.f158716s3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> l1() {
        return this.f158715r3;
    }

    @androidx.annotation.p0
    public View.OnClickListener m1() {
        return this.f158721x3;
    }

    @androidx.annotation.p0
    public String n1() {
        return this.f158718u3;
    }

    @androidx.annotation.p0
    public String o1() {
        return this.f158717t3;
    }

    public abstract void t1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void v1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener);

    public abstract void w1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void x1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void y1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void z1(@androidx.annotation.p0 String str);
}
