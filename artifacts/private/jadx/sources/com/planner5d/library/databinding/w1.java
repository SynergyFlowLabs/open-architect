package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f159841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f159846f;

    private w1(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull SwitchMaterial switchMaterial, @NonNull SwitchMaterial switchMaterial2, @NonNull SwitchMaterial switchMaterial3, @NonNull SwitchMaterial switchMaterial4) {
        this.f159841a = nestedScrollView;
        this.f159842b = textView;
        this.f159843c = switchMaterial;
        this.f159844d = switchMaterial2;
        this.f159845e = switchMaterial3;
        this.f159846f = switchMaterial4;
    }

    @NonNull
    public static w1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.xn;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Tn;
            SwitchMaterial switchMaterial = (SwitchMaterial) b4.c.a(view, i10);
            if (switchMaterial != null) {
                i10 = com.planner5d.library.f.j.Yn;
                SwitchMaterial switchMaterial2 = (SwitchMaterial) b4.c.a(view, i10);
                if (switchMaterial2 != null) {
                    i10 = com.planner5d.library.f.j.co;
                    SwitchMaterial switchMaterial3 = (SwitchMaterial) b4.c.a(view, i10);
                    if (switchMaterial3 != null) {
                        i10 = com.planner5d.library.f.j.jo;
                        SwitchMaterial switchMaterial4 = (SwitchMaterial) b4.c.a(view, i10);
                        if (switchMaterial4 != null) {
                            return new w1((NestedScrollView) view, textView, switchMaterial, switchMaterial2, switchMaterial3, switchMaterial4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168794p2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f159841a;
    }
}
