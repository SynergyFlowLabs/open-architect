package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l5 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageView f159298l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final TextView f159299m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final TextView f159300n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159301o3;

    protected l5(Object obj, View view, int i10, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159298l3 = imageView;
        this.f159299m3 = textView;
        this.f159300n3 = textView2;
    }

    public static l5 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static l5 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (l5) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.S7);
    }

    @NonNull
    public static l5 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static l5 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static l5 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (l5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.S7, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static l5 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (l5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.S7, null, false, obj);
    }

    @androidx.annotation.p0
    public View.OnClickListener i1() {
        return this.f159301o3;
    }

    public abstract void n1(@androidx.annotation.p0 View.OnClickListener onClickListener);
}
