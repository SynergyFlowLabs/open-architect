package com.google.zxing.qrcode.detector;

import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f130932c;

    a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f130932c = f12;
    }

    boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f130932c);
        return fAbs <= 1.0f || fAbs <= this.f130932c;
    }

    a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f130932c + f12) / 2.0f);
    }
}
