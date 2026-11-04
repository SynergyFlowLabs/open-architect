package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class y extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f113691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f113692b;

    public y(float f10, boolean z10) {
        this.f113691a = f10;
        this.f113692b = z10;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        if (!this.f113692b) {
            float f13 = this.f113691a;
            rVar.o(f11 - (f13 * f12), 0.0f, f11, (-f13) * f12);
            rVar.o(f11 + (this.f113691a * f12), 0.0f, f10, 0.0f);
        } else {
            rVar.n(f11 - (this.f113691a * f12), 0.0f);
            float f14 = this.f113691a;
            rVar.o(f11, f14 * f12, (f14 * f12) + f11, 0.0f);
            rVar.n(f10, 0.0f);
        }
    }
}
