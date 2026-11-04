package com.planner5d.library.feed.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f179913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f179914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f179915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f179916d;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f179913a = constraintLayout;
        this.f179914b = linearLayoutCompat;
        this.f179915c = recyclerView;
        this.f179916d = textView;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = com.planner5d.library.feed.view.c.i.f177574i7;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) b4.c.a(view, i10);
        if (linearLayoutCompat != null) {
            i10 = com.planner5d.library.feed.view.c.i.U7;
            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
            if (recyclerView != null) {
                i10 = com.planner5d.library.feed.view.c.i.f177629ma;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new f((ConstraintLayout) view, linearLayoutCompat, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.feed.view.c.l.f177952w2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f179913a;
    }
}
