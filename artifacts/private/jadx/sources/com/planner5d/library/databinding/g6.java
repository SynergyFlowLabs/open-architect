package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.spaces.view.DocumentStatusView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g6 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final DocumentStatusView f159020l3;

    protected g6(Object obj, View view, int i10, DocumentStatusView documentStatusView) {
        super(obj, view, i10);
        this.f159020l3 = documentStatusView;
    }

    public static g6 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static g6 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (g6) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168701g8);
    }

    @NonNull
    public static g6 i1(@NonNull LayoutInflater layoutInflater) {
        return l1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static g6 j1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return k1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static g6 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (g6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168701g8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static g6 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (g6) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168701g8, null, false, obj);
    }
}
