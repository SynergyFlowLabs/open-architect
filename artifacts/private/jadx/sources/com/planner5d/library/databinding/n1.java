package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f159384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159385f;

    private n1(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextInputEditTextCompat textInputEditTextCompat3) {
        this.f159380a = frameLayout;
        this.f159381b = textView;
        this.f159382c = textInputEditTextCompat;
        this.f159383d = textInputEditTextCompat2;
        this.f159384e = preloaderBoxV2View;
        this.f159385f = textInputEditTextCompat3;
    }

    @NonNull
    public static n1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168435um;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.f168459vm;
            TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
            if (textInputEditTextCompat != null) {
                i10 = com.planner5d.library.f.j.f168483wm;
                TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                if (textInputEditTextCompat2 != null) {
                    i10 = com.planner5d.library.f.j.f168507xm;
                    PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                    if (preloaderBoxV2View != null) {
                        i10 = com.planner5d.library.f.j.f168531ym;
                        TextInputEditTextCompat textInputEditTextCompat3 = (TextInputEditTextCompat) b4.c.a(view, i10);
                        if (textInputEditTextCompat3 != null) {
                            return new n1((FrameLayout) view, textView, textInputEditTextCompat, textInputEditTextCompat2, preloaderBoxV2View, textInputEditTextCompat3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168695g2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159380a;
    }
}
