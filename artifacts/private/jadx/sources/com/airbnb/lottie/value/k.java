package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f88899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f88900b;

    public k(float f10, float f11) {
        this.f88899a = f10;
        this.f88900b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f88899a == f10 && this.f88900b == f11;
    }

    public float b() {
        return this.f88899a;
    }

    public float c() {
        return this.f88900b;
    }

    public void d(float f10, float f11) {
        this.f88899a = f10;
        this.f88900b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
