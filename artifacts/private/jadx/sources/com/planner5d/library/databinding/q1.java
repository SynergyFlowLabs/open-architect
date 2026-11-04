package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.editor.editor2d.Editor2D;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Editor2D f159538b;

    private q1(@NonNull ConstraintLayout constraintLayout, @NonNull Editor2D editor2D) {
        this.f159537a = constraintLayout;
        this.f159538b = editor2D;
    }

    @NonNull
    public static q1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168063fb;
        Editor2D editor2D = (Editor2D) b4.c.a(view, i10);
        if (editor2D != null) {
            return new q1((ConstraintLayout) view, editor2D);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168728j2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159537a;
    }
}
