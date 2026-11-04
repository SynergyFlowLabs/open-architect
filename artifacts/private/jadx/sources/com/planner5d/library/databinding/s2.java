package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class s2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159635f;

    private s2(@NonNull View view, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f159630a = view;
        this.f159631b = textView;
        this.f159632c = constraintLayout;
        this.f159633d = imageView;
        this.f159634e = imageView2;
        this.f159635f = textView2;
    }

    @NonNull
    public static s2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Uk;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Vk;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = com.planner5d.library.f.j.Wk;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.Xk;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = com.planner5d.library.f.j.Yk;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new s2(view, textView, constraintLayout, imageView, imageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s2 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.S2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159630a;
    }
}
