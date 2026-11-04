package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.zoom.ZoomableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ZoomableImageView f159535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f159536c;

    private q0(@NonNull ConstraintLayout constraintLayout, @NonNull ZoomableImageView zoomableImageView, @NonNull PreloaderSimpleV2View preloaderSimpleV2View) {
        this.f159534a = constraintLayout;
        this.f159535b = zoomableImageView;
        this.f159536c = preloaderSimpleV2View;
    }

    @NonNull
    public static q0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168449vc;
        ZoomableImageView zoomableImageView = (ZoomableImageView) b4.c.a(view, i10);
        if (zoomableImageView != null) {
            i10 = com.planner5d.library.f.j.Gl;
            PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
            if (preloaderSimpleV2View != null) {
                return new q0((ConstraintLayout) view, zoomableImageView, preloaderSimpleV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.I1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159534a;
    }
}
