package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f113539a;

    public j(float f10) {
        this.f113539a = f10 - 0.001f;
    }

    @Override // com.google.android.material.shape.h
    boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        float fSqrt = (float) ((((double) this.f113539a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f113539a, 2.0d) - Math.pow(fSqrt, 2.0d));
        rVar.q(f11 - fSqrt, ((float) (-((((double) this.f113539a) * Math.sqrt(2.0d)) - ((double) this.f113539a)))) + fSqrt2);
        rVar.n(f11, (float) (-((((double) this.f113539a) * Math.sqrt(2.0d)) - ((double) this.f113539a))));
        rVar.n(f11 + fSqrt, ((float) (-((((double) this.f113539a) * Math.sqrt(2.0d)) - ((double) this.f113539a)))) + fSqrt2);
    }
}
