package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class b7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f158761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f158764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f158765g;

    private b7(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PreloaderCoverView preloaderCoverView, @NonNull RecyclerView recyclerView) {
        this.f158759a = view;
        this.f158760b = linearLayout;
        this.f158761c = imageView;
        this.f158762d = textView;
        this.f158763e = textView2;
        this.f158764f = preloaderCoverView;
        this.f158765g = recyclerView;
    }

    @NonNull
    public static b7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168454vh;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.f168478wh;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.f168502xh;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168526yh;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.f168550zh;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.f.j.Ah;
                            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                            if (recyclerView != null) {
                                return new b7(view, linearLayout, imageView, textView, textView2, preloaderCoverView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168844t8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158759a;
    }
}
