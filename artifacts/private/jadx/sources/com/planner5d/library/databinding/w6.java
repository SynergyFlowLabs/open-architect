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
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w6 extends androidx.databinding.e0 {

    @androidx.databinding.c
    protected View.OnLongClickListener A3;

    @androidx.databinding.c
    protected View.OnClickListener B3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageView f159862l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final View f159863m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ImageButton f159864n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f159865o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159866p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final AppCompatToggleButton f159867q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    public final TextView f159868r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    public final TextView f159869s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159870t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159871u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159872v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.databinding.c
    protected androidx.lifecycle.w0<Boolean> f159873w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f159874x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.databinding.c
    protected String f159875y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159876z3;

    protected w6(Object obj, View view, int i10, ImageView imageView, View view2, ImageButton imageButton, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, AppCompatToggleButton appCompatToggleButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159862l3 = imageView;
        this.f159863m3 = view2;
        this.f159864n3 = imageButton;
        this.f159865o3 = shapeableImageView;
        this.f159866p3 = constraintLayout;
        this.f159867q3 = appCompatToggleButton;
        this.f159868r3 = textView;
        this.f159869s3 = textView2;
    }

    public static w6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static w6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (w6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168811q8);
    }

    @NonNull
    public static w6 r1(@NonNull LayoutInflater layoutInflater) {
        return v1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static w6 s1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return t1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static w6 t1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (w6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168811q8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static w6 v1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (w6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168811q8, null, false, obj);
    }

    public abstract void A1(@androidx.annotation.p0 Boolean bool);

    public abstract void B1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void C1(@androidx.annotation.p0 View.OnLongClickListener onLongClickListener);

    public abstract void D1(@androidx.annotation.p0 String str);

    public abstract void E1(@androidx.annotation.p0 String str);

    @androidx.annotation.p0
    public Boolean i1() {
        return this.f159871u3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> j1() {
        return this.f159873w3;
    }

    @androidx.annotation.p0
    public androidx.lifecycle.w0<Boolean> k1() {
        return this.f159872v3;
    }

    @androidx.annotation.p0
    public View.OnClickListener l1() {
        return this.B3;
    }

    @androidx.annotation.p0
    public Boolean m1() {
        return this.f159870t3;
    }

    @androidx.annotation.p0
    public View.OnClickListener n1() {
        return this.f159876z3;
    }

    @androidx.annotation.p0
    public View.OnLongClickListener o1() {
        return this.A3;
    }

    @androidx.annotation.p0
    public String p1() {
        return this.f159875y3;
    }

    @androidx.annotation.p0
    public String q1() {
        return this.f159874x3;
    }

    public abstract void w1(@androidx.annotation.p0 Boolean bool);

    public abstract void x1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void y1(@androidx.annotation.p0 androidx.lifecycle.w0<Boolean> w0Var);

    public abstract void z1(@androidx.annotation.p0 View.OnClickListener onClickListener);
}
