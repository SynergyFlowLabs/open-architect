package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final PreloaderCoverView f158737a;

    private b0(@NonNull PreloaderCoverView preloaderCoverView) {
        this.f158737a = preloaderCoverView;
    }

    @NonNull
    public static b0 a(@NonNull View view) {
        if (view != null) {
            return new b0((PreloaderCoverView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static b0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168760m1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PreloaderCoverView getRoot() {
        return this.f158737a;
    }
}
