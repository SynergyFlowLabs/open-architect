package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f113591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f113592b;

    public m(@NonNull h hVar, float f10) {
        this.f113591a = hVar;
        this.f113592b = f10;
    }

    @Override // com.google.android.material.shape.h
    boolean a() {
        return this.f113591a.a();
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        this.f113591a.b(f10, f11 - this.f113592b, f12, rVar);
    }
}
