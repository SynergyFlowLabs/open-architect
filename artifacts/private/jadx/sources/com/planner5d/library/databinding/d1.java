package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.TabLayout;
import com.planner5d.library.widget.ViewPagerCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f158835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPagerCompat f158836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TabLayout f158837c;

    private d1(@NonNull LinearLayout linearLayout, @NonNull ViewPagerCompat viewPagerCompat, @NonNull TabLayout tabLayout) {
        this.f158835a = linearLayout;
        this.f158836b = viewPagerCompat;
        this.f158837c = tabLayout;
    }

    @NonNull
    public static d1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Bf;
        ViewPagerCompat viewPagerCompat = (ViewPagerCompat) b4.c.a(view, i10);
        if (viewPagerCompat != null) {
            i10 = com.planner5d.library.f.j.Df;
            TabLayout tabLayout = (TabLayout) b4.c.a(view, i10);
            if (tabLayout != null) {
                return new d1((LinearLayout) view, viewPagerCompat, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.U1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f158835a;
    }
}
