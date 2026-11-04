package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.preloader.PreloaderBoxView;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f158879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f158880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f158883f;

    private e1(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull PreloaderBoxView preloaderBoxView) {
        this.f158878a = frameLayout;
        this.f158879b = button;
        this.f158880c = button2;
        this.f158881d = textView;
        this.f158882e = linearLayout;
        this.f158883f = preloaderBoxView;
    }

    @NonNull
    public static e1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168442v5;
        Button button = (Button) b4.c.a(view, i10);
        if (button != null) {
            i10 = com.planner5d.library.f.j.f168538z5;
            Button button2 = (Button) b4.c.a(view, i10);
            if (button2 != null) {
                i10 = com.planner5d.library.f.j.Hh;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.Mh;
                    LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout != null) {
                        i10 = com.planner5d.library.f.j.f168144il;
                        PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                        if (preloaderBoxView != null) {
                            return new e1((FrameLayout) view, button, button2, textView, linearLayout, preloaderBoxView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.V1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158878a;
    }
}
