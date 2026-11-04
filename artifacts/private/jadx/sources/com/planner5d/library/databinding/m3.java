package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159348d;

    private m3(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.f159345a = view;
        this.f159346b = frameLayout;
        this.f159347c = frameLayout2;
        this.f159348d = textView;
    }

    @NonNull
    public static m3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.H1;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = com.planner5d.library.f.j.Ic;
            FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout2 != null) {
                i10 = com.planner5d.library.f.j.Jc;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new m3(view, frameLayout, frameLayout2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.O6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159345a;
    }
}
