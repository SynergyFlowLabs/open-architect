package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v5 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final CardView f159818l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ImageView f159819m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159820n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final TextView f159821o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f159822p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @androidx.databinding.c
    protected EnhancedRecyclerView.e f159823q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159824r3;

    protected v5(Object obj, View view, int i10, CardView cardView, ImageView imageView, ButtonTextView buttonTextView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f159818l3 = cardView;
        this.f159819m3 = imageView;
        this.f159820n3 = buttonTextView;
        this.f159821o3 = textView;
        this.f159822p3 = textView2;
    }

    public static v5 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static v5 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (v5) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.f168635a8);
    }

    @NonNull
    public static v5 k1(@NonNull LayoutInflater layoutInflater) {
        return n1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static v5 l1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return m1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static v5 m1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (v5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168635a8, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static v5 n1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (v5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.f168635a8, null, false, obj);
    }

    @androidx.annotation.p0
    public EnhancedRecyclerView.e i1() {
        return this.f159823q3;
    }

    @androidx.annotation.p0
    public Boolean j1() {
        return this.f159824r3;
    }

    public abstract void o1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar);

    public abstract void p1(@androidx.annotation.p0 Boolean bool);
}
