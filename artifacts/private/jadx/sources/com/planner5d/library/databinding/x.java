package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ListView f159881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159882c;

    private x(@NonNull FrameLayout frameLayout, @NonNull ListView listView, @NonNull TextView textView) {
        this.f159880a = frameLayout;
        this.f159881b = listView;
        this.f159882c = textView;
    }

    @NonNull
    public static x a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168332qg;
        ListView listView = (ListView) b4.c.a(view, i10);
        if (listView != null) {
            i10 = com.planner5d.library.f.j.Hh;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new x((FrameLayout) view, listView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static x d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168683f1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159880a;
    }
}
