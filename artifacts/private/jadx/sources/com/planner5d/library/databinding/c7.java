package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f158822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final SwitchMaterial f158823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158824d;

    private c7(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull SwitchMaterial switchMaterial, @NonNull TextView textView) {
        this.f158821a = constraintLayout;
        this.f158822b = shapeableImageView;
        this.f158823c = switchMaterial;
        this.f158824d = textView;
    }

    @NonNull
    public static c7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.yq;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
        if (shapeableImageView != null) {
            i10 = com.planner5d.library.f.j.zq;
            SwitchMaterial switchMaterial = (SwitchMaterial) b4.c.a(view, i10);
            if (switchMaterial != null) {
                i10 = com.planner5d.library.f.j.Aq;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new c7((ConstraintLayout) view, shapeableImageView, switchMaterial, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168855u8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f158821a;
    }
}
