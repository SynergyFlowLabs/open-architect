package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o6 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final View f159460l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final CardView f159461m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final TextView f159462n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final TextView f159463o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f159464p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159465q3;

    protected o6(Object obj, View view, int i10, View view2, CardView cardView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f159460l3 = view2;
        this.f159461m3 = cardView;
        this.f159462n3 = textView;
        this.f159463o3 = textView2;
        this.f159464p3 = textView3;
    }

    public static o6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static o6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (o6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168756l8);
    }

    @NonNull
    public static o6 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static o6 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static o6 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (o6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168756l8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static o6 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (o6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168756l8, null, false, obj);
    }

    @androidx.annotation.p0
    public View.OnClickListener i1() {
        return this.f159465q3;
    }

    public abstract void n1(@androidx.annotation.p0 View.OnClickListener onClickListener);
}
