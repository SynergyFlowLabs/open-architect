package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.ButtonWallResizeV2;

/* JADX INFO: loaded from: classes4.dex */
public final class d8 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonWallResizeV2 f158867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f158868c;

    private d8(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonWallResizeV2 buttonWallResizeV2, @NonNull TextView textView) {
        this.f158866a = constraintLayout;
        this.f158867b = buttonWallResizeV2;
        this.f158868c = textView;
    }

    @NonNull
    public static d8 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.lq;
        ButtonWallResizeV2 buttonWallResizeV2 = (ButtonWallResizeV2) b4.c.a(view, i10);
        if (buttonWallResizeV2 != null) {
            i10 = com.planner5d.library.f.j.mq;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new d8((ConstraintLayout) view, buttonWallResizeV2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d8 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d8 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168845t9, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158866a;
    }
}
