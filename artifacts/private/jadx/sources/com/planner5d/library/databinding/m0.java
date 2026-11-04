package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f159320g;

    private m0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ButtonTextView buttonTextView, @NonNull ButtonTextView buttonTextView2, @NonNull ButtonTextView buttonTextView3, @NonNull RecyclerView recyclerView, @NonNull Space space) {
        this.f159314a = constraintLayout;
        this.f159315b = constraintLayout2;
        this.f159316c = buttonTextView;
        this.f159317d = buttonTextView2;
        this.f159318e = buttonTextView3;
        this.f159319f = recyclerView;
        this.f159320g = space;
    }

    @NonNull
    public static m0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.G5;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.f168494x9;
            ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
            if (buttonTextView != null) {
                i10 = com.planner5d.library.f.j.f168518y9;
                ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView2 != null) {
                    i10 = com.planner5d.library.f.j.f168190ki;
                    ButtonTextView buttonTextView3 = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView3 != null) {
                        i10 = com.planner5d.library.f.j.Wp;
                        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                        if (recyclerView != null) {
                            i10 = com.planner5d.library.f.j.Us;
                            Space space = (Space) b4.c.a(view, i10);
                            if (space != null) {
                                return new m0((ConstraintLayout) view, constraintLayout, buttonTextView, buttonTextView2, buttonTextView3, recyclerView, space);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168900z1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159314a;
    }
}
