package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f88853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f88854b;

    public void a(float f10) {
        float f11 = this.f88853a + f10;
        this.f88853a = f11;
        int i10 = this.f88854b + 1;
        this.f88854b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f88853a = f11 / 2.0f;
            this.f88854b = i10 / 2;
        }
    }

    public float b() {
        int i10 = this.f88854b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f88853a / i10;
    }
}
