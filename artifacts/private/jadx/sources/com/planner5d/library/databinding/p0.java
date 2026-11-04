package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.spaces.view.DocumentStatusView;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final DocumentStatusView f159476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f159477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159478f;

    private p0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull DocumentStatusView documentStatusView, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.f159473a = constraintLayout;
        this.f159474b = constraintLayout2;
        this.f159475c = textView;
        this.f159476d = documentStatusView;
        this.f159477e = view;
        this.f159478f = recyclerView;
    }

    @NonNull
    public static p0 a(@NonNull View view) {
        View viewA;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = com.planner5d.library.f.j.Da;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Ea;
            DocumentStatusView documentStatusView = (DocumentStatusView) b4.c.a(view, i10);
            if (documentStatusView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.f168185kd))) != null) {
                i10 = com.planner5d.library.f.j.Gh;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    return new p0(constraintLayout, constraintLayout, textView, documentStatusView, viewA, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p0 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.H1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159473a;
    }
}
