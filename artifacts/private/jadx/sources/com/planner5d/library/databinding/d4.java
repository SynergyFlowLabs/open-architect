package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.database.model.project.Project;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d4 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final View f158845l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ImageView f158846m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final CardView f158847n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.databinding.c
    protected Project f158848o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f158849p3;

    protected d4(Object obj, View view, int i10, View view2, ImageView imageView, CardView cardView) {
        super(obj, view, i10);
        this.f158845l3 = view2;
        this.f158846m3 = imageView;
        this.f158847n3 = cardView;
    }

    public static d4 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static d4 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (d4) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168656c7);
    }

    @NonNull
    public static d4 k1(@NonNull LayoutInflater layoutInflater) {
        return n1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static d4 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return m1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static d4 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (d4) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168656c7, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static d4 n1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (d4) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168656c7, null, false, obj);
    }

    @androidx.annotation.p0
    public Boolean i1() {
        return this.f158849p3;
    }

    @androidx.annotation.p0
    public Project j1() {
        return this.f158848o3;
    }

    public abstract void o1(@androidx.annotation.p0 Boolean bool);

    public abstract void p1(@androidx.annotation.p0 Project project);
}
