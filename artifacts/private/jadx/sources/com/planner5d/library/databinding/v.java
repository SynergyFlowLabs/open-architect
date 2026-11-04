package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media2.widget.VideoView;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final VideoView f159790c;

    private v(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull VideoView videoView) {
        this.f159788a = constraintLayout;
        this.f159789b = progressBar;
        this.f159790c = videoView;
    }

    @NonNull
    public static v a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167998cj;
        ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
        if (progressBar != null) {
            i10 = com.planner5d.library.f.j.Hx;
            VideoView videoView = (VideoView) b4.c.a(view, i10);
            if (videoView != null) {
                return new v((ConstraintLayout) view, progressBar, videoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static v c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static v d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168650c1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159788a;
    }
}
