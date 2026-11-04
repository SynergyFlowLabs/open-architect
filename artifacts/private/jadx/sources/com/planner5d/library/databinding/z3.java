package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z3 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageView f160014l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ImageView f160015m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final CardView f160016n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final TextView f160017o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.databinding.c
    protected jc.a f160018p3;

    protected z3(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CardView cardView, TextView textView) {
        super(obj, view, i10);
        this.f160014l3 = imageView;
        this.f160015m3 = imageView2;
        this.f160016n3 = cardView;
        this.f160017o3 = textView;
    }

    public static z3 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static z3 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.Z6);
    }

    @NonNull
    public static z3 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static z3 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static z3 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Z6, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static z3 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Z6, null, false, obj);
    }

    @androidx.annotation.p0
    public jc.a i1() {
        return this.f160018p3;
    }

    public abstract void n1(@androidx.annotation.p0 jc.a aVar);
}
