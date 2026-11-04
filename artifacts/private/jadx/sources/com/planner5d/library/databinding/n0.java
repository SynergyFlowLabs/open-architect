package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.planner5d.library.widget.preloader.PreloaderDialogView;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Flow f159376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f159377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PreloaderDialogView f159378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f159379j;

    private n0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3, @NonNull FrameLayout frameLayout, @NonNull Flow flow, @NonNull Guideline guideline, @NonNull PreloaderDialogView preloaderDialogView, @NonNull TextView textView) {
        this.f159370a = constraintLayout;
        this.f159371b = constraintLayout2;
        this.f159372c = materialButton;
        this.f159373d = materialButton2;
        this.f159374e = materialButton3;
        this.f159375f = frameLayout;
        this.f159376g = flow;
        this.f159377h = guideline;
        this.f159378i = preloaderDialogView;
        this.f159379j = textView;
    }

    @NonNull
    public static n0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.D4;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.f168273o5;
            MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
            if (materialButton != null) {
                i10 = com.planner5d.library.f.j.f168466w5;
                MaterialButton materialButton2 = (MaterialButton) b4.c.a(view, i10);
                if (materialButton2 != null) {
                    i10 = com.planner5d.library.f.j.C5;
                    MaterialButton materialButton3 = (MaterialButton) b4.c.a(view, i10);
                    if (materialButton3 != null) {
                        i10 = com.planner5d.library.f.j.f168063fb;
                        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout != null) {
                            i10 = com.planner5d.library.f.j.Ob;
                            Flow flow = (Flow) b4.c.a(view, i10);
                            if (flow != null) {
                                i10 = com.planner5d.library.f.j.f168065fd;
                                Guideline guideline = (Guideline) b4.c.a(view, i10);
                                if (guideline != null) {
                                    i10 = com.planner5d.library.f.j.Gl;
                                    PreloaderDialogView preloaderDialogView = (PreloaderDialogView) b4.c.a(view, i10);
                                    if (preloaderDialogView != null) {
                                        i10 = com.planner5d.library.f.j.tv;
                                        TextView textView = (TextView) b4.c.a(view, i10);
                                        if (textView != null) {
                                            return new n0((ConstraintLayout) view, constraintLayout, materialButton, materialButton2, materialButton3, frameLayout, flow, guideline, preloaderDialogView, textView);
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
    public static n0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.F1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159370a;
    }
}
