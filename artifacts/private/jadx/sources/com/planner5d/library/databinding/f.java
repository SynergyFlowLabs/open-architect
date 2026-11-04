package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f158930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ListView f158931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f158932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f158933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158934f;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ListView listView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f158929a = constraintLayout;
        this.f158930b = imageView;
        this.f158931c = listView;
        this.f158932d = view;
        this.f158933e = frameLayout;
        this.f158934f = textView;
    }

    @NonNull
    public static f a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.Eb;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Gb;
            ListView listView = (ListView) b4.c.a(view, i10);
            if (listView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Hb))) != null) {
                i10 = com.planner5d.library.f.j.Ib;
                FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout != null) {
                    i10 = com.planner5d.library.f.j.Lb;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new f((ConstraintLayout) view, imageView, listView, viewA, frameLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168899z0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158929a;
    }
}
