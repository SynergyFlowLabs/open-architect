package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u3 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final CardView f159756l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final TextView f159757m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final TextView f159758n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.databinding.c
    protected jc.a f159759o3;

    protected u3(Object obj, View view, int i10, CardView cardView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159756l3 = cardView;
        this.f159757m3 = textView;
        this.f159758n3 = textView2;
    }

    public static u3 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static u3 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (u3) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.W6);
    }

    @NonNull
    public static u3 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static u3 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static u3 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (u3) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.W6, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static u3 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (u3) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.W6, null, false, obj);
    }

    @androidx.annotation.p0
    public jc.a i1() {
        return this.f159759o3;
    }

    public abstract void n1(@androidx.annotation.p0 jc.a aVar);
}
