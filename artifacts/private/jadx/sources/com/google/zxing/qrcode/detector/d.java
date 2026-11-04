package com.google.zxing.qrcode.detector;

import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f130944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130945d;

    d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f130944c);
        return fAbs <= 1.0f || fAbs <= this.f130944c;
    }

    d g(float f10, float f11, float f12) {
        int i10 = this.f130945d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f11;
        float f13 = i11;
        return new d(fC / f13, ((this.f130945d * d()) + f10) / f13, ((this.f130945d * this.f130944c) + f12) / f13, i11);
    }

    int h() {
        return this.f130945d;
    }

    public float i() {
        return this.f130944c;
    }

    private d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f130944c = f12;
        this.f130945d = i10;
    }
}
