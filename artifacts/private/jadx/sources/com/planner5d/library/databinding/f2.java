package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f158954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f158955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f158959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f158960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ScrollView f158961h;

    private f2(@NonNull ScrollView scrollView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull PreloaderCoverView preloaderCoverView, @NonNull HorizontalScrollView horizontalScrollView, @NonNull ScrollView scrollView2) {
        this.f158954a = scrollView;
        this.f158955b = frameLayout;
        this.f158956c = linearLayout;
        this.f158957d = textView;
        this.f158958e = linearLayout2;
        this.f158959f = preloaderCoverView;
        this.f158960g = horizontalScrollView;
        this.f158961h = scrollView2;
    }

    @NonNull
    public static f2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.T3;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = com.planner5d.library.f.j.Do;
            LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
            if (linearLayout != null) {
                i10 = com.planner5d.library.f.j.Go;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.Ho;
                    LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = com.planner5d.library.f.j.Io;
                        PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                        if (preloaderCoverView != null) {
                            i10 = com.planner5d.library.f.j.hp;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) b4.c.a(view, i10);
                            if (horizontalScrollView != null) {
                                ScrollView scrollView = (ScrollView) view;
                                return new f2(scrollView, frameLayout, linearLayout, textView, linearLayout2, preloaderCoverView, horizontalScrollView, scrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168891y2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f158954a;
    }
}
