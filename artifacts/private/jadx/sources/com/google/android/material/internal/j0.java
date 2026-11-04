package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(18)
class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f112867a;

    j0(@NonNull ViewGroup viewGroup) {
        this.f112867a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f112867a.remove(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f112867a.add(drawable);
    }

    @Override // com.google.android.material.internal.k0
    public void c(@NonNull View view) {
        this.f112867a.add(view);
    }

    @Override // com.google.android.material.internal.k0
    public void d(@NonNull View view) {
        this.f112867a.remove(view);
    }
}
