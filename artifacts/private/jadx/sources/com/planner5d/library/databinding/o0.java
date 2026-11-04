package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Editor2D f159422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159424e;

    private o0(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull Editor2D editor2D, @NonNull ButtonTextView buttonTextView, @NonNull ButtonTextView buttonTextView2) {
        this.f159420a = frameLayout;
        this.f159421b = recyclerView;
        this.f159422c = editor2D;
        this.f159423d = buttonTextView;
        this.f159424e = buttonTextView2;
    }

    @NonNull
    public static o0 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168350ra;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = com.planner5d.library.f.j.f168063fb;
            Editor2D editor2D = (Editor2D) b4.c.a(view, i10);
            if (editor2D != null) {
                i10 = com.planner5d.library.f.j.Ch;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = com.planner5d.library.f.j.f168142ij;
                    ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView2 != null) {
                        return new o0((FrameLayout) view, recyclerView, editor2D, buttonTextView, buttonTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.G1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159420a;
    }
}
