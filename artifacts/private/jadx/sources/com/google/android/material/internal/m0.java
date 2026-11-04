package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(18)
class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f112886a;

    m0(@NonNull View view) {
        this.f112886a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f112886a.remove(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f112886a.add(drawable);
    }
}
