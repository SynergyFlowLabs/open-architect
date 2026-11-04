package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Editor2D f159206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159210f;

    private k0(@NonNull ConstraintLayout constraintLayout, @NonNull Editor2D editor2D, @NonNull ButtonTextView buttonTextView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull FrameLayout frameLayout) {
        this.f159205a = constraintLayout;
        this.f159206b = editor2D;
        this.f159207c = buttonTextView;
        this.f159208d = recyclerView;
        this.f159209e = textView;
        this.f159210f = frameLayout;
    }

    @NonNull
    public static k0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168063fb;
        Editor2D editor2D = (Editor2D) b4.c.a(view, i10);
        if (editor2D != null) {
            i10 = com.planner5d.library.f.j.f168142ij;
            ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
            if (buttonTextView != null) {
                i10 = com.planner5d.library.f.j.Xr;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = com.planner5d.library.f.j.zw;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.Cw;
                        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout != null) {
                            return new k0((ConstraintLayout) view, editor2D, buttonTextView, recyclerView, textView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168880x1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159205a;
    }
}
