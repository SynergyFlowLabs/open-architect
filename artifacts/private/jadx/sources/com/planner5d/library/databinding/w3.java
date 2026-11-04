package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.planner5d.library.widget.preloader.PreloaderShimmerV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CardView f159849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f159850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderShimmerV2View f159851c;

    private w3(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull PreloaderShimmerV2View preloaderShimmerV2View) {
        this.f159849a = cardView;
        this.f159850b = cardView2;
        this.f159851c = preloaderShimmerV2View;
    }

    @NonNull
    public static w3 a(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i10 = com.planner5d.library.f.j.ds;
        PreloaderShimmerV2View preloaderShimmerV2View = (PreloaderShimmerV2View) b4.c.a(view, i10);
        if (preloaderShimmerV2View != null) {
            return new w3(cardView, cardView, preloaderShimmerV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.X6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f159849a;
    }
}
