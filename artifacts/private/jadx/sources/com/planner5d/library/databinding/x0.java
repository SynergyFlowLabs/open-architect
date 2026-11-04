package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.planner5d.library.widget.preloader.PreloaderBoxView;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbar;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbarItem;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreviewToolbarItem f159887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ViewPager f159888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f159889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreviewToolbar f159890h;

    private x0(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull PreviewToolbarItem previewToolbarItem, @NonNull PreviewToolbarItem previewToolbarItem2, @NonNull PreviewToolbarItem previewToolbarItem3, @NonNull ViewPager viewPager, @NonNull PreloaderBoxView preloaderBoxView, @NonNull PreviewToolbar previewToolbar) {
        this.f159883a = frameLayout;
        this.f159884b = textView;
        this.f159885c = previewToolbarItem;
        this.f159886d = previewToolbarItem2;
        this.f159887e = previewToolbarItem3;
        this.f159888f = viewPager;
        this.f159889g = preloaderBoxView;
        this.f159890h = previewToolbar;
    }

    @NonNull
    public static x0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168064fc;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.If;
            PreviewToolbarItem previewToolbarItem = (PreviewToolbarItem) b4.c.a(view, i10);
            if (previewToolbarItem != null) {
                i10 = com.planner5d.library.f.j.Lf;
                PreviewToolbarItem previewToolbarItem2 = (PreviewToolbarItem) b4.c.a(view, i10);
                if (previewToolbarItem2 != null) {
                    i10 = com.planner5d.library.f.j.Nf;
                    PreviewToolbarItem previewToolbarItem3 = (PreviewToolbarItem) b4.c.a(view, i10);
                    if (previewToolbarItem3 != null) {
                        i10 = com.planner5d.library.f.j.f168288ok;
                        ViewPager viewPager = (ViewPager) b4.c.a(view, i10);
                        if (viewPager != null) {
                            i10 = com.planner5d.library.f.j.f168144il;
                            PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                            if (preloaderBoxView != null) {
                                i10 = com.planner5d.library.f.j.Ql;
                                PreviewToolbar previewToolbar = (PreviewToolbar) b4.c.a(view, i10);
                                if (previewToolbar != null) {
                                    return new x0((FrameLayout) view, textView, previewToolbarItem, previewToolbarItem2, previewToolbarItem3, viewPager, preloaderBoxView, previewToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static x0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.P1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159883a;
    }
}
