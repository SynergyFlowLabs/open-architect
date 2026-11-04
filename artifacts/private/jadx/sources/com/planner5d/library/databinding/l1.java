package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f159262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159266f;

    private l1(@NonNull FrameLayout frameLayout, @NonNull ProfileIconView profileIconView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView2) {
        this.f159261a = frameLayout;
        this.f159262b = profileIconView;
        this.f159263c = textView;
        this.f159264d = recyclerView;
        this.f159265e = preloaderBoxV2View;
        this.f159266f = textView2;
    }

    @NonNull
    public static l1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168266nm;
        ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
        if (profileIconView != null) {
            i10 = com.planner5d.library.f.j.f168290om;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.f168411tm;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = com.planner5d.library.f.j.f168555zm;
                    PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                    if (preloaderBoxV2View != null) {
                        i10 = com.planner5d.library.f.j.Am;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new l1((FrameLayout) view, profileIconView, textView, recyclerView, preloaderBoxV2View, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168673e2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159261a;
    }
}
