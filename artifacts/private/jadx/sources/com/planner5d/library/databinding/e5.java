package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RoundedCornersLayout f158899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f158900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f158904f;

    private e5(@NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view) {
        this.f158899a = roundedCornersLayout;
        this.f158900b = textView;
        this.f158901c = textView2;
        this.f158902d = textView3;
        this.f158903e = textView4;
        this.f158904f = view;
    }

    @NonNull
    public static e5 a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.f.j.Qo;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.So;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = com.planner5d.library.f.j.Uo;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = com.planner5d.library.f.j.Vo;
                    TextView textView4 = (TextView) b4.c.a(view, i10);
                    if (textView4 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Zx))) != null) {
                        return new e5((RoundedCornersLayout) view, textView, textView2, textView3, textView4, viewA);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.L7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RoundedCornersLayout getRoot() {
        return this.f158899a;
    }
}
