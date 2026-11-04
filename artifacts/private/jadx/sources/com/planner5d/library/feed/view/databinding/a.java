package com.planner5d.library.feed.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.databinding.e0;
import androidx.databinding.m;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final TextView f179893l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f179894m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ImageView f179895n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final ImageView f179896o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final CardView f179897p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final TextView f179898q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.databinding.c
    protected jc.e f179899r3;

    protected a(Object obj, View view, int i10, TextView textView, ProfileIconView profileIconView, ImageView imageView, ImageView imageView2, CardView cardView, TextView textView2) {
        super(obj, view, i10);
        this.f179893l3 = textView;
        this.f179894m3 = profileIconView;
        this.f179895n3 = imageView;
        this.f179896o3 = imageView2;
        this.f179897p3 = cardView;
        this.f179898q3 = textView2;
    }

    public static a g1(@NonNull View view) {
        return h1(view, m.i());
    }

    @Deprecated
    public static a h1(@NonNull View view, @p0 Object obj) {
        return (a) e0.m(obj, view, com.planner5d.library.feed.view.c.l.f177940t2);
    }

    @NonNull
    public static a j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, m.i());
    }

    @NonNull
    public static a k1(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, m.i());
    }

    @NonNull
    @Deprecated
    public static a l1(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10, @p0 Object obj) {
        return (a) e0.X(layoutInflater, com.planner5d.library.feed.view.c.l.f177940t2, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static a m1(@NonNull LayoutInflater layoutInflater, @p0 Object obj) {
        return (a) e0.X(layoutInflater, com.planner5d.library.feed.view.c.l.f177940t2, null, false, obj);
    }

    @p0
    public jc.e i1() {
        return this.f179899r3;
    }

    public abstract void n1(@p0 jc.e eVar);
}
