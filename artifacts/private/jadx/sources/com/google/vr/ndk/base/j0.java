package com.google.vr.ndk.base;

import android.graphics.Point;

/* JADX INFO: loaded from: classes5.dex */
public class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f127110d = "j0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f127111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t[] f127112b = {new t(), new t()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f127113c = 0;

    j0(long j10) {
        this.f127111a = j10;
    }

    public t a() {
        if (this.f127112b[0].e() != 0 || this.f127112b[1].e() != 0) {
            throw new RuntimeException("Previous frame not submitted");
        }
        this.f127113c = (this.f127113c + 1) % 2;
        long jNativeSwapChainAcquireFrame = GvrApi.nativeSwapChainAcquireFrame(this.f127111a);
        if (jNativeSwapChainAcquireFrame == 0) {
            return null;
        }
        this.f127112b[this.f127113c].f(jNativeSwapChainAcquireFrame);
        return this.f127112b[this.f127113c];
    }

    public int b() {
        return GvrApi.nativeSwapChainGetBufferCount(this.f127111a);
    }

    public void c(int i10, Point point) {
        GvrApi.nativeSwapChainGetBufferSize(this.f127111a, i10, point);
    }

    public void d(int i10, Point point) {
        GvrApi.nativeSwapChainResizeBuffer(this.f127111a, i10, point.x, point.y);
    }

    public void e() {
        long j10 = this.f127111a;
        if (j10 != 0) {
            GvrApi.nativeSwapChainDestroy(j10);
            this.f127111a = 0L;
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127111a != 0) {
                e();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }
}
