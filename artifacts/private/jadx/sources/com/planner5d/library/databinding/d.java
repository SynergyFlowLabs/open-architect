package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.canhub.cropper.core.CropImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f158829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f158830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f158831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CropImageView f158832d;

    private d(@NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull FloatingActionButton floatingActionButton2, @NonNull CropImageView cropImageView) {
        this.f158829a = frameLayout;
        this.f158830b = floatingActionButton;
        this.f158831c = floatingActionButton2;
        this.f158832d = cropImageView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.L;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b4.c.a(view, i10);
        if (floatingActionButton != null) {
            i10 = com.planner5d.library.f.j.J5;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) b4.c.a(view, i10);
            if (floatingActionButton2 != null) {
                i10 = com.planner5d.library.f.j.F9;
                CropImageView cropImageView = (CropImageView) b4.c.a(view, i10);
                if (cropImageView != null) {
                    return new d((FrameLayout) view, floatingActionButton, floatingActionButton2, cropImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168825s0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f158829a;
    }
}
