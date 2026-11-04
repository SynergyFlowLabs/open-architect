package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159499d;

    private p3(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.f159496a = view;
        this.f159497b = linearLayout;
        this.f159498c = imageView;
        this.f159499d = linearLayout2;
    }

    @NonNull
    public static p3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.I1;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.f168152j4;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Mb;
                LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                if (linearLayout2 != null) {
                    return new p3(view, linearLayout, imageView, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.R6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159496a;
    }
}
