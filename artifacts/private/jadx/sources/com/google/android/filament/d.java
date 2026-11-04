package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f104720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f104721b;

    public d() {
        this.f104720a = new float[3];
        this.f104721b = new float[3];
    }

    @NonNull
    @d1(min = 3)
    public float[] a() {
        return this.f104720a;
    }

    @NonNull
    @d1(min = 3)
    public float[] b() {
        return this.f104721b;
    }

    public void c(float f10, float f11, float f12) {
        float[] fArr = this.f104720a;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
    }

    public void d(float f10, float f11, float f12) {
        float[] fArr = this.f104721b;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
    }

    public d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f104720a = new float[]{f10, f11, f12};
        this.f104721b = new float[]{f13, f14, f15};
    }

    public d(@NonNull @d1(min = 3) float[] fArr, @NonNull @d1(min = 3) float[] fArr2) {
        this.f104720a = new float[]{fArr[0], fArr[1], fArr[2]};
        this.f104721b = new float[]{fArr2[0], fArr2[1], fArr2[2]};
    }
}
