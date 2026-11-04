package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class y7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f159992c;

    private y7(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull PreloaderCoverView preloaderCoverView) {
        this.f159990a = view;
        this.f159991b = recyclerView;
        this.f159992c = preloaderCoverView;
    }

    @NonNull
    public static y7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.f168217ll;
            PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
            if (preloaderCoverView != null) {
                return new y7(view, recyclerView, preloaderCoverView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static y7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168669d9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159990a;
    }
}
