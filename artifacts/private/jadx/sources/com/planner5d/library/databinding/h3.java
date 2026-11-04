package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159077c;

    private h3(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f159075a = view;
        this.f159076b = recyclerView;
        this.f159077c = textView;
    }

    @NonNull
    public static h3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.tv;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new h3(view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168732j6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159075a;
    }
}
