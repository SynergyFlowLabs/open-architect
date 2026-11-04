package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f159099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f159104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159105g;

    private i0(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull TextView textView4) {
        this.f159099a = scrollView;
        this.f159100b = textView;
        this.f159101c = textView2;
        this.f159102d = recyclerView;
        this.f159103e = textView3;
        this.f159104f = imageView;
        this.f159105g = textView4;
    }

    @NonNull
    public static i0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.P1;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f167957b3;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.f167982c3;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = com.planner5d.library.f.j.f168079g3;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.f.j.Ad;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = com.planner5d.library.f.j.tv;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                return new i0((ScrollView) view, textView, textView2, recyclerView, textView3, imageView, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168837t1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f159099a;
    }
}
