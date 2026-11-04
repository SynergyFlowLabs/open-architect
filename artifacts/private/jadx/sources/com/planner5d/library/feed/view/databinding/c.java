package com.planner5d.library.feed.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.databinding.e0;
import androidx.databinding.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final CardView f179903l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final TextView f179904m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final TextView f179905n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.databinding.c
    protected com.planner5d.library.feed.view.holders.b f179906o3;

    protected c(Object obj, View view, int i10, CardView cardView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f179903l3 = cardView;
        this.f179904m3 = textView;
        this.f179905n3 = textView2;
    }

    public static c g1(@NonNull View view) {
        return h1(view, m.i());
    }

    @Deprecated
    public static c h1(@NonNull View view, @p0 Object obj) {
        return (c) e0.m(obj, view, com.planner5d.library.feed.view.c.l.f177944u2);
    }

    @NonNull
    public static c j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, m.i());
    }

    @NonNull
    public static c k1(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, m.i());
    }

    @NonNull
    @Deprecated
    public static c l1(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10, @p0 Object obj) {
        return (c) e0.X(layoutInflater, com.planner5d.library.feed.view.c.l.f177944u2, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static c m1(@NonNull LayoutInflater layoutInflater, @p0 Object obj) {
        return (c) e0.X(layoutInflater, com.planner5d.library.feed.view.c.l.f177944u2, null, false, obj);
    }

    @p0
    public com.planner5d.library.feed.view.holders.b i1() {
        return this.f179906o3;
    }

    public abstract void n1(@p0 com.planner5d.library.feed.view.holders.b bVar);
}
