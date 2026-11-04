package com.planner5d.library.feed.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import com.planner5d.library.widget.preloader.PreloaderShimmerV2View;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CardView f179910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f179911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderShimmerV2View f179912c;

    private e(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull PreloaderShimmerV2View preloaderShimmerV2View) {
        this.f179910a = cardView;
        this.f179911b = cardView2;
        this.f179912c = preloaderShimmerV2View;
    }

    @NonNull
    public static e a(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i10 = com.planner5d.library.feed.view.c.i.L8;
        PreloaderShimmerV2View preloaderShimmerV2View = (PreloaderShimmerV2View) b4.c.a(view, i10);
        if (preloaderShimmerV2View != null) {
            return new e(cardView, cardView, preloaderShimmerV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.feed.view.c.l.f177948v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f179910a;
    }
}
