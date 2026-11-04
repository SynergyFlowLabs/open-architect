package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159396c;

    private n3(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f159394a = view;
        this.f159395b = imageView;
        this.f159396c = imageView2;
    }

    @NonNull
    public static n3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168303pb;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.f168327qb;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                return new n3(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.P6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159394a;
    }
}
