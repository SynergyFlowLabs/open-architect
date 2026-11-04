package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j5 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final CardView f159191l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final TextView f159192m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159193n3;

    protected j5(Object obj, View view, int i10, CardView cardView, TextView textView) {
        super(obj, view, i10);
        this.f159191l3 = cardView;
        this.f159192m3 = textView;
    }

    public static j5 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static j5 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (j5) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.R7);
    }

    @NonNull
    public static j5 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static j5 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static j5 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (j5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.R7, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static j5 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (j5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.R7, null, false, obj);
    }

    @androidx.annotation.p0
    public View.OnClickListener i1() {
        return this.f159193n3;
    }

    public abstract void n1(@androidx.annotation.p0 View.OnClickListener onClickListener);
}
