package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159834b;

    private w(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f159833a = frameLayout;
        this.f159834b = frameLayout2;
    }

    @NonNull
    public static w a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new w(frameLayout, frameLayout);
    }

    @NonNull
    public static w c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168672e1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159833a;
    }
}
