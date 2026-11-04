package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159190a;

    private j4(@NonNull View view) {
        this.f159190a = view;
    }

    @NonNull
    public static j4 a(@NonNull View view) {
        if (view != null) {
            return new j4(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static j4 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168711h7, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159190a;
    }
}
