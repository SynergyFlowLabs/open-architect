package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f159797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f159798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f159799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f159800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f159801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f159802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159808m;

    private v1(@NonNull NestedScrollView nestedScrollView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull SwitchMaterial switchMaterial, @NonNull SwitchMaterial switchMaterial2, @NonNull SwitchMaterial switchMaterial3, @NonNull SwitchMaterial switchMaterial4, @NonNull SwitchMaterial switchMaterial5, @NonNull SwitchMaterial switchMaterial6) {
        this.f159796a = nestedScrollView;
        this.f159797b = view;
        this.f159798c = view2;
        this.f159799d = view3;
        this.f159800e = view4;
        this.f159801f = view5;
        this.f159802g = view6;
        this.f159803h = switchMaterial;
        this.f159804i = switchMaterial2;
        this.f159805j = switchMaterial3;
        this.f159806k = switchMaterial4;
        this.f159807l = switchMaterial5;
        this.f159808m = switchMaterial6;
    }

    @NonNull
    public static v1 a(@NonNull View view) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        View viewA5;
        int i10 = com.planner5d.library.f.j.f168495xa;
        View viewA6 = b4.c.a(view, i10);
        if (viewA6 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168519ya))) != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168543za))) != null && (viewA3 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Aa))) != null && (viewA4 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Ba))) != null && (viewA5 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Ca))) != null) {
            i10 = com.planner5d.library.f.j.Ln;
            SwitchMaterial switchMaterial = (SwitchMaterial) b4.c.a(view, i10);
            if (switchMaterial != null) {
                i10 = com.planner5d.library.f.j.Rn;
                SwitchMaterial switchMaterial2 = (SwitchMaterial) b4.c.a(view, i10);
                if (switchMaterial2 != null) {
                    i10 = com.planner5d.library.f.j.Un;
                    SwitchMaterial switchMaterial3 = (SwitchMaterial) b4.c.a(view, i10);
                    if (switchMaterial3 != null) {
                        i10 = com.planner5d.library.f.j.ao;
                        SwitchMaterial switchMaterial4 = (SwitchMaterial) b4.c.a(view, i10);
                        if (switchMaterial4 != null) {
                            i10 = com.planner5d.library.f.j.bo;
                            SwitchMaterial switchMaterial5 = (SwitchMaterial) b4.c.a(view, i10);
                            if (switchMaterial5 != null) {
                                i10 = com.planner5d.library.f.j.lo;
                                SwitchMaterial switchMaterial6 = (SwitchMaterial) b4.c.a(view, i10);
                                if (switchMaterial6 != null) {
                                    return new v1((NestedScrollView) view, viewA6, viewA, viewA2, viewA3, viewA4, viewA5, switchMaterial, switchMaterial2, switchMaterial3, switchMaterial4, switchMaterial5, switchMaterial6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static v1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static v1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168783o2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159796a;
    }
}
