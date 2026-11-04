package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f158962a;

    private f3(@NonNull LinearLayout linearLayout) {
        this.f158962a = linearLayout;
    }

    @NonNull
    public static f3 a(@NonNull View view) {
        if (view != null) {
            return new f3((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static f3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168710h6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f158962a;
    }
}
