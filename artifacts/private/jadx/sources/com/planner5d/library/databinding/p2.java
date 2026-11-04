package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialSwitch f159491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialSwitch f159492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159495j;

    private p2(@NonNull FrameLayout frameLayout, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ButtonTextView buttonTextView, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialSwitch materialSwitch2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RecyclerView recyclerView) {
        this.f159486a = frameLayout;
        this.f159487b = preloaderBoxV2View;
        this.f159488c = textView;
        this.f159489d = textView2;
        this.f159490e = buttonTextView;
        this.f159491f = materialSwitch;
        this.f159492g = materialSwitch2;
        this.f159493h = textView3;
        this.f159494i = textView4;
        this.f159495j = recyclerView;
    }

    @NonNull
    public static p2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168144il;
        PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
        if (preloaderBoxV2View != null) {
            i10 = com.planner5d.library.f.j.Js;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Ks;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Ls;
                    ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView != null) {
                        i10 = com.planner5d.library.f.j.Ms;
                        MaterialSwitch materialSwitch = (MaterialSwitch) b4.c.a(view, i10);
                        if (materialSwitch != null) {
                            i10 = com.planner5d.library.f.j.Ns;
                            MaterialSwitch materialSwitch2 = (MaterialSwitch) b4.c.a(view, i10);
                            if (materialSwitch2 != null) {
                                i10 = com.planner5d.library.f.j.Os;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    i10 = com.planner5d.library.f.j.Ps;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = com.planner5d.library.f.j.Qs;
                                        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                        if (recyclerView != null) {
                                            return new p2((FrameLayout) view, preloaderBoxV2View, textView, textView2, buttonTextView, materialSwitch, materialSwitch2, textView3, textView4, recyclerView);
                                        }
                                    }
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
    public static p2 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p2 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.I2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159486a;
    }
}
