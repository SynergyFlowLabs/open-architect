package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y6 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final TextView f159985l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @androidx.databinding.c
    protected com.planner5d.library.activity.fragment.list.l1.j f159986m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @androidx.databinding.c
    protected EnhancedRecyclerView.e f159987n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159988o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.databinding.c
    protected View.OnClickListener f159989p3;

    protected y6(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f159985l3 = textView;
    }

    public static y6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (y6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168822r8);
    }

    @NonNull
    public static y6 m1(@NonNull LayoutInflater layoutInflater) {
        return p1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static y6 n1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return o1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static y6 o1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (y6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168822r8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static y6 p1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168822r8, null, false, obj);
    }

    @androidx.annotation.p0
    public EnhancedRecyclerView.e i1() {
        return this.f159987n3;
    }

    @androidx.annotation.p0
    public View.OnClickListener j1() {
        return this.f159989p3;
    }

    @androidx.annotation.p0
    public View.OnClickListener k1() {
        return this.f159988o3;
    }

    @androidx.annotation.p0
    public com.planner5d.library.activity.fragment.list.l1.j l1() {
        return this.f159986m3;
    }

    public abstract void q1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar);

    public abstract void r1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void s1(@androidx.annotation.p0 View.OnClickListener onClickListener);

    public abstract void t1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.list.l1.j jVar);
}
