package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.PinsIndicator;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbar;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbarItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final TextView f159922l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f159923m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159924n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final PinsIndicator f159925o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f159926p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final PreviewToolbar f159927q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    public final Button f159928r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159929s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159930t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159931u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NonNull
    public final TextView f159932v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @NonNull
    public final TextView f159933w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NonNull
    public final TextView f159934x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.databinding.c
    protected com.planner5d.library.activity.fragment.gallery.project.k f159935y3;

    protected y0(Object obj, View view, int i10, TextView textView, ProfileIconView profileIconView, PreviewToolbarItem previewToolbarItem, PinsIndicator pinsIndicator, TextView textView2, PreviewToolbar previewToolbar, Button button, RecyclerView recyclerView, PreviewToolbarItem previewToolbarItem2, PreviewToolbarItem previewToolbarItem3, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i10);
        this.f159922l3 = textView;
        this.f159923m3 = profileIconView;
        this.f159924n3 = previewToolbarItem;
        this.f159925o3 = pinsIndicator;
        this.f159926p3 = textView2;
        this.f159927q3 = previewToolbar;
        this.f159928r3 = button;
        this.f159929s3 = recyclerView;
        this.f159930t3 = previewToolbarItem2;
        this.f159931u3 = previewToolbarItem3;
        this.f159932v3 = textView3;
        this.f159933w3 = textView4;
        this.f159934x3 = textView5;
    }

    public static y0 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y0 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.Q1);
    }

    @NonNull
    public static y0 j1(@NonNull LayoutInflater layoutInflater) {
        return m1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static y0 k1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return l1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static y0 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Q1, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static y0 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Q1, null, false, obj);
    }

    @androidx.annotation.p0
    public com.planner5d.library.activity.fragment.gallery.project.k i1() {
        return this.f159935y3;
    }

    public abstract void n1(@androidx.annotation.p0 com.planner5d.library.activity.fragment.gallery.project.k kVar);
}
