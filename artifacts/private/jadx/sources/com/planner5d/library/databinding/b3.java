package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f158747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f158748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f158750e;

    private b3(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull View view2) {
        this.f158746a = view;
        this.f158747b = imageView;
        this.f158748c = imageView2;
        this.f158749d = textView;
        this.f158750e = view2;
    }

    @NonNull
    public static b3 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.Z5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.f167935a6;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = com.planner5d.library.f.j.f167960b6;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f167985c6))) != null) {
                    return new b3(view, imageView, imageView2, textView, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168666d6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158746a;
    }
}
