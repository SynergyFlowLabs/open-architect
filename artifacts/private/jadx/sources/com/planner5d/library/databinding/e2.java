package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f158885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f158887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f158888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f158889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f158890g;

    private e2(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull PreloaderCoverView preloaderCoverView, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView3) {
        this.f158884a = frameLayout;
        this.f158885b = textView;
        this.f158886c = textView2;
        this.f158887d = recyclerView;
        this.f158888e = preloaderCoverView;
        this.f158889f = buttonTextView;
        this.f158890g = textView3;
    }

    @NonNull
    public static e2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167989ca;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f168014da;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.f168038ea;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = com.planner5d.library.f.j.f168062fa;
                    PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                    if (preloaderCoverView != null) {
                        i10 = com.planner5d.library.f.j.f168086ga;
                        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                        if (buttonTextView != null) {
                            i10 = com.planner5d.library.f.j.xp;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                return new e2((FrameLayout) view, textView, textView2, recyclerView, preloaderCoverView, buttonTextView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168881x2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158884a;
    }
}
