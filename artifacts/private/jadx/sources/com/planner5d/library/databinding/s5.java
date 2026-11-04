package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s5 extends androidx.databinding.e0 {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NonNull
    public final CardView f159646l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    public final ImageView f159647m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    public final TextView f159648n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    public final ImageView f159649o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    public final TextView f159650p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159651q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.databinding.c
    protected com.planner5d.library.model.manager.n1 f159652r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.databinding.c
    protected Contest f159653s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.databinding.c
    protected EnhancedRecyclerView.e f159654t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.databinding.c
    protected Boolean f159655u3;

    protected s5(Object obj, View view, int i10, CardView cardView, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ButtonTextView buttonTextView) {
        super(obj, view, i10);
        this.f159646l3 = cardView;
        this.f159647m3 = imageView;
        this.f159648n3 = textView;
        this.f159649o3 = imageView2;
        this.f159650p3 = textView2;
        this.f159651q3 = buttonTextView;
    }

    public static s5 g1(@NonNull View view) {
        return h1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static s5 h1(@NonNull View view, @androidx.annotation.p0 Object obj) {
        return (s5) androidx.databinding.e0.m(obj, view, com.planner5d.library.f.m.Y7);
    }

    @NonNull
    public static s5 m1(@NonNull LayoutInflater layoutInflater) {
        return p1(layoutInflater, androidx.databinding.m.i());
    }

    @NonNull
    public static s5 n1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        return o1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @NonNull
    @Deprecated
    public static s5 o1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10, @androidx.annotation.p0 Object obj) {
        return (s5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Y7, viewGroup, z10, obj);
    }

    @NonNull
    @Deprecated
    public static s5 p1(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (s5) androidx.databinding.e0.X(layoutInflater, com.planner5d.library.f.m.Y7, null, false, obj);
    }

    @androidx.annotation.p0
    public EnhancedRecyclerView.e i1() {
        return this.f159654t3;
    }

    @androidx.annotation.p0
    public Contest j1() {
        return this.f159653s3;
    }

    @androidx.annotation.p0
    public com.planner5d.library.model.manager.n1 k1() {
        return this.f159652r3;
    }

    @androidx.annotation.p0
    public Boolean l1() {
        return this.f159655u3;
    }

    public abstract void q1(@androidx.annotation.p0 EnhancedRecyclerView.e eVar);

    public abstract void r1(@androidx.annotation.p0 Contest contest);

    public abstract void s1(@androidx.annotation.p0 com.planner5d.library.model.manager.n1 n1Var);

    public abstract void t1(@androidx.annotation.p0 Boolean bool);
}
