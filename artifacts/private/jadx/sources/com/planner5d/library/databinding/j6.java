package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f159195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159197d;

    private j6(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f159194a = constraintLayout;
        this.f159195b = linearLayoutCompat;
        this.f159196c = recyclerView;
        this.f159197d = textView;
    }

    @NonNull
    public static j6 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Qk;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) b4.c.a(view, i10);
        if (linearLayoutCompat != null) {
            i10 = com.planner5d.library.f.j.Up;
            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
            if (recyclerView != null) {
                i10 = com.planner5d.library.f.j.tv;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new j6((ConstraintLayout) view, linearLayoutCompat, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j6 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j6 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168723i8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159194a;
    }
}
