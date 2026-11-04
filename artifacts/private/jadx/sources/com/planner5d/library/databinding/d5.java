package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class d5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f158851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158855f;

    private d5(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f158850a = constraintLayout;
        this.f158851b = buttonTextView;
        this.f158852c = textView;
        this.f158853d = textView2;
        this.f158854e = textView3;
        this.f158855f = textView4;
    }

    @NonNull
    public static d5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Eo;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = com.planner5d.library.f.j.To;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.Uo;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.Vo;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.f.j.Wo;
                        TextView textView4 = (TextView) b4.c.a(view, i10);
                        if (textView4 != null) {
                            return new d5((ConstraintLayout) view, buttonTextView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.K7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158850a;
    }
}
