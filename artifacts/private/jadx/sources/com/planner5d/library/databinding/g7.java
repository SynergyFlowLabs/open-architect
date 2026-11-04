package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159021a;

    private g7(@NonNull View view) {
        this.f159021a = view;
    }

    @NonNull
    public static g7 a(@NonNull View view) {
        if (view != null) {
            return new g7(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static g7 b(@NonNull LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    @NonNull
    public static g7 c(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.B8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159021a;
    }
}
