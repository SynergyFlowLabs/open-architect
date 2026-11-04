package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderDialogView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PreloaderDialogView f159259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159260g;

    private l0(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ButtonTextView buttonTextView, @NonNull ButtonTextView buttonTextView2, @NonNull PreloaderDialogView preloaderDialogView, @NonNull RecyclerView recyclerView) {
        this.f159254a = constraintLayout;
        this.f159255b = linearLayout;
        this.f159256c = frameLayout;
        this.f159257d = buttonTextView;
        this.f159258e = buttonTextView2;
        this.f159259f = preloaderDialogView;
        this.f159260g = recyclerView;
    }

    @NonNull
    public static l0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.D4;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.f168063fb;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = com.planner5d.library.f.j.f168070fi;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = com.planner5d.library.f.j.f168142ij;
                    ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView2 != null) {
                        i10 = com.planner5d.library.f.j.Gl;
                        PreloaderDialogView preloaderDialogView = (PreloaderDialogView) b4.c.a(view, i10);
                        if (preloaderDialogView != null) {
                            i10 = com.planner5d.library.f.j.At;
                            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                            if (recyclerView != null) {
                                return new l0((ConstraintLayout) view, linearLayout, frameLayout, buttonTextView, buttonTextView2, preloaderDialogView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168890y1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159254a;
    }
}
