package com.google.vr.ndk.base;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127037b = "e";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127038c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127039d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f127040a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127041a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127042b = 1;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127043a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127044b = 1;
    }

    e(long j10) {
        this.f127040a = j10;
    }

    public int a() {
        return GvrApi.nativeBufferViewportGetExternalSurfaceId(this.f127040a);
    }

    public float b() {
        return GvrApi.nativeBufferViewportGetOpacity(this.f127040a);
    }

    public int c() {
        return GvrApi.nativeBufferViewportGetReprojection(this.f127040a);
    }

    public int d() {
        return GvrApi.nativeBufferViewportGetSourceBufferIndex(this.f127040a);
    }

    public void e(RectF rectF) {
        GvrApi.nativeBufferViewportGetSourceFov(this.f127040a, rectF);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return GvrApi.nativeBufferViewportEqual(this.f127040a, ((e) obj).f127040a);
        }
        return false;
    }

    public void f(RectF rectF) {
        GvrApi.nativeBufferViewportGetSourceUv(this.f127040a, rectF);
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127040a != 0) {
                v();
            }
        } finally {
            super.finalize();
        }
    }

    public int g() {
        return GvrApi.nativeBufferViewportGetTargetEye(this.f127040a);
    }

    public void h(float[] fArr) {
        GvrApi.nativeBufferViewportGetTransform(this.f127040a, fArr);
    }

    public void i(PointF pointF) {
        pointF.set(0.04f, 0.04f);
    }

    public void j(r rVar) {
        GvrApi.nativeBufferViewportSetExternalSurface(this.f127040a, rVar != null ? rVar.c() : 0L);
    }

    public void k(int i10) {
        GvrApi.nativeBufferViewportSetExternalSurfaceId(this.f127040a, i10);
    }

    public void l(float[] fArr) {
    }

    public void m(float f10) {
        GvrApi.nativeBufferViewportSetOpacity(this.f127040a, f10);
    }

    public void n(int i10) {
        GvrApi.nativeBufferViewportSetReprojection(this.f127040a, i10);
    }

    public void o(int i10) {
        GvrApi.nativeBufferViewportSetSourceBufferIndex(this.f127040a, i10);
    }

    public void p(RectF rectF) {
        GvrApi.nativeBufferViewportSetSourceFov(this.f127040a, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void q(int i10) {
        GvrApi.nativeBufferViewportSetSourceLayer(this.f127040a, i10);
    }

    public void r(RectF rectF) {
        GvrApi.nativeBufferViewportSetSourceUv(this.f127040a, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void s(int i10) {
        GvrApi.nativeBufferViewportSetTargetEye(this.f127040a, i10);
    }

    public void t(float[] fArr) {
        GvrApi.nativeBufferViewportSetTransform(this.f127040a, fArr);
    }

    public void u(PointF pointF) {
    }

    public void v() {
        long j10 = this.f127040a;
        if (j10 != 0) {
            GvrApi.nativeBufferViewportDestroy(j10);
            this.f127040a = 0L;
        }
    }

    public void w() {
    }
}
