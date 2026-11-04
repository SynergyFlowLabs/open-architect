package com.google.vr.ndk.base;

import android.graphics.Point;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127271b = "t";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f127272a = 0;

    t() {
    }

    private void b() {
        if (this.f127272a == 0) {
            throw new RuntimeException("Frame was reused after submission");
        }
    }

    public void a(int i10) {
        b();
        GvrApi.nativeFrameBindBuffer(this.f127272a, i10);
    }

    public void c(int i10, Point point) {
        b();
        GvrApi.nativeFrameGetBufferSize(this.f127272a, i10, point);
    }

    public int d(int i10) {
        b();
        return GvrApi.nativeFrameGetFramebufferObject(this.f127272a, i10);
    }

    long e() {
        return this.f127272a;
    }

    void f(long j10) {
        this.f127272a = j10;
    }

    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void g(f fVar, float[] fArr) {
        b();
        GvrApi.nativeFrameSubmit(this.f127272a, fVar.f127064a, fArr);
        this.f127272a = 0L;
    }

    public void h() {
        b();
        GvrApi.nativeFrameUnbind(this.f127272a);
    }
}
