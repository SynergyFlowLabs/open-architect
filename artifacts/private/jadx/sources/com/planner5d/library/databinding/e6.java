package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatToggleButton;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e6 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final ImageButton f158905l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f158906m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final AppCompatToggleButton f158907n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final Space f158908o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f158909p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final TextView f158910q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.databinding.c
    protected com.planner5d.library.activity.fragment.list.holders.c0.a f158911r3;

    protected e6(Object obj, View view, int i10, ImageButton imageButton, AppCompatImageView appCompatImageView, AppCompatToggleButton appCompatToggleButton, Space space, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f158905l3 = imageButton;
        this.f158906m3 = appCompatImageView;
        this.f158907n3 = appCompatToggleButton;
        this.f158908o3 = space;
        this.f158909p3 = textView;
        this.f158910q3 = textView2;
    }

    public static e6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static e6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (e6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168690f8);
    }

    @NonNull
    public static e6 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static e6 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static e6 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (e6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168690f8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static e6 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (e6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168690f8, null, false, obj);
    }

    @androidx.annotation.p0
    public com.planner5d.library.activity.fragment.list.holders.c0.a i1() {
        return this.f158911r3;
    }

    public abstract void n1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.list.holders.c0.a aVar);
}
